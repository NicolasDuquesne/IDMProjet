/**
 */
package istic.idm.project.videoGen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see istic.idm.project.videoGen.VideoGenPackage
 * @generated
 */
public interface VideoGenFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VideoGenFactory eINSTANCE = istic.idm.project.videoGen.impl.VideoGenFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Video Gen</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Video Gen</em>'.
   * @generated
   */
  VideoGen createVideoGen();

  /**
   * Returns a new object of class '<em>type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>type</em>'.
   * @generated
   */
  type createtype();

  /**
   * Returns a new object of class '<em>mandatory</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>mandatory</em>'.
   * @generated
   */
  mandatory createmandatory();

  /**
   * Returns a new object of class '<em>optional</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>optional</em>'.
   * @generated
   */
  optional createoptional();

  /**
   * Returns a new object of class '<em>alternatives</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>alternatives</em>'.
   * @generated
   */
  alternatives createalternatives();

  /**
   * Returns a new object of class '<em>videoseq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>videoseq</em>'.
   * @generated
   */
  videoseq createvideoseq();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  VideoGenPackage getVideoGenPackage();

} //VideoGenFactory
