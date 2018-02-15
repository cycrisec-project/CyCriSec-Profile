/**
 */
package CipVamprofile.impl;

import CipVamprofile.CipVamLibrary.BasicDT.TransmissionTech;

import CipVamprofile.CipVamLibrary.GeometricDT.Shape;

import CipVamprofile.CipVamprofilePackage;
import CipVamprofile.Sensor;

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
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.impl.SensorImpl#getRange <em>Range</em>}</li>
 *   <li>{@link CipVamprofile.impl.SensorImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link CipVamprofile.impl.SensorImpl#getFnr <em>Fnr</em>}</li>
 *   <li>{@link CipVamprofile.impl.SensorImpl#getFpr <em>Fpr</em>}</li>
 *   <li>{@link CipVamprofile.impl.SensorImpl#getTransData <em>Trans Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SensorImpl extends EquipmentImpl implements Sensor {
	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected EList<Shape> range;

	/**
	 * The default value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected static final String LATENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected String latency = LATENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFnr() <em>Fnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFnr()
	 * @generated
	 * @ordered
	 */
	protected static final String FNR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFnr() <em>Fnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFnr()
	 * @generated
	 * @ordered
	 */
	protected String fnr = FNR_EDEFAULT;

	/**
	 * The default value of the '{@link #getFpr() <em>Fpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpr()
	 * @generated
	 * @ordered
	 */
	protected static final String FPR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFpr() <em>Fpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFpr()
	 * @generated
	 * @ordered
	 */
	protected String fpr = FPR_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransData() <em>Trans Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransData()
	 * @generated
	 * @ordered
	 */
	protected static final TransmissionTech TRANS_DATA_EDEFAULT = TransmissionTech.WIRED;

	/**
	 * The cached value of the '{@link #getTransData() <em>Trans Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransData()
	 * @generated
	 * @ordered
	 */
	protected TransmissionTech transData = TRANS_DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SensorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CipVamprofilePackage.Literals.SENSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Shape> getRange() {
		if (range == null) {
			range = new EObjectContainmentEList<Shape>(Shape.class, this, CipVamprofilePackage.SENSOR__RANGE);
		}
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(String newLatency) {
		String oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.SENSOR__LATENCY, oldLatency, latency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFnr() {
		return fnr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFnr(String newFnr) {
		String oldFnr = fnr;
		fnr = newFnr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.SENSOR__FNR, oldFnr, fnr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFpr() {
		return fpr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFpr(String newFpr) {
		String oldFpr = fpr;
		fpr = newFpr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.SENSOR__FPR, oldFpr, fpr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionTech getTransData() {
		return transData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransData(TransmissionTech newTransData) {
		TransmissionTech oldTransData = transData;
		transData = newTransData == null ? TRANS_DATA_EDEFAULT : newTransData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.SENSOR__TRANS_DATA, oldTransData, transData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CipVamprofilePackage.SENSOR__RANGE:
				return ((InternalEList<?>)getRange()).basicRemove(otherEnd, msgs);
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
			case CipVamprofilePackage.SENSOR__RANGE:
				return getRange();
			case CipVamprofilePackage.SENSOR__LATENCY:
				return getLatency();
			case CipVamprofilePackage.SENSOR__FNR:
				return getFnr();
			case CipVamprofilePackage.SENSOR__FPR:
				return getFpr();
			case CipVamprofilePackage.SENSOR__TRANS_DATA:
				return getTransData();
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
			case CipVamprofilePackage.SENSOR__RANGE:
				getRange().clear();
				getRange().addAll((Collection<? extends Shape>)newValue);
				return;
			case CipVamprofilePackage.SENSOR__LATENCY:
				setLatency((String)newValue);
				return;
			case CipVamprofilePackage.SENSOR__FNR:
				setFnr((String)newValue);
				return;
			case CipVamprofilePackage.SENSOR__FPR:
				setFpr((String)newValue);
				return;
			case CipVamprofilePackage.SENSOR__TRANS_DATA:
				setTransData((TransmissionTech)newValue);
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
			case CipVamprofilePackage.SENSOR__RANGE:
				getRange().clear();
				return;
			case CipVamprofilePackage.SENSOR__LATENCY:
				setLatency(LATENCY_EDEFAULT);
				return;
			case CipVamprofilePackage.SENSOR__FNR:
				setFnr(FNR_EDEFAULT);
				return;
			case CipVamprofilePackage.SENSOR__FPR:
				setFpr(FPR_EDEFAULT);
				return;
			case CipVamprofilePackage.SENSOR__TRANS_DATA:
				setTransData(TRANS_DATA_EDEFAULT);
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
			case CipVamprofilePackage.SENSOR__RANGE:
				return range != null && !range.isEmpty();
			case CipVamprofilePackage.SENSOR__LATENCY:
				return LATENCY_EDEFAULT == null ? latency != null : !LATENCY_EDEFAULT.equals(latency);
			case CipVamprofilePackage.SENSOR__FNR:
				return FNR_EDEFAULT == null ? fnr != null : !FNR_EDEFAULT.equals(fnr);
			case CipVamprofilePackage.SENSOR__FPR:
				return FPR_EDEFAULT == null ? fpr != null : !FPR_EDEFAULT.equals(fpr);
			case CipVamprofilePackage.SENSOR__TRANS_DATA:
				return transData != TRANS_DATA_EDEFAULT;
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
		result.append(" (latency: ");
		result.append(latency);
		result.append(", fnr: ");
		result.append(fnr);
		result.append(", fpr: ");
		result.append(fpr);
		result.append(", transData: ");
		result.append(transData);
		result.append(')');
		return result.toString();
	}

} //SensorImpl
