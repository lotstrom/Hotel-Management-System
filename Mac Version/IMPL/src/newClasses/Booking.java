/**
 */
package newClasses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link newClasses.Booking#getCheckInDate <em>Check In Date</em>}</li>
 *   <li>{@link newClasses.Booking#getCheckOutDate <em>Check Out Date</em>}</li>
 *   <li>{@link newClasses.Booking#getConformationNum <em>Conformation Num</em>}</li>
 *   <li>{@link newClasses.Booking#getCost <em>Cost</em>}</li>
 *   <li>{@link newClasses.Booking#getReceiptCreator <em>Receipt Creator</em>}</li>
 *   <li>{@link newClasses.Booking#getDatabaseHandler <em>Database Handler</em>}</li>
 *   <li>{@link newClasses.Booking#getRoomType <em>Room Type</em>}</li>
 *   <li>{@link newClasses.Booking#getServices <em>Services</em>}</li>
 *   <li>{@link newClasses.Booking#isPaid <em>Is Paid</em>}</li>
 * </ul>
 * </p>
 *
 * @see newClasses.NewClassesPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends RoomProvider, Biller, Booker, ServiceProvider, Validator, CustomerProvides {
	/**
	 * Returns the value of the '<em><b>Check In Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check In Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check In Date</em>' attribute.
	 * @see #setCheckInDate(String)
	 * @see newClasses.NewClassesPackage#getBooking_CheckInDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCheckInDate();

	/**
	 * Sets the value of the '{@link newClasses.Booking#getCheckInDate <em>Check In Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check In Date</em>' attribute.
	 * @see #getCheckInDate()
	 * @generated
	 */
	void setCheckInDate(String value);

	/**
	 * Returns the value of the '<em><b>Check Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Check Out Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check Out Date</em>' attribute.
	 * @see #setCheckOutDate(String)
	 * @see newClasses.NewClassesPackage#getBooking_CheckOutDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCheckOutDate();

	/**
	 * Sets the value of the '{@link newClasses.Booking#getCheckOutDate <em>Check Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Out Date</em>' attribute.
	 * @see #getCheckOutDate()
	 * @generated
	 */
	void setCheckOutDate(String value);

	/**
	 * Returns the value of the '<em><b>Conformation Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conformation Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conformation Num</em>' attribute.
	 * @see #setConformationNum(int)
	 * @see newClasses.NewClassesPackage#getBooking_ConformationNum()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getConformationNum();

	/**
	 * Sets the value of the '{@link newClasses.Booking#getConformationNum <em>Conformation Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conformation Num</em>' attribute.
	 * @see #getConformationNum()
	 * @generated
	 */
	void setConformationNum(int value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #setCost(int)
	 * @see newClasses.NewClassesPackage#getBooking_Cost()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link newClasses.Booking#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

	/**
	 * Returns the value of the '<em><b>Receipt Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receipt Creator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receipt Creator</em>' reference.
	 * @see #setReceiptCreator(ReceiptCreator)
	 * @see newClasses.NewClassesPackage#getBooking_ReceiptCreator()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ReceiptCreator getReceiptCreator();

	/**
	 * Sets the value of the '{@link newClasses.Booking#getReceiptCreator <em>Receipt Creator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receipt Creator</em>' reference.
	 * @see #getReceiptCreator()
	 * @generated
	 */
	void setReceiptCreator(ReceiptCreator value);

	/**
	 * Returns the value of the '<em><b>Database Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Handler</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Handler</em>' reference.
	 * @see #setDatabaseHandler(Database)
	 * @see newClasses.NewClassesPackage#getBooking_DatabaseHandler()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Database getDatabaseHandler();

	/**
	 * Sets the value of the '{@link newClasses.Booking#getDatabaseHandler <em>Database Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database Handler</em>' reference.
	 * @see #getDatabaseHandler()
	 * @generated
	 */
	void setDatabaseHandler(Database value);

	/**
	 * Returns the value of the '<em><b>Room Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Type</em>' attribute.
	 * @see #setRoomType(String)
	 * @see newClasses.NewClassesPackage#getBooking_RoomType()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='roomType '"
	 * @generated
	 */
	String getRoomType();

	/**
	 * Sets the value of the '{@link newClasses.Booking#getRoomType <em>Room Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Type</em>' attribute.
	 * @see #getRoomType()
	 * @generated
	 */
	void setRoomType(String value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' attribute.
	 * @see #setServices(String)
	 * @see newClasses.NewClassesPackage#getBooking_Services()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getServices();

	/**
	 * Sets the value of the '{@link newClasses.Booking#getServices <em>Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Services</em>' attribute.
	 * @see #getServices()
	 * @generated
	 */
	void setServices(String value);

	/**
	 * Returns the value of the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Paid</em>' attribute.
	 * @see #setIsPaid(boolean)
	 * @see newClasses.NewClassesPackage#getBooking_IsPaid()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPaid();

	/**
	 * Sets the value of the '{@link newClasses.Booking#isPaid <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Paid</em>' attribute.
	 * @see #isPaid()
	 * @generated
	 */
	void setIsPaid(boolean value);

} // Booking
