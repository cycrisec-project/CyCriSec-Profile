/**
 */
package CipVamprofile.impl;

import CipVamprofile.Action;
import CipVamprofile.Attack;
import CipVamprofile.Attacker;
import CipVamprofile.Barrier;
import CipVamprofile.BooleanOperator;
import CipVamprofile.Camera;
import CipVamprofile.CipVamprofileFactory;
import CipVamprofile.CipVamprofilePackage;
import CipVamprofile.ConditionEvent;
import CipVamprofile.Deterrent;
import CipVamprofile.Equipment;
import CipVamprofile.Interface;
import CipVamprofile.ManagementSystem;
import CipVamprofile.Operator;
import CipVamprofile.OperatorType;
import CipVamprofile.Protocol;
import CipVamprofile.ProtocolRule;
import CipVamprofile.Ptz;
import CipVamprofile.Sensor;
import CipVamprofile.Service;
import CipVamprofile.Site;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CipVamprofileFactoryImpl extends EFactoryImpl implements CipVamprofileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CipVamprofileFactory init() {
		try {
			CipVamprofileFactory theCipVamprofileFactory = (CipVamprofileFactory)EPackage.Registry.INSTANCE.getEFactory(CipVamprofilePackage.eNS_URI);
			if (theCipVamprofileFactory != null) {
				return theCipVamprofileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CipVamprofileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CipVamprofileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CipVamprofilePackage.SITE: return createSite();
			case CipVamprofilePackage.INTERFACE: return createInterface();
			case CipVamprofilePackage.OBJECT: return createObject();
			case CipVamprofilePackage.SERVICE: return createService();
			case CipVamprofilePackage.ATTACK: return createAttack();
			case CipVamprofilePackage.ATTACKER: return createAttacker();
			case CipVamprofilePackage.ACTION: return createAction();
			case CipVamprofilePackage.EQUIPMENT: return createEquipment();
			case CipVamprofilePackage.DETERRENT: return createDeterrent();
			case CipVamprofilePackage.BARRIER: return createBarrier();
			case CipVamprofilePackage.SENSOR: return createSensor();
			case CipVamprofilePackage.OPERATOR: return createOperator();
			case CipVamprofilePackage.MANAGEMENT_SYSTEM: return createManagementSystem();
			case CipVamprofilePackage.PROTOCOL: return createProtocol();
			case CipVamprofilePackage.PROTOCOL_RULE: return createProtocolRule();
			case CipVamprofilePackage.CAMERA: return createCamera();
			case CipVamprofilePackage.PTZ: return createPtz();
			case CipVamprofilePackage.CONDITION_EVENT: return createConditionEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CipVamprofilePackage.OPERATOR_TYPE:
				return createOperatorTypeFromString(eDataType, initialValue);
			case CipVamprofilePackage.BOOLEAN_OPERATOR:
				return createBooleanOperatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CipVamprofilePackage.OPERATOR_TYPE:
				return convertOperatorTypeToString(eDataType, instanceValue);
			case CipVamprofilePackage.BOOLEAN_OPERATOR:
				return convertBooleanOperatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Site createSite() {
		SiteImpl site = new SiteImpl();
		return site;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CipVamprofile.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attack createAttack() {
		AttackImpl attack = new AttackImpl();
		return attack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attacker createAttacker() {
		AttackerImpl attacker = new AttackerImpl();
		return attacker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equipment createEquipment() {
		EquipmentImpl equipment = new EquipmentImpl();
		return equipment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deterrent createDeterrent() {
		DeterrentImpl deterrent = new DeterrentImpl();
		return deterrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Barrier createBarrier() {
		BarrierImpl barrier = new BarrierImpl();
		return barrier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensor createSensor() {
		SensorImpl sensor = new SensorImpl();
		return sensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operator createOperator() {
		OperatorImpl operator = new OperatorImpl();
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementSystem createManagementSystem() {
		ManagementSystemImpl managementSystem = new ManagementSystemImpl();
		return managementSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol createProtocol() {
		ProtocolImpl protocol = new ProtocolImpl();
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolRule createProtocolRule() {
		ProtocolRuleImpl protocolRule = new ProtocolRuleImpl();
		return protocolRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Camera createCamera() {
		CameraImpl camera = new CameraImpl();
		return camera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ptz createPtz() {
		PtzImpl ptz = new PtzImpl();
		return ptz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionEvent createConditionEvent() {
		ConditionEventImpl conditionEvent = new ConditionEventImpl();
		return conditionEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorType createOperatorTypeFromString(EDataType eDataType, String initialValue) {
		OperatorType result = OperatorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOperatorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperator createBooleanOperatorFromString(EDataType eDataType, String initialValue) {
		BooleanOperator result = BooleanOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CipVamprofilePackage getCipVamprofilePackage() {
		return (CipVamprofilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CipVamprofilePackage getPackage() {
		return CipVamprofilePackage.eINSTANCE;
	}

} //CipVamprofileFactoryImpl
