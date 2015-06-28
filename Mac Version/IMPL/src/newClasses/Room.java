/**
 */
package newClasses;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link newClasses.Room#getRoomNum <em>Room Num</em>}</li>
 *   <li>{@link newClasses.Room#isStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see newClasses.NewClassesPackage#getRoom()
 * @model
 * @generated
 */
public interface Room extends RoomType {
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
	 * @see newClasses.NewClassesPackage#getRoom_RoomNum()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getRoomNum();

	/**
	 * Sets the value of the '{@link newClasses.Room#getRoomNum <em>Room Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Room Num</em>' attribute.
	 * @see #getRoomNum()
	 * @generated
	 */
	void setRoomNum(int value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(boolean)
	 * @see newClasses.NewClassesPackage#getRoom_Status()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isStatus();

	/**
	 * Sets the value of the '{@link newClasses.Room#isStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #isStatus()
	 * @generated
	 */
	void setStatus(boolean value);

} // Room
