/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.Age;
import QueryMetamodel.CarePathway;
import QueryMetamodel.Date;
import QueryMetamodel.ECarePathway;
import QueryMetamodel.EConduct;
import QueryMetamodel.EMethod;
import QueryMetamodel.EQuery;
import QueryMetamodel.EStatus;
import QueryMetamodel.Gender;
import QueryMetamodel.Message;
import QueryMetamodel.Method;
import QueryMetamodel.Order;
import QueryMetamodel.Query_metamodelFactory;
import QueryMetamodel.Query_metamodelPackage;
import QueryMetamodel.Range;
import QueryMetamodel.Sex;
import QueryMetamodel.Status;

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
	private EClass rangeEClass = null;

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
	private EClass dateEClass = null;

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
	private EClass ageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eCarePathwayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eStatusEClass = null;

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
	private EClass eConductEClass = null;

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
	private EEnum methodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carePathwayEEnum = null;

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
	public EClass getRange() {
		return rangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_Quantity() {
		return (EAttribute) rangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRange_Order() {
		return (EAttribute) rangeEClass.getEStructuralFeatures().get(1);
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
	public EClass getDate() {
		return dateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_From() {
		return (EAttribute) dateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDate_To() {
		return (EAttribute) dateEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getStatus_Message() {
		return (EAttribute) statusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatus_Value() {
		return (EAttribute) statusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAge() {
		return ageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAge_From() {
		return (EAttribute) ageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAge_To() {
		return (EAttribute) ageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSex() {
		return sexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSex_Sex() {
		return (EAttribute) sexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getECarePathway() {
		return eCarePathwayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getECarePathway_Name() {
		return (EAttribute) eCarePathwayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEStatus() {
		return eStatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStatus_Aborted() {
		return (EAttribute) eStatusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStatus_Completed() {
		return (EAttribute) eStatusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStatus_InProgress() {
		return (EAttribute) eStatusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEStatus_Name() {
		return (EAttribute) eStatusEClass.getEStructuralFeatures().get(3);
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
	public EClass getEConduct() {
		return eConductEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEConduct_WithConduct() {
		return (EAttribute) eConductEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEConduct_NoConduct() {
		return (EAttribute) eConductEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEConduct_Name() {
		return (EAttribute) eConductEClass.getEStructuralFeatures().get(2);
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
	public EEnum getMethod() {
		return methodEEnum;
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

		rangeEClass = createEClass(RANGE);
		createEAttribute(rangeEClass, RANGE__QUANTITY);
		createEAttribute(rangeEClass, RANGE__ORDER);

		eQueryEClass = createEClass(EQUERY);
		createEReference(eQueryEClass, EQUERY__EATTRIBUTE);
		createEReference(eQueryEClass, EQUERY__EMETHOD);

		dateEClass = createEClass(DATE);
		createEAttribute(dateEClass, DATE__FROM);
		createEAttribute(dateEClass, DATE__TO);

		statusEClass = createEClass(STATUS);
		createEAttribute(statusEClass, STATUS__MESSAGE);
		createEAttribute(statusEClass, STATUS__VALUE);

		ageEClass = createEClass(AGE);
		createEAttribute(ageEClass, AGE__FROM);
		createEAttribute(ageEClass, AGE__TO);

		sexEClass = createEClass(SEX);
		createEAttribute(sexEClass, SEX__SEX);

		eCarePathwayEClass = createEClass(ECARE_PATHWAY);
		createEAttribute(eCarePathwayEClass, ECARE_PATHWAY__NAME);

		eStatusEClass = createEClass(ESTATUS);
		createEAttribute(eStatusEClass, ESTATUS__ABORTED);
		createEAttribute(eStatusEClass, ESTATUS__COMPLETED);
		createEAttribute(eStatusEClass, ESTATUS__IN_PROGRESS);
		createEAttribute(eStatusEClass, ESTATUS__NAME);

		eMethodEClass = createEClass(EMETHOD);

		eConductEClass = createEClass(ECONDUCT);
		createEAttribute(eConductEClass, ECONDUCT__WITH_CONDUCT);
		createEAttribute(eConductEClass, ECONDUCT__NO_CONDUCT);
		createEAttribute(eConductEClass, ECONDUCT__NAME);

		// Create enums
		orderEEnum = createEEnum(ORDER);
		messageEEnum = createEEnum(MESSAGE);
		genderEEnum = createEEnum(GENDER);
		methodEEnum = createEEnum(METHOD);
		carePathwayEEnum = createEEnum(CARE_PATHWAY);
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
		eStatusEClass.getESuperTypes().add(this.getEMethod());
		eConductEClass.getESuperTypes().add(this.getEMethod());

		// Initialize classes, features, and operations; add parameters
		initEClass(eAttributeEClass, QueryMetamodel.EAttribute.class, "EAttribute", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEAttribute_Sex(), this.getSex(), null, "sex", null, 1, 1, QueryMetamodel.EAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttribute_Age(), this.getAge(), null, "age", null, 0, 1, QueryMetamodel.EAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttribute_Range(), this.getRange(), null, "range", null, 1, 1,
				QueryMetamodel.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttribute_Date(), this.getDate(), null, "date", null, 0, 1, QueryMetamodel.EAttribute.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttribute_Status(), this.getStatus(), null, "status", null, 1, 1,
				QueryMetamodel.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEAttribute_CarePathway(), this.getECarePathway(), null, "carePathway", null, 0, 1,
				QueryMetamodel.EAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rangeEClass, Range.class, "Range", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRange_Quantity(), ecorePackage.getEInt(), "quantity", "0", 0, 1, Range.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRange_Order(), this.getOrder(), "order", "random", 0, 1, Range.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eQueryEClass, EQuery.class, "EQuery", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEQuery_EAttribute(), this.getEAttribute(), null, "eAttribute", null, 1, 1, EQuery.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEQuery_EMethod(), this.getEMethod(), null, "eMethod", null, 1, 1, EQuery.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(dateEClass, Date.class, "Date", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDate_From(), ecorePackage.getEDate(), "from", null, 0, 1, Date.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDate_To(), ecorePackage.getEDate(), "to", null, 0, 1, Date.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statusEClass, Status.class, "Status", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStatus_Message(), this.getMessage(), "message", null, 0, 1, Status.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatus_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, Status.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ageEClass, Age.class, "Age", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAge_From(), ecorePackage.getEInt(), "from", "0", 0, 1, Age.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAge_To(), ecorePackage.getEInt(), "to", "0", 0, 1, Age.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sexEClass, Sex.class, "Sex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSex_Sex(), this.getGender(), "sex", null, 0, 1, Sex.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eCarePathwayEClass, ECarePathway.class, "ECarePathway", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getECarePathway_Name(), this.getCarePathway(), "name", "None", 0, 1, ECarePathway.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStatusEClass, EStatus.class, "EStatus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStatus_Aborted(), ecorePackage.getEInt(), "aborted", null, 0, 1, EStatus.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStatus_Completed(), ecorePackage.getEInt(), "completed", null, 0, 1, EStatus.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStatus_InProgress(), ecorePackage.getEInt(), "inProgress", null, 0, 1, EStatus.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEStatus_Name(), ecorePackage.getEString(), "name", "COUNT STATUS", 0, 1, EStatus.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eMethodEClass, EMethod.class, "EMethod", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(eConductEClass, EConduct.class, "EConduct", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEConduct_WithConduct(), ecorePackage.getEInt(), "withConduct", null, 0, 1, EConduct.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEConduct_NoConduct(), ecorePackage.getEInt(), "noConduct", null, 0, 1, EConduct.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEConduct_Name(), ecorePackage.getEString(), "name", "COUNT CONDUCT", 0, 1, EConduct.class,
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

		initEEnum(methodEEnum, Method.class, "Method");
		addEEnumLiteral(methodEEnum, Method.AVERAGE_BY_TIME);
		addEEnumLiteral(methodEEnum, Method.RECURRENCY_FLOW);
		addEEnumLiteral(methodEEnum, Method.PRESCRIBED_MEDICATION);
		addEEnumLiteral(methodEEnum, Method.OCCURRENCY_EXECUTION);
		addEEnumLiteral(methodEEnum, Method.STATUS);
		addEEnumLiteral(methodEEnum, Method.CONDUCTS);

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

		// Create resource
		createResource(eNS_URI);
	}

} //Query_metamodelPackageImpl
