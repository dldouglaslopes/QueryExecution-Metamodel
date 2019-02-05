/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPrescribed Medication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.EPrescribedMedication#getMedications <em>Medications</em>}</li>
 *   <li>{@link QueryMetamodel.EPrescribedMedication#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getEPrescribedMedication()
 * @model
 * @generated
 */
public interface EPrescribedMedication extends EMethod {
	/**
	 * Returns the value of the '<em><b>Medications</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medications</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medications</em>' attribute list.
	 * @see QueryMetamodel.Query_metamodelPackage#getEPrescribedMedication_Medications()
	 * @model
	 * @generated
	 */
	EList<String> getMedications();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"SHOW PRESCRIBED MEDICATIONS"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QueryMetamodel.Query_metamodelPackage#getEPrescribedMedication_Name()
	 * @model default="SHOW PRESCRIBED MEDICATIONS"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QueryMetamodel.EPrescribedMedication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // EPrescribedMedication
