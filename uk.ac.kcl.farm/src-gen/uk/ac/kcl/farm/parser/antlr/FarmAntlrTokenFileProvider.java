/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.farm.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FarmAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("uk/ac/kcl/farm/parser/antlr/internal/InternalFarm.tokens");
	}
}
