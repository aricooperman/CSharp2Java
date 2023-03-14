package com.tbmresearch.csharp2java.converter;

import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ListTokenSource;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

public class CSharp2JavaConverter {

	static class LoggingInvocationHandler implements InvocationHandler {
		public LoggingInvocationHandler() {	}
		@Override
		public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
			String name = method.getName();
			if(name.startsWith("enter") || name.equals("visitTerminal") || name.contains("EveryRule"))
				return null;
			
			if( args.length != 1 ) {
				System.err.println( "Unknown method handler: " + method + ", args: " + Arrays.toString(args));
			}
			else if(args[0] instanceof ParseTree) {
				ParseTree context = (ParseTree)args[0];
				System.out.println(name + ": " + context.getText());
			}
			else {
				System.err.println( "Unknown arg type : " + args[0].getClass().getSimpleName() );
			}
			
			return null;
		}
	}
	
	public static final void main(final String[] args) throws IOException {
        final Path currentWorkingDirectory = Paths.get("");
//        Files.createDirectories(currentWorkingDirectory);
        
        //TODO args check
        Path path = Paths.get(args[0]);

		final List<Token> codeTokens = new ArrayList<>();
		final List<Token> commentTokens = new ArrayList<>();
		final List<Token> directiveTokens = new ArrayList<>();

        final Lexer preprocessorLexer = new CSharpLexer(CharStreams.fromPath(path));
		// Collect all tokens with lexer (CSharpLexer.g4).
		final List<? extends Token> tokens = preprocessorLexer.getAllTokens();
		ListTokenSource directiveTokenSource = new ListTokenSource(directiveTokens);
		CommonTokenStream directiveTokenStream = new CommonTokenStream(directiveTokenSource, CSharpLexer.DIRECTIVE);
		final CSharpPreprocessorParser preprocessorParser = new CSharpPreprocessorParser(directiveTokenStream);

		int index = 0;
		boolean compiledTokens = true;
		while (index < tokens.size()) {
			final Token token = tokens.get(index);
			if (token.getType() == CSharpLexer.SHARP) {
				directiveTokens.clear();
				int directiveTokenIndex = index + 1;
				// Collect all preprocessor directive tokens.
				final Token directiveToken = tokens.get(directiveTokenIndex);
				while (directiveTokenIndex < tokens.size() && directiveToken.getType() != Recognizer.EOF
						&& directiveToken.getType() != CSharpLexer.DIRECTIVE_NEW_LINE
						&& directiveToken.getType() != CSharpLexer.SHARP) {
					if (directiveToken.getChannel() == CSharpLexer.COMMENTS_CHANNEL)
						commentTokens.add(directiveToken);
					else if (directiveToken.getChannel() != Lexer.HIDDEN)
						directiveTokens.add(directiveToken);
					directiveTokenIndex++;
				}

				directiveTokenSource = new ListTokenSource(directiveTokens);
				directiveTokenStream = new CommonTokenStream(directiveTokenSource, CSharpLexer.DIRECTIVE);
				preprocessorParser.setInputStream(directiveTokenStream);
				preprocessorParser.reset();
				// Parse condition in preprocessor directive (based on CSharpPreprocessorParser.g4 grammar).
				final CSharpPreprocessorParser.Preprocessor_directiveContext directive = preprocessorParser
						.preprocessor_directive();
				// if true than next code is valid and not ignored.
				compiledTokens = directive.value;
				
				String directiveStr = tokens.get(index+1).getText().trim();
		    	if ("line".equals(directiveStr) || "error".equals(directiveStr) || "warning".equals(directiveStr) || "define".equals(directiveStr) || "endregion".equals(directiveStr) || "endif".equals(directiveStr) || "pragma".equals(directiveStr)) {
		    		compiledTokens = true;
		    	} 
		    	String conditionalSymbol = null;
		    	if ("define".equals(tokens.get(index+1).getText())) {
		    		// add to the conditional symbols 
		    		conditionalSymbol = tokens.get(index + 2).getText();
		    		preprocessorParser.ConditionalSymbols.add(conditionalSymbol);
		    	} 
		    	if ("undef".equals(tokens.get(index+1).getText())) {
		    		conditionalSymbol = tokens.get(index + 2).getText();
		    		preprocessorParser.ConditionalSymbols.remove(conditionalSymbol);
		    	}
				
				index = directiveTokenIndex - 1;
			}
			else if (token.getChannel() == CSharpLexer.COMMENTS_CHANNEL)
				commentTokens.add(token); // Collect comment tokens (if required).
			else if (token.getChannel() != Lexer.HIDDEN
                    && token.getType() != CSharpLexer.DIRECTIVE_NEW_LINE
					&& compiledTokens)
				codeTokens.add(token); // Collect code tokens.
			index++;
		}

		// At second stage tokens parsed in usual way.
		final ListTokenSource codeTokenSource = new ListTokenSource(tokens);
		final CommonTokenStream codeTokenStream = new CommonTokenStream(codeTokenSource);
		final CSharpParser csharpParser = new CSharpParser(codeTokenStream);

		csharpParser.addErrorListener(new BaseErrorListener() {
			@Override
			public void syntaxError(final Recognizer<?, ?> recognizer, final Object offendingSymbol, final int line,
					final int charPositionInLine, final String msg, final RecognitionException e) {
				throw new IllegalStateException("failed to parse at line " + line + " due to " + msg, e);
			}
		});

		csharpParser.addParseListener(new CSharp2JavaParserListener(currentWorkingDirectory));
		
//		csharpParser.addParseListener((CSharpParserListener) Proxy.newProxyInstance(CSharp2JavaConverter.class.getClassLoader(),
//                new Class[] {CSharpParserListener.class},
//                new LoggingInvocationHandler()));
		
		csharpParser.compilation_unit();
	}
}
