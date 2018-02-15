/**
 */
package CipVamprofile.impl;

import CipVamprofile.CipVamLibrary.GeometricDT.Shape;
import CipVamprofile.CipVamLibrary.GeometricDT.Solid;

import CipVamprofile.CipVamprofilePackage;
import CipVamprofile.Physical;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.impl.PhysicalImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link CipVamprofile.impl.PhysicalImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link CipVamprofile.impl.PhysicalImpl#getOpacity <em>Opacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PhysicalImpl extends ItemImpl implements Physical {
	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected Shape shape;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected Solid volume;

	/**
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final String OPACITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected String opacity = OPACITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CipVamprofilePackage.Literals.PHYSICAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetShape(Shape newShape, NotificationChain msgs) {
		Shape oldShape = shape;
		shape = newShape;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.PHYSICAL__SHAPE, oldShape, newShape);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(Shape newShape) {
		if (newShape != shape) {
			NotificationChain msgs = null;
			if (shape != null)
				msgs = ((InternalEObject)shape).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CipVamprofilePackage.PHYSICAL__SHAPE, null, msgs);
			if (newShape != null)
				msgs = ((InternalEObject)newShape).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CipVamprofilePackage.PHYSICAL__SHAPE, null, msgs);
			msgs = basicSetShape(newShape, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.PHYSICAL__SHAPE, newShape, newShape));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Solid getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVolume(Solid newVolume, NotificationChain msgs) {
		Solid oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.PHYSICAL__VOLUME, oldVolume, newVolume);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(Solid newVolume) {
		if (newVolume != volume) {
			NotificationChain msgs = null;
			if (volume != null)
				msgs = ((InternalEObject)volume).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CipVamprofilePackage.PHYSICAL__VOLUME, null, msgs);
			if (newVolume != null)
				msgs = ((InternalEObject)newVolume).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CipVamprofilePackage.PHYSICAL__VOLUME, null, msgs);
			msgs = basicSetVolume(newVolume, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.PHYSICAL__VOLUME, newVolume, newVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOpacity() {
		return opacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpacity(String newOpacity) {
		String oldOpacity = opacity;
		opacity = newOpacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.PHYSICAL__OPACITY, oldOpacity, opacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CipVamprofilePackage.PHYSICAL__SHAPE:
				return basicSetShape(null, msgs);
			case CipVamprofilePackage.PHYSICAL__VOLUME:
				return basicSetVolume(null, msgs);
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
			case CipVamprofilePackage.PHYSICAL__SHAPE:
				return getShape();
			case CipVamprofilePackage.PHYSICAL__VOLUME:
				return getVolume();
			case CipVamprofilePackage.PHYSICAL__OPACITY:
				return getOpacity();
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
			case CipVamprofilePackage.PHYSICAL__SHAPE:
				setShape((Shape)newValue);
				return;
			case CipVamprofilePackage.PHYSICAL__VOLUME:
				setVolume((Solid)newValue);
				return;
			case CipVamprofilePackage.PHYSICAL__OPACITY:
				setOpacity((String)newValue);
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
			case CipVamprofilePackage.PHYSICAL__SHAPE:
				setShape((Shape)null);
				return;
			case CipVamprofilePackage.PHYSICAL__VOLUME:
				setVolume((Solid)null);
				return;
			case CipVamprofilePackage.PHYSICAL__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
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
			case CipVamprofilePackage.PHYSICAL__SHAPE:
				return shape != null;
			case CipVamprofilePackage.PHYSICAL__VOLUME:
				return volume != null;
			case CipVamprofilePackage.PHYSICAL__OPACITY:
				return OPACITY_EDEFAULT == null ? opacity != null : !OPACITY_EDEFAULT.equals(opacity);
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
		result.append(" (opacity: ");
		result.append(opacity);
		result.append(')');
		return result.toString();
	}

} //PhysicalImpl
