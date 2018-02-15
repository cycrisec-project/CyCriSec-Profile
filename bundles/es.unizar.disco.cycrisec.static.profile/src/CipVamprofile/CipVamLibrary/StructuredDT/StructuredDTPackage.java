/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT;

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
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTFactory
 * @model kind="package"
 * @generated
 */
public interface StructuredDTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "StructuredDT";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CipVamprofile/CipVamLibrary/StructuredDT.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CipVamprofile.CipVamLibrary.StructuredDT";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StructuredDTPackage eINSTANCE = CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl.init();

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.AssetImpl
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Vulnerability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__VULNERABILITY = 1;

	/**
	 * The feature id for the '<em><b>Attack Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ATTACK_PROB = 2;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__RISK = 3;

	/**
	 * The feature id for the '<em><b>Risk Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__RISK_LEVEL = 4;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.ThreatImpl <em>Threat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.ThreatImpl
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getThreat()
	 * @generated
	 */
	int THREAT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__EFFECT = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Threat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THREAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.ImpairmentImpl <em>Impairment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.ImpairmentImpl
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getImpairment()
	 * @generated
	 */
	int IMPAIRMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPAIRMENT__NAME = THREAT__NAME;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPAIRMENT__EFFECT = THREAT__EFFECT;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPAIRMENT__TARGET = THREAT__TARGET;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPAIRMENT__LATENCY = THREAT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prop Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPAIRMENT__PROP_PROB = THREAT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Prop Cond</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPAIRMENT__PROP_COND = THREAT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prop Effect</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPAIRMENT__PROP_EFFECT = THREAT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Impairment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPAIRMENT_FEATURE_COUNT = THREAT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Impairment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPAIRMENT_OPERATION_COUNT = THREAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.WeaponImpl <em>Weapon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.WeaponImpl
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getWeapon()
	 * @generated
	 */
	int WEAPON = 3;

	/**
	 * The feature id for the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__FAILURE_RATE = 0;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON__NATURE = 1;

	/**
	 * The number of structural features of the '<em>Weapon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Weapon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WEAPON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.ApplicationImpl
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 4;

	/**
	 * The feature id for the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Direction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__DIRECTION = 1;

	/**
	 * The feature id for the '<em><b>Installation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__INSTALLATION = 2;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.SpeedAngularImpl <em>Speed Angular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.SpeedAngularImpl
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getSpeedAngular()
	 * @generated
	 */
	int SPEED_ANGULAR = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_ANGULAR__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Speed Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_ANGULAR__SPEED_UNIT = 1;

	/**
	 * The number of structural features of the '<em>Speed Angular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_ANGULAR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Speed Angular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEED_ANGULAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.ZoomImpl <em>Zoom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.ZoomImpl
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getZoom()
	 * @generated
	 */
	int ZOOM = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Zoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Zoom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZOOM_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Asset#getValue()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Value();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getVulnerability <em>Vulnerability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vulnerability</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Asset#getVulnerability()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Vulnerability();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getAttackProb <em>Attack Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack Prob</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Asset#getAttackProb()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_AttackProb();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Asset#getRisk()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Risk();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.Asset#getRiskLevel <em>Risk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Risk Level</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Asset#getRiskLevel()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_RiskLevel();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.CipVamLibrary.StructuredDT.Impairment <em>Impairment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impairment</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Impairment
	 * @generated
	 */
	EClass getImpairment();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.Impairment#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Impairment#getLatency()
	 * @see #getImpairment()
	 * @generated
	 */
	EAttribute getImpairment_Latency();

	/**
	 * Returns the meta object for the attribute list '{@link CipVamprofile.CipVamLibrary.StructuredDT.Impairment#getPropProb <em>Prop Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prop Prob</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Impairment#getPropProb()
	 * @see #getImpairment()
	 * @generated
	 */
	EAttribute getImpairment_PropProb();

	/**
	 * Returns the meta object for the attribute list '{@link CipVamprofile.CipVamLibrary.StructuredDT.Impairment#getPropCond <em>Prop Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prop Cond</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Impairment#getPropCond()
	 * @see #getImpairment()
	 * @generated
	 */
	EAttribute getImpairment_PropCond();

	/**
	 * Returns the meta object for the attribute list '{@link CipVamprofile.CipVamLibrary.StructuredDT.Impairment#getPropEffect <em>Prop Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prop Effect</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Impairment#getPropEffect()
	 * @see #getImpairment()
	 * @generated
	 */
	EAttribute getImpairment_PropEffect();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.CipVamLibrary.StructuredDT.Threat <em>Threat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threat</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Threat
	 * @generated
	 */
	EClass getThreat();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.Threat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Threat#getName()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Name();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.Threat#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Effect</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Threat#getEffect()
	 * @see #getThreat()
	 * @generated
	 */
	EAttribute getThreat_Effect();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.CipVamLibrary.StructuredDT.Threat#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Threat#getTarget()
	 * @see #getThreat()
	 * @generated
	 */
	EReference getThreat_Target();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.CipVamLibrary.StructuredDT.Weapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Weapon</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Weapon
	 * @generated
	 */
	EClass getWeapon();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.Weapon#getFailureRate <em>Failure Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Rate</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Weapon#getFailureRate()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_FailureRate();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.Weapon#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Weapon#getNature()
	 * @see #getWeapon()
	 * @generated
	 */
	EAttribute getWeapon_Nature();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.CipVamLibrary.StructuredDT.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the containment reference '{@link CipVamprofile.CipVamLibrary.StructuredDT.Application#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Position</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Application#getPosition()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Position();

	/**
	 * Returns the meta object for the containment reference '{@link CipVamprofile.CipVamLibrary.StructuredDT.Application#getDirection <em>Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Direction</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Application#getDirection()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Direction();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.CipVamLibrary.StructuredDT.Application#getInstallation <em>Installation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Installation</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Application#getInstallation()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Installation();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular <em>Speed Angular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speed Angular</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular
	 * @generated
	 */
	EClass getSpeedAngular();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular#getValue()
	 * @see #getSpeedAngular()
	 * @generated
	 */
	EAttribute getSpeedAngular_Value();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular#getSpeedUnit <em>Speed Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Unit</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular#getSpeedUnit()
	 * @see #getSpeedAngular()
	 * @generated
	 */
	EAttribute getSpeedAngular_SpeedUnit();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.CipVamLibrary.StructuredDT.Zoom <em>Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Zoom</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Zoom
	 * @generated
	 */
	EClass getZoom();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.Zoom#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Zoom#getValue()
	 * @see #getZoom()
	 * @generated
	 */
	EAttribute getZoom_Value();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.StructuredDT.Zoom#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.Zoom#getType()
	 * @see #getZoom()
	 * @generated
	 */
	EAttribute getZoom_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StructuredDTFactory getStructuredDTFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.AssetImpl
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__VALUE = eINSTANCE.getAsset_Value();

		/**
		 * The meta object literal for the '<em><b>Vulnerability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__VULNERABILITY = eINSTANCE.getAsset_Vulnerability();

		/**
		 * The meta object literal for the '<em><b>Attack Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ATTACK_PROB = eINSTANCE.getAsset_AttackProb();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__RISK = eINSTANCE.getAsset_Risk();

		/**
		 * The meta object literal for the '<em><b>Risk Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__RISK_LEVEL = eINSTANCE.getAsset_RiskLevel();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.ImpairmentImpl <em>Impairment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.ImpairmentImpl
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getImpairment()
		 * @generated
		 */
		EClass IMPAIRMENT = eINSTANCE.getImpairment();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPAIRMENT__LATENCY = eINSTANCE.getImpairment_Latency();

		/**
		 * The meta object literal for the '<em><b>Prop Prob</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPAIRMENT__PROP_PROB = eINSTANCE.getImpairment_PropProb();

		/**
		 * The meta object literal for the '<em><b>Prop Cond</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPAIRMENT__PROP_COND = eINSTANCE.getImpairment_PropCond();

		/**
		 * The meta object literal for the '<em><b>Prop Effect</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPAIRMENT__PROP_EFFECT = eINSTANCE.getImpairment_PropEffect();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.ThreatImpl <em>Threat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.ThreatImpl
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getThreat()
		 * @generated
		 */
		EClass THREAT = eINSTANCE.getThreat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__NAME = eINSTANCE.getThreat_Name();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THREAT__EFFECT = eINSTANCE.getThreat_Effect();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THREAT__TARGET = eINSTANCE.getThreat_Target();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.WeaponImpl <em>Weapon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.WeaponImpl
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getWeapon()
		 * @generated
		 */
		EClass WEAPON = eINSTANCE.getWeapon();

		/**
		 * The meta object literal for the '<em><b>Failure Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__FAILURE_RATE = eINSTANCE.getWeapon_FailureRate();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WEAPON__NATURE = eINSTANCE.getWeapon_Nature();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.ApplicationImpl
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__POSITION = eINSTANCE.getApplication_Position();

		/**
		 * The meta object literal for the '<em><b>Direction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__DIRECTION = eINSTANCE.getApplication_Direction();

		/**
		 * The meta object literal for the '<em><b>Installation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__INSTALLATION = eINSTANCE.getApplication_Installation();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.SpeedAngularImpl <em>Speed Angular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.SpeedAngularImpl
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getSpeedAngular()
		 * @generated
		 */
		EClass SPEED_ANGULAR = eINSTANCE.getSpeedAngular();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEED_ANGULAR__VALUE = eINSTANCE.getSpeedAngular_Value();

		/**
		 * The meta object literal for the '<em><b>Speed Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEED_ANGULAR__SPEED_UNIT = eINSTANCE.getSpeedAngular_SpeedUnit();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.StructuredDT.impl.ZoomImpl <em>Zoom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.ZoomImpl
		 * @see CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl#getZoom()
		 * @generated
		 */
		EClass ZOOM = eINSTANCE.getZoom();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOM__VALUE = eINSTANCE.getZoom_Value();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZOOM__TYPE = eINSTANCE.getZoom_Type();

	}

} //StructuredDTPackage
