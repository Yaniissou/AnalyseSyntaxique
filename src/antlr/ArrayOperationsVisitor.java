// Generated from /home/yanissou/r6a08/harkatiy-projet/src/antlr/ArrayOperations.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArrayOperationsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArrayOperationsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArrayOperationsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ArrayOperationsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleopinstruction}
	 * labeled alternative in {@link ArrayOperationsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleopinstruction(ArrayOperationsParser.SimpleopinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vardeclinstruction}
	 * labeled alternative in {@link ArrayOperationsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclinstruction(ArrayOperationsParser.VardeclinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectationinstruction}
	 * labeled alternative in {@link ArrayOperationsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectationinstruction(ArrayOperationsParser.AffectationinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varoutinstruction}
	 * labeled alternative in {@link ArrayOperationsParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVaroutinstruction(ArrayOperationsParser.VaroutinstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sum}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSum(ArrayOperationsParser.SumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prod}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd(ArrayOperationsParser.ProdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code max}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMax(ArrayOperationsParser.MaxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code min}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMin(ArrayOperationsParser.MinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sort}
	 * labeled alternative in {@link ArrayOperationsParser#simpleop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort(ArrayOperationsParser.SortContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vararray}
	 * labeled alternative in {@link ArrayOperationsParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVararray(ArrayOperationsParser.VararrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initvararray}
	 * labeled alternative in {@link ArrayOperationsParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitvararray(ArrayOperationsParser.InitvararrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varint}
	 * labeled alternative in {@link ArrayOperationsParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarint(ArrayOperationsParser.VarintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initvarint}
	 * labeled alternative in {@link ArrayOperationsParser#vardecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitvarint(ArrayOperationsParser.InitvarintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectsimpleop}
	 * labeled alternative in {@link ArrayOperationsParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectsimpleop(ArrayOperationsParser.AffectsimpleopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectarray}
	 * labeled alternative in {@link ArrayOperationsParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectarray(ArrayOperationsParser.AffectarrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code affectint}
	 * labeled alternative in {@link ArrayOperationsParser#affectation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAffectint(ArrayOperationsParser.AffectintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArrayOperationsParser#varout}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarout(ArrayOperationsParser.VaroutContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArrayOperationsParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ArrayOperationsParser.ArrayContext ctx);
}