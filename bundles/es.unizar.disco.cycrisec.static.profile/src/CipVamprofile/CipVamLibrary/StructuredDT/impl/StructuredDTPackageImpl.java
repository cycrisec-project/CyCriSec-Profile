/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT.impl;

import CipVamprofile.CipVamLibrary.BasicDT.BasicDTPackage;

import CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl;

import CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage;

import CipVamprofile.CipVamLibrary.GeometricDT.impl.GeometricDTPackageImpl;

import CipVamprofile.CipVamLibrary.StructuredDT.Application;
import CipVamprofile.CipVamLibrary.StructuredDT.Asset;
import CipVamprofile.CipVamLibrary.StructuredDT.Impairment;
import CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular;
import CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTFactory;
import CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage;
import CipVamprofile.CipVamLibrary.StructuredDT.Threat;
import CipVamprofile.CipVamLibrary.StructuredDT.Weapon;
import CipVamprofile.CipVamLibrary.StructuredDT.Zoom;

import CipVamprofile.CipVamprofilePackage;

import CipVamprofile.impl.CipVamprofilePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import org.eclipse.papyrus.MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MeasurementUnits.MeasurementUnitsPackage;

import org.eclipse.papyrus.MARTE_Library.RS_Library.RS_LibraryPackage;

import org.eclipse.papyrus.MARTE_Library.TimeLibrary.TimeLibraryPackage;

