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
	 * The meta object id for the '{@link QueryMetamodel.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.RangeImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__QUANTITY = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__ORDER = 1;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link QueryMetamodel.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.DateImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE__TO = 1;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.StatusImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 4;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.AgeImpl <em>Age</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.AgeImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getAge()
	 * @generated
	 */
	int AGE = 5;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__FROM = 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE__TO = 1;

	/**
	 * The number of structural features of the '<em>Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Age</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.SexImpl <em>Sex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.SexImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getSex()
	 * @generated
	 */
	int SEX = 6;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEX__SEX = 0;

	/**
	 * The number of structural features of the '<em>Sex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEX_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Sex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.ECarePathwayImpl <em>ECare Pathway</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.ECarePathwayImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getECarePathway()
	 * @generated
	 */
	int ECARE_PATHWAY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECARE_PATHWAY__NAME = 0;

	/**
	 * The number of structural features of the '<em>ECare Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECARE_PATHWAY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>ECare Pathway</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECARE_PATHWAY_OPERATION_COUNT = 0;

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
	 * The meta object id for the '{@link QueryMetamodel.impl.EStatusImpl <em>EStatus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.EStatusImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEStatus()
	 * @generated
	 */
	int ESTATUS = 8;

	/**
	 * The feature id for the '<em><b>Aborted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATUS__ABORTED = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Completed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATUS__COMPLETED = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>In Progress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATUS__IN_PROGRESS = EMETHOD_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATUS__NAME = EMETHOD_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>EStatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATUS_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>EStatus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTATUS_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.EConductImpl <em>EConduct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.EConductImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEConduct()
	 * @generated
	 */
	int ECONDUCT = 10;

	/**
	 * The feature id for the '<em><b>With Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONDUCT__WITH_CONDUCT = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>No Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONDUCT__NO_CONDUCT = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONDUCT__NAME = EMETHOD_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>EConduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONDUCT_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>EConduct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECONDUCT_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.ERecurrentFlowImpl <em>ERecurrent Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.ERecurrentFlowImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getERecurrentFlow()
	 * @generated
	 */
	int ERECURRENT_FLOW = 11;

	/**
	 * The feature id for the '<em><b>Flows</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERECURRENT_FLOW__FLOWS = EMETHOD_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERECURRENT_FLOW__NAME = EMETHOD_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ERecurrent Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERECURRENT_FLOW_FEATURE_COUNT = EMETHOD_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>ERecurrent Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ERECURRENT_FLOW_OPERATION_COUNT = EMETHOD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Order <em>Order</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Order
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 12;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Message <em>Message</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Message
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 13;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Gender
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 14;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Method <em>Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Method
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 15;

	/**
	 * The meta object id for the '{@link QueryMetamodel.CarePathway <em>Care Pathway</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.CarePathway
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getCarePathway()
	 * @generated
	 */
	int CARE_PATHWAY = 16;

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
	 * Returns the meta object for class '{@link QueryMetamodel.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see QueryMetamodel.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Range#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see QueryMetamodel.Range#getQuantity()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Range#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see QueryMetamodel.Range#getOrder()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Order();

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
	 * Returns the meta object for class '{@link QueryMetamodel.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see QueryMetamodel.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Date#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see QueryMetamodel.Date#getFrom()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_From();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Date#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see QueryMetamodel.Date#getTo()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_To();

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
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Status#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see QueryMetamodel.Status#getMessage()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Message();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Status#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see QueryMetamodel.Status#isValue()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Value();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Age <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age</em>'.
	 * @see QueryMetamodel.Age
	 * @generated
	 */
	EClass getAge();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Age#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see QueryMetamodel.Age#getFrom()
	 * @see #getAge()
	 * @generated
	 */
	EAttribute getAge_From();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Age#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see QueryMetamodel.Age#getTo()
	 * @see #getAge()
	 * @generated
	 */
	EAttribute getAge_To();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Sex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sex</em>'.
	 * @see QueryMetamodel.Sex
	 * @generated
	 */
	EClass getSex();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Sex#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see QueryMetamodel.Sex#getSex()
	 * @see #getSex()
	 * @generated
	 */
	EAttribute getSex_Sex();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.ECarePathway <em>ECare Pathway</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ECare Pathway</em>'.
	 * @see QueryMetamodel.ECarePathway
	 * @generated
	 */
	EClass getECarePathway();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ECarePathway#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.ECarePathway#getName()
	 * @see #getECarePathway()
	 * @generated
	 */
	EAttribute getECarePathway_Name();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.EStatus <em>EStatus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStatus</em>'.
	 * @see QueryMetamodel.EStatus
	 * @generated
	 */
	EClass getEStatus();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.EStatus#getAborted <em>Aborted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aborted</em>'.
	 * @see QueryMetamodel.EStatus#getAborted()
	 * @see #getEStatus()
	 * @generated
	 */
	EAttribute getEStatus_Aborted();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.EStatus#getCompleted <em>Completed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completed</em>'.
	 * @see QueryMetamodel.EStatus#getCompleted()
	 * @see #getEStatus()
	 * @generated
	 */
	EAttribute getEStatus_Completed();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.EStatus#getInProgress <em>In Progress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>In Progress</em>'.
	 * @see QueryMetamodel.EStatus#getInProgress()
	 * @see #getEStatus()
	 * @generated
	 */
	EAttribute getEStatus_InProgress();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.EStatus#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.EStatus#getName()
	 * @see #getEStatus()
	 * @generated
	 */
	EAttribute getEStatus_Name();

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
	 * Returns the meta object for class '{@link QueryMetamodel.EConduct <em>EConduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EConduct</em>'.
	 * @see QueryMetamodel.EConduct
	 * @generated
	 */
	EClass getEConduct();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.EConduct#getWithConduct <em>With Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>With Conduct</em>'.
	 * @see QueryMetamodel.EConduct#getWithConduct()
	 * @see #getEConduct()
	 * @generated
	 */
	EAttribute getEConduct_WithConduct();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.EConduct#getNoConduct <em>No Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>No Conduct</em>'.
	 * @see QueryMetamodel.EConduct#getNoConduct()
	 * @see #getEConduct()
	 * @generated
	 */
	EAttribute getEConduct_NoConduct();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.EConduct#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.EConduct#getName()
	 * @see #getEConduct()
	 * @generated
	 */
	EAttribute getEConduct_Name();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.ERecurrentFlow <em>ERecurrent Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ERecurrent Flow</em>'.
	 * @see QueryMetamodel.ERecurrentFlow
	 * @generated
	 */
	EClass getERecurrentFlow();

	/**
	 * Returns the meta object for the attribute list '{@link QueryMetamodel.ERecurrentFlow#getFlows <em>Flows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Flows</em>'.
	 * @see QueryMetamodel.ERecurrentFlow#getFlows()
	 * @see #getERecurrentFlow()
	 * @generated
	 */
	EAttribute getERecurrentFlow_Flows();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ERecurrentFlow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.ERecurrentFlow#getName()
	 * @see #getERecurrentFlow()
	 * @generated
	 */
	EAttribute getERecurrentFlow_Name();

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
	 * Returns the meta object for enum '{@link QueryMetamodel.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Method</em>'.
	 * @see QueryMetamodel.Method
	 * @generated
	 */
	EEnum getMethod();

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
		 * The meta object literal for the '{@link QueryMetamodel.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.RangeImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getRange()
		 * @generated
		 */
		EClass RANGE = eINSTANCE.getRange();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__QUANTITY = eINSTANCE.getRange_Quantity();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__ORDER = eINSTANCE.getRange_Order();

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
		 * The meta object literal for the '{@link QueryMetamodel.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.DateImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__FROM = eINSTANCE.getDate_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE__TO = eINSTANCE.getDate_To();

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
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__MESSAGE = eINSTANCE.getStatus_Message();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATUS__VALUE = eINSTANCE.getStatus_Value();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.AgeImpl <em>Age</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.AgeImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getAge()
		 * @generated
		 */
		EClass AGE = eINSTANCE.getAge();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGE__FROM = eINSTANCE.getAge_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGE__TO = eINSTANCE.getAge_To();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.SexImpl <em>Sex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.SexImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getSex()
		 * @generated
		 */
		EClass SEX = eINSTANCE.getSex();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEX__SEX = eINSTANCE.getSex_Sex();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.ECarePathwayImpl <em>ECare Pathway</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.ECarePathwayImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getECarePathway()
		 * @generated
		 */
		EClass ECARE_PATHWAY = eINSTANCE.getECarePathway();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECARE_PATHWAY__NAME = eINSTANCE.getECarePathway_Name();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.EStatusImpl <em>EStatus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.EStatusImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEStatus()
		 * @generated
		 */
		EClass ESTATUS = eINSTANCE.getEStatus();

		/**
		 * The meta object literal for the '<em><b>Aborted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATUS__ABORTED = eINSTANCE.getEStatus_Aborted();

		/**
		 * The meta object literal for the '<em><b>Completed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATUS__COMPLETED = eINSTANCE.getEStatus_Completed();

		/**
		 * The meta object literal for the '<em><b>In Progress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATUS__IN_PROGRESS = eINSTANCE.getEStatus_InProgress();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTATUS__NAME = eINSTANCE.getEStatus_Name();

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
		 * The meta object literal for the '{@link QueryMetamodel.impl.EConductImpl <em>EConduct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.EConductImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEConduct()
		 * @generated
		 */
		EClass ECONDUCT = eINSTANCE.getEConduct();

		/**
		 * The meta object literal for the '<em><b>With Conduct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONDUCT__WITH_CONDUCT = eINSTANCE.getEConduct_WithConduct();

		/**
		 * The meta object literal for the '<em><b>No Conduct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONDUCT__NO_CONDUCT = eINSTANCE.getEConduct_NoConduct();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECONDUCT__NAME = eINSTANCE.getEConduct_Name();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.ERecurrentFlowImpl <em>ERecurrent Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.ERecurrentFlowImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getERecurrentFlow()
		 * @generated
		 */
		EClass ERECURRENT_FLOW = eINSTANCE.getERecurrentFlow();

		/**
		 * The meta object literal for the '<em><b>Flows</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERECURRENT_FLOW__FLOWS = eINSTANCE.getERecurrentFlow_Flows();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ERECURRENT_FLOW__NAME = eINSTANCE.getERecurrentFlow_Name();

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
		 * The meta object literal for the '{@link QueryMetamodel.Method <em>Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.Method
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getMethod()
		 * @generated
		 */
		EEnum METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.CarePathway <em>Care Pathway</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.CarePathway
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getCarePathway()
		 * @generated
		 */
		EEnum CARE_PATHWAY = eINSTANCE.getCarePathway();

	}

} //Query_metamodelPackage
