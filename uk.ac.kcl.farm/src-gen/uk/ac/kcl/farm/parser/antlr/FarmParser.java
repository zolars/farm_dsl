/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.farm.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import uk.ac.kcl.farm.parser.antlr.internal.InternalFarmParser;
import uk.ac.kcl.farm.services.FarmGrammarAccess;

public class FarmParser extends AbstractAntlrParser {

	@Inject
	private FarmGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalFarmParser createParser(XtextTokenStream stream) {
		return new InternalFarmParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "FarmProgram";
	}

	public FarmGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FarmGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}