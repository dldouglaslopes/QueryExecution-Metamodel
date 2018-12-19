/**
 */
package QueryMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.Status#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getStatus()
 * @model
 * @generated
 */
public interface Status extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * The literals are from the enumeration {@link QueryMetamodel.Message}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see QueryMetamodel.Message
	 * @see #setMessage(Message)
	 * @see QueryMetamodel.Query_metamodelPackage#getStatus_Message()
	 * @model
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link QueryMetamodel.Status#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see QueryMetamodel.Message
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

} // Status
