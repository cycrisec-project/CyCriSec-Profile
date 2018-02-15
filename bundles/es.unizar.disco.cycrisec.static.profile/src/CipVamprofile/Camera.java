/**
 */
package CipVamprofile;

import CipVamprofile.CipVamLibrary.BasicDT.ProcessingType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Camera#getResolution <em>Resolution</em>}</li>
 *   <li>{@link CipVamprofile.Camera#getProcessing <em>Processing</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getCamera()
 * @model
 * @generated
 */
public interface Camera extends Sensor {
	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resolution</em>' attribute list.
	 * @see CipVamprofile.CipVamprofilePackage#getCamera_Resolution()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.String" ordered="false"
	 * @generated
	 */
	EList<String> getResolution();

	/**
	 * Returns the value of the '<em><b>Processing</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.BasicDT.ProcessingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processing</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ProcessingType
	 * @see #setProcessing(ProcessingType)
	 * @see CipVamprofile.CipVamprofilePackage#getCamera_Processing()
	 * @model ordered="false"
	 * @generated
	 */
	ProcessingType getProcessing();

	/**
	 * Sets the value of the '{@link CipVamprofile.Camera#getProcessing <em>Processing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processing</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ProcessingType
	 * @see #getProcessing()
	 * @generated
	 */
	void setProcessing(ProcessingType value);

} // Camera
