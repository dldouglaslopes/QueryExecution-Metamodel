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
		case Query_metamodelPackage.RANGE:
			return createRange();
		case Query_metamodelPackage.EQUERY:
			return createEQuery();
		case Query_metamodelPackage.DATE:
			return createDate();
		case Query_metamodelPackage.STATUS:
			return createStatus();
		case Query_metamodelPackage.AGE:
			return createAge();
		case Query_metamodelPackage.SEX:
			return createSex();
		case Query_metamodelPackage.ECARE_PATHWAY:
			return createECarePathway();
		case Query_metamodelPackage.ESTATUS:
			return createEStatus();
		case Query_metamodelPackage.ECONDUCT:
			return createEConduct();
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
		case Query_metamodelPackage.METHOD:
			return createMethodFromString(eDataType, initialValue);
		case Query_metamodelPackage.CARE_PATHWAY:
			return createCarePathwayFromString(eDataType, initialValue);
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
		case Query_metamodelPackage.METHOD:
			return convertMethodToString(eDataType, instanceValue);
		case Query_metamodelPackage.CARE_PATHWAY:
			return convertCarePathwayToString(eDataType, instanceValue);
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
	public Range createRange() {
		RangeImpl range = new RangeImpl();
		return range;
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
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Age createAge() {
		AgeImpl age = new AgeImpl();
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sex createSex() {
		SexImpl sex = new SexImpl();
		return sex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECarePathway createECarePathway() {
		ECarePathwayImpl eCarePathway = new ECarePathwayImpl();
		return eCarePathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStatus createEStatus() {
		EStatusImpl eStatus = new EStatusImpl();
		return eStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EConduct createEConduct() {
		EConductImpl eConduct = new EConductImpl();
		return eConduct;
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
	public Method createMethodFromString(EDataType eDataType, String initialValue) {
		Method result = Method.get(initialValue);
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
	public String convertMethodToString(EDataType eDataType, Object instanceValue) {
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
