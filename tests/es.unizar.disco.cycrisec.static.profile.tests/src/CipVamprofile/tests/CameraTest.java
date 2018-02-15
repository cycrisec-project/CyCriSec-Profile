/**
 */
package CipVamprofile.tests;

import CipVamprofile.Camera;
import CipVamprofile.CipVamprofileFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Camera</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CameraTest extends SensorTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CameraTest.class);
	}

	/**
	 * Constructs a new Camera test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CameraTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Camera test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Camera getFixture() {
		return (Camera)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CipVamprofileFactory.eINSTANCE.createCamera());
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

} //CameraTest
