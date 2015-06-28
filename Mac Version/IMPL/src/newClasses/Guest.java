/**
 */
package newClasses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link newClasses.Guest#getCheckInDate <em>Check In Date</em>}</li>
 *   <li>{@link newClasses.Guest#getCheckOutDate <em>Check Out Date</em>}</li>
 *   <li>{@link newClasses.Guest#getRoomNum <em>Room Num</em>}</li>
 *   <li>{@link newClasses.Guest#isCheckedIn <em>Checked In</em>}</li>
 *   <li>{@link newClasses.Guest#isCheckedOut <em>Checked Out</em>}</li>
 *   <li>{@link newClasses.Guest#getAddedServices <em>Added Services</em>}</li>
 *   <li>{@link newClasses.Guest#getExtraDays <em>Extra Days</em>}</li>
 *   <li>{@link newClasses.Guest#getCost <em>Cost</em>}</li>
 *   <li>{@link newClasses.Guest#isBookingPaid <em>Booking Paid</em>}</li>
 * </ul>
 * </p>
 *
 * @see newClasses.NewClassesPackage#getGuest()
 * @model
 * @generated
 */
public interface Guest extends Customer, GuestBiller, GuestInterface {
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
	 * @see newClasses.NewClassesPackage#getGuest_CheckInDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCheckInDate();

	/**
	 * Sets the value of the '{@link newClasses.Guest#getCheckInDate <em>Check In Date</em>}' attribute.
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
	 * @see newClasses.NewClassesPackage#getGuest_CheckOutDate()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCheckOutDate();

	/**
	 * Sets the value of the '{@link newClasses.Guest#getCheckOutDate <em>Check Out Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Check Out Date</em>' attribute.
	 * @see #getCheckOutDate()
	 * @generated
	 */
	void setCheckOutDate(String value);

	/**
	 * Returns the value of the '<em><b>Room Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Room Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Room Num</em>' attribute.
	 * @see #setRoomNum(int)
	 * @see newClasses.NewClassesPackage#getGuest_RoomNum()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRoomNum();

	/**
	 * Sets the value of the '{@link newClasses.Guest#getRoomNum <em>Room Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Num</em>' attribute.
	 * @see #getRoomNum()
	 * @generated
	 */
	void setRoomNum(int value);

	/**
	 * Returns the value of the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked In</em>' attribute.
	 * @see #setCheckedIn(boolean)
	 * @see newClasses.NewClassesPackage#getGuest_CheckedIn()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isCheckedIn();

	/**
	 * Sets the value of the '{@link newClasses.Guest#isCheckedIn <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked In</em>' attribute.
	 * @see #isCheckedIn()
	 * @generated
	 */
	void setCheckedIn(boolean value);

	/**
	 * Returns the value of the '<em><b>Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked Out</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked Out</em>' attribute.
	 * @see #setCheckedOut(boolean)
	 * @see newClasses.NewClassesPackage#getGuest_CheckedOut()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isCheckedOut();

	/**
	 * Sets the value of the '{@link newClasses.Guest#isCheckedOut <em>Checked Out</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Checked Out</em>' attribute.
	 * @see #isCheckedOut()
	 * @generated
	 */
	void setCheckedOut(boolean value);

	/**
	 * Returns the value of the '<em><b>Added Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Added Services</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added Services</em>' attribute.
	 * @see #setAddedServices(String)
	 * @see newClasses.NewClassesPackage#getGuest_AddedServices()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAddedServices();

	/**
	 * Sets the value of the '{@link newClasses.Guest#getAddedServices <em>Added Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Added Services</em>' attribute.
	 * @see #getAddedServices()
	 * @generated
	 */
	void setAddedServices(String value);

	/**
	 * Returns the value of the '<em><b>Extra Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Days</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Days</em>' attribute.
	 * @see #setExtraDays(int)
	 * @see newClasses.NewClassesPackage#getGuest_ExtraDays()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getExtraDays();

	/**
	 * Sets the value of the '{@link newClasses.Guest#getExtraDays <em>Extra Days</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Days</em>' attribute.
	 * @see #getExtraDays()
	 * @generated
	 */
	void setExtraDays(int value);

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
	 * @see newClasses.NewClassesPackage#getGuest_Cost()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link newClasses.Guest#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

	/**
	 * Returns the value of the '<em><b>Booking Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Paid</em>' attribute.
	 * @see #setBookingPaid(boolean)
	 * @see newClasses.NewClassesPackage#getGuest_BookingPaid()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isBookingPaid();

	/**
	 * Sets the value of the '{@link newClasses.Guest#isBookingPaid <em>Booking Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Paid</em>' attribute.
	 * @see #isBookingPaid()
	 * @generated
	 */
	void setBookingPaid(boolean value);

} // Guest
