/**
 */
package istic.idm.project.videoGen.util;

import istic.idm.project.videoGen.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see istic.idm.project.videoGen.VideoGenPackage
 * @generated
 */
public class VideoGenSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VideoGenPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGenSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = VideoGenPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case VideoGenPackage.VIDEO_GEN:
      {
        VideoGen videoGen = (VideoGen)theEObject;
        T result = caseVideoGen(videoGen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.TYPE:
      {
        type type = (type)theEObject;
        T result = casetype(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.MANDATORY:
      {
        mandatory mandatory = (mandatory)theEObject;
        T result = casemandatory(mandatory);
        if (result == null) result = casetype(mandatory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.OPTIONAL:
      {
        optional optional = (optional)theEObject;
        T result = caseoptional(optional);
        if (result == null) result = casetype(optional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.ALTERNATIVES:
      {
        alternatives alternatives = (alternatives)theEObject;
        T result = casealternatives(alternatives);
        if (result == null) result = casetype(alternatives);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.VIDEOSEQ:
      {
        videoseq videoseq = (videoseq)theEObject;
        T result = casevideoseq(videoseq);
        if (result == null) result = casemandatory(videoseq);
        if (result == null) result = caseoptional(videoseq);
        if (result == null) result = casetype(videoseq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video Gen</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video Gen</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideoGen(VideoGen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casetype(type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>mandatory</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>mandatory</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemandatory(mandatory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>optional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>optional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseoptional(optional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>alternatives</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>alternatives</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casealternatives(alternatives object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>videoseq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>videoseq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevideoseq(videoseq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //VideoGenSwitch
