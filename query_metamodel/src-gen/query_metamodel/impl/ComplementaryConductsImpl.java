/**
 */
package query_metamodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import query_metamodel.ComplementaryConducts;
import query_metamodel.Conduct;
import query_metamodel.Query_metamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complementary Conducts</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link query_metamodel.impl.ComplementaryConductsImpl#getConduct <em>Conduct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplementaryConductsImpl extends FieldImpl implements ComplementaryConducts {
	/**
	 * The default value of the '{@link #getConduct() <em>Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConduct()
	 * @generated
	 * @ordered
	 */
	protected static final Conduct CONDUCT_EDEFAULT = Conduct.NONE;

	/**
	 * The cached value of the '{@link #getConduct() <em>Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConduct()
	 * @generated
	 * @ordered
	 */
	protected Conduct conduct = CONDUCT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplementaryConductsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.COMPLEMENTARY_CONDUCTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conduct getConduct() {
		return conduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConduct(Conduct newConduct) {
		Conduct oldConduct = conduct;
		conduct = newConduct == null ? CONDUCT_EDEFAULT : newConduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Query_metamodelPackage.COMPLEMENTARY_CONDUCTS__CONDUCT, oldConduct, conduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Query_metamodelPackage.COMPLEMENTARY_CONDUCTS__CONDUCT:
			return getConduct();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Query_metamodelPackage.COMPLEMENTARY_CONDUCTS__CONDUCT:
			setConduct((Conduct) newValue);
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
		case Query_metamodelPackage.COMPLEMENTARY_CONDUCTS__CONDUCT:
			setConduct(CONDUCT_EDEFAULT);
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
		case Query_metamodelPackage.COMPLEMENTARY_CONDUCTS__CONDUCT:
			return conduct != CONDUCT_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (conduct: ");
		result.append(conduct);
		result.append(')');
		return result.toString();
	}

} //ComplementaryConductsImpl
