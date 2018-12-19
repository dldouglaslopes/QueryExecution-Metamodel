/**
 */
package query_metamodel;

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
 * @see query_metamodel.Query_metamodelFactory
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
	String eNAME = "query_metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/query_metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "query_metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Query_metamodelPackage eINSTANCE = query_metamodel.impl.Query_metamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link query_metamodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.impl.AttributeImpl
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SEX = 0;

	/**
	 * The feature id for the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ORDER = 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__AGE = 2;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__RANGE = 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__FIELD = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATE = 5;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__STATUS = 6;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link query_metamodel.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.impl.OrderImpl
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getOrder()
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
	 * The meta object id for the '{@link query_metamodel.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.impl.FieldImpl
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 2;

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
	 * The meta object id for the '{@link query_metamodel.impl.RangeImpl <em>Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.impl.RangeImpl
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getRange()
	 * @generated
	 */
	int RANGE = 3;

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
	 * The meta object id for the '{@link query_metamodel.impl.EStepImpl <em>EStep</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.impl.EStepImpl
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getEStep()
	 * @generated
	 */
	int ESTEP = 4;

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
	 * The meta object id for the '{@link query_metamodel.impl.QueryImpl <em>Query</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.impl.QueryImpl
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getQuery()
	 * @generated
	 */
	int QUERY = 5;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY__METHOD = 0;

	/**
	 * The number of structural features of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Query</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUERY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link query_metamodel.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.impl.MethodImpl
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__ATTRIBUTE = 1;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link query_metamodel.impl.ComplementaryConductsImpl <em>Complementary Conducts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.impl.ComplementaryConductsImpl
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getComplementaryConducts()
	 * @generated
	 */
	int COMPLEMENTARY_CONDUCTS = 7;

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
	 * The meta object id for the '{@link query_metamodel.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.impl.DateImpl
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 8;

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
	 * The meta object id for the '{@link query_metamodel.impl.StatusImpl <em>Status</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.impl.StatusImpl
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 9;

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
	 * The meta object id for the '{@link query_metamodel.impl.AgeImpl <em>Age</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.impl.AgeImpl
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getAge()
	 * @generated
	 */
	int AGE = 10;

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
	 * The meta object id for the '{@link query_metamodel.impl.SexImpl <em>Sex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.impl.SexImpl
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getSex()
	 * @generated
	 */
	int SEX = 11;

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
	 * The meta object id for the '{@link query_metamodel.Function <em>Function</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.Function
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 12;

	/**
	 * The meta object id for the '{@link query_metamodel.Qualifier <em>Qualifier</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.Qualifier
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getQualifier()
	 * @generated
	 */
	int QUALIFIER = 13;

	/**
	 * The meta object id for the '{@link query_metamodel.Message <em>Message</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.Message
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 14;

	/**
	 * The meta object id for the '{@link query_metamodel.Element <em>Element</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.Element
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 15;

	/**
	 * The meta object id for the '{@link query_metamodel.Conduct <em>Conduct</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.Conduct
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getConduct()
	 * @generated
	 */
	int CONDUCT = 16;

	/**
	 * The meta object id for the '{@link query_metamodel.Gender <em>Gender</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see query_metamodel.Gender
	 * @see query_metamodel.impl.Query_metamodelPackageImpl#getGender()
	 * @generated
	 */
	int GENDER = 17;

	/**
	 * Returns the meta object for class '{@link query_metamodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see query_metamodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the containment reference '{@link query_metamodel.Attribute#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sex</em>'.
	 * @see query_metamodel.Attribute#getSex()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Sex();

	/**
	 * Returns the meta object for the containment reference '{@link query_metamodel.Attribute#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Order</em>'.
	 * @see query_metamodel.Attribute#getOrder()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Order();

	/**
	 * Returns the meta object for the containment reference list '{@link query_metamodel.Attribute#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Age</em>'.
	 * @see query_metamodel.Attribute#getAge()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Age();

	/**
	 * Returns the meta object for the containment reference '{@link query_metamodel.Attribute#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see query_metamodel.Attribute#getRange()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Range();

	/**
	 * Returns the meta object for the containment reference list '{@link query_metamodel.Attribute#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see query_metamodel.Attribute#getField()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Field();

	/**
	 * Returns the meta object for the containment reference list '{@link query_metamodel.Attribute#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date</em>'.
	 * @see query_metamodel.Attribute#getDate()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Date();

	/**
	 * Returns the meta object for the containment reference '{@link query_metamodel.Attribute#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see query_metamodel.Attribute#getStatus()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Status();

	/**
	 * Returns the meta object for class '{@link query_metamodel.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see query_metamodel.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the attribute '{@link query_metamodel.Order#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see query_metamodel.Order#getOrder()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Order();

	/**
	 * Returns the meta object for class '{@link query_metamodel.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see query_metamodel.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for class '{@link query_metamodel.Range <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Range</em>'.
	 * @see query_metamodel.Range
	 * @generated
	 */
	EClass getRange();

	/**
	 * Returns the meta object for the attribute '{@link query_metamodel.Range#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see query_metamodel.Range#getFrom()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_From();

	/**
	 * Returns the meta object for the attribute '{@link query_metamodel.Range#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see query_metamodel.Range#getQuantity()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_Quantity();

	/**
	 * Returns the meta object for the attribute '{@link query_metamodel.Range#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see query_metamodel.Range#getTo()
	 * @see #getRange()
	 * @generated
	 */
	EAttribute getRange_To();

	/**
	 * Returns the meta object for class '{@link query_metamodel.EStep <em>EStep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EStep</em>'.
	 * @see query_metamodel.EStep
	 * @generated
	 */
	EClass getEStep();

	/**
	 * Returns the meta object for the attribute '{@link query_metamodel.EStep#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see query_metamodel.EStep#getStep()
	 * @see #getEStep()
	 * @generated
	 */
	EAttribute getEStep_Step();

	/**
	 * Returns the meta object for class '{@link query_metamodel.Query <em>Query</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Query</em>'.
	 * @see query_metamodel.Query
	 * @generated
	 */
	EClass getQuery();

	/**
	 * Returns the meta object for the containment reference '{@link query_metamodel.Query#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see query_metamodel.Query#getMethod()
	 * @see #getQuery()
	 * @generated
	 */
	EReference getQuery_Method();

	/**
	 * Returns the meta object for class '{@link query_metamodel.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see query_metamodel.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the attribute '{@link query_metamodel.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see query_metamodel.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link query_metamodel.Method#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see query_metamodel.Method#getAttribute()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Attribute();

	/**
	 * Returns the meta object for class '{@link query_metamodel.ComplementaryConducts <em>Complementary Conducts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complementary Conducts</em>'.
	 * @see query_metamodel.ComplementaryConducts
	 * @generated
	 */
	EClass getComplementaryConducts();

	/**
	 * Returns the meta object for the attribute '{@link query_metamodel.ComplementaryConducts#getConduct <em>Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conduct</em>'.
	 * @see query_metamodel.ComplementaryConducts#getConduct()
	 * @see #getComplementaryConducts()
	 * @generated
	 */
	EAttribute getComplementaryConducts_Conduct();

	/**
	 * Returns the meta object for class '{@link query_metamodel.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see query_metamodel.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for the attribute '{@link query_metamodel.Date#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see query_metamodel.Date#getFrom()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_From();

	/**
	 * Returns the meta object for the attribute '{@link query_metamodel.Date#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see query_metamodel.Date#getTo()
	 * @see #getDate()
	 * @generated
	 */
	EAttribute getDate_To();

	/**
	 * Returns the meta object for class '{@link query_metamodel.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Status</em>'.
	 * @see query_metamodel.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for the attribute '{@link query_metamodel.Status#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see query_metamodel.Status#getMessage()
	 * @see #getStatus()
	 * @generated
	 */
	EAttribute getStatus_Message();

	/**
	 * Returns the meta object for class '{@link query_metamodel.Age <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Age</em>'.
	 * @see query_metamodel.Age
	 * @generated
	 */
	EClass getAge();

	/**
	 * Returns the meta object for the attribute '{@link query_metamodel.Age#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see query_metamodel.Age#getFrom()
	 * @see #getAge()
	 * @generated
	 */
	EAttribute getAge_From();

	/**
	 * Returns the meta object for the attribute '{@link query_metamodel.Age#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see query_metamodel.Age#getTo()
	 * @see #getAge()
	 * @generated
	 */
	EAttribute getAge_To();

	/**
	 * Returns the meta object for class '{@link query_metamodel.Sex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sex</em>'.
	 * @see query_metamodel.Sex
	 * @generated
	 */
	EClass getSex();

	/**
	 * Returns the meta object for the attribute '{@link query_metamodel.Sex#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see query_metamodel.Sex#getSex()
	 * @see #getSex()
	 * @generated
	 */
	EAttribute getSex_Sex();

	/**
	 * Returns the meta object for enum '{@link query_metamodel.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function</em>'.
	 * @see query_metamodel.Function
	 * @generated
	 */
	EEnum getFunction();

	/**
	 * Returns the meta object for enum '{@link query_metamodel.Qualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Qualifier</em>'.
	 * @see query_metamodel.Qualifier
	 * @generated
	 */
	EEnum getQualifier();

	/**
	 * Returns the meta object for enum '{@link query_metamodel.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Message</em>'.
	 * @see query_metamodel.Message
	 * @generated
	 */
	EEnum getMessage();

	/**
	 * Returns the meta object for enum '{@link query_metamodel.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element</em>'.
	 * @see query_metamodel.Element
	 * @generated
	 */
	EEnum getElement();

	/**
	 * Returns the meta object for enum '{@link query_metamodel.Conduct <em>Conduct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conduct</em>'.
	 * @see query_metamodel.Conduct
	 * @generated
	 */
	EEnum getConduct();

	/**
	 * Returns the meta object for enum '{@link query_metamodel.Gender <em>Gender</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Gender</em>'.
	 * @see query_metamodel.Gender
	 * @generated
	 */
	EEnum getGender();

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
		 * The meta object literal for the '{@link query_metamodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.impl.AttributeImpl
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__SEX = eINSTANCE.getAttribute_Sex();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ORDER = eINSTANCE.getAttribute_Order();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__AGE = eINSTANCE.getAttribute_Age();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__RANGE = eINSTANCE.getAttribute_Range();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__FIELD = eINSTANCE.getAttribute_Field();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DATE = eINSTANCE.getAttribute_Date();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__STATUS = eINSTANCE.getAttribute_Status();

		/**
		 * The meta object literal for the '{@link query_metamodel.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.impl.OrderImpl
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getOrder()
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
		 * The meta object literal for the '{@link query_metamodel.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.impl.FieldImpl
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '{@link query_metamodel.impl.RangeImpl <em>Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.impl.RangeImpl
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getRange()
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
		 * The meta object literal for the '{@link query_metamodel.impl.EStepImpl <em>EStep</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.impl.EStepImpl
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getEStep()
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
		 * The meta object literal for the '{@link query_metamodel.impl.QueryImpl <em>Query</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.impl.QueryImpl
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getQuery()
		 * @generated
		 */
		EClass QUERY = eINSTANCE.getQuery();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUERY__METHOD = eINSTANCE.getQuery_Method();

		/**
		 * The meta object literal for the '{@link query_metamodel.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.impl.MethodImpl
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__ATTRIBUTE = eINSTANCE.getMethod_Attribute();

		/**
		 * The meta object literal for the '{@link query_metamodel.impl.ComplementaryConductsImpl <em>Complementary Conducts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.impl.ComplementaryConductsImpl
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getComplementaryConducts()
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
		 * The meta object literal for the '{@link query_metamodel.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.impl.DateImpl
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getDate()
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
		 * The meta object literal for the '{@link query_metamodel.impl.StatusImpl <em>Status</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.impl.StatusImpl
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getStatus()
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
		 * The meta object literal for the '{@link query_metamodel.impl.AgeImpl <em>Age</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.impl.AgeImpl
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getAge()
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
		 * The meta object literal for the '{@link query_metamodel.impl.SexImpl <em>Sex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.impl.SexImpl
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getSex()
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
		 * The meta object literal for the '{@link query_metamodel.Function <em>Function</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.Function
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getFunction()
		 * @generated
		 */
		EEnum FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '{@link query_metamodel.Qualifier <em>Qualifier</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.Qualifier
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getQualifier()
		 * @generated
		 */
		EEnum QUALIFIER = eINSTANCE.getQualifier();

		/**
		 * The meta object literal for the '{@link query_metamodel.Message <em>Message</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.Message
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getMessage()
		 * @generated
		 */
		EEnum MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '{@link query_metamodel.Element <em>Element</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.Element
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getElement()
		 * @generated
		 */
		EEnum ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link query_metamodel.Conduct <em>Conduct</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.Conduct
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getConduct()
		 * @generated
		 */
		EEnum CONDUCT = eINSTANCE.getConduct();

		/**
		 * The meta object literal for the '{@link query_metamodel.Gender <em>Gender</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see query_metamodel.Gender
		 * @see query_metamodel.impl.Query_metamodelPackageImpl#getGender()
		 * @generated
		 */
		EEnum GENDER = eINSTANCE.getGender();

	}

} //Query_metamodelPackage
