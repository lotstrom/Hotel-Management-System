/**
 */
package newClasses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Login Checker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link newClasses.LoginChecker#getManager <em>Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see newClasses.NewClassesPackage#getLoginChecker()
 * @model
 * @generated
 */
public interface LoginChecker extends ManagerInterface {
	/**
	 * Returns the value of the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manager</em>' reference.
	 * @see #setManager(Manager)
	 * @see newClasses.NewClassesPackage#getLoginChecker_Manager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Manager getManager();

	/**
	 * Sets the value of the '{@link newClasses.LoginChecker#getManager <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manager</em>' reference.
	 * @see #getManager()
	 * @generated
	 */
	void setManager(Manager value);

} // LoginChecker
