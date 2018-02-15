/**
 */
package CipVamprofile.CipVamLibrary.BasicDT.impl;

import CipVamprofile.CipVamLibrary.BasicDT.ActionKind;
import CipVamprofile.CipVamLibrary.BasicDT.AngularSpeedUnit;
import CipVamprofile.CipVamLibrary.BasicDT.AngularUnitKind;
import CipVamprofile.CipVamLibrary.BasicDT.BasicDTFactory;
import CipVamprofile.CipVamLibrary.BasicDT.BasicDTPackage;
import CipVamprofile.CipVamLibrary.BasicDT.Level;
import CipVamprofile.CipVamLibrary.BasicDT.ProcessingType;
import CipVamprofile.CipVamLibrary.BasicDT.ProtectionNature;
import CipVamprofile.CipVamLibrary.BasicDT.RiskLevel;
import CipVamprofile.CipVamLibrary.BasicDT.StepKind;
import CipVamprofile.CipVamLibrary.BasicDT.Tactic;
import CipVamprofile.CipVamLibrary.BasicDT.TransmissionTech;
import CipVamprofile.CipVamLibrary.BasicDT.WeaponNature;
import CipVamprofile.CipVamLibrary.BasicDT.ZoomType;

import CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage;

import CipVamprofile.CipVamLibrary.GeometricDT.impl.GeometricDTPackageImpl;

import CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage;

import CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl;

import CipVamprofile.CipVamprofilePackage;

