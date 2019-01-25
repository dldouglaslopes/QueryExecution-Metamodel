/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.CarePathway;
import QueryMetamodel.ECarePathway;
import QueryMetamodel.EConduct;
import QueryMetamodel.EStep;
import QueryMetamodel.Query_metamodelPackage;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link QueryMetamodel.impl.ECarePathwayImpl#getConducts <em>Conducts</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ECarePathwayImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ECarePathwayImpl#getCarePathways <em>Care Pathways</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECarePathwayImpl extends MinimalEObjectImpl.Container implements ECarePathway {
	/**
	 * The cached value of the '{@link #getConducts() <em>Conducts</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConducts()
	 * @generated
	 * @ordered
	 */
	protected EList<EConduct> conducts;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<EStep> steps;

	/**
	 * The cached value of the '{@link #getCarePathways() <em>Care Pathways</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarePathways()
	 * @generated
	 * @ordered
	 */
	protected EList<CarePathway> carePathways;

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
	public EList<EConduct> getConducts() {
		if (conducts == null) {
			conducts = new EDataTypeUniqueEList<EConduct>(EConduct.class, this,
					Query_metamodelPackage.ECARE_PATHWAY__CONDUCTS);
		}
		return conducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStep> getSteps() {
		if (steps == null) {
			steps = new EDataTypeUniqueEList<EStep>(EStep.class, this, Query_metamodelPackage.ECARE_PATHWAY__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CarePathway> getCarePathways() {
		if (carePathways == null) {
			carePathways = new EDataTypeUniqueEList<CarePathway>(CarePathway.class, this,
					Query_metamodelPackage.ECARE_PATHWAY__CARE_PATHWAYS);
		}
		return carePathways;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Query_metamodelPackage.ECARE_PATHWAY__CONDUCTS:
			return getConducts();
		case Query_metamodelPackage.ECARE_PATHWAY__STEPS:
			return getSteps();
		case Query_metamodelPackage.ECARE_PATHWAY__CARE_PATHWAYS:
			return getCarePathways();
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
		case Query_metamodelPackage.ECARE_PATHWAY__CONDUCTS:
			getConducts().clear();
			getConducts().addAll((Collection<? extends EConduct>) newValue);
			return;
		case Query_metamodelPackage.ECARE_PATHWAY__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends EStep>) newValue);
			return;
		case Query_metamodelPackage.ECARE_PATHWAY__CARE_PATHWAYS:
			getCarePathways().clear();
			getCarePathways().addAll((Collection<? extends CarePathway>) newValue);
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
		case Query_metamodelPackage.ECARE_PATHWAY__CONDUCTS:
			getConducts().clear();
			return;
		case Query_metamodelPackage.ECARE_PATHWAY__STEPS:
			getSteps().clear();
			return;
		case Query_metamodelPackage.ECARE_PATHWAY__CARE_PATHWAYS:
			getCarePathways().clear();
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
		case Query_metamodelPackage.ECARE_PATHWAY__CONDUCTS:
			return conducts != null && !conducts.isEmpty();
		case Query_metamodelPackage.ECARE_PATHWAY__STEPS:
			return steps != null && !steps.isEmpty();
		case Query_metamodelPackage.ECARE_PATHWAY__CARE_PATHWAYS:
			return carePathways != null && !carePathways.isEmpty();
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
		result.append(" (conducts: ");
		result.append(conducts);
		result.append(", steps: ");
		result.append(steps);
		result.append(", carePathways: ");
		result.append(carePathways);
		result.append(')');
		return result.toString();
	}

} //ECarePathwayImpl
