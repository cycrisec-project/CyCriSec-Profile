/**
 */
package CipVamprofile.tests;

import CipVamprofile.CipVamprofileFactory;
import CipVamprofile.Protocol;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Protocol</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProtocolTest extends ProtectionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProtocolTest.class);
	}

	/**
	 * Constructs a new Protocol test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Protocol test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Protocol getFixture() {
		return (Protocol)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(CipVamprofileFactory.eINSTANCE.createProtocol());
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

} //ProtocolTest
