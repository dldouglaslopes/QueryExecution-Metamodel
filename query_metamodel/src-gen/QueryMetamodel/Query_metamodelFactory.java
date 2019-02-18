/**
 */
package QueryMetamodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see QueryMetamodel.Query_metamodelPackage
 * @generated
 */
public interface Query_metamodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Query_metamodelFactory eINSTANCE = QueryMetamodel.impl.Query_metamodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EAttribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAttribute</em>'.
	 * @generated
	 */
	EAttribute createEAttribute();

	/**
	 * Returns a new object of class '<em>ARange</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ARange</em>'.
	 * @generated
	 */
	ARange createARange();

	/**
	 * Returns a new object of class '<em>EQuery</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EQuery</em>'.
	 * @generated
	 */
	EQuery createEQuery();

	/**
	 * Returns a new object of class '<em>ADate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ADate</em>'.
	 * @generated
	 */
	ADate createADate();

	/**
	 * Returns a new object of class '<em>AStatus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AStatus</em>'.
	 * @generated
	 */
	AStatus createAStatus();

	/**
	 * Returns a new object of class '<em>AAge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>AAge</em>'.
	 * @generated
	 */
	AAge createAAge();

	/**
	 * Returns a new object of class '<em>ASex</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ASex</em>'.
	 * @generated
	 */
	ASex createASex();

	/**
	 * Returns a new object of class '<em>ACare Pathway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ACare Pathway</em>'.
	 * @generated
	 */
	ACarePathway createACarePathway();

	/**
	 * Returns a new object of class '<em>QStatus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QStatus</em>'.
	 * @generated
	 */
	QStatus createQStatus();

	/**
	 * Returns a new object of class '<em>QConduct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QConduct</em>'.
	 * @generated
	 */
	QConduct createQConduct();

	/**
	 * Returns a new object of class '<em>QRecurrent Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QRecurrent Flow</em>'.
	 * @generated
	 */
	QRecurrentFlow createQRecurrentFlow();

	/**
	 * Returns a new object of class '<em>QAverage Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QAverage Time</em>'.
	 * @generated
	 */
	QAverageTime createQAverageTime();

	/**
	 * Returns a new object of class '<em>QMedication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QMedication</em>'.
	 * @generated
	 */
	QMedication createQMedication();

	/**
	 * Returns a new object of class '<em>QOccurrence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>QOccurrence</em>'.
	 * @generated
	 */
	QOccurrence createQOccurrence();

	/**
	 * Returns a new object of class '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow</em>'.
	 * @generated
	 */
	Flow createFlow();

	/**
	 * Returns a new object of class '<em>Medication</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Medication</em>'.
	 * @generated
	 */
	Medication createMedication();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Pathway</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pathway</em>'.
	 * @generated
	 */
	Pathway createPathway();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	Status createStatus();

	/**
	 * Returns a new object of class '<em>Conduct</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conduct</em>'.
	 * @generated
	 */
	Conduct createConduct();

	/**
	 * Returns a new object of class '<em>Average Time</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Average Time</em>'.
	 * @generated
	 */
	AverageTime createAverageTime();

	/**
	 * Returns a new object of class '<em>Occurrence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Occurrence</em>'.
	 * @generated
	 */
	Occurrence createOccurrence();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Query_metamodelPackage getQuery_metamodelPackage();

} //Query_metamodelFactory
