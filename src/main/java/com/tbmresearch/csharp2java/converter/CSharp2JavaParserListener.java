package com.tbmresearch.csharp2java.converter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.tbmresearch.csharp2java.converter.CSharpParser.*;

public class CSharp2JavaParserListener extends CSharpParserBaseListener {

    private final Path outputDirectory;

    public CSharp2JavaParserListener(Path outputDirectory) {
        super();

        this.outputDirectory = outputDirectory;
    }

    private enum MemberModifier {
		NEW,
		PUBLIC,
		PROTECTED,
		INTERNAL,
		PRIVATE,
		READONLY,
		VOLATILE,
		VIRTUAL,
		SEALED,
		OVERRIDE,
		ABSTRACT,
		STATIC,
		UNSAFE,
		EXTERN,
		PARTIAL,
		ASYNC
	}

	private enum ClassType {
		CLASS,
        INTERFACE,
        ENUM
	}

	private final List<ClassData> parsedClasses = new ArrayList<>();
	private final Set<String> imports = new TreeSet<>();
	private final Stack<ClassData> currentClassStack = new Stack<>();

	private String namespace = null;
	

	private void writeClasses() {
        try {
            Path srcDir = outputDirectory.resolve(Paths.get(namespace.replace('.', '/')));
            srcDir = Files.createDirectories(srcDir);

            for( final ClassData classData : parsedClasses ) {
                Path classFile = srcDir.resolve(classData.name + ".java");

                BufferedWriter out = Files.newBufferedWriter(classFile, StandardOpenOption.CREATE);
                out.append("package ").append(namespace).append(';').append('\n');
                out.append('\n');

                for( String imp : imports)
                    out.append("import ").append(imp.toLowerCase()).append(';').append('\n');

                out.append('\n');

                for( MemberModifier cm : classData.classModifiers)
                    out.append(cm.name().toLowerCase()).append( ' ' );

                out.append(classData.name).append( " {\n");

                out.append("}\n");

                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
	}
	

	@Override
	public void enterCompilation_unit(final CSharpParser.Compilation_unitContext ctx) {
		System.out.println("Starting parse");
	}

	@Override
	public void exitCompilation_unit(final CSharpParser.Compilation_unitContext ctx) {
		writeClasses();
		System.out.println("Finished parse");
	}

	@Override
	public void exitNumeric_type(final CSharpParser.Numeric_typeContext ctx) {

	}

	@Override
	public void exitIntegral_type(final CSharpParser.Integral_typeContext ctx) {

	}

	@Override
	public void exitFloating_point_type(final CSharpParser.Floating_point_typeContext ctx) {

	}

	@Override
	public void exitClass_type(final CSharpParser.Class_typeContext ctx) {
//		 System.out.println( "exitClass_type: " + ctx.getText() );
	}

	@Override
	public void exitType_argument_list(final CSharpParser.Type_argument_listContext ctx) {

	}

	@Override
	public void exitArgument_list(final CSharpParser.Argument_listContext ctx) {

	}

	@Override
	public void exitArgument(final CSharpParser.ArgumentContext ctx) {

	}

	@Override
	public void exitExpression(final CSharpParser.ExpressionContext ctx) {

	}

	@Override
	public void exitNon_assignment_expression(final CSharpParser.Non_assignment_expressionContext ctx) {

	}

	@Override
	public void exitAssignment(final CSharpParser.AssignmentContext ctx) {

	}

	@Override
	public void exitAssignment_operator(final CSharpParser.Assignment_operatorContext ctx) {

	}

	@Override
	public void exitConditional_expression(final CSharpParser.Conditional_expressionContext ctx) {

	}

	@Override
	public void exitNull_coalescing_expression(final CSharpParser.Null_coalescing_expressionContext ctx) {

	}

	@Override
	public void exitConditional_or_expression(final CSharpParser.Conditional_or_expressionContext ctx) {

	}

	@Override
	public void exitConditional_and_expression(final CSharpParser.Conditional_and_expressionContext ctx) {

	}

	@Override
	public void exitInclusive_or_expression(final CSharpParser.Inclusive_or_expressionContext ctx) {

	}

	@Override
	public void exitExclusive_or_expression(final CSharpParser.Exclusive_or_expressionContext ctx) {

	}

	@Override
	public void exitAnd_expression(final CSharpParser.And_expressionContext ctx) {

	}

	@Override
	public void exitEquality_expression(final CSharpParser.Equality_expressionContext ctx) {

	}

	@Override
	public void exitRelational_expression(final CSharpParser.Relational_expressionContext ctx) {

	}

	@Override
	public void exitShift_expression(final CSharpParser.Shift_expressionContext ctx) {

	}

	@Override
	public void exitAdditive_expression(final CSharpParser.Additive_expressionContext ctx) {

	}

	@Override
	public void exitMultiplicative_expression(final CSharpParser.Multiplicative_expressionContext ctx) {

	}

	@Override
	public void exitUnary_expression(final CSharpParser.Unary_expressionContext ctx) {

	}

	@Override
	public void exitPrimary_expression(final CSharpParser.Primary_expressionContext ctx) {

	}

	@Override
	public void exitLiteralExpression(final CSharpParser.LiteralExpressionContext ctx) {

	}

	@Override
	public void exitSimpleNameExpression(final CSharpParser.SimpleNameExpressionContext ctx) {

	}

	@Override
	public void exitParenthesisExpressions(final CSharpParser.ParenthesisExpressionsContext ctx) {

	}

	@Override
	public void exitMemberAccessExpression(final CSharpParser.MemberAccessExpressionContext ctx) {

	}

	@Override
	public void exitLiteralAccessExpression(final CSharpParser.LiteralAccessExpressionContext ctx) {

	}

	@Override
	public void exitThisReferenceExpression(final CSharpParser.ThisReferenceExpressionContext ctx) {

	}

	@Override
	public void exitBaseAccessExpression(final CSharpParser.BaseAccessExpressionContext ctx) {

	}

	@Override
	public void exitObjectCreationExpression(final CSharpParser.ObjectCreationExpressionContext ctx) {

	}

	@Override
	public void exitTypeofExpression(final CSharpParser.TypeofExpressionContext ctx) {

	}

	@Override
	public void exitCheckedExpression(final CSharpParser.CheckedExpressionContext ctx) {

	}

	@Override
	public void exitUncheckedExpression(final CSharpParser.UncheckedExpressionContext ctx) {

	}

	@Override
	public void exitDefaultValueExpression(final CSharpParser.DefaultValueExpressionContext ctx) {

	}

	@Override
	public void exitAnonymousMethodExpression(final CSharpParser.AnonymousMethodExpressionContext ctx) {

	}

	@Override
	public void exitSizeofExpression(final CSharpParser.SizeofExpressionContext ctx) {

	}

	@Override
	public void exitNameofExpression(final CSharpParser.NameofExpressionContext ctx) {

	}

	@Override
	public void exitMember_access(final CSharpParser.Member_accessContext ctx) {

	}

	@Override
	public void exitBracket_expression(final CSharpParser.Bracket_expressionContext ctx) {

	}

	@Override
	public void exitIndexer_argument(final CSharpParser.Indexer_argumentContext ctx) {

	}

	@Override
	public void exitPredefined_type(final CSharpParser.Predefined_typeContext ctx) {

	}

	@Override
	public void exitExpression_list(final CSharpParser.Expression_listContext ctx) {

	}

	@Override
	public void exitObject_or_collection_initializer(final CSharpParser.Object_or_collection_initializerContext ctx) {

	}

	@Override
	public void exitObject_initializer(final CSharpParser.Object_initializerContext ctx) {

	}

	@Override
	public void exitMember_initializer_list(final CSharpParser.Member_initializer_listContext ctx) {

	}

	@Override
	public void exitMember_initializer(final CSharpParser.Member_initializerContext ctx) {

	}

	@Override
	public void exitInitializer_value(final CSharpParser.Initializer_valueContext ctx) {

	}

	@Override
	public void exitCollection_initializer(final CSharpParser.Collection_initializerContext ctx) {

	}

	@Override
	public void exitElement_initializer(final CSharpParser.Element_initializerContext ctx) {

	}

	@Override
	public void exitAnonymous_object_initializer(final CSharpParser.Anonymous_object_initializerContext ctx) {

	}

	@Override
	public void exitMember_declarator_list(final CSharpParser.Member_declarator_listContext ctx) {

	}

	@Override
	public void exitMember_declarator(final CSharpParser.Member_declaratorContext ctx) {

	}

	@Override
	public void exitUnbound_type_name(final CSharpParser.Unbound_type_nameContext ctx) {

	}

	@Override
	public void exitGeneric_dimension_specifier(final CSharpParser.Generic_dimension_specifierContext ctx) {

	}

	@Override
	public void exitIsType(final CSharpParser.IsTypeContext ctx) {

	}

	@Override
	public void exitLambda_expression(final CSharpParser.Lambda_expressionContext ctx) {

	}

	@Override
	public void exitAnonymous_function_signature(final CSharpParser.Anonymous_function_signatureContext ctx) {

	}

	@Override
	public void exitExplicit_anonymous_function_parameter_list(
			final CSharpParser.Explicit_anonymous_function_parameter_listContext ctx) {

	}

	@Override
	public void exitExplicit_anonymous_function_parameter(
			final CSharpParser.Explicit_anonymous_function_parameterContext ctx) {

	}

	@Override
	public void exitImplicit_anonymous_function_parameter_list(
			final CSharpParser.Implicit_anonymous_function_parameter_listContext ctx) {

	}

	@Override
	public void exitAnonymous_function_body(final CSharpParser.Anonymous_function_bodyContext ctx) {

	}

	@Override
	public void exitQuery_expression(final CSharpParser.Query_expressionContext ctx) {

	}

	@Override
	public void exitFrom_clause(final CSharpParser.From_clauseContext ctx) {

	}

	@Override
	public void exitQuery_body(final CSharpParser.Query_bodyContext ctx) {

	}

	@Override
	public void exitQuery_body_clause(final CSharpParser.Query_body_clauseContext ctx) {

	}

	@Override
	public void exitLet_clause(final CSharpParser.Let_clauseContext ctx) {

	}

	@Override
	public void exitWhere_clause(final CSharpParser.Where_clauseContext ctx) {

	}

	@Override
	public void exitCombined_join_clause(final CSharpParser.Combined_join_clauseContext ctx) {

	}

	@Override
	public void exitOrderby_clause(final CSharpParser.Orderby_clauseContext ctx) {

	}

	@Override
	public void exitOrdering(final CSharpParser.OrderingContext ctx) {

	}

	@Override
	public void exitSelect_or_group_clause(final CSharpParser.Select_or_group_clauseContext ctx) {

	}

	@Override
	public void exitQuery_continuation(final CSharpParser.Query_continuationContext ctx) {

	}

	@Override
	public void exitDeclarationStatement(final CSharpParser.DeclarationStatementContext ctx) {

	}

	@Override
	public void exitLabeled_Statement(final CSharpParser.Labeled_StatementContext ctx) {

	}

	@Override
	public void exitEmbedded_statement(final CSharpParser.Embedded_statementContext ctx) {

	}

	@Override
	public void exitExpressionStatement(final CSharpParser.ExpressionStatementContext ctx) {

	}

	@Override
	public void exitIfStatement(final CSharpParser.IfStatementContext ctx) {

	}

	@Override
	public void exitSwitchStatement(final CSharpParser.SwitchStatementContext ctx) {

	}

	@Override
	public void exitWhileStatement(final CSharpParser.WhileStatementContext ctx) {

	}

	@Override
	public void exitDoStatement(final CSharpParser.DoStatementContext ctx) {

	}

	@Override
	public void exitForStatement(final CSharpParser.ForStatementContext ctx) {

	}

	@Override
	public void exitForeachStatement(final CSharpParser.ForeachStatementContext ctx) {

	}

	@Override
	public void exitBreakStatement(final CSharpParser.BreakStatementContext ctx) {

	}

	@Override
	public void exitContinueStatement(final CSharpParser.ContinueStatementContext ctx) {

	}

	@Override
	public void exitGotoStatement(final CSharpParser.GotoStatementContext ctx) {

	}

	@Override
	public void exitReturnStatement(final CSharpParser.ReturnStatementContext ctx) {

	}

	@Override
	public void exitThrowStatement(final CSharpParser.ThrowStatementContext ctx) {

	}

	@Override
	public void exitTryStatement(final CSharpParser.TryStatementContext ctx) {

	}

	@Override
	public void exitCheckedStatement(final CSharpParser.CheckedStatementContext ctx) {

	}

	@Override
	public void exitUncheckedStatement(final CSharpParser.UncheckedStatementContext ctx) {

	}

	@Override
	public void exitLockStatement(final CSharpParser.LockStatementContext ctx) {

	}

	@Override
	public void exitUsingStatement(final CSharpParser.UsingStatementContext ctx) {

	}

	@Override
	public void exitYieldStatement(final CSharpParser.YieldStatementContext ctx) {

	}

	@Override
	public void exitUnsafeStatement(final CSharpParser.UnsafeStatementContext ctx) {

	}

	@Override
	public void exitFixedStatement(final CSharpParser.FixedStatementContext ctx) {

	}

	@Override
	public void exitBlock(final CSharpParser.BlockContext ctx) {

	}

	@Override
	public void exitLocal_variable_declaration(final CSharpParser.Local_variable_declarationContext ctx) {

	}

	@Override
	public void exitLocal_variable_type(final CSharpParser.Local_variable_typeContext ctx) {

	}

	@Override
	public void exitLocal_variable_declarator(final CSharpParser.Local_variable_declaratorContext ctx) {

	}

	@Override
	public void exitLocal_variable_initializer(final CSharpParser.Local_variable_initializerContext ctx) {

	}

	@Override
	public void exitLocal_constant_declaration(final CSharpParser.Local_constant_declarationContext ctx) {

	}

	@Override
	public void exitIf_body(final CSharpParser.If_bodyContext ctx) {

	}

	@Override
	public void exitSwitch_section(final CSharpParser.Switch_sectionContext ctx) {

	}

	@Override
	public void exitSwitch_label(final CSharpParser.Switch_labelContext ctx) {

	}

	@Override
	public void exitStatement_list(final CSharpParser.Statement_listContext ctx) {

	}

	@Override
	public void exitFor_initializer(final CSharpParser.For_initializerContext ctx) {

	}

	@Override
	public void exitFor_iterator(final CSharpParser.For_iteratorContext ctx) {

	}

	@Override
	public void exitNamespace_declaration(final CSharpParser.Namespace_declarationContext ctx) {
//		System.out.println("exitNamespace_declaration: " + ctx.getText());

//		final String pkg = ctx.qualified_identifier().getText();
//		if( namespace != null ) {
//		    throw new UnsupportedOperationException( "Multiple namespaces found: " + namespace + " & " + pkg );
//		}
//		else if( pkg.startsWith( QUANT_CONNECT ) )
//			namespace = "com." + pkg.toLowerCase();
//		else
//			throw new UnsupportedOperationException( "Unhandled namespace: " + pkg );
	}

	@Override
	public void exitNamespace_body(final CSharpParser.Namespace_bodyContext ctx) {
//	    System.out.println("exitNamespace_body: " + ctx.getText());
	}

	@Override
	public void exitExtern_alias_directives(final CSharpParser.Extern_alias_directivesContext ctx) {

	}

	@Override
	public void exitExtern_alias_directive(final CSharpParser.Extern_alias_directiveContext ctx) {

	}

	@Override
	public void exitUsingAliasDirective(final CSharpParser.UsingAliasDirectiveContext ctx) {
//	    System.out.println("exitUsingAliasDirective: " + ctx.getText());
	}

	@Override
	public void exitUsingNamespaceDirective(final CSharpParser.UsingNamespaceDirectiveContext ctx) {
//		System.out.println("exitUsingNamespaceDirective: " + ctx.getText());
//		 final String packageImport = ctx.namespace_or_type_name().getText();
//		 if( !"System".equals(packageImport) ) {
//			 if( packageImport.startsWith(QUANT_CONNECT) )
//				 imports.add( "com." + packageImport.toLowerCase() );
//		 else
//			 throw new UnsupportedOperationException("Not supporting using directive: " + packageImport);
//		 }
	}

	@Override
	public void exitUsingStaticDirective(final CSharpParser.UsingStaticDirectiveContext ctx) {

	}

	@Override
	public void exitNamespace_member_declarations(final CSharpParser.Namespace_member_declarationsContext ctx) {

	}

	@Override
	public void exitNamespace_member_declaration(final CSharpParser.Namespace_member_declarationContext ctx) {

	}

	@Override
	public void enterType_declaration(final CSharpParser.Type_declarationContext ctx) {
		currentClassStack.push(new ClassData());
	}
	
	@Override
	public void exitType_declaration(final CSharpParser.Type_declarationContext ctx) {
//		System.out.println("exitType_declaration: " + ctx.getText());
		
		ClassData currentClass = currentClassStack.pop();
		parsedClasses.add(currentClass);

		Class_definitionContext classDef = ctx.class_definition();
		if (classDef != null) {
			currentClass.type = ClassType.CLASS;
//			System.out.println("Class_definitionContext: " + classDef.getText());
			
			currentClass.name = classDef.identifier().getText();
//			System.out.println(classDef.class_body().getText());
			Type_parameter_listContext type_parameter_list = classDef.type_parameter_list();
			if(type_parameter_list != null)
				throw new UnsupportedOperationException(type_parameter_list.getText());
			
			Class_baseContext class_base = classDef.class_base();
			if(class_base != null)
				throw new UnsupportedOperationException(class_base.getText());
			
			Type_parameter_constraints_clausesContext type_parameter_constraints_clauses = classDef.type_parameter_constraints_clauses();
			if(type_parameter_constraints_clauses != null)
				throw new UnsupportedOperationException(type_parameter_constraints_clauses.getText());
		}

		Struct_definitionContext structDef = ctx.struct_definition();
		if (structDef != null)
            throw new RuntimeException("Struct_definitionContext: " + structDef.getText());

		Interface_definitionContext intDef = ctx.interface_definition();
		if (intDef != null) {
			currentClass.type = ClassType.INTERFACE;
			throw new RuntimeException("Interface_definitionContext: " + intDef);
		}
		
		Enum_definitionContext enumDef = ctx.enum_definition();
		if(enumDef != null) {
			currentClass.type = ClassType.ENUM;
            throw new RuntimeException("Enum_definitionContext: " + enumDef);
		}
		
		Delegate_definitionContext delDef = ctx.delegate_definition();
		if(delDef != null)
            throw new RuntimeException("Delegate_definitionContext: " + delDef.getText());
		
		AttributesContext attrCtx = ctx.attributes();
		if(attrCtx != null)
            throw new RuntimeException("AttributesContext: " + attrCtx.getText());
		
		All_member_modifiersContext allMemberCtx = ctx.all_member_modifiers();
		if(allMemberCtx != null) {
//			System.out.println("All_member_modifiersContext: " + allMemberCtx.getText());
			currentClass.classModifiers = getMemberModifiers(allMemberCtx.all_member_modifier());
		}
	}

	private List<MemberModifier> getMemberModifiers(List<All_member_modifierContext> all_member_modifiers) {
		return all_member_modifiers.stream().map(ammc -> {
			if(ammc.NEW() != null)
				return MemberModifier.NEW;
			else if(ammc.PUBLIC() != null)
				return MemberModifier.PUBLIC;
			else if(ammc.PROTECTED() != null)
				return MemberModifier.PROTECTED;
			else if(ammc.INTERNAL() != null)
				return MemberModifier.INTERNAL;
			else if(ammc.PRIVATE() != null)
				return MemberModifier.PRIVATE;
			else if(ammc.READONLY() != null)
				return MemberModifier.READONLY;
			else if(ammc.VOLATILE() != null)
				return MemberModifier.VOLATILE;
			else if(ammc.VIRTUAL() != null)
				return MemberModifier.VIRTUAL;
			else if(ammc.SEALED() != null)
				return MemberModifier.SEALED;
			else if(ammc.OVERRIDE() != null)
				return MemberModifier.OVERRIDE;
			else if(ammc.ABSTRACT() != null)
				return MemberModifier.ABSTRACT;
			else if(ammc.STATIC() != null)
				return MemberModifier.STATIC;
			else if(ammc.UNSAFE() != null)
				return MemberModifier.UNSAFE;
			else if(ammc.EXTERN() != null)
				return MemberModifier.EXTERN;
			else if(ammc.PARTIAL() != null)
				return MemberModifier.PARTIAL;
			else if(ammc.ASYNC() != null)
				return MemberModifier.ASYNC;
			else
				throw new RuntimeException("Unknown Member Modifier: " + ammc.getText());
		}).collect(Collectors.toList());
	}


	@Override
	public void exitQualified_alias_member(final CSharpParser.Qualified_alias_memberContext ctx) {

	}

	@Override
	public void exitType_parameter_list(final CSharpParser.Type_parameter_listContext ctx) {

	}

	@Override
	public void exitType_parameter(final CSharpParser.Type_parameterContext ctx) {

	}

	@Override
	public void exitInterface_type_list(final CSharpParser.Interface_type_listContext ctx) {

	}

	@Override
	public void exitType_parameter_constraints_clauses(final CSharpParser.Type_parameter_constraints_clausesContext ctx) {
	}

	@Override
	public void exitType_parameter_constraints_clause(final CSharpParser.Type_parameter_constraints_clauseContext ctx) {

	}

	@Override
	public void exitType_parameter_constraints(final CSharpParser.Type_parameter_constraintsContext ctx) {

	}

	@Override
	public void exitPrimary_constraint(final CSharpParser.Primary_constraintContext ctx) {

	}

	@Override
	public void exitSecondary_constraints(final CSharpParser.Secondary_constraintsContext ctx) {

	}

	@Override
	public void exitConstructor_constraint(final CSharpParser.Constructor_constraintContext ctx) {

	}

	@Override
	public void exitClass_member_declarations(final CSharpParser.Class_member_declarationsContext ctx) {

	}

	@Override
	public void exitClass_member_declaration(final CSharpParser.Class_member_declarationContext ctx) {
//		System.out.println("exitClass_member_declaration: " + ctx.getText());

        All_member_modifiersContext amm = ctx.all_member_modifiers();
        List<MemberModifier> methodModifiers = getMemberModifiers(amm.all_member_modifier());

        CSharpParser.Common_member_declarationContext cmdc = ctx.common_member_declaration();

        CSharpParser.Destructor_definitionContext ddc = ctx.destructor_definition();
        if(ddc != null)
            throw new RuntimeException("Unahndled Destructor_definitionContext: " + ddc);

        AttributesContext attributes = ctx.attributes();

	}

	@Override
	public void exitAll_member_modifiers(final CSharpParser.All_member_modifiersContext ctx) {

	}

	@Override
	public void exitAll_member_modifier(final CSharpParser.All_member_modifierContext ctx) {

	}

	@Override
	public void exitCommon_member_declaration(final CSharpParser.Common_member_declarationContext ctx) {

	}

	@Override
	public void exitTyped_member_declaration(final CSharpParser.Typed_member_declarationContext ctx) {

	}

	@Override
	public void exitConstant_declarators(final CSharpParser.Constant_declaratorsContext ctx) {

	}

	@Override
	public void exitConstant_declarator(final CSharpParser.Constant_declaratorContext ctx) {

	}

	@Override
	public void exitVariable_declarators(final CSharpParser.Variable_declaratorsContext ctx) {

	}

	@Override
	public void exitVariable_declarator(final CSharpParser.Variable_declaratorContext ctx) {

	}

	@Override
	public void exitVariable_initializer(final CSharpParser.Variable_initializerContext ctx) {

	}

	@Override
	public void exitReturn_type(final CSharpParser.Return_typeContext ctx) {

	}

	@Override
	public void exitMember_name(final CSharpParser.Member_nameContext ctx) {

	}

	@Override
	public void exitMethod_body(final CSharpParser.Method_bodyContext ctx) {

	}

	@Override
	public void exitFormal_parameter_list(final CSharpParser.Formal_parameter_listContext ctx) {

	}

	@Override
	public void exitFixed_parameters(final CSharpParser.Fixed_parametersContext ctx) {

	}

	@Override
	public void exitFixed_parameter(final CSharpParser.Fixed_parameterContext ctx) {

	}

	@Override
	public void exitParameter_modifier(final CSharpParser.Parameter_modifierContext ctx) {

	}

	@Override
	public void exitParameter_array(final CSharpParser.Parameter_arrayContext ctx) {

	}

	@Override
	public void exitAccessor_declarations(final CSharpParser.Accessor_declarationsContext ctx) {

	}

	@Override
	public void exitGet_accessor_declaration(final CSharpParser.Get_accessor_declarationContext ctx) {

	}

	@Override
	public void exitSet_accessor_declaration(final CSharpParser.Set_accessor_declarationContext ctx) {

	}

	@Override
	public void exitAccessor_modifier(final CSharpParser.Accessor_modifierContext ctx) {

	}

	@Override
	public void exitAccessor_body(final CSharpParser.Accessor_bodyContext ctx) {

	}

	@Override
	public void exitEvent_accessor_declarations(final CSharpParser.Event_accessor_declarationsContext ctx) {

	}

	@Override
	public void exitAdd_accessor_declaration(final CSharpParser.Add_accessor_declarationContext ctx) {

	}

	@Override
	public void exitRemove_accessor_declaration(final CSharpParser.Remove_accessor_declarationContext ctx) {

	}

	@Override
	public void exitOverloadable_operator(final CSharpParser.Overloadable_operatorContext ctx) {

	}

	@Override
	public void exitConversion_operator_declarator(final CSharpParser.Conversion_operator_declaratorContext ctx) {

	}

	@Override
	public void exitConstructor_initializer(final CSharpParser.Constructor_initializerContext ctx) {

	}

	@Override
	public void exitBody(final CSharpParser.BodyContext ctx) {

	}

	@Override
	public void exitStruct_interfaces(final CSharpParser.Struct_interfacesContext ctx) {

	}

	@Override
	public void exitStruct_body(final CSharpParser.Struct_bodyContext ctx) {

	}

	@Override
	public void exitStruct_member_declaration(final CSharpParser.Struct_member_declarationContext ctx) {

	}

	@Override
	public void exitArray_type(final CSharpParser.Array_typeContext ctx) {

	}

	@Override
	public void exitRank_specifier(final CSharpParser.Rank_specifierContext ctx) {

	}

	@Override
	public void exitArray_initializer(final CSharpParser.Array_initializerContext ctx) {

	}

	@Override
	public void exitVariant_type_parameter_list(final CSharpParser.Variant_type_parameter_listContext ctx) {

	}

	@Override
	public void exitVariant_type_parameter(final CSharpParser.Variant_type_parameterContext ctx) {

	}

	@Override
	public void exitVariance_annotation(final CSharpParser.Variance_annotationContext ctx) {

	}

	@Override
	public void exitInterface_base(final CSharpParser.Interface_baseContext ctx) {

	}

	@Override
	public void exitInterface_body(final CSharpParser.Interface_bodyContext ctx) {

	}

	@Override
	public void exitInterface_member_declaration(final CSharpParser.Interface_member_declarationContext ctx) {

	}

	@Override
	public void exitInterface_accessors(final CSharpParser.Interface_accessorsContext ctx) {

	}

	@Override
	public void exitEnum_base(final CSharpParser.Enum_baseContext ctx) {

	}

	@Override
	public void exitEnum_body(final CSharpParser.Enum_bodyContext ctx) {

	}

	@Override
	public void exitEnum_member_declaration(final CSharpParser.Enum_member_declarationContext ctx) {

	}

	@Override
	public void exitGlobal_attribute_section(final CSharpParser.Global_attribute_sectionContext ctx) {

	}

	@Override
	public void exitGlobal_attribute_target(final CSharpParser.Global_attribute_targetContext ctx) {

	}

	@Override
	public void exitAttributes(final CSharpParser.AttributesContext ctx) {

	}

	@Override
	public void exitAttribute_section(final CSharpParser.Attribute_sectionContext ctx) {

	}

	@Override
	public void exitAttribute_target(final CSharpParser.Attribute_targetContext ctx) {

	}

	@Override
	public void exitAttribute_list(final CSharpParser.Attribute_listContext ctx) {

	}

	@Override
	public void exitAttribute(final CSharpParser.AttributeContext ctx) {

	}

	@Override
	public void exitAttribute_argument(final CSharpParser.Attribute_argumentContext ctx) {

	}

	@Override
	public void exitPointer_type(final CSharpParser.Pointer_typeContext ctx) {

	}

	@Override
	public void exitFixed_pointer_declarators(final CSharpParser.Fixed_pointer_declaratorsContext ctx) {

	}

	@Override
	public void exitFixed_pointer_declarator(final CSharpParser.Fixed_pointer_declaratorContext ctx) {

	}

	@Override
	public void exitFixed_pointer_initializer(final CSharpParser.Fixed_pointer_initializerContext ctx) {

	}

	@Override
	public void exitFixed_size_buffer_declarator(final CSharpParser.Fixed_size_buffer_declaratorContext ctx) {

	}

	@Override
	public void exitRight_arrow(final CSharpParser.Right_arrowContext ctx) {

	}

	@Override
	public void exitRight_shift(final CSharpParser.Right_shiftContext ctx) {

	}

	@Override
	public void exitRight_shift_assignment(final CSharpParser.Right_shift_assignmentContext ctx) {

	}

	@Override
	public void exitLiteral(final CSharpParser.LiteralContext ctx) {

	}

	@Override
	public void exitBoolean_literal(final CSharpParser.Boolean_literalContext ctx) {

	}

	@Override
	public void exitString_literal(final CSharpParser.String_literalContext ctx) {

	}

	@Override
	public void exitInterpolated_regular_string(final CSharpParser.Interpolated_regular_stringContext ctx) {

	}

	@Override
	public void exitInterpolated_verbatium_string(final CSharpParser.Interpolated_verbatium_stringContext ctx) {

	}

	@Override
	public void exitInterpolated_regular_string_part(final CSharpParser.Interpolated_regular_string_partContext ctx) {

	}

	@Override
	public void exitInterpolated_verbatium_string_part(final CSharpParser.Interpolated_verbatium_string_partContext ctx) {

	}

	@Override
	public void exitInterpolated_string_expression(final CSharpParser.Interpolated_string_expressionContext ctx) {

	}

	@Override
	public void exitKeyword(final CSharpParser.KeywordContext ctx) {

	}

	@Override
	public void exitStruct_definition(final CSharpParser.Struct_definitionContext ctx) {

	}

	@Override
	public void exitInterface_definition(final CSharpParser.Interface_definitionContext ctx) {

	}

	@Override
	public void exitEnum_definition(final CSharpParser.Enum_definitionContext ctx) {

	}

	@Override
	public void exitDelegate_definition(final CSharpParser.Delegate_definitionContext ctx) {

	}

	@Override
	public void exitEvent_declaration(final CSharpParser.Event_declarationContext ctx) {

	}

	@Override
	public void exitField_declaration(final CSharpParser.Field_declarationContext ctx) {

	}

	@Override
	public void exitProperty_declaration(final CSharpParser.Property_declarationContext ctx) {

	}

	@Override
	public void exitConstant_declaration(final CSharpParser.Constant_declarationContext ctx) {

	}

	@Override
	public void exitIndexer_declaration(final CSharpParser.Indexer_declarationContext ctx) {

	}

	@Override
	public void exitDestructor_definition(final CSharpParser.Destructor_definitionContext ctx) {

	}

	@Override
	public void exitConstructor_declaration(final CSharpParser.Constructor_declarationContext ctx) {

	}

	@Override
	public void exitMethod_declaration(final CSharpParser.Method_declarationContext ctx) {

	}

	@Override
	public void exitMethod_member_name(final CSharpParser.Method_member_nameContext ctx) {

	}

	@Override
	public void exitOperator_declaration(final CSharpParser.Operator_declarationContext ctx) {

	}

	@Override
	public void exitArg_declaration(final CSharpParser.Arg_declarationContext ctx) {

	}

	@Override
	public void exitMethod_invocation(final CSharpParser.Method_invocationContext ctx) {

	}

	@Override
	public void exitObject_creation_expression(final CSharpParser.Object_creation_expressionContext ctx) {

	}

	@Override
	public void exitIdentifier(final CSharpParser.IdentifierContext ctx) {

	}

	@Override
	public void visitTerminal(final TerminalNode node) {

	}

	@Override
	public void visitErrorNode(final ErrorNode node) {

	}

	@Override
	public void enterNamespace_or_type_name(Namespace_or_type_nameContext ctx) {
	}

	@Override
	public void exitNamespace_or_type_name(Namespace_or_type_nameContext ctx) {
	}

	@Override
	public void enterType_(Type_Context ctx) {
	}

	@Override
	public void exitType_(Type_Context ctx) {
	}

	@Override
	public void enterBase_type(Base_typeContext ctx) {
	}

	@Override
	public void exitBase_type(Base_typeContext ctx) {

	}

	@Override
	public void enterSimple_type(Simple_typeContext ctx) {

	}

	@Override
	public void exitSimple_type(Simple_typeContext ctx) {

	}

	@Override
	public void enterNumeric_type(Numeric_typeContext ctx) {

	}

	@Override
	public void enterIntegral_type(Integral_typeContext ctx) {

	}

	@Override
	public void enterFloating_point_type(Floating_point_typeContext ctx) {

	}

	@Override
	public void enterClass_type(Class_typeContext ctx) {

	}

	@Override
	public void enterType_argument_list(Type_argument_listContext ctx) {

	}

	@Override
	public void enterArgument_list(Argument_listContext ctx) {

	}

	@Override
	public void enterArgument(ArgumentContext ctx) {

	}

	@Override
	public void enterExpression(ExpressionContext ctx) {

	}

	@Override
	public void enterNon_assignment_expression(Non_assignment_expressionContext ctx) {

	}

	@Override
	public void enterAssignment(AssignmentContext ctx) {

	}

	@Override
	public void enterAssignment_operator(Assignment_operatorContext ctx) {

	}

	@Override
	public void enterConditional_expression(Conditional_expressionContext ctx) {

	}

	@Override
	public void enterNull_coalescing_expression(Null_coalescing_expressionContext ctx) {

	}

	@Override
	public void enterConditional_or_expression(Conditional_or_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterConditional_or_expression(ctx);
	}


	@Override
	public void enterConditional_and_expression(Conditional_and_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterConditional_and_expression(ctx);
	}


	@Override
	public void enterInclusive_or_expression(Inclusive_or_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterInclusive_or_expression(ctx);
	}


	@Override
	public void enterExclusive_or_expression(Exclusive_or_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterExclusive_or_expression(ctx);
	}


	@Override
	public void enterAnd_expression(And_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterAnd_expression(ctx);
	}


	@Override
	public void enterEquality_expression(Equality_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterEquality_expression(ctx);
	}


	@Override
	public void enterRelational_expression(Relational_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterRelational_expression(ctx);
	}


	@Override
	public void enterShift_expression(Shift_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterShift_expression(ctx);
	}


	@Override
	public void enterAdditive_expression(Additive_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterAdditive_expression(ctx);
	}


	@Override
	public void enterMultiplicative_expression(Multiplicative_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterMultiplicative_expression(ctx);
	}


	@Override
	public void enterUnary_expression(Unary_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterUnary_expression(ctx);
	}


	@Override
	public void enterPrimary_expression(Primary_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterPrimary_expression(ctx);
	}


	@Override
	public void enterLiteralExpression(LiteralExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterLiteralExpression(ctx);
	}


	@Override
	public void enterSimpleNameExpression(SimpleNameExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterSimpleNameExpression(ctx);
	}


	@Override
	public void enterParenthesisExpressions(ParenthesisExpressionsContext ctx) {
		// TODO Auto-generated method stub
		super.enterParenthesisExpressions(ctx);
	}


	@Override
	public void enterMemberAccessExpression(MemberAccessExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterMemberAccessExpression(ctx);
	}


	@Override
	public void enterLiteralAccessExpression(LiteralAccessExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterLiteralAccessExpression(ctx);
	}


	@Override
	public void enterThisReferenceExpression(ThisReferenceExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterThisReferenceExpression(ctx);
	}


	@Override
	public void enterBaseAccessExpression(BaseAccessExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterBaseAccessExpression(ctx);
	}


	@Override
	public void enterObjectCreationExpression(ObjectCreationExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterObjectCreationExpression(ctx);
	}


	@Override
	public void enterTypeofExpression(TypeofExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterTypeofExpression(ctx);
	}


	@Override
	public void enterCheckedExpression(CheckedExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterCheckedExpression(ctx);
	}


	@Override
	public void enterUncheckedExpression(UncheckedExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterUncheckedExpression(ctx);
	}


	@Override
	public void enterDefaultValueExpression(DefaultValueExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterDefaultValueExpression(ctx);
	}


	@Override
	public void enterAnonymousMethodExpression(AnonymousMethodExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterAnonymousMethodExpression(ctx);
	}


	@Override
	public void enterSizeofExpression(SizeofExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterSizeofExpression(ctx);
	}


	@Override
	public void enterNameofExpression(NameofExpressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterNameofExpression(ctx);
	}


	@Override
	public void enterMember_access(Member_accessContext ctx) {
		// TODO Auto-generated method stub
		super.enterMember_access(ctx);
	}


	@Override
	public void enterBracket_expression(Bracket_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterBracket_expression(ctx);
	}


	@Override
	public void enterIndexer_argument(Indexer_argumentContext ctx) {
		// TODO Auto-generated method stub
		super.enterIndexer_argument(ctx);
	}


	@Override
	public void enterPredefined_type(Predefined_typeContext ctx) {
		// TODO Auto-generated method stub
		super.enterPredefined_type(ctx);
	}


	@Override
	public void enterExpression_list(Expression_listContext ctx) {
		// TODO Auto-generated method stub
		super.enterExpression_list(ctx);
	}


	@Override
	public void enterObject_or_collection_initializer(Object_or_collection_initializerContext ctx) {
		// TODO Auto-generated method stub
		super.enterObject_or_collection_initializer(ctx);
	}


	@Override
	public void enterObject_initializer(Object_initializerContext ctx) {
		// TODO Auto-generated method stub
		super.enterObject_initializer(ctx);
	}


	@Override
	public void enterMember_initializer_list(Member_initializer_listContext ctx) {
		// TODO Auto-generated method stub
		super.enterMember_initializer_list(ctx);
	}


	@Override
	public void enterMember_initializer(Member_initializerContext ctx) {
		// TODO Auto-generated method stub
		super.enterMember_initializer(ctx);
	}


	@Override
	public void enterInitializer_value(Initializer_valueContext ctx) {
		// TODO Auto-generated method stub
		super.enterInitializer_value(ctx);
	}


	@Override
	public void enterCollection_initializer(Collection_initializerContext ctx) {
		// TODO Auto-generated method stub
		super.enterCollection_initializer(ctx);
	}


	@Override
	public void enterElement_initializer(Element_initializerContext ctx) {
		// TODO Auto-generated method stub
		super.enterElement_initializer(ctx);
	}


	@Override
	public void enterAnonymous_object_initializer(Anonymous_object_initializerContext ctx) {
		// TODO Auto-generated method stub
		super.enterAnonymous_object_initializer(ctx);
	}


	@Override
	public void enterMember_declarator_list(Member_declarator_listContext ctx) {
		// TODO Auto-generated method stub
		super.enterMember_declarator_list(ctx);
	}


	@Override
	public void enterMember_declarator(Member_declaratorContext ctx) {
		// TODO Auto-generated method stub
		super.enterMember_declarator(ctx);
	}


	@Override
	public void enterUnbound_type_name(Unbound_type_nameContext ctx) {
		// TODO Auto-generated method stub
		super.enterUnbound_type_name(ctx);
	}


	@Override
	public void enterGeneric_dimension_specifier(Generic_dimension_specifierContext ctx) {
		// TODO Auto-generated method stub
		super.enterGeneric_dimension_specifier(ctx);
	}


	@Override
	public void enterIsType(IsTypeContext ctx) {
		// TODO Auto-generated method stub
		super.enterIsType(ctx);
	}


	@Override
	public void enterLambda_expression(Lambda_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterLambda_expression(ctx);
	}


	@Override
	public void enterAnonymous_function_signature(Anonymous_function_signatureContext ctx) {
		// TODO Auto-generated method stub
		super.enterAnonymous_function_signature(ctx);
	}


	@Override
	public void enterExplicit_anonymous_function_parameter_list(Explicit_anonymous_function_parameter_listContext ctx) {
		// TODO Auto-generated method stub
		super.enterExplicit_anonymous_function_parameter_list(ctx);
	}


	@Override
	public void enterExplicit_anonymous_function_parameter(Explicit_anonymous_function_parameterContext ctx) {
		// TODO Auto-generated method stub
		super.enterExplicit_anonymous_function_parameter(ctx);
	}


	@Override
	public void enterImplicit_anonymous_function_parameter_list(Implicit_anonymous_function_parameter_listContext ctx) {
		// TODO Auto-generated method stub
		super.enterImplicit_anonymous_function_parameter_list(ctx);
	}


	@Override
	public void enterAnonymous_function_body(Anonymous_function_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterAnonymous_function_body(ctx);
	}


	@Override
	public void enterQuery_expression(Query_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterQuery_expression(ctx);
	}


	@Override
	public void enterFrom_clause(From_clauseContext ctx) {
		// TODO Auto-generated method stub
		super.enterFrom_clause(ctx);
	}


	@Override
	public void enterQuery_body(Query_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterQuery_body(ctx);
	}


	@Override
	public void enterQuery_body_clause(Query_body_clauseContext ctx) {
		// TODO Auto-generated method stub
		super.enterQuery_body_clause(ctx);
	}


	@Override
	public void enterLet_clause(Let_clauseContext ctx) {
		// TODO Auto-generated method stub
		super.enterLet_clause(ctx);
	}


	@Override
	public void enterWhere_clause(Where_clauseContext ctx) {
		// TODO Auto-generated method stub
		super.enterWhere_clause(ctx);
	}


	@Override
	public void enterCombined_join_clause(Combined_join_clauseContext ctx) {
		// TODO Auto-generated method stub
		super.enterCombined_join_clause(ctx);
	}


	@Override
	public void enterOrderby_clause(Orderby_clauseContext ctx) {
		// TODO Auto-generated method stub
		super.enterOrderby_clause(ctx);
	}


	@Override
	public void enterOrdering(OrderingContext ctx) {
		// TODO Auto-generated method stub
		super.enterOrdering(ctx);
	}


	@Override
	public void enterSelect_or_group_clause(Select_or_group_clauseContext ctx) {
		// TODO Auto-generated method stub
		super.enterSelect_or_group_clause(ctx);
	}


	@Override
	public void enterQuery_continuation(Query_continuationContext ctx) {
		// TODO Auto-generated method stub
		super.enterQuery_continuation(ctx);
	}

	@Override
	public void enterDeclarationStatement(DeclarationStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterDeclarationStatement(ctx);
	}


	@Override
	public void enterLabeled_Statement(Labeled_StatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterLabeled_Statement(ctx);
	}


	@Override
	public void enterEmbedded_statement(Embedded_statementContext ctx) {
		// TODO Auto-generated method stub
		super.enterEmbedded_statement(ctx);
	}


	@Override
	public void enterTheEmptyStatement(TheEmptyStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterTheEmptyStatement(ctx);
	}


	@Override
	public void exitTheEmptyStatement(TheEmptyStatementContext ctx) {
		// TODO Auto-generated method stub
		super.exitTheEmptyStatement(ctx);
	}


	@Override
	public void enterExpressionStatement(ExpressionStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterExpressionStatement(ctx);
	}


	@Override
	public void enterIfStatement(IfStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterIfStatement(ctx);
	}


	@Override
	public void enterSwitchStatement(SwitchStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterSwitchStatement(ctx);
	}


	@Override
	public void enterWhileStatement(WhileStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterWhileStatement(ctx);
	}


	@Override
	public void enterDoStatement(DoStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterDoStatement(ctx);
	}


	@Override
	public void enterForStatement(ForStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterForStatement(ctx);
	}


	@Override
	public void enterForeachStatement(ForeachStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterForeachStatement(ctx);
	}


	@Override
	public void enterBreakStatement(BreakStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterBreakStatement(ctx);
	}


	@Override
	public void enterContinueStatement(ContinueStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterContinueStatement(ctx);
	}


	@Override
	public void enterGotoStatement(GotoStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterGotoStatement(ctx);
	}


	@Override
	public void enterReturnStatement(ReturnStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterReturnStatement(ctx);
	}


	@Override
	public void enterThrowStatement(ThrowStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterThrowStatement(ctx);
	}


	@Override
	public void enterTryStatement(TryStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterTryStatement(ctx);
	}


	@Override
	public void enterCheckedStatement(CheckedStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterCheckedStatement(ctx);
	}


	@Override
	public void enterUncheckedStatement(UncheckedStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterUncheckedStatement(ctx);
	}


	@Override
	public void enterLockStatement(LockStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterLockStatement(ctx);
	}


	@Override
	public void enterUsingStatement(UsingStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterUsingStatement(ctx);
	}


	@Override
	public void enterYieldStatement(YieldStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterYieldStatement(ctx);
	}


	@Override
	public void enterUnsafeStatement(UnsafeStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterUnsafeStatement(ctx);
	}


	@Override
	public void enterFixedStatement(FixedStatementContext ctx) {
		// TODO Auto-generated method stub
		super.enterFixedStatement(ctx);
	}


	@Override
	public void enterBlock(BlockContext ctx) {
		// TODO Auto-generated method stub
		super.enterBlock(ctx);
	}


	@Override
	public void enterLocal_variable_declaration(Local_variable_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterLocal_variable_declaration(ctx);
	}


	@Override
	public void enterLocal_variable_type(Local_variable_typeContext ctx) {
		// TODO Auto-generated method stub
		super.enterLocal_variable_type(ctx);
	}


	@Override
	public void enterLocal_variable_declarator(Local_variable_declaratorContext ctx) {
		// TODO Auto-generated method stub
		super.enterLocal_variable_declarator(ctx);
	}


	@Override
	public void enterLocal_variable_initializer(Local_variable_initializerContext ctx) {
		// TODO Auto-generated method stub
		super.enterLocal_variable_initializer(ctx);
	}


	@Override
	public void enterLocal_constant_declaration(Local_constant_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterLocal_constant_declaration(ctx);
	}


	@Override
	public void enterIf_body(If_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterIf_body(ctx);
	}


	@Override
	public void enterSwitch_section(Switch_sectionContext ctx) {
		// TODO Auto-generated method stub
		super.enterSwitch_section(ctx);
	}


	@Override
	public void enterSwitch_label(Switch_labelContext ctx) {
		// TODO Auto-generated method stub
		super.enterSwitch_label(ctx);
	}


	@Override
	public void enterStatement_list(Statement_listContext ctx) {
		// TODO Auto-generated method stub
		super.enterStatement_list(ctx);
	}


	@Override
	public void enterFor_initializer(For_initializerContext ctx) {
		// TODO Auto-generated method stub
		super.enterFor_initializer(ctx);
	}


	@Override
	public void enterFor_iterator(For_iteratorContext ctx) {
		// TODO Auto-generated method stub
		super.enterFor_iterator(ctx);
	}


	@Override
	public void enterCatch_clauses(Catch_clausesContext ctx) {
		// TODO Auto-generated method stub
		super.enterCatch_clauses(ctx);
	}


	@Override
	public void enterSpecific_catch_clause(Specific_catch_clauseContext ctx) {
		// TODO Auto-generated method stub
		super.enterSpecific_catch_clause(ctx);
	}


	@Override
	public void enterGeneral_catch_clause(General_catch_clauseContext ctx) {
		// TODO Auto-generated method stub
		super.enterGeneral_catch_clause(ctx);
	}


	@Override
	public void enterException_filter(Exception_filterContext ctx) {
		// TODO Auto-generated method stub
		super.enterException_filter(ctx);
	}


	@Override
	public void enterFinally_clause(Finally_clauseContext ctx) {
		// TODO Auto-generated method stub
		super.enterFinally_clause(ctx);
	}


	@Override
	public void enterResource_acquisition(Resource_acquisitionContext ctx) {
		// TODO Auto-generated method stub
		super.enterResource_acquisition(ctx);
	}


	@Override
	public void enterNamespace_declaration(Namespace_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterNamespace_declaration(ctx);
	}


	@Override
	public void enterQualified_identifier(Qualified_identifierContext ctx) {
		// TODO Auto-generated method stub
		super.enterQualified_identifier(ctx);
	}


	@Override
	public void exitQualified_identifier(Qualified_identifierContext ctx) {
		// TODO Auto-generated method stub
		super.exitQualified_identifier(ctx);
	}


	@Override
	public void enterNamespace_body(Namespace_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterNamespace_body(ctx);
	}


	@Override
	public void enterExtern_alias_directives(Extern_alias_directivesContext ctx) {
		// TODO Auto-generated method stub
		super.enterExtern_alias_directives(ctx);
	}


	@Override
	public void enterExtern_alias_directive(Extern_alias_directiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterExtern_alias_directive(ctx);
	}


	@Override
	public void enterUsing_directives(Using_directivesContext ctx) {
		// TODO Auto-generated method stub
		super.enterUsing_directives(ctx);
	}


	@Override
	public void exitUsing_directives(Using_directivesContext ctx) {
		// TODO Auto-generated method stub
		super.exitUsing_directives(ctx);
	}


	@Override
	public void enterUsingAliasDirective(UsingAliasDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterUsingAliasDirective(ctx);
	}


	@Override
	public void enterUsingNamespaceDirective(UsingNamespaceDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterUsingNamespaceDirective(ctx);
	}


	@Override
	public void enterUsingStaticDirective(UsingStaticDirectiveContext ctx) {
		// TODO Auto-generated method stub
		super.enterUsingStaticDirective(ctx);
	}


	@Override
	public void enterNamespace_member_declarations(Namespace_member_declarationsContext ctx) {
		// TODO Auto-generated method stub
		super.enterNamespace_member_declarations(ctx);
	}


	@Override
	public void enterNamespace_member_declaration(Namespace_member_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterNamespace_member_declaration(ctx);
	}


	@Override
	public void enterQualified_alias_member(Qualified_alias_memberContext ctx) {
		// TODO Auto-generated method stub
		super.enterQualified_alias_member(ctx);
	}


	@Override
	public void enterType_parameter_list(Type_parameter_listContext ctx) {
		// TODO Auto-generated method stub
		super.enterType_parameter_list(ctx);
	}


	@Override
	public void enterType_parameter(Type_parameterContext ctx) {
		// TODO Auto-generated method stub
		super.enterType_parameter(ctx);
	}


	@Override
	public void enterClass_base(Class_baseContext ctx) {
		// TODO Auto-generated method stub
		super.enterClass_base(ctx);
	}


	@Override
	public void exitClass_base(Class_baseContext ctx) {
		// TODO Auto-generated method stub
		super.exitClass_base(ctx);
	}


	@Override
	public void enterInterface_type_list(Interface_type_listContext ctx) {
		// TODO Auto-generated method stub
		super.enterInterface_type_list(ctx);
	}


	@Override
	public void enterType_parameter_constraints_clauses(Type_parameter_constraints_clausesContext ctx) {
		// TODO Auto-generated method stub
		super.enterType_parameter_constraints_clauses(ctx);
	}


	@Override
	public void enterType_parameter_constraints_clause(Type_parameter_constraints_clauseContext ctx) {
		// TODO Auto-generated method stub
		super.enterType_parameter_constraints_clause(ctx);
	}


	@Override
	public void enterType_parameter_constraints(Type_parameter_constraintsContext ctx) {
		// TODO Auto-generated method stub
		super.enterType_parameter_constraints(ctx);
	}


	@Override
	public void enterPrimary_constraint(Primary_constraintContext ctx) {
		// TODO Auto-generated method stub
		super.enterPrimary_constraint(ctx);
	}


	@Override
	public void enterSecondary_constraints(Secondary_constraintsContext ctx) {
		// TODO Auto-generated method stub
		super.enterSecondary_constraints(ctx);
	}


	@Override
	public void enterConstructor_constraint(Constructor_constraintContext ctx) {
		// TODO Auto-generated method stub
		super.enterConstructor_constraint(ctx);
	}


	@Override
	public void enterClass_body(Class_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterClass_body(ctx);
	}


	@Override
	public void exitClass_body(Class_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.exitClass_body(ctx);
	}


	@Override
	public void enterClass_member_declarations(Class_member_declarationsContext ctx) {
		// TODO Auto-generated method stub
		super.enterClass_member_declarations(ctx);
	}


	@Override
	public void enterClass_member_declaration(Class_member_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterClass_member_declaration(ctx);
	}


	@Override
	public void enterAll_member_modifiers(All_member_modifiersContext ctx) {
		// TODO Auto-generated method stub
		super.enterAll_member_modifiers(ctx);
	}


	@Override
	public void enterAll_member_modifier(All_member_modifierContext ctx) {
		// TODO Auto-generated method stub
		super.enterAll_member_modifier(ctx);
	}


	@Override
	public void enterCommon_member_declaration(Common_member_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterCommon_member_declaration(ctx);
	}


	@Override
	public void enterTyped_member_declaration(Typed_member_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterTyped_member_declaration(ctx);
	}


	@Override
	public void enterConstant_declarators(Constant_declaratorsContext ctx) {
		// TODO Auto-generated method stub
		super.enterConstant_declarators(ctx);
	}


	@Override
	public void enterConstant_declarator(Constant_declaratorContext ctx) {
		// TODO Auto-generated method stub
		super.enterConstant_declarator(ctx);
	}


	@Override
	public void enterVariable_declarators(Variable_declaratorsContext ctx) {
		// TODO Auto-generated method stub
		super.enterVariable_declarators(ctx);
	}


	@Override
	public void enterVariable_declarator(Variable_declaratorContext ctx) {
		// TODO Auto-generated method stub
		super.enterVariable_declarator(ctx);
	}


	@Override
	public void enterVariable_initializer(Variable_initializerContext ctx) {
		// TODO Auto-generated method stub
		super.enterVariable_initializer(ctx);
	}


	@Override
	public void enterReturn_type(Return_typeContext ctx) {
		// TODO Auto-generated method stub
		super.enterReturn_type(ctx);
	}


	@Override
	public void enterMember_name(Member_nameContext ctx) {
		// TODO Auto-generated method stub
		super.enterMember_name(ctx);
	}


	@Override
	public void enterMethod_body(Method_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterMethod_body(ctx);
	}


	@Override
	public void enterFormal_parameter_list(Formal_parameter_listContext ctx) {
		// TODO Auto-generated method stub
		super.enterFormal_parameter_list(ctx);
	}


	@Override
	public void enterFixed_parameters(Fixed_parametersContext ctx) {
		// TODO Auto-generated method stub
		super.enterFixed_parameters(ctx);
	}


	@Override
	public void enterFixed_parameter(Fixed_parameterContext ctx) {
		// TODO Auto-generated method stub
		super.enterFixed_parameter(ctx);
	}


	@Override
	public void enterParameter_modifier(Parameter_modifierContext ctx) {
		// TODO Auto-generated method stub
		super.enterParameter_modifier(ctx);
	}


	@Override
	public void enterParameter_array(Parameter_arrayContext ctx) {
		// TODO Auto-generated method stub
		super.enterParameter_array(ctx);
	}


	@Override
	public void enterAccessor_declarations(Accessor_declarationsContext ctx) {
		// TODO Auto-generated method stub
		super.enterAccessor_declarations(ctx);
	}


	@Override
	public void enterGet_accessor_declaration(Get_accessor_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterGet_accessor_declaration(ctx);
	}


	@Override
	public void enterSet_accessor_declaration(Set_accessor_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterSet_accessor_declaration(ctx);
	}


	@Override
	public void enterAccessor_modifier(Accessor_modifierContext ctx) {
		// TODO Auto-generated method stub
		super.enterAccessor_modifier(ctx);
	}


	@Override
	public void enterAccessor_body(Accessor_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterAccessor_body(ctx);
	}


	@Override
	public void enterEvent_accessor_declarations(Event_accessor_declarationsContext ctx) {
		// TODO Auto-generated method stub
		super.enterEvent_accessor_declarations(ctx);
	}


	@Override
	public void enterAdd_accessor_declaration(Add_accessor_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterAdd_accessor_declaration(ctx);
	}


	@Override
	public void enterRemove_accessor_declaration(Remove_accessor_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterRemove_accessor_declaration(ctx);
	}


	@Override
	public void enterOverloadable_operator(Overloadable_operatorContext ctx) {
		// TODO Auto-generated method stub
		super.enterOverloadable_operator(ctx);
	}


	@Override
	public void enterConversion_operator_declarator(Conversion_operator_declaratorContext ctx) {
		// TODO Auto-generated method stub
		super.enterConversion_operator_declarator(ctx);
	}


	@Override
	public void enterConstructor_initializer(Constructor_initializerContext ctx) {
		// TODO Auto-generated method stub
		super.enterConstructor_initializer(ctx);
	}


	@Override
	public void enterBody(BodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterBody(ctx);
	}


	@Override
	public void enterStruct_interfaces(Struct_interfacesContext ctx) {
		// TODO Auto-generated method stub
		super.enterStruct_interfaces(ctx);
	}


	@Override
	public void enterStruct_body(Struct_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterStruct_body(ctx);
	}


	@Override
	public void enterStruct_member_declaration(Struct_member_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterStruct_member_declaration(ctx);
	}


	@Override
	public void enterArray_type(Array_typeContext ctx) {
		// TODO Auto-generated method stub
		super.enterArray_type(ctx);
	}


	@Override
	public void enterRank_specifier(Rank_specifierContext ctx) {
		// TODO Auto-generated method stub
		super.enterRank_specifier(ctx);
	}


	@Override
	public void enterArray_initializer(Array_initializerContext ctx) {
		// TODO Auto-generated method stub
		super.enterArray_initializer(ctx);
	}


	@Override
	public void enterVariant_type_parameter_list(Variant_type_parameter_listContext ctx) {
		// TODO Auto-generated method stub
		super.enterVariant_type_parameter_list(ctx);
	}


	@Override
	public void enterVariant_type_parameter(Variant_type_parameterContext ctx) {
		// TODO Auto-generated method stub
		super.enterVariant_type_parameter(ctx);
	}


	@Override
	public void enterVariance_annotation(Variance_annotationContext ctx) {
		// TODO Auto-generated method stub
		super.enterVariance_annotation(ctx);
	}


	@Override
	public void enterInterface_base(Interface_baseContext ctx) {
		// TODO Auto-generated method stub
		super.enterInterface_base(ctx);
	}


	@Override
	public void enterInterface_body(Interface_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterInterface_body(ctx);
	}


	@Override
	public void enterInterface_member_declaration(Interface_member_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterInterface_member_declaration(ctx);
	}


	@Override
	public void enterInterface_accessors(Interface_accessorsContext ctx) {
		// TODO Auto-generated method stub
		super.enterInterface_accessors(ctx);
	}


	@Override
	public void enterEnum_base(Enum_baseContext ctx) {
		// TODO Auto-generated method stub
		super.enterEnum_base(ctx);
	}


	@Override
	public void enterEnum_body(Enum_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterEnum_body(ctx);
	}


	@Override
	public void enterEnum_member_declaration(Enum_member_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterEnum_member_declaration(ctx);
	}


	@Override
	public void enterGlobal_attribute_section(Global_attribute_sectionContext ctx) {
		// TODO Auto-generated method stub
		super.enterGlobal_attribute_section(ctx);
	}


	@Override
	public void enterGlobal_attribute_target(Global_attribute_targetContext ctx) {
		// TODO Auto-generated method stub
		super.enterGlobal_attribute_target(ctx);
	}


	@Override
	public void enterAttributes(AttributesContext ctx) {
		// TODO Auto-generated method stub
		super.enterAttributes(ctx);
	}


	@Override
	public void enterAttribute_section(Attribute_sectionContext ctx) {
		// TODO Auto-generated method stub
		super.enterAttribute_section(ctx);
	}


	@Override
	public void enterAttribute_target(Attribute_targetContext ctx) {
		// TODO Auto-generated method stub
		super.enterAttribute_target(ctx);
	}


	@Override
	public void enterAttribute_list(Attribute_listContext ctx) {
		// TODO Auto-generated method stub
		super.enterAttribute_list(ctx);
	}


	@Override
	public void enterAttribute(AttributeContext ctx) {
		// TODO Auto-generated method stub
		super.enterAttribute(ctx);
	}


	@Override
	public void enterAttribute_argument(Attribute_argumentContext ctx) {
		// TODO Auto-generated method stub
		super.enterAttribute_argument(ctx);
	}


	@Override
	public void enterPointer_type(Pointer_typeContext ctx) {
		// TODO Auto-generated method stub
		super.enterPointer_type(ctx);
	}


	@Override
	public void enterFixed_pointer_declarators(Fixed_pointer_declaratorsContext ctx) {
		// TODO Auto-generated method stub
		super.enterFixed_pointer_declarators(ctx);
	}


	@Override
	public void enterFixed_pointer_declarator(Fixed_pointer_declaratorContext ctx) {
		// TODO Auto-generated method stub
		super.enterFixed_pointer_declarator(ctx);
	}


	@Override
	public void enterFixed_pointer_initializer(Fixed_pointer_initializerContext ctx) {
		// TODO Auto-generated method stub
		super.enterFixed_pointer_initializer(ctx);
	}


	@Override
	public void enterFixed_size_buffer_declarator(Fixed_size_buffer_declaratorContext ctx) {
		// TODO Auto-generated method stub
		super.enterFixed_size_buffer_declarator(ctx);
	}


	@Override
	public void enterRight_arrow(Right_arrowContext ctx) {
		// TODO Auto-generated method stub
		super.enterRight_arrow(ctx);
	}


	@Override
	public void enterRight_shift(Right_shiftContext ctx) {
		// TODO Auto-generated method stub
		super.enterRight_shift(ctx);
	}


	@Override
	public void enterRight_shift_assignment(Right_shift_assignmentContext ctx) {
		// TODO Auto-generated method stub
		super.enterRight_shift_assignment(ctx);
	}


	@Override
	public void enterLiteral(LiteralContext ctx) {
		// TODO Auto-generated method stub
		super.enterLiteral(ctx);
	}


	@Override
	public void enterBoolean_literal(Boolean_literalContext ctx) {
		// TODO Auto-generated method stub
		super.enterBoolean_literal(ctx);
	}


	@Override
	public void enterString_literal(String_literalContext ctx) {
		// TODO Auto-generated method stub
		super.enterString_literal(ctx);
	}


	@Override
	public void enterInterpolated_regular_string(Interpolated_regular_stringContext ctx) {
		// TODO Auto-generated method stub
		super.enterInterpolated_regular_string(ctx);
	}


	@Override
	public void enterInterpolated_verbatium_string(Interpolated_verbatium_stringContext ctx) {
		// TODO Auto-generated method stub
		super.enterInterpolated_verbatium_string(ctx);
	}


	@Override
	public void enterInterpolated_regular_string_part(Interpolated_regular_string_partContext ctx) {
		// TODO Auto-generated method stub
		super.enterInterpolated_regular_string_part(ctx);
	}


	@Override
	public void enterInterpolated_verbatium_string_part(Interpolated_verbatium_string_partContext ctx) {
		// TODO Auto-generated method stub
		super.enterInterpolated_verbatium_string_part(ctx);
	}


	@Override
	public void enterInterpolated_string_expression(Interpolated_string_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterInterpolated_string_expression(ctx);
	}


	@Override
	public void enterKeyword(KeywordContext ctx) {
		// TODO Auto-generated method stub
		super.enterKeyword(ctx);
	}


	@Override
	public void enterClass_definition(Class_definitionContext ctx) {
		// TODO Auto-generated method stub
		super.enterClass_definition(ctx);
	}


	@Override
	public void exitClass_definition(Class_definitionContext ctx) {
		// TODO Auto-generated method stub
		super.exitClass_definition(ctx);
	}


	@Override
	public void enterStruct_definition(Struct_definitionContext ctx) {
		// TODO Auto-generated method stub
		super.enterStruct_definition(ctx);
	}


	@Override
	public void enterInterface_definition(Interface_definitionContext ctx) {
		// TODO Auto-generated method stub
		super.enterInterface_definition(ctx);
	}


	@Override
	public void enterEnum_definition(Enum_definitionContext ctx) {
		// TODO Auto-generated method stub
		super.enterEnum_definition(ctx);
	}


	@Override
	public void enterDelegate_definition(Delegate_definitionContext ctx) {
		// TODO Auto-generated method stub
		super.enterDelegate_definition(ctx);
	}


	@Override
	public void enterEvent_declaration(Event_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterEvent_declaration(ctx);
	}


	@Override
	public void enterField_declaration(Field_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterField_declaration(ctx);
	}


	@Override
	public void enterProperty_declaration(Property_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterProperty_declaration(ctx);
	}


	@Override
	public void enterConstant_declaration(Constant_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterConstant_declaration(ctx);
	}


	@Override
	public void enterIndexer_declaration(Indexer_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterIndexer_declaration(ctx);
	}


	@Override
	public void enterDestructor_definition(Destructor_definitionContext ctx) {
		// TODO Auto-generated method stub
		super.enterDestructor_definition(ctx);
	}


	@Override
	public void enterConstructor_declaration(Constructor_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterConstructor_declaration(ctx);
	}


	@Override
	public void enterMethod_declaration(Method_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterMethod_declaration(ctx);
	}


	@Override
	public void enterMethod_member_name(Method_member_nameContext ctx) {
		// TODO Auto-generated method stub
		super.enterMethod_member_name(ctx);
	}


	@Override
	public void enterOperator_declaration(Operator_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterOperator_declaration(ctx);
	}


	@Override
	public void enterArg_declaration(Arg_declarationContext ctx) {
		// TODO Auto-generated method stub
		super.enterArg_declaration(ctx);
	}


	@Override
	public void enterMethod_invocation(Method_invocationContext ctx) {
		// TODO Auto-generated method stub
		super.enterMethod_invocation(ctx);
	}


	@Override
	public void enterObject_creation_expression(Object_creation_expressionContext ctx) {
		// TODO Auto-generated method stub
		super.enterObject_creation_expression(ctx);
	}


	@Override
	public void enterIdentifier(IdentifierContext ctx) {
		// TODO Auto-generated method stub
		super.enterIdentifier(ctx);
	}


	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.enterEveryRule(ctx);
	}


	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		super.exitEveryRule(ctx);
	}

