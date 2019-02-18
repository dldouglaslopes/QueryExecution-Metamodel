/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QOccurrence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QOccurrence#getName <em>Name</em>}</li>
 *   <li>{@link QueryMetamodel.QOccurrence#getOccurrence <em>Occurrence</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQOccurrence()
 * @model
 * @generated
 */
public interface QOccurrence extends EMethod {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"CarePathwaysOccurrences"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QueryMetamodel.Query_metamodelPackage#getQOccurrence_Name()
	 * @model default="CarePathwaysOccurrences"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QueryMetamodel.QOccurrence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' containment reference list.
	 * The list contents are of type {@link QueryMetamodel.Occurrence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence</em>' containment reference list.
	 * @see QueryMetamodel.Query_metamodelPackage#getQOccurrence_Occurrence()
	 * @model containment="true"
	 * @generated
	 */
	EList<Occurrence> getOccurrence();

} // QOccurrence
