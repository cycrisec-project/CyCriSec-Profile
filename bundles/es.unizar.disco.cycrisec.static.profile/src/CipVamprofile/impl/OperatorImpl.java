/**
 */
package CipVamprofile.impl;

import CipVamprofile.CipVamLibrary.BasicDT.Level;

import CipVamprofile.CipVamprofilePackage;
import CipVamprofile.Operator;
import CipVamprofile.OperatorType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Component;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.impl.OperatorImpl#getFirmness <em>Firmness</em>}</li>
 *   <li>{@link CipVamprofile.impl.OperatorImpl#getSkill <em>Skill</em>}</li>
 *   <li>{@link CipVamprofile.impl.OperatorImpl#getNature <em>Nature</em>}</li>
 *   <li>{@link CipVamprofile.impl.OperatorImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link CipVamprofile.impl.OperatorImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link CipVamprofile.impl.OperatorImpl#getBase_Component <em>Base Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatorImpl extends ProtectionImpl implements Operator {
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
	 * The default value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected static final OperatorType NATURE_EDEFAULT = OperatorType.HUMAN;

	/**
	 * The cached value of the '{@link #getNature() <em>Nature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature()
	 * @generated
	 * @ordered
	 */
	protected OperatorType nature = NATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected String availability = AVAILABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getBase_Component() <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Component()
	 * @generated
	 * @ordered
	 */
	protected Component base_Component;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CipVamprofilePackage.Literals.OPERATOR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.OPERATOR__FIRMNESS, oldFirmness, firmness));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.OPERATOR__SKILL, oldSkill, skill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatorType getNature() {
		return nature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNature(OperatorType newNature) {
		OperatorType oldNature = nature;
		nature = newNature == null ? NATURE_EDEFAULT : newNature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.OPERATOR__NATURE, oldNature, nature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(String newAvailability) {
		String oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.OPERATOR__AVAILABILITY, oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CipVamprofilePackage.OPERATOR__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.OPERATOR__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component getBase_Component() {
		if (base_Component != null && base_Component.eIsProxy()) {
			InternalEObject oldBase_Component = (InternalEObject)base_Component;
			base_Component = (Component)eResolveProxy(oldBase_Component);
			if (base_Component != oldBase_Component) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CipVamprofilePackage.OPERATOR__BASE_COMPONENT, oldBase_Component, base_Component));
			}
		}
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component basicGetBase_Component() {
		return base_Component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Component(Component newBase_Component) {
		Component oldBase_Component = base_Component;
		base_Component = newBase_Component;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.OPERATOR__BASE_COMPONENT, oldBase_Component, base_Component));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CipVamprofilePackage.OPERATOR__FIRMNESS:
				return getFirmness();
			case CipVamprofilePackage.OPERATOR__SKILL:
				return getSkill();
			case CipVamprofilePackage.OPERATOR__NATURE:
				return getNature();
			case CipVamprofilePackage.OPERATOR__AVAILABILITY:
				return getAvailability();
			case CipVamprofilePackage.OPERATOR__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case CipVamprofilePackage.OPERATOR__BASE_COMPONENT:
				if (resolve) return getBase_Component();
				return basicGetBase_Component();
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
			case CipVamprofilePackage.OPERATOR__FIRMNESS:
				setFirmness((Level)newValue);
				return;
			case CipVamprofilePackage.OPERATOR__SKILL:
				setSkill((Level)newValue);
				return;
			case CipVamprofilePackage.OPERATOR__NATURE:
				setNature((OperatorType)newValue);
				return;
			case CipVamprofilePackage.OPERATOR__AVAILABILITY:
				setAvailability((String)newValue);
				return;
			case CipVamprofilePackage.OPERATOR__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case CipVamprofilePackage.OPERATOR__BASE_COMPONENT:
				setBase_Component((Component)newValue);
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
			case CipVamprofilePackage.OPERATOR__FIRMNESS:
				setFirmness(FIRMNESS_EDEFAULT);
				return;
			case CipVamprofilePackage.OPERATOR__SKILL:
				setSkill(SKILL_EDEFAULT);
				return;
			case CipVamprofilePackage.OPERATOR__NATURE:
				setNature(NATURE_EDEFAULT);
				return;
			case CipVamprofilePackage.OPERATOR__AVAILABILITY:
				setAvailability(AVAILABILITY_EDEFAULT);
				return;
			case CipVamprofilePackage.OPERATOR__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case CipVamprofilePackage.OPERATOR__BASE_COMPONENT:
				setBase_Component((Component)null);
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
			case CipVamprofilePackage.OPERATOR__FIRMNESS:
				return firmness != FIRMNESS_EDEFAULT;
			case CipVamprofilePackage.OPERATOR__SKILL:
				return skill != SKILL_EDEFAULT;
			case CipVamprofilePackage.OPERATOR__NATURE:
				return nature != NATURE_EDEFAULT;
			case CipVamprofilePackage.OPERATOR__AVAILABILITY:
				return AVAILABILITY_EDEFAULT == null ? availability != null : !AVAILABILITY_EDEFAULT.equals(availability);
			case CipVamprofilePackage.OPERATOR__BASE_CLASS:
				return base_Class != null;
			case CipVamprofilePackage.OPERATOR__BASE_COMPONENT:
				return base_Component != null;
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
		result.append(" (firmness: ");
		result.append(firmness);
		result.append(", skill: ");
		result.append(skill);
		result.append(", nature: ");
		result.append(nature);
		result.append(", availability: ");
		result.append(availability);
		result.append(')');
		return result.toString();
	}

} //OperatorImpl