	@Override
	public void enterTuple_type(Tuple_typeContext ctx) {
		super.enterTuple_type(ctx);
	}

	@Override
	public void exitTuple_type(Tuple_typeContext ctx) {
		super.exitTuple_type(ctx);
	}

	@Override
	public void enterTuple_element(Tuple_elementContext ctx) {
		super.enterTuple_element(ctx);
	}

	@Override
	public void exitTuple_element(Tuple_elementContext ctx) {
		super.exitTuple_element(ctx);
	}

	@Override
	public void enterSwitch_expression(Switch_expressionContext ctx) {
		super.enterSwitch_expression(ctx);
	}

	@Override
	public void exitSwitch_expression(Switch_expressionContext ctx) {
		super.exitSwitch_expression(ctx);
	}

	@Override
	public void enterSwitch_expression_arms(Switch_expression_armsContext ctx) {
		super.enterSwitch_expression_arms(ctx);
	}

	@Override
	public void exitSwitch_expression_arms(Switch_expression_armsContext ctx) {
		super.exitSwitch_expression_arms(ctx);
	}

	@Override
	public void enterSwitch_expression_arm(Switch_expression_armContext ctx) {
		super.enterSwitch_expression_arm(ctx);
	}

	@Override
	public void exitSwitch_expression_arm(Switch_expression_armContext ctx) {
		super.exitSwitch_expression_arm(ctx);
	}

