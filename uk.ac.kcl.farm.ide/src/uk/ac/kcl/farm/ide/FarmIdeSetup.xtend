/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.farm.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import uk.ac.kcl.farm.FarmRuntimeModule
import uk.ac.kcl.farm.FarmStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class FarmIdeSetup extends FarmStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new FarmRuntimeModule, new FarmIdeModule))
	}
	
}