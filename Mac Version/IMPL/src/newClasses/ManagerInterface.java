/**
 */
package newClasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see newClasses.NewClassesPackage#getManagerInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ManagerInterface extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void logout();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model userNameDataType="org.eclipse.uml2.types.String" userNameRequired="true" userNameOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	void login(String userName, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" userNameDataType="org.eclipse.uml2.types.String" userNameRequired="true" userNameOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	boolean validateLogin(String userName, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void SessionData();

} // ManagerInterface
