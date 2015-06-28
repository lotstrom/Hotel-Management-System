/**
 */
package newClasses.impl;

import newClasses.NewClassesPackage;
import newClasses.Room;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link newClasses.impl.RoomImpl#getRoomNum <em>Room Num</em>}</li>
 *   <li>{@link newClasses.impl.RoomImpl#isStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomImpl extends RoomTypeImpl implements Room {
	/**
	 * The default value of the '{@link #getRoomNum() <em>Room Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNum()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNum() <em>Room Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomNum()
	 * @generated
	 * @ordered
	 */
	protected int roomNum = ROOM_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewClassesPackage.Literals.ROOM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNum() {
		return roomNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNum(int newRoomNum) {
		int oldRoomNum = roomNum;
		roomNum = newRoomNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.ROOM__ROOM_NUM, oldRoomNum, roomNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(boolean newStatus) {
		boolean oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.ROOM__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewClassesPackage.ROOM__ROOM_NUM:
				return getRoomNum();
			case NewClassesPackage.ROOM__STATUS:
				return isStatus();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NewClassesPackage.ROOM__ROOM_NUM:
				setRoomNum((Integer)newValue);
				return;
			case NewClassesPackage.ROOM__STATUS:
				setStatus((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NewClassesPackage.ROOM__ROOM_NUM:
				setRoomNum(ROOM_NUM_EDEFAULT);
				return;
			case NewClassesPackage.ROOM__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NewClassesPackage.ROOM__ROOM_NUM:
				return roomNum != ROOM_NUM_EDEFAULT;
			case NewClassesPackage.ROOM__STATUS:
				return status != STATUS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (roomNum: ");
		result.append(roomNum);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //RoomImpl
