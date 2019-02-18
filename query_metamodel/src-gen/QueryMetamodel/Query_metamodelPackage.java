/**
 */
package QueryMetamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see QueryMetamodel.Query_metamodelFactory
 * @model kind="package"
 * @generated
 */
public interface Query_metamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "QueryMetamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/QueryMetamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "QueryMetamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Query_metamodelPackage eINSTANCE = QueryMetamodel.impl.Query_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.EAttributeImpl <em>EAttribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.EAttributeImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEAttribute()
	 * @generated
	 */
	int EATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__SEX = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__AGE = 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__RANGE = 2;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DATE = 3;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__STATUS = 4;

	/**
	 * The feature id for the '<em><b>Care Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__CARE_PATHWAY = 5;

	/**
	 * The number of structural features of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.ARangeImpl <em>ARange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.ARangeImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getARange()
	 * @generated
	 */
	int ARANGE = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE__QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE__ORDER = 1;

	/**
	 * The number of structural features of the '<em>ARange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ARange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.EQueryImpl <em>EQuery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.EQueryImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEQuery()
	 * @generated
	 */
	int EQUERY = 2;

	/**
	 * The feature id for the '<em><b>EAttribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUERY__EATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>EMethod</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUERY__EMETHOD = 1;

	/**
	 * The number of structural features of the '<em>EQuery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUERY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EQuery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.ADateImpl <em>ADate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.ADateImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getADate()
	 * @generated
	 */
	int ADATE = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATE__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATE__TO = 1;

	/**
	 * The number of structural features of the '<em>ADate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ADate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.AStatusImpl <em>AStatus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.AStatusImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getAStatus()
	 * @generated
	 */
	int ASTATUS = 4;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATUS__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATUS__VALUE = 1;

	/**
	 * The number of structural features of the '<em>AStatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>AStatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASTATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.AAgeImpl <em>AAge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.AAgeImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getAAge()
	 * @generated
	 */
	int AAGE = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAGE__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAGE__TO = 1;

	/**
	 * The number of structural features of the '<em>AAge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>AAge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.ASexImpl <em>ASex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.ASexImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getASex()
	 * @generated
	 */
	int ASEX = 6;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEX__SEX = 0;

	/**
	 * The number of structural features of the '<em>ASex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ASex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.ACarePathwayImpl <em>ACare Pathway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.ACarePathwayImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getACarePathway()
	 * @generated
	 */
	int ACARE_PATHWAY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACARE_PATHWAY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACARE_PATHWAY__CONDUCT = 1;

	/**
	 * The number of structural features of the '<em>ACare Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACARE_PATHWAY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>ACare Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACARE_PATHWAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.EMethodImpl <em>EMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.EMethodImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEMethod()
	 * @generated
	 */
	int EMETHOD = 9;

	/**
	 * The number of structural features of the '<em>EMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMETHOD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>EMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMETHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QStatusImpl <em>QStatus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QStatusImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQStatus()
	 * @generated
	 */
	int QSTATUS = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTATUS__NAME = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTATUS__STATUS = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>QStatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTATUS_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>QStatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTATUS_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QConductImpl <em>QConduct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QConductImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQConduct()
	 * @generated
	 */
	int QCONDUCT = 10;

	/**
	 * The feature id for the '<em><b>Conduct</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCONDUCT__CONDUCT = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCONDUCT__NAME = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>QConduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCONDUCT_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>QConduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCONDUCT_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QRecurrentFlowImpl <em>QRecurrent Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QRecurrentFlowImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQRecurrentFlow()
	 * @generated
	 */
	int QRECURRENT_FLOW = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QRECURRENT_FLOW__NAME = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QRECURRENT_FLOW__FLOWS = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>QRecurrent Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QRECURRENT_FLOW_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>QRecurrent Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QRECURRENT_FLOW_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QAverageTimeImpl <em>QAverage Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QAverageTimeImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQAverageTime()
	 * @generated
	 */
	int QAVERAGE_TIME = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAVERAGE_TIME__NAME = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Average Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAVERAGE_TIME__AVERAGE_TIME = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>QAverage Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAVERAGE_TIME_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>QAverage Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAVERAGE_TIME_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QMedicationImpl <em>QMedication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QMedicationImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQMedication()
	 * @generated
	 */
	int QMEDICATION = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMEDICATION__NAME = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Medications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMEDICATION__MEDICATIONS = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>QMedication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMEDICATION_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>QMedication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMEDICATION_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QOccurrenceImpl <em>QOccurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QOccurrenceImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQOccurrence()
	 * @generated
	 */
	int QOCCURRENCE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOCCURRENCE__NAME = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Occurrence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOCCURRENCE__OCCURRENCE = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>QOccurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOCCURRENCE_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>QOccurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOCCURRENCE_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.FlowImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 15;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SEQUENCES = 2;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.MedicationImpl <em>Medication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.MedicationImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getMedication()
	 * @generated
	 */
	int MEDICATION = 16;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__QUANTITY = 2;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__PATHWAY = 3;

	/**
	 * The number of structural features of the '<em>Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.SequenceImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ID = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.PathwayImpl <em>Pathway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.PathwayImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getPathway()
	 * @generated
	 */
	int PATHWAY = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__PERCENTAGE = 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__QUANTITY = 3;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__PATHWAY = 4;

	/**
	 * The number of structural features of the '<em>Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.StatusImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 19;

	/**
	 * The feature id for the '<em><b>In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__IN_PROGRESS = 0;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__COMPLETED = 1;

	/**
	 * The feature id for the '<em><b>Aborted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__ABORTED = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__NAME = 3;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.ConductImpl <em>Conduct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.ConductImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getConduct()
	 * @generated
	 */
	int CONDUCT = 20;

	/**
	 * The feature id for the '<em><b>No Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCT__NO_CONDUCT = 0;

	/**
	 * The feature id for the '<em><b>With Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCT__WITH_CONDUCT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Conduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Conduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.AverageTimeImpl <em>Average Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.AverageTimeImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getAverageTime()
	 * @generated
	 */
	int AVERAGE_TIME = 21;

	/**
	 * The feature id for the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE_TIME__AVERAGE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE_TIME__NAME = 1;

	/**
	 * The number of structural features of the '<em>Average Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE_TIME_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Average Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVERAGE_TIME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.OccurrenceImpl <em>Occurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.OccurrenceImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getOccurrence()
	 * @generated
	 */
	int OCCURRENCE = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Occurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCCURRENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Order <em>Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Order
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 23;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Message <em>Message</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Message
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 24;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Gender
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 25;

	/**
	 * The meta object id for the '{@link QueryMetamodel.CarePathway <em>Care Pathway</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.CarePathway
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getCarePathway()
	 * @generated
	 */
	int CARE_PATHWAY = 26;

	/**
	 * The meta object id for the '{@link QueryMetamodel.EStep <em>EStep</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.EStep
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEStep()
	 * @generated
	 */
	int ESTEP = 27;

	/**
	 * The meta object id for the '{@link QueryMetamodel.EConduct <em>EConduct</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.EConduct
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEConduct()
	 * @generated
	 */
	int ECONDUCT = 28;

	/**
	 * The meta object id for the '{@link QueryMetamodel.BooleanConduct <em>Boolean Conduct</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.BooleanConduct
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getBooleanConduct()
	 * @generated
	 */
	int BOOLEAN_CONDUCT = 29;

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.EAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EAttribute</em>'.
	 * @see QueryMetamodel.EAttribute
	 * @generated
	 */
	EClass getEAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link QueryMetamodel.EAttribute#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sex</em>'.
	 * @see QueryMetamodel.EAttribute#getSex()
	 * @see #getEAttribute()
	 * @generated
	 */
	EReference getEAttribute_Sex();

	/**
	 * Returns the meta object for the containment reference '{@link QueryMetamodel.EAttribute#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Age</em>'.
	 * @see QueryMetamodel.EAttribute#getAge()
	 * @see #getEAttribute()
	 * @generated
	 */
	EReference getEAttribute_Age();

	/**
	 * Returns the meta object for the containment reference '{@link QueryMetamodel.EAttribute#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see QueryMetamodel.EAttribute#getRange()
	 * @see #getEAttribute()
	 * @generated
	 */
	EReference getEAttribute_Range();

	/**
	 * Returns the meta object for the containment reference '{@link QueryMetamodel.EAttribute#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see QueryMetamodel.EAttribute#getDate()
	 * @see #getEAttribute()
	 * @generated
	 */
	EReference getEAttribute_Date();

	/**
	 * Returns the meta object for the containment reference '{@link QueryMetamodel.EAttribute#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see QueryMetamodel.EAttribute#getStatus()
	 * @see #getEAttribute()
	 * @generated
	 */
	EReference getEAttribute_Status();

	/**
	 * Returns the meta object for the containment reference '{@link QueryMetamodel.EAttribute#getCarePathway <em>Care Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Care Pathway</em>'.
	 * @see QueryMetamodel.EAttribute#getCarePathway()
	 * @see #getEAttribute()
	 * @generated
	 */
	EReference getEAttribute_CarePathway();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.ARange <em>ARange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARange</em>'.
	 * @see QueryMetamodel.ARange
	 * @generated
	 */
	EClass getARange();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ARange#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see QueryMetamodel.ARange#getQuantity()
	 * @see #getARange()
	 * @generated
	 */
	EAttribute getARange_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ARange#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see QueryMetamodel.ARange#getOrder()
	 * @see #getARange()
	 * @generated
	 */
	EAttribute getARange_Order();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.EQuery <em>EQuery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EQuery</em>'.
	 * @see QueryMetamodel.EQuery
	 * @generated
	 */
	EClass getEQuery();

	/**
	 * Returns the meta object for the containment reference '{@link QueryMetamodel.EQuery#getEAttribute <em>EAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EAttribute</em>'.
	 * @see QueryMetamodel.EQuery#getEAttribute()
	 * @see #getEQuery()
	 * @generated
	 */
	EReference getEQuery_EAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link QueryMetamodel.EQuery#getEMethod <em>EMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EMethod</em>'.
	 * @see QueryMetamodel.EQuery#getEMethod()
	 * @see #getEQuery()
	 * @generated
	 */
	EReference getEQuery_EMethod();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.ADate <em>ADate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADate</em>'.
	 * @see QueryMetamodel.ADate
	 * @generated
	 */
	EClass getADate();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ADate#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see QueryMetamodel.ADate#getFrom()
	 * @see #getADate()
	 * @generated
	 */
	EAttribute getADate_From();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ADate#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see QueryMetamodel.ADate#getTo()
	 * @see #getADate()
	 * @generated
	 */
	EAttribute getADate_To();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.AStatus <em>AStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AStatus</em>'.
	 * @see QueryMetamodel.AStatus
	 * @generated
	 */
	EClass getAStatus();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.AStatus#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see QueryMetamodel.AStatus#getMessage()
	 * @see #getAStatus()
	 * @generated
	 */
	EAttribute getAStatus_Message();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.AStatus#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see QueryMetamodel.AStatus#isValue()
	 * @see #getAStatus()
	 * @generated
	 */
	EAttribute getAStatus_Value();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.AAge <em>AAge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AAge</em>'.
	 * @see QueryMetamodel.AAge
	 * @generated
	 */
	EClass getAAge();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.AAge#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see QueryMetamodel.AAge#getFrom()
	 * @see #getAAge()
	 * @generated
	 */
	EAttribute getAAge_From();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.AAge#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see QueryMetamodel.AAge#getTo()
	 * @see #getAAge()
	 * @generated
	 */
	EAttribute getAAge_To();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.ASex <em>ASex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASex</em>'.
	 * @see QueryMetamodel.ASex
	 * @generated
	 */
	EClass getASex();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ASex#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see QueryMetamodel.ASex#getSex()
	 * @see #getASex()
	 * @generated
	 */
	EAttribute getASex_Sex();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.ACarePathway <em>ACare Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ACare Pathway</em>'.
	 * @see QueryMetamodel.ACarePathway
	 * @generated
	 */
	EClass getACarePathway();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ACarePathway#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.ACarePathway#getName()
	 * @see #getACarePathway()
	 * @generated
	 */
	EAttribute getACarePathway_Name();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ACarePathway#getConduct <em>Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conduct</em>'.
	 * @see QueryMetamodel.ACarePathway#getConduct()
	 * @see #getACarePathway()
	 * @generated
	 */
	EAttribute getACarePathway_Conduct();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.QStatus <em>QStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QStatus</em>'.
	 * @see QueryMetamodel.QStatus
	 * @generated
	 */
	EClass getQStatus();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.QStatus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.QStatus#getName()
	 * @see #getQStatus()
	 * @generated
	 */
	EAttribute getQStatus_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.QStatus#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Status</em>'.
	 * @see QueryMetamodel.QStatus#getStatus()
	 * @see #getQStatus()
	 * @generated
	 */
	EReference getQStatus_Status();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.EMethod <em>EMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMethod</em>'.
	 * @see QueryMetamodel.EMethod
	 * @generated
	 */
	EClass getEMethod();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.QConduct <em>QConduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QConduct</em>'.
	 * @see QueryMetamodel.QConduct
	 * @generated
	 */
	EClass getQConduct();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.QConduct#getConduct <em>Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conduct</em>'.
	 * @see QueryMetamodel.QConduct#getConduct()
	 * @see #getQConduct()
	 * @generated
	 */
	EReference getQConduct_Conduct();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.QConduct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.QConduct#getName()
	 * @see #getQConduct()
	 * @generated
	 */
	EAttribute getQConduct_Name();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.QRecurrentFlow <em>QRecurrent Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QRecurrent Flow</em>'.
	 * @see QueryMetamodel.QRecurrentFlow
	 * @generated
	 */
	EClass getQRecurrentFlow();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.QRecurrentFlow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.QRecurrentFlow#getName()
	 * @see #getQRecurrentFlow()
	 * @generated
	 */
	EAttribute getQRecurrentFlow_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.QRecurrentFlow#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flows</em>'.
	 * @see QueryMetamodel.QRecurrentFlow#getFlows()
	 * @see #getQRecurrentFlow()
	 * @generated
	 */
	EReference getQRecurrentFlow_Flows();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.QAverageTime <em>QAverage Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QAverage Time</em>'.
	 * @see QueryMetamodel.QAverageTime
	 * @generated
	 */
	EClass getQAverageTime();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.QAverageTime#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.QAverageTime#getName()
	 * @see #getQAverageTime()
	 * @generated
	 */
	EAttribute getQAverageTime_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.QAverageTime#getAverageTime <em>Average Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Average Time</em>'.
	 * @see QueryMetamodel.QAverageTime#getAverageTime()
	 * @see #getQAverageTime()
	 * @generated
	 */
	EReference getQAverageTime_AverageTime();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.QMedication <em>QMedication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QMedication</em>'.
	 * @see QueryMetamodel.QMedication
	 * @generated
	 */
	EClass getQMedication();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.QMedication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.QMedication#getName()
	 * @see #getQMedication()
	 * @generated
	 */
	EAttribute getQMedication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.QMedication#getMedications <em>Medications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medications</em>'.
	 * @see QueryMetamodel.QMedication#getMedications()
	 * @see #getQMedication()
	 * @generated
	 */
	EReference getQMedication_Medications();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.QOccurrence <em>QOccurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QOccurrence</em>'.
	 * @see QueryMetamodel.QOccurrence
	 * @generated
	 */
	EClass getQOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.QOccurrence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.QOccurrence#getName()
	 * @see #getQOccurrence()
	 * @generated
	 */
	EAttribute getQOccurrence_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.QOccurrence#getOccurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Occurrence</em>'.
	 * @see QueryMetamodel.QOccurrence#getOccurrence()
	 * @see #getQOccurrence()
	 * @generated
	 */
	EReference getQOccurrence_Occurrence();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see QueryMetamodel.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Flow#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see QueryMetamodel.Flow#getPercentage()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Flow#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see QueryMetamodel.Flow#getQuantity()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Quantity();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.Flow#getSequences <em>Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequences</em>'.
	 * @see QueryMetamodel.Flow#getSequences()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Sequences();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Medication <em>Medication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Medication</em>'.
	 * @see QueryMetamodel.Medication
	 * @generated
	 */
	EClass getMedication();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Medication#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see QueryMetamodel.Medication#getPercentage()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Medication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.Medication#getName()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Name();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Medication#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see QueryMetamodel.Medication#getQuantity()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Quantity();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.Medication#getPathway <em>Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pathway</em>'.
	 * @see QueryMetamodel.Medication#getPathway()
	 * @see #getMedication()
	 * @generated
	 */
	EReference getMedication_Pathway();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see QueryMetamodel.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Sequence#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see QueryMetamodel.Sequence#getId()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Id();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Sequence#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see QueryMetamodel.Sequence#getType()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Type();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Sequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.Sequence#getName()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Name();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Pathway <em>Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pathway</em>'.
	 * @see QueryMetamodel.Pathway
	 * @generated
	 */
	EClass getPathway();

	/**
	 * Returns the meta object for the attribute list '{@link QueryMetamodel.Pathway#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Id</em>'.
	 * @see QueryMetamodel.Pathway#getId()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_Id();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Pathway#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.Pathway#getName()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_Name();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Pathway#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see QueryMetamodel.Pathway#getPercentage()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Pathway#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see QueryMetamodel.Pathway#getQuantity()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Pathway#getPathway <em>Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pathway</em>'.
	 * @see QueryMetamodel.Pathway#getPathway()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_Pathway();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see QueryMetamodel.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Status#getInProgress <em>In Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Progress</em>'.
	 * @see QueryMetamodel.Status#getInProgress()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_InProgress();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Status#getCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see QueryMetamodel.Status#getCompleted()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Completed();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Status#getAborted <em>Aborted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aborted</em>'.
	 * @see QueryMetamodel.Status#getAborted()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Aborted();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Status#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.Status#getName()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Name();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Conduct <em>Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conduct</em>'.
	 * @see QueryMetamodel.Conduct
	 * @generated
	 */
	EClass getConduct();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Conduct#getNoConduct <em>No Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Conduct</em>'.
	 * @see QueryMetamodel.Conduct#getNoConduct()
	 * @see #getConduct()
	 * @generated
	 */
	EAttribute getConduct_NoConduct();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Conduct#getWithConduct <em>With Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Conduct</em>'.
	 * @see QueryMetamodel.Conduct#getWithConduct()
	 * @see #getConduct()
	 * @generated
	 */
	EAttribute getConduct_WithConduct();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Conduct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.Conduct#getName()
	 * @see #getConduct()
	 * @generated
	 */
	EAttribute getConduct_Name();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.AverageTime <em>Average Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Average Time</em>'.
	 * @see QueryMetamodel.AverageTime
	 * @generated
	 */
	EClass getAverageTime();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.AverageTime#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see QueryMetamodel.AverageTime#getAverage()
	 * @see #getAverageTime()
	 * @generated
	 */
	EAttribute getAverageTime_Average();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.AverageTime#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.AverageTime#getName()
	 * @see #getAverageTime()
	 * @generated
	 */
	EAttribute getAverageTime_Name();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Occurrence <em>Occurrence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Occurrence</em>'.
	 * @see QueryMetamodel.Occurrence
	 * @generated
	 */
	EClass getOccurrence();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Occurrence#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see QueryMetamodel.Occurrence#getValue()
	 * @see #getOccurrence()
	 * @generated
	 */
	EAttribute getOccurrence_Value();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Occurrence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.Occurrence#getName()
	 * @see #getOccurrence()
	 * @generated
	 */
	EAttribute getOccurrence_Name();

	/**
	 * Returns the meta object for enum '{@link QueryMetamodel.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Order</em>'.
	 * @see QueryMetamodel.Order
	 * @generated
	 */
	EEnum getOrder();

	/**
	 * Returns the meta object for enum '{@link QueryMetamodel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message</em>'.
	 * @see QueryMetamodel.Message
	 * @generated
	 */
	EEnum getMessage();

	/**
	 * Returns the meta object for enum '{@link QueryMetamodel.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see QueryMetamodel.Gender
	 * @generated
	 */
	EEnum getGender();

	/**
	 * Returns the meta object for enum '{@link QueryMetamodel.CarePathway <em>Care Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Care Pathway</em>'.
	 * @see QueryMetamodel.CarePathway
	 * @generated
	 */
	EEnum getCarePathway();

	/**
	 * Returns the meta object for enum '{@link QueryMetamodel.EStep <em>EStep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EStep</em>'.
	 * @see QueryMetamodel.EStep
	 * @generated
	 */
	EEnum getEStep();

	/**
	 * Returns the meta object for enum '{@link QueryMetamodel.EConduct <em>EConduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EConduct</em>'.
	 * @see QueryMetamodel.EConduct
	 * @generated
	 */
	EEnum getEConduct();

	/**
	 * Returns the meta object for enum '{@link QueryMetamodel.BooleanConduct <em>Boolean Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Conduct</em>'.
	 * @see QueryMetamodel.BooleanConduct
	 * @generated
	 */
	EEnum getBooleanConduct();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Query_metamodelFactory getQuery_metamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.EAttributeImpl <em>EAttribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.EAttributeImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEAttribute()
		 * @generated
		 */
		EClass EATTRIBUTE = eINSTANCE.getEAttribute();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATTRIBUTE__SEX = eINSTANCE.getEAttribute_Sex();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATTRIBUTE__AGE = eINSTANCE.getEAttribute_Age();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATTRIBUTE__RANGE = eINSTANCE.getEAttribute_Range();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATTRIBUTE__DATE = eINSTANCE.getEAttribute_Date();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATTRIBUTE__STATUS = eINSTANCE.getEAttribute_Status();

		/**
		 * The meta object literal for the '<em><b>Care Pathway</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATTRIBUTE__CARE_PATHWAY = eINSTANCE.getEAttribute_CarePathway();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.ARangeImpl <em>ARange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.ARangeImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getARange()
		 * @generated
		 */
		EClass ARANGE = eINSTANCE.getARange();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARANGE__QUANTITY = eINSTANCE.getARange_Quantity();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARANGE__ORDER = eINSTANCE.getARange_Order();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.EQueryImpl <em>EQuery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.EQueryImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEQuery()
		 * @generated
		 */
		EClass EQUERY = eINSTANCE.getEQuery();

		/**
		 * The meta object literal for the '<em><b>EAttribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUERY__EATTRIBUTE = eINSTANCE.getEQuery_EAttribute();

		/**
		 * The meta object literal for the '<em><b>EMethod</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUERY__EMETHOD = eINSTANCE.getEQuery_EMethod();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.ADateImpl <em>ADate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.ADateImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getADate()
		 * @generated
		 */
		EClass ADATE = eINSTANCE.getADate();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADATE__FROM = eINSTANCE.getADate_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADATE__TO = eINSTANCE.getADate_To();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.AStatusImpl <em>AStatus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.AStatusImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getAStatus()
		 * @generated
		 */
		EClass ASTATUS = eINSTANCE.getAStatus();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTATUS__MESSAGE = eINSTANCE.getAStatus_Message();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASTATUS__VALUE = eINSTANCE.getAStatus_Value();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.AAgeImpl <em>AAge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.AAgeImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getAAge()
		 * @generated
		 */
		EClass AAGE = eINSTANCE.getAAge();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAGE__FROM = eINSTANCE.getAAge_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AAGE__TO = eINSTANCE.getAAge_To();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.ASexImpl <em>ASex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.ASexImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getASex()
		 * @generated
		 */
		EClass ASEX = eINSTANCE.getASex();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASEX__SEX = eINSTANCE.getASex_Sex();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.ACarePathwayImpl <em>ACare Pathway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.ACarePathwayImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getACarePathway()
		 * @generated
		 */
		EClass ACARE_PATHWAY = eINSTANCE.getACarePathway();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACARE_PATHWAY__NAME = eINSTANCE.getACarePathway_Name();

		/**
		 * The meta object literal for the '<em><b>Conduct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACARE_PATHWAY__CONDUCT = eINSTANCE.getACarePathway_Conduct();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QStatusImpl <em>QStatus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QStatusImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQStatus()
		 * @generated
		 */
		EClass QSTATUS = eINSTANCE.getQStatus();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSTATUS__NAME = eINSTANCE.getQStatus_Name();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QSTATUS__STATUS = eINSTANCE.getQStatus_Status();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.EMethodImpl <em>EMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.EMethodImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEMethod()
		 * @generated
		 */
		EClass EMETHOD = eINSTANCE.getEMethod();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QConductImpl <em>QConduct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QConductImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQConduct()
		 * @generated
		 */
		EClass QCONDUCT = eINSTANCE.getQConduct();

		/**
		 * The meta object literal for the '<em><b>Conduct</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QCONDUCT__CONDUCT = eINSTANCE.getQConduct_Conduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QCONDUCT__NAME = eINSTANCE.getQConduct_Name();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QRecurrentFlowImpl <em>QRecurrent Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QRecurrentFlowImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQRecurrentFlow()
		 * @generated
		 */
		EClass QRECURRENT_FLOW = eINSTANCE.getQRecurrentFlow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QRECURRENT_FLOW__NAME = eINSTANCE.getQRecurrentFlow_Name();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QRECURRENT_FLOW__FLOWS = eINSTANCE.getQRecurrentFlow_Flows();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QAverageTimeImpl <em>QAverage Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QAverageTimeImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQAverageTime()
		 * @generated
		 */
		EClass QAVERAGE_TIME = eINSTANCE.getQAverageTime();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QAVERAGE_TIME__NAME = eINSTANCE.getQAverageTime_Name();

		/**
		 * The meta object literal for the '<em><b>Average Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QAVERAGE_TIME__AVERAGE_TIME = eINSTANCE.getQAverageTime_AverageTime();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QMedicationImpl <em>QMedication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QMedicationImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQMedication()
		 * @generated
		 */
		EClass QMEDICATION = eINSTANCE.getQMedication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QMEDICATION__NAME = eINSTANCE.getQMedication_Name();

		/**
		 * The meta object literal for the '<em><b>Medications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QMEDICATION__MEDICATIONS = eINSTANCE.getQMedication_Medications();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QOccurrenceImpl <em>QOccurrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QOccurrenceImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQOccurrence()
		 * @generated
		 */
		EClass QOCCURRENCE = eINSTANCE.getQOccurrence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QOCCURRENCE__NAME = eINSTANCE.getQOccurrence_Name();

		/**
		 * The meta object literal for the '<em><b>Occurrence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QOCCURRENCE__OCCURRENCE = eINSTANCE.getQOccurrence_Occurrence();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.FlowImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__PERCENTAGE = eINSTANCE.getFlow_Percentage();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__QUANTITY = eINSTANCE.getFlow_Quantity();

		/**
		 * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SEQUENCES = eINSTANCE.getFlow_Sequences();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.MedicationImpl <em>Medication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.MedicationImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getMedication()
		 * @generated
		 */
		EClass MEDICATION = eINSTANCE.getMedication();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__PERCENTAGE = eINSTANCE.getMedication_Percentage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__NAME = eINSTANCE.getMedication_Name();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__QUANTITY = eINSTANCE.getMedication_Quantity();

		/**
		 * The meta object literal for the '<em><b>Pathway</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATION__PATHWAY = eINSTANCE.getMedication_Pathway();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.SequenceImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__ID = eINSTANCE.getSequence_Id();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__TYPE = eINSTANCE.getSequence_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__NAME = eINSTANCE.getSequence_Name();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.PathwayImpl <em>Pathway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.PathwayImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getPathway()
		 * @generated
		 */
		EClass PATHWAY = eINSTANCE.getPathway();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__ID = eINSTANCE.getPathway_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__NAME = eINSTANCE.getPathway_Name();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__PERCENTAGE = eINSTANCE.getPathway_Percentage();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__QUANTITY = eINSTANCE.getPathway_Quantity();

		/**
		 * The meta object literal for the '<em><b>Pathway</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__PATHWAY = eINSTANCE.getPathway_Pathway();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.StatusImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '<em><b>In Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__IN_PROGRESS = eINSTANCE.getStatus_InProgress();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__COMPLETED = eINSTANCE.getStatus_Completed();

		/**
		 * The meta object literal for the '<em><b>Aborted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__ABORTED = eINSTANCE.getStatus_Aborted();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__NAME = eINSTANCE.getStatus_Name();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.ConductImpl <em>Conduct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.ConductImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getConduct()
		 * @generated
		 */
		EClass CONDUCT = eINSTANCE.getConduct();

		/**
		 * The meta object literal for the '<em><b>No Conduct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCT__NO_CONDUCT = eINSTANCE.getConduct_NoConduct();

		/**
		 * The meta object literal for the '<em><b>With Conduct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCT__WITH_CONDUCT = eINSTANCE.getConduct_WithConduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDUCT__NAME = eINSTANCE.getConduct_Name();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.AverageTimeImpl <em>Average Time</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.AverageTimeImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getAverageTime()
		 * @generated
		 */
		EClass AVERAGE_TIME = eINSTANCE.getAverageTime();

		/**
		 * The meta object literal for the '<em><b>Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVERAGE_TIME__AVERAGE = eINSTANCE.getAverageTime_Average();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVERAGE_TIME__NAME = eINSTANCE.getAverageTime_Name();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.OccurrenceImpl <em>Occurrence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.OccurrenceImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getOccurrence()
		 * @generated
		 */
		EClass OCCURRENCE = eINSTANCE.getOccurrence();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCURRENCE__VALUE = eINSTANCE.getOccurrence_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OCCURRENCE__NAME = eINSTANCE.getOccurrence_Name();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.Order <em>Order</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.Order
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getOrder()
		 * @generated
		 */
		EEnum ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.Message <em>Message</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.Message
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getMessage()
		 * @generated
		 */
		EEnum MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.Gender
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.CarePathway <em>Care Pathway</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.CarePathway
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getCarePathway()
		 * @generated
		 */
		EEnum CARE_PATHWAY = eINSTANCE.getCarePathway();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.EStep <em>EStep</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.EStep
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEStep()
		 * @generated
		 */
		EEnum ESTEP = eINSTANCE.getEStep();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.EConduct <em>EConduct</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.EConduct
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEConduct()
		 * @generated
		 */
		EEnum ECONDUCT = eINSTANCE.getEConduct();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.BooleanConduct <em>Boolean Conduct</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.BooleanConduct
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getBooleanConduct()
		 * @generated
		 */
		EEnum BOOLEAN_CONDUCT = eINSTANCE.getBooleanConduct();

	}

} //Query_metamodelPackage
