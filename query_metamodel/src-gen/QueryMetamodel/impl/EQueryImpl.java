/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.EAttribute;
import QueryMetamodel.EMethod;
import QueryMetamodel.EQuery;
import QueryMetamodel.Query_metamodelPackage;

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
 * An implementation of the model object '<em><b>EQuery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.EQueryImpl#getEAttribute <em>EAttribute</em>}</li>
 *   <li>{@link QueryMetamodel.impl.EQueryImpl#getEMethod <em>EMethod</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EQueryImpl extends MinimalEObjectImpl.Container implements EQuery {
	/**
	 * The cached value of the '{@link #getEAttribute() <em>EAttribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEAttribute()
	 * @generated
	 * @ordered
	 */
	protected EAttribute eAttribute;

	/**
	 * The cached value of the '{@link #getEMethod() <em>EMethod</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<EMethod> eMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.EQUERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEAttribute() {
		return eAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEAttribute(EAttribute newEAttribute, NotificationChain msgs) {
		EAttribute oldEAttribute = eAttribute;
		eAttribute = newEAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Query_metamodelPackage.EQUERY__EATTRIBUTE, oldEAttribute, newEAttribute);
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
	public void setEAttribute(EAttribute newEAttribute) {
		if (newEAttribute != eAttribute) {
			NotificationChain msgs = null;
			if (eAttribute != null)
				msgs = ((InternalEObject) eAttribute).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EQUERY__EATTRIBUTE, null, msgs);
			if (newEAttribute != null)
				msgs = ((InternalEObject) newEAttribute).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.EQUERY__EATTRIBUTE, null, msgs);
			msgs = basicSetEAttribute(newEAttribute, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.EQUERY__EATTRIBUTE,
					newEAttribute, newEAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EMethod> getEMethod() {
		if (eMethod == null) {
			eMethod = new EObjectContainmentEList<EMethod>(EMethod.class, this, Query_metamodelPackage.EQUERY__EMETHOD);
		}
		return eMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Query_metamodelPackage.EQUERY__EATTRIBUTE:
			return basicSetEAttribute(null, msgs);
		case Query_metamodelPackage.EQUERY__EMETHOD:
			return ((InternalEList<?>) getEMethod()).basicRemove(otherEnd, msgs);
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
		case Query_metamodelPackage.EQUERY__EATTRIBUTE:
			return getEAttribute();
		case Query_metamodelPackage.EQUERY__EMETHOD:
			return getEMethod();
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
		case Query_metamodelPackage.EQUERY__EATTRIBUTE:
			setEAttribute((EAttribute) newValue);
			return;
		case Query_metamodelPackage.EQUERY__EMETHOD:
			getEMethod().clear();
			getEMethod().addAll((Collection<? extends EMethod>) newValue);
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
		case Query_metamodelPackage.EQUERY__EATTRIBUTE:
			setEAttribute((EAttribute) null);
			return;
		case Query_metamodelPackage.EQUERY__EMETHOD:
			getEMethod().clear();
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
		case Query_metamodelPackage.EQUERY__EATTRIBUTE:
			return eAttribute != null;
		case Query_metamodelPackage.EQUERY__EMETHOD:
			return eMethod != null && !eMethod.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EQueryImpl
