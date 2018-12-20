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
	 * The feature id for the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ORDER = 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__AGE = 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__RANGE = 3;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__DATE = 4;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__STATUS = 5;

	/**
	 * The feature id for the '<em><b>Estep</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__ESTEP = 6;

	/**
	 * The feature id for the '<em><b>Complementaryconducts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE__COMPLEMENTARYCONDUCTS = 7;

	/**
	 * The number of structural features of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>EAttribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.OrderImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER = 0;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.RangeImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__FROM = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__QUANTITY = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE__TO = 2;

	/**
	 * The number of structural features of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.FieldImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 11;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.EStepImpl <em>EStep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.EStepImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEStep()
	 * @generated
	 */
	int ESTEP = 3;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP__STEP = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>EStep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>EStep</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTEP_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.EQueryImpl <em>EQuery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.EQueryImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEQuery()
	 * @generated
	 */
	int EQUERY = 4;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUERY__METHOD = 0;

	/**
	 * The number of structural features of the '<em>EQuery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUERY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>EQuery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.ComplementaryConductsImpl <em>Complementary Conducts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.ComplementaryConductsImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getComplementaryConducts()
	 * @generated
	 */
	int COMPLEMENTARY_CONDUCTS = 5;

	/**
	 * The feature id for the '<em><b>Conduct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_CONDUCTS__CONDUCT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complementary Conducts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_CONDUCTS_FEATURE_COUNT = FIELD_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complementary Conducts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEMENTARY_CONDUCTS_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.DateImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 6;

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
	int STATUS = 7;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS__MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Status</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = 1;

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
	int AGE = 8;

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
	int SEX = 9;

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
	 * The meta object id for the '{@link QueryMetamodel.impl.EMethodImpl <em>EMethod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.impl.EMethodImpl
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEMethod()
	 * @generated
	 */
	int EMETHOD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMETHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMETHOD__ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>EMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMETHOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EMethod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMETHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Qualifier <em>Qualifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Qualifier
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQualifier()
	 * @generated
	 */
	int QUALIFIER = 12;

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
	 * The meta object id for the '{@link QueryMetamodel.EElement <em>EElement</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.EElement
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEElement()
	 * @generated
	 */
	int EELEMENT = 14;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Conduct <em>Conduct</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Conduct
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getConduct()
	 * @generated
	 */
	int CONDUCT = 15;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Gender
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 16;

	/**
	 * The meta object id for the '{@link QueryMetamodel.Method <em>Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see QueryMetamodel.Method
	 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 17;

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
	 * Returns the meta object for the containment reference '{@link QueryMetamodel.EAttribute#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order</em>'.
	 * @see QueryMetamodel.EAttribute#getOrder()
	 * @see #getEAttribute()
	 * @generated
	 */
	EReference getEAttribute_Order();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.EAttribute#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Age</em>'.
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
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.EAttribute#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date</em>'.
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
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.EAttribute#getEstep <em>Estep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Estep</em>'.
	 * @see QueryMetamodel.EAttribute#getEstep()
	 * @see #getEAttribute()
	 * @generated
	 */
	EReference getEAttribute_Estep();

	/**
	 * Returns the meta object for the containment reference list '{@link QueryMetamodel.EAttribute#getComplementaryconducts <em>Complementaryconducts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Complementaryconducts</em>'.
	 * @see QueryMetamodel.EAttribute#getComplementaryconducts()
	 * @see #getEAttribute()
	 * @generated
	 */
	EReference getEAttribute_Complementaryconducts();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see QueryMetamodel.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Order#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see QueryMetamodel.Order#getOrder()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Order();

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
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Range#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see QueryMetamodel.Range#getFrom()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_From();

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
	 * Returns the meta object for the attribute '{@link QueryMetamodel.Range#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see QueryMetamodel.Range#getTo()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_To();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.EStep <em>EStep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStep</em>'.
	 * @see QueryMetamodel.EStep
	 * @generated
	 */
	EClass getEStep();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.EStep#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see QueryMetamodel.EStep#getStep()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_Step();

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
	 * Returns the meta object for the containment reference '{@link QueryMetamodel.EQuery#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see QueryMetamodel.EQuery#getMethod()
	 * @see #getEQuery()
	 * @generated
	 */
	EReference getEQuery_Method();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.ComplementaryConducts <em>Complementary Conducts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complementary Conducts</em>'.
	 * @see QueryMetamodel.ComplementaryConducts
	 * @generated
	 */
	EClass getComplementaryConducts();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.ComplementaryConducts#getConduct <em>Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conduct</em>'.
	 * @see QueryMetamodel.ComplementaryConducts#getConduct()
	 * @see #getComplementaryConducts()
	 * @generated
	 */
	EAttribute getComplementaryConducts_Conduct();

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
	 * Returns the meta object for class '{@link QueryMetamodel.EMethod <em>EMethod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EMethod</em>'.
	 * @see QueryMetamodel.EMethod
	 * @generated
	 */
	EClass getEMethod();

	/**
	 * Returns the meta object for the attribute '{@link QueryMetamodel.EMethod#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see QueryMetamodel.EMethod#getName()
	 * @see #getEMethod()
	 * @generated
	 */
	EAttribute getEMethod_Name();

	/**
	 * Returns the meta object for the containment reference '{@link QueryMetamodel.EMethod#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Attribute</em>'.
	 * @see QueryMetamodel.EMethod#getAttribute()
	 * @see #getEMethod()
	 * @generated
	 */
	EReference getEMethod_Attribute();

	/**
	 * Returns the meta object for class '{@link QueryMetamodel.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see QueryMetamodel.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for enum '{@link QueryMetamodel.Qualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qualifier</em>'.
	 * @see QueryMetamodel.Qualifier
	 * @generated
	 */
	EEnum getQualifier();

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
	 * Returns the meta object for enum '{@link QueryMetamodel.EElement <em>EElement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EElement</em>'.
	 * @see QueryMetamodel.EElement
	 * @generated
	 */
	EEnum getEElement();

	/**
	 * Returns the meta object for enum '{@link QueryMetamodel.Conduct <em>Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conduct</em>'.
	 * @see QueryMetamodel.Conduct
	 * @generated
	 */
	EEnum getConduct();

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
		 * The meta object literal for the '<em><b>Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATTRIBUTE__ORDER = eINSTANCE.getEAttribute_Order();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Estep</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATTRIBUTE__ESTEP = eINSTANCE.getEAttribute_Estep();

		/**
		 * The meta object literal for the '<em><b>Complementaryconducts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EATTRIBUTE__COMPLEMENTARYCONDUCTS = eINSTANCE.getEAttribute_Complementaryconducts();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.OrderImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER = eINSTANCE.getOrder_Order();

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
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__FROM = eINSTANCE.getRange_From();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__QUANTITY = eINSTANCE.getRange_Quantity();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANGE__TO = eINSTANCE.getRange_To();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.EStepImpl <em>EStep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.EStepImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEStep()
		 * @generated
		 */
		EClass ESTEP = eINSTANCE.getEStep();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTEP__STEP = eINSTANCE.getEStep_Step();

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
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUERY__METHOD = eINSTANCE.getEQuery_Method();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.ComplementaryConductsImpl <em>Complementary Conducts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.ComplementaryConductsImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getComplementaryConducts()
		 * @generated
		 */
		EClass COMPLEMENTARY_CONDUCTS = eINSTANCE.getComplementaryConducts();

		/**
		 * The meta object literal for the '<em><b>Conduct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEMENTARY_CONDUCTS__CONDUCT = eINSTANCE.getComplementaryConducts_Conduct();

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
		 * The meta object literal for the '{@link QueryMetamodel.impl.EMethodImpl <em>EMethod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.EMethodImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEMethod()
		 * @generated
		 */
		EClass EMETHOD = eINSTANCE.getEMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMETHOD__NAME = eINSTANCE.getEMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMETHOD__ATTRIBUTE = eINSTANCE.getEMethod_Attribute();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.impl.FieldImpl
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.Qualifier <em>Qualifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.Qualifier
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getQualifier()
		 * @generated
		 */
		EEnum QUALIFIER = eINSTANCE.getQualifier();

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
		 * The meta object literal for the '{@link QueryMetamodel.EElement <em>EElement</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.EElement
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getEElement()
		 * @generated
		 */
		EEnum EELEMENT = eINSTANCE.getEElement();

		/**
		 * The meta object literal for the '{@link QueryMetamodel.Conduct <em>Conduct</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see QueryMetamodel.Conduct
		 * @see QueryMetamodel.impl.Query_metamodelPackageImpl#getConduct()
		 * @generated
		 */
		EEnum CONDUCT = eINSTANCE.getConduct();

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

	}

} //Query_metamodelPackage
