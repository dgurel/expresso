// Generated from src/expresso/parser/Expression.g4 by ANTLR 4.5

package expresso.parser;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionParser}.
 */
public interface ExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(ExpressionParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(ExpressionParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#token_line}.
	 * @param ctx the parse tree
	 */
	void enterToken_line(ExpressionParser.Token_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#token_line}.
	 * @param ctx the parse tree
	 */
	void exitToken_line(ExpressionParser.Token_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionParser#non_empty}.
	 * @param ctx the parse tree
	 */
	void enterNon_empty(ExpressionParser.Non_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionParser#non_empty}.
	 * @param ctx the parse tree
	 */
	void exitNon_empty(ExpressionParser.Non_emptyContext ctx);
}