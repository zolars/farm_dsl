/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.Call#getInstance <em>Instance</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.Call#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.Call#getFunctions <em>Functions</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends ExpressionOrCall
{
  /**
   * Returns the value of the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instance</em>' reference.
   * @see #setInstance(Instance)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getCall_Instance()
   * @model
   * @generated
   */
  Instance getInstance();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.Call#getInstance <em>Instance</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instance</em>' reference.
   * @see #getInstance()
   * @generated
   */
  void setInstance(Instance value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' attribute list.
   * @see uk.ac.kcl.farm.farm.FarmPackage#getCall_Attributes()
   * @model unique="false"
   * @generated
   */
  EList<String> getAttributes();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.farm.farm.CallFunction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see uk.ac.kcl.farm.farm.FarmPackage#getCall_Functions()
   * @model containment="true"
   * @generated
   */
  EList<CallFunction> getFunctions();

} // Call
