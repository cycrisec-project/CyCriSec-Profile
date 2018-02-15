/**
 */
package CipVamprofile;

import CipVamprofile.CipVamLibrary.GeometricDT.Shape;
import CipVamprofile.CipVamLibrary.GeometricDT.Solid;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Physical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.Physical#getShape <em>Shape</em>}</li>
 *   <li>{@link CipVamprofile.Physical#getVolume <em>Volume</em>}</li>
 *   <li>{@link CipVamprofile.Physical#getOpacity <em>Opacity</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamprofilePackage#getPhysical()
 * @model abstract="true"
 * @generated
 */
public interface Physical extends Item {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' containment reference.
	 * @see #setShape(Shape)
	 * @see CipVamprofile.CipVamprofilePackage#getPhysical_Shape()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Shape getShape();

	/**
	 * Sets the value of the '{@link CipVamprofile.Physical#getShape <em>Shape</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' containment reference.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(Shape value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Volume</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' containment reference.
	 * @see #setVolume(Solid)
	 * @see CipVamprofile.CipVamprofilePackage#getPhysical_Volume()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Solid getVolume();

	/**
	 * Sets the value of the '{@link CipVamprofile.Physical#getVolume <em>Volume</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' containment reference.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(Solid value);

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #setOpacity(String)
	 * @see CipVamprofile.CipVamprofilePackage#getPhysical_Opacity()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Boolean" ordered="false"
	 * @generated
	 */
	String getOpacity();

	/**
	 * Sets the value of the '{@link CipVamprofile.Physical#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(String value);

} // Physical
