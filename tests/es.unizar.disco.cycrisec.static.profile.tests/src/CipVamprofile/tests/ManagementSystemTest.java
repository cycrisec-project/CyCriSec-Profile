/**
 */
package CipVamprofile.tests;

import CipVamprofile.CipVamprofileFactory;
import CipVamprofile.ManagementSystem;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Management System</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ManagementSystemTest extends ProtectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ManagementSystemTest.class);
	}

	/**
	 * Constructs a new Management System test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManagementSystemTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Management System test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ManagementSystem getFixture() {
		return (ManagementSystem)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CipVamprofileFactory.eINSTANCE.createManagementSystem());
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

} //ManagementSystemTest
