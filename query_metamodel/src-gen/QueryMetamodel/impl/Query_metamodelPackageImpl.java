/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.AAge;
import QueryMetamodel.ACarePathway;
import QueryMetamodel.ADate;
import QueryMetamodel.ARange;
import QueryMetamodel.ASex;
import QueryMetamodel.AStatus;
import QueryMetamodel.Answer;
import QueryMetamodel.AverageTime;
import QueryMetamodel.BooleanConduct;
import QueryMetamodel.CarePathway;
import QueryMetamodel.Conduct;
import QueryMetamodel.EConduct;
import QueryMetamodel.EMethod;
import QueryMetamodel.EQuery;
import QueryMetamodel.EStep;
import QueryMetamodel.Exam;
import QueryMetamodel.Flow;
import QueryMetamodel.Gender;
import QueryMetamodel.Medication;
import QueryMetamodel.Message;
import QueryMetamodel.Occurrence;
import QueryMetamodel.Order;
import QueryMetamodel.Pathway;
import QueryMetamodel.Patient;
import QueryMetamodel.Prescription;
import QueryMetamodel.QAnswer;
import QueryMetamodel.QAverageTime;
import QueryMetamodel.QConduct;
import QueryMetamodel.QExam;
import QueryMetamodel.QMedication;
import QueryMetamodel.QOccurrence;
import QueryMetamodel.QPrescription;
import QueryMetamodel.QRecurrentFlow;
import QueryMetamodel.QReturn;
import QueryMetamodel.QStatus;
import QueryMetamodel.QStep;
import QueryMetamodel.QStop;
import QueryMetamodel.Query_metamodelFactory;
import QueryMetamodel.Query_metamodelPackage;
import QueryMetamodel.Question;
import QueryMetamodel.Sequence;
import QueryMetamodel.Status;
import QueryMetamodel.Step;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Query_metamodelPackageImpl extends EPackageImpl implements Query_metamodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eQueryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aAgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aSexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aCarePathwayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qStatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qConductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qRecurrentFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qAverageTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qMedicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qOccurrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass medicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathwayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conductEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass averageTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass occurrenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qReturnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qStopEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qPrescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qExamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass examEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePathwayEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eStepEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eConductEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum booleanConductEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see QueryMetamodel.Query_metamodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Query_metamodelPackageImpl() {
		super(eNS_URI, Query_metamodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Query_metamodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Query_metamodelPackage init() {
		if (isInited)
			return (Query_metamodelPackage) EPackage.Registry.INSTANCE.getEPackage(Query_metamodelPackage.eNS_URI);

		// Obtain or create and register package
		Query_metamodelPackageImpl theQuery_metamodelPackage = (Query_metamodelPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Query_metamodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Query_metamodelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theQuery_metamodelPackage.createPackageContents();

		// Initialize created meta-data
		theQuery_metamodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theQuery_metamodelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Query_metamodelPackage.eNS_URI, theQuery_metamodelPackage);
		return theQuery_metamodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEAttribute() {
		return eAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAttribute_Sex() {
		return (EReference) eAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAttribute_Age() {
		return (EReference) eAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAttribute_Range() {
		return (EReference) eAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAttribute_Date() {
		return (EReference) eAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAttribute_Status() {
		return (EReference) eAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEAttribute_CarePathway() {
		return (EReference) eAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getARange() {
		return aRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getARange_Quantity() {
		return (EAttribute) aRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getARange_Order() {
		return (EAttribute) aRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEQuery() {
		return eQueryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEQuery_EAttribute() {
		return (EReference) eQueryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEQuery_EMethod() {
		return (EReference) eQueryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADate() {
		return aDateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADate_From() {
		return (EAttribute) aDateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getADate_To() {
		return (EAttribute) aDateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAStatus() {
		return aStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAStatus_Message() {
		return (EAttribute) aStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAStatus_Value() {
		return (EAttribute) aStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAAge() {
		return aAgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAAge_From() {
		return (EAttribute) aAgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAAge_To() {
		return (EAttribute) aAgeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASex() {
		return aSexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASex_Sex() {
		return (EAttribute) aSexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACarePathway() {
		return aCarePathwayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACarePathway_Name() {
		return (EAttribute) aCarePathwayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getACarePathway_Conduct() {
		return (EAttribute) aCarePathwayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQStatus() {
		return qStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQStatus_Name() {
		return (EAttribute) qStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQStatus_Status() {
		return (EReference) qStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMethod() {
		return eMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQConduct() {
		return qConductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQConduct_Conduct() {
		return (EReference) qConductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQConduct_Name() {
		return (EAttribute) qConductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQRecurrentFlow() {
		return qRecurrentFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQRecurrentFlow_Name() {
		return (EAttribute) qRecurrentFlowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQRecurrentFlow_Flows() {
		return (EReference) qRecurrentFlowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQAverageTime() {
		return qAverageTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQAverageTime_Name() {
		return (EAttribute) qAverageTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQAverageTime_AverageTime() {
		return (EReference) qAverageTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQMedication() {
		return qMedicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQMedication_Name() {
		return (EAttribute) qMedicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQMedication_Medications() {
		return (EReference) qMedicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQOccurrence() {
		return qOccurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQOccurrence_Name() {
		return (EAttribute) qOccurrenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQOccurrence_Occurrence() {
		return (EReference) qOccurrenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlow() {
		return flowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow_Percentage() {
		return (EAttribute) flowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlow_Quantity() {
		return (EAttribute) flowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlow_Sequences() {
		return (EReference) flowEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedication() {
		return medicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Percentage() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Name() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Quantity() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMedication_Pathway() {
		return (EReference) medicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Code() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMedication_Ids() {
		return (EAttribute) medicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequence() {
		return sequenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequence_Id() {
		return (EAttribute) sequenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequence_Type() {
		return (EAttribute) sequenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequence_Name() {
		return (EAttribute) sequenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPathway() {
		return pathwayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Ids() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Name() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Percentage() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPathway_Quantity() {
		return (EAttribute) pathwayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPathway_Step() {
		return (EReference) pathwayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatus() {
		return statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_InProgress() {
		return (EAttribute) statusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_Completed() {
		return (EAttribute) statusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_Aborted() {
		return (EAttribute) statusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_Name() {
		return (EAttribute) statusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConduct() {
		return conductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConduct_NoConduct() {
		return (EAttribute) conductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConduct_WithConduct() {
		return (EAttribute) conductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConduct_Name() {
		return (EAttribute) conductEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAverageTime() {
		return averageTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAverageTime_Average() {
		return (EAttribute) averageTimeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAverageTime_Name() {
		return (EAttribute) averageTimeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAverageTime_Quantity() {
		return (EAttribute) averageTimeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOccurrence() {
		return occurrenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccurrence_Value() {
		return (EAttribute) occurrenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOccurrence_Name() {
		return (EAttribute) occurrenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQAnswer() {
		return qAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQAnswer_Name() {
		return (EAttribute) qAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQAnswer_Question() {
		return (EReference) qAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQStep() {
		return qStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQStep_Name() {
		return (EAttribute) qStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQStep_Pathway() {
		return (EReference) qStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQReturn() {
		return qReturnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQReturn_Name() {
		return (EAttribute) qReturnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQReturn_Patient() {
		return (EReference) qReturnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQStop() {
		return qStopEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQStop_Name() {
		return (EAttribute) qStopEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQStop_Pathway() {
		return (EReference) qStopEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQPrescription() {
		return qPrescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQPrescription_Name() {
		return (EAttribute) qPrescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQPrescription_Prescription() {
		return (EReference) qPrescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQExam() {
		return qExamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQExam_Name() {
		return (EAttribute) qExamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQExam_Exam() {
		return (EReference) qExamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStep() {
		return stepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Id() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Name() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Type() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Description() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Percentage() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStep_Quantity() {
		return (EAttribute) stepEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescription() {
		return prescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescription_Pathway() {
		return (EReference) prescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescription_Name() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescription_Code() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescription_Ids() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescription_Percentage() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescription_Quantity() {
		return (EAttribute) prescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExam() {
		return examEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExam_Pathway() {
		return (EReference) examEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Name() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Percentage() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Code() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Quantity() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExam_Ids() {
		return (EAttribute) examEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Ids() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Percentage() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Quantity() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuestion_Name() {
		return (EAttribute) questionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuestion_Answer() {
		return (EReference) questionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswer() {
		return answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_Value() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnswer_Type() {
		return (EAttribute) answerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatient() {
		return patientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatient_Pathway() {
		return (EReference) patientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Code() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Age() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Sex() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatient_Quantity() {
		return (EAttribute) patientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrder() {
		return orderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessage() {
		return messageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGender() {
		return genderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarePathway() {
		return carePathwayEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEStep() {
		return eStepEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEConduct() {
		return eConductEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBooleanConduct() {
		return booleanConductEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Query_metamodelFactory getQuery_metamodelFactory() {
		return (Query_metamodelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		eAttributeEClass = createEClass(EATTRIBUTE);
		createEReference(eAttributeEClass, EATTRIBUTE__SEX);
		createEReference(eAttributeEClass, EATTRIBUTE__AGE);
		createEReference(eAttributeEClass, EATTRIBUTE__RANGE);
		createEReference(eAttributeEClass, EATTRIBUTE__DATE);
		createEReference(eAttributeEClass, EATTRIBUTE__STATUS);
		createEReference(eAttributeEClass, EATTRIBUTE__CARE_PATHWAY);

		aRangeEClass = createEClass(ARANGE);
		createEAttribute(aRangeEClass, ARANGE__QUANTITY);
		createEAttribute(aRangeEClass, ARANGE__ORDER);

		eQueryEClass = createEClass(EQUERY);
		createEReference(eQueryEClass, EQUERY__EATTRIBUTE);
		createEReference(eQueryEClass, EQUERY__EMETHOD);

		aDateEClass = createEClass(ADATE);
		createEAttribute(aDateEClass, ADATE__FROM);
		createEAttribute(aDateEClass, ADATE__TO);

		aStatusEClass = createEClass(ASTATUS);
		createEAttribute(aStatusEClass, ASTATUS__MESSAGE);
		createEAttribute(aStatusEClass, ASTATUS__VALUE);

		aAgeEClass = createEClass(AAGE);
		createEAttribute(aAgeEClass, AAGE__FROM);
		createEAttribute(aAgeEClass, AAGE__TO);

		aSexEClass = createEClass(ASEX);
		createEAttribute(aSexEClass, ASEX__SEX);

		aCarePathwayEClass = createEClass(ACARE_PATHWAY);
		createEAttribute(aCarePathwayEClass, ACARE_PATHWAY__NAME);
		createEAttribute(aCarePathwayEClass, ACARE_PATHWAY__CONDUCT);

		qStatusEClass = createEClass(QSTATUS);
		createEAttribute(qStatusEClass, QSTATUS__NAME);
		createEReference(qStatusEClass, QSTATUS__STATUS);

		eMethodEClass = createEClass(EMETHOD);

		qConductEClass = createEClass(QCONDUCT);
		createEReference(qConductEClass, QCONDUCT__CONDUCT);
		createEAttribute(qConductEClass, QCONDUCT__NAME);

		qRecurrentFlowEClass = createEClass(QRECURRENT_FLOW);
		createEAttribute(qRecurrentFlowEClass, QRECURRENT_FLOW__NAME);
		createEReference(qRecurrentFlowEClass, QRECURRENT_FLOW__FLOWS);

		qAverageTimeEClass = createEClass(QAVERAGE_TIME);
		createEAttribute(qAverageTimeEClass, QAVERAGE_TIME__NAME);
		createEReference(qAverageTimeEClass, QAVERAGE_TIME__AVERAGE_TIME);

		qMedicationEClass = createEClass(QMEDICATION);
		createEAttribute(qMedicationEClass, QMEDICATION__NAME);
		createEReference(qMedicationEClass, QMEDICATION__MEDICATIONS);

		qOccurrenceEClass = createEClass(QOCCURRENCE);
		createEAttribute(qOccurrenceEClass, QOCCURRENCE__NAME);
		createEReference(qOccurrenceEClass, QOCCURRENCE__OCCURRENCE);

		flowEClass = createEClass(FLOW);
		createEAttribute(flowEClass, FLOW__PERCENTAGE);
		createEAttribute(flowEClass, FLOW__QUANTITY);
		createEReference(flowEClass, FLOW__SEQUENCES);

		medicationEClass = createEClass(MEDICATION);
		createEAttribute(medicationEClass, MEDICATION__PERCENTAGE);
		createEAttribute(medicationEClass, MEDICATION__NAME);
		createEAttribute(medicationEClass, MEDICATION__QUANTITY);
		createEReference(medicationEClass, MEDICATION__PATHWAY);
		createEAttribute(medicationEClass, MEDICATION__CODE);
		createEAttribute(medicationEClass, MEDICATION__IDS);

		sequenceEClass = createEClass(SEQUENCE);
		createEAttribute(sequenceEClass, SEQUENCE__ID);
		createEAttribute(sequenceEClass, SEQUENCE__TYPE);
		createEAttribute(sequenceEClass, SEQUENCE__NAME);

		pathwayEClass = createEClass(PATHWAY);
		createEAttribute(pathwayEClass, PATHWAY__IDS);
		createEAttribute(pathwayEClass, PATHWAY__NAME);
		createEAttribute(pathwayEClass, PATHWAY__PERCENTAGE);
		createEAttribute(pathwayEClass, PATHWAY__QUANTITY);
		createEReference(pathwayEClass, PATHWAY__STEP);

		statusEClass = createEClass(STATUS);
		createEAttribute(statusEClass, STATUS__IN_PROGRESS);
		createEAttribute(statusEClass, STATUS__COMPLETED);
		createEAttribute(statusEClass, STATUS__ABORTED);
		createEAttribute(statusEClass, STATUS__NAME);

		conductEClass = createEClass(CONDUCT);
		createEAttribute(conductEClass, CONDUCT__NO_CONDUCT);
		createEAttribute(conductEClass, CONDUCT__WITH_CONDUCT);
		createEAttribute(conductEClass, CONDUCT__NAME);

		averageTimeEClass = createEClass(AVERAGE_TIME);
		createEAttribute(averageTimeEClass, AVERAGE_TIME__AVERAGE);
		createEAttribute(averageTimeEClass, AVERAGE_TIME__NAME);
		createEAttribute(averageTimeEClass, AVERAGE_TIME__QUANTITY);

		occurrenceEClass = createEClass(OCCURRENCE);
		createEAttribute(occurrenceEClass, OCCURRENCE__VALUE);
		createEAttribute(occurrenceEClass, OCCURRENCE__NAME);

		qAnswerEClass = createEClass(QANSWER);
		createEAttribute(qAnswerEClass, QANSWER__NAME);
		createEReference(qAnswerEClass, QANSWER__QUESTION);

		qStepEClass = createEClass(QSTEP);
		createEAttribute(qStepEClass, QSTEP__NAME);
		createEReference(qStepEClass, QSTEP__PATHWAY);

		qReturnEClass = createEClass(QRETURN);
		createEAttribute(qReturnEClass, QRETURN__NAME);
		createEReference(qReturnEClass, QRETURN__PATIENT);

		qStopEClass = createEClass(QSTOP);
		createEAttribute(qStopEClass, QSTOP__NAME);
		createEReference(qStopEClass, QSTOP__PATHWAY);

		qPrescriptionEClass = createEClass(QPRESCRIPTION);
		createEAttribute(qPrescriptionEClass, QPRESCRIPTION__NAME);
		createEReference(qPrescriptionEClass, QPRESCRIPTION__PRESCRIPTION);

		qExamEClass = createEClass(QEXAM);
		createEAttribute(qExamEClass, QEXAM__NAME);
		createEReference(qExamEClass, QEXAM__EXAM);

		stepEClass = createEClass(STEP);
		createEAttribute(stepEClass, STEP__ID);
		createEAttribute(stepEClass, STEP__NAME);
		createEAttribute(stepEClass, STEP__TYPE);
		createEAttribute(stepEClass, STEP__DESCRIPTION);
		createEAttribute(stepEClass, STEP__PERCENTAGE);
		createEAttribute(stepEClass, STEP__QUANTITY);

		prescriptionEClass = createEClass(PRESCRIPTION);
		createEReference(prescriptionEClass, PRESCRIPTION__PATHWAY);
		createEAttribute(prescriptionEClass, PRESCRIPTION__NAME);
		createEAttribute(prescriptionEClass, PRESCRIPTION__CODE);
		createEAttribute(prescriptionEClass, PRESCRIPTION__IDS);
		createEAttribute(prescriptionEClass, PRESCRIPTION__PERCENTAGE);
		createEAttribute(prescriptionEClass, PRESCRIPTION__QUANTITY);

		examEClass = createEClass(EXAM);
		createEReference(examEClass, EXAM__PATHWAY);
		createEAttribute(examEClass, EXAM__NAME);
		createEAttribute(examEClass, EXAM__PERCENTAGE);
		createEAttribute(examEClass, EXAM__CODE);
		createEAttribute(examEClass, EXAM__QUANTITY);
		createEAttribute(examEClass, EXAM__IDS);

		questionEClass = createEClass(QUESTION);
		createEAttribute(questionEClass, QUESTION__IDS);
		createEAttribute(questionEClass, QUESTION__PERCENTAGE);
		createEAttribute(questionEClass, QUESTION__QUANTITY);
		createEAttribute(questionEClass, QUESTION__NAME);
		createEReference(questionEClass, QUESTION__ANSWER);

		answerEClass = createEClass(ANSWER);
		createEAttribute(answerEClass, ANSWER__VALUE);
		createEAttribute(answerEClass, ANSWER__TYPE);

		patientEClass = createEClass(PATIENT);
		createEReference(patientEClass, PATIENT__PATHWAY);
		createEAttribute(patientEClass, PATIENT__CODE);
		createEAttribute(patientEClass, PATIENT__AGE);
		createEAttribute(patientEClass, PATIENT__SEX);
		createEAttribute(patientEClass, PATIENT__QUANTITY);

		// Create enums
		orderEEnum = createEEnum(ORDER);
		messageEEnum = createEEnum(MESSAGE);
		genderEEnum = createEEnum(GENDER);
		carePathwayEEnum = createEEnum(CARE_PATHWAY);
		eStepEEnum = createEEnum(ESTEP);
		eConductEEnum = createEEnum(ECONDUCT);
		booleanConductEEnum = createEEnum(BOOLEAN_CONDUCT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		qStatusEClass.getESuperTypes().add(this.getEMethod());
		qConductEClass.getESuperTypes().add(this.getEMethod());
		qRecurrentFlowEClass.getESuperTypes().add(this.getEMethod());
		qAverageTimeEClass.getESuperTypes().add(this.getEMethod());
		qMedicationEClass.getESuperTypes().add(this.getEMethod());
		qOccurrenceEClass.getESuperTypes().add(this.getEMethod());
		qAnswerEClass.getESuperTypes().add(this.getEMethod());
		qStepEClass.getESuperTypes().add(this.getEMethod());
		qReturnEClass.getESuperTypes().add(this.getEMethod());
		qStopEClass.getESuperTypes().add(this.getEMethod());
		qPrescriptionEClass.getESuperTypes().add(this.getEMethod());
		qExamEClass.getESuperTypes().add(this.getEMethod());

		// Initialize classes, features, and operations; add parameters
		initEClass(eAttributeEClass, QueryMetamodel.EAttribute.class, "EAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAttribute_Sex(), this.getASex(), null, "sex", null, 1, 1, QueryMetamodel.EAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttribute_Age(), this.getAAge(), null, "age", null, 0, 1, QueryMetamodel.EAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttribute_Range(), this.getARange(), null, "range", null, 1, 1,
				QueryMetamodel.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttribute_Date(), this.getADate(), null, "date", null, 0, 1, QueryMetamodel.EAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttribute_Status(), this.getAStatus(), null, "status", null, 1, 1,
				QueryMetamodel.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttribute_CarePathway(), this.getACarePathway(), null, "carePathway", null, 0, 1,
				QueryMetamodel.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aRangeEClass, ARange.class, "ARange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getARange_Quantity(), ecorePackage.getEInt(), "quantity", "0", 0, 1, ARange.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getARange_Order(), this.getOrder(), "order", "random", 0, 1, ARange.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eQueryEClass, EQuery.class, "EQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEQuery_EAttribute(), this.getEAttribute(), null, "eAttribute", null, 1, 1, EQuery.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEQuery_EMethod(), this.getEMethod(), null, "eMethod", null, 1, 1, EQuery.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(aDateEClass, ADate.class, "ADate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getADate_From(), ecorePackage.getEDate(), "from", null, 0, 1, ADate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getADate_To(), ecorePackage.getEDate(), "to", null, 0, 1, ADate.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aStatusEClass, AStatus.class, "AStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAStatus_Message(), this.getMessage(), "message", null, 0, 1, AStatus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAStatus_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, AStatus.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aAgeEClass, AAge.class, "AAge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAAge_From(), ecorePackage.getEInt(), "from", "0", 0, 1, AAge.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAAge_To(), ecorePackage.getEInt(), "to", "0", 0, 1, AAge.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aSexEClass, ASex.class, "ASex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getASex_Sex(), this.getGender(), "sex", null, 0, 1, ASex.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aCarePathwayEClass, ACarePathway.class, "ACarePathway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getACarePathway_Name(), this.getCarePathway(), "name", "None", 0, 1, ACarePathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getACarePathway_Conduct(), this.getBooleanConduct(), "conduct", null, 0, 1, ACarePathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qStatusEClass, QStatus.class, "QStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQStatus_Name(), ecorePackage.getEString(), "name", "Status", 0, 1, QStatus.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQStatus_Status(), this.getStatus(), null, "status", null, 0, -1, QStatus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(eMethodEClass, EMethod.class, "EMethod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qConductEClass, QConduct.class, "QConduct", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQConduct_Conduct(), this.getConduct(), null, "conduct", null, 0, -1, QConduct.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQConduct_Name(), ecorePackage.getEString(), "name", "CountConduct", 0, 1, QConduct.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qRecurrentFlowEClass, QRecurrentFlow.class, "QRecurrentFlow", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQRecurrentFlow_Name(), ecorePackage.getEString(), "name", "RecurrentFlow", 0, 1,
				QRecurrentFlow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQRecurrentFlow_Flows(), this.getFlow(), null, "flows", null, 0, -1, QRecurrentFlow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qAverageTimeEClass, QAverageTime.class, "QAverageTime", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQAverageTime_Name(), ecorePackage.getEString(), "name", "AverageTime", 0, 1,
				QAverageTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQAverageTime_AverageTime(), this.getAverageTime(), null, "averageTime", null, 0, -1,
				QAverageTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qMedicationEClass, QMedication.class, "QMedication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQMedication_Name(), ecorePackage.getEString(), "name", "PrescribedMedications", 0, 1,
				QMedication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQMedication_Medications(), this.getMedication(), null, "medications", null, 0, -1,
				QMedication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qOccurrenceEClass, QOccurrence.class, "QOccurrence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQOccurrence_Name(), ecorePackage.getEString(), "name", "CarePathwaysOccurrences", 0, 1,
				QOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQOccurrence_Occurrence(), this.getOccurrence(), null, "occurrence", null, 0, -1,
				QOccurrence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(flowEClass, Flow.class, "Flow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFlow_Percentage(), ecorePackage.getEString(), "percentage", "", 0, 1, Flow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFlow_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Flow.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFlow_Sequences(), this.getSequence(), null, "sequences", null, 0, -1, Flow.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(medicationEClass, Medication.class, "Medication", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMedication_Percentage(), ecorePackage.getEString(), "percentage", "", 0, 1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Name(), ecorePackage.getEString(), "name", null, 0, 1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMedication_Pathway(), this.getPathway(), null, "pathway", null, 0, -1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Code(), ecorePackage.getEString(), "code", null, 0, 1, Medication.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMedication_Ids(), ecorePackage.getEInt(), "ids", null, 0, -1, Medication.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sequenceEClass, Sequence.class, "Sequence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSequence_Id(), ecorePackage.getEString(), "id", null, 0, 1, Sequence.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequence_Type(), ecorePackage.getEString(), "type", null, 0, 1, Sequence.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSequence_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sequence.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathwayEClass, Pathway.class, "Pathway", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPathway_Ids(), ecorePackage.getEInt(), "ids", null, 0, -1, Pathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_Percentage(), ecorePackage.getEString(), "percentage", "", 0, 1, Pathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPathway_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Pathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPathway_Step(), this.getStep(), null, "step", null, 0, -1, Pathway.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(statusEClass, Status.class, "Status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatus_InProgress(), ecorePackage.getEInt(), "inProgress", null, 0, 1, Status.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatus_Completed(), ecorePackage.getEInt(), "completed", null, 0, 1, Status.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatus_Aborted(), ecorePackage.getEInt(), "aborted", null, 0, 1, Status.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatus_Name(), ecorePackage.getEString(), "name", null, 0, 1, Status.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conductEClass, Conduct.class, "Conduct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConduct_NoConduct(), ecorePackage.getEInt(), "noConduct", null, 0, 1, Conduct.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConduct_WithConduct(), ecorePackage.getEInt(), "withConduct", null, 0, 1, Conduct.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConduct_Name(), ecorePackage.getEString(), "name", null, 0, 1, Conduct.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(averageTimeEClass, AverageTime.class, "AverageTime", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAverageTime_Average(), ecorePackage.getEDouble(), "average", null, 0, 1, AverageTime.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAverageTime_Name(), ecorePackage.getEString(), "name", null, 0, 1, AverageTime.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAverageTime_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, AverageTime.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(occurrenceEClass, Occurrence.class, "Occurrence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOccurrence_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Occurrence.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOccurrence_Name(), ecorePackage.getEString(), "name", null, 0, 1, Occurrence.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qAnswerEClass, QAnswer.class, "QAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQAnswer_Name(), ecorePackage.getEString(), "name", "Answer", 0, 1, QAnswer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQAnswer_Question(), this.getQuestion(), null, "question", null, 0, -1, QAnswer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qStepEClass, QStep.class, "QStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQStep_Name(), ecorePackage.getEString(), "name", "Step", 0, 1, QStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQStep_Pathway(), this.getPathway(), null, "pathway", null, 0, -1, QStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(qReturnEClass, QReturn.class, "QReturn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQReturn_Name(), ecorePackage.getEString(), "name", "Return", 0, 1, QReturn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQReturn_Patient(), this.getPatient(), null, "patient", null, 0, -1, QReturn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qStopEClass, QStop.class, "QStop", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQStop_Name(), ecorePackage.getEString(), "name", "Stop", 0, 1, QStop.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQStop_Pathway(), this.getPathway(), null, "pathway", null, 0, -1, QStop.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(qPrescriptionEClass, QPrescription.class, "QPrescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQPrescription_Name(), ecorePackage.getEString(), "name", "Prescription", 0, 1,
				QPrescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getQPrescription_Prescription(), this.getPrescription(), null, "prescription", null, 0, -1,
				QPrescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qExamEClass, QExam.class, "QExam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQExam_Name(), ecorePackage.getEString(), "name", "Exam", 0, 1, QExam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQExam_Exam(), this.getExam(), null, "exam", null, 0, -1, QExam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(stepEClass, Step.class, "Step", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStep_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Step.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Name(), ecorePackage.getEString(), "name", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Type(), ecorePackage.getEString(), "type", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Description(), ecorePackage.getEString(), "description", null, 0, 1, Step.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Percentage(), ecorePackage.getEString(), "percentage", "", 0, 1, Step.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStep_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Step.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prescriptionEClass, Prescription.class, "Prescription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrescription_Pathway(), this.getPathway(), null, "pathway", null, 0, -1, Prescription.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescription_Name(), ecorePackage.getEString(), "name", null, 0, 1, Prescription.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescription_Code(), ecorePackage.getEString(), "code", null, 0, 1, Prescription.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescription_Ids(), ecorePackage.getEInt(), "ids", null, 0, -1, Prescription.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescription_Percentage(), ecorePackage.getEString(), "percentage", "", 0, 1,
				Prescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrescription_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Prescription.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(examEClass, Exam.class, "Exam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExam_Pathway(), this.getPathway(), null, "pathway", null, 0, -1, Exam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getExam_Name(), ecorePackage.getEString(), "name", null, 0, 1, Exam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Percentage(), ecorePackage.getEString(), "percentage", "", 0, 1, Exam.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Code(), ecorePackage.getEString(), "code", null, 0, 1, Exam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Exam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExam_Ids(), ecorePackage.getEInt(), "ids", null, 0, -1, Exam.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuestion_Ids(), ecorePackage.getEInt(), "ids", null, 0, -1, Question.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Percentage(), ecorePackage.getEString(), "percentage", "", 0, 1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuestion_Name(), ecorePackage.getEString(), "name", null, 0, 1, Question.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuestion_Answer(), this.getAnswer(), null, "answer", null, 0, -1, Question.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(answerEClass, Answer.class, "Answer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnswer_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnswer_Type(), ecorePackage.getEString(), "type", null, 0, 1, Answer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(patientEClass, Patient.class, "Patient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPatient_Pathway(), this.getPathway(), null, "pathway", null, 0, -1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Code(), ecorePackage.getEInt(), "code", null, 0, 1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Age(), ecorePackage.getEString(), "age", null, 0, 1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Sex(), ecorePackage.getEString(), "sex", null, 0, 1, Patient.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPatient_Quantity(), ecorePackage.getEInt(), "quantity", null, 0, 1, Patient.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(orderEEnum, Order.class, "Order");
		addEEnumLiteral(orderEEnum, Order.RANDOM);
		addEEnumLiteral(orderEEnum, Order.BOTTOM);
		addEEnumLiteral(orderEEnum, Order.TOP);

		initEEnum(messageEEnum, Message.class, "Message");
		addEEnumLiteral(messageEEnum, Message.ALL);
		addEEnumLiteral(messageEEnum, Message.ABORTED);
		addEEnumLiteral(messageEEnum, Message.COMPLETED);

		initEEnum(genderEEnum, Gender.class, "Gender");
		addEEnumLiteral(genderEEnum, Gender.ALL);
		addEEnumLiteral(genderEEnum, Gender.F);
		addEEnumLiteral(genderEEnum, Gender.M);

		initEEnum(carePathwayEEnum, CarePathway.class, "CarePathway");
		addEEnumLiteral(carePathwayEEnum, CarePathway.DM_TREATMENT);
		addEEnumLiteral(carePathwayEEnum, CarePathway.DM_ADJUSTMENTS);
		addEEnumLiteral(carePathwayEEnum, CarePathway.ABDOMINAL_PAIN);
		addEEnumLiteral(carePathwayEEnum, CarePathway.CHEST_PAIN);
		addEEnumLiteral(carePathwayEEnum, CarePathway.HDP);
		addEEnumLiteral(carePathwayEEnum, CarePathway.DIARRHEA);
		addEEnumLiteral(carePathwayEEnum, CarePathway.COPD);
		addEEnumLiteral(carePathwayEEnum, CarePathway.URTI);
		addEEnumLiteral(carePathwayEEnum, CarePathway.PNEUMONIA_INFLUENZA);
		addEEnumLiteral(carePathwayEEnum, CarePathway.PREMATURE_AMNIORREXIS);
		addEEnumLiteral(carePathwayEEnum, CarePathway.TOXOPLASMOSIS);
		addEEnumLiteral(carePathwayEEnum, CarePathway.HEADACHE);
		addEEnumLiteral(carePathwayEEnum, CarePathway.PARASITE);
		addEEnumLiteral(carePathwayEEnum, CarePathway.AFRICA_LINE_MONOTHERAPY);
		addEEnumLiteral(carePathwayEEnum, CarePathway.GESTATIONAL_DIABETES);
		addEEnumLiteral(carePathwayEEnum, CarePathway.LUMBAR_PAIN);
		addEEnumLiteral(carePathwayEEnum, CarePathway.AFRO_LINE_TETRATHERAPY);
		addEEnumLiteral(carePathwayEEnum, CarePathway.VULVOVAGINITIS);
		addEEnumLiteral(carePathwayEEnum, CarePathway.FEBRILE_NEUTROPENIA);
		addEEnumLiteral(carePathwayEEnum, CarePathway.PHARYNGITIS);
		addEEnumLiteral(carePathwayEEnum, CarePathway.ACUTE_OTITIS_MEDIA);
		addEEnumLiteral(carePathwayEEnum, CarePathway.TETRATHERAPY_BAR);
		addEEnumLiteral(carePathwayEEnum, CarePathway.UTI_CYSTITIS);
		addEEnumLiteral(carePathwayEEnum, CarePathway.SEPSIS_TREATMENT);
		addEEnumLiteral(carePathwayEEnum, CarePathway.JOINT_PAIN);
		addEEnumLiteral(carePathwayEEnum, CarePathway.ACEI_LINE_MONOTHERAPY);
		addEEnumLiteral(carePathwayEEnum, CarePathway.ACNE);
		addEEnumLiteral(carePathwayEEnum, CarePathway.DYSPEPSIA);
		addEEnumLiteral(carePathwayEEnum, CarePathway.VERTIGO);
		addEEnumLiteral(carePathwayEEnum, CarePathway.ACEI_LINE_TETRA_THERAPY);
		addEEnumLiteral(carePathwayEEnum, CarePathway.DOUBLE_THERAPY_AFRO_LINE);
		addEEnumLiteral(carePathwayEEnum, CarePathway.TREATMENT_LOW_RISK_DYSLIPIDEMIA);
		addEEnumLiteral(carePathwayEEnum, CarePathway.TRIPLE_AFRO_LINE_THERAPY);
		addEEnumLiteral(carePathwayEEnum, CarePathway.DIABETES_DYSLIPIDEMIA);
		addEEnumLiteral(carePathwayEEnum, CarePathway.DOUBLE_THERAPY_BAR);
		addEEnumLiteral(carePathwayEEnum, CarePathway.MONOTHERAPY_BAR);
		addEEnumLiteral(carePathwayEEnum, CarePathway.TREATMENT_DYSLIPIDEMIA_HIGH_RISK);
		addEEnumLiteral(carePathwayEEnum, CarePathway.TREATMENT_DYSLIPIDEMIA_INTERMEDIATE_RISK);
		addEEnumLiteral(carePathwayEEnum, CarePathway.TREATMENT_DYSLIPIDEMIA_VERY_HIGH_RISK);
		addEEnumLiteral(carePathwayEEnum, CarePathway.MENINGITIS);
		addEEnumLiteral(carePathwayEEnum, CarePathway.SYPHILIS);
		addEEnumLiteral(carePathwayEEnum, CarePathway.ACEI_LINE_DOUBLE_THERAPY);
		addEEnumLiteral(carePathwayEEnum, CarePathway.TRIPLOTERAPIA_BAR);
		addEEnumLiteral(carePathwayEEnum, CarePathway.UTI);
		addEEnumLiteral(carePathwayEEnum, CarePathway.BAR_BBC_BETABLOCKER);
		addEEnumLiteral(carePathwayEEnum, CarePathway.UTI_DIABETES);
		addEEnumLiteral(carePathwayEEnum, CarePathway.UTI_PYELONEPHRITIS);
		addEEnumLiteral(carePathwayEEnum, CarePathway.AFRICAN_AMERICAN_PHARMACOLOGICAL);
		addEEnumLiteral(carePathwayEEnum, CarePathway.EXPOSED_FRACTURE);
		addEEnumLiteral(carePathwayEEnum, CarePathway.ACEIBBC_BETABLOCKER);
		addEEnumLiteral(carePathwayEEnum, CarePathway.LOW_BACK_PAIN);
		addEEnumLiteral(carePathwayEEnum, CarePathway.NONE);
		addEEnumLiteral(carePathwayEEnum, CarePathway.ASTHMA);

		initEEnum(eStepEEnum, EStep.class, "EStep");
		addEEnumLiteral(eStepEEnum, EStep.AUXILIARY_CONDUCT);
		addEEnumLiteral(eStepEEnum, EStep.TREATMENT);
		addEEnumLiteral(eStepEEnum, EStep.ACTION);
		addEEnumLiteral(eStepEEnum, EStep.DISCHARGE);
		addEEnumLiteral(eStepEEnum, EStep.REFERRAL);
		addEEnumLiteral(eStepEEnum, EStep.PROCEDURE);
		addEEnumLiteral(eStepEEnum, EStep.PRESCRIPTION);
		addEEnumLiteral(eStepEEnum, EStep.PAUSE);
		addEEnumLiteral(eStepEEnum, EStep.INFORMATION);

		initEEnum(eConductEEnum, EConduct.class, "EConduct");
		addEEnumLiteral(eConductEEnum, EConduct.PROCEDURE);
		addEEnumLiteral(eConductEEnum, EConduct.MEDICATION);
		addEEnumLiteral(eConductEEnum, EConduct.PRESCRIPTION);

		initEEnum(booleanConductEEnum, BooleanConduct.class, "BooleanConduct");
		addEEnumLiteral(booleanConductEEnum, BooleanConduct.ALL);
		addEEnumLiteral(booleanConductEEnum, BooleanConduct.FALSE);
		addEEnumLiteral(booleanConductEEnum, BooleanConduct.TRUE);

		// Create resource
		createResource(eNS_URI);
	}

} //Query_metamodelPackageImpl
