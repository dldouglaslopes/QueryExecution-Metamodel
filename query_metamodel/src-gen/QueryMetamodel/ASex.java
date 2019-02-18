/**
 */
package QueryMetamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ASex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.ASex#getSex <em>Sex</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getASex()
 * @model
 * @generated
 */
public interface ASex extends EObject {
	/**
	 * Returns the value of the '<em><b>Sex</b></em>' attribute.
	 * The literals are from the enumeration {@link QueryMetamodel.Gender}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sex</em>' attribute.
	 * @see QueryMetamodel.Gender
	 * @see #setSex(Gender)
	 * @see QueryMetamodel.Query_metamodelPackage#getASex_Sex()
	 * @model
	 * @generated
	 */
	Gender getSex();

	/**
	 * Sets the value of the '{@link QueryMetamodel.ASex#getSex <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sex</em>' attribute.
	 * @see QueryMetamodel.Gender
	 * @see #getSex()
	 * @generated
	 */
	void setSex(Gender value);

} // ASex
