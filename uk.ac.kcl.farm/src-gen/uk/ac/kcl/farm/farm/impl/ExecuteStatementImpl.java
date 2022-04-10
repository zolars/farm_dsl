/**
 * generated by Xtext 2.26.0
 */
package uk.ac.kcl.farm.farm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.farm.farm.ExecuteStatement;
import uk.ac.kcl.farm.farm.FarmPackage;
import uk.ac.kcl.farm.farm.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Execute Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.farm.farm.impl.ExecuteStatementImpl#getExecuteStatements <em>Execute Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExecuteStatementImpl extends MinimalEObjectImpl.Container implements ExecuteStatement
{
  /**
   * The cached value of the '{@link #getExecuteStatements() <em>Execute Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExecuteStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> executeStatements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExecuteStatementImpl()
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
    return FarmPackage.Literals.EXECUTE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Statement> getExecuteStatements()
  {
    if (executeStatements == null)
    {
      executeStatements = new EObjectContainmentEList<Statement>(Statement.class, this, FarmPackage.EXECUTE_STATEMENT__EXECUTE_STATEMENTS);
    }
    return executeStatements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case FarmPackage.EXECUTE_STATEMENT__EXECUTE_STATEMENTS:
        return ((InternalEList<?>)getExecuteStatements()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case FarmPackage.EXECUTE_STATEMENT__EXECUTE_STATEMENTS:
        return getExecuteStatements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FarmPackage.EXECUTE_STATEMENT__EXECUTE_STATEMENTS:
        getExecuteStatements().clear();
        getExecuteStatements().addAll((Collection<? extends Statement>)newValue);
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
      case FarmPackage.EXECUTE_STATEMENT__EXECUTE_STATEMENTS:
        getExecuteStatements().clear();
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
      case FarmPackage.EXECUTE_STATEMENT__EXECUTE_STATEMENTS:
        return executeStatements != null && !executeStatements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExecuteStatementImpl
