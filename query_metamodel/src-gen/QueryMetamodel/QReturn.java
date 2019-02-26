/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QReturn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QReturn#getPatient <em>Patient</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQReturn()
 * @model
 * @generated
 */
public interface QReturn extends EMethod {
	/**
	 * Returns the value of the '<em><b>Patient</b></em>' containment reference list.
	 * The list contents are of type {@link QueryMetamodel.Patient}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient</em>' containment reference list.
	 * @see QueryMetamodel.Query_metamodelPackage#getQReturn_Patient()
	 * @model containment="true"
	 * @generated
	 */
	EList<Patient> getPatient();

} // QReturn
