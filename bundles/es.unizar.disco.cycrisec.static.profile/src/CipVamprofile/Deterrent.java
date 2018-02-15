/**
 */
package CipVamprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deterrent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Deterrent#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getDeterrent()
 * @model
 * @generated
 */
public interface Deterrent extends Equipment {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see CipVamprofile.CipVamprofilePackage#getDeterrent_Condition()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.VSL_Expression" ordered="false"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link CipVamprofile.Deterrent#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // Deterrent
