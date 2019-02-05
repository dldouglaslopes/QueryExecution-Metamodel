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
		public Adapter caseRange(Range object) {
			return createRangeAdapter();
		}

		@Override
		public Adapter caseEQuery(EQuery object) {
			return createEQueryAdapter();
		}

		@Override
		public Adapter caseDate(Date object) {
			return createDateAdapter();
		}

		@Override
		public Adapter caseStatus(Status object) {
			return createStatusAdapter();
		}

		@Override
		public Adapter caseAge(Age object) {
			return createAgeAdapter();
		}

		@Override
		public Adapter caseSex(Sex object) {
			return createSexAdapter();
		}

		@Override
		public Adapter caseECarePathway(ECarePathway object) {
			return createECarePathwayAdapter();
		}

		@Override
		public Adapter caseEStatus(EStatus object) {
			return createEStatusAdapter();
		}

		@Override
		public Adapter caseEMethod(EMethod object) {
			return createEMethodAdapter();
		}

		@Override
		public Adapter caseEConduct(EConduct object) {
			return createEConductAdapter();
		}

		@Override
		public Adapter caseERecurrentFlow(ERecurrentFlow object) {
			return createERecurrentFlowAdapter();
		}

		@Override
		public Adapter caseEAverageTime(EAverageTime object) {
			return createEAverageTimeAdapter();
		}

		@Override
		public Adapter caseEPrescribedMedication(EPrescribedMedication object) {
			return createEPrescribedMedicationAdapter();
		}

		@Override
		public Adapter caseEOccurrence(EOccurrence object) {
			return createEOccurrenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.Range
	 * @generated
	 */
	public Adapter createRangeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.Date
	 * @generated
	 */
	public Adapter createDateAdapter() {
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
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.Age <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.Age
	 * @generated
	 */
	public Adapter createAgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.Sex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.Sex
	 * @generated
	 */
	public Adapter createSexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.ECarePathway <em>ECare Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.ECarePathway
	 * @generated
	 */
	public Adapter createECarePathwayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.EStatus <em>EStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.EStatus
	 * @generated
	 */
	public Adapter createEStatusAdapter() {
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
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.EConduct <em>EConduct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.EConduct
	 * @generated
	 */
	public Adapter createEConductAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.ERecurrentFlow <em>ERecurrent Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.ERecurrentFlow
	 * @generated
	 */
	public Adapter createERecurrentFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.EAverageTime <em>EAverage Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.EAverageTime
	 * @generated
	 */
	public Adapter createEAverageTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.EPrescribedMedication <em>EPrescribed Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.EPrescribedMedication
	 * @generated
	 */
	public Adapter createEPrescribedMedicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link QueryMetamodel.EOccurrence <em>EOccurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see QueryMetamodel.EOccurrence
	 * @generated
	 */
	public Adapter createEOccurrenceAdapter() {
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
