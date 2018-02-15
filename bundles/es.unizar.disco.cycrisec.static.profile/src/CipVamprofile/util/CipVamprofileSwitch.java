/**
 */
package CipVamprofile.util;

import CipVamprofile.Action;
import CipVamprofile.Attack;
import CipVamprofile.Attacker;
import CipVamprofile.Barrier;
import CipVamprofile.Camera;
import CipVamprofile.CipVamprofilePackage;
import CipVamprofile.ConditionEvent;
import CipVamprofile.Deterrent;
import CipVamprofile.Equipment;
import CipVamprofile.Interface;
import CipVamprofile.Item;
import CipVamprofile.ManagementSystem;
import CipVamprofile.Operator;
import CipVamprofile.Physical;
import CipVamprofile.Protection;
import CipVamprofile.Protocol;
import CipVamprofile.ProtocolRule;
import CipVamprofile.Ptz;
import CipVamprofile.Sensor;
import CipVamprofile.Service;
import CipVamprofile.Site;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see CipVamprofile.CipVamprofilePackage
 * @generated
 */
public class CipVamprofileSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CipVamprofilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CipVamprofileSwitch() {
		if (modelPackage == null) {
			modelPackage = CipVamprofilePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CipVamprofilePackage.ITEM: {
				Item item = (Item)theEObject;
				T result = caseItem(item);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.PHYSICAL: {
				Physical physical = (Physical)theEObject;
				T result = casePhysical(physical);
				if (result == null) result = caseItem(physical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.SITE: {
				Site site = (Site)theEObject;
				T result = caseSite(site);
				if (result == null) result = casePhysical(site);
				if (result == null) result = caseItem(site);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.INTERFACE: {
				Interface interface_ = (Interface)theEObject;
				T result = caseInterface(interface_);
				if (result == null) result = casePhysical(interface_);
				if (result == null) result = caseItem(interface_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.OBJECT: {
				CipVamprofile.Object object = (CipVamprofile.Object)theEObject;
				T result = caseObject(object);
				if (result == null) result = casePhysical(object);
				if (result == null) result = caseItem(object);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseItem(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.ATTACK: {
				Attack attack = (Attack)theEObject;
				T result = caseAttack(attack);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.ATTACKER: {
				Attacker attacker = (Attacker)theEObject;
				T result = caseAttacker(attacker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.PROTECTION: {
				Protection protection = (Protection)theEObject;
				T result = caseProtection(protection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.EQUIPMENT: {
				Equipment equipment = (Equipment)theEObject;
				T result = caseEquipment(equipment);
				if (result == null) result = caseProtection(equipment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.DETERRENT: {
				Deterrent deterrent = (Deterrent)theEObject;
				T result = caseDeterrent(deterrent);
				if (result == null) result = caseEquipment(deterrent);
				if (result == null) result = caseProtection(deterrent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.BARRIER: {
				Barrier barrier = (Barrier)theEObject;
				T result = caseBarrier(barrier);
				if (result == null) result = caseEquipment(barrier);
				if (result == null) result = caseProtection(barrier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.SENSOR: {
				Sensor sensor = (Sensor)theEObject;
				T result = caseSensor(sensor);
				if (result == null) result = caseEquipment(sensor);
				if (result == null) result = caseProtection(sensor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.OPERATOR: {
				Operator operator = (Operator)theEObject;
				T result = caseOperator(operator);
				if (result == null) result = caseProtection(operator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.MANAGEMENT_SYSTEM: {
				ManagementSystem managementSystem = (ManagementSystem)theEObject;
				T result = caseManagementSystem(managementSystem);
				if (result == null) result = caseProtection(managementSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.PROTOCOL: {
				Protocol protocol = (Protocol)theEObject;
				T result = caseProtocol(protocol);
				if (result == null) result = caseProtection(protocol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.PROTOCOL_RULE: {
				ProtocolRule protocolRule = (ProtocolRule)theEObject;
				T result = caseProtocolRule(protocolRule);
				if (result == null) result = caseProtection(protocolRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.CAMERA: {
				Camera camera = (Camera)theEObject;
				T result = caseCamera(camera);
				if (result == null) result = caseSensor(camera);
				if (result == null) result = caseEquipment(camera);
				if (result == null) result = caseProtection(camera);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.PTZ: {
				Ptz ptz = (Ptz)theEObject;
				T result = casePtz(ptz);
				if (result == null) result = caseCamera(ptz);
				if (result == null) result = caseSensor(ptz);
				if (result == null) result = caseEquipment(ptz);
				if (result == null) result = caseProtection(ptz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CipVamprofilePackage.CONDITION_EVENT: {
				ConditionEvent conditionEvent = (ConditionEvent)theEObject;
				T result = caseConditionEvent(conditionEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItem(Item object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysical(Physical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Site</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Site</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSite(Site object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterface(Interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(CipVamprofile.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attack</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttack(Attack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attacker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attacker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttacker(Attacker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtection(Protection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equipment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquipment(Equipment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deterrent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deterrent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeterrent(Deterrent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Barrier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Barrier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBarrier(Barrier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensor(Sensor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperator(Operator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Management System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Management System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagementSystem(ManagementSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocol(Protocol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProtocolRule(ProtocolRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Camera</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCamera(Camera object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ptz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ptz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePtz(Ptz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionEvent(ConditionEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CipVamprofileSwitch
