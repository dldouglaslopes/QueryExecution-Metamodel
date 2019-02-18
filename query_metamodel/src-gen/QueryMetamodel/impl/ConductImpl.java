/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.Conduct;
import QueryMetamodel.Query_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conduct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.ConductImpl#getNoConduct <em>No Conduct</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ConductImpl#getWithConduct <em>With Conduct</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ConductImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConductImpl extends MinimalEObjectImpl.Container implements Conduct {
	/**
	 * The default value of the '{@link #getNoConduct() <em>No Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoConduct()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_CONDUCT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoConduct() <em>No Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoConduct()
	 * @generated
	 * @ordered
	 */
	protected int noConduct = NO_CONDUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWithConduct() <em>With Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithConduct()
	 * @generated
	 * @ordered
	 */
	protected static final int WITH_CONDUCT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWithConduct() <em>With Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithConduct()
	 * @generated
	 * @ordered
	 */
	protected int withConduct = WITH_CONDUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.CONDUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoConduct() {
		return noConduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoConduct(int newNoConduct) {
		int oldNoConduct = noConduct;
		noConduct = newNoConduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.CONDUCT__NO_CONDUCT,
					oldNoConduct, noConduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWithConduct() {
		return withConduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithConduct(int newWithConduct) {
		int oldWithConduct = withConduct;
		withConduct = newWithConduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.CONDUCT__WITH_CONDUCT,
					oldWithConduct, withConduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.CONDUCT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Query_metamodelPackage.CONDUCT__NO_CONDUCT:
			return getNoConduct();
		case Query_metamodelPackage.CONDUCT__WITH_CONDUCT:
			return getWithConduct();
		case Query_metamodelPackage.CONDUCT__NAME:
			return getName();
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
		case Query_metamodelPackage.CONDUCT__NO_CONDUCT:
			setNoConduct((Integer) newValue);
			return;
		case Query_metamodelPackage.CONDUCT__WITH_CONDUCT:
			setWithConduct((Integer) newValue);
			return;
		case Query_metamodelPackage.CONDUCT__NAME:
			setName((String) newValue);
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
		case Query_metamodelPackage.CONDUCT__NO_CONDUCT:
			setNoConduct(NO_CONDUCT_EDEFAULT);
			return;
		case Query_metamodelPackage.CONDUCT__WITH_CONDUCT:
			setWithConduct(WITH_CONDUCT_EDEFAULT);
			return;
		case Query_metamodelPackage.CONDUCT__NAME:
			setName(NAME_EDEFAULT);
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
		case Query_metamodelPackage.CONDUCT__NO_CONDUCT:
			return noConduct != NO_CONDUCT_EDEFAULT;
		case Query_metamodelPackage.CONDUCT__WITH_CONDUCT:
			return withConduct != WITH_CONDUCT_EDEFAULT;
		case Query_metamodelPackage.CONDUCT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (noConduct: ");
		result.append(noConduct);
		result.append(", withConduct: ");
		result.append(withConduct);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ConductImpl
