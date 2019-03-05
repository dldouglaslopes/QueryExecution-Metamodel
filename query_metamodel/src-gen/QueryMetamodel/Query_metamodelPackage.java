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
	 * The feature id for the '<em><b>EMethod</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMETHOD__PATHWAY = 0;

	/**
	 * The number of structural features of the '<em>EMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMETHOD_FEATURE_COUNT = 1;

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
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTATUS__PATHWAY = EMETHOD__PATHWAY;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTATUS__COMPLETED = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTATUS__IN_PROGRESS = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aborted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTATUS__ABORTED = EMETHOD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>QStatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTATUS_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCONDUCT__PATHWAY = EMETHOD__PATHWAY;

	/**
	 * The feature id for the '<em><b>With Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCONDUCT__WITH_CONDUCT = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QCONDUCT__NO_CONDUCT = EMETHOD_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link QueryMetamodel.impl.QFlowImpl <em>QFlow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QFlowImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQFlow()
	 * @generated
	 */
	int QFLOW = 11;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFLOW__PATHWAY = EMETHOD__PATHWAY;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFLOW__FLOW = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QFlow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFLOW_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QFlow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QFLOW_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAVERAGE_TIME__PATHWAY = EMETHOD__PATHWAY;

	/**
	 * The feature id for the '<em><b>Average</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAVERAGE_TIME__AVERAGE = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QAverage Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QAVERAGE_TIME_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 1;

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
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMEDICATION__PATHWAY = EMETHOD__PATHWAY;

	/**
	 * The feature id for the '<em><b>Medications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMEDICATION__MEDICATIONS = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QMedication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMEDICATION_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QMedication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QMEDICATION_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.FlowImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 14;

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
	int MEDICATION = 15;

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
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__ID = 3;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION__STEP = 4;

	/**
	 * The number of structural features of the '<em>Medication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDICATION_FEATURE_COUNT = 5;

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
	int SEQUENCE = 16;

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
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = 4;

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
	int PATHWAY = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY__ID = 3;

	/**
	 * The number of structural features of the '<em>Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATHWAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QAnswerImpl <em>QAnswer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QAnswerImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQAnswer()
	 * @generated
	 */
	int QANSWER = 18;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QANSWER__PATHWAY = EMETHOD__PATHWAY;

	/**
	 * The feature id for the '<em><b>Question</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QANSWER__QUESTION = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QAnswer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QANSWER_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QAnswer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QANSWER_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QStepImpl <em>QStep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QStepImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQStep()
	 * @generated
	 */
	int QSTEP = 19;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTEP__PATHWAY = EMETHOD__PATHWAY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTEP__STEP = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QStep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTEP_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QStep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTEP_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QReturnImpl <em>QReturn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QReturnImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQReturn()
	 * @generated
	 */
	int QRETURN = 20;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QRETURN__PATHWAY = EMETHOD__PATHWAY;

	/**
	 * The feature id for the '<em><b>Patient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QRETURN__PATIENT = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QReturn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QRETURN_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QReturn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QRETURN_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QStopImpl <em>QStop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QStopImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQStop()
	 * @generated
	 */
	int QSTOP = 21;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTOP__PATHWAY = EMETHOD__PATHWAY;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTOP__STEP = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QStop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTOP_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QStop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QSTOP_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QPrescriptionImpl <em>QPrescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QPrescriptionImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQPrescription()
	 * @generated
	 */
	int QPRESCRIPTION = 22;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QPRESCRIPTION__PATHWAY = EMETHOD__PATHWAY;

	/**
	 * The feature id for the '<em><b>Prescription</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QPRESCRIPTION__PRESCRIPTION = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QPrescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QPRESCRIPTION_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QPrescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QPRESCRIPTION_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QExamImpl <em>QExam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QExamImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQExam()
	 * @generated
	 */
	int QEXAM = 23;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QEXAM__PATHWAY = EMETHOD__PATHWAY;

	/**
	 * The feature id for the '<em><b>Exam</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QEXAM__EXAM = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QExam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QEXAM_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>QExam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QEXAM_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.StepImpl <em>Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.StepImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getStep()
	 * @generated
	 */
	int STEP = 24;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__PERCENTAGE = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP__ID = 5;

	/**
	 * The number of structural features of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.PrescriptionImpl <em>Prescription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.PrescriptionImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getPrescription()
	 * @generated
	 */
	int PRESCRIPTION = 25;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__CODE = 1;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__IDS = 2;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__PERCENTAGE = 3;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION__QUANTITY = 4;

	/**
	 * The number of structural features of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Prescription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.ExamImpl <em>Exam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.ExamImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getExam()
	 * @generated
	 */
	int EXAM = 26;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__PERCENTAGE = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__CODE = 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__QUANTITY = 3;

	/**
	 * The feature id for the '<em><b>Ids</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM__IDS = 4;

	/**
	 * The number of structural features of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Exam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QuestionImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 27;

	/**
	 * The feature id for the '<em><b>Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__PERCENTAGE = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ANSWER = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TYPE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ID = 5;

	/**
	 * The feature id for the '<em><b>Step</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__STEP = 6;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.AnswerImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 31;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.ABooleanImpl <em>ABoolean</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.ABooleanImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getABoolean()
	 * @generated
	 */
	int ABOOLEAN = 28;

	/**
	 * The feature id for the '<em><b>False Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOOLEAN__FALSE_QUANTITY = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>True Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOOLEAN__TRUE_QUANTITY = ANSWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ABoolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOOLEAN_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ABoolean</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABOOLEAN_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.PatientImpl <em>Patient</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.PatientImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getPatient()
	 * @generated
	 */
	int PATIENT = 29;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__CODE = 0;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__AGE = 1;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__SEX = 2;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT__QUANTITY = 3;

	/**
	 * The number of structural features of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Patient</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.ANumericImpl <em>ANumeric</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.ANumericImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getANumeric()
	 * @generated
	 */
	int ANUMERIC = 30;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANUMERIC__VALUE = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANUMERIC__QUANTITY = ANSWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ANumeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANUMERIC_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ANumeric</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANUMERIC_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.QOccurrenceImpl <em>QOccurrence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.QOccurrenceImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQOccurrence()
	 * @generated
	 */
	int QOCCURRENCE = 32;

	/**
	 * The feature id for the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOCCURRENCE__PATHWAY = EMETHOD__PATHWAY;

	/**
	 * The number of structural features of the '<em>QOccurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOCCURRENCE_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>QOccurrence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QOCCURRENCE_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Order <em>Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Order
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 33;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Message <em>Message</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Message
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 34;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Gender
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 35;

	/**
	 * The meta object id for the '{@link QueryMetamodel.CarePathway <em>Care Pathway</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.CarePathway
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getCarePathway()
	 * @generated
	 */
	int CARE_PATHWAY = 36;

	/**
	 * The meta object id for the '{@link QueryMetamodel.EStep <em>EStep</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.EStep
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEStep()
	 * @generated
	 */
	int ESTEP = 37;

	/**
	 * The meta object id for the '{@link QueryMetamodel.EConduct <em>EConduct</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.EConduct
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEConduct()
	 * @generated
	 */
	int ECONDUCT = 38;

	/**
	 * The meta object id for the '{@link QueryMetamodel.BooleanConduct <em>Boolean Conduct</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.BooleanConduct
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getBooleanConduct()
	 * @generated
	 */
	int BOOLEAN_CONDUCT = 39;

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
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.EQuery#getEMethod <em>EMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>EMethod</em>'.
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
	 * Returns the meta object for the attribute '{@link QueryMetamodel.QStatus#getCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see QueryMetamodel.QStatus#getCompleted()
	 * @see #getQStatus()
	 * @generated
	 */
	EAttribute getQStatus_Completed();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.QStatus#getInProgress <em>In Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Progress</em>'.
	 * @see QueryMetamodel.QStatus#getInProgress()
	 * @see #getQStatus()
	 * @generated
	 */
	EAttribute getQStatus_InProgress();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.QStatus#getAborted <em>Aborted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aborted</em>'.
	 * @see QueryMetamodel.QStatus#getAborted()
	 * @see #getQStatus()
	 * @generated
	 */
	EAttribute getQStatus_Aborted();

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
	 * Returns the meta object for the containment reference '{@link QueryMetamodel.EMethod#getPathway <em>Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pathway</em>'.
	 * @see QueryMetamodel.EMethod#getPathway()
	 * @see #getEMethod()
	 * @generated
	 */
	EReference getEMethod_Pathway();

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
	 * Returns the meta object for the attribute '{@link QueryMetamodel.QConduct#getWithConduct <em>With Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Conduct</em>'.
	 * @see QueryMetamodel.QConduct#getWithConduct()
	 * @see #getQConduct()
	 * @generated
	 */
	EAttribute getQConduct_WithConduct();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.QConduct#getNoConduct <em>No Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Conduct</em>'.
	 * @see QueryMetamodel.QConduct#getNoConduct()
	 * @see #getQConduct()
	 * @generated
	 */
	EAttribute getQConduct_NoConduct();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.QFlow <em>QFlow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QFlow</em>'.
	 * @see QueryMetamodel.QFlow
	 * @generated
	 */
	EClass getQFlow();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.QFlow#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flow</em>'.
	 * @see QueryMetamodel.QFlow#getFlow()
	 * @see #getQFlow()
	 * @generated
	 */
	EReference getQFlow_Flow();

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
	 * Returns the meta object for the attribute '{@link QueryMetamodel.QAverageTime#getAverage <em>Average</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average</em>'.
	 * @see QueryMetamodel.QAverageTime#getAverage()
	 * @see #getQAverageTime()
	 * @generated
	 */
	EAttribute getQAverageTime_Average();

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
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Medication#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see QueryMetamodel.Medication#getId()
	 * @see #getMedication()
	 * @generated
	 */
	EAttribute getMedication_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.Medication#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see QueryMetamodel.Medication#getStep()
	 * @see #getMedication()
	 * @generated
	 */
	EReference getMedication_Step();

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
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Sequence#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see QueryMetamodel.Sequence#getDescription()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Description();

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
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Pathway#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see QueryMetamodel.Pathway#getVersion()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_Version();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Pathway#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see QueryMetamodel.Pathway#getId()
	 * @see #getPathway()
	 * @generated
	 */
	EAttribute getPathway_Id();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.QAnswer <em>QAnswer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QAnswer</em>'.
	 * @see QueryMetamodel.QAnswer
	 * @generated
	 */
	EClass getQAnswer();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.QAnswer#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question</em>'.
	 * @see QueryMetamodel.QAnswer#getQuestion()
	 * @see #getQAnswer()
	 * @generated
	 */
	EReference getQAnswer_Question();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.QStep <em>QStep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QStep</em>'.
	 * @see QueryMetamodel.QStep
	 * @generated
	 */
	EClass getQStep();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.QStep#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see QueryMetamodel.QStep#getStep()
	 * @see #getQStep()
	 * @generated
	 */
	EReference getQStep_Step();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.QReturn <em>QReturn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QReturn</em>'.
	 * @see QueryMetamodel.QReturn
	 * @generated
	 */
	EClass getQReturn();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.QReturn#getPatient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient</em>'.
	 * @see QueryMetamodel.QReturn#getPatient()
	 * @see #getQReturn()
	 * @generated
	 */
	EReference getQReturn_Patient();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.QStop <em>QStop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QStop</em>'.
	 * @see QueryMetamodel.QStop
	 * @generated
	 */
	EClass getQStop();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.QStop#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see QueryMetamodel.QStop#getStep()
	 * @see #getQStop()
	 * @generated
	 */
	EReference getQStop_Step();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.QPrescription <em>QPrescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QPrescription</em>'.
	 * @see QueryMetamodel.QPrescription
	 * @generated
	 */
	EClass getQPrescription();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.QPrescription#getPrescription <em>Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescription</em>'.
	 * @see QueryMetamodel.QPrescription#getPrescription()
	 * @see #getQPrescription()
	 * @generated
	 */
	EReference getQPrescription_Prescription();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.QExam <em>QExam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QExam</em>'.
	 * @see QueryMetamodel.QExam
	 * @generated
	 */
	EClass getQExam();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.QExam#getExam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exam</em>'.
	 * @see QueryMetamodel.QExam#getExam()
	 * @see #getQExam()
	 * @generated
	 */
	EReference getQExam_Exam();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Step <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Step</em>'.
	 * @see QueryMetamodel.Step
	 * @generated
	 */
	EClass getStep();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Step#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.Step#getName()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Name();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Step#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see QueryMetamodel.Step#getType()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Type();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Step#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see QueryMetamodel.Step#getDescription()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Description();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Step#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see QueryMetamodel.Step#getPercentage()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Step#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see QueryMetamodel.Step#getQuantity()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Step#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see QueryMetamodel.Step#getId()
	 * @see #getStep()
	 * @generated
	 */
	EAttribute getStep_Id();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Prescription <em>Prescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescription</em>'.
	 * @see QueryMetamodel.Prescription
	 * @generated
	 */
	EClass getPrescription();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Prescription#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.Prescription#getName()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Name();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Prescription#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see QueryMetamodel.Prescription#getCode()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Code();

	/**
	 * Returns the meta object for the attribute list '{@link QueryMetamodel.Prescription#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids</em>'.
	 * @see QueryMetamodel.Prescription#getIds()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Ids();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Prescription#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see QueryMetamodel.Prescription#getPercentage()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Prescription#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see QueryMetamodel.Prescription#getQuantity()
	 * @see #getPrescription()
	 * @generated
	 */
	EAttribute getPrescription_Quantity();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Exam <em>Exam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exam</em>'.
	 * @see QueryMetamodel.Exam
	 * @generated
	 */
	EClass getExam();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Exam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.Exam#getName()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Name();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Exam#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see QueryMetamodel.Exam#getPercentage()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Exam#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see QueryMetamodel.Exam#getCode()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Code();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Exam#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see QueryMetamodel.Exam#getQuantity()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Quantity();

	/**
	 * Returns the meta object for the attribute list '{@link QueryMetamodel.Exam#getIds <em>Ids</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ids</em>'.
	 * @see QueryMetamodel.Exam#getIds()
	 * @see #getExam()
	 * @generated
	 */
	EAttribute getExam_Ids();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see QueryMetamodel.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Question#getPercentage <em>Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage</em>'.
	 * @see QueryMetamodel.Question#getPercentage()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Percentage();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Question#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see QueryMetamodel.Question#getQuantity()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Question#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.Question#getName()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.Question#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Answer</em>'.
	 * @see QueryMetamodel.Question#getAnswer()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Answer();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Question#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see QueryMetamodel.Question#getType()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Type();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Question#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see QueryMetamodel.Question#getId()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.Question#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Step</em>'.
	 * @see QueryMetamodel.Question#getStep()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Step();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.ABoolean <em>ABoolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ABoolean</em>'.
	 * @see QueryMetamodel.ABoolean
	 * @generated
	 */
	EClass getABoolean();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ABoolean#getFalseQuantity <em>False Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>False Quantity</em>'.
	 * @see QueryMetamodel.ABoolean#getFalseQuantity()
	 * @see #getABoolean()
	 * @generated
	 */
	EAttribute getABoolean_FalseQuantity();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ABoolean#getTrueQuantity <em>True Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>True Quantity</em>'.
	 * @see QueryMetamodel.ABoolean#getTrueQuantity()
	 * @see #getABoolean()
	 * @generated
	 */
	EAttribute getABoolean_TrueQuantity();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Patient <em>Patient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient</em>'.
	 * @see QueryMetamodel.Patient
	 * @generated
	 */
	EClass getPatient();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Patient#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see QueryMetamodel.Patient#getCode()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Code();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Patient#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see QueryMetamodel.Patient#getAge()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Age();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Patient#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see QueryMetamodel.Patient#getSex()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Sex();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Patient#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see QueryMetamodel.Patient#getQuantity()
	 * @see #getPatient()
	 * @generated
	 */
	EAttribute getPatient_Quantity();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.ANumeric <em>ANumeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANumeric</em>'.
	 * @see QueryMetamodel.ANumeric
	 * @generated
	 */
	EClass getANumeric();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ANumeric#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see QueryMetamodel.ANumeric#getValue()
	 * @see #getANumeric()
	 * @generated
	 */
	EAttribute getANumeric_Value();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ANumeric#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see QueryMetamodel.ANumeric#getQuantity()
	 * @see #getANumeric()
	 * @generated
	 */
	EAttribute getANumeric_Quantity();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see QueryMetamodel.Answer
	 * @generated
	 */
	EClass getAnswer();

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
		 * The meta object literal for the '<em><b>EMethod</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSTATUS__COMPLETED = eINSTANCE.getQStatus_Completed();

		/**
		 * The meta object literal for the '<em><b>In Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSTATUS__IN_PROGRESS = eINSTANCE.getQStatus_InProgress();

		/**
		 * The meta object literal for the '<em><b>Aborted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QSTATUS__ABORTED = eINSTANCE.getQStatus_Aborted();

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
		 * The meta object literal for the '<em><b>Pathway</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMETHOD__PATHWAY = eINSTANCE.getEMethod_Pathway();

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
		 * The meta object literal for the '<em><b>With Conduct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QCONDUCT__WITH_CONDUCT = eINSTANCE.getQConduct_WithConduct();

		/**
		 * The meta object literal for the '<em><b>No Conduct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QCONDUCT__NO_CONDUCT = eINSTANCE.getQConduct_NoConduct();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QFlowImpl <em>QFlow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QFlowImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQFlow()
		 * @generated
		 */
		EClass QFLOW = eINSTANCE.getQFlow();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QFLOW__FLOW = eINSTANCE.getQFlow_Flow();

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
		 * The meta object literal for the '<em><b>Average</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QAVERAGE_TIME__AVERAGE = eINSTANCE.getQAverageTime_Average();

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
		 * The meta object literal for the '<em><b>Medications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QMEDICATION__MEDICATIONS = eINSTANCE.getQMedication_Medications();

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
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEDICATION__ID = eINSTANCE.getMedication_Id();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDICATION__STEP = eINSTANCE.getMedication_Step();

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
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__DESCRIPTION = eINSTANCE.getSequence_Description();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__NAME = eINSTANCE.getPathway_Name();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__QUANTITY = eINSTANCE.getPathway_Quantity();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__VERSION = eINSTANCE.getPathway_Version();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATHWAY__ID = eINSTANCE.getPathway_Id();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QAnswerImpl <em>QAnswer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QAnswerImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQAnswer()
		 * @generated
		 */
		EClass QANSWER = eINSTANCE.getQAnswer();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QANSWER__QUESTION = eINSTANCE.getQAnswer_Question();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QStepImpl <em>QStep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QStepImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQStep()
		 * @generated
		 */
		EClass QSTEP = eINSTANCE.getQStep();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QSTEP__STEP = eINSTANCE.getQStep_Step();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QReturnImpl <em>QReturn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QReturnImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQReturn()
		 * @generated
		 */
		EClass QRETURN = eINSTANCE.getQReturn();

		/**
		 * The meta object literal for the '<em><b>Patient</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QRETURN__PATIENT = eINSTANCE.getQReturn_Patient();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QStopImpl <em>QStop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QStopImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQStop()
		 * @generated
		 */
		EClass QSTOP = eINSTANCE.getQStop();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QSTOP__STEP = eINSTANCE.getQStop_Step();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QPrescriptionImpl <em>QPrescription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QPrescriptionImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQPrescription()
		 * @generated
		 */
		EClass QPRESCRIPTION = eINSTANCE.getQPrescription();

		/**
		 * The meta object literal for the '<em><b>Prescription</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QPRESCRIPTION__PRESCRIPTION = eINSTANCE.getQPrescription_Prescription();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QExamImpl <em>QExam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QExamImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQExam()
		 * @generated
		 */
		EClass QEXAM = eINSTANCE.getQExam();

		/**
		 * The meta object literal for the '<em><b>Exam</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QEXAM__EXAM = eINSTANCE.getQExam_Exam();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.StepImpl <em>Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.StepImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getStep()
		 * @generated
		 */
		EClass STEP = eINSTANCE.getStep();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__NAME = eINSTANCE.getStep_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__TYPE = eINSTANCE.getStep_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__DESCRIPTION = eINSTANCE.getStep_Description();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__PERCENTAGE = eINSTANCE.getStep_Percentage();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__QUANTITY = eINSTANCE.getStep_Quantity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STEP__ID = eINSTANCE.getStep_Id();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.PrescriptionImpl <em>Prescription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.PrescriptionImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getPrescription()
		 * @generated
		 */
		EClass PRESCRIPTION = eINSTANCE.getPrescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__NAME = eINSTANCE.getPrescription_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__CODE = eINSTANCE.getPrescription_Code();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__IDS = eINSTANCE.getPrescription_Ids();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__PERCENTAGE = eINSTANCE.getPrescription_Percentage();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIPTION__QUANTITY = eINSTANCE.getPrescription_Quantity();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.ExamImpl <em>Exam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.ExamImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getExam()
		 * @generated
		 */
		EClass EXAM = eINSTANCE.getExam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__NAME = eINSTANCE.getExam_Name();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__PERCENTAGE = eINSTANCE.getExam_Percentage();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__CODE = eINSTANCE.getExam_Code();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__QUANTITY = eINSTANCE.getExam_Quantity();

		/**
		 * The meta object literal for the '<em><b>Ids</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAM__IDS = eINSTANCE.getExam_Ids();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.QuestionImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__PERCENTAGE = eINSTANCE.getQuestion_Percentage();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QUANTITY = eINSTANCE.getQuestion_Quantity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ANSWER = eINSTANCE.getQuestion_Answer();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__TYPE = eINSTANCE.getQuestion_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__ID = eINSTANCE.getQuestion_Id();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__STEP = eINSTANCE.getQuestion_Step();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.ABooleanImpl <em>ABoolean</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.ABooleanImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getABoolean()
		 * @generated
		 */
		EClass ABOOLEAN = eINSTANCE.getABoolean();

		/**
		 * The meta object literal for the '<em><b>False Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABOOLEAN__FALSE_QUANTITY = eINSTANCE.getABoolean_FalseQuantity();

		/**
		 * The meta object literal for the '<em><b>True Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABOOLEAN__TRUE_QUANTITY = eINSTANCE.getABoolean_TrueQuantity();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.PatientImpl <em>Patient</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.PatientImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getPatient()
		 * @generated
		 */
		EClass PATIENT = eINSTANCE.getPatient();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__CODE = eINSTANCE.getPatient_Code();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__AGE = eINSTANCE.getPatient_Age();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__SEX = eINSTANCE.getPatient_Sex();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT__QUANTITY = eINSTANCE.getPatient_Quantity();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.ANumericImpl <em>ANumeric</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.ANumericImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getANumeric()
		 * @generated
		 */
		EClass ANUMERIC = eINSTANCE.getANumeric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANUMERIC__VALUE = eINSTANCE.getANumeric_Value();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANUMERIC__QUANTITY = eINSTANCE.getANumeric_Quantity();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.AnswerImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

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
