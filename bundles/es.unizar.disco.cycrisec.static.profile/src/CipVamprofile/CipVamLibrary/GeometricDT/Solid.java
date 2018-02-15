/**
 */
package CipVamprofile.CipVamLibrary.GeometricDT;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Solid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Solid#getBase <em>Base</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Solid#getHeight <em>Height</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Solid#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getSolid()
 * @model
 * @generated
 */
public interface Solid extends EObject {
	/**
	 * Returns the value of the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base</em>' containment reference.
	 * @see #setBase(Shape)
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getSolid_Base()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Shape getBase();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.GeometricDT.Solid#getBase <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base</em>' containment reference.
	 * @see #getBase()
	 * @generated
	 */
	void setBase(Shape value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getSolid_Height()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Length" ordered="false"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.GeometricDT.Solid#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(String)
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getSolid_Volume()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getVolume();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.GeometricDT.Solid#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(String value);

} // Solid
