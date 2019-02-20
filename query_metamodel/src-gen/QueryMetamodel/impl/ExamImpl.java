/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.Exam;
import QueryMetamodel.Pathway;
import QueryMetamodel.Query_metamodelPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.ExamImpl#getPathway <em>Pathway</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ExamImpl#getName <em>Name</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ExamImpl#getPercentage <em>Percentage</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ExamImpl#getCode <em>Code</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ExamImpl#getQuantity <em>Quantity</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ExamImpl#getIds <em>Ids</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExamImpl extends MinimalEObjectImpl.Container implements Exam {
	/**
	 * The cached value of the '{@link #getPathway() <em>Pathway</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathway()
	 * @generated
	 * @ordered
	 */
	protected EList<Pathway> pathway;
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final String PERCENTAGE_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getPercentage() <em>Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage()
	 * @generated
	 * @ordered
	 */
	protected String percentage = PERCENTAGE_EDEFAULT;
	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;
	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;
	/**
	 * The cached value of the '{@link #getIds() <em>Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> ids;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.EXAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pathway> getPathway() {
		if (pathway == null) {
			pathway = new EObjectContainmentEList<Pathway>(Pathway.class, this, Query_metamodelPackage.EXAM__PATHWAY);
		}
		return pathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.EXAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPercentage() {
		return percentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPercentage(String newPercentage) {
		String oldPercentage = percentage;
		percentage = newPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.EXAM__PERCENTAGE,
					oldPercentage, percentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.EXAM__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.EXAM__QUANTITY, oldQuantity,
					quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIds() {
		if (ids == null) {
			ids = new EDataTypeUniqueEList<Integer>(Integer.class, this, Query_metamodelPackage.EXAM__IDS);
		}
		return ids;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Query_metamodelPackage.EXAM__PATHWAY:
			return ((InternalEList<?>) getPathway()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Query_metamodelPackage.EXAM__PATHWAY:
			return getPathway();
		case Query_metamodelPackage.EXAM__NAME:
			return getName();
		case Query_metamodelPackage.EXAM__PERCENTAGE:
			return getPercentage();
		case Query_metamodelPackage.EXAM__CODE:
			return getCode();
		case Query_metamodelPackage.EXAM__QUANTITY:
			return getQuantity();
		case Query_metamodelPackage.EXAM__IDS:
			return getIds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Query_metamodelPackage.EXAM__PATHWAY:
			getPathway().clear();
			getPathway().addAll((Collection<? extends Pathway>) newValue);
			return;
		case Query_metamodelPackage.EXAM__NAME:
			setName((String) newValue);
			return;
		case Query_metamodelPackage.EXAM__PERCENTAGE:
			setPercentage((String) newValue);
			return;
		case Query_metamodelPackage.EXAM__CODE:
			setCode((String) newValue);
			return;
		case Query_metamodelPackage.EXAM__QUANTITY:
			setQuantity((Integer) newValue);
			return;
		case Query_metamodelPackage.EXAM__IDS:
			getIds().clear();
			getIds().addAll((Collection<? extends Integer>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Query_metamodelPackage.EXAM__PATHWAY:
			getPathway().clear();
			return;
		case Query_metamodelPackage.EXAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Query_metamodelPackage.EXAM__PERCENTAGE:
			setPercentage(PERCENTAGE_EDEFAULT);
			return;
		case Query_metamodelPackage.EXAM__CODE:
			setCode(CODE_EDEFAULT);
			return;
		case Query_metamodelPackage.EXAM__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
			return;
		case Query_metamodelPackage.EXAM__IDS:
			getIds().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Query_metamodelPackage.EXAM__PATHWAY:
			return pathway != null && !pathway.isEmpty();
		case Query_metamodelPackage.EXAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Query_metamodelPackage.EXAM__PERCENTAGE:
			return PERCENTAGE_EDEFAULT == null ? percentage != null : !PERCENTAGE_EDEFAULT.equals(percentage);
		case Query_metamodelPackage.EXAM__CODE:
			return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
		case Query_metamodelPackage.EXAM__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
		case Query_metamodelPackage.EXAM__IDS:
			return ids != null && !ids.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", percentage: ");
		result.append(percentage);
		result.append(", code: ");
		result.append(code);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(", ids: ");
		result.append(ids);
		result.append(')');
		return result.toString();
	}

} //ExamImpl
