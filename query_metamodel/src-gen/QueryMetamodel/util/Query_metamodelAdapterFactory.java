/**
 */
package QueryMetamodel.util;

import QueryMetamodel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see QueryMetamodel.Query_metamodelPackage
 * @generated
 */
public class Query_metamodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Query_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query_metamodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Query_metamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Query_metamodelSwitch<Adapter> modelSwitch = new Query_metamodelSwitch<Adapter>() {
		@Override
		public Adapter caseEAttribute(EAttribute object) {
			return createEAttributeAdapter();
		}

		@Override
		public Adapter caseARange(ARange object) {
			return createARangeAdapter();
		}

		@Override
		public Adapter caseEQuery(EQuery object) {
			return createEQueryAdapter();
		}

		@Override
		public Adapter caseADate(ADate object) {
			return createADateAdapter();
		}

		@Override
		public Adapter caseAStatus(AStatus object) {
			return createAStatusAdapter();
		}

		@Override
		public Adapter caseAAge(AAge object) {
			return createAAgeAdapter();
		}

		@Override
		public Adapter caseASex(ASex object) {
			return createASexAdapter();
		}

		@Override
		public Adapter caseACarePathway(ACarePathway object) {
			return createACarePathwayAdapter();
		}

		@Override
		public Adapter caseQStatus(QStatus object) {
			return createQStatusAdapter();
		}

		@Override
		public Adapter caseEMethod(EMethod object) {
			return createEMethodAdapter();
		}

		@Override
		public Adapter caseQConduct(QConduct object) {
			return createQConductAdapter();
		}

		@Override
		public Adapter caseQRecurrentFlow(QRecurrentFlow object) {
			return createQRecurrentFlowAdapter();
		}

		@Override
		public Adapter caseQAverageTime(QAverageTime object) {
			return createQAverageTimeAdapter();
		}

		@Override
		public Adapter caseQMedication(QMedication object) {
			return createQMedicationAdapter();
		}

		@Override
		public Adapter caseQOccurrence(QOccurrence object) {
			return createQOccurrenceAdapter();
		}

		@Override
		public Adapter caseFlow(Flow object) {
			return createFlowAdapter();
		}

		@Override
		public Adapter caseMedication(Medication object) {
			return createMedicationAdapter();
		}

		@Override
		public Adapter caseSequence(Sequence object) {
			return createSequenceAdapter();
		}

		@Override
		public Adapter casePathway(Pathway object) {
			return createPathwayAdapter();
		}

		@Override
		public Adapter caseStatus(Status object) {
			return createStatusAdapter();
		}

		@Override
		public Adapter caseConduct(Conduct object) {
			return createConductAdapter();
		}

		@Override
		public Adapter caseAverageTime(AverageTime object) {
			return createAverageTimeAdapter();
		}

		@Override
		public Adapter caseOccurrence(Occurrence object) {
			return createOccurrenceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.EAttribute
	 * @generated
	 */
	public Adapter createEAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.ARange <em>ARange</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.ARange
	 * @generated
	 */
	public Adapter createARangeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.EQuery <em>EQuery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.EQuery
	 * @generated
	 */
	public Adapter createEQueryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.ADate <em>ADate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.ADate
	 * @generated
	 */
	public Adapter createADateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.AStatus <em>AStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.AStatus
	 * @generated
	 */
	public Adapter createAStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.AAge <em>AAge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.AAge
	 * @generated
	 */
	public Adapter createAAgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.ASex <em>ASex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.ASex
	 * @generated
	 */
	public Adapter createASexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.ACarePathway <em>ACare Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.ACarePathway
	 * @generated
	 */
	public Adapter createACarePathwayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.QStatus <em>QStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.QStatus
	 * @generated
	 */
	public Adapter createQStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.EMethod <em>EMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.EMethod
	 * @generated
	 */
	public Adapter createEMethodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.QConduct <em>QConduct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.QConduct
	 * @generated
	 */
	public Adapter createQConductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.QRecurrentFlow <em>QRecurrent Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.QRecurrentFlow
	 * @generated
	 */
	public Adapter createQRecurrentFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.QAverageTime <em>QAverage Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.QAverageTime
	 * @generated
	 */
	public Adapter createQAverageTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.QMedication <em>QMedication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.QMedication
	 * @generated
	 */
	public Adapter createQMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.QOccurrence <em>QOccurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.QOccurrence
	 * @generated
	 */
	public Adapter createQOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.Medication
	 * @generated
	 */
	public Adapter createMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.Pathway <em>Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.Pathway
	 * @generated
	 */
	public Adapter createPathwayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.Status
	 * @generated
	 */
	public Adapter createStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.Conduct <em>Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.Conduct
	 * @generated
	 */
	public Adapter createConductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.AverageTime <em>Average Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.AverageTime
	 * @generated
	 */
	public Adapter createAverageTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.Occurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.Occurrence
	 * @generated
	 */
	public Adapter createOccurrenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Query_metamodelAdapterFactory
