/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Crop Stages</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.CropStages#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.farm.farm.FarmPackage#getCropStages()
 * @model
 * @generated
 */
public interface CropStages extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link uk.ac.kcl.farm.farm.CropStage}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see uk.ac.kcl.farm.farm.FarmPackage#getCropStages_Elements()
   * @model containment="true"
   * @generated
   */
  EList<CropStage> getElements();

} // CropStages
