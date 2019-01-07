/**
 */
package QueryMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.EAttribute#getSex <em>Sex</em>}</li>
 *   <li>{@link QueryMetamodel.EAttribute#getAge <em>Age</em>}</li>
 *   <li>{@link QueryMetamodel.EAttribute#getRange <em>Range</em>}</li>
 *   <li>{@link QueryMetamodel.EAttribute#getDate <em>Date</em>}</li>
 *   <li>{@link QueryMetamodel.EAttribute#getStatus <em>Status</em>}</li>
 *   <li>{@link QueryMetamodel.EAttribute#getCarePathway <em>Care Pathway</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getEAttribute()
 * @model
 * @generated
 */
public interface EAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Sex</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sex</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' containment reference.
	 * @see #setSex(Sex)
	 * @see QueryMetamodel.Query_metamodelPackage#getEAttribute_Sex()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Sex getSex();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EAttribute#getSex <em>Sex</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' containment reference.
	 * @see #getSex()
	 * @generated
	 */
	void setSex(Sex value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' containment reference.
	 * @see #setAge(Age)
	 * @see QueryMetamodel.Query_metamodelPackage#getEAttribute_Age()
	 * @model containment="true"
	 * @generated
	 */
	Age getAge();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EAttribute#getAge <em>Age</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' containment reference.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(Age value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(Range)
	 * @see QueryMetamodel.Query_metamodelPackage#getEAttribute_Range()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Range getRange();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EAttribute#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(Range value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(Date)
	 * @see QueryMetamodel.Query_metamodelPackage#getEAttribute_Date()
	 * @model containment="true"
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EAttribute#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' containment reference.
	 * @see #setStatus(Status)
	 * @see QueryMetamodel.Query_metamodelPackage#getEAttribute_Status()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EAttribute#getStatus <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' containment reference.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Care Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Care Pathway</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Care Pathway</em>' containment reference.
	 * @see #setCarePathway(ECarePathway)
	 * @see QueryMetamodel.Query_metamodelPackage#getEAttribute_CarePathway()
	 * @model containment="true"
	 * @generated
	 */
	ECarePathway getCarePathway();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EAttribute#getCarePathway <em>Care Pathway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Care Pathway</em>' containment reference.
	 * @see #getCarePathway()
	 * @generated
	 */
	void setCarePathway(ECarePathway value);

} // EAttribute