	@Override
	public void enterRange_expression(Range_expressionContext ctx) {
		super.enterRange_expression(ctx);
	}

	@Override
	public void exitRange_expression(Range_expressionContext ctx) {
		super.exitRange_expression(ctx);
	}

	@Override
	public void enterTupleExpression(TupleExpressionContext ctx) {
		super.enterTupleExpression(ctx);
	}

	@Override
	public void exitTupleExpression(TupleExpressionContext ctx) {
		super.exitTupleExpression(ctx);
	}

	@Override
	public void enterThrowable_expression(Throwable_expressionContext ctx) {
		super.enterThrowable_expression(ctx);
	}

	@Override
	public void exitThrowable_expression(Throwable_expressionContext ctx) {
		super.exitThrowable_expression(ctx);
	}

	@Override
	public void enterThrow_expression(Throw_expressionContext ctx) {
		super.enterThrow_expression(ctx);
	}

	@Override
	public void exitThrow_expression(Throw_expressionContext ctx) {
		super.exitThrow_expression(ctx);
	}

	@Override
	public void enterIsTypePatternArms(IsTypePatternArmsContext ctx) {
		super.enterIsTypePatternArms(ctx);
	}

	@Override
	public void exitIsTypePatternArms(IsTypePatternArmsContext ctx) {
		super.exitIsTypePatternArms(ctx);
	}

