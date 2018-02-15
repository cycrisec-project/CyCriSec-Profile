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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see CipVamprofile.CipVamprofilePackage
 * @generated
 */
public class CipVamprofileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CipVamprofilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CipVamprofileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CipVamprofilePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CipVamprofileSwitch<Adapter> modelSwitch =
		new CipVamprofileSwitch<Adapter>() {
			@Override
			public Adapter caseItem(Item object) {
				return createItemAdapter();
			}
			@Override
			public Adapter casePhysical(Physical object) {
				return createPhysicalAdapter();
			}
			@Override
			public Adapter caseSite(Site object) {
				return createSiteAdapter();
			}
			@Override
			public Adapter caseInterface(Interface object) {
				return createInterfaceAdapter();
			}
			@Override
			public Adapter caseObject(CipVamprofile.Object object) {
				return createObjectAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseAttack(Attack object) {
				return createAttackAdapter();
			}
			@Override
			public Adapter caseAttacker(Attacker object) {
				return createAttackerAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseProtection(Protection object) {
				return createProtectionAdapter();
			}
			@Override
			public Adapter caseEquipment(Equipment object) {
				return createEquipmentAdapter();
			}
			@Override
			public Adapter caseDeterrent(Deterrent object) {
				return createDeterrentAdapter();
			}
			@Override
			public Adapter caseBarrier(Barrier object) {
				return createBarrierAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseOperator(Operator object) {
				return createOperatorAdapter();
			}
			@Override
			public Adapter caseManagementSystem(ManagementSystem object) {
				return createManagementSystemAdapter();
			}
			@Override
			public Adapter caseProtocol(Protocol object) {
				return createProtocolAdapter();
			}
			@Override
			public Adapter caseProtocolRule(ProtocolRule object) {
				return createProtocolRuleAdapter();
			}
			@Override
			public Adapter caseCamera(Camera object) {
				return createCameraAdapter();
			}
			@Override
			public Adapter casePtz(Ptz object) {
				return createPtzAdapter();
			}
			@Override
			public Adapter caseConditionEvent(ConditionEvent object) {
				return createConditionEventAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Item
	 * @generated
	 */
	public Adapter createItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Physical <em>Physical</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Physical
	 * @generated
	 */
	public Adapter createPhysicalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Site <em>Site</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Site
	 * @generated
	 */
	public Adapter createSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Attack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Attack
	 * @generated
	 */
	public Adapter createAttackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Attacker <em>Attacker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Attacker
	 * @generated
	 */
	public Adapter createAttackerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Protection <em>Protection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Protection
	 * @generated
	 */
	public Adapter createProtectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Equipment <em>Equipment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Equipment
	 * @generated
	 */
	public Adapter createEquipmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Deterrent <em>Deterrent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Deterrent
	 * @generated
	 */
	public Adapter createDeterrentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Barrier <em>Barrier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Barrier
	 * @generated
	 */
	public Adapter createBarrierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Operator
	 * @generated
	 */
	public Adapter createOperatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.ManagementSystem <em>Management System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.ManagementSystem
	 * @generated
	 */
	public Adapter createManagementSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Protocol <em>Protocol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Protocol
	 * @generated
	 */
	public Adapter createProtocolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.ProtocolRule <em>Protocol Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.ProtocolRule
	 * @generated
	 */
	public Adapter createProtocolRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Camera <em>Camera</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Camera
	 * @generated
	 */
	public Adapter createCameraAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.Ptz <em>Ptz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.Ptz
	 * @generated
	 */
	public Adapter createPtzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link CipVamprofile.ConditionEvent <em>Condition Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see CipVamprofile.ConditionEvent
	 * @generated
	 */
	public Adapter createConditionEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CipVamprofileAdapterFactory
