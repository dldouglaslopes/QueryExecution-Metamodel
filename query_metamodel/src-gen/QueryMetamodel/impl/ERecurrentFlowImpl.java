/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.ERecurrentFlow;
import QueryMetamodel.Query_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERecurrent Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.ERecurrentFlowImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ERecurrentFlowImpl#getPercentages <em>Percentages</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ERecurrentFlowImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERecurrentFlowImpl extends EMethodImpl implements ERecurrentFlow {
	/**
	 * The cached value of the '{@link #getFlows() <em>Flows</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlows()
	 * @generated
	 * @ordered
	 */
	protected EList<String> flows;

	/**
	 * The cached value of the '{@link #getPercentages() <em>Percentages</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentages()
	 * @generated
	 * @ordered
	 */
	protected EList<Double> percentages;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "SHOW RECURRENT FLOW";

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
	protected ERecurrentFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.ERECURRENT_FLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFlows() {
		if (flows == null) {
			flows = new EDataTypeUniqueEList<String>(String.class, this, Query_metamodelPackage.ERECURRENT_FLOW__FLOWS);
		}
		return flows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Double> getPercentages() {
		if (percentages == null) {
			percentages = new EDataTypeUniqueEList<Double>(Double.class, this,
					Query_metamodelPackage.ERECURRENT_FLOW__PERCENTAGES);
		}
		return percentages;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.ERECURRENT_FLOW__NAME, oldName,
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
		case Query_metamodelPackage.ERECURRENT_FLOW__FLOWS:
			return getFlows();
		case Query_metamodelPackage.ERECURRENT_FLOW__PERCENTAGES:
			return getPercentages();
		case Query_metamodelPackage.ERECURRENT_FLOW__NAME:
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
		case Query_metamodelPackage.ERECURRENT_FLOW__FLOWS:
			getFlows().clear();
			getFlows().addAll((Collection<? extends String>) newValue);
			return;
		case Query_metamodelPackage.ERECURRENT_FLOW__PERCENTAGES:
			getPercentages().clear();
			getPercentages().addAll((Collection<? extends Double>) newValue);
			return;
		case Query_metamodelPackage.ERECURRENT_FLOW__NAME:
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
		case Query_metamodelPackage.ERECURRENT_FLOW__FLOWS:
			getFlows().clear();
			return;
		case Query_metamodelPackage.ERECURRENT_FLOW__PERCENTAGES:
			getPercentages().clear();
			return;
		case Query_metamodelPackage.ERECURRENT_FLOW__NAME:
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
		case Query_metamodelPackage.ERECURRENT_FLOW__FLOWS:
			return flows != null && !flows.isEmpty();
		case Query_metamodelPackage.ERECURRENT_FLOW__PERCENTAGES:
			return percentages != null && !percentages.isEmpty();
		case Query_metamodelPackage.ERECURRENT_FLOW__NAME:
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
		result.append(" (flows: ");
		result.append(flows);
		result.append(", percentages: ");
		result.append(percentages);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ERecurrentFlowImpl
