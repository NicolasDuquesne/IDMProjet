/**
 */
package istic.idm.project.videoGen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Video Gen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istic.idm.project.videoGen.VideoGen#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see istic.idm.project.videoGen.VideoGenPackage#getVideoGen()
 * @model
 * @generated
 */
public interface VideoGen extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference list.
   * The list contents are of type {@link istic.idm.project.videoGen.type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference list.
   * @see istic.idm.project.videoGen.VideoGenPackage#getVideoGen_Type()
   * @model containment="true"
   * @generated
   */
  EList<type> getType();

} // VideoGen
