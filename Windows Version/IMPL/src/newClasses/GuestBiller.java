/**
 */
package newClasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest Biller</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see newClasses.NewClassesPackage#getGuestBiller()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GuestBiller extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" guestRequired="true" guestOrdered="false" typeDataType="org.eclipse.uml2.types.String" typeRequired="true" typeOrdered="false"
	 * @generated
	 */
	int addServiceToBill(Object guest, String type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" checkOutDateDataType="org.eclipse.uml2.types.String" checkOutDateRequired="true" checkOutDateOrdered="false" roomNumDataType="org.eclipse.uml2.types.Integer" roomNumRequired="true" roomNumOrdered="false" creditCardNumDataType="org.eclipse.uml2.types.String" creditCardNumRequired="true" creditCardNumOrdered="false" cvcDataType="org.eclipse.uml2.types.String" cvcRequired="true" cvcOrdered="false" monthDataType="org.eclipse.uml2.types.Integer" monthRequired="true" monthOrdered="false" yearDataType="org.eclipse.uml2.types.Integer" yearRequired="true" yearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false" costDataType="org.eclipse.uml2.types.Integer" costRequired="true" costOrdered="false"
	 * @generated
	 */
	boolean checkOut(String checkOutDate, int roomNum, String creditCardNum, String cvc, int month, int year, String firstName, String lastName, int cost);

} // GuestBiller
