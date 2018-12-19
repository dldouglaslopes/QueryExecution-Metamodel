/**
 */
package query_metamodel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Function</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see query_metamodel.Query_metamodelPackage#getFunction()
 * @model
 * @generated
 */
public enum Function implements Enumerator {
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
	 * The '<em><b>Ocurrency Flow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCURRENCY_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	OCURRENCY_FLOW(1, "ocurrencyFlow", "ocurrencyFlow"),

	/**
	 * The '<em><b>Occurrence Execution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OCCURRENCE_EXECUTION_VALUE
	 * @generated
	 * @ordered
	 */
	OCCURRENCE_EXECUTION(2, "occurrenceExecution", "occurrenceExecution"),

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
	 * The '<em><b>Average Time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE_TIME(4, "averageTime", "averageTime");

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
	 * The '<em><b>Ocurrency Flow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ocurrency Flow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCURRENCY_FLOW
	 * @model name="ocurrencyFlow"
	 * @generated
	 * @ordered
	 */
	public static final int OCURRENCY_FLOW_VALUE = 1;

	/**
	 * The '<em><b>Occurrence Execution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Occurrence Execution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OCCURRENCE_EXECUTION
	 * @model name="occurrenceExecution"
	 * @generated
	 * @ordered
	 */
	public static final int OCCURRENCE_EXECUTION_VALUE = 2;

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
	 * The '<em><b>Average Time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Average Time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_TIME
	 * @model name="averageTime"
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_TIME_VALUE = 4;

	/**
	 * An array of all the '<em><b>Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Function[] VALUES_ARRAY = new Function[] { NONE, OCURRENCY_FLOW, OCCURRENCE_EXECUTION,
			PRESCRIBED_MEDICATION, AVERAGE_TIME, };

	/**
	 * A public read-only list of all the '<em><b>Function</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Function> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Function</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Function get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Function result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Function</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Function getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Function result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Function</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Function get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case OCURRENCY_FLOW_VALUE:
			return OCURRENCY_FLOW;
		case OCCURRENCE_EXECUTION_VALUE:
			return OCCURRENCE_EXECUTION;
		case PRESCRIBED_MEDICATION_VALUE:
			return PRESCRIBED_MEDICATION;
		case AVERAGE_TIME_VALUE:
			return AVERAGE_TIME;
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
	private Function(int value, String name, String literal) {
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

} //Function
