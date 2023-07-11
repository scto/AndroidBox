// Generated from /home/darkengine/AndroidStudioProjects/AndroidBox/app/src/main/java/com/dark/androidbox/Managers/JavaClassExtractor.g4 by ANTLR 4.12.0
package com.dark.androidbox.Managers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavaClassExtractorParser}.
 */
public interface JavaClassExtractorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(JavaClassExtractorParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(JavaClassExtractorParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(JavaClassExtractorParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(JavaClassExtractorParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(JavaClassExtractorParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(JavaClassExtractorParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(JavaClassExtractorParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(JavaClassExtractorParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavaClassExtractorParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavaClassExtractorParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavaClassExtractorParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavaClassExtractorParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(JavaClassExtractorParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(JavaClassExtractorParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(JavaClassExtractorParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(JavaClassExtractorParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(JavaClassExtractorParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(JavaClassExtractorParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(JavaClassExtractorParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(JavaClassExtractorParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(JavaClassExtractorParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(JavaClassExtractorParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void enterModifiers(JavaClassExtractorParser.ModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#modifiers}.
	 * @param ctx the parse tree
	 */
	void exitModifiers(JavaClassExtractorParser.ModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(JavaClassExtractorParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(JavaClassExtractorParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavaClassExtractorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavaClassExtractorParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(JavaClassExtractorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(JavaClassExtractorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavaClassExtractorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavaClassExtractorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavaClassExtractorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavaClassExtractorParser.StatementContext ctx);
}