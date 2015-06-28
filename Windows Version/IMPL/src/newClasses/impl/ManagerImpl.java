/**
 */
package newClasses.impl;

import java.lang.reflect.InvocationTargetException;

import newClasses.Manager;
import newClasses.NewClassesPackage;
import newClasses.RoomHandler;
import newClasses.RoomHandlerInterface;
import newClasses.ServiceHandler;
import newClasses.ServiceHandlerInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link newClasses.impl.ManagerImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link newClasses.impl.ManagerImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link newClasses.impl.ManagerImpl#getRoomHandler <em>Room Handler</em>}</li>
 *   <li>{@link newClasses.impl.ManagerImpl#getServiceHandler <em>Service Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManagerImpl extends MinimalEObjectImpl.Container implements Manager {
	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRoomHandler() <em>Room Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomHandler()
	 * @generated
	 * @ordered
	 */
	protected RoomHandler roomHandler;

	/**
	 * The cached value of the '{@link #getServiceHandler() <em>Service Handler</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceHandler()
	 * @generated
	 * @ordered
	 */
	protected ServiceHandler serviceHandler;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewClassesPackage.Literals.MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.MANAGER__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.MANAGER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandler getRoomHandler() {
		if (roomHandler != null && roomHandler.eIsProxy()) {
			InternalEObject oldRoomHandler = (InternalEObject)roomHandler;
			roomHandler = (RoomHandler)eResolveProxy(oldRoomHandler);
			if (roomHandler != oldRoomHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NewClassesPackage.MANAGER__ROOM_HANDLER, oldRoomHandler, roomHandler));
			}
		}
		return roomHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandler basicGetRoomHandler() {
		return roomHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomHandler(RoomHandler newRoomHandler) {
		RoomHandler oldRoomHandler = roomHandler;
		roomHandler = newRoomHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.MANAGER__ROOM_HANDLER, oldRoomHandler, roomHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceHandler getServiceHandler() {
		if (serviceHandler != null && serviceHandler.eIsProxy()) {
			InternalEObject oldServiceHandler = (InternalEObject)serviceHandler;
			serviceHandler = (ServiceHandler)eResolveProxy(oldServiceHandler);
			if (serviceHandler != oldServiceHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NewClassesPackage.MANAGER__SERVICE_HANDLER, oldServiceHandler, serviceHandler));
			}
		}
		return serviceHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceHandler basicGetServiceHandler() {
		return serviceHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceHandler(ServiceHandler newServiceHandler) {
		ServiceHandler oldServiceHandler = serviceHandler;
		serviceHandler = newServiceHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.MANAGER__SERVICE_HANDLER, oldServiceHandler, serviceHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logout() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void login(String userName, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogin(String userName, String password) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void SessionData() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRoomType(int roomNum, String roomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoom(int roomNum) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRoomPrice(int roomNum, int newPrice) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoom(int roomNum, String roomType, int price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeServiceType(int ID, String newType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeService(int ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeServicePrice(int ID, int newPrice) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addService(int ID, String type, int price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewClassesPackage.MANAGER__USER_NAME:
				return getUserName();
			case NewClassesPackage.MANAGER__PASSWORD:
				return getPassword();
			case NewClassesPackage.MANAGER__ROOM_HANDLER:
				if (resolve) return getRoomHandler();
				return basicGetRoomHandler();
			case NewClassesPackage.MANAGER__SERVICE_HANDLER:
				if (resolve) return getServiceHandler();
				return basicGetServiceHandler();
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
			case NewClassesPackage.MANAGER__USER_NAME:
				setUserName((String)newValue);
				return;
			case NewClassesPackage.MANAGER__PASSWORD:
				setPassword((String)newValue);
				return;
			case NewClassesPackage.MANAGER__ROOM_HANDLER:
				setRoomHandler((RoomHandler)newValue);
				return;
			case NewClassesPackage.MANAGER__SERVICE_HANDLER:
				setServiceHandler((ServiceHandler)newValue);
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
			case NewClassesPackage.MANAGER__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case NewClassesPackage.MANAGER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case NewClassesPackage.MANAGER__ROOM_HANDLER:
				setRoomHandler((RoomHandler)null);
				return;
			case NewClassesPackage.MANAGER__SERVICE_HANDLER:
				setServiceHandler((ServiceHandler)null);
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
			case NewClassesPackage.MANAGER__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case NewClassesPackage.MANAGER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case NewClassesPackage.MANAGER__ROOM_HANDLER:
				return roomHandler != null;
			case NewClassesPackage.MANAGER__SERVICE_HANDLER:
				return serviceHandler != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RoomHandlerInterface.class) {
			switch (baseOperationID) {
				case NewClassesPackage.ROOM_HANDLER_INTERFACE___CHANGE_ROOM_TYPE__INT_STRING: return NewClassesPackage.MANAGER___CHANGE_ROOM_TYPE__INT_STRING;
				case NewClassesPackage.ROOM_HANDLER_INTERFACE___REMOVE_ROOM__INT: return NewClassesPackage.MANAGER___REMOVE_ROOM__INT;
				case NewClassesPackage.ROOM_HANDLER_INTERFACE___CHANGE_ROOM_PRICE__INT_INT: return NewClassesPackage.MANAGER___CHANGE_ROOM_PRICE__INT_INT;
				case NewClassesPackage.ROOM_HANDLER_INTERFACE___ADD_ROOM__INT_STRING_INT: return NewClassesPackage.MANAGER___ADD_ROOM__INT_STRING_INT;
				default: return -1;
			}
		}
		if (baseClass == ServiceHandlerInterface.class) {
			switch (baseOperationID) {
				case NewClassesPackage.SERVICE_HANDLER_INTERFACE___CHANGE_SERVICE_TYPE__INT_STRING: return NewClassesPackage.MANAGER___CHANGE_SERVICE_TYPE__INT_STRING;
				case NewClassesPackage.SERVICE_HANDLER_INTERFACE___REMOVE_SERVICE__INT: return NewClassesPackage.MANAGER___REMOVE_SERVICE__INT;
				case NewClassesPackage.SERVICE_HANDLER_INTERFACE___CHANGE_SERVICE_PRICE__INT_INT: return NewClassesPackage.MANAGER___CHANGE_SERVICE_PRICE__INT_INT;
				case NewClassesPackage.SERVICE_HANDLER_INTERFACE___ADD_SERVICE__INT_STRING_INT: return NewClassesPackage.MANAGER___ADD_SERVICE__INT_STRING_INT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NewClassesPackage.MANAGER___LOGOUT:
				logout();
				return null;
			case NewClassesPackage.MANAGER___LOGIN__STRING_STRING:
				login((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case NewClassesPackage.MANAGER___VALIDATE_LOGIN__STRING_STRING:
				return validateLogin((String)arguments.get(0), (String)arguments.get(1));
			case NewClassesPackage.MANAGER___SESSION_DATA:
				SessionData();
				return null;
			case NewClassesPackage.MANAGER___CHANGE_ROOM_TYPE__INT_STRING:
				changeRoomType((Integer)arguments.get(0), (String)arguments.get(1));
				return null;
			case NewClassesPackage.MANAGER___REMOVE_ROOM__INT:
				removeRoom((Integer)arguments.get(0));
				return null;
			case NewClassesPackage.MANAGER___CHANGE_ROOM_PRICE__INT_INT:
				changeRoomPrice((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case NewClassesPackage.MANAGER___ADD_ROOM__INT_STRING_INT:
				addRoom((Integer)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
				return null;
			case NewClassesPackage.MANAGER___CHANGE_SERVICE_TYPE__INT_STRING:
				changeServiceType((Integer)arguments.get(0), (String)arguments.get(1));
				return null;
			case NewClassesPackage.MANAGER___REMOVE_SERVICE__INT:
				removeService((Integer)arguments.get(0));
				return null;
			case NewClassesPackage.MANAGER___CHANGE_SERVICE_PRICE__INT_INT:
				changeServicePrice((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case NewClassesPackage.MANAGER___ADD_SERVICE__INT_STRING_INT:
				addService((Integer)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (userName: ");
		result.append(userName);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //ManagerImpl
