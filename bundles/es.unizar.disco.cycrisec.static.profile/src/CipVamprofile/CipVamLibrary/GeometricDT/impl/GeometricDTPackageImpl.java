/**
 */
package CipVamprofile.CipVamLibrary.GeometricDT.impl;

import CipVamprofile.CipVamLibrary.BasicDT.BasicDTPackage;

import CipVamprofile.CipVamLibrary.BasicDT.impl.BasicDTPackageImpl;

import CipVamprofile.CipVamLibrary.GeometricDT.Angle;
import CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTFactory;
import CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage;
import CipVamprofile.CipVamLibrary.GeometricDT.Point;
import CipVamprofile.CipVamLibrary.GeometricDT.PolygonType;
import CipVamprofile.CipVamLibrary.GeometricDT.Shape;
import CipVamprofile.CipVamLibrary.GeometricDT.Solid;

import CipVamprofile.CipVamLibrary.StructuredDT.StructuredDTPackage;

import CipVamprofile.CipVamLibrary.StructuredDT.impl.StructuredDTPackageImpl;

import CipVamprofile.CipVamprofilePackage;

import CipVamprofile.impl.CipVamprofilePackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import org.eclipse.papyrus.MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MeasurementUnits.MeasurementUnitsPackage;

import org.eclipse.papyrus.MARTE_Library.RS_Library.RS_LibraryPackage;

import org.eclipse.papyrus.MARTE_Library.TimeLibrary.TimeLibraryPackage;

