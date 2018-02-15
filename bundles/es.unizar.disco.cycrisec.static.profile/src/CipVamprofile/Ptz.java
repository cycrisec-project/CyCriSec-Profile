/**
 */
package CipVamprofile;

import CipVamprofile.CipVamLibrary.GeometricDT.Angle;

import CipVamprofile.CipVamLibrary.StructuredDT.SpeedAngular;
import CipVamprofile.CipVamLibrary.StructuredDT.Zoom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ptz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Ptz#getPanRange <em>Pan Range</em>}</li>
 *   <li>{@link CipVamprofile.Ptz#getPanSpeed <em>Pan Speed</em>}</li>
 *   <li>{@link CipVamprofile.Ptz#getTiltRange <em>Tilt Range</em>}</li>
 *   <li>{@link CipVamprofile.Ptz#getTiltSpeed <em>Tilt Speed</em>}</li>
 *   <li>{@link CipVamprofile.Ptz#getZoom <em>Zoom</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getPtz()
 * @model
 * @generated
 */
public interface Ptz extends Camera {
	/**
	 * Returns the value of the '<em><b>Pan Range</b></em>' containment reference list.
	 * The list contents are of type {@link CipVamprofile.CipVamLibrary.GeometricDT.Angle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pan Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pan Range</em>' containment reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getPtz_PanRange()
	 * @model containment="true" upper="2" ordered="false"
	 * @generated
	 */
	EList<Angle> getPanRange();

	/**
	 * Returns the value of the '<em><b>Pan Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pan Speed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pan Speed</em>' containment reference.
	 * @see #setPanSpeed(SpeedAngular)
	 * @see CipVamprofile.CipVamprofilePackage#getPtz_PanSpeed()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SpeedAngular getPanSpeed();

	/**
	 * Sets the value of the '{@link CipVamprofile.Ptz#getPanSpeed <em>Pan Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pan Speed</em>' containment reference.
	 * @see #getPanSpeed()
	 * @generated
	 */
	void setPanSpeed(SpeedAngular value);

	/**
	 * Returns the value of the '<em><b>Tilt Range</b></em>' containment reference list.
	 * The list contents are of type {@link CipVamprofile.CipVamLibrary.GeometricDT.Angle}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tilt Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt Range</em>' containment reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getPtz_TiltRange()
	 * @model containment="true" upper="2" ordered="false"
	 * @generated
	 */
	EList<Angle> getTiltRange();

	/**
	 * Returns the value of the '<em><b>Tilt Speed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tilt Speed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tilt Speed</em>' containment reference.
	 * @see #setTiltSpeed(SpeedAngular)
	 * @see CipVamprofile.CipVamprofilePackage#getPtz_TiltSpeed()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	SpeedAngular getTiltSpeed();

	/**
	 * Sets the value of the '{@link CipVamprofile.Ptz#getTiltSpeed <em>Tilt Speed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tilt Speed</em>' containment reference.
	 * @see #getTiltSpeed()
	 * @generated
	 */
	void setTiltSpeed(SpeedAngular value);

	/**
	 * Returns the value of the '<em><b>Zoom</b></em>' containment reference list.
	 * The list contents are of type {@link CipVamprofile.CipVamLibrary.StructuredDT.Zoom}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zoom</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zoom</em>' containment reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getPtz_Zoom()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Zoom> getZoom();

} // Ptz
