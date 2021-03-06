/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QPrescription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QPrescription#getPrescription <em>Prescription</em>}</li>
 *   <li>{@link QueryMetamodel.QPrescription#getPathway <em>Pathway</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQPrescription()
 * @model
 * @generated
 */
public interface QPrescription extends EMethod {
	/**
	 * Returns the value of the '<em><b>Prescription</b></em>' containment reference list.
	 * The list contents are of type {@link QueryMetamodel.Prescription}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription</em>' containment reference list.
	 * @see QueryMetamodel.Query_metamodelPackage#getQPrescription_Prescription()
	 * @model containment="true"
	 * @generated
	 */
	EList<Prescription> getPrescription();

	/**
	 * Returns the value of the '<em><b>Pathway</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pathway</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pathway</em>' containment reference.
	 * @see #setPathway(Pathway)
	 * @see QueryMetamodel.Query_metamodelPackage#getQPrescription_Pathway()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Pathway getPathway();

	/**
	 * Sets the value of the '{@link QueryMetamodel.QPrescription#getPathway <em>Pathway</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pathway</em>' containment reference.
	 * @see #getPathway()
	 * @generated
	 */
	void setPathway(Pathway value);

} // QPrescription
