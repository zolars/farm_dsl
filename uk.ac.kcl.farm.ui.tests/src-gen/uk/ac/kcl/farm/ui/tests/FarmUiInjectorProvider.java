/*
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.farm.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import uk.ac.kcl.farm.ui.internal.FarmActivator;

public class FarmUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FarmActivator.getInstance().getInjector("uk.ac.kcl.farm.Farm");
	}

}