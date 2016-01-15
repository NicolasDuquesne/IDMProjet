/**
 */
package istic.idm.project.videoGen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see istic.idm.project.videoGen.VideoGenFactory
 * @model kind="package"
 * @generated
 */
public interface VideoGenPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "videoGen";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.idm.istic/project/VideoGen";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "videoGen";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  VideoGenPackage eINSTANCE = istic.idm.project.videoGen.impl.VideoGenPackageImpl.init();

  /**
   * The meta object id for the '{@link istic.idm.project.videoGen.impl.VideoGenImpl <em>Video Gen</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see istic.idm.project.videoGen.impl.VideoGenImpl
   * @see istic.idm.project.videoGen.impl.VideoGenPackageImpl#getVideoGen()
   * @generated
   */
  int VIDEO_GEN = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_GEN__TYPE = 0;

  /**
   * The number of structural features of the '<em>Video Gen</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEO_GEN_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link istic.idm.project.videoGen.impl.typeImpl <em>type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see istic.idm.project.videoGen.impl.typeImpl
   * @see istic.idm.project.videoGen.impl.VideoGenPackageImpl#gettype()
   * @generated
   */
  int TYPE = 1;

  /**
   * The number of structural features of the '<em>type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link istic.idm.project.videoGen.impl.mandatoryImpl <em>mandatory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see istic.idm.project.videoGen.impl.mandatoryImpl
   * @see istic.idm.project.videoGen.impl.VideoGenPackageImpl#getmandatory()
   * @generated
   */
  int MANDATORY = 2;

  /**
   * The number of structural features of the '<em>mandatory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MANDATORY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link istic.idm.project.videoGen.impl.optionalImpl <em>optional</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see istic.idm.project.videoGen.impl.optionalImpl
   * @see istic.idm.project.videoGen.impl.VideoGenPackageImpl#getoptional()
   * @generated
   */
  int OPTIONAL = 3;

  /**
   * The number of structural features of the '<em>optional</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link istic.idm.project.videoGen.impl.alternativesImpl <em>alternatives</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see istic.idm.project.videoGen.impl.alternativesImpl
   * @see istic.idm.project.videoGen.impl.VideoGenPackageImpl#getalternatives()
   * @generated
   */
  int ALTERNATIVES = 4;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVES__ID = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Videoseq</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVES__VIDEOSEQ = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>alternatives</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALTERNATIVES_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link istic.idm.project.videoGen.impl.videoseqImpl <em>videoseq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see istic.idm.project.videoGen.impl.videoseqImpl
   * @see istic.idm.project.videoGen.impl.VideoGenPackageImpl#getvideoseq()
   * @generated
   */
  int VIDEOSEQ = 5;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEOSEQ__ID = MANDATORY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEOSEQ__TEXT = MANDATORY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>videoseq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIDEOSEQ_FEATURE_COUNT = MANDATORY_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link istic.idm.project.videoGen.VideoGen <em>Video Gen</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Video Gen</em>'.
   * @see istic.idm.project.videoGen.VideoGen
   * @generated
   */
  EClass getVideoGen();

  /**
   * Returns the meta object for the containment reference list '{@link istic.idm.project.videoGen.VideoGen#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type</em>'.
   * @see istic.idm.project.videoGen.VideoGen#getType()
   * @see #getVideoGen()
   * @generated
   */
  EReference getVideoGen_Type();

  /**
   * Returns the meta object for class '{@link istic.idm.project.videoGen.type <em>type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>type</em>'.
   * @see istic.idm.project.videoGen.type
   * @generated
   */
  EClass gettype();

  /**
   * Returns the meta object for class '{@link istic.idm.project.videoGen.mandatory <em>mandatory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>mandatory</em>'.
   * @see istic.idm.project.videoGen.mandatory
   * @generated
   */
  EClass getmandatory();

  /**
   * Returns the meta object for class '{@link istic.idm.project.videoGen.optional <em>optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>optional</em>'.
   * @see istic.idm.project.videoGen.optional
   * @generated
   */
  EClass getoptional();

  /**
   * Returns the meta object for class '{@link istic.idm.project.videoGen.alternatives <em>alternatives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>alternatives</em>'.
   * @see istic.idm.project.videoGen.alternatives
   * @generated
   */
  EClass getalternatives();

  /**
   * Returns the meta object for the attribute '{@link istic.idm.project.videoGen.alternatives#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see istic.idm.project.videoGen.alternatives#getId()
   * @see #getalternatives()
   * @generated
   */
  EAttribute getalternatives_Id();

  /**
   * Returns the meta object for the containment reference list '{@link istic.idm.project.videoGen.alternatives#getVideoseq <em>Videoseq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Videoseq</em>'.
   * @see istic.idm.project.videoGen.alternatives#getVideoseq()
   * @see #getalternatives()
   * @generated
   */
  EReference getalternatives_Videoseq();

  /**
   * Returns the meta object for class '{@link istic.idm.project.videoGen.videoseq <em>videoseq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>videoseq</em>'.
   * @see istic.idm.project.videoGen.videoseq
   * @generated
   */
  EClass getvideoseq();

  /**
   * Returns the meta object for the attribute '{@link istic.idm.project.videoGen.videoseq#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see istic.idm.project.videoGen.videoseq#getId()
   * @see #getvideoseq()
   * @generated
   */
  EAttribute getvideoseq_Id();

  /**
   * Returns the meta object for the attribute '{@link istic.idm.project.videoGen.videoseq#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see istic.idm.project.videoGen.videoseq#getText()
   * @see #getvideoseq()
   * @generated
   */
  EAttribute getvideoseq_Text();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  VideoGenFactory getVideoGenFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link istic.idm.project.videoGen.impl.VideoGenImpl <em>Video Gen</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see istic.idm.project.videoGen.impl.VideoGenImpl
     * @see istic.idm.project.videoGen.impl.VideoGenPackageImpl#getVideoGen()
     * @generated
     */
    EClass VIDEO_GEN = eINSTANCE.getVideoGen();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIDEO_GEN__TYPE = eINSTANCE.getVideoGen_Type();

    /**
     * The meta object literal for the '{@link istic.idm.project.videoGen.impl.typeImpl <em>type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see istic.idm.project.videoGen.impl.typeImpl
     * @see istic.idm.project.videoGen.impl.VideoGenPackageImpl#gettype()
     * @generated
     */
    EClass TYPE = eINSTANCE.gettype();

    /**
     * The meta object literal for the '{@link istic.idm.project.videoGen.impl.mandatoryImpl <em>mandatory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see istic.idm.project.videoGen.impl.mandatoryImpl
     * @see istic.idm.project.videoGen.impl.VideoGenPackageImpl#getmandatory()
     * @generated
     */
    EClass MANDATORY = eINSTANCE.getmandatory();

    /**
     * The meta object literal for the '{@link istic.idm.project.videoGen.impl.optionalImpl <em>optional</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see istic.idm.project.videoGen.impl.optionalImpl
     * @see istic.idm.project.videoGen.impl.VideoGenPackageImpl#getoptional()
     * @generated
     */
    EClass OPTIONAL = eINSTANCE.getoptional();

    /**
     * The meta object literal for the '{@link istic.idm.project.videoGen.impl.alternativesImpl <em>alternatives</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see istic.idm.project.videoGen.impl.alternativesImpl
     * @see istic.idm.project.videoGen.impl.VideoGenPackageImpl#getalternatives()
     * @generated
     */
    EClass ALTERNATIVES = eINSTANCE.getalternatives();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALTERNATIVES__ID = eINSTANCE.getalternatives_Id();

    /**
     * The meta object literal for the '<em><b>Videoseq</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALTERNATIVES__VIDEOSEQ = eINSTANCE.getalternatives_Videoseq();

    /**
     * The meta object literal for the '{@link istic.idm.project.videoGen.impl.videoseqImpl <em>videoseq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see istic.idm.project.videoGen.impl.videoseqImpl
     * @see istic.idm.project.videoGen.impl.VideoGenPackageImpl#getvideoseq()
     * @generated
     */
    EClass VIDEOSEQ = eINSTANCE.getvideoseq();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEOSEQ__ID = eINSTANCE.getvideoseq_Id();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIDEOSEQ__TEXT = eINSTANCE.getvideoseq_Text();

  }

} //VideoGenPackage
