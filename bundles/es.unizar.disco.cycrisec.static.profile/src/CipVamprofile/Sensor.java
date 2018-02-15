/**
 */
package CipVamprofile;

import CipVamprofile.CipVamLibrary.BasicDT.TransmissionTech;

import CipVamprofile.CipVamLibrary.GeometricDT.Shape;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Sensor#getRange <em>Range</em>}</li>
 *   <li>{@link CipVamprofile.Sensor#getLatency <em>Latency</em>}</li>
 *   <li>{@link CipVamprofile.Sensor#getFnr <em>Fnr</em>}</li>
 *   <li>{@link CipVamprofile.Sensor#getFpr <em>Fpr</em>}</li>
 *   <li>{@link CipVamprofile.Sensor#getTransData <em>Trans Data</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends Equipment {
	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference list.
	 * The list contents are of type {@link CipVamprofile.CipVamLibrary.GeometricDT.Shape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getSensor_Range()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Shape> getRange();

	/**
	 * Returns the value of the '<em><b>Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latency</em>' attribute.
	 * @see #setLatency(String)
	 * @see CipVamprofile.CipVamprofilePackage#getSensor_Latency()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	String getLatency();

	/**
	 * Sets the value of the '{@link CipVamprofile.Sensor#getLatency <em>Latency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latency</em>' attribute.
	 * @see #getLatency()
	 * @generated
	 */
	void setLatency(String value);

	/**
	 * Returns the value of the '<em><b>Fnr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fnr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fnr</em>' attribute.
	 * @see #setFnr(String)
	 * @see CipVamprofile.CipVamprofilePackage#getSensor_Fnr()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getFnr();

	/**
	 * Sets the value of the '{@link CipVamprofile.Sensor#getFnr <em>Fnr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fnr</em>' attribute.
	 * @see #getFnr()
	 * @generated
	 */
	void setFnr(String value);

	/**
	 * Returns the value of the '<em><b>Fpr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fpr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fpr</em>' attribute.
	 * @see #setFpr(String)
	 * @see CipVamprofile.CipVamprofilePackage#getSensor_Fpr()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getFpr();

	/**
	 * Sets the value of the '{@link CipVamprofile.Sensor#getFpr <em>Fpr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fpr</em>' attribute.
	 * @see #getFpr()
	 * @generated
	 */
	void setFpr(String value);

	/**
	 * Returns the value of the '<em><b>Trans Data</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.BasicDT.TransmissionTech}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trans Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trans Data</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.TransmissionTech
	 * @see #setTransData(TransmissionTech)
	 * @see CipVamprofile.CipVamprofilePackage#getSensor_TransData()
	 * @model ordered="false"
	 * @generated
	 */
	TransmissionTech getTransData();

	/**
	 * Sets the value of the '{@link CipVamprofile.Sensor#getTransData <em>Trans Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trans Data</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.TransmissionTech
	 * @see #getTransData()
	 * @generated
	 */
	void setTransData(TransmissionTech value);

} // Sensor
