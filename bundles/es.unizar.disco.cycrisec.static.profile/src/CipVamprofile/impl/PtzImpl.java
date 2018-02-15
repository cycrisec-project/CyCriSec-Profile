/**
 */
package CipVamprofile.impl;

import CipVamprofile.CipVamLibrary.GeometricDT.Angle;

import CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular;
import CipVamprofile.CipVamLibrary.StructuredDT.Zoom;

import CipVamprofile.CipVamprofilePackage;
import CipVamprofile.Ptz;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ptz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.impl.PtzImpl#getPanRange <em>Pan Range</em>}</li>
 *   <li>{@link CipVamprofile.impl.PtzImpl#getPanSpeed <em>Pan Speed</em>}</li>
 *   <li>{@link CipVamprofile.impl.PtzImpl#getTiltRange <em>Tilt Range</em>}</li>
 *   <li>{@link CipVamprofile.impl.PtzImpl#getTiltSpeed <em>Tilt Speed</em>}</li>
 *   <li>{@link CipVamprofile.impl.PtzImpl#getZoom <em>Zoom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PtzImpl extends CameraImpl implements Ptz {
	/**
	 * The cached value of the '{@link #getPanRange() <em>Pan Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanRange()
	 * @generated
	 * @ordered
	 */
	protected EList<Angle> panRange;

	/**
	 * The cached value of the '{@link #getPanSpeed() <em>Pan Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPanSpeed()
	 * @generated
	 * @ordered
	 */
	protected SpeedAngular panSpeed;

	/**
	 * The cached value of the '{@link #getTiltRange() <em>Tilt Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiltRange()
	 * @generated
	 * @ordered
	 */
	protected EList<Angle> tiltRange;

	/**
	 * The cached value of the '{@link #getTiltSpeed() <em>Tilt Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiltSpeed()
	 * @generated
	 * @ordered
	 */
	protected SpeedAngular tiltSpeed;

	/**
	 * The cached value of the '{@link #getZoom() <em>Zoom</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZoom()
	 * @generated
	 * @ordered
	 */
	protected EList<Zoom> zoom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PtzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CipVamprofilePackage.Literals.PTZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Angle> getPanRange() {
		if (panRange == null) {
			panRange = new EObjectContainmentEList<Angle>(Angle.class, this, CipVamprofilePackage.PTZ__PAN_RANGE);
		}
		return panRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedAngular getPanSpeed() {
		return panSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPanSpeed(SpeedAngular newPanSpeed, NotificationChain msgs) {
		SpeedAngular oldPanSpeed = panSpeed;
		panSpeed = newPanSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.PTZ__PAN_SPEED, oldPanSpeed, newPanSpeed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPanSpeed(SpeedAngular newPanSpeed) {
		if (newPanSpeed != panSpeed) {
			NotificationChain msgs = null;
			if (panSpeed != null)
				msgs = ((InternalEObject)panSpeed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CipVamprofilePackage.PTZ__PAN_SPEED, null, msgs);
			if (newPanSpeed != null)
				msgs = ((InternalEObject)newPanSpeed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CipVamprofilePackage.PTZ__PAN_SPEED, null, msgs);
			msgs = basicSetPanSpeed(newPanSpeed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.PTZ__PAN_SPEED, newPanSpeed, newPanSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Angle> getTiltRange() {
		if (tiltRange == null) {
			tiltRange = new EObjectContainmentEList<Angle>(Angle.class, this, CipVamprofilePackage.PTZ__TILT_RANGE);
		}
		return tiltRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpeedAngular getTiltSpeed() {
		return tiltSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTiltSpeed(SpeedAngular newTiltSpeed, NotificationChain msgs) {
		SpeedAngular oldTiltSpeed = tiltSpeed;
		tiltSpeed = newTiltSpeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.PTZ__TILT_SPEED, oldTiltSpeed, newTiltSpeed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTiltSpeed(SpeedAngular newTiltSpeed) {
		if (newTiltSpeed != tiltSpeed) {
			NotificationChain msgs = null;
			if (tiltSpeed != null)
				msgs = ((InternalEObject)tiltSpeed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CipVamprofilePackage.PTZ__TILT_SPEED, null, msgs);
			if (newTiltSpeed != null)
				msgs = ((InternalEObject)newTiltSpeed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CipVamprofilePackage.PTZ__TILT_SPEED, null, msgs);
			msgs = basicSetTiltSpeed(newTiltSpeed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.PTZ__TILT_SPEED, newTiltSpeed, newTiltSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Zoom> getZoom() {
		if (zoom == null) {
			zoom = new EObjectContainmentEList<Zoom>(Zoom.class, this, CipVamprofilePackage.PTZ__ZOOM);
		}
		return zoom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CipVamprofilePackage.PTZ__PAN_RANGE:
				return ((InternalEList<?>)getPanRange()).basicRemove(otherEnd, msgs);
			case CipVamprofilePackage.PTZ__PAN_SPEED:
				return basicSetPanSpeed(null, msgs);
			case CipVamprofilePackage.PTZ__TILT_RANGE:
				return ((InternalEList<?>)getTiltRange()).basicRemove(otherEnd, msgs);
			case CipVamprofilePackage.PTZ__TILT_SPEED:
				return basicSetTiltSpeed(null, msgs);
			case CipVamprofilePackage.PTZ__ZOOM:
				return ((InternalEList<?>)getZoom()).basicRemove(otherEnd, msgs);
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
			case CipVamprofilePackage.PTZ__PAN_RANGE:
				return getPanRange();
			case CipVamprofilePackage.PTZ__PAN_SPEED:
				return getPanSpeed();
			case CipVamprofilePackage.PTZ__TILT_RANGE:
				return getTiltRange();
			case CipVamprofilePackage.PTZ__TILT_SPEED:
				return getTiltSpeed();
			case CipVamprofilePackage.PTZ__ZOOM:
				return getZoom();
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
			case CipVamprofilePackage.PTZ__PAN_RANGE:
				getPanRange().clear();
				getPanRange().addAll((Collection<? extends Angle>)newValue);
				return;
			case CipVamprofilePackage.PTZ__PAN_SPEED:
				setPanSpeed((SpeedAngular)newValue);
				return;
			case CipVamprofilePackage.PTZ__TILT_RANGE:
				getTiltRange().clear();
				getTiltRange().addAll((Collection<? extends Angle>)newValue);
				return;
			case CipVamprofilePackage.PTZ__TILT_SPEED:
				setTiltSpeed((SpeedAngular)newValue);
				return;
			case CipVamprofilePackage.PTZ__ZOOM:
				getZoom().clear();
				getZoom().addAll((Collection<? extends Zoom>)newValue);
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
			case CipVamprofilePackage.PTZ__PAN_RANGE:
				getPanRange().clear();
				return;
			case CipVamprofilePackage.PTZ__PAN_SPEED:
				setPanSpeed((SpeedAngular)null);
				return;
			case CipVamprofilePackage.PTZ__TILT_RANGE:
				getTiltRange().clear();
				return;
			case CipVamprofilePackage.PTZ__TILT_SPEED:
				setTiltSpeed((SpeedAngular)null);
				return;
			case CipVamprofilePackage.PTZ__ZOOM:
				getZoom().clear();
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
			case CipVamprofilePackage.PTZ__PAN_RANGE:
				return panRange != null && !panRange.isEmpty();
			case CipVamprofilePackage.PTZ__PAN_SPEED:
				return panSpeed != null;
			case CipVamprofilePackage.PTZ__TILT_RANGE:
				return tiltRange != null && !tiltRange.isEmpty();
			case CipVamprofilePackage.PTZ__TILT_SPEED:
				return tiltSpeed != null;
			case CipVamprofilePackage.PTZ__ZOOM:
				return zoom != null && !zoom.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PtzImpl
