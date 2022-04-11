/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crop Stage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.CropStage#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.CropStage#getTime <em>Time</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.CropStage#getTimeover <em>Timeover</em>}</li>
 *   <li>{@link uk.ac.kcl.farm.farm.CropStage#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getCropStage()
 * @model
 * @generated
 */
public interface CropStage extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getCropStage_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.CropStage#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(Expression)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getCropStage_Time()
   * @model containment="true"
   * @generated
   */
  Expression getTime();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.CropStage#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(Expression value);

  /**
   * Returns the value of the '<em><b>Timeover</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeover</em>' containment reference.
   * @see #setTimeover(Expression)
   * @see uk.ac.kcl.farm.farm.FarmPackage#getCropStage_Timeover()
   * @model containment="true"
   * @generated
   */
  Expression getTimeover();

  /**
   * Sets the value of the '{@link uk.ac.kcl.farm.farm.CropStage#getTimeover <em>Timeover</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeover</em>' containment reference.
   * @see #getTimeover()
   * @generated
   */
  void setTimeover(Expression value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.farm.farm.CallAttributes}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see uk.ac.kcl.farm.farm.FarmPackage#getCropStage_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<CallAttributes> getAttributes();

} // CropStage
