/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.ABoolean;
import QueryMetamodel.Query_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ABoolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.ABooleanImpl#getFalseQuantity <em>False Quantity</em>}</li>
 *   <li>{@link QueryMetamodel.impl.ABooleanImpl#getTrueQuantity <em>True Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ABooleanImpl extends AnswerImpl implements ABoolean {
	/**
	 * The default value of the '{@link #getFalseQuantity() <em>False Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int FALSE_QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFalseQuantity() <em>False Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFalseQuantity()
	 * @generated
	 * @ordered
	 */
	protected int falseQuantity = FALSE_QUANTITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrueQuantity() <em>True Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int TRUE_QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTrueQuantity() <em>True Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrueQuantity()
	 * @generated
	 * @ordered
	 */
	protected int trueQuantity = TRUE_QUANTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ABooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.ABOOLEAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFalseQuantity() {
		return falseQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFalseQuantity(int newFalseQuantity) {
		int oldFalseQuantity = falseQuantity;
		falseQuantity = newFalseQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.ABOOLEAN__FALSE_QUANTITY,
					oldFalseQuantity, falseQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrueQuantity() {
		return trueQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrueQuantity(int newTrueQuantity) {
		int oldTrueQuantity = trueQuantity;
		trueQuantity = newTrueQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.ABOOLEAN__TRUE_QUANTITY,
					oldTrueQuantity, trueQuantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Query_metamodelPackage.ABOOLEAN__FALSE_QUANTITY:
			return getFalseQuantity();
		case Query_metamodelPackage.ABOOLEAN__TRUE_QUANTITY:
			return getTrueQuantity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Query_metamodelPackage.ABOOLEAN__FALSE_QUANTITY:
			setFalseQuantity((Integer) newValue);
			return;
		case Query_metamodelPackage.ABOOLEAN__TRUE_QUANTITY:
			setTrueQuantity((Integer) newValue);
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
		case Query_metamodelPackage.ABOOLEAN__FALSE_QUANTITY:
			setFalseQuantity(FALSE_QUANTITY_EDEFAULT);
			return;
		case Query_metamodelPackage.ABOOLEAN__TRUE_QUANTITY:
			setTrueQuantity(TRUE_QUANTITY_EDEFAULT);
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
		case Query_metamodelPackage.ABOOLEAN__FALSE_QUANTITY:
			return falseQuantity != FALSE_QUANTITY_EDEFAULT;
		case Query_metamodelPackage.ABOOLEAN__TRUE_QUANTITY:
			return trueQuantity != TRUE_QUANTITY_EDEFAULT;
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
		result.append(" (falseQuantity: ");
		result.append(falseQuantity);
		result.append(", trueQuantity: ");
		result.append(trueQuantity);
		result.append(')');
		return result.toString();
	}

} //ABooleanImpl
