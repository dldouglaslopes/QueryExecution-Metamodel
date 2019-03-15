/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.ACarePathway;
import QueryMetamodel.CarePathway;
import QueryMetamodel.Conduct;
import QueryMetamodel.Query_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ACare Pathway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.ACarePathwayImpl#getConduct <em>Conduct</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ACarePathwayImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ACarePathwayImpl extends MinimalEObjectImpl.Container implements ACarePathway {
	/**
	 * The default value of the '{@link #getConduct() <em>Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConduct()
	 * @generated
	 * @ordered
	 */
	protected static final Conduct CONDUCT_EDEFAULT = Conduct.ALL;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ACarePathwayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.ACARE_PATHWAY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.ACARE_PATHWAY__CONDUCT,
					oldConduct, conduct));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.ACARE_PATHWAY__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Query_metamodelPackage.ACARE_PATHWAY__CONDUCT:
			return getConduct();
		case Query_metamodelPackage.ACARE_PATHWAY__NAME:
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
		case Query_metamodelPackage.ACARE_PATHWAY__CONDUCT:
			setConduct((Conduct) newValue);
			return;
		case Query_metamodelPackage.ACARE_PATHWAY__NAME:
			setName((CarePathway) newValue);
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
		case Query_metamodelPackage.ACARE_PATHWAY__CONDUCT:
			setConduct(CONDUCT_EDEFAULT);
			return;
		case Query_metamodelPackage.ACARE_PATHWAY__NAME:
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
		case Query_metamodelPackage.ACARE_PATHWAY__CONDUCT:
			return conduct != CONDUCT_EDEFAULT;
		case Query_metamodelPackage.ACARE_PATHWAY__NAME:
			return name != NAME_EDEFAULT;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ACarePathwayImpl