import org.eclipse.papyrus.MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GeometricDTPackageImpl extends EPackageImpl implements GeometricDTPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass angleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum polygonTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GeometricDTPackageImpl() {
		super(eNS_URI, GeometricDTFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GeometricDTPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GeometricDTPackage init() {
		if (isInited) return (GeometricDTPackage)EPackage.Registry.INSTANCE.getEPackage(GeometricDTPackage.eNS_URI);

		// Obtain or create and register package
		GeometricDTPackageImpl theGeometricDTPackage = (GeometricDTPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GeometricDTPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GeometricDTPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MeasurementUnitsPackage.eINSTANCE.eClass();
		GRM_BasicTypesPackage.eINSTANCE.eClass();
		MARTE_DataTypesPackage.eINSTANCE.eClass();
		BasicNFP_TypesPackage.eINSTANCE.eClass();
		TimeTypesLibraryPackage.eINSTANCE.eClass();
		TimeLibraryPackage.eINSTANCE.eClass();
		RS_LibraryPackage.eINSTANCE.eClass();
		MARTE_PrimitivesTypesPackage.eINSTANCE.eClass();
		BasicNFP_TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		CipVamprofilePackageImpl theCipVamprofilePackage = (CipVamprofilePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CipVamprofilePackage.eNS_URI) instanceof CipVamprofilePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CipVamprofilePackage.eNS_URI) : CipVamprofilePackage.eINSTANCE);
		BasicDTPackageImpl theBasicDTPackage = (BasicDTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BasicDTPackage.eNS_URI) instanceof BasicDTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BasicDTPackage.eNS_URI) : BasicDTPackage.eINSTANCE);
		StructuredDTPackageImpl theStructuredDTPackage = (StructuredDTPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StructuredDTPackage.eNS_URI) instanceof StructuredDTPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StructuredDTPackage.eNS_URI) : StructuredDTPackage.eINSTANCE);

		// Create package meta-data objects
		theGeometricDTPackage.createPackageContents();
		theCipVamprofilePackage.createPackageContents();
		theBasicDTPackage.createPackageContents();
		theStructuredDTPackage.createPackageContents();

		// Initialize created meta-data
		theGeometricDTPackage.initializePackageContents();
		theCipVamprofilePackage.initializePackageContents();
		theBasicDTPackage.initializePackageContents();
		theStructuredDTPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGeometricDTPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GeometricDTPackage.eNS_URI, theGeometricDTPackage);
		return theGeometricDTPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_X() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Y() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoint_Z() {
		return (EAttribute)pointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_Type() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShape_Vertices() {
		return (EReference)shapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_Area() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_Perimeter() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShape_Centre() {
		return (EReference)shapeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_Length() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_Width() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getShape_Radius() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShape_Angle() {
		return (EReference)shapeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAngle() {
		return angleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngle_Value() {
		return (EAttribute)angleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAngle_Unit() {
		return (EAttribute)angleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolid() {
		return solidEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSolid_Base() {
		return (EReference)solidEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolid_Height() {
		return (EAttribute)solidEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolid_Volume() {
		return (EAttribute)solidEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPolygonType() {
		return polygonTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeometricDTFactory getGeometricDTFactory() {
		return (GeometricDTFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);
		createEAttribute(pointEClass, POINT__Z);

		shapeEClass = createEClass(SHAPE);
		createEAttribute(shapeEClass, SHAPE__TYPE);
		createEReference(shapeEClass, SHAPE__VERTICES);
		createEAttribute(shapeEClass, SHAPE__AREA);
		createEAttribute(shapeEClass, SHAPE__PERIMETER);
		createEReference(shapeEClass, SHAPE__CENTRE);
		createEAttribute(shapeEClass, SHAPE__LENGTH);
		createEAttribute(shapeEClass, SHAPE__WIDTH);
		createEAttribute(shapeEClass, SHAPE__RADIUS);
		createEReference(shapeEClass, SHAPE__ANGLE);

		angleEClass = createEClass(ANGLE);
		createEAttribute(angleEClass, ANGLE__VALUE);
		createEAttribute(angleEClass, ANGLE__UNIT);

		solidEClass = createEClass(SOLID);
		createEReference(solidEClass, SOLID__BASE);
		createEAttribute(solidEClass, SOLID__HEIGHT);
		createEAttribute(solidEClass, SOLID__VOLUME);

		// Create enums
		polygonTypeEEnum = createEEnum(POLYGON_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasicNFP_TypesPackage theBasicNFP_TypesPackage = (BasicNFP_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(BasicNFP_TypesPackage.eNS_URI);
		MARTE_PrimitivesTypesPackage theMARTE_PrimitivesTypesPackage = (MARTE_PrimitivesTypesPackage)EPackage.Registry.INSTANCE.getEPackage(MARTE_PrimitivesTypesPackage.eNS_URI);
		BasicDTPackage theBasicDTPackage = (BasicDTPackage)EPackage.Registry.INSTANCE.getEPackage(BasicDTPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), theBasicNFP_TypesPackage.getNFP_Real(), "x", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPoint_Y(), theBasicNFP_TypesPackage.getNFP_Real(), "y", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPoint_Z(), theBasicNFP_TypesPackage.getNFP_Real(), "z", null, 0, 1, Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShape_Type(), this.getPolygonType(), "type", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getShape_Vertices(), this.getPoint(), null, "vertices", null, 0, -1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getShape_Area(), theBasicNFP_TypesPackage.getNFP_Area(), "area", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getShape_Perimeter(), theBasicNFP_TypesPackage.getNFP_Length(), "perimeter", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getShape_Centre(), this.getPoint(), null, "centre", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getShape_Length(), theBasicNFP_TypesPackage.getNFP_Length(), "length", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getShape_Width(), theBasicNFP_TypesPackage.getNFP_Length(), "width", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getShape_Radius(), theBasicNFP_TypesPackage.getNFP_Length(), "radius", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getShape_Angle(), this.getAngle(), null, "angle", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(angleEClass, Angle.class, "Angle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAngle_Value(), theMARTE_PrimitivesTypesPackage.getReal(), "value", null, 1, 1, Angle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getAngle_Unit(), theBasicDTPackage.getAngularUnitKind(), "unit", null, 1, 1, Angle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(solidEClass, Solid.class, "Solid", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSolid_Base(), this.getShape(), null, "base", null, 0, 1, Solid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSolid_Height(), theBasicNFP_TypesPackage.getNFP_Length(), "height", null, 0, 1, Solid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSolid_Volume(), theBasicNFP_TypesPackage.getNFP_Real(), "volume", null, 0, 1, Solid.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(polygonTypeEEnum, PolygonType.class, "PolygonType");
		addEEnumLiteral(polygonTypeEEnum, PolygonType.POLYGON);
		addEEnumLiteral(polygonTypeEEnum, PolygonType.CIRCLE);
		addEEnumLiteral(polygonTypeEEnum, PolygonType.RECTANGLE);
		addEEnumLiteral(polygonTypeEEnum, PolygonType.SQUARE);
	}

} //GeometricDTPackageImpl