	@Override
	public void enterIsTypePatternArm(IsTypePatternArmContext ctx) {
		super.enterIsTypePatternArm(ctx);
	}

	@Override
	public void exitIsTypePatternArm(IsTypePatternArmContext ctx) {
		super.exitIsTypePatternArm(ctx);
	}

	@Override
	public void enterStatement(StatementContext ctx) {
		super.enterStatement(ctx);
	}

	@Override
	public void exitStatement(StatementContext ctx) {
		super.exitStatement(ctx);
	}

	@Override
	public void enterLocal_function_declaration(Local_function_declarationContext ctx) {
		super.enterLocal_function_declaration(ctx);
	}

	@Override
	public void exitLocal_function_declaration(Local_function_declarationContext ctx) {
		super.exitLocal_function_declaration(ctx);
	}

	@Override
	public void enterLocal_function_header(Local_function_headerContext ctx) {
		super.enterLocal_function_header(ctx);
	}

	@Override
	public void exitLocal_function_header(Local_function_headerContext ctx) {
		super.exitLocal_function_header(ctx);
	}

	@Override
	public void enterLocal_function_modifiers(Local_function_modifiersContext ctx) {
		super.enterLocal_function_modifiers(ctx);
	}

	@Override
	public void exitLocal_function_modifiers(Local_function_modifiersContext ctx) {
		super.exitLocal_function_modifiers(ctx);
	}

