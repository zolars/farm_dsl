/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.farm;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class FarmStandaloneSetup extends FarmStandaloneSetupGenerated {
  public static void doSetup() {
    new FarmStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}