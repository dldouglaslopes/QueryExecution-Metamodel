/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QStep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.QStep#getStep <em>Step</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getQStep()
 * @model
 * @generated
 */
public interface QStep extends EMethod {
	/**
	 * Returns the value of the '<em><b>Step</b></em>' containment reference list.
	 * The list contents are of type {@link QueryMetamodel.Step}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' containment reference list.
	 * @see QueryMetamodel.Query_metamodelPackage#getQStep_Step()
	 * @model containment="true"
	 * @generated
	 */
	EList<Step> getStep();

} // QStep
