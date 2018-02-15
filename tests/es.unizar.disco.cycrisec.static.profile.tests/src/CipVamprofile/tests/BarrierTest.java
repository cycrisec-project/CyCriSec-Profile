/**
 */
package CipVamprofile.tests;

import CipVamprofile.Barrier;
import CipVamprofile.CipVamprofileFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Barrier</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BarrierTest extends EquipmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BarrierTest.class);
	}

	/**
	 * Constructs a new Barrier test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BarrierTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Barrier test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Barrier getFixture() {
		return (Barrier)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CipVamprofileFactory.eINSTANCE.createBarrier());
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

} //BarrierTest
