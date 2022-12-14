/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.Mission#getMissionStatements <em>Mission Statements</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getMission()
 * @model
 * @generated
 */
public interface Mission extends EObject
{
  /**
   * Returns the value of the '<em><b>Mission Statements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.farm.farm.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mission Statements</em>' containment reference list.
   * @see uk.ac.kcl.farm.farm.FarmPackage#getMission_MissionStatements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getMissionStatements();

} // Mission
