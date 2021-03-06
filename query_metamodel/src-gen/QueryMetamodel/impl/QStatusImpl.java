/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.Pathway;
import QueryMetamodel.QStatus;
import QueryMetamodel.Query_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QStatus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.QStatusImpl#getCompleted <em>Completed</em>}</li>
 *   <li>{@link QueryMetamodel.impl.QStatusImpl#getInProgress <em>In Progress</em>}</li>
 *   <li>{@link QueryMetamodel.impl.QStatusImpl#getAborted <em>Aborted</em>}</li>
 *   <li>{@link QueryMetamodel.impl.QStatusImpl#getPathway <em>Pathway</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QStatusImpl extends EMethodImpl implements QStatus {
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
	 * The cached value of the '{@link #getPathway() <em>Pathway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathway()
	 * @generated
	 * @ordered
	 */
	protected Pathway pathway;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.QSTATUS;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.QSTATUS__COMPLETED,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.QSTATUS__IN_PROGRESS,
					oldInProgress, inProgress));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.QSTATUS__ABORTED, oldAborted,
					aborted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pathway getPathway() {
		return pathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPathway(Pathway newPathway, NotificationChain msgs) {
		Pathway oldPathway = pathway;
		pathway = newPathway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Query_metamodelPackage.QSTATUS__PATHWAY, oldPathway, newPathway);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathway(Pathway newPathway) {
		if (newPathway != pathway) {
			NotificationChain msgs = null;
			if (pathway != null)
				msgs = ((InternalEObject) pathway).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.QSTATUS__PATHWAY, null, msgs);
			if (newPathway != null)
				msgs = ((InternalEObject) newPathway).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.QSTATUS__PATHWAY, null, msgs);
			msgs = basicSetPathway(newPathway, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.QSTATUS__PATHWAY, newPathway,
					newPathway));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Query_metamodelPackage.QSTATUS__PATHWAY:
			return basicSetPathway(null, msgs);
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
		case Query_metamodelPackage.QSTATUS__COMPLETED:
			return getCompleted();
		case Query_metamodelPackage.QSTATUS__IN_PROGRESS:
			return getInProgress();
		case Query_metamodelPackage.QSTATUS__ABORTED:
			return getAborted();
		case Query_metamodelPackage.QSTATUS__PATHWAY:
			return getPathway();
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
		case Query_metamodelPackage.QSTATUS__COMPLETED:
			setCompleted((Integer) newValue);
			return;
		case Query_metamodelPackage.QSTATUS__IN_PROGRESS:
			setInProgress((Integer) newValue);
			return;
		case Query_metamodelPackage.QSTATUS__ABORTED:
			setAborted((Integer) newValue);
			return;
		case Query_metamodelPackage.QSTATUS__PATHWAY:
			setPathway((Pathway) newValue);
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
		case Query_metamodelPackage.QSTATUS__COMPLETED:
			setCompleted(COMPLETED_EDEFAULT);
			return;
		case Query_metamodelPackage.QSTATUS__IN_PROGRESS:
			setInProgress(IN_PROGRESS_EDEFAULT);
			return;
		case Query_metamodelPackage.QSTATUS__ABORTED:
			setAborted(ABORTED_EDEFAULT);
			return;
		case Query_metamodelPackage.QSTATUS__PATHWAY:
			setPathway((Pathway) null);
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
		case Query_metamodelPackage.QSTATUS__COMPLETED:
			return completed != COMPLETED_EDEFAULT;
		case Query_metamodelPackage.QSTATUS__IN_PROGRESS:
			return inProgress != IN_PROGRESS_EDEFAULT;
		case Query_metamodelPackage.QSTATUS__ABORTED:
			return aborted != ABORTED_EDEFAULT;
		case Query_metamodelPackage.QSTATUS__PATHWAY:
			return pathway != null;
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
		result.append(" (completed: ");
		result.append(completed);
		result.append(", inProgress: ");
		result.append(inProgress);
		result.append(", aborted: ");
		result.append(aborted);
		result.append(')');
		return result.toString();
	}

} //QStatusImpl
