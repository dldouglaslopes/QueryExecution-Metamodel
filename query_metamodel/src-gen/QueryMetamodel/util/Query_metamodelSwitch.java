/**
 */
package QueryMetamodel.util;

import QueryMetamodel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see QueryMetamodel.Query_metamodelPackage
 * @generated
 */
public class Query_metamodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Query_metamodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query_metamodelSwitch() {
		if (modelPackage == null) {
			modelPackage = Query_metamodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Query_metamodelPackage.EATTRIBUTE: {
			EAttribute eAttribute = (EAttribute) theEObject;
			T result = caseEAttribute(eAttribute);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.ARANGE: {
			ARange aRange = (ARange) theEObject;
			T result = caseARange(aRange);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.EQUERY: {
			EQuery eQuery = (EQuery) theEObject;
			T result = caseEQuery(eQuery);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.ADATE: {
			ADate aDate = (ADate) theEObject;
			T result = caseADate(aDate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.ASTATUS: {
			AStatus aStatus = (AStatus) theEObject;
			T result = caseAStatus(aStatus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.AAGE: {
			AAge aAge = (AAge) theEObject;
			T result = caseAAge(aAge);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.ASEX: {
			ASex aSex = (ASex) theEObject;
			T result = caseASex(aSex);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.ACARE_PATHWAY: {
			ACarePathway aCarePathway = (ACarePathway) theEObject;
			T result = caseACarePathway(aCarePathway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.QSTATUS: {
			QStatus qStatus = (QStatus) theEObject;
			T result = caseQStatus(qStatus);
			if (result == null)
				result = caseEMethod(qStatus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.EMETHOD: {
			EMethod eMethod = (EMethod) theEObject;
			T result = caseEMethod(eMethod);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.QCONDUCT: {
			QConduct qConduct = (QConduct) theEObject;
			T result = caseQConduct(qConduct);
			if (result == null)
				result = caseEMethod(qConduct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.QRECURRENT_FLOW: {
			QRecurrentFlow qRecurrentFlow = (QRecurrentFlow) theEObject;
			T result = caseQRecurrentFlow(qRecurrentFlow);
			if (result == null)
				result = caseEMethod(qRecurrentFlow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.QAVERAGE_TIME: {
			QAverageTime qAverageTime = (QAverageTime) theEObject;
			T result = caseQAverageTime(qAverageTime);
			if (result == null)
				result = caseEMethod(qAverageTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.QMEDICATION: {
			QMedication qMedication = (QMedication) theEObject;
			T result = caseQMedication(qMedication);
			if (result == null)
				result = caseEMethod(qMedication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.QOCCURRENCE: {
			QOccurrence qOccurrence = (QOccurrence) theEObject;
			T result = caseQOccurrence(qOccurrence);
			if (result == null)
				result = caseEMethod(qOccurrence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.FLOW: {
			Flow flow = (Flow) theEObject;
			T result = caseFlow(flow);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.MEDICATION: {
			Medication medication = (Medication) theEObject;
			T result = caseMedication(medication);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.SEQUENCE: {
			Sequence sequence = (Sequence) theEObject;
			T result = caseSequence(sequence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.PATHWAY: {
			Pathway pathway = (Pathway) theEObject;
			T result = casePathway(pathway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.STATUS: {
			Status status = (Status) theEObject;
			T result = caseStatus(status);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.CONDUCT: {
			Conduct conduct = (Conduct) theEObject;
			T result = caseConduct(conduct);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.AVERAGE_TIME: {
			AverageTime averageTime = (AverageTime) theEObject;
			T result = caseAverageTime(averageTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.OCCURRENCE: {
			Occurrence occurrence = (Occurrence) theEObject;
			T result = caseOccurrence(occurrence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EAttribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEAttribute(EAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ARange</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ARange</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseARange(ARange object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EQuery</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EQuery</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEQuery(EQuery object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ADate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ADate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseADate(ADate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AStatus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AStatus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAStatus(AStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AAge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AAge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAAge(AAge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ASex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ASex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseASex(ASex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ACare Pathway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ACare Pathway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseACarePathway(ACarePathway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QStatus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QStatus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQStatus(QStatus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMethod</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMethod</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEMethod(EMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QConduct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QConduct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQConduct(QConduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QRecurrent Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QRecurrent Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQRecurrentFlow(QRecurrentFlow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QAverage Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QAverage Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQAverageTime(QAverageTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QMedication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QMedication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQMedication(QMedication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QOccurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QOccurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQOccurrence(QOccurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Medication</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedication(Medication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sequence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSequence(Sequence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pathway</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pathway</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePathway(Pathway object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatus(Status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conduct</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conduct</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConduct(Conduct object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Average Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Average Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAverageTime(AverageTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Occurrence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOccurrence(Occurrence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Query_metamodelSwitch
