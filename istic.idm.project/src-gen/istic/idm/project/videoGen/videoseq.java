/**
 */
package istic.idm.project.videoGen;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>videoseq</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link istic.idm.project.videoGen.videoseq#getId <em>Id</em>}</li>
 *   <li>{@link istic.idm.project.videoGen.videoseq#getText <em>Text</em>}</li>
 * </ul>
 *
 * @see istic.idm.project.videoGen.VideoGenPackage#getvideoseq()
 * @model
 * @generated
 */
public interface videoseq extends mandatory, optional
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
   * @see istic.idm.project.videoGen.VideoGenPackage#getvideoseq_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link istic.idm.project.videoGen.videoseq#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Text</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Text</em>' attribute.
   * @see #setText(String)
   * @see istic.idm.project.videoGen.VideoGenPackage#getvideoseq_Text()
   * @model
   * @generated
   */
  String getText();

  /**
   * Sets the value of the '{@link istic.idm.project.videoGen.videoseq#getText <em>Text</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Text</em>' attribute.
   * @see #getText()
   * @generated
   */
  void setText(String value);

} // videoseq
