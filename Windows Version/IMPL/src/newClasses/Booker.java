/**
 */
package newClasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booker</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see newClasses.NewClassesPackage#getBooker()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Booker extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" servicesDataType="org.eclipse.uml2.types.String" servicesRequired="true" servicesOrdered="false" checkInDateDataType="org.eclipse.uml2.types.String" checkInDateRequired="true" checkInDateOrdered="false" checkOutDateDataType="org.eclipse.uml2.types.String" checkOutDateRequired="true" checkOutDateOrdered="false"
	 * @generated
	 */
	int createBooking(String roomType, String services, String checkInDate, String checkOutDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model conformationNumDataType="org.eclipse.uml2.types.Integer" conformationNumRequired="true" conformationNumOrdered="false"
	 * @generated
	 */
	void cancelBooking(int conformationNum);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" comformationNumDataType="org.eclipse.uml2.types.Integer" comformationNumRequired="true" comformationNumOrdered="false" serviceTypeDataType="org.eclipse.uml2.types.String" serviceTypeRequired="true" serviceTypeOrdered="false" checkInDateDataType="org.eclipse.uml2.types.String" checkInDateRequired="true" checkInDateOrdered="false" checkOutDateDataType="org.eclipse.uml2.types.String" checkOutDateRequired="true" checkOutDateOrdered="false"
	 * @generated
	 */
	void reBook(String roomType, int comformationNum, String serviceType, String checkInDate, String checkOutDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int generateConfirmNum();

} // Booker
