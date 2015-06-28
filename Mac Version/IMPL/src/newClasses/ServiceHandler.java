/**
 */
package newClasses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link newClasses.ServiceHandler#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see newClasses.NewClassesPackage#getServiceHandler()
 * @model
 * @generated
 */
public interface ServiceHandler extends ServiceProvider, ServiceHandlerInterface {
	/**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see newClasses.NewClassesPackage#getServiceHandler_Service()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link newClasses.ServiceHandler#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

} // ServiceHandler
