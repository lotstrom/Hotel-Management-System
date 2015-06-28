/**
 */
package newClasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see newClasses.NewClassesPackage#getGuestInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GuestInterface extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestRequired="true" guestOrdered="false" roomNumDataType="org.eclipse.uml2.types.Integer" roomNumRequired="true" roomNumOrdered="false" newCheckOutDateDataType="org.eclipse.uml2.types.String" newCheckOutDateRequired="true" newCheckOutDateOrdered="false"
	 * @generated
	 */
	void extendStay(Object guest, int roomNum, String newCheckOutDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" conformationNumDataType="org.eclipse.uml2.types.Integer" conformationNumRequired="true" conformationNumOrdered="false" checkInDateDataType="org.eclipse.uml2.types.String" checkInDateRequired="true" checkInDateOrdered="false"
	 * @generated
	 */
	int checkIn(int conformationNum, String checkInDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model guestRequired="true" guestOrdered="false" roomNumDataType="org.eclipse.uml2.types.Integer" roomNumRequired="true" roomNumOrdered="false" newRoomTypeDataType="org.eclipse.uml2.types.String" newRoomTypeRequired="true" newRoomTypeOrdered="false"
	 * @generated
	 */
	void changeRoom(Object guest, int roomNum, String newRoomType);

} // GuestInterface
