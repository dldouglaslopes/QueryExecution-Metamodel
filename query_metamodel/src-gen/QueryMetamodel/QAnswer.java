/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QAnswer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QAnswer#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQAnswer()
 * @model
 * @generated
 */
public interface QAnswer extends EMethod {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' containment reference list.
	 * The list contents are of type {@link QueryMetamodel.Question}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' containment reference list.
	 * @see QueryMetamodel.Query_metamodelPackage#getQAnswer_Question()
	 * @model containment="true"
	 * @generated
	 */
	EList<Question> getQuestion();

} // QAnswer
