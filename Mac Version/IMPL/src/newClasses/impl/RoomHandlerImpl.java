/**
 */
package newClasses.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import newClasses.Database;
import newClasses.GuestInterface;
import newClasses.NewClassesPackage;
import newClasses.Room;
import newClasses.RoomHandler;
import newClasses.RoomHandlerInterface;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Room Handler</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link newClasses.impl.RoomHandlerImpl#getRoom <em>Room</em>}</li>
 * <li>{@link newClasses.impl.RoomHandlerImpl#getDatabase <em>Database</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomHandlerImpl extends MinimalEObjectImpl.Container implements
		RoomHandler {
	PreparedStatement myStmt;
	ResultSet myRs;
	String DBInDate, DBOutDate;
	/**
	 * The cached value of the '{@link #getRoom() <em>Room</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRoom()
	 * @generated
	 * @ordered
	 */
	protected Room room;

	/**
	 * The cached value of the '{@link #getDatabase() <em>Database</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getDatabase()
	 * @generated
	 * @ordered
	 */
	protected Database database;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected RoomHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewClassesPackage.Literals.ROOM_HANDLER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Room getRoom() {
		if (room != null && room.eIsProxy()) {
			InternalEObject oldRoom = (InternalEObject) room;
			room = (Room) eResolveProxy(oldRoom);
			if (room != oldRoom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NewClassesPackage.ROOM_HANDLER__ROOM, oldRoom, room));
			}
		}
		return room;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Room basicGetRoom() {
		return room;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRoom(Room newRoom) {
		Room oldRoom = room;
		room = newRoom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NewClassesPackage.ROOM_HANDLER__ROOM, oldRoom, room));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Database getDatabase() {
		if (database != null && database.eIsProxy()) {
			InternalEObject oldDatabase = (InternalEObject) database;
			database = (Database) eResolveProxy(oldDatabase);
			if (database != oldDatabase) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NewClassesPackage.ROOM_HANDLER__DATABASE,
							oldDatabase, database));
			}
		}
		return database;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Database basicGetDatabase() {
		return database;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDatabase(Database newDatabase) {
		Database oldDatabase = database;
		database = newDatabase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NewClassesPackage.ROOM_HANDLER__DATABASE, oldDatabase,
					database));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAvalibility(String roomType, boolean status,
			String checkInDate, String checkOutDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkAvalibility(String roomType, String checkInDate,
			String checkOutDate) {
		DatabaseImpl db = new DatabaseImpl();
		db.connect();
		String room = roomType;

		if (roomType.equalsIgnoreCase("regular")
				|| roomType.equalsIgnoreCase("lux")
				|| roomType.equalsIgnoreCase("family")
				|| roomType.equalsIgnoreCase("economy")) {
			try {
				myStmt = db.myConn.prepareStatement("select * from " + room);
				// myStmt.setString(1, roomType);
				myRs = myStmt.executeQuery();

				while (myRs.next()) {

					DBInDate = myRs.getString("CheckIn");
					DBOutDate = myRs.getString("CheckOut");


					if (dateChecker(checkInDate, checkOutDate, DBInDate,
							DBOutDate) == true) {
						return true;
					}
				}

				if (!myRs.next()) {
					System.out.println("Breaking");
					return false;
				}
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		else{
			System.out.println("Non-existing room type");
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean dateChecker(String checkInDate, String checkOutDate,
			String DBcheckIn, String DBcheckOut) {

		if (DBcheckIn == null || DBcheckOut == null) {
			System.out.println("Booking date can not be in the past\n");
			return true;
		}
		try {
			DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date TempCheckIn = sdf.parse(checkInDate);
			Date TempCheckOut = sdf.parse(checkOutDate);
			Date DBInDate = sdf.parse(DBcheckIn);
			Date DBOutDate = sdf.parse(DBcheckOut);
			Date today = sdf.parse(sdf.format(new Date()));
			// check the dates

			if (today.after(TempCheckIn)) {
				return false;
			} else if (TempCheckIn.after(DBOutDate)
					|| TempCheckOut.before(DBInDate)) {
				return true;
			} else
				return false;
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void changeRoomType(int roomNum, String roomType) {
		// TODO: implement this method
		DatabaseImpl db = new DatabaseImpl();
		db.connect();
		try {
			myStmt = db.myConn.prepareStatement("select * from " + roomType
					+ " where " + "RoomNum = ? AND RoomType = ?");
			myStmt.setInt(1, roomNum);
			myStmt.setString(2, roomType);
			myRs = myStmt.executeQuery();

			if (!myRs.next()) {
				myStmt = db.myConn
						.prepareStatement("update Rooms set RoomType=? "
								+ "where idRooms = ?");
				myStmt.setString(1, roomType);
				myStmt.setInt(2, roomNum);
				myStmt.executeUpdate();
				System.out.println("Room: " + roomNum + " is changed to type "
						+ roomType);
			} else {
				myStmt = db.myConn.prepareStatement("insert into Rooms"
						+ "(idRooms, RoomType)" + " values(?, ?)");
				myStmt.setInt(1, roomNum);
				myStmt.setString(2, roomType);
				myStmt.executeUpdate();
				System.out.println("Room: " + roomNum + " is changed to type "
						+ roomType);

			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void removeRoom(int roomNum) {
		// TODO: implement this method
		DatabaseImpl db = new DatabaseImpl();
		db.connect();
		try {
			myStmt = db.myConn.prepareStatement("select * from Rooms where "
					+ "idRooms = ?");
			myStmt.setInt(1, roomNum);
			myRs = myStmt.executeQuery();

			if (myRs.next()) {
				myStmt = db.myConn
						.prepareStatement("delete from Rooms where idRooms = ?");
				myStmt.setInt(1, roomNum);
				myStmt.executeUpdate();
				System.out.println("Room deleted");
			} else {
				System.out.println("Room does not exist");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void changeRoomPrice(int roomNum, int newPrice) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DatabaseImpl db = new DatabaseImpl();
		db.connect();
		try {
			myStmt = db.myConn.prepareStatement("select * from Rooms where "
					+ "RoomNum = ?");
			myStmt.setInt(1, roomNum);
			myRs = myStmt.executeQuery();

			if (myRs.next()) {
				myStmt = db.myConn.prepareStatement("update Rooms set Price=? "
						+ "where Rooms.idRooms = ?");
				myStmt.setInt(1, newPrice);
				myStmt.setInt(2, roomNum);
				myStmt.executeUpdate();
				System.out.println("Room: " + roomNum + " price is changed to "
						+ newPrice);
			}

			else {
				System.out.println("Non existing room number");

			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void addRoom(int roomNum, String roomType, int price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DatabaseImpl db = new DatabaseImpl();
		db.connect();
		try {
			myStmt = db.myConn.prepareStatement("select * from " + roomType
					+ " where " + "RoomNum = ?");
			myStmt.setInt(1, roomNum);
			myRs = myStmt.executeQuery();

			if (!myRs.next()) {
				myStmt = db.myConn.prepareStatement("insert into " + roomType
						+ " " + "(RoomNum, RoomType, Price)"
						+ " values(?, ?, ?)");
				myStmt.setInt(1, roomNum);
				myStmt.setString(2, roomType);
				myStmt.setInt(3, price);
				myStmt.executeUpdate();
				System.out.println("Room: " + roomNum
						+ " was created with type " + roomType + " and price "
						+ price);

			} else {
				System.out.println("this room number already exists");
			}
		} catch (SQLException x) {
			x.printStackTrace();
			System.out.println("Error6");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void extendStay(Object guest, int roomNum, String newCheckOutDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int checkIn(int conformationNum, String checkInDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void changeRoom(Object guest, int roomNum, String newRoomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case NewClassesPackage.ROOM_HANDLER__ROOM:
			if (resolve)
				return getRoom();
			return basicGetRoom();
		case NewClassesPackage.ROOM_HANDLER__DATABASE:
			if (resolve)
				return getDatabase();
			return basicGetDatabase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case NewClassesPackage.ROOM_HANDLER__ROOM:
			setRoom((Room) newValue);
			return;
		case NewClassesPackage.ROOM_HANDLER__DATABASE:
			setDatabase((Database) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case NewClassesPackage.ROOM_HANDLER__ROOM:
			setRoom((Room) null);
			return;
		case NewClassesPackage.ROOM_HANDLER__DATABASE:
			setDatabase((Database) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case NewClassesPackage.ROOM_HANDLER__ROOM:
			return room != null;
		case NewClassesPackage.ROOM_HANDLER__DATABASE:
			return database != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == RoomHandlerInterface.class) {
			switch (baseOperationID) {
			case NewClassesPackage.ROOM_HANDLER_INTERFACE___CHANGE_ROOM_TYPE__INT_STRING:
				return NewClassesPackage.ROOM_HANDLER___CHANGE_ROOM_TYPE__INT_STRING;
			case NewClassesPackage.ROOM_HANDLER_INTERFACE___REMOVE_ROOM__INT:
				return NewClassesPackage.ROOM_HANDLER___REMOVE_ROOM__INT;
			case NewClassesPackage.ROOM_HANDLER_INTERFACE___CHANGE_ROOM_PRICE__INT_INT:
				return NewClassesPackage.ROOM_HANDLER___CHANGE_ROOM_PRICE__INT_INT;
			case NewClassesPackage.ROOM_HANDLER_INTERFACE___ADD_ROOM__INT_STRING_INT:
				return NewClassesPackage.ROOM_HANDLER___ADD_ROOM__INT_STRING_INT;
			default:
				return -1;
			}
		}
		if (baseClass == GuestInterface.class) {
			switch (baseOperationID) {
			case NewClassesPackage.GUEST_INTERFACE___EXTEND_STAY__OBJECT_INT_STRING:
				return NewClassesPackage.ROOM_HANDLER___EXTEND_STAY__OBJECT_INT_STRING;
			case NewClassesPackage.GUEST_INTERFACE___CHECK_IN__INT_STRING:
				return NewClassesPackage.ROOM_HANDLER___CHECK_IN__INT_STRING;
			case NewClassesPackage.GUEST_INTERFACE___CHANGE_ROOM__OBJECT_INT_STRING:
				return NewClassesPackage.ROOM_HANDLER___CHANGE_ROOM__OBJECT_INT_STRING;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case NewClassesPackage.ROOM_HANDLER___SET_AVALIBILITY__STRING_BOOLEAN_STRING_STRING:
			setAvalibility((String) arguments.get(0),
					(Boolean) arguments.get(1), (String) arguments.get(2),
					(String) arguments.get(3));
			return null;
		case NewClassesPackage.ROOM_HANDLER___CHECK_AVALIBILITY__STRING_STRING_STRING:
			return checkAvalibility((String) arguments.get(0),
					(String) arguments.get(1), (String) arguments.get(2));
		case NewClassesPackage.ROOM_HANDLER___DATE_CHECKER__STRING_STRING_STRING_STRING:
			return dateChecker((String) arguments.get(0),
					(String) arguments.get(1), (String) arguments.get(2),
					(String) arguments.get(3));
		case NewClassesPackage.ROOM_HANDLER___CHANGE_ROOM_TYPE__INT_STRING:
			changeRoomType((Integer) arguments.get(0),
					(String) arguments.get(1));
			return null;
		case NewClassesPackage.ROOM_HANDLER___REMOVE_ROOM__INT:
			removeRoom((Integer) arguments.get(0));
			return null;
		case NewClassesPackage.ROOM_HANDLER___CHANGE_ROOM_PRICE__INT_INT:
			changeRoomPrice((Integer) arguments.get(0),
					(Integer) arguments.get(1));
			return null;
		case NewClassesPackage.ROOM_HANDLER___ADD_ROOM__INT_STRING_INT:
			addRoom((Integer) arguments.get(0), (String) arguments.get(1),
					(Integer) arguments.get(2));
			return null;
		case NewClassesPackage.ROOM_HANDLER___EXTEND_STAY__OBJECT_INT_STRING:
			extendStay(arguments.get(0), (Integer) arguments.get(1),
					(String) arguments.get(2));
			return null;
		case NewClassesPackage.ROOM_HANDLER___CHECK_IN__INT_STRING:
			return checkIn((Integer) arguments.get(0),
					(String) arguments.get(1));
		case NewClassesPackage.ROOM_HANDLER___CHANGE_ROOM__OBJECT_INT_STRING:
			changeRoom(arguments.get(0), (Integer) arguments.get(1),
					(String) arguments.get(2));
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}
	// ///////////////////////////////////////////////////////////////////////

} // RoomHandlerImpl
