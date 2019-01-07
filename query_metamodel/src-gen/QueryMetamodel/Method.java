/**
 */
package QueryMetamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see QueryMetamodel.Query_metamodelPackage#getMethod()
 * @model
 * @generated
 */
public enum Method implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "none", "none"),

	/**
	 * The '<em><b>Average By Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_BY_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE_BY_TIME(1, "averageByTime", "averageByTime"),

	/**
	 * The '<em><b>Recurrency Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECURRENCY_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	RECURRENCY_FLOW(2, "recurrencyFlow", "recurrencyFlow"),
	/**
	 * The '<em><b>Prescribed Medication</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #PRESCRIBED_MEDICATION_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIBED_MEDICATION(3, "prescribedMedication", "prescribedMedication"),

	/**
	 * The '<em><b>Occurrency Execution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCURRENCY_EXECUTION_VALUE
	 * @generated
	 * @ordered
	 */
	OCCURRENCY_EXECUTION(4, "occurrencyExecution", "occurrencyExecution"),
	/**
	* The '<em><b>Status</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #STATUS_VALUE
	* @generated
	* @ordered
	*/
	STATUS(5, "status", "status");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="none"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Average By Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Average By Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_BY_TIME
	 * @model name="averageByTime"
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_BY_TIME_VALUE = 1;

	/**
	 * The '<em><b>Recurrency Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Recurrency Flow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECURRENCY_FLOW
	 * @model name="recurrencyFlow"
	 * @generated
	 * @ordered
	 */
	public static final int RECURRENCY_FLOW_VALUE = 2;

	/**
	 * The '<em><b>Prescribed Medication</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescribed Medication</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIBED_MEDICATION
	 * @model name="prescribedMedication"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIBED_MEDICATION_VALUE = 3;

	/**
	 * The '<em><b>Occurrency Execution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Occurrency Execution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCCURRENCY_EXECUTION
	 * @model name="occurrencyExecution"
	 * @generated
	 * @ordered
	 */
	public static final int OCCURRENCY_EXECUTION_VALUE = 4;

	/**
	 * The '<em><b>Status</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Status</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATUS
	 * @model name="status"
	 * @generated
	 * @ordered
	 */
	public static final int STATUS_VALUE = 5;

	/**
	 * An array of all the '<em><b>Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Method[] VALUES_ARRAY = new Method[] { NONE, AVERAGE_BY_TIME, RECURRENCY_FLOW,
			PRESCRIBED_MEDICATION, OCCURRENCY_EXECUTION, STATUS, };

	/**
	 * A public read-only list of all the '<em><b>Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Method> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Method get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Method result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Method getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Method result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Method get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case AVERAGE_BY_TIME_VALUE:
			return AVERAGE_BY_TIME;
		case RECURRENCY_FLOW_VALUE:
			return RECURRENCY_FLOW;
		case PRESCRIBED_MEDICATION_VALUE:
			return PRESCRIBED_MEDICATION;
		case OCCURRENCY_EXECUTION_VALUE:
			return OCCURRENCY_EXECUTION;
		case STATUS_VALUE:
			return STATUS;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Method(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Method
