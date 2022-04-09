/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.farm.farm.CountStageFunction;
import uk.ac.kcl.farm.farm.Crop;
import uk.ac.kcl.farm.farm.FarmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Count Stage Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.impl.CountStageFunctionImpl#getCountStageCrop <em>Count Stage Crop</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CountStageFunctionImpl extends BuiltinFunctionImpl implements CountStageFunction
{
  /**
   * The cached value of the '{@link #getCountStageCrop() <em>Count Stage Crop</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountStageCrop()
   * @generated
   * @ordered
   */
  protected Crop countStageCrop;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CountStageFunctionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FarmPackage.Literals.COUNT_STAGE_FUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Crop getCountStageCrop()
  {
    if (countStageCrop != null && countStageCrop.eIsProxy())
    {
      InternalEObject oldCountStageCrop = (InternalEObject)countStageCrop;
      countStageCrop = (Crop)eResolveProxy(oldCountStageCrop);
      if (countStageCrop != oldCountStageCrop)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, FarmPackage.COUNT_STAGE_FUNCTION__COUNT_STAGE_CROP, oldCountStageCrop, countStageCrop));
      }
    }
    return countStageCrop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Crop basicGetCountStageCrop()
  {
    return countStageCrop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCountStageCrop(Crop newCountStageCrop)
  {
    Crop oldCountStageCrop = countStageCrop;
    countStageCrop = newCountStageCrop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FarmPackage.COUNT_STAGE_FUNCTION__COUNT_STAGE_CROP, oldCountStageCrop, countStageCrop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FarmPackage.COUNT_STAGE_FUNCTION__COUNT_STAGE_CROP:
        if (resolve) return getCountStageCrop();
        return basicGetCountStageCrop();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FarmPackage.COUNT_STAGE_FUNCTION__COUNT_STAGE_CROP:
        setCountStageCrop((Crop)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FarmPackage.COUNT_STAGE_FUNCTION__COUNT_STAGE_CROP:
        setCountStageCrop((Crop)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FarmPackage.COUNT_STAGE_FUNCTION__COUNT_STAGE_CROP:
        return countStageCrop != null;
    }
    return super.eIsSet(featureID);
  }

} //CountStageFunctionImpl