/**
 */
package CipVamprofile;

import org.eclipse.uml2.uml.Activity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Protocol#getTriggeredBy <em>Triggered By</em>}</li>
 *   <li>{@link CipVamprofile.Protocol#getBase_Activity <em>Base Activity</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getProtocol()
 * @model
 * @generated
 */
public interface Protocol extends Protection {
	/**
	 * Returns the value of the '<em><b>Triggered By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggered By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered By</em>' attribute.
	 * @see #setTriggeredBy(String)
	 * @see CipVamprofile.CipVamprofilePackage#getProtocol_TriggeredBy()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.VSL_Expression" required="true" ordered="false"
	 * @generated
	 */
	String getTriggeredBy();

	/**
	 * Sets the value of the '{@link CipVamprofile.Protocol#getTriggeredBy <em>Triggered By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Triggered By</em>' attribute.
	 * @see #getTriggeredBy()
	 * @generated
	 */
	void setTriggeredBy(String value);

	/**
	 * Returns the value of the '<em><b>Base Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Activity</em>' reference.
	 * @see #setBase_Activity(Activity)
	 * @see CipVamprofile.CipVamprofilePackage#getProtocol_Base_Activity()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Activity getBase_Activity();

	/**
	 * Sets the value of the '{@link CipVamprofile.Protocol#getBase_Activity <em>Base Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Activity</em>' reference.
	 * @see #getBase_Activity()
	 * @generated
	 */
	void setBase_Activity(Activity value);

} // Protocol
