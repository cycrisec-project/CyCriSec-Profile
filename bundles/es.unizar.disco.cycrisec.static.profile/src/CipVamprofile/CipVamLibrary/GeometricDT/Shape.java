/**
 */
package CipVamprofile.CipVamLibrary.GeometricDT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getType <em>Type</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getVertices <em>Vertices</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getArea <em>Area</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getPerimeter <em>Perimeter</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getCentre <em>Centre</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getLength <em>Length</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getWidth <em>Width</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getRadius <em>Radius</em>}</li>
 *   <li>{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getShape()
 * @model
 * @generated
 */
public interface Shape extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link CipVamprofile.CipVamLibrary.GeometricDT.PolygonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.PolygonType
	 * @see #setType(PolygonType)
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getShape_Type()
	 * @model ordered="false"
	 * @generated
	 */
	PolygonType getType();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.PolygonType
	 * @see #getType()
	 * @generated
	 */
	void setType(PolygonType value);

	/**
	 * Returns the value of the '<em><b>Vertices</b></em>' containment reference list.
	 * The list contents are of type {@link CipVamprofile.CipVamLibrary.GeometricDT.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertices</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertices</em>' containment reference list.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getShape_Vertices()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Point> getVertices();

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Area</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see #setArea(String)
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getShape_Area()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Area" ordered="false"
	 * @generated
	 */
	String getArea();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getArea <em>Area</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area</em>' attribute.
	 * @see #getArea()
	 * @generated
	 */
	void setArea(String value);

	/**
	 * Returns the value of the '<em><b>Perimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Perimeter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Perimeter</em>' attribute.
	 * @see #setPerimeter(String)
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getShape_Perimeter()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Length" ordered="false"
	 * @generated
	 */
	String getPerimeter();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getPerimeter <em>Perimeter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perimeter</em>' attribute.
	 * @see #getPerimeter()
	 * @generated
	 */
	void setPerimeter(String value);

	/**
	 * Returns the value of the '<em><b>Centre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Centre</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Centre</em>' containment reference.
	 * @see #setCentre(Point)
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getShape_Centre()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Point getCentre();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getCentre <em>Centre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Centre</em>' containment reference.
	 * @see #getCentre()
	 * @generated
	 */
	void setCentre(Point value);

	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(String)
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getShape_Length()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Length" ordered="false"
	 * @generated
	 */
	String getLength();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getShape_Width()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Length" ordered="false"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(String)
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getShape_Radius()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Length" ordered="false"
	 * @generated
	 */
	String getRadius();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(String value);

	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(Angle)
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#getShape_Angle()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	Angle getAngle();

	/**
	 * Sets the value of the '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Angle value);

} // Shape
