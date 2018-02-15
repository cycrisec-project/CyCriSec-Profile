/**
 */
package CipVamprofile.impl;

import CipVamprofile.Attacker;

import CipVamprofile.CipVamLibrary.BasicDT.Level;

import CipVamprofile.CipVamprofilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Actor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attacker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.impl.AttackerImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link CipVamprofile.impl.AttackerImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link CipVamprofile.impl.AttackerImpl#getFirmness <em>Firmness</em>}</li>
 *   <li>{@link CipVamprofile.impl.AttackerImpl#getBase_Actor <em>Base Actor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttackerImpl extends MinimalEObjectImpl.Container implements Attacker {
	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final String MULTIPLICITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected String multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkill() <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected static final Level SKILL_EDEFAULT = Level.VERY_LOW;

	/**
	 * The cached value of the '{@link #getSkill() <em>Skill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkill()
	 * @generated
	 * @ordered
	 */
	protected Level skill = SKILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getFirmness() <em>Firmness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmness()
	 * @generated
	 * @ordered
	 */
	protected static final Level FIRMNESS_EDEFAULT = Level.VERY_LOW;

	/**
	 * The cached value of the '{@link #getFirmness() <em>Firmness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirmness()
	 * @generated
	 * @ordered
	 */
	protected Level firmness = FIRMNESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Actor() <em>Base Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Actor()
	 * @generated
	 * @ordered
	 */
	protected Actor base_Actor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttackerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CipVamprofilePackage.Literals.ATTACKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(String newMultiplicity) {
		String oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ATTACKER__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getSkill() {
		return skill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkill(Level newSkill) {
		Level oldSkill = skill;
		skill = newSkill == null ? SKILL_EDEFAULT : newSkill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ATTACKER__SKILL, oldSkill, skill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Level getFirmness() {
		return firmness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirmness(Level newFirmness) {
		Level oldFirmness = firmness;
		firmness = newFirmness == null ? FIRMNESS_EDEFAULT : newFirmness;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ATTACKER__FIRMNESS, oldFirmness, firmness));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor getBase_Actor() {
		if (base_Actor != null && base_Actor.eIsProxy()) {
			InternalEObject oldBase_Actor = (InternalEObject)base_Actor;
			base_Actor = (Actor)eResolveProxy(oldBase_Actor);
			if (base_Actor != oldBase_Actor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CipVamprofilePackage.ATTACKER__BASE_ACTOR, oldBase_Actor, base_Actor));
			}
		}
		return base_Actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Actor basicGetBase_Actor() {
		return base_Actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Actor(Actor newBase_Actor) {
		Actor oldBase_Actor = base_Actor;
		base_Actor = newBase_Actor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.ATTACKER__BASE_ACTOR, oldBase_Actor, base_Actor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CipVamprofilePackage.ATTACKER__MULTIPLICITY:
				return getMultiplicity();
			case CipVamprofilePackage.ATTACKER__SKILL:
				return getSkill();
			case CipVamprofilePackage.ATTACKER__FIRMNESS:
				return getFirmness();
			case CipVamprofilePackage.ATTACKER__BASE_ACTOR:
				if (resolve) return getBase_Actor();
				return basicGetBase_Actor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CipVamprofilePackage.ATTACKER__MULTIPLICITY:
				setMultiplicity((String)newValue);
				return;
			case CipVamprofilePackage.ATTACKER__SKILL:
				setSkill((Level)newValue);
				return;
			case CipVamprofilePackage.ATTACKER__FIRMNESS:
				setFirmness((Level)newValue);
				return;
			case CipVamprofilePackage.ATTACKER__BASE_ACTOR:
				setBase_Actor((Actor)newValue);
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
			case CipVamprofilePackage.ATTACKER__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
			case CipVamprofilePackage.ATTACKER__SKILL:
				setSkill(SKILL_EDEFAULT);
				return;
			case CipVamprofilePackage.ATTACKER__FIRMNESS:
				setFirmness(FIRMNESS_EDEFAULT);
				return;
			case CipVamprofilePackage.ATTACKER__BASE_ACTOR:
				setBase_Actor((Actor)null);
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
			case CipVamprofilePackage.ATTACKER__MULTIPLICITY:
				return MULTIPLICITY_EDEFAULT == null ? multiplicity != null : !MULTIPLICITY_EDEFAULT.equals(multiplicity);
			case CipVamprofilePackage.ATTACKER__SKILL:
				return skill != SKILL_EDEFAULT;
			case CipVamprofilePackage.ATTACKER__FIRMNESS:
				return firmness != FIRMNESS_EDEFAULT;
			case CipVamprofilePackage.ATTACKER__BASE_ACTOR:
				return base_Actor != null;
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
		result.append(" (multiplicity: ");
		result.append(multiplicity);
		result.append(", skill: ");
		result.append(skill);
		result.append(", firmness: ");
		result.append(firmness);
		result.append(')');
		return result.toString();
	}

} //AttackerImpl
