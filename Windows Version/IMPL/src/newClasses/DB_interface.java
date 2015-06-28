/**
 */
package newClasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DB interface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see newClasses.NewClassesPackage#getDB_interface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface DB_interface extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerRequired="true" customerOrdered="false" bookingCostDataType="org.eclipse.uml2.types.Integer" bookingCostRequired="true" bookingCostOrdered="false"
	 * @generated
	 */
	void registerCustomerPayment(Object customer, int bookingCost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestRequired="true" guestOrdered="false" totalBillCostDataType="org.eclipse.uml2.types.Integer" totalBillCostRequired="true" totalBillCostOrdered="false"
	 * @generated
	 */
	void registerGuestPayment(Object guest, int totalBillCost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestRequired="true" guestOrdered="false"
	 * @generated
	 */
	void storeGuest(Object guest);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingRequired="true" bookingOrdered="false"
	 * @generated
	 */
	void storeBooking(Object booking);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerRequired="true" customerOrdered="false"
	 * @generated
	 */
	void storeCustomer(Object customer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void connect();

} // DB_interface
