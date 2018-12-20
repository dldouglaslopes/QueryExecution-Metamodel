/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.Age;
import QueryMetamodel.ComplementaryConducts;
import QueryMetamodel.Date;
import QueryMetamodel.EAttribute;
import QueryMetamodel.EStep;
import QueryMetamodel.Order;
import QueryMetamodel.Query_metamodelPackage;
import QueryMetamodel.Range;
import QueryMetamodel.Sex;
import QueryMetamodel.Status;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getSex <em>Sex</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getAge <em>Age</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getEstep <em>Estep</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getComplementaryconducts <em>Complementaryconducts</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAttributeImpl extends MinimalEObjectImpl.Container implements EAttribute {
	/**
	 * The cached value of the '{@link #getSex() <em>Sex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected Sex sex;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected Order order;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected EList<Age> age;

	/**
	 * The cached value of the '{@link #getRange() <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRange()
	 * @generated
	 * @ordered
	 */
	protected Range range;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Date> date;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getEstep() <em>Estep</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstep()
	 * @generated
	 * @ordered
	 */
	protected EList<EStep> estep;

	/**
	 * The cached value of the '{@link #getComplementaryconducts() <em>Complementaryconducts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplementaryconducts()
	 * @generated
	 * @ordered
	 */
	protected EList<ComplementaryConducts> complementaryconducts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.EATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sex getSex() {
		return sex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSex(Sex newSex, NotificationChain msgs) {
		Sex oldSex = sex;
		sex = newSex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Query_metamodelPackage.EATTRIBUTE__SEX, oldSex, newSex);
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
	public void setSex(Sex newSex) {
		if (newSex != sex) {
			NotificationChain msgs = null;
			if (sex != null)
				msgs = ((InternalEObject) sex).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__SEX, null, msgs);
			if (newSex != null)
				msgs = ((InternalEObject) newSex).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__SEX, null, msgs);
			msgs = basicSetSex(newSex, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.EATTRIBUTE__SEX, newSex,
					newSex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Order getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(Order newOrder, NotificationChain msgs) {
		Order oldOrder = order;
		order = newOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Query_metamodelPackage.EATTRIBUTE__ORDER, oldOrder, newOrder);
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
	public void setOrder(Order newOrder) {
		if (newOrder != order) {
			NotificationChain msgs = null;
			if (order != null)
				msgs = ((InternalEObject) order).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__ORDER, null, msgs);
			if (newOrder != null)
				msgs = ((InternalEObject) newOrder).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__ORDER, null, msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.EATTRIBUTE__ORDER, newOrder,
					newOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Age> getAge() {
		if (age == null) {
			age = new EObjectContainmentEList<Age>(Age.class, this, Query_metamodelPackage.EATTRIBUTE__AGE);
		}
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Range getRange() {
		return range;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRange(Range newRange, NotificationChain msgs) {
		Range oldRange = range;
		range = newRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Query_metamodelPackage.EATTRIBUTE__RANGE, oldRange, newRange);
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
	public void setRange(Range newRange) {
		if (newRange != range) {
			NotificationChain msgs = null;
			if (range != null)
				msgs = ((InternalEObject) range).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__RANGE, null, msgs);
			if (newRange != null)
				msgs = ((InternalEObject) newRange).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__RANGE, null, msgs);
			msgs = basicSetRange(newRange, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.EATTRIBUTE__RANGE, newRange,
					newRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Date> getDate() {
		if (date == null) {
			date = new EObjectContainmentEList<Date>(Date.class, this, Query_metamodelPackage.EATTRIBUTE__DATE);
		}
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus, NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Query_metamodelPackage.EATTRIBUTE__STATUS, oldStatus, newStatus);
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
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject) status).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject) newStatus).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.EATTRIBUTE__STATUS, newStatus,
					newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EStep> getEstep() {
		if (estep == null) {
			estep = new EObjectContainmentEList<EStep>(EStep.class, this, Query_metamodelPackage.EATTRIBUTE__ESTEP);
		}
		return estep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComplementaryConducts> getComplementaryconducts() {
		if (complementaryconducts == null) {
			complementaryconducts = new EObjectContainmentEList<ComplementaryConducts>(ComplementaryConducts.class,
					this, Query_metamodelPackage.EATTRIBUTE__COMPLEMENTARYCONDUCTS);
		}
		return complementaryconducts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Query_metamodelPackage.EATTRIBUTE__SEX:
			return basicSetSex(null, msgs);
		case Query_metamodelPackage.EATTRIBUTE__ORDER:
			return basicSetOrder(null, msgs);
		case Query_metamodelPackage.EATTRIBUTE__AGE:
			return ((InternalEList<?>) getAge()).basicRemove(otherEnd, msgs);
		case Query_metamodelPackage.EATTRIBUTE__RANGE:
			return basicSetRange(null, msgs);
		case Query_metamodelPackage.EATTRIBUTE__DATE:
			return ((InternalEList<?>) getDate()).basicRemove(otherEnd, msgs);
		case Query_metamodelPackage.EATTRIBUTE__STATUS:
			return basicSetStatus(null, msgs);
		case Query_metamodelPackage.EATTRIBUTE__ESTEP:
			return ((InternalEList<?>) getEstep()).basicRemove(otherEnd, msgs);
		case Query_metamodelPackage.EATTRIBUTE__COMPLEMENTARYCONDUCTS:
			return ((InternalEList<?>) getComplementaryconducts()).basicRemove(otherEnd, msgs);
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
		case Query_metamodelPackage.EATTRIBUTE__SEX:
			return getSex();
		case Query_metamodelPackage.EATTRIBUTE__ORDER:
			return getOrder();
		case Query_metamodelPackage.EATTRIBUTE__AGE:
			return getAge();
		case Query_metamodelPackage.EATTRIBUTE__RANGE:
			return getRange();
		case Query_metamodelPackage.EATTRIBUTE__DATE:
			return getDate();
		case Query_metamodelPackage.EATTRIBUTE__STATUS:
			return getStatus();
		case Query_metamodelPackage.EATTRIBUTE__ESTEP:
			return getEstep();
		case Query_metamodelPackage.EATTRIBUTE__COMPLEMENTARYCONDUCTS:
			return getComplementaryconducts();
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
		case Query_metamodelPackage.EATTRIBUTE__SEX:
			setSex((Sex) newValue);
			return;
		case Query_metamodelPackage.EATTRIBUTE__ORDER:
			setOrder((Order) newValue);
			return;
		case Query_metamodelPackage.EATTRIBUTE__AGE:
			getAge().clear();
			getAge().addAll((Collection<? extends Age>) newValue);
			return;
		case Query_metamodelPackage.EATTRIBUTE__RANGE:
			setRange((Range) newValue);
			return;
		case Query_metamodelPackage.EATTRIBUTE__DATE:
			getDate().clear();
			getDate().addAll((Collection<? extends Date>) newValue);
			return;
		case Query_metamodelPackage.EATTRIBUTE__STATUS:
			setStatus((Status) newValue);
			return;
		case Query_metamodelPackage.EATTRIBUTE__ESTEP:
			getEstep().clear();
			getEstep().addAll((Collection<? extends EStep>) newValue);
			return;
		case Query_metamodelPackage.EATTRIBUTE__COMPLEMENTARYCONDUCTS:
			getComplementaryconducts().clear();
			getComplementaryconducts().addAll((Collection<? extends ComplementaryConducts>) newValue);
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
		case Query_metamodelPackage.EATTRIBUTE__SEX:
			setSex((Sex) null);
			return;
		case Query_metamodelPackage.EATTRIBUTE__ORDER:
			setOrder((Order) null);
			return;
		case Query_metamodelPackage.EATTRIBUTE__AGE:
			getAge().clear();
			return;
		case Query_metamodelPackage.EATTRIBUTE__RANGE:
			setRange((Range) null);
			return;
		case Query_metamodelPackage.EATTRIBUTE__DATE:
			getDate().clear();
			return;
		case Query_metamodelPackage.EATTRIBUTE__STATUS:
			setStatus((Status) null);
			return;
		case Query_metamodelPackage.EATTRIBUTE__ESTEP:
			getEstep().clear();
			return;
		case Query_metamodelPackage.EATTRIBUTE__COMPLEMENTARYCONDUCTS:
			getComplementaryconducts().clear();
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
		case Query_metamodelPackage.EATTRIBUTE__SEX:
			return sex != null;
		case Query_metamodelPackage.EATTRIBUTE__ORDER:
			return order != null;
		case Query_metamodelPackage.EATTRIBUTE__AGE:
			return age != null && !age.isEmpty();
		case Query_metamodelPackage.EATTRIBUTE__RANGE:
			return range != null;
		case Query_metamodelPackage.EATTRIBUTE__DATE:
			return date != null && !date.isEmpty();
		case Query_metamodelPackage.EATTRIBUTE__STATUS:
			return status != null;
		case Query_metamodelPackage.EATTRIBUTE__ESTEP:
			return estep != null && !estep.isEmpty();
		case Query_metamodelPackage.EATTRIBUTE__COMPLEMENTARYCONDUCTS:
			return complementaryconducts != null && !complementaryconducts.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EAttributeImpl
