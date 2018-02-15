/**
 */
package CipVamprofile.tests;

import CipVamprofile.CipVamprofileFactory;
import CipVamprofile.Ptz;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ptz</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PtzTest extends CameraTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PtzTest.class);
	}

	/**
	 * Constructs a new Ptz test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PtzTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Ptz test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Ptz getFixture() {
		return (Ptz)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CipVamprofileFactory.eINSTANCE.createPtz());
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

} //PtzTest
