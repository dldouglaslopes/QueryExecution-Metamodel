/**
 */
package QueryMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AAge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.AAge#getFrom <em>From</em>}</li>
 *   <li>{@link QueryMetamodel.AAge#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getAAge()
 * @model
 * @generated
 */
public interface AAge extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(int)
	 * @see QueryMetamodel.Query_metamodelPackage#getAAge_From()
	 * @model default="0"
	 * @generated
	 */
	int getFrom();

	/**
	 * Sets the value of the '{@link QueryMetamodel.AAge#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(int value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(int)
	 * @see QueryMetamodel.Query_metamodelPackage#getAAge_To()
	 * @model default="0"
	 * @generated
	 */
	int getTo();

	/**
	 * Sets the value of the '{@link QueryMetamodel.AAge#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(int value);

} // AAge
