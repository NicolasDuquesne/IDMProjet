/**
 */
package istic.idm.project.videoGen.impl;

import istic.idm.project.videoGen.VideoGen;
import istic.idm.project.videoGen.VideoGenFactory;
import istic.idm.project.videoGen.VideoGenPackage;
import istic.idm.project.videoGen.alternatives;
import istic.idm.project.videoGen.mandatory;
import istic.idm.project.videoGen.optional;
import istic.idm.project.videoGen.type;
import istic.idm.project.videoGen.videoseq;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VideoGenPackageImpl extends EPackageImpl implements VideoGenPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass videoGenEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mandatoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alternativesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass videoseqEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see istic.idm.project.videoGen.VideoGenPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private VideoGenPackageImpl()
  {
    super(eNS_URI, VideoGenFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link VideoGenPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static VideoGenPackage init()
  {
    if (isInited) return (VideoGenPackage)EPackage.Registry.INSTANCE.getEPackage(VideoGenPackage.eNS_URI);

    // Obtain or create and register package
    VideoGenPackageImpl theVideoGenPackage = (VideoGenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VideoGenPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VideoGenPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theVideoGenPackage.createPackageContents();

    // Initialize created meta-data
    theVideoGenPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theVideoGenPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(VideoGenPackage.eNS_URI, theVideoGenPackage);
    return theVideoGenPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVideoGen()
  {
    return videoGenEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVideoGen_Type()
  {
    return (EReference)videoGenEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass gettype()
  {
    return typeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getmandatory()
  {
    return mandatoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getoptional()
  {
    return optionalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getalternatives()
  {
    return alternativesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getalternatives_Id()
  {
    return (EAttribute)alternativesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getalternatives_Videoseq()
  {
    return (EReference)alternativesEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getvideoseq()
  {
    return videoseqEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvideoseq_Id()
  {
    return (EAttribute)videoseqEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getvideoseq_Text()
  {
    return (EAttribute)videoseqEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGenFactory getVideoGenFactory()
  {
    return (VideoGenFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    videoGenEClass = createEClass(VIDEO_GEN);
    createEReference(videoGenEClass, VIDEO_GEN__TYPE);

    typeEClass = createEClass(TYPE);

    mandatoryEClass = createEClass(MANDATORY);

    optionalEClass = createEClass(OPTIONAL);

    alternativesEClass = createEClass(ALTERNATIVES);
    createEAttribute(alternativesEClass, ALTERNATIVES__ID);
    createEReference(alternativesEClass, ALTERNATIVES__VIDEOSEQ);

    videoseqEClass = createEClass(VIDEOSEQ);
    createEAttribute(videoseqEClass, VIDEOSEQ__ID);
    createEAttribute(videoseqEClass, VIDEOSEQ__TEXT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mandatoryEClass.getESuperTypes().add(this.gettype());
    optionalEClass.getESuperTypes().add(this.gettype());
    alternativesEClass.getESuperTypes().add(this.gettype());
    videoseqEClass.getESuperTypes().add(this.getmandatory());
    videoseqEClass.getESuperTypes().add(this.getoptional());

    // Initialize classes and features; add operations and parameters
    initEClass(videoGenEClass, VideoGen.class, "VideoGen", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVideoGen_Type(), this.gettype(), null, "type", null, 0, -1, VideoGen.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeEClass, type.class, "type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(mandatoryEClass, mandatory.class, "mandatory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(optionalEClass, optional.class, "optional", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alternativesEClass, alternatives.class, "alternatives", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getalternatives_Id(), ecorePackage.getEString(), "id", null, 0, 1, alternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getalternatives_Videoseq(), this.getvideoseq(), null, "videoseq", null, 0, -1, alternatives.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(videoseqEClass, videoseq.class, "videoseq", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getvideoseq_Id(), ecorePackage.getEString(), "id", null, 0, 1, videoseq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getvideoseq_Text(), ecorePackage.getEString(), "text", null, 0, 1, videoseq.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //VideoGenPackageImpl
