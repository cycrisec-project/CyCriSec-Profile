/**
 */
package CipVamprofile;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Object#getRequests <em>Requests</em>}</li>
 *   <li>{@link CipVamprofile.Object#getLocation <em>Location</em>}</li>
 *   <li>{@link CipVamprofile.Object#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getObject()
 * @model
 * @generated
 */
public interface Object extends Physical {
	/**
	 * Returns the value of the '<em><b>Requests</b></em>' reference list.
	 * The list contents are of type {@link CipVamprofile.Service}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' reference list.
	 * @see CipVamprofile.CipVamprofilePackage#getObject_Requests()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Service> getRequests();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Site)
	 * @see CipVamprofile.CipVamprofilePackage#getObject_Location()
	 * @model ordered="false"
	 * @generated
	 */
	Site getLocation();

	/**
	 * Sets the value of the '{@link CipVamprofile.Object#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Site value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see #setMultiplicity(String)
	 * @see CipVamprofile.CipVamprofilePackage#getObject_Multiplicity()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
	 * @generated
	 */
	String getMultiplicity();

	/**
	 * Sets the value of the '{@link CipVamprofile.Object#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(String value);

} // Object
