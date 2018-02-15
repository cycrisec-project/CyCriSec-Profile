/**
 */
package CipVamprofile.CipVamLibrary.GeometricDT;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTFactory
 * @model kind="package"
 * @generated
 */
public interface GeometricDTPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "GeometricDT";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///CipVamprofile/CipVamLibrary/GeometricDT.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "CipVamprofile.CipVamLibrary.GeometricDT";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GeometricDTPackage eINSTANCE = CipVamprofile.CipVamLibrary.GeometricDT.impl.GeometricDTPackageImpl.init();

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.PointImpl
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.GeometricDTPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Z = 2;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.ShapeImpl
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.GeometricDTPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Vertices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__VERTICES = 1;

	/**
	 * The feature id for the '<em><b>Area</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__AREA = 2;

	/**
	 * The feature id for the '<em><b>Perimeter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PERIMETER = 3;

	/**
	 * The feature id for the '<em><b>Centre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__CENTRE = 4;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__LENGTH = 5;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__WIDTH = 6;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__RADIUS = 7;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ANGLE = 8;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.AngleImpl <em>Angle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.AngleImpl
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.GeometricDTPackageImpl#getAngle()
	 * @generated
	 */
	int ANGLE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE__UNIT = 1;

	/**
	 * The number of structural features of the '<em>Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANGLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.SolidImpl <em>Solid</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.SolidImpl
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.GeometricDTPackageImpl#getSolid()
	 * @generated
	 */
	int SOLID = 3;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID__BASE = 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID__HEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID__VOLUME = 2;

	/**
	 * The number of structural features of the '<em>Solid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Solid</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOLID_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link CipVamprofile.CipVamLibrary.GeometricDT.PolygonType <em>Polygon Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.PolygonType
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.GeometricDTPackageImpl#getPolygonType()
	 * @generated
	 */
	int POLYGON_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link CipVamprofile.CipVamLibrary.GeometricDT.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.GeometricDT.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.GeometricDT.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.GeometricDT.Point#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Point#getZ()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Z();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Shape#getType()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getVertices <em>Vertices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Vertices</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Shape#getVertices()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_Vertices();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getArea <em>Area</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Area</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Shape#getArea()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Area();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getPerimeter <em>Perimeter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Perimeter</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Shape#getPerimeter()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Perimeter();

	/**
	 * Returns the meta object for the containment reference '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getCentre <em>Centre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Centre</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Shape#getCentre()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_Centre();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Shape#getLength()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Length();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Shape#getWidth()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Width();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Shape#getRadius()
	 * @see #getShape()
	 * @generated
	 */
	EAttribute getShape_Radius();

	/**
	 * Returns the meta object for the containment reference '{@link CipVamprofile.CipVamLibrary.GeometricDT.Shape#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Shape#getAngle()
	 * @see #getShape()
	 * @generated
	 */
	EReference getShape_Angle();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.CipVamLibrary.GeometricDT.Angle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Angle</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Angle
	 * @generated
	 */
	EClass getAngle();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.GeometricDT.Angle#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Angle#getValue()
	 * @see #getAngle()
	 * @generated
	 */
	EAttribute getAngle_Value();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.GeometricDT.Angle#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Angle#getUnit()
	 * @see #getAngle()
	 * @generated
	 */
	EAttribute getAngle_Unit();

	/**
	 * Returns the meta object for class '{@link CipVamprofile.CipVamLibrary.GeometricDT.Solid <em>Solid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Solid</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Solid
	 * @generated
	 */
	EClass getSolid();

	/**
	 * Returns the meta object for the containment reference '{@link CipVamprofile.CipVamLibrary.GeometricDT.Solid#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Solid#getBase()
	 * @see #getSolid()
	 * @generated
	 */
	EReference getSolid_Base();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.GeometricDT.Solid#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Solid#getHeight()
	 * @see #getSolid()
	 * @generated
	 */
	EAttribute getSolid_Height();

	/**
	 * Returns the meta object for the attribute '{@link CipVamprofile.CipVamLibrary.GeometricDT.Solid#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.Solid#getVolume()
	 * @see #getSolid()
	 * @generated
	 */
	EAttribute getSolid_Volume();

	/**
	 * Returns the meta object for enum '{@link CipVamprofile.CipVamLibrary.GeometricDT.PolygonType <em>Polygon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Polygon Type</em>'.
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.PolygonType
	 * @generated
	 */
	EEnum getPolygonType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GeometricDTFactory getGeometricDTFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.PointImpl
		 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.GeometricDTPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Z = eINSTANCE.getPoint_Z();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.ShapeImpl
		 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.GeometricDTPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__TYPE = eINSTANCE.getShape_Type();

		/**
		 * The meta object literal for the '<em><b>Vertices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__VERTICES = eINSTANCE.getShape_Vertices();

		/**
		 * The meta object literal for the '<em><b>Area</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__AREA = eINSTANCE.getShape_Area();

		/**
		 * The meta object literal for the '<em><b>Perimeter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__PERIMETER = eINSTANCE.getShape_Perimeter();

		/**
		 * The meta object literal for the '<em><b>Centre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__CENTRE = eINSTANCE.getShape_Centre();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__LENGTH = eINSTANCE.getShape_Length();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__WIDTH = eINSTANCE.getShape_Width();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHAPE__RADIUS = eINSTANCE.getShape_Radius();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHAPE__ANGLE = eINSTANCE.getShape_Angle();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.AngleImpl <em>Angle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.AngleImpl
		 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.GeometricDTPackageImpl#getAngle()
		 * @generated
		 */
		EClass ANGLE = eINSTANCE.getAngle();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGLE__VALUE = eINSTANCE.getAngle_Value();

		/**
		 * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANGLE__UNIT = eINSTANCE.getAngle_Unit();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.GeometricDT.impl.SolidImpl <em>Solid</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.SolidImpl
		 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.GeometricDTPackageImpl#getSolid()
		 * @generated
		 */
		EClass SOLID = eINSTANCE.getSolid();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOLID__BASE = eINSTANCE.getSolid_Base();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLID__HEIGHT = eINSTANCE.getSolid_Height();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOLID__VOLUME = eINSTANCE.getSolid_Volume();

		/**
		 * The meta object literal for the '{@link CipVamprofile.CipVamLibrary.GeometricDT.PolygonType <em>Polygon Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see CipVamprofile.CipVamLibrary.GeometricDT.PolygonType
		 * @see CipVamprofile.CipVamLibrary.GeometricDT.impl.GeometricDTPackageImpl#getPolygonType()
		 * @generated
		 */
		EEnum POLYGON_TYPE = eINSTANCE.getPolygonType();

	}

} //GeometricDTPackage
