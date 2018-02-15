/**
 */
package CipVamprofile.CipVamLibrary.GeometricDT.tests;

import CipVamprofile.CipVamLibrary.GeometricDT.GeometricDTFactory;
import CipVamprofile.CipVamLibrary.GeometricDT.Solid;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Solid</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SolidTest extends TestCase {

	/**
	 * The fixture for this Solid test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Solid fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SolidTest.class);
	}

	/**
	 * Constructs a new Solid test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Solid test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Solid fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Solid test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Solid getFixture() {
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
		setFixture(GeometricDTFactory.eINSTANCE.createSolid());
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

} //SolidTest
