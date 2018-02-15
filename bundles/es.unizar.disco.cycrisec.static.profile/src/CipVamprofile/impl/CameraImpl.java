/**
 */
package CipVamprofile.impl;

import CipVamprofile.Camera;

import CipVamprofile.CipVamLibrary.BasicDT.ProcessingType;

import CipVamprofile.CipVamprofilePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.impl.CameraImpl#getResolution <em>Resolution</em>}</li>
 *   <li>{@link CipVamprofile.impl.CameraImpl#getProcessing <em>Processing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CameraImpl extends SensorImpl implements Camera {
	/**
	 * The cached value of the '{@link #getResolution() <em>Resolution</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResolution()
	 * @generated
	 * @ordered
	 */
	protected EList<String> resolution;

	/**
	 * The default value of the '{@link #getProcessing() <em>Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessing()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingType PROCESSING_EDEFAULT = ProcessingType.ANALOGIC;

	/**
	 * The cached value of the '{@link #getProcessing() <em>Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessing()
	 * @generated
	 * @ordered
	 */
	protected ProcessingType processing = PROCESSING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CameraImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CipVamprofilePackage.Literals.CAMERA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getResolution() {
		if (resolution == null) {
			resolution = new EDataTypeUniqueEList<String>(String.class, this, CipVamprofilePackage.CAMERA__RESOLUTION);
		}
		return resolution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingType getProcessing() {
		return processing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessing(ProcessingType newProcessing) {
		ProcessingType oldProcessing = processing;
		processing = newProcessing == null ? PROCESSING_EDEFAULT : newProcessing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.CAMERA__PROCESSING, oldProcessing, processing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CipVamprofilePackage.CAMERA__RESOLUTION:
				return getResolution();
			case CipVamprofilePackage.CAMERA__PROCESSING:
				return getProcessing();
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
			case CipVamprofilePackage.CAMERA__RESOLUTION:
				getResolution().clear();
				getResolution().addAll((Collection<? extends String>)newValue);
				return;
			case CipVamprofilePackage.CAMERA__PROCESSING:
				setProcessing((ProcessingType)newValue);
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
			case CipVamprofilePackage.CAMERA__RESOLUTION:
				getResolution().clear();
				return;
			case CipVamprofilePackage.CAMERA__PROCESSING:
				setProcessing(PROCESSING_EDEFAULT);
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
			case CipVamprofilePackage.CAMERA__RESOLUTION:
				return resolution != null && !resolution.isEmpty();
			case CipVamprofilePackage.CAMERA__PROCESSING:
				return processing != PROCESSING_EDEFAULT;
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
		result.append(" (resolution: ");
		result.append(resolution);
		result.append(", processing: ");
		result.append(processing);
		result.append(')');
		return result.toString();
	}

} //CameraImpl
