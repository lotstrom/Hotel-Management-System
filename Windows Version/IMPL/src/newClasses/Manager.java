/**
 */
package newClasses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link newClasses.Manager#getUserName <em>User Name</em>}</li>
 *   <li>{@link newClasses.Manager#getPassword <em>Password</em>}</li>
 *   <li>{@link newClasses.Manager#getRoomHandler <em>Room Handler</em>}</li>
 *   <li>{@link newClasses.Manager#getServiceHandler <em>Service Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see newClasses.NewClassesPackage#getManager()
 * @model
 * @generated
 */
public interface Manager extends ManagerInterface, RoomHandlerInterface, ServiceHandlerInterface {
	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see newClasses.NewClassesPackage#getManager_UserName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link newClasses.Manager#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see newClasses.NewClassesPackage#getManager_Password()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link newClasses.Manager#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Room Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Handler</em>' reference.
	 * @see #setRoomHandler(RoomHandler)
	 * @see newClasses.NewClassesPackage#getManager_RoomHandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RoomHandler getRoomHandler();

	/**
	 * Sets the value of the '{@link newClasses.Manager#getRoomHandler <em>Room Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Handler</em>' reference.
	 * @see #getRoomHandler()
	 * @generated
	 */
	void setRoomHandler(RoomHandler value);

	/**
	 * Returns the value of the '<em><b>Service Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Handler</em>' reference.
	 * @see #setServiceHandler(ServiceHandler)
	 * @see newClasses.NewClassesPackage#getManager_ServiceHandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ServiceHandler getServiceHandler();

	/**
	 * Sets the value of the '{@link newClasses.Manager#getServiceHandler <em>Service Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Handler</em>' reference.
	 * @see #getServiceHandler()
	 * @generated
	 */
	void setServiceHandler(ServiceHandler value);

} // Manager
