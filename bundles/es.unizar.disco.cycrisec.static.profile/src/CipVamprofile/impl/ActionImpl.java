/**
 */
package CipVamprofile.impl;

import CipVamprofile.Action;
import CipVamprofile.Attacker;

import CipVamprofile.CipVamLibrary.BasicDT.ActionKind;

import CipVamprofile.CipVamLibrary.StructuredDT.Impairment;
import CipVamprofile.CipVamLibrary.StructuredDT.Weapon;

import CipVamprofile.CipVamprofilePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.ActivityNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.impl.ActionImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link CipVamprofile.impl.ActionImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link CipVamprofile.impl.ActionImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link CipVamprofile.impl.ActionImpl#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link CipVamprofile.impl.ActionImpl#getOccurenceProb <em>Occurence Prob</em>}</li>
 *   <li>{@link CipVamprofile.impl.ActionImpl#getEffects <em>Effects</em>}</li>
 *   <li>{@link CipVamprofile.impl.ActionImpl#getWeapon <em>Weapon</em>}</li>
 *   <li>{@link CipVamprofile.impl.ActionImpl#getAttacker <em>Attacker</em>}</li>
 *   <li>{@link CipVamprofile.impl.ActionImpl#getBase_ActivityNode <em>Base Activity Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final ActionKind KIND_EDEFAULT = ActionKind.ACTION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected ActionKind kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getFailure() <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected static final String FAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected String failure = FAILURE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriggeredBy() <em>Triggered By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> triggeredBy;

	/**
	 * The default value of the '{@link #getOccurenceProb() <em>Occurence Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurenceProb()
	 * @generated
	 * @ordered
	 */
	protected static final String OCCURENCE_PROB_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOccurenceProb() <em>Occurence Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurenceProb()
	 * @generated
	 * @ordered
	 */
	protected String occurenceProb = OCCURENCE_PROB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEffects() <em>Effects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffects()
	 * @generated
	 * @ordered
	 */
	protected EList<Impairment> effects;

	/**
	 * The cached value of the '{@link #getWeapon() <em>Weapon</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeapon()
	 * @generated
	 * @ordered
	 */
	protected EList<Weapon> weapon;

	/**
	 * The cached value of the '{@link #getAttacker() <em>Attacker</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttacker()
	 * @generated
	 * @ordered
	 */
	protected EList<Attacker> attacker;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CipVamprofilePackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ACTION__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(ActionKind newKind) {
		ActionKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ACTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFailure() {
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailure(String newFailure) {
		String oldFailure = failure;
		failure = newFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ACTION__FAILURE, oldFailure, failure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getTriggeredBy() {
		if (triggeredBy == null) {
			triggeredBy = new EObjectResolvingEList<Action>(Action.class, this, CipVamprofilePackage.ACTION__TRIGGERED_BY);
		}
		return triggeredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOccurenceProb() {
		return occurenceProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurenceProb(String newOccurenceProb) {
		String oldOccurenceProb = occurenceProb;
		occurenceProb = newOccurenceProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ACTION__OCCURENCE_PROB, oldOccurenceProb, occurenceProb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Impairment> getEffects() {
		if (effects == null) {
			effects = new EObjectContainmentEList<Impairment>(Impairment.class, this, CipVamprofilePackage.ACTION__EFFECTS);
		}
		return effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Weapon> getWeapon() {
		if (weapon == null) {
			weapon = new EObjectContainmentEList<Weapon>(Weapon.class, this, CipVamprofilePackage.ACTION__WEAPON);
		}
		return weapon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attacker> getAttacker() {
		if (attacker == null) {
			attacker = new EObjectResolvingEList<Attacker>(Attacker.class, this, CipVamprofilePackage.ACTION__ATTACKER);
		}
		return attacker;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CipVamprofilePackage.ACTION__BASE_ACTIVITY_NODE, oldBase_ActivityNode, base_ActivityNode));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ACTION__BASE_ACTIVITY_NODE, oldBase_ActivityNode, base_ActivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CipVamprofilePackage.ACTION__EFFECTS:
				return ((InternalEList<?>)getEffects()).basicRemove(otherEnd, msgs);
			case CipVamprofilePackage.ACTION__WEAPON:
				return ((InternalEList<?>)getWeapon()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CipVamprofilePackage.ACTION__DURATION:
				return getDuration();
			case CipVamprofilePackage.ACTION__KIND:
				return getKind();
			case CipVamprofilePackage.ACTION__FAILURE:
				return getFailure();
			case CipVamprofilePackage.ACTION__TRIGGERED_BY:
				return getTriggeredBy();
			case CipVamprofilePackage.ACTION__OCCURENCE_PROB:
				return getOccurenceProb();
			case CipVamprofilePackage.ACTION__EFFECTS:
				return getEffects();
			case CipVamprofilePackage.ACTION__WEAPON:
				return getWeapon();
			case CipVamprofilePackage.ACTION__ATTACKER:
				return getAttacker();
			case CipVamprofilePackage.ACTION__BASE_ACTIVITY_NODE:
				if (resolve) return getBase_ActivityNode();
				return basicGetBase_ActivityNode();
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
			case CipVamprofilePackage.ACTION__DURATION:
				setDuration((String)newValue);
				return;
			case CipVamprofilePackage.ACTION__KIND:
				setKind((ActionKind)newValue);
				return;
			case CipVamprofilePackage.ACTION__FAILURE:
				setFailure((String)newValue);
				return;
			case CipVamprofilePackage.ACTION__TRIGGERED_BY:
				getTriggeredBy().clear();
				getTriggeredBy().addAll((Collection<? extends Action>)newValue);
				return;
			case CipVamprofilePackage.ACTION__OCCURENCE_PROB:
				setOccurenceProb((String)newValue);
				return;
			case CipVamprofilePackage.ACTION__EFFECTS:
				getEffects().clear();
				getEffects().addAll((Collection<? extends Impairment>)newValue);
				return;
			case CipVamprofilePackage.ACTION__WEAPON:
				getWeapon().clear();
				getWeapon().addAll((Collection<? extends Weapon>)newValue);
				return;
			case CipVamprofilePackage.ACTION__ATTACKER:
				getAttacker().clear();
				getAttacker().addAll((Collection<? extends Attacker>)newValue);
				return;
			case CipVamprofilePackage.ACTION__BASE_ACTIVITY_NODE:
				setBase_ActivityNode((ActivityNode)newValue);
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
			case CipVamprofilePackage.ACTION__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case CipVamprofilePackage.ACTION__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CipVamprofilePackage.ACTION__FAILURE:
				setFailure(FAILURE_EDEFAULT);
				return;
			case CipVamprofilePackage.ACTION__TRIGGERED_BY:
				getTriggeredBy().clear();
				return;
			case CipVamprofilePackage.ACTION__OCCURENCE_PROB:
				setOccurenceProb(OCCURENCE_PROB_EDEFAULT);
				return;
			case CipVamprofilePackage.ACTION__EFFECTS:
				getEffects().clear();
				return;
			case CipVamprofilePackage.ACTION__WEAPON:
				getWeapon().clear();
				return;
			case CipVamprofilePackage.ACTION__ATTACKER:
				getAttacker().clear();
				return;
			case CipVamprofilePackage.ACTION__BASE_ACTIVITY_NODE:
				setBase_ActivityNode((ActivityNode)null);
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
			case CipVamprofilePackage.ACTION__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case CipVamprofilePackage.ACTION__KIND:
				return kind != KIND_EDEFAULT;
			case CipVamprofilePackage.ACTION__FAILURE:
				return FAILURE_EDEFAULT == null ? failure != null : !FAILURE_EDEFAULT.equals(failure);
			case CipVamprofilePackage.ACTION__TRIGGERED_BY:
				return triggeredBy != null && !triggeredBy.isEmpty();
			case CipVamprofilePackage.ACTION__OCCURENCE_PROB:
				return OCCURENCE_PROB_EDEFAULT == null ? occurenceProb != null : !OCCURENCE_PROB_EDEFAULT.equals(occurenceProb);
			case CipVamprofilePackage.ACTION__EFFECTS:
				return effects != null && !effects.isEmpty();
			case CipVamprofilePackage.ACTION__WEAPON:
				return weapon != null && !weapon.isEmpty();
			case CipVamprofilePackage.ACTION__ATTACKER:
				return attacker != null && !attacker.isEmpty();
			case CipVamprofilePackage.ACTION__BASE_ACTIVITY_NODE:
				return base_ActivityNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (duration: ");
		result.append(duration);
		result.append(", kind: ");
		result.append(kind);
		result.append(", failure: ");
		result.append(failure);
		result.append(", occurenceProb: ");
		result.append(occurenceProb);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
