/**
 */
package newClasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room Handler Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see newClasses.NewClassesPackage#getRoomHandlerInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface RoomHandlerInterface extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumDataType="org.eclipse.uml2.types.Integer" roomNumRequired="true" roomNumOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false"
	 * @generated
	 */
	void changeRoomType(int roomNum, String roomType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumDataType="org.eclipse.uml2.types.Integer" roomNumRequired="true" roomNumOrdered="false"
	 * @generated
	 */
	void removeRoom(int roomNum);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumDataType="org.eclipse.uml2.types.Integer" roomNumRequired="true" roomNumOrdered="false" newPriceDataType="org.eclipse.uml2.types.Integer" newPriceRequired="true" newPriceOrdered="false"
	 * @generated
	 */
	void changeRoomPrice(int roomNum, int newPrice);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomNumDataType="org.eclipse.uml2.types.Integer" roomNumRequired="true" roomNumOrdered="false" roomTypeDataType="org.eclipse.uml2.types.String" roomTypeRequired="true" roomTypeOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void addRoom(int roomNum, String roomType, int price);

} // RoomHandlerInterface
