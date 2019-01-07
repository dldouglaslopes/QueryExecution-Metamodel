/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.ECarePathway;
import QueryMetamodel.EConduct;
import QueryMetamodel.EStep;
import QueryMetamodel.Query_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECare Pathway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.ECarePathwayImpl#getConduct <em>Conduct</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ECarePathwayImpl#getStep <em>Step</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ECarePathwayImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECarePathwayImpl extends MinimalEObjectImpl.Container implements ECarePathway {
	/**
	 * The cached value of the '{@link #getConduct() <em>Conduct</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConduct()
	 * @generated
	 * @ordered
	 */
	protected EList<EConduct> conduct;

	/**
	 * The cached value of the '{@link #getStep() <em>Step</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStep()
	 * @generated
	 * @ordered
	 */
	protected EList<EStep> step;

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
	public EList<EConduct> getConduct() {
		if (conduct == null) {
			conduct = new EDataTypeUniqueEList<EConduct>(EConduct.class, this,
					Query_metamodelPackage.ECARE_PATHWAY__CONDUCT);
		}
		return conduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStep> getStep() {
		if (step == null) {
			step = new EDataTypeUniqueEList<EStep>(EStep.class, this, Query_metamodelPackage.ECARE_PATHWAY__STEP);
		}
		return step;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.ECARE_PATHWAY__NAME, oldName,
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
		case Query_metamodelPackage.ECARE_PATHWAY__CONDUCT:
			return getConduct();
		case Query_metamodelPackage.ECARE_PATHWAY__STEP:
			return getStep();
		case Query_metamodelPackage.ECARE_PATHWAY__NAME:
			return getName();
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
		case Query_metamodelPackage.ECARE_PATHWAY__CONDUCT:
			getConduct().clear();
			getConduct().addAll((Collection<? extends EConduct>) newValue);
			return;
		case Query_metamodelPackage.ECARE_PATHWAY__STEP:
			getStep().clear();
			getStep().addAll((Collection<? extends EStep>) newValue);
			return;
		case Query_metamodelPackage.ECARE_PATHWAY__NAME:
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
		case Query_metamodelPackage.ECARE_PATHWAY__CONDUCT:
			getConduct().clear();
			return;
		case Query_metamodelPackage.ECARE_PATHWAY__STEP:
			getStep().clear();
			return;
		case Query_metamodelPackage.ECARE_PATHWAY__NAME:
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
		case Query_metamodelPackage.ECARE_PATHWAY__CONDUCT:
			return conduct != null && !conduct.isEmpty();
		case Query_metamodelPackage.ECARE_PATHWAY__STEP:
			return step != null && !step.isEmpty();
		case Query_metamodelPackage.ECARE_PATHWAY__NAME:
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
		result.append(" (conduct: ");
		result.append(conduct);
		result.append(", step: ");
		result.append(step);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ECarePathwayImpl
