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
		case Query_metamodelPackage.QFLOW: {
			QFlow qFlow = (QFlow) theEObject;
			T result = caseQFlow(qFlow);
			if (result == null)
				result = caseEMethod(qFlow);
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
		case Query_metamodelPackage.PATHWAY: {
			Pathway pathway = (Pathway) theEObject;
			T result = casePathway(pathway);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.QANSWER: {
			QAnswer qAnswer = (QAnswer) theEObject;
			T result = caseQAnswer(qAnswer);
			if (result == null)
				result = caseEMethod(qAnswer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.QSTEP: {
			QStep qStep = (QStep) theEObject;
			T result = caseQStep(qStep);
			if (result == null)
				result = caseEMethod(qStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.QRETURN: {
			QReturn qReturn = (QReturn) theEObject;
			T result = caseQReturn(qReturn);
			if (result == null)
				result = caseEMethod(qReturn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.QABORTED_STEP: {
			QAbortedStep qAbortedStep = (QAbortedStep) theEObject;
			T result = caseQAbortedStep(qAbortedStep);
			if (result == null)
				result = caseEMethod(qAbortedStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.QPRESCRIPTION: {
			QPrescription qPrescription = (QPrescription) theEObject;
			T result = caseQPrescription(qPrescription);
			if (result == null)
				result = caseEMethod(qPrescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.QEXAM: {
			QExam qExam = (QExam) theEObject;
			T result = caseQExam(qExam);
			if (result == null)
				result = caseEMethod(qExam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.STEP: {
			Step step = (Step) theEObject;
			T result = caseStep(step);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.PRESCRIPTION: {
			Prescription prescription = (Prescription) theEObject;
			T result = casePrescription(prescription);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.EXAM: {
			Exam exam = (Exam) theEObject;
			T result = caseExam(exam);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.QUESTION: {
			Question question = (Question) theEObject;
			T result = caseQuestion(question);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.ABOOLEAN: {
			ABoolean aBoolean = (ABoolean) theEObject;
			T result = caseABoolean(aBoolean);
			if (result == null)
				result = caseAnswer(aBoolean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.PATIENT: {
			Patient patient = (Patient) theEObject;
			T result = casePatient(patient);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.ANUMERIC: {
			ANumeric aNumeric = (ANumeric) theEObject;
			T result = caseANumeric(aNumeric);
			if (result == null)
				result = caseAnswer(aNumeric);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Query_metamodelPackage.ANSWER: {
			Answer answer = (Answer) theEObject;
			T result = caseAnswer(answer);
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
	 * Returns the result of interpreting the object as an instance of '<em>QFlow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QFlow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQFlow(QFlow object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>QAnswer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QAnswer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQAnswer(QAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QStep</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QStep</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQStep(QStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QReturn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QReturn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQReturn(QReturn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QAborted Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QAborted Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQAbortedStep(QAbortedStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QPrescription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QPrescription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQPrescription(QPrescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QExam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QExam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQExam(QExam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prescription</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prescription</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrescription(Prescription object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exam</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exam</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExam(Exam object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ABoolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ABoolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseABoolean(ABoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatient(Patient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ANumeric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ANumeric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseANumeric(ANumeric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnswer(Answer object) {
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
