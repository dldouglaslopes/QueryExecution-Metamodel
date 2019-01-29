/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.EStatus;
import QueryMetamodel.Query_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EStatus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.EStatusImpl#getAborted <em>Aborted</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EStatusImpl#getCompleted <em>Completed</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EStatusImpl#getInProgress <em>In Progress</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EStatusImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EStatusImpl extends EMethodImpl implements EStatus {
	/**
	 * The default value of the '{@link #getAborted() <em>Aborted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAborted()
	 * @generated
	 * @ordered
	 */
	protected static final int ABORTED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAborted() <em>Aborted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAborted()
	 * @generated
	 * @ordered
	 */
	protected int aborted = ABORTED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompleted() <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleted()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPLETED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCompleted() <em>Completed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleted()
	 * @generated
	 * @ordered
	 */
	protected int completed = COMPLETED_EDEFAULT;

	/**
	 * The default value of the '{@link #getInProgress() <em>In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInProgress()
	 * @generated
	 * @ordered
	 */
	protected static final int IN_PROGRESS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInProgress() <em>In Progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInProgress()
	 * @generated
	 * @ordered
	 */
	protected int inProgress = IN_PROGRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "COUNT STATUS";

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.ESTATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAborted() {
		return aborted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAborted(int newAborted) {
		int oldAborted = aborted;
		aborted = newAborted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.ESTATUS__ABORTED, oldAborted,
					aborted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCompleted() {
		return completed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleted(int newCompleted) {
		int oldCompleted = completed;
		completed = newCompleted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.ESTATUS__COMPLETED,
					oldCompleted, completed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getInProgress() {
		return inProgress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInProgress(int newInProgress) {
		int oldInProgress = inProgress;
		inProgress = newInProgress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.ESTATUS__IN_PROGRESS,
					oldInProgress, inProgress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.ESTATUS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Query_metamodelPackage.ESTATUS__ABORTED:
			return getAborted();
		case Query_metamodelPackage.ESTATUS__COMPLETED:
			return getCompleted();
		case Query_metamodelPackage.ESTATUS__IN_PROGRESS:
			return getInProgress();
		case Query_metamodelPackage.ESTATUS__NAME:
			return getName();
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
		case Query_metamodelPackage.ESTATUS__ABORTED:
			setAborted((Integer) newValue);
			return;
		case Query_metamodelPackage.ESTATUS__COMPLETED:
			setCompleted((Integer) newValue);
			return;
		case Query_metamodelPackage.ESTATUS__IN_PROGRESS:
			setInProgress((Integer) newValue);
			return;
		case Query_metamodelPackage.ESTATUS__NAME:
			setName((String) newValue);
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
		case Query_metamodelPackage.ESTATUS__ABORTED:
			setAborted(ABORTED_EDEFAULT);
			return;
		case Query_metamodelPackage.ESTATUS__COMPLETED:
			setCompleted(COMPLETED_EDEFAULT);
			return;
		case Query_metamodelPackage.ESTATUS__IN_PROGRESS:
			setInProgress(IN_PROGRESS_EDEFAULT);
			return;
		case Query_metamodelPackage.ESTATUS__NAME:
			setName(NAME_EDEFAULT);
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
		case Query_metamodelPackage.ESTATUS__ABORTED:
			return aborted != ABORTED_EDEFAULT;
		case Query_metamodelPackage.ESTATUS__COMPLETED:
			return completed != COMPLETED_EDEFAULT;
		case Query_metamodelPackage.ESTATUS__IN_PROGRESS:
			return inProgress != IN_PROGRESS_EDEFAULT;
		case Query_metamodelPackage.ESTATUS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (aborted: ");
		result.append(aborted);
		result.append(", completed: ");
		result.append(completed);
		result.append(", inProgress: ");
		result.append(inProgress);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EStatusImpl
