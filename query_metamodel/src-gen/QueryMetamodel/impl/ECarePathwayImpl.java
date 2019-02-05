/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.CarePathway;
import QueryMetamodel.ComplementaryConduct;
import QueryMetamodel.ECarePathway;
import QueryMetamodel.Query_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECare Pathway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.ECarePathwayImpl#getName <em>Name</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ECarePathwayImpl#getConduct <em>Conduct</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECarePathwayImpl extends MinimalEObjectImpl.Container implements ECarePathway {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final CarePathway NAME_EDEFAULT = CarePathway.NONE;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected CarePathway name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConduct() <em>Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConduct()
	 * @generated
	 * @ordered
	 */
	protected static final ComplementaryConduct CONDUCT_EDEFAULT = ComplementaryConduct.ALL;

	/**
	 * The cached value of the '{@link #getConduct() <em>Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConduct()
	 * @generated
	 * @ordered
	 */
	protected ComplementaryConduct conduct = CONDUCT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ECarePathwayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.ECARE_PATHWAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePathway getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(CarePathway newName) {
		CarePathway oldName = name;
		name = newName == null ? NAME_EDEFAULT : newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.ECARE_PATHWAY__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplementaryConduct getConduct() {
		return conduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConduct(ComplementaryConduct newConduct) {
		ComplementaryConduct oldConduct = conduct;
		conduct = newConduct == null ? CONDUCT_EDEFAULT : newConduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.ECARE_PATHWAY__CONDUCT,
					oldConduct, conduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Query_metamodelPackage.ECARE_PATHWAY__NAME:
			return getName();
		case Query_metamodelPackage.ECARE_PATHWAY__CONDUCT:
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
		case Query_metamodelPackage.ECARE_PATHWAY__NAME:
			setName((CarePathway) newValue);
			return;
		case Query_metamodelPackage.ECARE_PATHWAY__CONDUCT:
			setConduct((ComplementaryConduct) newValue);
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
		case Query_metamodelPackage.ECARE_PATHWAY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Query_metamodelPackage.ECARE_PATHWAY__CONDUCT:
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
		case Query_metamodelPackage.ECARE_PATHWAY__NAME:
			return name != NAME_EDEFAULT;
		case Query_metamodelPackage.ECARE_PATHWAY__CONDUCT:
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
		result.append(" (name: ");
		result.append(name);
		result.append(", conduct: ");
		result.append(conduct);
		result.append(')');
		return result.toString();
	}

} //ECarePathwayImpl