	@Override
	public void enterLocal_function_body(Local_function_bodyContext ctx) {
		super.enterLocal_function_body(ctx);
	}

	@Override
	public void exitLocal_function_body(Local_function_bodyContext ctx) {
		super.exitLocal_function_body(ctx);
	}

	@Override
	public void enterCase_guard(Case_guardContext ctx) {
		super.enterCase_guard(ctx);
	}

	@Override
	public void exitCase_guard(Case_guardContext ctx) {
		super.exitCase_guard(ctx);
	}

	@Override
	public void exitCatch_clauses(Catch_clausesContext ctx) {
		super.exitCatch_clauses(ctx);
	}

	@Override
	public void exitSpecific_catch_clause(Specific_catch_clauseContext ctx) {
		super.exitSpecific_catch_clause(ctx);
	}

	@Override
	public void exitGeneral_catch_clause(General_catch_clauseContext ctx) {
		super.exitGeneral_catch_clause(ctx);
	}

	@Override
	public void exitException_filter(Exception_filterContext ctx) {
		super.exitException_filter(ctx);
	}

	@Override
	public void exitFinally_clause(Finally_clauseContext ctx) {
		super.exitFinally_clause(ctx);
	}

	@Override
	public void exitResource_acquisition(Resource_acquisitionContext ctx) {
		super.exitResource_acquisition(ctx);
	}

	@Override
	public void enterStackalloc_initializer(Stackalloc_initializerContext ctx) {
		super.enterStackalloc_initializer(ctx);
	}

	@Override
	public void exitStackalloc_initializer(Stackalloc_initializerContext ctx) {
		super.exitStackalloc_initializer(ctx);
	}

	private static final class ClassData {
		public String name;
		public ClassType type;
		public List<MemberModifier> classModifiers;
	}
}