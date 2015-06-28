/**
 */
package newClasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receipt</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see newClasses.NewClassesPackage#getReceipt()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Receipt extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestRequired="true" guestOrdered="false" bookingRequired="true" bookingOrdered="false" totalBillCostDataType="org.eclipse.uml2.types.Integer" totalBillCostRequired="true" totalBillCostOrdered="false"
	 * @generated
	 */
	void createGuestReceipt(Object guest, Object booking, int totalBillCost);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model customerRequired="true" customerOrdered="false" bookingRequired="true" bookingOrdered="false" bookingCostDataType="org.eclipse.uml2.types.Integer" bookingCostRequired="true" bookingCostOrdered="false"
	 * @generated
	 */
	void createCustomerReceipt(Object customer, Object booking, int bookingCost);

} // Receipt