import org.eclipse.papyrus.MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StructuredDTPackageImpl extends EPackageImpl implements StructuredDTPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass impairmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass weaponEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speedAngularEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zoomEClass = null;

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
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StructuredDTPackageImpl() {
		super(eNS_URI, StructuredDTFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StructuredDTPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StructuredDTPackage init() {
		if (isInited) return (StructuredDTPackage)EPackage.Registry.INSTANCE.getEPackage(StructuredDTPackage.eNS_URI);

		// Obtain or create and register package
		StructuredDTPackageImpl theStructuredDTPackage = (StructuredDTPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StructuredDTPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StructuredDTPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MeasurementUnitsPackage.eINSTANCE.eClass();
		GRM_BasicTypesPackage.eINSTANCE.eClass();
		MARTE_DataTypesPackage.eINSTANCE.eClass();
		BasicNFP_TypesPackage.eINSTANCE.eClass();
		TimeTypesLibraryPackage.eINSTANCE.eClass();
		TimeLibraryPackage.eINSTANCE.eClass();
		RS_LibraryPackage.eINSTANCE.eClass();
		MARTE_PrimitivesTypesPackage.eINSTANCE.eClass();
		BasicNFP_TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CipVamprofilePackageImpl theCipVamprofilePackage = (CipVamprofilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CipVamprofilePackage.eNS_URI) instanceof CipVamprofilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CipVamprofilePackage.eNS_URI) : CipVamprofilePackage.eINSTANCE);
		BasicDTPackageImpl theBasicDTPackage = (BasicDTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicDTPackage.eNS_URI) instanceof BasicDTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicDTPackage.eNS_URI) : BasicDTPackage.eINSTANCE);
		GeometricDTPackageImpl theGeometricDTPackage = (GeometricDTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeometricDTPackage.eNS_URI) instanceof GeometricDTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeometricDTPackage.eNS_URI) : GeometricDTPackage.eINSTANCE);

		// Create package meta-data objects
		theStructuredDTPackage.createPackageContents();
		theCipVamprofilePackage.createPackageContents();
		theBasicDTPackage.createPackageContents();
		theGeometricDTPackage.createPackageContents();

		// Initialize created meta-data
		theStructuredDTPackage.initializePackageContents();
		theCipVamprofilePackage.initializePackageContents();
		theBasicDTPackage.initializePackageContents();
		theGeometricDTPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStructuredDTPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StructuredDTPackage.eNS_URI, theStructuredDTPackage);
		return theStructuredDTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_Value() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_Vulnerability() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_AttackProb() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_Risk() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsset_RiskLevel() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImpairment() {
		return impairmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImpairment_Latency() {
		return (EAttribute)impairmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImpairment_PropProb() {
		return (EAttribute)impairmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImpairment_PropCond() {
		return (EAttribute)impairmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImpairment_PropEffect() {
		return (EAttribute)impairmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreat() {
		return threatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreat_Name() {
		return (EAttribute)threatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreat_Effect() {
		return (EAttribute)threatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThreat_Target() {
		return (EReference)threatEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWeapon() {
		return weaponEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_FailureRate() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWeapon_Nature() {
		return (EAttribute)weaponEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplication() {
		return applicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Position() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Direction() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplication_Installation() {
		return (EReference)applicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeedAngular() {
		return speedAngularEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeedAngular_Value() {
		return (EAttribute)speedAngularEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeedAngular_SpeedUnit() {
		return (EAttribute)speedAngularEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZoom() {
		return zoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoom_Value() {
		return (EAttribute)zoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZoom_Type() {
		return (EAttribute)zoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredDTFactory getStructuredDTFactory() {
		return (StructuredDTFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__VALUE);
		createEAttribute(assetEClass, ASSET__VULNERABILITY);
		createEAttribute(assetEClass, ASSET__ATTACK_PROB);
		createEAttribute(assetEClass, ASSET__RISK);
		createEAttribute(assetEClass, ASSET__RISK_LEVEL);

		impairmentEClass = createEClass(IMPAIRMENT);
		createEAttribute(impairmentEClass, IMPAIRMENT__LATENCY);
		createEAttribute(impairmentEClass, IMPAIRMENT__PROP_PROB);
		createEAttribute(impairmentEClass, IMPAIRMENT__PROP_COND);
		createEAttribute(impairmentEClass, IMPAIRMENT__PROP_EFFECT);

		threatEClass = createEClass(THREAT);
		createEAttribute(threatEClass, THREAT__NAME);
		createEAttribute(threatEClass, THREAT__EFFECT);
		createEReference(threatEClass, THREAT__TARGET);

		weaponEClass = createEClass(WEAPON);
		createEAttribute(weaponEClass, WEAPON__FAILURE_RATE);
		createEAttribute(weaponEClass, WEAPON__NATURE);

		applicationEClass = createEClass(APPLICATION);
		createEReference(applicationEClass, APPLICATION__POSITION);
		createEReference(applicationEClass, APPLICATION__DIRECTION);
		createEReference(applicationEClass, APPLICATION__INSTALLATION);

		speedAngularEClass = createEClass(SPEED_ANGULAR);
		createEAttribute(speedAngularEClass, SPEED_ANGULAR__VALUE);
		createEAttribute(speedAngularEClass, SPEED_ANGULAR__SPEED_UNIT);

		zoomEClass = createEClass(ZOOM);
		createEAttribute(zoomEClass, ZOOM__VALUE);
		createEAttribute(zoomEClass, ZOOM__TYPE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);
		BasicDTPackage theBasicDTPackage = (BasicDTPackage)EPackage.Registry.INSTANCE.getEPackage(BasicDTPackage.eNS_URI);
		MARTE_DataTypesPackage theMARTE_DataTypesPackage = (MARTE_DataTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_DataTypesPackage.eNS_URI);
		MARTE_PrimitivesTypesPackage theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI);
		CipVamprofilePackage theCipVamprofilePackage = (CipVamprofilePackage)EPackage.Registry.INSTANCE.getEPackage(CipVamprofilePackage.eNS_URI);
		GeometricDTPackage theGeometricDTPackage = (GeometricDTPackage)EPackage.Registry.INSTANCE.getEPackage(GeometricDTPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		impairmentEClass.getESuperTypes().add(this.getThreat());

		// Initialize classes, features, and operations; add parameters
		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_Value(), theBasicNFP_TypesPackage.getNFP_Real(), "value", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsset_Vulnerability(), theBasicNFP_TypesPackage.getNFP_Real(), "vulnerability", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsset_AttackProb(), theBasicNFP_TypesPackage.getNFP_Real(), "attackProb", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsset_Risk(), theBasicNFP_TypesPackage.getNFP_Real(), "risk", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAsset_RiskLevel(), theBasicDTPackage.getRiskLevel(), "riskLevel", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(impairmentEClass, Impairment.class, "Impairment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImpairment_Latency(), theBasicNFP_TypesPackage.getNFP_Duration(), "latency", null, 0, 1, Impairment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImpairment_PropProb(), theBasicNFP_TypesPackage.getNFP_Real(), "propProb", null, 0, -1, Impairment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImpairment_PropCond(), theMARTE_DataTypesPackage.getVSL_Expression(), "propCond", null, 0, -1, Impairment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getImpairment_PropEffect(), theMARTE_PrimitivesTypesPackage.getString(), "propEffect", null, 0, -1, Impairment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(threatEClass, Threat.class, "Threat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreat_Name(), theMARTE_PrimitivesTypesPackage.getString(), "name", null, 1, 1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getThreat_Effect(), theBasicNFP_TypesPackage.getNFP_Real(), "effect", null, 0, 1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getThreat_Target(), theCipVamprofilePackage.getItem(), null, "target", null, 1, 1, Threat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(weaponEClass, Weapon.class, "Weapon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWeapon_FailureRate(), theBasicNFP_TypesPackage.getNFP_Real(), "failureRate", null, 0, 1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getWeapon_Nature(), theBasicDTPackage.getWeaponNature(), "nature", null, 0, 1, Weapon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(applicationEClass, Application.class, "Application", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplication_Position(), theGeometricDTPackage.getPoint(), null, "position", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getApplication_Direction(), theGeometricDTPackage.getPoint(), null, "direction", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getApplication_Installation(), theCipVamprofilePackage.getItem(), null, "installation", null, 0, 1, Application.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(speedAngularEClass, SpeedAngular.class, "SpeedAngular", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeedAngular_Value(), theMARTE_PrimitivesTypesPackage.getReal(), "value", null, 1, 1, SpeedAngular.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSpeedAngular_SpeedUnit(), theBasicDTPackage.getAngularSpeedUnit(), "speedUnit", null, 1, 1, SpeedAngular.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(zoomEClass, Zoom.class, "Zoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZoom_Value(), theMARTE_PrimitivesTypesPackage.getString(), "value", null, 1, 1, Zoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getZoom_Type(), theBasicDTPackage.getZoomType(), "type", null, 1, 1, Zoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
	}

} //StructuredDTPackageImpl
