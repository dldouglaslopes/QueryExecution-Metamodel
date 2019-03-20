/**
 */
package QueryMetamodel.impl;

import QueryMetamodel.Pathway;
import QueryMetamodel.QConduct;
import QueryMetamodel.Query_metamodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>QConduct</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.impl.QConductImpl#getWithConduct <em>With Conduct</em>}</li>
 *   <li>{@link QueryMetamodel.impl.QConductImpl#getNoConduct <em>No Conduct</em>}</li>
 *   <li>{@link QueryMetamodel.impl.QConductImpl#getPathway <em>Pathway</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QConductImpl extends EMethodImpl implements QConduct {
	/**
	 * The default value of the '{@link #getWithConduct() <em>With Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithConduct()
	 * @generated
	 * @ordered
	 */
	protected static final int WITH_CONDUCT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWithConduct() <em>With Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWithConduct()
	 * @generated
	 * @ordered
	 */
	protected int withConduct = WITH_CONDUCT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoConduct() <em>No Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoConduct()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_CONDUCT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoConduct() <em>No Conduct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoConduct()
	 * @generated
	 * @ordered
	 */
	protected int noConduct = NO_CONDUCT_EDEFAULT;

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
	protected QConductImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Query_metamodelPackage.Literals.QCONDUCT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWithConduct() {
		return withConduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWithConduct(int newWithConduct) {
		int oldWithConduct = withConduct;
		withConduct = newWithConduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.QCONDUCT__WITH_CONDUCT,
					oldWithConduct, withConduct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoConduct() {
		return noConduct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoConduct(int newNoConduct) {
		int oldNoConduct = noConduct;
		noConduct = newNoConduct;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.QCONDUCT__NO_CONDUCT,
					oldNoConduct, noConduct));
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
					Query_metamodelPackage.QCONDUCT__PATHWAY, oldPathway, newPathway);
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
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.QCONDUCT__PATHWAY, null, msgs);
			if (newPathway != null)
				msgs = ((InternalEObject) newPathway).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Query_metamodelPackage.QCONDUCT__PATHWAY, null, msgs);
			msgs = basicSetPathway(newPathway, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Query_metamodelPackage.QCONDUCT__PATHWAY, newPathway,
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
		case Query_metamodelPackage.QCONDUCT__PATHWAY:
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
		case Query_metamodelPackage.QCONDUCT__WITH_CONDUCT:
			return getWithConduct();
		case Query_metamodelPackage.QCONDUCT__NO_CONDUCT:
			return getNoConduct();
		case Query_metamodelPackage.QCONDUCT__PATHWAY:
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
		case Query_metamodelPackage.QCONDUCT__WITH_CONDUCT:
			setWithConduct((Integer) newValue);
			return;
		case Query_metamodelPackage.QCONDUCT__NO_CONDUCT:
			setNoConduct((Integer) newValue);
			return;
		case Query_metamodelPackage.QCONDUCT__PATHWAY:
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
		case Query_metamodelPackage.QCONDUCT__WITH_CONDUCT:
			setWithConduct(WITH_CONDUCT_EDEFAULT);
			return;
		case Query_metamodelPackage.QCONDUCT__NO_CONDUCT:
			setNoConduct(NO_CONDUCT_EDEFAULT);
			return;
		case Query_metamodelPackage.QCONDUCT__PATHWAY:
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
		case Query_metamodelPackage.QCONDUCT__WITH_CONDUCT:
			return withConduct != WITH_CONDUCT_EDEFAULT;
		case Query_metamodelPackage.QCONDUCT__NO_CONDUCT:
			return noConduct != NO_CONDUCT_EDEFAULT;
		case Query_metamodelPackage.QCONDUCT__PATHWAY:
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
		result.append(" (withConduct: ");
		result.append(withConduct);
		result.append(", noConduct: ");
		result.append(noConduct);
		result.append(')');
		return result.toString();
	}

} //QConductImpl
