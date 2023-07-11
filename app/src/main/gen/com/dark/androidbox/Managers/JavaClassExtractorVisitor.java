// Generated from /home/darkengine/AndroidStudioProjects/AndroidBox/app/src/main/java/com/dark/androidbox/Managers/JavaClassExtractor.g4 by ANTLR 4.12.0
package com.dark.androidbox.Managers;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JavaClassExtractorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JavaClassExtractorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(JavaClassExtractorParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(JavaClassExtractorParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(JavaClassExtractorParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#classMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMember(JavaClassExtractorParser.ClassMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(JavaClassExtractorParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(JavaClassExtractorParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(JavaClassExtractorParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(JavaClassExtractorParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(JavaClassExtractorParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(JavaClassExtractorParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(JavaClassExtractorParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#modifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifiers(JavaClassExtractorParser.ModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(JavaClassExtractorParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(JavaClassExtractorParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(JavaClassExtractorParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link JavaClassExtractorParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(JavaClassExtractorParser.StatementContext ctx);
}