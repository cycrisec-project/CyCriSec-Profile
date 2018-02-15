/**
 */
package CipVamprofile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see CipVamprofile.CipVamprofileFactory
 * @model kind="package"
 * @generated
 */
public interface CipVamprofilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "CipVamprofile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CipVamprofile.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CipVamprofile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CipVamprofilePackage eINSTANCE = CipVamprofile.impl.CipVamprofilePackageImpl.init();

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.ItemImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 0;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ASSET = 0;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__BASE_CLASSIFIER = 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.PhysicalImpl <em>Physical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.PhysicalImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getPhysical()
	 * @generated
	 */
	int PHYSICAL = 1;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__ASSET = ITEM__ASSET;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__BASE_CLASSIFIER = ITEM__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__SHAPE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__VOLUME = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL__OPACITY = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Physical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Physical</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.SiteImpl <em>Site</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.SiteImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getSite()
	 * @generated
	 */
	int SITE = 2;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__ASSET = PHYSICAL__ASSET;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__BASE_CLASSIFIER = PHYSICAL__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__SHAPE = PHYSICAL__SHAPE;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__VOLUME = PHYSICAL__VOLUME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE__OPACITY = PHYSICAL__OPACITY;

	/**
	 * The number of structural features of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_FEATURE_COUNT = PHYSICAL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Site</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SITE_OPERATION_COUNT = PHYSICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.InterfaceImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 3;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__ASSET = PHYSICAL__ASSET;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__BASE_CLASSIFIER = PHYSICAL__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__SHAPE = PHYSICAL__SHAPE;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__VOLUME = PHYSICAL__VOLUME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPACITY = PHYSICAL__OPACITY;

	/**
	 * The feature id for the '<em><b>Exposures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__EXPOSURES = PHYSICAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = PHYSICAL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = PHYSICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.ObjectImpl <em>Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.ObjectImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__ASSET = PHYSICAL__ASSET;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__BASE_CLASSIFIER = PHYSICAL__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__SHAPE = PHYSICAL__SHAPE;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__VOLUME = PHYSICAL__VOLUME;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__OPACITY = PHYSICAL__OPACITY;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__REQUESTS = PHYSICAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__LOCATION = PHYSICAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT__MULTIPLICITY = PHYSICAL_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = PHYSICAL_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_OPERATION_COUNT = PHYSICAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.ServiceImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 5;

	/**
	 * The feature id for the '<em><b>Asset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ASSET = ITEM__ASSET;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BASE_CLASSIFIER = ITEM__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__BASE_USE_CASE = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provided By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PROVIDED_BY = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EXEC_PROB = ITEM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = ITEM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.AttackImpl <em>Attack</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.AttackImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getAttack()
	 * @generated
	 */
	int ATTACK = 6;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Tactic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__TACTIC = 1;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__THREATS = 2;

	/**
	 * The feature id for the '<em><b>Attacker</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__ATTACKER = 3;

	/**
	 * The feature id for the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__BASE_ACTIVITY = 4;

	/**
	 * The feature id for the '<em><b>Base Use Case</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK__BASE_USE_CASE = 5;

	/**
	 * The number of structural features of the '<em>Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attack</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.AttackerImpl <em>Attacker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.AttackerImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getAttacker()
	 * @generated
	 */
	int ATTACKER = 7;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER__MULTIPLICITY = 0;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER__SKILL = 1;

	/**
	 * The feature id for the '<em><b>Firmness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER__FIRMNESS = 2;

	/**
	 * The feature id for the '<em><b>Base Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER__BASE_ACTOR = 3;

	/**
	 * The number of structural features of the '<em>Attacker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attacker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.ActionImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 8;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__KIND = 1;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__FAILURE = 2;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TRIGGERED_BY = 3;

	/**
	 * The feature id for the '<em><b>Occurence Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__OCCURENCE_PROB = 4;

	/**
	 * The feature id for the '<em><b>Effects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__EFFECTS = 5;

	/**
	 * The feature id for the '<em><b>Weapon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__WEAPON = 6;

	/**
	 * The feature id for the '<em><b>Attacker</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ATTACKER = 7;

	/**
	 * The feature id for the '<em><b>Base Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__BASE_ACTIVITY_NODE = 8;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.ProtectionImpl <em>Protection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.ProtectionImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getProtection()
	 * @generated
	 */
	int PROTECTION = 9;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION__COST = 0;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION__SUCCESS_PROB = 1;

	/**
	 * The feature id for the '<em><b>Protects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION__PROTECTS = 2;

	/**
	 * The feature id for the '<em><b>Forbidden</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION__FORBIDDEN = 3;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION__MANDATORY = 4;

	/**
	 * The feature id for the '<em><b>Counteracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION__COUNTERACTS = 5;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION__EXPOSES = 6;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION__MULTIPLICITY = 7;

	/**
	 * The number of structural features of the '<em>Protection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Protection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.EquipmentImpl <em>Equipment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.EquipmentImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getEquipment()
	 * @generated
	 */
	int EQUIPMENT = 10;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__COST = PROTECTION__COST;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__SUCCESS_PROB = PROTECTION__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Protects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__PROTECTS = PROTECTION__PROTECTS;

	/**
	 * The feature id for the '<em><b>Forbidden</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__FORBIDDEN = PROTECTION__FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__MANDATORY = PROTECTION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Counteracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__COUNTERACTS = PROTECTION__COUNTERACTS;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__EXPOSES = PROTECTION__EXPOSES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__MULTIPLICITY = PROTECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__NATURE = PROTECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__FAILURE_RATE = PROTECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__APPLICATION = PROTECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__BASE_COMPONENT = PROTECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT__BASE_CLASS = PROTECTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_FEATURE_COUNT = PROTECTION_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Equipment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUIPMENT_OPERATION_COUNT = PROTECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.DeterrentImpl <em>Deterrent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.DeterrentImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getDeterrent()
	 * @generated
	 */
	int DETERRENT = 11;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__COST = EQUIPMENT__COST;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__SUCCESS_PROB = EQUIPMENT__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Protects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__PROTECTS = EQUIPMENT__PROTECTS;

	/**
	 * The feature id for the '<em><b>Forbidden</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__FORBIDDEN = EQUIPMENT__FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__MANDATORY = EQUIPMENT__MANDATORY;

	/**
	 * The feature id for the '<em><b>Counteracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__COUNTERACTS = EQUIPMENT__COUNTERACTS;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__EXPOSES = EQUIPMENT__EXPOSES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__MULTIPLICITY = EQUIPMENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__NATURE = EQUIPMENT__NATURE;

	/**
	 * The feature id for the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__FAILURE_RATE = EQUIPMENT__FAILURE_RATE;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__APPLICATION = EQUIPMENT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__BASE_COMPONENT = EQUIPMENT__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__BASE_CLASS = EQUIPMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT__CONDITION = EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Deterrent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Deterrent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERRENT_OPERATION_COUNT = EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.BarrierImpl <em>Barrier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.BarrierImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getBarrier()
	 * @generated
	 */
	int BARRIER = 12;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__COST = EQUIPMENT__COST;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__SUCCESS_PROB = EQUIPMENT__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Protects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__PROTECTS = EQUIPMENT__PROTECTS;

	/**
	 * The feature id for the '<em><b>Forbidden</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__FORBIDDEN = EQUIPMENT__FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__MANDATORY = EQUIPMENT__MANDATORY;

	/**
	 * The feature id for the '<em><b>Counteracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__COUNTERACTS = EQUIPMENT__COUNTERACTS;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__EXPOSES = EQUIPMENT__EXPOSES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__MULTIPLICITY = EQUIPMENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__NATURE = EQUIPMENT__NATURE;

	/**
	 * The feature id for the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__FAILURE_RATE = EQUIPMENT__FAILURE_RATE;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__APPLICATION = EQUIPMENT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__BASE_COMPONENT = EQUIPMENT__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__BASE_CLASS = EQUIPMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Time To Cross</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__TIME_TO_CROSS = EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER__CONDITION = EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Barrier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BARRIER_OPERATION_COUNT = EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.SensorImpl <em>Sensor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.SensorImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getSensor()
	 * @generated
	 */
	int SENSOR = 13;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__COST = EQUIPMENT__COST;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__SUCCESS_PROB = EQUIPMENT__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Protects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__PROTECTS = EQUIPMENT__PROTECTS;

	/**
	 * The feature id for the '<em><b>Forbidden</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__FORBIDDEN = EQUIPMENT__FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MANDATORY = EQUIPMENT__MANDATORY;

	/**
	 * The feature id for the '<em><b>Counteracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__COUNTERACTS = EQUIPMENT__COUNTERACTS;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__EXPOSES = EQUIPMENT__EXPOSES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__MULTIPLICITY = EQUIPMENT__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__NATURE = EQUIPMENT__NATURE;

	/**
	 * The feature id for the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__FAILURE_RATE = EQUIPMENT__FAILURE_RATE;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__APPLICATION = EQUIPMENT__APPLICATION;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__BASE_COMPONENT = EQUIPMENT__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__BASE_CLASS = EQUIPMENT__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__RANGE = EQUIPMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__LATENCY = EQUIPMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__FNR = EQUIPMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__FPR = EQUIPMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Trans Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR__TRANS_DATA = EQUIPMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_FEATURE_COUNT = EQUIPMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Sensor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SENSOR_OPERATION_COUNT = EQUIPMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.OperatorImpl <em>Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.OperatorImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 14;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__COST = PROTECTION__COST;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__SUCCESS_PROB = PROTECTION__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Protects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__PROTECTS = PROTECTION__PROTECTS;

	/**
	 * The feature id for the '<em><b>Forbidden</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__FORBIDDEN = PROTECTION__FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__MANDATORY = PROTECTION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Counteracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__COUNTERACTS = PROTECTION__COUNTERACTS;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__EXPOSES = PROTECTION__EXPOSES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__MULTIPLICITY = PROTECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Firmness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__FIRMNESS = PROTECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__SKILL = PROTECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__NATURE = PROTECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__AVAILABILITY = PROTECTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__BASE_CLASS = PROTECTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR__BASE_COMPONENT = PROTECTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_FEATURE_COUNT = PROTECTION_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATOR_OPERATION_COUNT = PROTECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.ManagementSystemImpl <em>Management System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.ManagementSystemImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getManagementSystem()
	 * @generated
	 */
	int MANAGEMENT_SYSTEM = 15;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SYSTEM__COST = PROTECTION__COST;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SYSTEM__SUCCESS_PROB = PROTECTION__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Protects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SYSTEM__PROTECTS = PROTECTION__PROTECTS;

	/**
	 * The feature id for the '<em><b>Forbidden</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SYSTEM__FORBIDDEN = PROTECTION__FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SYSTEM__MANDATORY = PROTECTION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Counteracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SYSTEM__COUNTERACTS = PROTECTION__COUNTERACTS;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SYSTEM__EXPOSES = PROTECTION__EXPOSES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SYSTEM__MULTIPLICITY = PROTECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Manages</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SYSTEM__MANAGES = PROTECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SYSTEM__BASE_CLASS = PROTECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SYSTEM__BASE_COMPONENT = PROTECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SYSTEM_FEATURE_COUNT = PROTECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Management System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGEMENT_SYSTEM_OPERATION_COUNT = PROTECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.ProtocolImpl <em>Protocol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.ProtocolImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getProtocol()
	 * @generated
	 */
	int PROTOCOL = 16;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__COST = PROTECTION__COST;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__SUCCESS_PROB = PROTECTION__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Protects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__PROTECTS = PROTECTION__PROTECTS;

	/**
	 * The feature id for the '<em><b>Forbidden</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__FORBIDDEN = PROTECTION__FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__MANDATORY = PROTECTION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Counteracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__COUNTERACTS = PROTECTION__COUNTERACTS;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__EXPOSES = PROTECTION__EXPOSES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__MULTIPLICITY = PROTECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Triggered By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__TRIGGERED_BY = PROTECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL__BASE_ACTIVITY = PROTECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_FEATURE_COUNT = PROTECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Protocol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_OPERATION_COUNT = PROTECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.ProtocolRuleImpl <em>Protocol Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.ProtocolRuleImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getProtocolRule()
	 * @generated
	 */
	int PROTOCOL_RULE = 17;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_RULE__COST = PROTECTION__COST;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_RULE__SUCCESS_PROB = PROTECTION__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Protects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_RULE__PROTECTS = PROTECTION__PROTECTS;

	/**
	 * The feature id for the '<em><b>Forbidden</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_RULE__FORBIDDEN = PROTECTION__FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_RULE__MANDATORY = PROTECTION__MANDATORY;

	/**
	 * The feature id for the '<em><b>Counteracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_RULE__COUNTERACTS = PROTECTION__COUNTERACTS;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_RULE__EXPOSES = PROTECTION__EXPOSES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_RULE__MULTIPLICITY = PROTECTION__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Base Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_RULE__BASE_ACTIVITY_NODE = PROTECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Supported By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_RULE__SUPPORTED_BY = PROTECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Executed By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_RULE__EXECUTED_BY = PROTECTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Protocol Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_RULE_FEATURE_COUNT = PROTECTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Protocol Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTOCOL_RULE_OPERATION_COUNT = PROTECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.CameraImpl <em>Camera</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.CameraImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getCamera()
	 * @generated
	 */
	int CAMERA = 18;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__COST = SENSOR__COST;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__SUCCESS_PROB = SENSOR__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Protects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__PROTECTS = SENSOR__PROTECTS;

	/**
	 * The feature id for the '<em><b>Forbidden</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__FORBIDDEN = SENSOR__FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__MANDATORY = SENSOR__MANDATORY;

	/**
	 * The feature id for the '<em><b>Counteracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__COUNTERACTS = SENSOR__COUNTERACTS;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__EXPOSES = SENSOR__EXPOSES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__MULTIPLICITY = SENSOR__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__NATURE = SENSOR__NATURE;

	/**
	 * The feature id for the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__FAILURE_RATE = SENSOR__FAILURE_RATE;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__APPLICATION = SENSOR__APPLICATION;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__BASE_COMPONENT = SENSOR__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__BASE_CLASS = SENSOR__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__RANGE = SENSOR__RANGE;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__LATENCY = SENSOR__LATENCY;

	/**
	 * The feature id for the '<em><b>Fnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__FNR = SENSOR__FNR;

	/**
	 * The feature id for the '<em><b>Fpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__FPR = SENSOR__FPR;

	/**
	 * The feature id for the '<em><b>Trans Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__TRANS_DATA = SENSOR__TRANS_DATA;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__RESOLUTION = SENSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA__PROCESSING = SENSOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_FEATURE_COUNT = SENSOR_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Camera</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAMERA_OPERATION_COUNT = SENSOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.PtzImpl <em>Ptz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.PtzImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getPtz()
	 * @generated
	 */
	int PTZ = 19;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__COST = CAMERA__COST;

	/**
	 * The feature id for the '<em><b>Success Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__SUCCESS_PROB = CAMERA__SUCCESS_PROB;

	/**
	 * The feature id for the '<em><b>Protects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__PROTECTS = CAMERA__PROTECTS;

	/**
	 * The feature id for the '<em><b>Forbidden</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__FORBIDDEN = CAMERA__FORBIDDEN;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__MANDATORY = CAMERA__MANDATORY;

	/**
	 * The feature id for the '<em><b>Counteracts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__COUNTERACTS = CAMERA__COUNTERACTS;

	/**
	 * The feature id for the '<em><b>Exposes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__EXPOSES = CAMERA__EXPOSES;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__MULTIPLICITY = CAMERA__MULTIPLICITY;

	/**
	 * The feature id for the '<em><b>Nature</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__NATURE = CAMERA__NATURE;

	/**
	 * The feature id for the '<em><b>Failure Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__FAILURE_RATE = CAMERA__FAILURE_RATE;

	/**
	 * The feature id for the '<em><b>Application</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__APPLICATION = CAMERA__APPLICATION;

	/**
	 * The feature id for the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__BASE_COMPONENT = CAMERA__BASE_COMPONENT;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__BASE_CLASS = CAMERA__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__RANGE = CAMERA__RANGE;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__LATENCY = CAMERA__LATENCY;

	/**
	 * The feature id for the '<em><b>Fnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__FNR = CAMERA__FNR;

	/**
	 * The feature id for the '<em><b>Fpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__FPR = CAMERA__FPR;

	/**
	 * The feature id for the '<em><b>Trans Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__TRANS_DATA = CAMERA__TRANS_DATA;

	/**
	 * The feature id for the '<em><b>Resolution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__RESOLUTION = CAMERA__RESOLUTION;

	/**
	 * The feature id for the '<em><b>Processing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__PROCESSING = CAMERA__PROCESSING;

	/**
	 * The feature id for the '<em><b>Pan Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__PAN_RANGE = CAMERA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pan Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__PAN_SPEED = CAMERA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tilt Range</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__TILT_RANGE = CAMERA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tilt Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__TILT_SPEED = CAMERA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Zoom</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ__ZOOM = CAMERA_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Ptz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ_FEATURE_COUNT = CAMERA_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Ptz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTZ_OPERATION_COUNT = CAMERA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.impl.ConditionEventImpl <em>Condition Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.impl.ConditionEventImpl
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getConditionEvent()
	 * @generated
	 */
	int CONDITION_EVENT = 20;

	/**
	 * The feature id for the '<em><b>Protections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EVENT__PROTECTIONS = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EVENT__OPERATOR = 1;

	/**
	 * The number of structural features of the '<em>Condition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EVENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_EVENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.OperatorType <em>Operator Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.OperatorType
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getOperatorType()
	 * @generated
	 */
	int OPERATOR_TYPE = 21;

	/**
	 * The meta object id for the '{@link CipVamprofile.BooleanOperator <em>Boolean Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.BooleanOperator
	 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getBooleanOperator()
	 * @generated
	 */
	int BOOLEAN_OPERATOR = 22;


	/**
	 * Returns the meta object for class '{@link CipVamprofile.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see CipVamprofile.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the containment reference '{@link CipVamprofile.Item#getAsset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Asset</em>'.
	 * @see CipVamprofile.Item#getAsset()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Asset();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.Item#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see CipVamprofile.Item#getBase_Classifier()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Base_Classifier();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Physical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical</em>'.
	 * @see CipVamprofile.Physical
	 * @generated
	 */
	EClass getPhysical();

	/**
	 * Returns the meta object for the containment reference '{@link CipVamprofile.Physical#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Shape</em>'.
	 * @see CipVamprofile.Physical#getShape()
	 * @see #getPhysical()
	 * @generated
	 */
	EReference getPhysical_Shape();

	/**
	 * Returns the meta object for the containment reference '{@link CipVamprofile.Physical#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Volume</em>'.
	 * @see CipVamprofile.Physical#getVolume()
	 * @see #getPhysical()
	 * @generated
	 */
	EReference getPhysical_Volume();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Physical#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see CipVamprofile.Physical#getOpacity()
	 * @see #getPhysical()
	 * @generated
	 */
	EAttribute getPhysical_Opacity();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Site</em>'.
	 * @see CipVamprofile.Site
	 * @generated
	 */
	EClass getSite();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see CipVamprofile.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.Interface#getExposures <em>Exposures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Exposures</em>'.
	 * @see CipVamprofile.Interface#getExposures()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Exposures();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object</em>'.
	 * @see CipVamprofile.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.Object#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Requests</em>'.
	 * @see CipVamprofile.Object#getRequests()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Requests();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.Object#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see CipVamprofile.Object#getLocation()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Location();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Object#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see CipVamprofile.Object#getMultiplicity()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Multiplicity();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see CipVamprofile.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.Service#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see CipVamprofile.Service#getBase_UseCase()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_Base_UseCase();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.Service#getProvidedBy <em>Provided By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provided By</em>'.
	 * @see CipVamprofile.Service#getProvidedBy()
	 * @see #getService()
	 * @generated
	 */
	EReference getService_ProvidedBy();

	/**
	 * Returns the meta object for the attribute list '{@link CipVamprofile.Service#getExecProb <em>Exec Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exec Prob</em>'.
	 * @see CipVamprofile.Service#getExecProb()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_ExecProb();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Attack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attack</em>'.
	 * @see CipVamprofile.Attack
	 * @generated
	 */
	EClass getAttack();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Attack#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see CipVamprofile.Attack#getDuration()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_Duration();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Attack#getTactic <em>Tactic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tactic</em>'.
	 * @see CipVamprofile.Attack#getTactic()
	 * @see #getAttack()
	 * @generated
	 */
	EAttribute getAttack_Tactic();

	/**
	 * Returns the meta object for the containment reference '{@link CipVamprofile.Attack#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Threats</em>'.
	 * @see CipVamprofile.Attack#getThreats()
	 * @see #getAttack()
	 * @generated
	 */
	EReference getAttack_Threats();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.Attack#getAttacker <em>Attacker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attacker</em>'.
	 * @see CipVamprofile.Attack#getAttacker()
	 * @see #getAttack()
	 * @generated
	 */
	EReference getAttack_Attacker();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.Attack#getBase_Activity <em>Base Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Activity</em>'.
	 * @see CipVamprofile.Attack#getBase_Activity()
	 * @see #getAttack()
	 * @generated
	 */
	EReference getAttack_Base_Activity();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.Attack#getBase_UseCase <em>Base Use Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Use Case</em>'.
	 * @see CipVamprofile.Attack#getBase_UseCase()
	 * @see #getAttack()
	 * @generated
	 */
	EReference getAttack_Base_UseCase();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Attacker <em>Attacker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attacker</em>'.
	 * @see CipVamprofile.Attacker
	 * @generated
	 */
	EClass getAttacker();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Attacker#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see CipVamprofile.Attacker#getMultiplicity()
	 * @see #getAttacker()
	 * @generated
	 */
	EAttribute getAttacker_Multiplicity();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Attacker#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill</em>'.
	 * @see CipVamprofile.Attacker#getSkill()
	 * @see #getAttacker()
	 * @generated
	 */
	EAttribute getAttacker_Skill();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Attacker#getFirmness <em>Firmness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmness</em>'.
	 * @see CipVamprofile.Attacker#getFirmness()
	 * @see #getAttacker()
	 * @generated
	 */
	EAttribute getAttacker_Firmness();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.Attacker#getBase_Actor <em>Base Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Actor</em>'.
	 * @see CipVamprofile.Attacker#getBase_Actor()
	 * @see #getAttacker()
	 * @generated
	 */
	EReference getAttacker_Base_Actor();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see CipVamprofile.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Action#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see CipVamprofile.Action#getDuration()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Duration();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Action#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see CipVamprofile.Action#getKind()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Kind();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Action#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure</em>'.
	 * @see CipVamprofile.Action#getFailure()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Failure();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.Action#getTriggeredBy <em>Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggered By</em>'.
	 * @see CipVamprofile.Action#getTriggeredBy()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_TriggeredBy();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Action#getOccurenceProb <em>Occurence Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occurence Prob</em>'.
	 * @see CipVamprofile.Action#getOccurenceProb()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_OccurenceProb();

	/**
	 * Returns the meta object for the containment reference list '{@link CipVamprofile.Action#getEffects <em>Effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effects</em>'.
	 * @see CipVamprofile.Action#getEffects()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Effects();

	/**
	 * Returns the meta object for the containment reference list '{@link CipVamprofile.Action#getWeapon <em>Weapon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Weapon</em>'.
	 * @see CipVamprofile.Action#getWeapon()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Weapon();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.Action#getAttacker <em>Attacker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attacker</em>'.
	 * @see CipVamprofile.Action#getAttacker()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Attacker();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.Action#getBase_ActivityNode <em>Base Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Activity Node</em>'.
	 * @see CipVamprofile.Action#getBase_ActivityNode()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Base_ActivityNode();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Protection <em>Protection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protection</em>'.
	 * @see CipVamprofile.Protection
	 * @generated
	 */
	EClass getProtection();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Protection#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see CipVamprofile.Protection#getCost()
	 * @see #getProtection()
	 * @generated
	 */
	EAttribute getProtection_Cost();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Protection#getSuccessProb <em>Success Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Success Prob</em>'.
	 * @see CipVamprofile.Protection#getSuccessProb()
	 * @see #getProtection()
	 * @generated
	 */
	EAttribute getProtection_SuccessProb();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.Protection#getProtects <em>Protects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protects</em>'.
	 * @see CipVamprofile.Protection#getProtects()
	 * @see #getProtection()
	 * @generated
	 */
	EReference getProtection_Protects();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.Protection#getForbidden <em>Forbidden</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Forbidden</em>'.
	 * @see CipVamprofile.Protection#getForbidden()
	 * @see #getProtection()
	 * @generated
	 */
	EReference getProtection_Forbidden();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.Protection#getMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mandatory</em>'.
	 * @see CipVamprofile.Protection#getMandatory()
	 * @see #getProtection()
	 * @generated
	 */
	EReference getProtection_Mandatory();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.Protection#getCounteracts <em>Counteracts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Counteracts</em>'.
	 * @see CipVamprofile.Protection#getCounteracts()
	 * @see #getProtection()
	 * @generated
	 */
	EReference getProtection_Counteracts();

	/**
	 * Returns the meta object for the attribute list '{@link CipVamprofile.Protection#getExposes <em>Exposes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exposes</em>'.
	 * @see CipVamprofile.Protection#getExposes()
	 * @see #getProtection()
	 * @generated
	 */
	EAttribute getProtection_Exposes();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Protection#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see CipVamprofile.Protection#getMultiplicity()
	 * @see #getProtection()
	 * @generated
	 */
	EAttribute getProtection_Multiplicity();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equipment</em>'.
	 * @see CipVamprofile.Equipment
	 * @generated
	 */
	EClass getEquipment();

	/**
	 * Returns the meta object for the attribute list '{@link CipVamprofile.Equipment#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Nature</em>'.
	 * @see CipVamprofile.Equipment#getNature()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_Nature();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Equipment#getFailureRate <em>Failure Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Failure Rate</em>'.
	 * @see CipVamprofile.Equipment#getFailureRate()
	 * @see #getEquipment()
	 * @generated
	 */
	EAttribute getEquipment_FailureRate();

	/**
	 * Returns the meta object for the containment reference '{@link CipVamprofile.Equipment#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Application</em>'.
	 * @see CipVamprofile.Equipment#getApplication()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_Application();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.Equipment#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see CipVamprofile.Equipment#getBase_Component()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_Base_Component();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.Equipment#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see CipVamprofile.Equipment#getBase_Class()
	 * @see #getEquipment()
	 * @generated
	 */
	EReference getEquipment_Base_Class();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Deterrent <em>Deterrent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deterrent</em>'.
	 * @see CipVamprofile.Deterrent
	 * @generated
	 */
	EClass getDeterrent();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Deterrent#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see CipVamprofile.Deterrent#getCondition()
	 * @see #getDeterrent()
	 * @generated
	 */
	EAttribute getDeterrent_Condition();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Barrier <em>Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Barrier</em>'.
	 * @see CipVamprofile.Barrier
	 * @generated
	 */
	EClass getBarrier();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Barrier#getTimeToCross <em>Time To Cross</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time To Cross</em>'.
	 * @see CipVamprofile.Barrier#getTimeToCross()
	 * @see #getBarrier()
	 * @generated
	 */
	EAttribute getBarrier_TimeToCross();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Barrier#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see CipVamprofile.Barrier#getCondition()
	 * @see #getBarrier()
	 * @generated
	 */
	EAttribute getBarrier_Condition();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sensor</em>'.
	 * @see CipVamprofile.Sensor
	 * @generated
	 */
	EClass getSensor();

	/**
	 * Returns the meta object for the containment reference list '{@link CipVamprofile.Sensor#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Range</em>'.
	 * @see CipVamprofile.Sensor#getRange()
	 * @see #getSensor()
	 * @generated
	 */
	EReference getSensor_Range();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Sensor#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Latency</em>'.
	 * @see CipVamprofile.Sensor#getLatency()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Latency();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Sensor#getFnr <em>Fnr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fnr</em>'.
	 * @see CipVamprofile.Sensor#getFnr()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Fnr();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Sensor#getFpr <em>Fpr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fpr</em>'.
	 * @see CipVamprofile.Sensor#getFpr()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_Fpr();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Sensor#getTransData <em>Trans Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Trans Data</em>'.
	 * @see CipVamprofile.Sensor#getTransData()
	 * @see #getSensor()
	 * @generated
	 */
	EAttribute getSensor_TransData();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operator</em>'.
	 * @see CipVamprofile.Operator
	 * @generated
	 */
	EClass getOperator();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Operator#getFirmness <em>Firmness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firmness</em>'.
	 * @see CipVamprofile.Operator#getFirmness()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Firmness();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Operator#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill</em>'.
	 * @see CipVamprofile.Operator#getSkill()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Skill();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Operator#getNature <em>Nature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature</em>'.
	 * @see CipVamprofile.Operator#getNature()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Nature();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Operator#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability</em>'.
	 * @see CipVamprofile.Operator#getAvailability()
	 * @see #getOperator()
	 * @generated
	 */
	EAttribute getOperator_Availability();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.Operator#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see CipVamprofile.Operator#getBase_Class()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.Operator#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see CipVamprofile.Operator#getBase_Component()
	 * @see #getOperator()
	 * @generated
	 */
	EReference getOperator_Base_Component();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.ManagementSystem <em>Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Management System</em>'.
	 * @see CipVamprofile.ManagementSystem
	 * @generated
	 */
	EClass getManagementSystem();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.ManagementSystem#getManages <em>Manages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Manages</em>'.
	 * @see CipVamprofile.ManagementSystem#getManages()
	 * @see #getManagementSystem()
	 * @generated
	 */
	EReference getManagementSystem_Manages();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.ManagementSystem#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see CipVamprofile.ManagementSystem#getBase_Class()
	 * @see #getManagementSystem()
	 * @generated
	 */
	EReference getManagementSystem_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.ManagementSystem#getBase_Component <em>Base Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Component</em>'.
	 * @see CipVamprofile.ManagementSystem#getBase_Component()
	 * @see #getManagementSystem()
	 * @generated
	 */
	EReference getManagementSystem_Base_Component();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol</em>'.
	 * @see CipVamprofile.Protocol
	 * @generated
	 */
	EClass getProtocol();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Protocol#getTriggeredBy <em>Triggered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Triggered By</em>'.
	 * @see CipVamprofile.Protocol#getTriggeredBy()
	 * @see #getProtocol()
	 * @generated
	 */
	EAttribute getProtocol_TriggeredBy();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.Protocol#getBase_Activity <em>Base Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Activity</em>'.
	 * @see CipVamprofile.Protocol#getBase_Activity()
	 * @see #getProtocol()
	 * @generated
	 */
	EReference getProtocol_Base_Activity();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.ProtocolRule <em>Protocol Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Rule</em>'.
	 * @see CipVamprofile.ProtocolRule
	 * @generated
	 */
	EClass getProtocolRule();

	/**
	 * Returns the meta object for the reference '{@link CipVamprofile.ProtocolRule#getBase_ActivityNode <em>Base Activity Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Activity Node</em>'.
	 * @see CipVamprofile.ProtocolRule#getBase_ActivityNode()
	 * @see #getProtocolRule()
	 * @generated
	 */
	EReference getProtocolRule_Base_ActivityNode();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.ProtocolRule#getSupportedBy <em>Supported By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supported By</em>'.
	 * @see CipVamprofile.ProtocolRule#getSupportedBy()
	 * @see #getProtocolRule()
	 * @generated
	 */
	EReference getProtocolRule_SupportedBy();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.ProtocolRule#getExecutedBy <em>Executed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executed By</em>'.
	 * @see CipVamprofile.ProtocolRule#getExecutedBy()
	 * @see #getProtocolRule()
	 * @generated
	 */
	EReference getProtocolRule_ExecutedBy();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Camera</em>'.
	 * @see CipVamprofile.Camera
	 * @generated
	 */
	EClass getCamera();

	/**
	 * Returns the meta object for the attribute list '{@link CipVamprofile.Camera#getResolution <em>Resolution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Resolution</em>'.
	 * @see CipVamprofile.Camera#getResolution()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_Resolution();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.Camera#getProcessing <em>Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Processing</em>'.
	 * @see CipVamprofile.Camera#getProcessing()
	 * @see #getCamera()
	 * @generated
	 */
	EAttribute getCamera_Processing();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.Ptz <em>Ptz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ptz</em>'.
	 * @see CipVamprofile.Ptz
	 * @generated
	 */
	EClass getPtz();

	/**
	 * Returns the meta object for the containment reference list '{@link CipVamprofile.Ptz#getPanRange <em>Pan Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pan Range</em>'.
	 * @see CipVamprofile.Ptz#getPanRange()
	 * @see #getPtz()
	 * @generated
	 */
	EReference getPtz_PanRange();

	/**
	 * Returns the meta object for the containment reference '{@link CipVamprofile.Ptz#getPanSpeed <em>Pan Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pan Speed</em>'.
	 * @see CipVamprofile.Ptz#getPanSpeed()
	 * @see #getPtz()
	 * @generated
	 */
	EReference getPtz_PanSpeed();

	/**
	 * Returns the meta object for the containment reference list '{@link CipVamprofile.Ptz#getTiltRange <em>Tilt Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tilt Range</em>'.
	 * @see CipVamprofile.Ptz#getTiltRange()
	 * @see #getPtz()
	 * @generated
	 */
	EReference getPtz_TiltRange();

	/**
	 * Returns the meta object for the containment reference '{@link CipVamprofile.Ptz#getTiltSpeed <em>Tilt Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tilt Speed</em>'.
	 * @see CipVamprofile.Ptz#getTiltSpeed()
	 * @see #getPtz()
	 * @generated
	 */
	EReference getPtz_TiltSpeed();

	/**
	 * Returns the meta object for the containment reference list '{@link CipVamprofile.Ptz#getZoom <em>Zoom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Zoom</em>'.
	 * @see CipVamprofile.Ptz#getZoom()
	 * @see #getPtz()
	 * @generated
	 */
	EReference getPtz_Zoom();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.ConditionEvent <em>Condition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Event</em>'.
	 * @see CipVamprofile.ConditionEvent
	 * @generated
	 */
	EClass getConditionEvent();

	/**
	 * Returns the meta object for the reference list '{@link CipVamprofile.ConditionEvent#getProtections <em>Protections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Protections</em>'.
	 * @see CipVamprofile.ConditionEvent#getProtections()
	 * @see #getConditionEvent()
	 * @generated
	 */
	EReference getConditionEvent_Protections();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.ConditionEvent#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see CipVamprofile.ConditionEvent#getOperator()
	 * @see #getConditionEvent()
	 * @generated
	 */
	EAttribute getConditionEvent_Operator();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.OperatorType <em>Operator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator Type</em>'.
	 * @see CipVamprofile.OperatorType
	 * @generated
	 */
	EEnum getOperatorType();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.BooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operator</em>'.
	 * @see CipVamprofile.BooleanOperator
	 * @generated
	 */
	EEnum getBooleanOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CipVamprofileFactory getCipVamprofileFactory();

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
		 * The meta object literal for the '{@link CipVamprofile.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.ItemImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Asset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ASSET = eINSTANCE.getItem_Asset();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__BASE_CLASSIFIER = eINSTANCE.getItem_Base_Classifier();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.PhysicalImpl <em>Physical</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.PhysicalImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getPhysical()
		 * @generated
		 */
		EClass PHYSICAL = eINSTANCE.getPhysical();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL__SHAPE = eINSTANCE.getPhysical_Shape();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL__VOLUME = eINSTANCE.getPhysical_Volume();

		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL__OPACITY = eINSTANCE.getPhysical_Opacity();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.SiteImpl <em>Site</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.SiteImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getSite()
		 * @generated
		 */
		EClass SITE = eINSTANCE.getSite();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.InterfaceImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Exposures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__EXPOSURES = eINSTANCE.getInterface_Exposures();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.ObjectImpl <em>Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.ObjectImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__REQUESTS = eINSTANCE.getObject_Requests();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT__LOCATION = eINSTANCE.getObject_Location();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT__MULTIPLICITY = eINSTANCE.getObject_Multiplicity();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.ServiceImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__BASE_USE_CASE = eINSTANCE.getService_Base_UseCase();

		/**
		 * The meta object literal for the '<em><b>Provided By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE__PROVIDED_BY = eINSTANCE.getService_ProvidedBy();

		/**
		 * The meta object literal for the '<em><b>Exec Prob</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__EXEC_PROB = eINSTANCE.getService_ExecProb();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.AttackImpl <em>Attack</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.AttackImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getAttack()
		 * @generated
		 */
		EClass ATTACK = eINSTANCE.getAttack();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__DURATION = eINSTANCE.getAttack_Duration();

		/**
		 * The meta object literal for the '<em><b>Tactic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACK__TACTIC = eINSTANCE.getAttack_Tactic();

		/**
		 * The meta object literal for the '<em><b>Threats</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK__THREATS = eINSTANCE.getAttack_Threats();

		/**
		 * The meta object literal for the '<em><b>Attacker</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK__ATTACKER = eINSTANCE.getAttack_Attacker();

		/**
		 * The meta object literal for the '<em><b>Base Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK__BASE_ACTIVITY = eINSTANCE.getAttack_Base_Activity();

		/**
		 * The meta object literal for the '<em><b>Base Use Case</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACK__BASE_USE_CASE = eINSTANCE.getAttack_Base_UseCase();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.AttackerImpl <em>Attacker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.AttackerImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getAttacker()
		 * @generated
		 */
		EClass ATTACKER = eINSTANCE.getAttacker();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER__MULTIPLICITY = eINSTANCE.getAttacker_Multiplicity();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER__SKILL = eINSTANCE.getAttacker_Skill();

		/**
		 * The meta object literal for the '<em><b>Firmness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTACKER__FIRMNESS = eINSTANCE.getAttacker_Firmness();

		/**
		 * The meta object literal for the '<em><b>Base Actor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACKER__BASE_ACTOR = eINSTANCE.getAttacker_Base_Actor();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.ActionImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__DURATION = eINSTANCE.getAction_Duration();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__KIND = eINSTANCE.getAction_Kind();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__FAILURE = eINSTANCE.getAction_Failure();

		/**
		 * The meta object literal for the '<em><b>Triggered By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__TRIGGERED_BY = eINSTANCE.getAction_TriggeredBy();

		/**
		 * The meta object literal for the '<em><b>Occurence Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__OCCURENCE_PROB = eINSTANCE.getAction_OccurenceProb();

		/**
		 * The meta object literal for the '<em><b>Effects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__EFFECTS = eINSTANCE.getAction_Effects();

		/**
		 * The meta object literal for the '<em><b>Weapon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__WEAPON = eINSTANCE.getAction_Weapon();

		/**
		 * The meta object literal for the '<em><b>Attacker</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ATTACKER = eINSTANCE.getAction_Attacker();

		/**
		 * The meta object literal for the '<em><b>Base Activity Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__BASE_ACTIVITY_NODE = eINSTANCE.getAction_Base_ActivityNode();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.ProtectionImpl <em>Protection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.ProtectionImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getProtection()
		 * @generated
		 */
		EClass PROTECTION = eINSTANCE.getProtection();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION__COST = eINSTANCE.getProtection_Cost();

		/**
		 * The meta object literal for the '<em><b>Success Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION__SUCCESS_PROB = eINSTANCE.getProtection_SuccessProb();

		/**
		 * The meta object literal for the '<em><b>Protects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION__PROTECTS = eINSTANCE.getProtection_Protects();

		/**
		 * The meta object literal for the '<em><b>Forbidden</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION__FORBIDDEN = eINSTANCE.getProtection_Forbidden();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION__MANDATORY = eINSTANCE.getProtection_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Counteracts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION__COUNTERACTS = eINSTANCE.getProtection_Counteracts();

		/**
		 * The meta object literal for the '<em><b>Exposes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION__EXPOSES = eINSTANCE.getProtection_Exposes();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION__MULTIPLICITY = eINSTANCE.getProtection_Multiplicity();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.EquipmentImpl <em>Equipment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.EquipmentImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getEquipment()
		 * @generated
		 */
		EClass EQUIPMENT = eINSTANCE.getEquipment();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__NATURE = eINSTANCE.getEquipment_Nature();

		/**
		 * The meta object literal for the '<em><b>Failure Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EQUIPMENT__FAILURE_RATE = eINSTANCE.getEquipment_FailureRate();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT__APPLICATION = eINSTANCE.getEquipment_Application();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT__BASE_COMPONENT = eINSTANCE.getEquipment_Base_Component();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUIPMENT__BASE_CLASS = eINSTANCE.getEquipment_Base_Class();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.DeterrentImpl <em>Deterrent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.DeterrentImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getDeterrent()
		 * @generated
		 */
		EClass DETERRENT = eINSTANCE.getDeterrent();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETERRENT__CONDITION = eINSTANCE.getDeterrent_Condition();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.BarrierImpl <em>Barrier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.BarrierImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getBarrier()
		 * @generated
		 */
		EClass BARRIER = eINSTANCE.getBarrier();

		/**
		 * The meta object literal for the '<em><b>Time To Cross</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARRIER__TIME_TO_CROSS = eINSTANCE.getBarrier_TimeToCross();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BARRIER__CONDITION = eINSTANCE.getBarrier_Condition();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.SensorImpl <em>Sensor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.SensorImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getSensor()
		 * @generated
		 */
		EClass SENSOR = eINSTANCE.getSensor();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SENSOR__RANGE = eINSTANCE.getSensor_Range();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__LATENCY = eINSTANCE.getSensor_Latency();

		/**
		 * The meta object literal for the '<em><b>Fnr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__FNR = eINSTANCE.getSensor_Fnr();

		/**
		 * The meta object literal for the '<em><b>Fpr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__FPR = eINSTANCE.getSensor_Fpr();

		/**
		 * The meta object literal for the '<em><b>Trans Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SENSOR__TRANS_DATA = eINSTANCE.getSensor_TransData();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.OperatorImpl <em>Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.OperatorImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getOperator()
		 * @generated
		 */
		EClass OPERATOR = eINSTANCE.getOperator();

		/**
		 * The meta object literal for the '<em><b>Firmness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__FIRMNESS = eINSTANCE.getOperator_Firmness();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__SKILL = eINSTANCE.getOperator_Skill();

		/**
		 * The meta object literal for the '<em><b>Nature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__NATURE = eINSTANCE.getOperator_Nature();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATOR__AVAILABILITY = eINSTANCE.getOperator_Availability();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__BASE_CLASS = eINSTANCE.getOperator_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATOR__BASE_COMPONENT = eINSTANCE.getOperator_Base_Component();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.ManagementSystemImpl <em>Management System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.ManagementSystemImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getManagementSystem()
		 * @generated
		 */
		EClass MANAGEMENT_SYSTEM = eINSTANCE.getManagementSystem();

		/**
		 * The meta object literal for the '<em><b>Manages</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGEMENT_SYSTEM__MANAGES = eINSTANCE.getManagementSystem_Manages();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGEMENT_SYSTEM__BASE_CLASS = eINSTANCE.getManagementSystem_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGEMENT_SYSTEM__BASE_COMPONENT = eINSTANCE.getManagementSystem_Base_Component();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.ProtocolImpl <em>Protocol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.ProtocolImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getProtocol()
		 * @generated
		 */
		EClass PROTOCOL = eINSTANCE.getProtocol();

		/**
		 * The meta object literal for the '<em><b>Triggered By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTOCOL__TRIGGERED_BY = eINSTANCE.getProtocol_TriggeredBy();

		/**
		 * The meta object literal for the '<em><b>Base Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL__BASE_ACTIVITY = eINSTANCE.getProtocol_Base_Activity();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.ProtocolRuleImpl <em>Protocol Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.ProtocolRuleImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getProtocolRule()
		 * @generated
		 */
		EClass PROTOCOL_RULE = eINSTANCE.getProtocolRule();

		/**
		 * The meta object literal for the '<em><b>Base Activity Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_RULE__BASE_ACTIVITY_NODE = eINSTANCE.getProtocolRule_Base_ActivityNode();

		/**
		 * The meta object literal for the '<em><b>Supported By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_RULE__SUPPORTED_BY = eINSTANCE.getProtocolRule_SupportedBy();

		/**
		 * The meta object literal for the '<em><b>Executed By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTOCOL_RULE__EXECUTED_BY = eINSTANCE.getProtocolRule_ExecutedBy();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.CameraImpl <em>Camera</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.CameraImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getCamera()
		 * @generated
		 */
		EClass CAMERA = eINSTANCE.getCamera();

		/**
		 * The meta object literal for the '<em><b>Resolution</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__RESOLUTION = eINSTANCE.getCamera_Resolution();

		/**
		 * The meta object literal for the '<em><b>Processing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAMERA__PROCESSING = eINSTANCE.getCamera_Processing();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.PtzImpl <em>Ptz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.PtzImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getPtz()
		 * @generated
		 */
		EClass PTZ = eINSTANCE.getPtz();

		/**
		 * The meta object literal for the '<em><b>Pan Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTZ__PAN_RANGE = eINSTANCE.getPtz_PanRange();

		/**
		 * The meta object literal for the '<em><b>Pan Speed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTZ__PAN_SPEED = eINSTANCE.getPtz_PanSpeed();

		/**
		 * The meta object literal for the '<em><b>Tilt Range</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTZ__TILT_RANGE = eINSTANCE.getPtz_TiltRange();

		/**
		 * The meta object literal for the '<em><b>Tilt Speed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTZ__TILT_SPEED = eINSTANCE.getPtz_TiltSpeed();

		/**
		 * The meta object literal for the '<em><b>Zoom</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PTZ__ZOOM = eINSTANCE.getPtz_Zoom();

		/**
		 * The meta object literal for the '{@link CipVamprofile.impl.ConditionEventImpl <em>Condition Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.impl.ConditionEventImpl
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getConditionEvent()
		 * @generated
		 */
		EClass CONDITION_EVENT = eINSTANCE.getConditionEvent();

		/**
		 * The meta object literal for the '<em><b>Protections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_EVENT__PROTECTIONS = eINSTANCE.getConditionEvent_Protections();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION_EVENT__OPERATOR = eINSTANCE.getConditionEvent_Operator();

		/**
		 * The meta object literal for the '{@link CipVamprofile.OperatorType <em>Operator Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.OperatorType
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getOperatorType()
		 * @generated
		 */
		EEnum OPERATOR_TYPE = eINSTANCE.getOperatorType();

		/**
		 * The meta object literal for the '{@link CipVamprofile.BooleanOperator <em>Boolean Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.BooleanOperator
		 * @see CipVamprofile.impl.CipVamprofilePackageImpl#getBooleanOperator()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATOR = eINSTANCE.getBooleanOperator();

	}

} //CipVamprofilePackage
