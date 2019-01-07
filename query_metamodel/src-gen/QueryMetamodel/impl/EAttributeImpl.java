/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.Age;
import QueryMetamodel.Date;
import QueryMetamodel.EAttribute;
import QueryMetamodel.ECarePathway;
import QueryMetamodel.Query_metamodelPackage;
import QueryMetamodel.Range;
import QueryMetamodel.Sex;
import QueryMetamodel.Status;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getSex <em>Sex</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getAge <em>Age</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getRange <em>Range</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EAttributeImpl#getCarePathway <em>Care Pathway</em>}</li>
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
	 * The cached value of the '{@link #getAge() <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected Age age;

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
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date;

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
	 * The cached value of the '{@link #getCarePathway() <em>Care Pathway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarePathway()
	 * @generated
	 * @ordered
	 */
	protected ECarePathway carePathway;

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
	public Age getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAge(Age newAge, NotificationChain msgs) {
		Age oldAge = age;
		age = newAge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Query_metamodelPackage.EATTRIBUTE__AGE, oldAge, newAge);
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
	public void setAge(Age newAge) {
		if (newAge != age) {
			NotificationChain msgs = null;
			if (age != null)
				msgs = ((InternalEObject) age).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__AGE, null, msgs);
			if (newAge != null)
				msgs = ((InternalEObject) newAge).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__AGE, null, msgs);
			msgs = basicSetAge(newAge, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.EATTRIBUTE__AGE, newAge,
					newAge));
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
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(Date newDate, NotificationChain msgs) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Query_metamodelPackage.EATTRIBUTE__DATE, oldDate, newDate);
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
	public void setDate(Date newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject) date).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject) newDate).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.EATTRIBUTE__DATE, newDate,
					newDate));
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
	public ECarePathway getCarePathway() {
		return carePathway;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCarePathway(ECarePathway newCarePathway, NotificationChain msgs) {
		ECarePathway oldCarePathway = carePathway;
		carePathway = newCarePathway;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Query_metamodelPackage.EATTRIBUTE__CARE_PATHWAY, oldCarePathway, newCarePathway);
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
	public void setCarePathway(ECarePathway newCarePathway) {
		if (newCarePathway != carePathway) {
			NotificationChain msgs = null;
			if (carePathway != null)
				msgs = ((InternalEObject) carePathway).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__CARE_PATHWAY, null, msgs);
			if (newCarePathway != null)
				msgs = ((InternalEObject) newCarePathway).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EATTRIBUTE__CARE_PATHWAY, null, msgs);
			msgs = basicSetCarePathway(newCarePathway, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.EATTRIBUTE__CARE_PATHWAY,
					newCarePathway, newCarePathway));
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
		case Query_metamodelPackage.EATTRIBUTE__AGE:
			return basicSetAge(null, msgs);
		case Query_metamodelPackage.EATTRIBUTE__RANGE:
			return basicSetRange(null, msgs);
		case Query_metamodelPackage.EATTRIBUTE__DATE:
			return basicSetDate(null, msgs);
		case Query_metamodelPackage.EATTRIBUTE__STATUS:
			return basicSetStatus(null, msgs);
		case Query_metamodelPackage.EATTRIBUTE__CARE_PATHWAY:
			return basicSetCarePathway(null, msgs);
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
		case Query_metamodelPackage.EATTRIBUTE__AGE:
			return getAge();
		case Query_metamodelPackage.EATTRIBUTE__RANGE:
			return getRange();
		case Query_metamodelPackage.EATTRIBUTE__DATE:
			return getDate();
		case Query_metamodelPackage.EATTRIBUTE__STATUS:
			return getStatus();
		case Query_metamodelPackage.EATTRIBUTE__CARE_PATHWAY:
			return getCarePathway();
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
		case Query_metamodelPackage.EATTRIBUTE__SEX:
			setSex((Sex) newValue);
			return;
		case Query_metamodelPackage.EATTRIBUTE__AGE:
			setAge((Age) newValue);
			return;
		case Query_metamodelPackage.EATTRIBUTE__RANGE:
			setRange((Range) newValue);
			return;
		case Query_metamodelPackage.EATTRIBUTE__DATE:
			setDate((Date) newValue);
			return;
		case Query_metamodelPackage.EATTRIBUTE__STATUS:
			setStatus((Status) newValue);
			return;
		case Query_metamodelPackage.EATTRIBUTE__CARE_PATHWAY:
			setCarePathway((ECarePathway) newValue);
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
		case Query_metamodelPackage.EATTRIBUTE__AGE:
			setAge((Age) null);
			return;
		case Query_metamodelPackage.EATTRIBUTE__RANGE:
			setRange((Range) null);
			return;
		case Query_metamodelPackage.EATTRIBUTE__DATE:
			setDate((Date) null);
			return;
		case Query_metamodelPackage.EATTRIBUTE__STATUS:
			setStatus((Status) null);
			return;
		case Query_metamodelPackage.EATTRIBUTE__CARE_PATHWAY:
			setCarePathway((ECarePathway) null);
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
		case Query_metamodelPackage.EATTRIBUTE__AGE:
			return age != null;
		case Query_metamodelPackage.EATTRIBUTE__RANGE:
			return range != null;
		case Query_metamodelPackage.EATTRIBUTE__DATE:
			return date != null;
		case Query_metamodelPackage.EATTRIBUTE__STATUS:
			return status != null;
		case Query_metamodelPackage.EATTRIBUTE__CARE_PATHWAY:
			return carePathway != null;
		}
		return super.eIsSet(featureID);
	}

} //EAttributeImpl
