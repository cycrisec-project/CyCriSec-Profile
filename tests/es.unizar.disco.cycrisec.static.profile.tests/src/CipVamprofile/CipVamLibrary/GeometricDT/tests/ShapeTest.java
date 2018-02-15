/**
 */
package CipVamprofile.CipVamLibrary.GeometricDT.tests;

import CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTFactory;
import CipVamprofile.CipVamLibrary.GeometricDT.Shape;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ShapeTest extends TestCase {

	/**
	 * The fixture for this Shape test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Shape fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ShapeTest.class);
	}

	/**
	 * Constructs a new Shape test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShapeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Shape test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Shape fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Shape test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Shape getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GeometricDTFactory.eINSTANCE.createShape());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ShapeTest
