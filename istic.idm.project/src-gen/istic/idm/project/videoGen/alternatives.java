/**
 */
package istic.idm.project.videoGen;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>alternatives</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istic.idm.project.videoGen.alternatives#getId <em>Id</em>}</li>
 *   <li>{@link istic.idm.project.videoGen.alternatives#getVideoseq <em>Videoseq</em>}</li>
 * </ul>
 *
 * @see istic.idm.project.videoGen.VideoGenPackage#getalternatives()
 * @model
 * @generated
 */
public interface alternatives extends type
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see istic.idm.project.videoGen.VideoGenPackage#getalternatives_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link istic.idm.project.videoGen.alternatives#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Videoseq</b></em>' containment reference list.
   * The list contents are of type {@link istic.idm.project.videoGen.videoseq}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Videoseq</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Videoseq</em>' containment reference list.
   * @see istic.idm.project.videoGen.VideoGenPackage#getalternatives_Videoseq()
   * @model containment="true"
   * @generated
   */
  EList<videoseq> getVideoseq();

} // alternatives
