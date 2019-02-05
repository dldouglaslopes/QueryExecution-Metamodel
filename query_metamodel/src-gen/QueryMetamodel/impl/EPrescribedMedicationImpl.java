/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.EPrescribedMedication;
import QueryMetamodel.Query_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EPrescribed Medication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.EPrescribedMedicationImpl#getMedications <em>Medications</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EPrescribedMedicationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EPrescribedMedicationImpl extends EMethodImpl implements EPrescribedMedication {
	/**
	 * The cached value of the '{@link #getMedications() <em>Medications</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedications()
	 * @generated
	 * @ordered
	 */
	protected EList<String> medications;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "SHOW PRESCRIBED MEDICATIONS";

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
	protected EPrescribedMedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.EPRESCRIBED_MEDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMedications() {
		if (medications == null) {
			medications = new EDataTypeUniqueEList<String>(String.class, this,
					Query_metamodelPackage.EPRESCRIBED_MEDICATION__MEDICATIONS);
		}
		return medications;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.EPRESCRIBED_MEDICATION__NAME,
					oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Query_metamodelPackage.EPRESCRIBED_MEDICATION__MEDICATIONS:
			return getMedications();
		case Query_metamodelPackage.EPRESCRIBED_MEDICATION__NAME:
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
		case Query_metamodelPackage.EPRESCRIBED_MEDICATION__MEDICATIONS:
			getMedications().clear();
			getMedications().addAll((Collection<? extends String>) newValue);
			return;
		case Query_metamodelPackage.EPRESCRIBED_MEDICATION__NAME:
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
		case Query_metamodelPackage.EPRESCRIBED_MEDICATION__MEDICATIONS:
			getMedications().clear();
			return;
		case Query_metamodelPackage.EPRESCRIBED_MEDICATION__NAME:
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
		case Query_metamodelPackage.EPRESCRIBED_MEDICATION__MEDICATIONS:
			return medications != null && !medications.isEmpty();
		case Query_metamodelPackage.EPRESCRIBED_MEDICATION__NAME:
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
		result.append(" (medications: ");
		result.append(medications);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EPrescribedMedicationImpl