import CipVamprofile.impl.CipVamprofilePackageImpl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

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
public class BasicDTPackageImpl extends EPackageImpl implements BasicDTPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum riskLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tacticEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum weaponNatureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stepKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protectionNatureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transmissionTechEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum angularSpeedUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum angularUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum zoomTypeEEnum = null;

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
	 * @see CipVamprofile.CipVamLibrary.BasicDT.BasicDTPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasicDTPackageImpl() {
		super(eNS_URI, BasicDTFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasicDTPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasicDTPackage init() {
		if (isInited) return (BasicDTPackage)EPackage.Registry.INSTANCE.getEPackage(BasicDTPackage.eNS_URI);

		// Obtain or create and register package
		BasicDTPackageImpl theBasicDTPackage = (BasicDTPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasicDTPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasicDTPackageImpl());

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
		GeometricDTPackageImpl theGeometricDTPackage = (GeometricDTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GeometricDTPackage.eNS_URI) instanceof GeometricDTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GeometricDTPackage.eNS_URI) : GeometricDTPackage.eINSTANCE);
		StructuredDTPackageImpl theStructuredDTPackage = (StructuredDTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredDTPackage.eNS_URI) instanceof StructuredDTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredDTPackage.eNS_URI) : StructuredDTPackage.eINSTANCE);

		// Create package meta-data objects
		theBasicDTPackage.createPackageContents();
		theCipVamprofilePackage.createPackageContents();
		theGeometricDTPackage.createPackageContents();
		theStructuredDTPackage.createPackageContents();

		// Initialize created meta-data
		theBasicDTPackage.initializePackageContents();
		theCipVamprofilePackage.initializePackageContents();
		theGeometricDTPackage.initializePackageContents();
		theStructuredDTPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasicDTPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasicDTPackage.eNS_URI, theBasicDTPackage);
		return theBasicDTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRiskLevel() {
		return riskLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTactic() {
		return tacticEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevel() {
		return levelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWeaponNature() {
		return weaponNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionKind() {
		return actionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStepKind() {
		return stepKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProtectionNature() {
		return protectionNatureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransmissionTech() {
		return transmissionTechEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessingType() {
		return processingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAngularSpeedUnit() {
		return angularSpeedUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAngularUnitKind() {
		return angularUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getZoomType() {
		return zoomTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDTFactory getBasicDTFactory() {
		return (BasicDTFactory)getEFactoryInstance();
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

		// Create enums
		riskLevelEEnum = createEEnum(RISK_LEVEL);
		tacticEEnum = createEEnum(TACTIC);
		levelEEnum = createEEnum(LEVEL);
		weaponNatureEEnum = createEEnum(WEAPON_NATURE);
		actionKindEEnum = createEEnum(ACTION_KIND);
		stepKindEEnum = createEEnum(STEP_KIND);
		protectionNatureEEnum = createEEnum(PROTECTION_NATURE);
		transmissionTechEEnum = createEEnum(TRANSMISSION_TECH);
		processingTypeEEnum = createEEnum(PROCESSING_TYPE);
		angularSpeedUnitEEnum = createEEnum(ANGULAR_SPEED_UNIT);
		angularUnitKindEEnum = createEEnum(ANGULAR_UNIT_KIND);
		zoomTypeEEnum = createEEnum(ZOOM_TYPE);
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

		// Initialize enums and add enum literals
		initEEnum(riskLevelEEnum, RiskLevel.class, "RiskLevel");
		addEEnumLiteral(riskLevelEEnum, RiskLevel.NEGLIGIBLE);
		addEEnumLiteral(riskLevelEEnum, RiskLevel.ACCEPTABLE);
		addEEnumLiteral(riskLevelEEnum, RiskLevel.TOLERABLE);
		addEEnumLiteral(riskLevelEEnum, RiskLevel.UNACCEPTABLE);

		initEEnum(tacticEEnum, Tactic.class, "Tactic");
		addEEnumLiteral(tacticEEnum, Tactic.ARMED_ATTACK);
		addEEnumLiteral(tacticEEnum, Tactic.ARSON);
		addEEnumLiteral(tacticEEnum, Tactic.BARRICADE);
		addEEnumLiteral(tacticEEnum, Tactic.BOMBING);
		addEEnumLiteral(tacticEEnum, Tactic.HIJACKING);
		addEEnumLiteral(tacticEEnum, Tactic.HOSTAGE);
		addEEnumLiteral(tacticEEnum, Tactic.INTRUSION);
		addEEnumLiteral(tacticEEnum, Tactic.KIDNAPPING);
		addEEnumLiteral(tacticEEnum, Tactic.SABOTAGE);
		addEEnumLiteral(tacticEEnum, Tactic.SUICIDE);
		addEEnumLiteral(tacticEEnum, Tactic.DISPERSION);

		initEEnum(levelEEnum, Level.class, "Level");
		addEEnumLiteral(levelEEnum, Level.VERY_LOW);
		addEEnumLiteral(levelEEnum, Level.LOW);
		addEEnumLiteral(levelEEnum, Level.MEDIUM);
		addEEnumLiteral(levelEEnum, Level.HIGH);
		addEEnumLiteral(levelEEnum, Level.VERY_HIGH);

		initEEnum(weaponNatureEEnum, WeaponNature.class, "WeaponNature");
		addEEnumLiteral(weaponNatureEEnum, WeaponNature.CHEMICAL_AGENT);
		addEEnumLiteral(weaponNatureEEnum, WeaponNature.EXPLOSIVE);
		addEEnumLiteral(weaponNatureEEnum, WeaponNature.FIREBOMB);
		addEEnumLiteral(weaponNatureEEnum, WeaponNature.FIREARM);
		addEEnumLiteral(weaponNatureEEnum, WeaponNature.RADIOLOGICAL_AGENT);
		addEEnumLiteral(weaponNatureEEnum, WeaponNature.AEROSOL);

		initEEnum(actionKindEEnum, ActionKind.class, "ActionKind");
		addEEnumLiteral(actionKindEEnum, ActionKind.ACTION);
		addEEnumLiteral(actionKindEEnum, ActionKind.TRIGGER);

		initEEnum(stepKindEEnum, StepKind.class, "StepKind");
		addEEnumLiteral(stepKindEEnum, StepKind.MANUAL);
		addEEnumLiteral(stepKindEEnum, StepKind.AUTOMATIC);
		addEEnumLiteral(stepKindEEnum, StepKind.SEMIAUTOMATIC);

		initEEnum(protectionNatureEEnum, ProtectionNature.class, "ProtectionNature");
		addEEnumLiteral(protectionNatureEEnum, ProtectionNature.ACOUSTIC);
		addEEnumLiteral(protectionNatureEEnum, ProtectionNature.BIOLOGICAL);
		addEEnumLiteral(protectionNatureEEnum, ProtectionNature.CHEMICAL);
		addEEnumLiteral(protectionNatureEEnum, ProtectionNature.ELECTRIC);
		addEEnumLiteral(protectionNatureEEnum, ProtectionNature.MAGNETIC);
		addEEnumLiteral(protectionNatureEEnum, ProtectionNature.MECHANICAL);
		addEEnumLiteral(protectionNatureEEnum, ProtectionNature.OPTICAL);
		addEEnumLiteral(protectionNatureEEnum, ProtectionNature.THERMAL);
		addEEnumLiteral(protectionNatureEEnum, ProtectionNature.RADIATION);
		addEEnumLiteral(protectionNatureEEnum, ProtectionNature.OPTICAL_FIBER);
		addEEnumLiteral(protectionNatureEEnum, ProtectionNature.INFRARED);
		addEEnumLiteral(protectionNatureEEnum, ProtectionNature.SOFTWARE_BASED);

		initEEnum(transmissionTechEEnum, TransmissionTech.class, "TransmissionTech");
		addEEnumLiteral(transmissionTechEEnum, TransmissionTech.WIRED);
		addEEnumLiteral(transmissionTechEEnum, TransmissionTech.WIRELESS);
		addEEnumLiteral(transmissionTechEEnum, TransmissionTech.NONE);

		initEEnum(processingTypeEEnum, ProcessingType.class, "ProcessingType");
		addEEnumLiteral(processingTypeEEnum, ProcessingType.ANALOGIC);
		addEEnumLiteral(processingTypeEEnum, ProcessingType.DIGITAL);

		initEEnum(angularSpeedUnitEEnum, AngularSpeedUnit.class, "AngularSpeedUnit");
		addEEnumLiteral(angularSpeedUnitEEnum, AngularSpeedUnit.DEG_PER_SEC);
		addEEnumLiteral(angularSpeedUnitEEnum, AngularSpeedUnit.RAD_PER_SEC);

		initEEnum(angularUnitKindEEnum, AngularUnitKind.class, "AngularUnitKind");
		addEEnumLiteral(angularUnitKindEEnum, AngularUnitKind.DEG);
		addEEnumLiteral(angularUnitKindEEnum, AngularUnitKind.RAD);

		initEEnum(zoomTypeEEnum, ZoomType.class, "ZoomType");
		addEEnumLiteral(zoomTypeEEnum, ZoomType.DIGITAL);
		addEEnumLiteral(zoomTypeEEnum, ZoomType.OPTICAL);
		addEEnumLiteral(zoomTypeEEnum, ZoomType.TOTAL);
	}

} //BasicDTPackageImpl
