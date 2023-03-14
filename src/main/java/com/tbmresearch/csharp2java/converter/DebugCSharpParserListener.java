package com.tbmresearch.csharp2java.converter;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class DebugCSharpParserListener extends CSharpParserBaseListener {

    @Override
    public void enterCompilation_unit(CSharpParser.Compilation_unitContext ctx) {
        System.out.printf("enterCompilation_unit: %s%n", ctx.getText());
    }

    @Override
    public void exitCompilation_unit(CSharpParser.Compilation_unitContext ctx) {
        super.exitCompilation_unit(ctx);
    }

    @Override
    public void enterNamespace_or_type_name(CSharpParser.Namespace_or_type_nameContext ctx) {
        super.enterNamespace_or_type_name(ctx);
    }

    @Override
    public void exitNamespace_or_type_name(CSharpParser.Namespace_or_type_nameContext ctx) {
        super.exitNamespace_or_type_name(ctx);
    }

    @Override
    public void enterType_(CSharpParser.Type_Context ctx) {
        super.enterType_(ctx);
    }

    @Override
    public void exitType_(CSharpParser.Type_Context ctx) {
        super.exitType_(ctx);
    }

    @Override
    public void enterBase_type(CSharpParser.Base_typeContext ctx) {
        super.enterBase_type(ctx);
    }

    @Override
    public void exitBase_type(CSharpParser.Base_typeContext ctx) {
        super.exitBase_type(ctx);
    }

    @Override
    public void enterTuple_type(CSharpParser.Tuple_typeContext ctx) {
        super.enterTuple_type(ctx);
    }

    @Override
    public void exitTuple_type(CSharpParser.Tuple_typeContext ctx) {
        super.exitTuple_type(ctx);
    }

    @Override
    public void enterTuple_element(CSharpParser.Tuple_elementContext ctx) {
        super.enterTuple_element(ctx);
    }

    @Override
    public void exitTuple_element(CSharpParser.Tuple_elementContext ctx) {
        super.exitTuple_element(ctx);
    }

    @Override
    public void enterSimple_type(CSharpParser.Simple_typeContext ctx) {
        super.enterSimple_type(ctx);
    }

    @Override
    public void exitSimple_type(CSharpParser.Simple_typeContext ctx) {
        super.exitSimple_type(ctx);
    }

    @Override
    public void enterNumeric_type(CSharpParser.Numeric_typeContext ctx) {
        super.enterNumeric_type(ctx);
    }

    @Override
    public void exitNumeric_type(CSharpParser.Numeric_typeContext ctx) {
        super.exitNumeric_type(ctx);
    }

    @Override
    public void enterIntegral_type(CSharpParser.Integral_typeContext ctx) {
        super.enterIntegral_type(ctx);
    }

    @Override
    public void exitIntegral_type(CSharpParser.Integral_typeContext ctx) {
        super.exitIntegral_type(ctx);
    }

    @Override
    public void enterFloating_point_type(CSharpParser.Floating_point_typeContext ctx) {
        super.enterFloating_point_type(ctx);
    }

    @Override
    public void exitFloating_point_type(CSharpParser.Floating_point_typeContext ctx) {
        super.exitFloating_point_type(ctx);
    }

    @Override
    public void enterClass_type(CSharpParser.Class_typeContext ctx) {
        super.enterClass_type(ctx);
    }

    @Override
    public void exitClass_type(CSharpParser.Class_typeContext ctx) {
        super.exitClass_type(ctx);
    }

    @Override
    public void enterType_argument_list(CSharpParser.Type_argument_listContext ctx) {
        super.enterType_argument_list(ctx);
    }

    @Override
    public void exitType_argument_list(CSharpParser.Type_argument_listContext ctx) {
        super.exitType_argument_list(ctx);
    }

    @Override
    public void enterArgument_list(CSharpParser.Argument_listContext ctx) {
        super.enterArgument_list(ctx);
    }

    @Override
    public void exitArgument_list(CSharpParser.Argument_listContext ctx) {
        super.exitArgument_list(ctx);
    }

    @Override
    public void enterArgument(CSharpParser.ArgumentContext ctx) {
        super.enterArgument(ctx);
    }

    @Override
    public void exitArgument(CSharpParser.ArgumentContext ctx) {
        super.exitArgument(ctx);
    }

    @Override
    public void enterExpression(CSharpParser.ExpressionContext ctx) {
        super.enterExpression(ctx);
    }

    @Override
    public void exitExpression(CSharpParser.ExpressionContext ctx) {
        super.exitExpression(ctx);
    }

    @Override
    public void enterNon_assignment_expression(CSharpParser.Non_assignment_expressionContext ctx) {
        super.enterNon_assignment_expression(ctx);
    }

    @Override
    public void exitNon_assignment_expression(CSharpParser.Non_assignment_expressionContext ctx) {
        super.exitNon_assignment_expression(ctx);
    }

    @Override
    public void enterAssignment(CSharpParser.AssignmentContext ctx) {
        super.enterAssignment(ctx);
    }

    @Override
    public void exitAssignment(CSharpParser.AssignmentContext ctx) {
        super.exitAssignment(ctx);
    }

    @Override
    public void enterAssignment_operator(CSharpParser.Assignment_operatorContext ctx) {
        super.enterAssignment_operator(ctx);
    }

    @Override
    public void exitAssignment_operator(CSharpParser.Assignment_operatorContext ctx) {
        super.exitAssignment_operator(ctx);
    }

    @Override
    public void enterConditional_expression(CSharpParser.Conditional_expressionContext ctx) {
        super.enterConditional_expression(ctx);
    }

    @Override
    public void exitConditional_expression(CSharpParser.Conditional_expressionContext ctx) {
        super.exitConditional_expression(ctx);
    }

    @Override
    public void enterNull_coalescing_expression(CSharpParser.Null_coalescing_expressionContext ctx) {
        super.enterNull_coalescing_expression(ctx);
    }

    @Override
    public void exitNull_coalescing_expression(CSharpParser.Null_coalescing_expressionContext ctx) {
        super.exitNull_coalescing_expression(ctx);
    }

    @Override
    public void enterConditional_or_expression(CSharpParser.Conditional_or_expressionContext ctx) {
        super.enterConditional_or_expression(ctx);
    }

    @Override
    public void exitConditional_or_expression(CSharpParser.Conditional_or_expressionContext ctx) {
        super.exitConditional_or_expression(ctx);
    }

    @Override
    public void enterConditional_and_expression(CSharpParser.Conditional_and_expressionContext ctx) {
        super.enterConditional_and_expression(ctx);
    }

    @Override
    public void exitConditional_and_expression(CSharpParser.Conditional_and_expressionContext ctx) {
        super.exitConditional_and_expression(ctx);
    }

    @Override
    public void enterInclusive_or_expression(CSharpParser.Inclusive_or_expressionContext ctx) {
        super.enterInclusive_or_expression(ctx);
    }

    @Override
    public void exitInclusive_or_expression(CSharpParser.Inclusive_or_expressionContext ctx) {
        super.exitInclusive_or_expression(ctx);
    }

    @Override
    public void enterExclusive_or_expression(CSharpParser.Exclusive_or_expressionContext ctx) {
        super.enterExclusive_or_expression(ctx);
    }

    @Override
    public void exitExclusive_or_expression(CSharpParser.Exclusive_or_expressionContext ctx) {
        super.exitExclusive_or_expression(ctx);
    }

    @Override
    public void enterAnd_expression(CSharpParser.And_expressionContext ctx) {
        super.enterAnd_expression(ctx);
    }

    @Override
    public void exitAnd_expression(CSharpParser.And_expressionContext ctx) {
        super.exitAnd_expression(ctx);
    }

    @Override
    public void enterEquality_expression(CSharpParser.Equality_expressionContext ctx) {
        super.enterEquality_expression(ctx);
    }

    @Override
    public void exitEquality_expression(CSharpParser.Equality_expressionContext ctx) {
        super.exitEquality_expression(ctx);
    }

    @Override
    public void enterRelational_expression(CSharpParser.Relational_expressionContext ctx) {
        super.enterRelational_expression(ctx);
    }

    @Override
    public void exitRelational_expression(CSharpParser.Relational_expressionContext ctx) {
        super.exitRelational_expression(ctx);
    }

    @Override
    public void enterShift_expression(CSharpParser.Shift_expressionContext ctx) {
        super.enterShift_expression(ctx);
    }

    @Override
    public void exitShift_expression(CSharpParser.Shift_expressionContext ctx) {
        super.exitShift_expression(ctx);
    }

    @Override
    public void enterAdditive_expression(CSharpParser.Additive_expressionContext ctx) {
        super.enterAdditive_expression(ctx);
    }

    @Override
    public void exitAdditive_expression(CSharpParser.Additive_expressionContext ctx) {
        super.exitAdditive_expression(ctx);
    }

    @Override
    public void enterMultiplicative_expression(CSharpParser.Multiplicative_expressionContext ctx) {
        super.enterMultiplicative_expression(ctx);
    }

    @Override
    public void exitMultiplicative_expression(CSharpParser.Multiplicative_expressionContext ctx) {
        super.exitMultiplicative_expression(ctx);
    }

    @Override
    public void enterSwitch_expression(CSharpParser.Switch_expressionContext ctx) {
        super.enterSwitch_expression(ctx);
    }

    @Override
    public void exitSwitch_expression(CSharpParser.Switch_expressionContext ctx) {
        super.exitSwitch_expression(ctx);
    }

    @Override
    public void enterSwitch_expression_arms(CSharpParser.Switch_expression_armsContext ctx) {
        super.enterSwitch_expression_arms(ctx);
    }

    @Override
    public void exitSwitch_expression_arms(CSharpParser.Switch_expression_armsContext ctx) {
        super.exitSwitch_expression_arms(ctx);
    }

    @Override
    public void enterSwitch_expression_arm(CSharpParser.Switch_expression_armContext ctx) {
        super.enterSwitch_expression_arm(ctx);
    }

    @Override
    public void exitSwitch_expression_arm(CSharpParser.Switch_expression_armContext ctx) {
        super.exitSwitch_expression_arm(ctx);
    }

    @Override
    public void enterRange_expression(CSharpParser.Range_expressionContext ctx) {
        super.enterRange_expression(ctx);
    }

    @Override
    public void exitRange_expression(CSharpParser.Range_expressionContext ctx) {
        super.exitRange_expression(ctx);
    }

    @Override
    public void enterUnary_expression(CSharpParser.Unary_expressionContext ctx) {
        super.enterUnary_expression(ctx);
    }

    @Override
    public void exitUnary_expression(CSharpParser.Unary_expressionContext ctx) {
        super.exitUnary_expression(ctx);
    }

    @Override
    public void enterPrimary_expression(CSharpParser.Primary_expressionContext ctx) {
        super.enterPrimary_expression(ctx);
    }

    @Override
    public void exitPrimary_expression(CSharpParser.Primary_expressionContext ctx) {
        super.exitPrimary_expression(ctx);
    }

    @Override
    public void enterLiteralExpression(CSharpParser.LiteralExpressionContext ctx) {
        super.enterLiteralExpression(ctx);
    }

    @Override
    public void exitLiteralExpression(CSharpParser.LiteralExpressionContext ctx) {
        super.exitLiteralExpression(ctx);
    }

    @Override
    public void enterSimpleNameExpression(CSharpParser.SimpleNameExpressionContext ctx) {
        super.enterSimpleNameExpression(ctx);
    }

    @Override
    public void exitSimpleNameExpression(CSharpParser.SimpleNameExpressionContext ctx) {
        super.exitSimpleNameExpression(ctx);
    }

    @Override
    public void enterParenthesisExpressions(CSharpParser.ParenthesisExpressionsContext ctx) {
        super.enterParenthesisExpressions(ctx);
    }

    @Override
    public void exitParenthesisExpressions(CSharpParser.ParenthesisExpressionsContext ctx) {
        super.exitParenthesisExpressions(ctx);
    }

    @Override
    public void enterMemberAccessExpression(CSharpParser.MemberAccessExpressionContext ctx) {
        super.enterMemberAccessExpression(ctx);
    }

    @Override
    public void exitMemberAccessExpression(CSharpParser.MemberAccessExpressionContext ctx) {
        super.exitMemberAccessExpression(ctx);
    }

    @Override
    public void enterLiteralAccessExpression(CSharpParser.LiteralAccessExpressionContext ctx) {
        super.enterLiteralAccessExpression(ctx);
    }

    @Override
    public void exitLiteralAccessExpression(CSharpParser.LiteralAccessExpressionContext ctx) {
        super.exitLiteralAccessExpression(ctx);
    }

    @Override
    public void enterThisReferenceExpression(CSharpParser.ThisReferenceExpressionContext ctx) {
        super.enterThisReferenceExpression(ctx);
    }

    @Override
    public void exitThisReferenceExpression(CSharpParser.ThisReferenceExpressionContext ctx) {
        super.exitThisReferenceExpression(ctx);
    }

    @Override
    public void enterBaseAccessExpression(CSharpParser.BaseAccessExpressionContext ctx) {
        super.enterBaseAccessExpression(ctx);
    }

    @Override
    public void exitBaseAccessExpression(CSharpParser.BaseAccessExpressionContext ctx) {
        super.exitBaseAccessExpression(ctx);
    }

    @Override
    public void enterObjectCreationExpression(CSharpParser.ObjectCreationExpressionContext ctx) {
        super.enterObjectCreationExpression(ctx);
    }

    @Override
    public void exitObjectCreationExpression(CSharpParser.ObjectCreationExpressionContext ctx) {
        super.exitObjectCreationExpression(ctx);
    }

    @Override
    public void enterTupleExpression(CSharpParser.TupleExpressionContext ctx) {
        super.enterTupleExpression(ctx);
    }

    @Override
    public void exitTupleExpression(CSharpParser.TupleExpressionContext ctx) {
        super.exitTupleExpression(ctx);
    }

    @Override
    public void enterTypeofExpression(CSharpParser.TypeofExpressionContext ctx) {
        super.enterTypeofExpression(ctx);
    }

    @Override
    public void exitTypeofExpression(CSharpParser.TypeofExpressionContext ctx) {
        super.exitTypeofExpression(ctx);
    }

    @Override
    public void enterCheckedExpression(CSharpParser.CheckedExpressionContext ctx) {
        super.enterCheckedExpression(ctx);
    }

    @Override
    public void exitCheckedExpression(CSharpParser.CheckedExpressionContext ctx) {
        super.exitCheckedExpression(ctx);
    }

    @Override
    public void enterUncheckedExpression(CSharpParser.UncheckedExpressionContext ctx) {
        super.enterUncheckedExpression(ctx);
    }

    @Override
    public void exitUncheckedExpression(CSharpParser.UncheckedExpressionContext ctx) {
        super.exitUncheckedExpression(ctx);
    }

    @Override
    public void enterDefaultValueExpression(CSharpParser.DefaultValueExpressionContext ctx) {
        super.enterDefaultValueExpression(ctx);
    }

    @Override
    public void exitDefaultValueExpression(CSharpParser.DefaultValueExpressionContext ctx) {
        super.exitDefaultValueExpression(ctx);
    }

    @Override
    public void enterAnonymousMethodExpression(CSharpParser.AnonymousMethodExpressionContext ctx) {
        super.enterAnonymousMethodExpression(ctx);
    }

    @Override
    public void exitAnonymousMethodExpression(CSharpParser.AnonymousMethodExpressionContext ctx) {
        super.exitAnonymousMethodExpression(ctx);
    }

    @Override
    public void enterSizeofExpression(CSharpParser.SizeofExpressionContext ctx) {
        super.enterSizeofExpression(ctx);
    }

    @Override
    public void exitSizeofExpression(CSharpParser.SizeofExpressionContext ctx) {
        super.exitSizeofExpression(ctx);
    }

    @Override
    public void enterNameofExpression(CSharpParser.NameofExpressionContext ctx) {
        super.enterNameofExpression(ctx);
    }

    @Override
    public void exitNameofExpression(CSharpParser.NameofExpressionContext ctx) {
        super.exitNameofExpression(ctx);
    }

    @Override
    public void enterThrowable_expression(CSharpParser.Throwable_expressionContext ctx) {
        super.enterThrowable_expression(ctx);
    }

    @Override
    public void exitThrowable_expression(CSharpParser.Throwable_expressionContext ctx) {
        super.exitThrowable_expression(ctx);
    }

    @Override
    public void enterThrow_expression(CSharpParser.Throw_expressionContext ctx) {
        super.enterThrow_expression(ctx);
    }

    @Override
    public void exitThrow_expression(CSharpParser.Throw_expressionContext ctx) {
        super.exitThrow_expression(ctx);
    }

    @Override
    public void enterMember_access(CSharpParser.Member_accessContext ctx) {
        super.enterMember_access(ctx);
    }

    @Override
    public void exitMember_access(CSharpParser.Member_accessContext ctx) {
        super.exitMember_access(ctx);
    }

    @Override
    public void enterBracket_expression(CSharpParser.Bracket_expressionContext ctx) {
        super.enterBracket_expression(ctx);
    }

    @Override
    public void exitBracket_expression(CSharpParser.Bracket_expressionContext ctx) {
        super.exitBracket_expression(ctx);
    }

    @Override
    public void enterIndexer_argument(CSharpParser.Indexer_argumentContext ctx) {
        super.enterIndexer_argument(ctx);
    }

    @Override
    public void exitIndexer_argument(CSharpParser.Indexer_argumentContext ctx) {
        super.exitIndexer_argument(ctx);
    }

    @Override
    public void enterPredefined_type(CSharpParser.Predefined_typeContext ctx) {
        super.enterPredefined_type(ctx);
    }

    @Override
    public void exitPredefined_type(CSharpParser.Predefined_typeContext ctx) {
        super.exitPredefined_type(ctx);
    }

    @Override
    public void enterExpression_list(CSharpParser.Expression_listContext ctx) {
        super.enterExpression_list(ctx);
    }

    @Override
    public void exitExpression_list(CSharpParser.Expression_listContext ctx) {
        super.exitExpression_list(ctx);
    }

    @Override
    public void enterObject_or_collection_initializer(CSharpParser.Object_or_collection_initializerContext ctx) {
        super.enterObject_or_collection_initializer(ctx);
    }

    @Override
    public void exitObject_or_collection_initializer(CSharpParser.Object_or_collection_initializerContext ctx) {
        super.exitObject_or_collection_initializer(ctx);
    }

    @Override
    public void enterObject_initializer(CSharpParser.Object_initializerContext ctx) {
        super.enterObject_initializer(ctx);
    }

    @Override
    public void exitObject_initializer(CSharpParser.Object_initializerContext ctx) {
        super.exitObject_initializer(ctx);
    }

    @Override
    public void enterMember_initializer_list(CSharpParser.Member_initializer_listContext ctx) {
        super.enterMember_initializer_list(ctx);
    }

    @Override
    public void exitMember_initializer_list(CSharpParser.Member_initializer_listContext ctx) {
        super.exitMember_initializer_list(ctx);
    }

    @Override
    public void enterMember_initializer(CSharpParser.Member_initializerContext ctx) {
        super.enterMember_initializer(ctx);
    }

    @Override
    public void exitMember_initializer(CSharpParser.Member_initializerContext ctx) {
        super.exitMember_initializer(ctx);
    }

    @Override
    public void enterInitializer_value(CSharpParser.Initializer_valueContext ctx) {
        super.enterInitializer_value(ctx);
    }

    @Override
    public void exitInitializer_value(CSharpParser.Initializer_valueContext ctx) {
        super.exitInitializer_value(ctx);
    }

    @Override
    public void enterCollection_initializer(CSharpParser.Collection_initializerContext ctx) {
        super.enterCollection_initializer(ctx);
    }

    @Override
    public void exitCollection_initializer(CSharpParser.Collection_initializerContext ctx) {
        super.exitCollection_initializer(ctx);
    }

    @Override
    public void enterElement_initializer(CSharpParser.Element_initializerContext ctx) {
        super.enterElement_initializer(ctx);
    }

    @Override
    public void exitElement_initializer(CSharpParser.Element_initializerContext ctx) {
        super.exitElement_initializer(ctx);
    }

    @Override
    public void enterAnonymous_object_initializer(CSharpParser.Anonymous_object_initializerContext ctx) {
        super.enterAnonymous_object_initializer(ctx);
    }

    @Override
    public void exitAnonymous_object_initializer(CSharpParser.Anonymous_object_initializerContext ctx) {
        super.exitAnonymous_object_initializer(ctx);
    }

    @Override
    public void enterMember_declarator_list(CSharpParser.Member_declarator_listContext ctx) {
        super.enterMember_declarator_list(ctx);
    }

    @Override
    public void exitMember_declarator_list(CSharpParser.Member_declarator_listContext ctx) {
        super.exitMember_declarator_list(ctx);
    }

    @Override
    public void enterMember_declarator(CSharpParser.Member_declaratorContext ctx) {
        super.enterMember_declarator(ctx);
    }

    @Override
    public void exitMember_declarator(CSharpParser.Member_declaratorContext ctx) {
        super.exitMember_declarator(ctx);
    }

    @Override
    public void enterUnbound_type_name(CSharpParser.Unbound_type_nameContext ctx) {
        super.enterUnbound_type_name(ctx);
    }

    @Override
    public void exitUnbound_type_name(CSharpParser.Unbound_type_nameContext ctx) {
        super.exitUnbound_type_name(ctx);
    }

    @Override
    public void enterGeneric_dimension_specifier(CSharpParser.Generic_dimension_specifierContext ctx) {
        super.enterGeneric_dimension_specifier(ctx);
    }

    @Override
    public void exitGeneric_dimension_specifier(CSharpParser.Generic_dimension_specifierContext ctx) {
        super.exitGeneric_dimension_specifier(ctx);
    }

    @Override
    public void enterIsType(CSharpParser.IsTypeContext ctx) {
        super.enterIsType(ctx);
    }

    @Override
    public void exitIsType(CSharpParser.IsTypeContext ctx) {
        super.exitIsType(ctx);
    }

    @Override
    public void enterIsTypePatternArms(CSharpParser.IsTypePatternArmsContext ctx) {
        super.enterIsTypePatternArms(ctx);
    }

    @Override
    public void exitIsTypePatternArms(CSharpParser.IsTypePatternArmsContext ctx) {
        super.exitIsTypePatternArms(ctx);
    }

    @Override
    public void enterIsTypePatternArm(CSharpParser.IsTypePatternArmContext ctx) {
        super.enterIsTypePatternArm(ctx);
    }

    @Override
    public void exitIsTypePatternArm(CSharpParser.IsTypePatternArmContext ctx) {
        super.exitIsTypePatternArm(ctx);
    }

    @Override
    public void enterLambda_expression(CSharpParser.Lambda_expressionContext ctx) {
        super.enterLambda_expression(ctx);
    }

    @Override
    public void exitLambda_expression(CSharpParser.Lambda_expressionContext ctx) {
        super.exitLambda_expression(ctx);
    }

    @Override
    public void enterAnonymous_function_signature(CSharpParser.Anonymous_function_signatureContext ctx) {
        super.enterAnonymous_function_signature(ctx);
    }

    @Override
    public void exitAnonymous_function_signature(CSharpParser.Anonymous_function_signatureContext ctx) {
        super.exitAnonymous_function_signature(ctx);
    }

    @Override
    public void enterExplicit_anonymous_function_parameter_list(CSharpParser.Explicit_anonymous_function_parameter_listContext ctx) {
        super.enterExplicit_anonymous_function_parameter_list(ctx);
    }

    @Override
    public void exitExplicit_anonymous_function_parameter_list(CSharpParser.Explicit_anonymous_function_parameter_listContext ctx) {
        super.exitExplicit_anonymous_function_parameter_list(ctx);
    }

    @Override
    public void enterExplicit_anonymous_function_parameter(CSharpParser.Explicit_anonymous_function_parameterContext ctx) {
        super.enterExplicit_anonymous_function_parameter(ctx);
    }

    @Override
    public void exitExplicit_anonymous_function_parameter(CSharpParser.Explicit_anonymous_function_parameterContext ctx) {
        super.exitExplicit_anonymous_function_parameter(ctx);
    }

    @Override
    public void enterImplicit_anonymous_function_parameter_list(CSharpParser.Implicit_anonymous_function_parameter_listContext ctx) {
        super.enterImplicit_anonymous_function_parameter_list(ctx);
    }

    @Override
    public void exitImplicit_anonymous_function_parameter_list(CSharpParser.Implicit_anonymous_function_parameter_listContext ctx) {
        super.exitImplicit_anonymous_function_parameter_list(ctx);
    }

    @Override
    public void enterAnonymous_function_body(CSharpParser.Anonymous_function_bodyContext ctx) {
        super.enterAnonymous_function_body(ctx);
    }

    @Override
    public void exitAnonymous_function_body(CSharpParser.Anonymous_function_bodyContext ctx) {
        super.exitAnonymous_function_body(ctx);
    }

    @Override
    public void enterQuery_expression(CSharpParser.Query_expressionContext ctx) {
        super.enterQuery_expression(ctx);
    }

    @Override
    public void exitQuery_expression(CSharpParser.Query_expressionContext ctx) {
        super.exitQuery_expression(ctx);
    }

    @Override
    public void enterFrom_clause(CSharpParser.From_clauseContext ctx) {
        super.enterFrom_clause(ctx);
    }

    @Override
    public void exitFrom_clause(CSharpParser.From_clauseContext ctx) {
        super.exitFrom_clause(ctx);
    }

    @Override
    public void enterQuery_body(CSharpParser.Query_bodyContext ctx) {
        super.enterQuery_body(ctx);
    }

    @Override
    public void exitQuery_body(CSharpParser.Query_bodyContext ctx) {
        super.exitQuery_body(ctx);
    }

    @Override
    public void enterQuery_body_clause(CSharpParser.Query_body_clauseContext ctx) {
        super.enterQuery_body_clause(ctx);
    }

    @Override
    public void exitQuery_body_clause(CSharpParser.Query_body_clauseContext ctx) {
        super.exitQuery_body_clause(ctx);
    }

    @Override
    public void enterLet_clause(CSharpParser.Let_clauseContext ctx) {
        super.enterLet_clause(ctx);
    }

    @Override
    public void exitLet_clause(CSharpParser.Let_clauseContext ctx) {
        super.exitLet_clause(ctx);
    }

    @Override
    public void enterWhere_clause(CSharpParser.Where_clauseContext ctx) {
        super.enterWhere_clause(ctx);
    }

    @Override
    public void exitWhere_clause(CSharpParser.Where_clauseContext ctx) {
        super.exitWhere_clause(ctx);
    }

    @Override
    public void enterCombined_join_clause(CSharpParser.Combined_join_clauseContext ctx) {
        super.enterCombined_join_clause(ctx);
    }

    @Override
    public void exitCombined_join_clause(CSharpParser.Combined_join_clauseContext ctx) {
        super.exitCombined_join_clause(ctx);
    }

    @Override
    public void enterOrderby_clause(CSharpParser.Orderby_clauseContext ctx) {
        super.enterOrderby_clause(ctx);
    }

    @Override
    public void exitOrderby_clause(CSharpParser.Orderby_clauseContext ctx) {
        super.exitOrderby_clause(ctx);
    }

    @Override
    public void enterOrdering(CSharpParser.OrderingContext ctx) {
        super.enterOrdering(ctx);
    }

    @Override
    public void exitOrdering(CSharpParser.OrderingContext ctx) {
        super.exitOrdering(ctx);
    }

    @Override
    public void enterSelect_or_group_clause(CSharpParser.Select_or_group_clauseContext ctx) {
        super.enterSelect_or_group_clause(ctx);
    }

    @Override
    public void exitSelect_or_group_clause(CSharpParser.Select_or_group_clauseContext ctx) {
        super.exitSelect_or_group_clause(ctx);
    }

    @Override
    public void enterQuery_continuation(CSharpParser.Query_continuationContext ctx) {
        super.enterQuery_continuation(ctx);
    }

    @Override
    public void exitQuery_continuation(CSharpParser.Query_continuationContext ctx) {
        super.exitQuery_continuation(ctx);
    }

    @Override
    public void enterStatement(CSharpParser.StatementContext ctx) {
        super.enterStatement(ctx);
    }

    @Override
    public void exitStatement(CSharpParser.StatementContext ctx) {
        super.exitStatement(ctx);
    }

    @Override
    public void enterDeclarationStatement(CSharpParser.DeclarationStatementContext ctx) {
        super.enterDeclarationStatement(ctx);
    }

    @Override
    public void exitDeclarationStatement(CSharpParser.DeclarationStatementContext ctx) {
        super.exitDeclarationStatement(ctx);
    }

    @Override
    public void enterLocal_function_declaration(CSharpParser.Local_function_declarationContext ctx) {
        super.enterLocal_function_declaration(ctx);
    }

    @Override
    public void exitLocal_function_declaration(CSharpParser.Local_function_declarationContext ctx) {
        super.exitLocal_function_declaration(ctx);
    }

    @Override
    public void enterLocal_function_header(CSharpParser.Local_function_headerContext ctx) {
        super.enterLocal_function_header(ctx);
    }

    @Override
    public void exitLocal_function_header(CSharpParser.Local_function_headerContext ctx) {
        super.exitLocal_function_header(ctx);
    }

    @Override
    public void enterLocal_function_modifiers(CSharpParser.Local_function_modifiersContext ctx) {
        super.enterLocal_function_modifiers(ctx);
    }

    @Override
    public void exitLocal_function_modifiers(CSharpParser.Local_function_modifiersContext ctx) {
        super.exitLocal_function_modifiers(ctx);
    }

    @Override
    public void enterLocal_function_body(CSharpParser.Local_function_bodyContext ctx) {
        super.enterLocal_function_body(ctx);
    }

    @Override
    public void exitLocal_function_body(CSharpParser.Local_function_bodyContext ctx) {
        super.exitLocal_function_body(ctx);
    }

    @Override
    public void enterLabeled_Statement(CSharpParser.Labeled_StatementContext ctx) {
        super.enterLabeled_Statement(ctx);
    }

    @Override
    public void exitLabeled_Statement(CSharpParser.Labeled_StatementContext ctx) {
        super.exitLabeled_Statement(ctx);
    }

    @Override
    public void enterEmbedded_statement(CSharpParser.Embedded_statementContext ctx) {
        super.enterEmbedded_statement(ctx);
    }

    @Override
    public void exitEmbedded_statement(CSharpParser.Embedded_statementContext ctx) {
        super.exitEmbedded_statement(ctx);
    }

    @Override
    public void enterTheEmptyStatement(CSharpParser.TheEmptyStatementContext ctx) {
        super.enterTheEmptyStatement(ctx);
    }

    @Override
    public void exitTheEmptyStatement(CSharpParser.TheEmptyStatementContext ctx) {
        super.exitTheEmptyStatement(ctx);
    }

    @Override
    public void enterExpressionStatement(CSharpParser.ExpressionStatementContext ctx) {
        super.enterExpressionStatement(ctx);
    }

    @Override
    public void exitExpressionStatement(CSharpParser.ExpressionStatementContext ctx) {
        super.exitExpressionStatement(ctx);
    }

    @Override
    public void enterIfStatement(CSharpParser.IfStatementContext ctx) {
        super.enterIfStatement(ctx);
    }

    @Override
    public void exitIfStatement(CSharpParser.IfStatementContext ctx) {
        super.exitIfStatement(ctx);
    }

    @Override
    public void enterSwitchStatement(CSharpParser.SwitchStatementContext ctx) {
        super.enterSwitchStatement(ctx);
    }

    @Override
    public void exitSwitchStatement(CSharpParser.SwitchStatementContext ctx) {
        super.exitSwitchStatement(ctx);
    }

    @Override
    public void enterWhileStatement(CSharpParser.WhileStatementContext ctx) {
        super.enterWhileStatement(ctx);
    }

    @Override
    public void exitWhileStatement(CSharpParser.WhileStatementContext ctx) {
        super.exitWhileStatement(ctx);
    }

    @Override
    public void enterDoStatement(CSharpParser.DoStatementContext ctx) {
        super.enterDoStatement(ctx);
    }

    @Override
    public void exitDoStatement(CSharpParser.DoStatementContext ctx) {
        super.exitDoStatement(ctx);
    }

    @Override
    public void enterForStatement(CSharpParser.ForStatementContext ctx) {
        super.enterForStatement(ctx);
    }

    @Override
    public void exitForStatement(CSharpParser.ForStatementContext ctx) {
        super.exitForStatement(ctx);
    }

    @Override
    public void enterForeachStatement(CSharpParser.ForeachStatementContext ctx) {
        super.enterForeachStatement(ctx);
    }

    @Override
    public void exitForeachStatement(CSharpParser.ForeachStatementContext ctx) {
        super.exitForeachStatement(ctx);
    }

    @Override
    public void enterBreakStatement(CSharpParser.BreakStatementContext ctx) {
        super.enterBreakStatement(ctx);
    }

    @Override
    public void exitBreakStatement(CSharpParser.BreakStatementContext ctx) {
        super.exitBreakStatement(ctx);
    }

    @Override
    public void enterContinueStatement(CSharpParser.ContinueStatementContext ctx) {
        super.enterContinueStatement(ctx);
    }

    @Override
    public void exitContinueStatement(CSharpParser.ContinueStatementContext ctx) {
        super.exitContinueStatement(ctx);
    }

    @Override
    public void enterGotoStatement(CSharpParser.GotoStatementContext ctx) {
        super.enterGotoStatement(ctx);
    }

    @Override
    public void exitGotoStatement(CSharpParser.GotoStatementContext ctx) {
        super.exitGotoStatement(ctx);
    }

    @Override
    public void enterReturnStatement(CSharpParser.ReturnStatementContext ctx) {
        super.enterReturnStatement(ctx);
    }

    @Override
    public void exitReturnStatement(CSharpParser.ReturnStatementContext ctx) {
        super.exitReturnStatement(ctx);
    }

    @Override
    public void enterThrowStatement(CSharpParser.ThrowStatementContext ctx) {
        super.enterThrowStatement(ctx);
    }

    @Override
    public void exitThrowStatement(CSharpParser.ThrowStatementContext ctx) {
        super.exitThrowStatement(ctx);
    }

    @Override
    public void enterTryStatement(CSharpParser.TryStatementContext ctx) {
        super.enterTryStatement(ctx);
    }

    @Override
    public void exitTryStatement(CSharpParser.TryStatementContext ctx) {
        super.exitTryStatement(ctx);
    }

    @Override
    public void enterCheckedStatement(CSharpParser.CheckedStatementContext ctx) {
        super.enterCheckedStatement(ctx);
    }

    @Override
    public void exitCheckedStatement(CSharpParser.CheckedStatementContext ctx) {
        super.exitCheckedStatement(ctx);
    }

    @Override
    public void enterUncheckedStatement(CSharpParser.UncheckedStatementContext ctx) {
        super.enterUncheckedStatement(ctx);
    }

    @Override
    public void exitUncheckedStatement(CSharpParser.UncheckedStatementContext ctx) {
        super.exitUncheckedStatement(ctx);
    }

    @Override
    public void enterLockStatement(CSharpParser.LockStatementContext ctx) {
        super.enterLockStatement(ctx);
    }

    @Override
    public void exitLockStatement(CSharpParser.LockStatementContext ctx) {
        super.exitLockStatement(ctx);
    }

    @Override
    public void enterUsingStatement(CSharpParser.UsingStatementContext ctx) {
        super.enterUsingStatement(ctx);
    }

    @Override
    public void exitUsingStatement(CSharpParser.UsingStatementContext ctx) {
        super.exitUsingStatement(ctx);
    }

    @Override
    public void enterYieldStatement(CSharpParser.YieldStatementContext ctx) {
        super.enterYieldStatement(ctx);
    }

    @Override
    public void exitYieldStatement(CSharpParser.YieldStatementContext ctx) {
        super.exitYieldStatement(ctx);
    }

    @Override
    public void enterUnsafeStatement(CSharpParser.UnsafeStatementContext ctx) {
        super.enterUnsafeStatement(ctx);
    }

    @Override
    public void exitUnsafeStatement(CSharpParser.UnsafeStatementContext ctx) {
        super.exitUnsafeStatement(ctx);
    }

    @Override
    public void enterFixedStatement(CSharpParser.FixedStatementContext ctx) {
        super.enterFixedStatement(ctx);
    }

    @Override
    public void exitFixedStatement(CSharpParser.FixedStatementContext ctx) {
        super.exitFixedStatement(ctx);
    }

    @Override
    public void enterBlock(CSharpParser.BlockContext ctx) {
        super.enterBlock(ctx);
    }

    @Override
    public void exitBlock(CSharpParser.BlockContext ctx) {
        super.exitBlock(ctx);
    }

    @Override
    public void enterLocal_variable_declaration(CSharpParser.Local_variable_declarationContext ctx) {
        super.enterLocal_variable_declaration(ctx);
    }

    @Override
    public void exitLocal_variable_declaration(CSharpParser.Local_variable_declarationContext ctx) {
        super.exitLocal_variable_declaration(ctx);
    }

    @Override
    public void enterLocal_variable_type(CSharpParser.Local_variable_typeContext ctx) {
        super.enterLocal_variable_type(ctx);
    }

    @Override
    public void exitLocal_variable_type(CSharpParser.Local_variable_typeContext ctx) {
        super.exitLocal_variable_type(ctx);
    }

    @Override
    public void enterLocal_variable_declarator(CSharpParser.Local_variable_declaratorContext ctx) {
        super.enterLocal_variable_declarator(ctx);
    }

    @Override
    public void exitLocal_variable_declarator(CSharpParser.Local_variable_declaratorContext ctx) {
        super.exitLocal_variable_declarator(ctx);
    }

    @Override
    public void enterLocal_variable_initializer(CSharpParser.Local_variable_initializerContext ctx) {
        super.enterLocal_variable_initializer(ctx);
    }

    @Override
    public void exitLocal_variable_initializer(CSharpParser.Local_variable_initializerContext ctx) {
        super.exitLocal_variable_initializer(ctx);
    }

    @Override
    public void enterLocal_constant_declaration(CSharpParser.Local_constant_declarationContext ctx) {
        super.enterLocal_constant_declaration(ctx);
    }

    @Override
    public void exitLocal_constant_declaration(CSharpParser.Local_constant_declarationContext ctx) {
        super.exitLocal_constant_declaration(ctx);
    }

    @Override
    public void enterIf_body(CSharpParser.If_bodyContext ctx) {
        super.enterIf_body(ctx);
    }

    @Override
    public void exitIf_body(CSharpParser.If_bodyContext ctx) {
        super.exitIf_body(ctx);
    }

    @Override
    public void enterSwitch_section(CSharpParser.Switch_sectionContext ctx) {
        super.enterSwitch_section(ctx);
    }

    @Override
    public void exitSwitch_section(CSharpParser.Switch_sectionContext ctx) {
        super.exitSwitch_section(ctx);
    }

    @Override
    public void enterSwitch_label(CSharpParser.Switch_labelContext ctx) {
        super.enterSwitch_label(ctx);
    }

    @Override
    public void exitSwitch_label(CSharpParser.Switch_labelContext ctx) {
        super.exitSwitch_label(ctx);
    }

    @Override
    public void enterCase_guard(CSharpParser.Case_guardContext ctx) {
        super.enterCase_guard(ctx);
    }

    @Override
    public void exitCase_guard(CSharpParser.Case_guardContext ctx) {
        super.exitCase_guard(ctx);
    }

    @Override
    public void enterStatement_list(CSharpParser.Statement_listContext ctx) {
        super.enterStatement_list(ctx);
    }

    @Override
    public void exitStatement_list(CSharpParser.Statement_listContext ctx) {
        super.exitStatement_list(ctx);
    }

    @Override
    public void enterFor_initializer(CSharpParser.For_initializerContext ctx) {
        super.enterFor_initializer(ctx);
    }

    @Override
    public void exitFor_initializer(CSharpParser.For_initializerContext ctx) {
        super.exitFor_initializer(ctx);
    }

    @Override
    public void enterFor_iterator(CSharpParser.For_iteratorContext ctx) {
        super.enterFor_iterator(ctx);
    }

    @Override
    public void exitFor_iterator(CSharpParser.For_iteratorContext ctx) {
        super.exitFor_iterator(ctx);
    }

    @Override
    public void enterCatch_clauses(CSharpParser.Catch_clausesContext ctx) {
        super.enterCatch_clauses(ctx);
    }

    @Override
    public void exitCatch_clauses(CSharpParser.Catch_clausesContext ctx) {
        super.exitCatch_clauses(ctx);
    }

    @Override
    public void enterSpecific_catch_clause(CSharpParser.Specific_catch_clauseContext ctx) {
        super.enterSpecific_catch_clause(ctx);
    }

    @Override
    public void exitSpecific_catch_clause(CSharpParser.Specific_catch_clauseContext ctx) {
        super.exitSpecific_catch_clause(ctx);
    }

    @Override
    public void enterGeneral_catch_clause(CSharpParser.General_catch_clauseContext ctx) {
        super.enterGeneral_catch_clause(ctx);
    }

    @Override
    public void exitGeneral_catch_clause(CSharpParser.General_catch_clauseContext ctx) {
        super.exitGeneral_catch_clause(ctx);
    }

    @Override
    public void enterException_filter(CSharpParser.Exception_filterContext ctx) {
        super.enterException_filter(ctx);
    }

    @Override
    public void exitException_filter(CSharpParser.Exception_filterContext ctx) {
        super.exitException_filter(ctx);
    }

    @Override
    public void enterFinally_clause(CSharpParser.Finally_clauseContext ctx) {
        super.enterFinally_clause(ctx);
    }

    @Override
    public void exitFinally_clause(CSharpParser.Finally_clauseContext ctx) {
        super.exitFinally_clause(ctx);
    }

    @Override
    public void enterResource_acquisition(CSharpParser.Resource_acquisitionContext ctx) {
        super.enterResource_acquisition(ctx);
    }

    @Override
    public void exitResource_acquisition(CSharpParser.Resource_acquisitionContext ctx) {
        super.exitResource_acquisition(ctx);
    }

    @Override
    public void enterNamespace_declaration(CSharpParser.Namespace_declarationContext ctx) {
        super.enterNamespace_declaration(ctx);
    }

    @Override
    public void exitNamespace_declaration(CSharpParser.Namespace_declarationContext ctx) {
        super.exitNamespace_declaration(ctx);
    }

    @Override
    public void enterQualified_identifier(CSharpParser.Qualified_identifierContext ctx) {
        super.enterQualified_identifier(ctx);
    }

    @Override
    public void exitQualified_identifier(CSharpParser.Qualified_identifierContext ctx) {
        super.exitQualified_identifier(ctx);
    }

    @Override
    public void enterNamespace_body(CSharpParser.Namespace_bodyContext ctx) {
        super.enterNamespace_body(ctx);
    }

    @Override
    public void exitNamespace_body(CSharpParser.Namespace_bodyContext ctx) {
        super.exitNamespace_body(ctx);
    }

    @Override
    public void enterExtern_alias_directives(CSharpParser.Extern_alias_directivesContext ctx) {
        super.enterExtern_alias_directives(ctx);
    }

    @Override
    public void exitExtern_alias_directives(CSharpParser.Extern_alias_directivesContext ctx) {
        super.exitExtern_alias_directives(ctx);
    }

    @Override
    public void enterExtern_alias_directive(CSharpParser.Extern_alias_directiveContext ctx) {
        super.enterExtern_alias_directive(ctx);
    }

    @Override
    public void exitExtern_alias_directive(CSharpParser.Extern_alias_directiveContext ctx) {
        super.exitExtern_alias_directive(ctx);
    }

    @Override
    public void enterUsing_directives(CSharpParser.Using_directivesContext ctx) {
        super.enterUsing_directives(ctx);
    }

    @Override
    public void exitUsing_directives(CSharpParser.Using_directivesContext ctx) {
        super.exitUsing_directives(ctx);
    }

    @Override
    public void enterUsingAliasDirective(CSharpParser.UsingAliasDirectiveContext ctx) {
        super.enterUsingAliasDirective(ctx);
    }

    @Override
    public void exitUsingAliasDirective(CSharpParser.UsingAliasDirectiveContext ctx) {
        super.exitUsingAliasDirective(ctx);
    }

    @Override
    public void enterUsingNamespaceDirective(CSharpParser.UsingNamespaceDirectiveContext ctx) {
        super.enterUsingNamespaceDirective(ctx);
    }

    @Override
    public void exitUsingNamespaceDirective(CSharpParser.UsingNamespaceDirectiveContext ctx) {
        super.exitUsingNamespaceDirective(ctx);
    }

    @Override
    public void enterUsingStaticDirective(CSharpParser.UsingStaticDirectiveContext ctx) {
        super.enterUsingStaticDirective(ctx);
    }

    @Override
    public void exitUsingStaticDirective(CSharpParser.UsingStaticDirectiveContext ctx) {
        super.exitUsingStaticDirective(ctx);
    }

    @Override
    public void enterNamespace_member_declarations(CSharpParser.Namespace_member_declarationsContext ctx) {
        super.enterNamespace_member_declarations(ctx);
    }

    @Override
    public void exitNamespace_member_declarations(CSharpParser.Namespace_member_declarationsContext ctx) {
        super.exitNamespace_member_declarations(ctx);
    }

    @Override
    public void enterNamespace_member_declaration(CSharpParser.Namespace_member_declarationContext ctx) {
        super.enterNamespace_member_declaration(ctx);
    }

    @Override
    public void exitNamespace_member_declaration(CSharpParser.Namespace_member_declarationContext ctx) {
        super.exitNamespace_member_declaration(ctx);
    }

    @Override
    public void enterType_declaration(CSharpParser.Type_declarationContext ctx) {
        super.enterType_declaration(ctx);
    }

    @Override
    public void exitType_declaration(CSharpParser.Type_declarationContext ctx) {
        super.exitType_declaration(ctx);
    }

    @Override
    public void enterQualified_alias_member(CSharpParser.Qualified_alias_memberContext ctx) {
        super.enterQualified_alias_member(ctx);
    }

    @Override
    public void exitQualified_alias_member(CSharpParser.Qualified_alias_memberContext ctx) {
        super.exitQualified_alias_member(ctx);
    }

    @Override
    public void enterType_parameter_list(CSharpParser.Type_parameter_listContext ctx) {
        super.enterType_parameter_list(ctx);
    }

    @Override
    public void exitType_parameter_list(CSharpParser.Type_parameter_listContext ctx) {
        super.exitType_parameter_list(ctx);
    }

    @Override
    public void enterType_parameter(CSharpParser.Type_parameterContext ctx) {
        super.enterType_parameter(ctx);
    }

    @Override
    public void exitType_parameter(CSharpParser.Type_parameterContext ctx) {
        super.exitType_parameter(ctx);
    }

    @Override
    public void enterClass_base(CSharpParser.Class_baseContext ctx) {
        super.enterClass_base(ctx);
    }

    @Override
    public void exitClass_base(CSharpParser.Class_baseContext ctx) {
        super.exitClass_base(ctx);
    }

    @Override
    public void enterInterface_type_list(CSharpParser.Interface_type_listContext ctx) {
        super.enterInterface_type_list(ctx);
    }

    @Override
    public void exitInterface_type_list(CSharpParser.Interface_type_listContext ctx) {
        super.exitInterface_type_list(ctx);
    }

    @Override
    public void enterType_parameter_constraints_clauses(CSharpParser.Type_parameter_constraints_clausesContext ctx) {
        super.enterType_parameter_constraints_clauses(ctx);
    }

    @Override
    public void exitType_parameter_constraints_clauses(CSharpParser.Type_parameter_constraints_clausesContext ctx) {
        super.exitType_parameter_constraints_clauses(ctx);
    }

    @Override
    public void enterType_parameter_constraints_clause(CSharpParser.Type_parameter_constraints_clauseContext ctx) {
        super.enterType_parameter_constraints_clause(ctx);
    }

    @Override
    public void exitType_parameter_constraints_clause(CSharpParser.Type_parameter_constraints_clauseContext ctx) {
        super.exitType_parameter_constraints_clause(ctx);
    }

    @Override
    public void enterType_parameter_constraints(CSharpParser.Type_parameter_constraintsContext ctx) {
        super.enterType_parameter_constraints(ctx);
    }

    @Override
    public void exitType_parameter_constraints(CSharpParser.Type_parameter_constraintsContext ctx) {
        super.exitType_parameter_constraints(ctx);
    }

    @Override
    public void enterPrimary_constraint(CSharpParser.Primary_constraintContext ctx) {
        super.enterPrimary_constraint(ctx);
    }

    @Override
    public void exitPrimary_constraint(CSharpParser.Primary_constraintContext ctx) {
        super.exitPrimary_constraint(ctx);
    }

    @Override
    public void enterSecondary_constraints(CSharpParser.Secondary_constraintsContext ctx) {
        super.enterSecondary_constraints(ctx);
    }

    @Override
    public void exitSecondary_constraints(CSharpParser.Secondary_constraintsContext ctx) {
        super.exitSecondary_constraints(ctx);
    }

    @Override
    public void enterConstructor_constraint(CSharpParser.Constructor_constraintContext ctx) {
        super.enterConstructor_constraint(ctx);
    }

    @Override
    public void exitConstructor_constraint(CSharpParser.Constructor_constraintContext ctx) {
        super.exitConstructor_constraint(ctx);
    }

    @Override
    public void enterClass_body(CSharpParser.Class_bodyContext ctx) {
        super.enterClass_body(ctx);
    }

    @Override
    public void exitClass_body(CSharpParser.Class_bodyContext ctx) {
        super.exitClass_body(ctx);
    }

    @Override
    public void enterClass_member_declarations(CSharpParser.Class_member_declarationsContext ctx) {
        super.enterClass_member_declarations(ctx);
    }

    @Override
    public void exitClass_member_declarations(CSharpParser.Class_member_declarationsContext ctx) {
        super.exitClass_member_declarations(ctx);
    }

    @Override
    public void enterClass_member_declaration(CSharpParser.Class_member_declarationContext ctx) {
        super.enterClass_member_declaration(ctx);
    }

    @Override
    public void exitClass_member_declaration(CSharpParser.Class_member_declarationContext ctx) {
        super.exitClass_member_declaration(ctx);
    }

    @Override
    public void enterAll_member_modifiers(CSharpParser.All_member_modifiersContext ctx) {
        super.enterAll_member_modifiers(ctx);
    }

    @Override
    public void exitAll_member_modifiers(CSharpParser.All_member_modifiersContext ctx) {
        super.exitAll_member_modifiers(ctx);
    }

    @Override
    public void enterAll_member_modifier(CSharpParser.All_member_modifierContext ctx) {
        super.enterAll_member_modifier(ctx);
    }

    @Override
    public void exitAll_member_modifier(CSharpParser.All_member_modifierContext ctx) {
        super.exitAll_member_modifier(ctx);
    }

    @Override
    public void enterCommon_member_declaration(CSharpParser.Common_member_declarationContext ctx) {
        super.enterCommon_member_declaration(ctx);
    }

    @Override
    public void exitCommon_member_declaration(CSharpParser.Common_member_declarationContext ctx) {
        super.exitCommon_member_declaration(ctx);
    }

    @Override
    public void enterTyped_member_declaration(CSharpParser.Typed_member_declarationContext ctx) {
        super.enterTyped_member_declaration(ctx);
    }

    @Override
    public void exitTyped_member_declaration(CSharpParser.Typed_member_declarationContext ctx) {
        super.exitTyped_member_declaration(ctx);
    }

    @Override
    public void enterConstant_declarators(CSharpParser.Constant_declaratorsContext ctx) {
        super.enterConstant_declarators(ctx);
    }

    @Override
    public void exitConstant_declarators(CSharpParser.Constant_declaratorsContext ctx) {
        super.exitConstant_declarators(ctx);
    }

    @Override
    public void enterConstant_declarator(CSharpParser.Constant_declaratorContext ctx) {
        super.enterConstant_declarator(ctx);
    }

    @Override
    public void exitConstant_declarator(CSharpParser.Constant_declaratorContext ctx) {
        super.exitConstant_declarator(ctx);
    }

    @Override
    public void enterVariable_declarators(CSharpParser.Variable_declaratorsContext ctx) {
        super.enterVariable_declarators(ctx);
    }

    @Override
    public void exitVariable_declarators(CSharpParser.Variable_declaratorsContext ctx) {
        super.exitVariable_declarators(ctx);
    }

    @Override
    public void enterVariable_declarator(CSharpParser.Variable_declaratorContext ctx) {
        super.enterVariable_declarator(ctx);
    }

    @Override
    public void exitVariable_declarator(CSharpParser.Variable_declaratorContext ctx) {
        super.exitVariable_declarator(ctx);
    }

    @Override
    public void enterVariable_initializer(CSharpParser.Variable_initializerContext ctx) {
        super.enterVariable_initializer(ctx);
    }

    @Override
    public void exitVariable_initializer(CSharpParser.Variable_initializerContext ctx) {
        super.exitVariable_initializer(ctx);
    }

    @Override
    public void enterReturn_type(CSharpParser.Return_typeContext ctx) {
        super.enterReturn_type(ctx);
    }

    @Override
    public void exitReturn_type(CSharpParser.Return_typeContext ctx) {
        super.exitReturn_type(ctx);
    }

    @Override
    public void enterMember_name(CSharpParser.Member_nameContext ctx) {
        super.enterMember_name(ctx);
    }

    @Override
    public void exitMember_name(CSharpParser.Member_nameContext ctx) {
        super.exitMember_name(ctx);
    }

    @Override
    public void enterMethod_body(CSharpParser.Method_bodyContext ctx) {
        super.enterMethod_body(ctx);
    }

    @Override
    public void exitMethod_body(CSharpParser.Method_bodyContext ctx) {
        super.exitMethod_body(ctx);
    }

    @Override
    public void enterFormal_parameter_list(CSharpParser.Formal_parameter_listContext ctx) {
        super.enterFormal_parameter_list(ctx);
    }

    @Override
    public void exitFormal_parameter_list(CSharpParser.Formal_parameter_listContext ctx) {
        super.exitFormal_parameter_list(ctx);
    }

    @Override
    public void enterFixed_parameters(CSharpParser.Fixed_parametersContext ctx) {
        super.enterFixed_parameters(ctx);
    }

    @Override
    public void exitFixed_parameters(CSharpParser.Fixed_parametersContext ctx) {
        super.exitFixed_parameters(ctx);
    }

    @Override
    public void enterFixed_parameter(CSharpParser.Fixed_parameterContext ctx) {
        super.enterFixed_parameter(ctx);
    }

    @Override
    public void exitFixed_parameter(CSharpParser.Fixed_parameterContext ctx) {
        super.exitFixed_parameter(ctx);
    }

    @Override
    public void enterParameter_modifier(CSharpParser.Parameter_modifierContext ctx) {
        super.enterParameter_modifier(ctx);
    }

    @Override
    public void exitParameter_modifier(CSharpParser.Parameter_modifierContext ctx) {
        super.exitParameter_modifier(ctx);
    }

    @Override
    public void enterParameter_array(CSharpParser.Parameter_arrayContext ctx) {
        super.enterParameter_array(ctx);
    }

    @Override
    public void exitParameter_array(CSharpParser.Parameter_arrayContext ctx) {
        super.exitParameter_array(ctx);
    }

    @Override
    public void enterAccessor_declarations(CSharpParser.Accessor_declarationsContext ctx) {
        super.enterAccessor_declarations(ctx);
    }

    @Override
    public void exitAccessor_declarations(CSharpParser.Accessor_declarationsContext ctx) {
        super.exitAccessor_declarations(ctx);
    }

    @Override
    public void enterGet_accessor_declaration(CSharpParser.Get_accessor_declarationContext ctx) {
        super.enterGet_accessor_declaration(ctx);
    }

    @Override
    public void exitGet_accessor_declaration(CSharpParser.Get_accessor_declarationContext ctx) {
        super.exitGet_accessor_declaration(ctx);
    }

    @Override
    public void enterSet_accessor_declaration(CSharpParser.Set_accessor_declarationContext ctx) {
        super.enterSet_accessor_declaration(ctx);
    }

    @Override
    public void exitSet_accessor_declaration(CSharpParser.Set_accessor_declarationContext ctx) {
        super.exitSet_accessor_declaration(ctx);
    }

    @Override
    public void enterAccessor_modifier(CSharpParser.Accessor_modifierContext ctx) {
        super.enterAccessor_modifier(ctx);
    }

    @Override
    public void exitAccessor_modifier(CSharpParser.Accessor_modifierContext ctx) {
        super.exitAccessor_modifier(ctx);
    }

    @Override
    public void enterAccessor_body(CSharpParser.Accessor_bodyContext ctx) {
        super.enterAccessor_body(ctx);
    }

    @Override
    public void exitAccessor_body(CSharpParser.Accessor_bodyContext ctx) {
        super.exitAccessor_body(ctx);
    }

    @Override
    public void enterEvent_accessor_declarations(CSharpParser.Event_accessor_declarationsContext ctx) {
        super.enterEvent_accessor_declarations(ctx);
    }

    @Override
    public void exitEvent_accessor_declarations(CSharpParser.Event_accessor_declarationsContext ctx) {
        super.exitEvent_accessor_declarations(ctx);
    }

    @Override
    public void enterAdd_accessor_declaration(CSharpParser.Add_accessor_declarationContext ctx) {
        super.enterAdd_accessor_declaration(ctx);
    }

    @Override
    public void exitAdd_accessor_declaration(CSharpParser.Add_accessor_declarationContext ctx) {
        super.exitAdd_accessor_declaration(ctx);
    }

    @Override
    public void enterRemove_accessor_declaration(CSharpParser.Remove_accessor_declarationContext ctx) {
        super.enterRemove_accessor_declaration(ctx);
    }

    @Override
    public void exitRemove_accessor_declaration(CSharpParser.Remove_accessor_declarationContext ctx) {
        super.exitRemove_accessor_declaration(ctx);
    }

    @Override
    public void enterOverloadable_operator(CSharpParser.Overloadable_operatorContext ctx) {
        super.enterOverloadable_operator(ctx);
    }

    @Override
    public void exitOverloadable_operator(CSharpParser.Overloadable_operatorContext ctx) {
        super.exitOverloadable_operator(ctx);
    }

    @Override
    public void enterConversion_operator_declarator(CSharpParser.Conversion_operator_declaratorContext ctx) {
        super.enterConversion_operator_declarator(ctx);
    }

    @Override
    public void exitConversion_operator_declarator(CSharpParser.Conversion_operator_declaratorContext ctx) {
        super.exitConversion_operator_declarator(ctx);
    }

    @Override
    public void enterConstructor_initializer(CSharpParser.Constructor_initializerContext ctx) {
        super.enterConstructor_initializer(ctx);
    }

    @Override
    public void exitConstructor_initializer(CSharpParser.Constructor_initializerContext ctx) {
        super.exitConstructor_initializer(ctx);
    }

    @Override
    public void enterBody(CSharpParser.BodyContext ctx) {
        super.enterBody(ctx);
    }

    @Override
    public void exitBody(CSharpParser.BodyContext ctx) {
        super.exitBody(ctx);
    }

    @Override
    public void enterStruct_interfaces(CSharpParser.Struct_interfacesContext ctx) {
        super.enterStruct_interfaces(ctx);
    }

    @Override
    public void exitStruct_interfaces(CSharpParser.Struct_interfacesContext ctx) {
        super.exitStruct_interfaces(ctx);
    }

    @Override
    public void enterStruct_body(CSharpParser.Struct_bodyContext ctx) {
        super.enterStruct_body(ctx);
    }

    @Override
    public void exitStruct_body(CSharpParser.Struct_bodyContext ctx) {
        super.exitStruct_body(ctx);
    }

    @Override
    public void enterStruct_member_declaration(CSharpParser.Struct_member_declarationContext ctx) {
        super.enterStruct_member_declaration(ctx);
    }

    @Override
    public void exitStruct_member_declaration(CSharpParser.Struct_member_declarationContext ctx) {
        super.exitStruct_member_declaration(ctx);
    }

    @Override
    public void enterArray_type(CSharpParser.Array_typeContext ctx) {
        super.enterArray_type(ctx);
    }

    @Override
    public void exitArray_type(CSharpParser.Array_typeContext ctx) {
        super.exitArray_type(ctx);
    }

    @Override
    public void enterRank_specifier(CSharpParser.Rank_specifierContext ctx) {
        super.enterRank_specifier(ctx);
    }

    @Override
    public void exitRank_specifier(CSharpParser.Rank_specifierContext ctx) {
        super.exitRank_specifier(ctx);
    }

    @Override
    public void enterArray_initializer(CSharpParser.Array_initializerContext ctx) {
        super.enterArray_initializer(ctx);
    }

    @Override
    public void exitArray_initializer(CSharpParser.Array_initializerContext ctx) {
        super.exitArray_initializer(ctx);
    }

    @Override
    public void enterVariant_type_parameter_list(CSharpParser.Variant_type_parameter_listContext ctx) {
        super.enterVariant_type_parameter_list(ctx);
    }

    @Override
    public void exitVariant_type_parameter_list(CSharpParser.Variant_type_parameter_listContext ctx) {
        super.exitVariant_type_parameter_list(ctx);
    }

    @Override
    public void enterVariant_type_parameter(CSharpParser.Variant_type_parameterContext ctx) {
        super.enterVariant_type_parameter(ctx);
    }

    @Override
    public void exitVariant_type_parameter(CSharpParser.Variant_type_parameterContext ctx) {
        super.exitVariant_type_parameter(ctx);
    }

    @Override
    public void enterVariance_annotation(CSharpParser.Variance_annotationContext ctx) {
        super.enterVariance_annotation(ctx);
    }

    @Override
    public void exitVariance_annotation(CSharpParser.Variance_annotationContext ctx) {
        super.exitVariance_annotation(ctx);
    }

    @Override
    public void enterInterface_base(CSharpParser.Interface_baseContext ctx) {
        super.enterInterface_base(ctx);
    }

    @Override
    public void exitInterface_base(CSharpParser.Interface_baseContext ctx) {
        super.exitInterface_base(ctx);
    }

    @Override
    public void enterInterface_body(CSharpParser.Interface_bodyContext ctx) {
        super.enterInterface_body(ctx);
    }

    @Override
    public void exitInterface_body(CSharpParser.Interface_bodyContext ctx) {
        super.exitInterface_body(ctx);
    }

    @Override
    public void enterInterface_member_declaration(CSharpParser.Interface_member_declarationContext ctx) {
        super.enterInterface_member_declaration(ctx);
    }

    @Override
    public void exitInterface_member_declaration(CSharpParser.Interface_member_declarationContext ctx) {
        super.exitInterface_member_declaration(ctx);
    }

    @Override
    public void enterInterface_accessors(CSharpParser.Interface_accessorsContext ctx) {
        super.enterInterface_accessors(ctx);
    }

    @Override
    public void exitInterface_accessors(CSharpParser.Interface_accessorsContext ctx) {
        super.exitInterface_accessors(ctx);
    }

    @Override
    public void enterEnum_base(CSharpParser.Enum_baseContext ctx) {
        super.enterEnum_base(ctx);
    }

    @Override
    public void exitEnum_base(CSharpParser.Enum_baseContext ctx) {
        super.exitEnum_base(ctx);
    }

    @Override
    public void enterEnum_body(CSharpParser.Enum_bodyContext ctx) {
        super.enterEnum_body(ctx);
    }

    @Override
    public void exitEnum_body(CSharpParser.Enum_bodyContext ctx) {
        super.exitEnum_body(ctx);
    }

    @Override
    public void enterEnum_member_declaration(CSharpParser.Enum_member_declarationContext ctx) {
        super.enterEnum_member_declaration(ctx);
    }

    @Override
    public void exitEnum_member_declaration(CSharpParser.Enum_member_declarationContext ctx) {
        super.exitEnum_member_declaration(ctx);
    }

    @Override
    public void enterGlobal_attribute_section(CSharpParser.Global_attribute_sectionContext ctx) {
        super.enterGlobal_attribute_section(ctx);
    }

    @Override
    public void exitGlobal_attribute_section(CSharpParser.Global_attribute_sectionContext ctx) {
        super.exitGlobal_attribute_section(ctx);
    }

    @Override
    public void enterGlobal_attribute_target(CSharpParser.Global_attribute_targetContext ctx) {
        super.enterGlobal_attribute_target(ctx);
    }

    @Override
    public void exitGlobal_attribute_target(CSharpParser.Global_attribute_targetContext ctx) {
        super.exitGlobal_attribute_target(ctx);
    }

    @Override
    public void enterAttributes(CSharpParser.AttributesContext ctx) {
        super.enterAttributes(ctx);
    }

    @Override
    public void exitAttributes(CSharpParser.AttributesContext ctx) {
        super.exitAttributes(ctx);
    }

    @Override
    public void enterAttribute_section(CSharpParser.Attribute_sectionContext ctx) {
        super.enterAttribute_section(ctx);
    }

    @Override
    public void exitAttribute_section(CSharpParser.Attribute_sectionContext ctx) {
        super.exitAttribute_section(ctx);
    }

    @Override
    public void enterAttribute_target(CSharpParser.Attribute_targetContext ctx) {
        super.enterAttribute_target(ctx);
    }

    @Override
    public void exitAttribute_target(CSharpParser.Attribute_targetContext ctx) {
        super.exitAttribute_target(ctx);
    }

    @Override
    public void enterAttribute_list(CSharpParser.Attribute_listContext ctx) {
        super.enterAttribute_list(ctx);
    }

    @Override
    public void exitAttribute_list(CSharpParser.Attribute_listContext ctx) {
        super.exitAttribute_list(ctx);
    }

    @Override
    public void enterAttribute(CSharpParser.AttributeContext ctx) {
        super.enterAttribute(ctx);
    }

    @Override
    public void exitAttribute(CSharpParser.AttributeContext ctx) {
        super.exitAttribute(ctx);
    }

    @Override
    public void enterAttribute_argument(CSharpParser.Attribute_argumentContext ctx) {
        super.enterAttribute_argument(ctx);
    }

    @Override
    public void exitAttribute_argument(CSharpParser.Attribute_argumentContext ctx) {
        super.exitAttribute_argument(ctx);
    }

    @Override
    public void enterPointer_type(CSharpParser.Pointer_typeContext ctx) {
        super.enterPointer_type(ctx);
    }

    @Override
    public void exitPointer_type(CSharpParser.Pointer_typeContext ctx) {
        super.exitPointer_type(ctx);
    }

    @Override
    public void enterFixed_pointer_declarators(CSharpParser.Fixed_pointer_declaratorsContext ctx) {
        super.enterFixed_pointer_declarators(ctx);
    }

    @Override
    public void exitFixed_pointer_declarators(CSharpParser.Fixed_pointer_declaratorsContext ctx) {
        super.exitFixed_pointer_declarators(ctx);
    }

    @Override
    public void enterFixed_pointer_declarator(CSharpParser.Fixed_pointer_declaratorContext ctx) {
        super.enterFixed_pointer_declarator(ctx);
    }

    @Override
    public void exitFixed_pointer_declarator(CSharpParser.Fixed_pointer_declaratorContext ctx) {
        super.exitFixed_pointer_declarator(ctx);
    }

    @Override
    public void enterFixed_pointer_initializer(CSharpParser.Fixed_pointer_initializerContext ctx) {
        super.enterFixed_pointer_initializer(ctx);
    }

    @Override
    public void exitFixed_pointer_initializer(CSharpParser.Fixed_pointer_initializerContext ctx) {
        super.exitFixed_pointer_initializer(ctx);
    }

    @Override
    public void enterFixed_size_buffer_declarator(CSharpParser.Fixed_size_buffer_declaratorContext ctx) {
        super.enterFixed_size_buffer_declarator(ctx);
    }

    @Override
    public void exitFixed_size_buffer_declarator(CSharpParser.Fixed_size_buffer_declaratorContext ctx) {
        super.exitFixed_size_buffer_declarator(ctx);
    }

    @Override
    public void enterStackalloc_initializer(CSharpParser.Stackalloc_initializerContext ctx) {
        super.enterStackalloc_initializer(ctx);
    }

    @Override
    public void exitStackalloc_initializer(CSharpParser.Stackalloc_initializerContext ctx) {
        super.exitStackalloc_initializer(ctx);
    }

    @Override
    public void enterRight_arrow(CSharpParser.Right_arrowContext ctx) {
        super.enterRight_arrow(ctx);
    }

    @Override
    public void exitRight_arrow(CSharpParser.Right_arrowContext ctx) {
        super.exitRight_arrow(ctx);
    }

    @Override
    public void enterRight_shift(CSharpParser.Right_shiftContext ctx) {
        super.enterRight_shift(ctx);
    }

    @Override
    public void exitRight_shift(CSharpParser.Right_shiftContext ctx) {
        super.exitRight_shift(ctx);
    }

    @Override
    public void enterRight_shift_assignment(CSharpParser.Right_shift_assignmentContext ctx) {
        super.enterRight_shift_assignment(ctx);
    }

    @Override
    public void exitRight_shift_assignment(CSharpParser.Right_shift_assignmentContext ctx) {
        super.exitRight_shift_assignment(ctx);
    }

    @Override
    public void enterLiteral(CSharpParser.LiteralContext ctx) {
        super.enterLiteral(ctx);
    }

    @Override
    public void exitLiteral(CSharpParser.LiteralContext ctx) {
        super.exitLiteral(ctx);
    }

    @Override
    public void enterBoolean_literal(CSharpParser.Boolean_literalContext ctx) {
        super.enterBoolean_literal(ctx);
    }

    @Override
    public void exitBoolean_literal(CSharpParser.Boolean_literalContext ctx) {
        super.exitBoolean_literal(ctx);
    }

    @Override
    public void enterString_literal(CSharpParser.String_literalContext ctx) {
        super.enterString_literal(ctx);
    }

    @Override
    public void exitString_literal(CSharpParser.String_literalContext ctx) {
        super.exitString_literal(ctx);
    }

    @Override
    public void enterInterpolated_regular_string(CSharpParser.Interpolated_regular_stringContext ctx) {
        super.enterInterpolated_regular_string(ctx);
    }

    @Override
    public void exitInterpolated_regular_string(CSharpParser.Interpolated_regular_stringContext ctx) {
        super.exitInterpolated_regular_string(ctx);
    }

    @Override
    public void enterInterpolated_verbatium_string(CSharpParser.Interpolated_verbatium_stringContext ctx) {
        super.enterInterpolated_verbatium_string(ctx);
    }

    @Override
    public void exitInterpolated_verbatium_string(CSharpParser.Interpolated_verbatium_stringContext ctx) {
        super.exitInterpolated_verbatium_string(ctx);
    }

    @Override
    public void enterInterpolated_regular_string_part(CSharpParser.Interpolated_regular_string_partContext ctx) {
        super.enterInterpolated_regular_string_part(ctx);
    }

    @Override
    public void exitInterpolated_regular_string_part(CSharpParser.Interpolated_regular_string_partContext ctx) {
        super.exitInterpolated_regular_string_part(ctx);
    }

    @Override
    public void enterInterpolated_verbatium_string_part(CSharpParser.Interpolated_verbatium_string_partContext ctx) {
        super.enterInterpolated_verbatium_string_part(ctx);
    }

    @Override
    public void exitInterpolated_verbatium_string_part(CSharpParser.Interpolated_verbatium_string_partContext ctx) {
        super.exitInterpolated_verbatium_string_part(ctx);
    }

    @Override
    public void enterInterpolated_string_expression(CSharpParser.Interpolated_string_expressionContext ctx) {
        super.enterInterpolated_string_expression(ctx);
    }

    @Override
    public void exitInterpolated_string_expression(CSharpParser.Interpolated_string_expressionContext ctx) {
        super.exitInterpolated_string_expression(ctx);
    }

    @Override
    public void enterKeyword(CSharpParser.KeywordContext ctx) {
        super.enterKeyword(ctx);
    }

    @Override
    public void exitKeyword(CSharpParser.KeywordContext ctx) {
        super.exitKeyword(ctx);
    }

    @Override
    public void enterClass_definition(CSharpParser.Class_definitionContext ctx) {
        super.enterClass_definition(ctx);
    }

    @Override
    public void exitClass_definition(CSharpParser.Class_definitionContext ctx) {
        super.exitClass_definition(ctx);
    }

    @Override
    public void enterStruct_definition(CSharpParser.Struct_definitionContext ctx) {
        super.enterStruct_definition(ctx);
    }

    @Override
    public void exitStruct_definition(CSharpParser.Struct_definitionContext ctx) {
        super.exitStruct_definition(ctx);
    }

    @Override
    public void enterInterface_definition(CSharpParser.Interface_definitionContext ctx) {
        super.enterInterface_definition(ctx);
    }

    @Override
    public void exitInterface_definition(CSharpParser.Interface_definitionContext ctx) {
        super.exitInterface_definition(ctx);
    }

    @Override
    public void enterEnum_definition(CSharpParser.Enum_definitionContext ctx) {
        super.enterEnum_definition(ctx);
    }

    @Override
    public void exitEnum_definition(CSharpParser.Enum_definitionContext ctx) {
        super.exitEnum_definition(ctx);
    }

    @Override
    public void enterDelegate_definition(CSharpParser.Delegate_definitionContext ctx) {
        super.enterDelegate_definition(ctx);
    }

    @Override
    public void exitDelegate_definition(CSharpParser.Delegate_definitionContext ctx) {
        super.exitDelegate_definition(ctx);
    }

    @Override
    public void enterEvent_declaration(CSharpParser.Event_declarationContext ctx) {
        super.enterEvent_declaration(ctx);
    }

    @Override
    public void exitEvent_declaration(CSharpParser.Event_declarationContext ctx) {
        super.exitEvent_declaration(ctx);
    }

    @Override
    public void enterField_declaration(CSharpParser.Field_declarationContext ctx) {
        super.enterField_declaration(ctx);
    }

    @Override
    public void exitField_declaration(CSharpParser.Field_declarationContext ctx) {
        super.exitField_declaration(ctx);
    }

    @Override
    public void enterProperty_declaration(CSharpParser.Property_declarationContext ctx) {
        super.enterProperty_declaration(ctx);
    }

    @Override
    public void exitProperty_declaration(CSharpParser.Property_declarationContext ctx) {
        super.exitProperty_declaration(ctx);
    }

    @Override
    public void enterConstant_declaration(CSharpParser.Constant_declarationContext ctx) {
        super.enterConstant_declaration(ctx);
    }

    @Override
    public void exitConstant_declaration(CSharpParser.Constant_declarationContext ctx) {
        super.exitConstant_declaration(ctx);
    }

    @Override
    public void enterIndexer_declaration(CSharpParser.Indexer_declarationContext ctx) {
        super.enterIndexer_declaration(ctx);
    }

    @Override
    public void exitIndexer_declaration(CSharpParser.Indexer_declarationContext ctx) {
        super.exitIndexer_declaration(ctx);
    }

    @Override
    public void enterDestructor_definition(CSharpParser.Destructor_definitionContext ctx) {
        super.enterDestructor_definition(ctx);
    }

    @Override
    public void exitDestructor_definition(CSharpParser.Destructor_definitionContext ctx) {
        super.exitDestructor_definition(ctx);
    }

    @Override
    public void enterConstructor_declaration(CSharpParser.Constructor_declarationContext ctx) {
        super.enterConstructor_declaration(ctx);
    }

    @Override
    public void exitConstructor_declaration(CSharpParser.Constructor_declarationContext ctx) {
        super.exitConstructor_declaration(ctx);
    }

    @Override
    public void enterMethod_declaration(CSharpParser.Method_declarationContext ctx) {
        super.enterMethod_declaration(ctx);
    }

    @Override
    public void exitMethod_declaration(CSharpParser.Method_declarationContext ctx) {
        super.exitMethod_declaration(ctx);
    }

    @Override
    public void enterMethod_member_name(CSharpParser.Method_member_nameContext ctx) {
        super.enterMethod_member_name(ctx);
    }

    @Override
    public void exitMethod_member_name(CSharpParser.Method_member_nameContext ctx) {
        super.exitMethod_member_name(ctx);
    }

    @Override
    public void enterOperator_declaration(CSharpParser.Operator_declarationContext ctx) {
        super.enterOperator_declaration(ctx);
    }

    @Override
    public void exitOperator_declaration(CSharpParser.Operator_declarationContext ctx) {
        super.exitOperator_declaration(ctx);
    }

    @Override
    public void enterArg_declaration(CSharpParser.Arg_declarationContext ctx) {
        super.enterArg_declaration(ctx);
    }

    @Override
    public void exitArg_declaration(CSharpParser.Arg_declarationContext ctx) {
        super.exitArg_declaration(ctx);
    }

    @Override
    public void enterMethod_invocation(CSharpParser.Method_invocationContext ctx) {
        super.enterMethod_invocation(ctx);
    }

    @Override
    public void exitMethod_invocation(CSharpParser.Method_invocationContext ctx) {
        super.exitMethod_invocation(ctx);
    }

    @Override
    public void enterObject_creation_expression(CSharpParser.Object_creation_expressionContext ctx) {
        super.enterObject_creation_expression(ctx);
    }

    @Override
    public void exitObject_creation_expression(CSharpParser.Object_creation_expressionContext ctx) {
        super.exitObject_creation_expression(ctx);
    }

    @Override
    public void enterIdentifier(CSharpParser.IdentifierContext ctx) {
        super.enterIdentifier(ctx);
    }

    @Override
    public void exitIdentifier(CSharpParser.IdentifierContext ctx) {
        super.exitIdentifier(ctx);
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        super.enterEveryRule(ctx);
    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
        super.exitEveryRule(ctx);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        super.visitTerminal(node);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        super.visitErrorNode(node);
    }
}
