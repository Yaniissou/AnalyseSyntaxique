// Generated from D:/Projets/AnalyseSyntaxique/src/antlr/ArrayOperations.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArrayOperationsParser}.
 */
public interface ArrayOperationsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArrayOperationsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ArrayOperationsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayOperationsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ArrayOperationsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleopinstruction}
	 * labeled alternative in {@link ArrayOperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterSimpleopinstruction(ArrayOperationsParser.SimpleopinstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleopinstruction}
	 * labeled alternative in {@link ArrayOperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitSimpleopinstruction(ArrayOperationsParser.SimpleopinstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vardeclinstruction}
	 * labeled alternative in {@link ArrayOperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVardeclinstruction(ArrayOperationsParser.VardeclinstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vardeclinstruction}
	 * labeled alternative in {@link ArrayOperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVardeclinstruction(ArrayOperationsParser.VardeclinstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectationinstruction}
	 * labeled alternative in {@link ArrayOperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterAffectationinstruction(ArrayOperationsParser.AffectationinstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectationinstruction}
	 * labeled alternative in {@link ArrayOperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitAffectationinstruction(ArrayOperationsParser.AffectationinstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varoutinstruction}
	 * labeled alternative in {@link ArrayOperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterVaroutinstruction(ArrayOperationsParser.VaroutinstructionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varoutinstruction}
	 * labeled alternative in {@link ArrayOperationsParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitVaroutinstruction(ArrayOperationsParser.VaroutinstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sum}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterSum(ArrayOperationsParser.SumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitSum(ArrayOperationsParser.SumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prod}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterProd(ArrayOperationsParser.ProdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prod}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitProd(ArrayOperationsParser.ProdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code max}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterMax(ArrayOperationsParser.MaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code max}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitMax(ArrayOperationsParser.MaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code min}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterMin(ArrayOperationsParser.MinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code min}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitMin(ArrayOperationsParser.MinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sort}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterSort(ArrayOperationsParser.SortContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sort}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitSort(ArrayOperationsParser.SortContext ctx);
	/**
	 * Enter a parse tree produced by the {@code med}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterMed(ArrayOperationsParser.MedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code med}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitMed(ArrayOperationsParser.MedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code secmin}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterSecmin(ArrayOperationsParser.SecminContext ctx);
	/**
	 * Exit a parse tree produced by the {@code secmin}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitSecmin(ArrayOperationsParser.SecminContext ctx);
	/**
	 * Enter a parse tree produced by the {@code secmax}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void enterSecmax(ArrayOperationsParser.SecmaxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code secmax}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 */
	void exitSecmax(ArrayOperationsParser.SecmaxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vararray}
	 * labeled alternative in {@link ArrayOperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVararray(ArrayOperationsParser.VararrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vararray}
	 * labeled alternative in {@link ArrayOperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVararray(ArrayOperationsParser.VararrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initvararray}
	 * labeled alternative in {@link ArrayOperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterInitvararray(ArrayOperationsParser.InitvararrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initvararray}
	 * labeled alternative in {@link ArrayOperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitInitvararray(ArrayOperationsParser.InitvararrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varint}
	 * labeled alternative in {@link ArrayOperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterVarint(ArrayOperationsParser.VarintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varint}
	 * labeled alternative in {@link ArrayOperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitVarint(ArrayOperationsParser.VarintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initvarint}
	 * labeled alternative in {@link ArrayOperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void enterInitvarint(ArrayOperationsParser.InitvarintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initvarint}
	 * labeled alternative in {@link ArrayOperationsParser#vardecl}.
	 * @param ctx the parse tree
	 */
	void exitInitvarint(ArrayOperationsParser.InitvarintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectsimpleop}
	 * labeled alternative in {@link ArrayOperationsParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectsimpleop(ArrayOperationsParser.AffectsimpleopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectsimpleop}
	 * labeled alternative in {@link ArrayOperationsParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectsimpleop(ArrayOperationsParser.AffectsimpleopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectarray}
	 * labeled alternative in {@link ArrayOperationsParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectarray(ArrayOperationsParser.AffectarrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectarray}
	 * labeled alternative in {@link ArrayOperationsParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectarray(ArrayOperationsParser.AffectarrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code affectint}
	 * labeled alternative in {@link ArrayOperationsParser#affectation}.
	 * @param ctx the parse tree
	 */
	void enterAffectint(ArrayOperationsParser.AffectintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code affectint}
	 * labeled alternative in {@link ArrayOperationsParser#affectation}.
	 * @param ctx the parse tree
	 */
	void exitAffectint(ArrayOperationsParser.AffectintContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayOperationsParser#varout}.
	 * @param ctx the parse tree
	 */
	void enterVarout(ArrayOperationsParser.VaroutContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayOperationsParser#varout}.
	 * @param ctx the parse tree
	 */
	void exitVarout(ArrayOperationsParser.VaroutContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArrayOperationsParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ArrayOperationsParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArrayOperationsParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ArrayOperationsParser.ArrayContext ctx);
}