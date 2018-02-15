/**
 */
package CipVamprofile.impl;

import CipVamprofile.CipVamprofilePackage;
import CipVamprofile.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.uml.UseCase;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link CipVamprofile.impl.ServiceImpl#getBase_UseCase <em>Base Use Case</em>}</li>
 *   <li>{@link CipVamprofile.impl.ServiceImpl#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link CipVamprofile.impl.ServiceImpl#getExecProb <em>Exec Prob</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends ItemImpl implements Service {
	/**
	 * The cached value of the '{@link #getBase_UseCase() <em>Base Use Case</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_UseCase()
	 * @generated
	 * @ordered
	 */
	protected UseCase base_UseCase;

	/**
	 * The cached value of the '{@link #getProvidedBy() <em>Provided By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<CipVamprofile.Object> providedBy;

	/**
	 * The cached value of the '{@link #getExecProb() <em>Exec Prob</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecProb()
	 * @generated
	 * @ordered
	 */
	protected EList<String> execProb;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CipVamprofilePackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase getBase_UseCase() {
		if (base_UseCase != null && base_UseCase.eIsProxy()) {
			InternalEObject oldBase_UseCase = (InternalEObject)base_UseCase;
			base_UseCase = (UseCase)eResolveProxy(oldBase_UseCase);
			if (base_UseCase != oldBase_UseCase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CipVamprofilePackage.SERVICE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
			}
		}
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseCase basicGetBase_UseCase() {
		return base_UseCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_UseCase(UseCase newBase_UseCase) {
		UseCase oldBase_UseCase = base_UseCase;
		base_UseCase = newBase_UseCase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CipVamprofilePackage.SERVICE__BASE_USE_CASE, oldBase_UseCase, base_UseCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CipVamprofile.Object> getProvidedBy() {
		if (providedBy == null) {
			providedBy = new EObjectResolvingEList<CipVamprofile.Object>(CipVamprofile.Object.class, this, CipVamprofilePackage.SERVICE__PROVIDED_BY);
		}
		return providedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExecProb() {
		if (execProb == null) {
			execProb = new EDataTypeUniqueEList<String>(String.class, this, CipVamprofilePackage.SERVICE__EXEC_PROB);
		}
		return execProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CipVamprofilePackage.SERVICE__BASE_USE_CASE:
				if (resolve) return getBase_UseCase();
				return basicGetBase_UseCase();
			case CipVamprofilePackage.SERVICE__PROVIDED_BY:
				return getProvidedBy();
			case CipVamprofilePackage.SERVICE__EXEC_PROB:
				return getExecProb();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CipVamprofilePackage.SERVICE__BASE_USE_CASE:
				setBase_UseCase((UseCase)newValue);
				return;
			case CipVamprofilePackage.SERVICE__PROVIDED_BY:
				getProvidedBy().clear();
				getProvidedBy().addAll((Collection<? extends CipVamprofile.Object>)newValue);
				return;
			case CipVamprofilePackage.SERVICE__EXEC_PROB:
				getExecProb().clear();
				getExecProb().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CipVamprofilePackage.SERVICE__BASE_USE_CASE:
				setBase_UseCase((UseCase)null);
				return;
			case CipVamprofilePackage.SERVICE__PROVIDED_BY:
				getProvidedBy().clear();
				return;
			case CipVamprofilePackage.SERVICE__EXEC_PROB:
				getExecProb().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CipVamprofilePackage.SERVICE__BASE_USE_CASE:
				return base_UseCase != null;
			case CipVamprofilePackage.SERVICE__PROVIDED_BY:
				return providedBy != null && !providedBy.isEmpty();
			case CipVamprofilePackage.SERVICE__EXEC_PROB:
				return execProb != null && !execProb.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (execProb: ");
		result.append(execProb);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
