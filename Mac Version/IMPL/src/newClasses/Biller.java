/**
 */
package newClasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Biller</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see newClasses.NewClassesPackage#getBiller()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Biller extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" checkInDateDataType="org.eclipse.uml2.types.String" checkInDateRequired="true" checkInDateOrdered="false" checkOutDateDataType="org.eclipse.uml2.types.String" checkOutDateRequired="true" checkOutDateOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" servicesDataType="org.eclipse.uml2.types.String" servicesRequired="true" servicesOrdered="false"
	 * @generated
	 */
	int calculateCost(String checkInDate, String checkOutDate, String roomType, String services);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" addedServicesDataType="org.eclipse.uml2.types.String" addedServicesRequired="true" addedServicesOrdered="false" extraDaysDataType="org.eclipse.uml2.types.Integer" extraDaysRequired="true" extraDaysOrdered="false" creditCardNumDataType="org.eclipse.uml2.types.String" creditCardNumRequired="true" creditCardNumOrdered="false" cvcDataType="org.eclipse.uml2.types.String" cvcRequired="true" cvcOrdered="false" monthDataType="org.eclipse.uml2.types.Integer" monthRequired="true" monthOrdered="false" yearDataType="org.eclipse.uml2.types.Integer" yearRequired="true" yearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" bookingCostDataType="org.eclipse.uml2.types.Integer" bookingCostRequired="true" bookingCostOrdered="false" isPaidDataType="org.eclipse.uml2.types.Boolean" isPaidRequired="true" isPaidOrdered="false"
	 * @generated
	 */
	boolean pay(String addedServices, int extraDays, String creditCardNum, String cvc, int month, int year, String firstName, String lastName, int bookingCost, boolean isPaid);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" addedServicesDataType="org.eclipse.uml2.types.String" addedServicesRequired="true" addedServicesOrdered="false" extraDaysDataType="org.eclipse.uml2.types.Integer" extraDaysRequired="true" extraDaysOrdered="false" bookingCostDataType="org.eclipse.uml2.types.Integer" bookingCostRequired="true" bookingCostOrdered="false" isPaidDataType="org.eclipse.uml2.types.Boolean" isPaidRequired="true" isPaidOrdered="false"
	 * @generated
	 */
	int calculateBill(String addedServices, int extraDays, int bookingCost, boolean isPaid);

} // Biller
