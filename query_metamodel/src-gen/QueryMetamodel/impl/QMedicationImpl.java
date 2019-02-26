/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.Medication;
import QueryMetamodel.QMedication;
import QueryMetamodel.Query_metamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QMedication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.QMedicationImpl#getMedications <em>Medications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QMedicationImpl extends EMethodImpl implements QMedication {
	/**
	 * The cached value of the '{@link #getMedications() <em>Medications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedications()
	 * @generated
	 * @ordered
	 */
	protected EList<Medication> medications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QMedicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.QMEDICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Medication> getMedications() {
		if (medications == null) {
			medications = new EObjectContainmentEList<Medication>(Medication.class, this,
					Query_metamodelPackage.QMEDICATION__MEDICATIONS);
		}
		return medications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Query_metamodelPackage.QMEDICATION__MEDICATIONS:
			return ((InternalEList<?>) getMedications()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Query_metamodelPackage.QMEDICATION__MEDICATIONS:
			return getMedications();
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
		case Query_metamodelPackage.QMEDICATION__MEDICATIONS:
			getMedications().clear();
			getMedications().addAll((Collection<? extends Medication>) newValue);
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
		case Query_metamodelPackage.QMEDICATION__MEDICATIONS:
			getMedications().clear();
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
		case Query_metamodelPackage.QMEDICATION__MEDICATIONS:
			return medications != null && !medications.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //QMedicationImpl
