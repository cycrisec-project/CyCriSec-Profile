/**
 */
package CipVamprofile.impl;

import CipVamprofile.CipVamprofilePackage;
import CipVamprofile.Operator;
import CipVamprofile.Protection;
import CipVamprofile.ProtocolRule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.impl.ProtocolRuleImpl#getBase_ActivityNode <em>Base Activity Node</em>}</li>
 *   <li>{@link CipVamprofile.impl.ProtocolRuleImpl#getSupportedBy <em>Supported By</em>}</li>
 *   <li>{@link CipVamprofile.impl.ProtocolRuleImpl#getExecutedBy <em>Executed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtocolRuleImpl extends ProtectionImpl implements ProtocolRule {
	/**
	 * The cached value of the '{@link #getBase_ActivityNode() <em>Base Activity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ActivityNode()
	 * @generated
	 * @ordered
	 */
	protected ActivityNode base_ActivityNode;

	/**
	 * The cached value of the '{@link #getSupportedBy() <em>Supported By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Protection> supportedBy;

	/**
	 * The cached value of the '{@link #getExecutedBy() <em>Executed By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Operator> executedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CipVamprofilePackage.Literals.PROTOCOL_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode getBase_ActivityNode() {
		if (base_ActivityNode != null && base_ActivityNode.eIsProxy()) {
			InternalEObject oldBase_ActivityNode = (InternalEObject)base_ActivityNode;
			base_ActivityNode = (ActivityNode)eResolveProxy(oldBase_ActivityNode);
			if (base_ActivityNode != oldBase_ActivityNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CipVamprofilePackage.PROTOCOL_RULE__BASE_ACTIVITY_NODE, oldBase_ActivityNode, base_ActivityNode));
			}
		}
		return base_ActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityNode basicGetBase_ActivityNode() {
		return base_ActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ActivityNode(ActivityNode newBase_ActivityNode) {
		ActivityNode oldBase_ActivityNode = base_ActivityNode;
		base_ActivityNode = newBase_ActivityNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.PROTOCOL_RULE__BASE_ACTIVITY_NODE, oldBase_ActivityNode, base_ActivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Protection> getSupportedBy() {
		if (supportedBy == null) {
			supportedBy = new EObjectResolvingEList<Protection>(Protection.class, this, CipVamprofilePackage.PROTOCOL_RULE__SUPPORTED_BY);
		}
		return supportedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operator> getExecutedBy() {
		if (executedBy == null) {
			executedBy = new EObjectResolvingEList<Operator>(Operator.class, this, CipVamprofilePackage.PROTOCOL_RULE__EXECUTED_BY);
		}
		return executedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CipVamprofilePackage.PROTOCOL_RULE__BASE_ACTIVITY_NODE:
				if (resolve) return getBase_ActivityNode();
				return basicGetBase_ActivityNode();
			case CipVamprofilePackage.PROTOCOL_RULE__SUPPORTED_BY:
				return getSupportedBy();
			case CipVamprofilePackage.PROTOCOL_RULE__EXECUTED_BY:
				return getExecutedBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CipVamprofilePackage.PROTOCOL_RULE__BASE_ACTIVITY_NODE:
				setBase_ActivityNode((ActivityNode)newValue);
				return;
			case CipVamprofilePackage.PROTOCOL_RULE__SUPPORTED_BY:
				getSupportedBy().clear();
				getSupportedBy().addAll((Collection<? extends Protection>)newValue);
				return;
			case CipVamprofilePackage.PROTOCOL_RULE__EXECUTED_BY:
				getExecutedBy().clear();
				getExecutedBy().addAll((Collection<? extends Operator>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CipVamprofilePackage.PROTOCOL_RULE__BASE_ACTIVITY_NODE:
				setBase_ActivityNode((ActivityNode)null);
				return;
			case CipVamprofilePackage.PROTOCOL_RULE__SUPPORTED_BY:
				getSupportedBy().clear();
				return;
			case CipVamprofilePackage.PROTOCOL_RULE__EXECUTED_BY:
				getExecutedBy().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CipVamprofilePackage.PROTOCOL_RULE__BASE_ACTIVITY_NODE:
				return base_ActivityNode != null;
			case CipVamprofilePackage.PROTOCOL_RULE__SUPPORTED_BY:
				return supportedBy != null && !supportedBy.isEmpty();
			case CipVamprofilePackage.PROTOCOL_RULE__EXECUTED_BY:
				return executedBy != null && !executedBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProtocolRuleImpl
