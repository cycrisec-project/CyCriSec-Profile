/**
 */
package CipVamprofile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Barrier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Barrier#getTimeToCross <em>Time To Cross</em>}</li>
 *   <li>{@link CipVamprofile.Barrier#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getBarrier()
 * @model
 * @generated
 */
public interface Barrier extends Equipment {
	/**
	 * Returns the value of the '<em><b>Time To Cross</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time To Cross</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time To Cross</em>' attribute.
	 * @see #setTimeToCross(String)
	 * @see CipVamprofile.CipVamprofilePackage#getBarrier_TimeToCross()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	String getTimeToCross();

	/**
	 * Sets the value of the '{@link CipVamprofile.Barrier#getTimeToCross <em>Time To Cross</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time To Cross</em>' attribute.
	 * @see #getTimeToCross()
	 * @generated
	 */
	void setTimeToCross(String value);

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
	 * @see CipVamprofile.CipVamprofilePackage#getBarrier_Condition()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.VSL_Expression" ordered="false"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link CipVamprofile.Barrier#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

} // Barrier
