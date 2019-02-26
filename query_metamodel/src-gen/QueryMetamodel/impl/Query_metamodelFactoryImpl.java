/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Query_metamodelFactoryImpl extends EFactoryImpl implements Query_metamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Query_metamodelFactory init() {
		try {
			Query_metamodelFactory theQuery_metamodelFactory = (Query_metamodelFactory) EPackage.Registry.INSTANCE
					.getEFactory(Query_metamodelPackage.eNS_URI);
			if (theQuery_metamodelFactory != null) {
				return theQuery_metamodelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Query_metamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query_metamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Query_metamodelPackage.EATTRIBUTE:
			return createEAttribute();
		case Query_metamodelPackage.ARANGE:
			return createARange();
		case Query_metamodelPackage.EQUERY:
			return createEQuery();
		case Query_metamodelPackage.ADATE:
			return createADate();
		case Query_metamodelPackage.ASTATUS:
			return createAStatus();
		case Query_metamodelPackage.AAGE:
			return createAAge();
		case Query_metamodelPackage.ASEX:
			return createASex();
		case Query_metamodelPackage.ACARE_PATHWAY:
			return createACarePathway();
		case Query_metamodelPackage.QSTATUS:
			return createQStatus();
		case Query_metamodelPackage.QCONDUCT:
			return createQConduct();
		case Query_metamodelPackage.QFLOW:
			return createQFlow();
		case Query_metamodelPackage.QAVERAGE_TIME:
			return createQAverageTime();
		case Query_metamodelPackage.QMEDICATION:
			return createQMedication();
		case Query_metamodelPackage.FLOW:
			return createFlow();
		case Query_metamodelPackage.MEDICATION:
			return createMedication();
		case Query_metamodelPackage.SEQUENCE:
			return createSequence();
		case Query_metamodelPackage.PATHWAY:
			return createPathway();
		case Query_metamodelPackage.QANSWER:
			return createQAnswer();
		case Query_metamodelPackage.QSTEP:
			return createQStep();
		case Query_metamodelPackage.QRETURN:
			return createQReturn();
		case Query_metamodelPackage.QSTOP:
			return createQStop();
		case Query_metamodelPackage.QPRESCRIPTION:
			return createQPrescription();
		case Query_metamodelPackage.QEXAM:
			return createQExam();
		case Query_metamodelPackage.STEP:
			return createStep();
		case Query_metamodelPackage.PRESCRIPTION:
			return createPrescription();
		case Query_metamodelPackage.EXAM:
			return createExam();
		case Query_metamodelPackage.QUESTION:
			return createQuestion();
		case Query_metamodelPackage.ABOOLEAN:
			return createABoolean();
		case Query_metamodelPackage.PATIENT:
			return createPatient();
		case Query_metamodelPackage.ANUMERIC:
			return createANumeric();
		case Query_metamodelPackage.QOCCURRENCE:
			return createQOccurrence();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case Query_metamodelPackage.ORDER:
			return createOrderFromString(eDataType, initialValue);
		case Query_metamodelPackage.MESSAGE:
			return createMessageFromString(eDataType, initialValue);
		case Query_metamodelPackage.GENDER:
			return createGenderFromString(eDataType, initialValue);
		case Query_metamodelPackage.CARE_PATHWAY:
			return createCarePathwayFromString(eDataType, initialValue);
		case Query_metamodelPackage.ESTEP:
			return createEStepFromString(eDataType, initialValue);
		case Query_metamodelPackage.ECONDUCT:
			return createEConductFromString(eDataType, initialValue);
		case Query_metamodelPackage.BOOLEAN_CONDUCT:
			return createBooleanConductFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case Query_metamodelPackage.ORDER:
			return convertOrderToString(eDataType, instanceValue);
		case Query_metamodelPackage.MESSAGE:
			return convertMessageToString(eDataType, instanceValue);
		case Query_metamodelPackage.GENDER:
			return convertGenderToString(eDataType, instanceValue);
		case Query_metamodelPackage.CARE_PATHWAY:
			return convertCarePathwayToString(eDataType, instanceValue);
		case Query_metamodelPackage.ESTEP:
			return convertEStepToString(eDataType, instanceValue);
		case Query_metamodelPackage.ECONDUCT:
			return convertEConductToString(eDataType, instanceValue);
		case Query_metamodelPackage.BOOLEAN_CONDUCT:
			return convertBooleanConductToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute createEAttribute() {
		EAttributeImpl eAttribute = new EAttributeImpl();
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARange createARange() {
		ARangeImpl aRange = new ARangeImpl();
		return aRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EQuery createEQuery() {
		EQueryImpl eQuery = new EQueryImpl();
		return eQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADate createADate() {
		ADateImpl aDate = new ADateImpl();
		return aDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AStatus createAStatus() {
		AStatusImpl aStatus = new AStatusImpl();
		return aStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AAge createAAge() {
		AAgeImpl aAge = new AAgeImpl();
		return aAge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASex createASex() {
		ASexImpl aSex = new ASexImpl();
		return aSex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACarePathway createACarePathway() {
		ACarePathwayImpl aCarePathway = new ACarePathwayImpl();
		return aCarePathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QStatus createQStatus() {
		QStatusImpl qStatus = new QStatusImpl();
		return qStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QConduct createQConduct() {
		QConductImpl qConduct = new QConductImpl();
		return qConduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QFlow createQFlow() {
		QFlowImpl qFlow = new QFlowImpl();
		return qFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAverageTime createQAverageTime() {
		QAverageTimeImpl qAverageTime = new QAverageTimeImpl();
		return qAverageTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QMedication createQMedication() {
		QMedicationImpl qMedication = new QMedicationImpl();
		return qMedication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication createMedication() {
		MedicationImpl medication = new MedicationImpl();
		return medication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pathway createPathway() {
		PathwayImpl pathway = new PathwayImpl();
		return pathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAnswer createQAnswer() {
		QAnswerImpl qAnswer = new QAnswerImpl();
		return qAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QStep createQStep() {
		QStepImpl qStep = new QStepImpl();
		return qStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QReturn createQReturn() {
		QReturnImpl qReturn = new QReturnImpl();
		return qReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QStop createQStop() {
		QStopImpl qStop = new QStopImpl();
		return qStop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QPrescription createQPrescription() {
		QPrescriptionImpl qPrescription = new QPrescriptionImpl();
		return qPrescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QExam createQExam() {
		QExamImpl qExam = new QExamImpl();
		return qExam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prescription createPrescription() {
		PrescriptionImpl prescription = new PrescriptionImpl();
		return prescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exam createExam() {
		ExamImpl exam = new ExamImpl();
		return exam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question createQuestion() {
		QuestionImpl question = new QuestionImpl();
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ABoolean createABoolean() {
		ABooleanImpl aBoolean = new ABooleanImpl();
		return aBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Patient createPatient() {
		PatientImpl patient = new PatientImpl();
		return patient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ANumeric createANumeric() {
		ANumericImpl aNumeric = new ANumericImpl();
		return aNumeric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QOccurrence createQOccurrence() {
		QOccurrenceImpl qOccurrence = new QOccurrenceImpl();
		return qOccurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order createOrderFromString(EDataType eDataType, String initialValue) {
		Order result = Order.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessageFromString(EDataType eDataType, String initialValue) {
		Message result = Message.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gender createGenderFromString(EDataType eDataType, String initialValue) {
		Gender result = Gender.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarePathway createCarePathwayFromString(EDataType eDataType, String initialValue) {
		CarePathway result = CarePathway.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarePathwayToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStep createEStepFromString(EDataType eDataType, String initialValue) {
		EStep result = EStep.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEStepToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EConduct createEConductFromString(EDataType eDataType, String initialValue) {
		EConduct result = EConduct.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEConductToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanConduct createBooleanConductFromString(EDataType eDataType, String initialValue) {
		BooleanConduct result = BooleanConduct.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanConductToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query_metamodelPackage getQuery_metamodelPackage() {
		return (Query_metamodelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Query_metamodelPackage getPackage() {
		return Query_metamodelPackage.eINSTANCE;
	}

} //Query_metamodelFactoryImpl
