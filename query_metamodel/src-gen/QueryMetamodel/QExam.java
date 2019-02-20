/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QExam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QExam#getName <em>Name</em>}</li>
 *   <li>{@link QueryMetamodel.QExam#getExam <em>Exam</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQExam()
 * @model
 * @generated
 */
public interface QExam extends EMethod {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Exam"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QueryMetamodel.Query_metamodelPackage#getQExam_Name()
	 * @model default="Exam"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QueryMetamodel.QExam#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Exam</b></em>' containment reference list.
	 * The list contents are of type {@link QueryMetamodel.Exam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exam</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exam</em>' containment reference list.
	 * @see QueryMetamodel.Query_metamodelPackage#getQExam_Exam()
	 * @model containment="true"
	 * @generated
	 */
	EList<Exam> getExam();

} // QExam