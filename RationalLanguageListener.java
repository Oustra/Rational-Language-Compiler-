// Generated from RationalLanguage.g4 by ANTLR 4.13.1

    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RationalLanguageParser}.
 */
public interface RationalLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#calcul}.
	 * @param ctx the parse tree
	 */
	void enterCalcul(RationalLanguageParser.CalculContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#calcul}.
	 * @param ctx the parse tree
	 */
	void exitCalcul(RationalLanguageParser.CalculContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void enterFinInstruction(RationalLanguageParser.FinInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#finInstruction}.
	 * @param ctx the parse tree
	 */
	void exitFinInstruction(RationalLanguageParser.FinInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(RationalLanguageParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(RationalLanguageParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(RationalLanguageParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(RationalLanguageParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(RationalLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(RationalLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(RationalLanguageParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(RationalLanguageParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#rationnel}.
	 * @param ctx the parse tree
	 */
	void enterRationnel(RationalLanguageParser.RationnelContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#rationnel}.
	 * @param ctx the parse tree
	 */
	void exitRationnel(RationalLanguageParser.RationnelContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#booleen}.
	 * @param ctx the parse tree
	 */
	void enterBooleen(RationalLanguageParser.BooleenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#booleen}.
	 * @param ctx the parse tree
	 */
	void exitBooleen(RationalLanguageParser.BooleenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(RationalLanguageParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(RationalLanguageParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#exprC}.
	 * @param ctx the parse tree
	 */
	void enterExprC(RationalLanguageParser.ExprCContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#exprC}.
	 * @param ctx the parse tree
	 */
	void exitExprC(RationalLanguageParser.ExprCContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(RationalLanguageParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(RationalLanguageParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#expT}.
	 * @param ctx the parse tree
	 */
	void enterExpT(RationalLanguageParser.ExpTContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#expT}.
	 * @param ctx the parse tree
	 */
	void exitExpT(RationalLanguageParser.ExpTContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#terinary}.
	 * @param ctx the parse tree
	 */
	void enterTerinary(RationalLanguageParser.TerinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#terinary}.
	 * @param ctx the parse tree
	 */
	void exitTerinary(RationalLanguageParser.TerinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#boucle}.
	 * @param ctx the parse tree
	 */
	void enterBoucle(RationalLanguageParser.BoucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#boucle}.
	 * @param ctx the parse tree
	 */
	void exitBoucle(RationalLanguageParser.BoucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#blocInstructions}.
	 * @param ctx the parse tree
	 */
	void enterBlocInstructions(RationalLanguageParser.BlocInstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#blocInstructions}.
	 * @param ctx the parse tree
	 */
	void exitBlocInstructions(RationalLanguageParser.BlocInstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#finboucle}.
	 * @param ctx the parse tree
	 */
	void enterFinboucle(RationalLanguageParser.FinboucleContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#finboucle}.
	 * @param ctx the parse tree
	 */
	void exitFinboucle(RationalLanguageParser.FinboucleContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(RationalLanguageParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(RationalLanguageParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#expI}.
	 * @param ctx the parse tree
	 */
	void enterExpI(RationalLanguageParser.ExpIContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#expI}.
	 * @param ctx the parse tree
	 */
	void exitExpI(RationalLanguageParser.ExpIContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(RationalLanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(RationalLanguageParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectation(RationalLanguageParser.AffectationContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectation(RationalLanguageParser.AffectationContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#exprA}.
	 * @param ctx the parse tree
	 */
	void enterExprA(RationalLanguageParser.ExprAContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#exprA}.
	 * @param ctx the parse tree
	 */
	void exitExprA(RationalLanguageParser.ExprAContext ctx);
	/**
	 * Enter a parse tree produced by {@link RationalLanguageParser#afficher}.
	 * @param ctx the parse tree
	 */
	void enterAfficher(RationalLanguageParser.AfficherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RationalLanguageParser#afficher}.
	 * @param ctx the parse tree
	 */
	void exitAfficher(RationalLanguageParser.AfficherContext ctx);
}