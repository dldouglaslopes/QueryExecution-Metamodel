/**
 */
package QueryMetamodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECare Pathway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link QueryMetamodel.ECarePathway#getConduct <em>Conduct</em>}</li>
 *   <li>{@link QueryMetamodel.ECarePathway#getStep <em>Step</em>}</li>
 *   <li>{@link QueryMetamodel.ECarePathway#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see QueryMetamodel.Query_metamodelPackage#getECarePathway()
 * @model
 * @generated
 */
public interface ECarePathway extends EObject {
	/**
	 * Returns the value of the '<em><b>Conduct</b></em>' attribute list.
	 * The list contents are of type {@link QueryMetamodel.EConduct}.
	 * The literals are from the enumeration {@link QueryMetamodel.EConduct}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conduct</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conduct</em>' attribute list.
	 * @see QueryMetamodel.EConduct
	 * @see QueryMetamodel.Query_metamodelPackage#getECarePathway_Conduct()
	 * @model
	 * @generated
	 */
	EList<EConduct> getConduct();

	/**
	 * Returns the value of the '<em><b>Step</b></em>' attribute list.
	 * The list contents are of type {@link QueryMetamodel.EStep}.
	 * The literals are from the enumeration {@link QueryMetamodel.EStep}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Step</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Step</em>' attribute list.
	 * @see QueryMetamodel.EStep
	 * @see QueryMetamodel.Query_metamodelPackage#getECarePathway_Step()
	 * @model
	 * @generated
	 */
	EList<EStep> getStep();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see QueryMetamodel.Query_metamodelPackage#getECarePathway_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link QueryMetamodel.ECarePathway#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ECarePathway
