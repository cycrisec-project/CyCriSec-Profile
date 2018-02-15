/**
 */
package CipVamprofile.CipVamLibrary.StructuredDT;

import CipVamprofile.CipVamLibrary.BasicDT.ZoomType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zoom</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Zoom#getValue <em>Value</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.StructuredDT.Zoom#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getZoom()
 * @model
 * @generated
 */
public interface Zoom extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getZoom_Value()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.String" required="true" ordered="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.Zoom#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.BasicDT.ZoomType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ZoomType
	 * @see #setType(ZoomType)
	 * @see CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage#getZoom_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ZoomType getType();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.StructuredDT.Zoom#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.BasicDT.ZoomType
	 * @see #getType()
	 * @generated
	 */
	void setType(ZoomType value);

} // Zoom
