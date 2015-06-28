/**
 */
package newClasses.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import newClasses.Biller;
import newClasses.Booker;
import newClasses.Booking;
import newClasses.CustomerProvides;
import newClasses.Database;
import newClasses.NewClassesPackage;
import newClasses.ReceiptCreator;
import newClasses.ServiceProvider;
import newClasses.Validator;
import newClasses.impl.InformationValidatorImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Booking</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link newClasses.impl.BookingImpl#getCheckInDate <em>Check In Date</em>}
 * </li>
 * <li>{@link newClasses.impl.BookingImpl#getCheckOutDate <em>Check Out Date
 * </em>}</li>
 * <li>{@link newClasses.impl.BookingImpl#getConformationNum <em>Conformation
 * Num</em>}</li>
 * <li>{@link newClasses.impl.BookingImpl#getCost <em>Cost</em>}</li>
 * <li>{@link newClasses.impl.BookingImpl#getReceiptCreator <em>Receipt Creator
 * </em>}</li>
 * <li>{@link newClasses.impl.BookingImpl#getDatabaseHandler <em>Database
 * Handler</em>}</li>
 * <li>{@link newClasses.impl.BookingImpl#getRoomType <em>Room Type</em>}</li>
 * <li>{@link newClasses.impl.BookingImpl#getServices <em>Services</em>}</li>
 * <li>{@link newClasses.impl.BookingImpl#isPaid <em>Is Paid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements
		Booking {
	/**
	 * The default value of the '{@link #getCheckInDate()
	 * <em>Check In Date</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getCheckInDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_IN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckInDate() <em>Check In Date</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCheckInDate()
	 * @generated
	 * @ordered
	 */
	protected String checkInDate = CHECK_IN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckOutDate()
	 * <em>Check Out Date</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getCheckOutDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_OUT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckOutDate()
	 * <em>Check Out Date</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getCheckOutDate()
	 * @generated
	 * @ordered
	 */
	protected String checkOutDate = CHECK_OUT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getConformationNum()
	 * <em>Conformation Num</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getConformationNum()
	 * @generated
	 * @ordered
	 */
	protected static final int CONFORMATION_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getConformationNum()
	 * <em>Conformation Num</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getConformationNum()
	 * @generated
	 * @ordered
	 */
	protected int conformationNum = CONFORMATION_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected int cost = COST_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReceiptCreator()
	 * <em>Receipt Creator</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getReceiptCreator()
	 * @generated
	 * @ordered
	 */
	protected ReceiptCreator receiptCreator;

	/**
	 * The cached value of the '{@link #getDatabaseHandler()
	 * <em>Database Handler</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getDatabaseHandler()
	 * @generated
	 * @ordered
	 */
	protected Database databaseHandler;

	/**
	 * The default value of the '{@link #getRoomType() <em>Room Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected static final String ROOM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoomType() <em>Room Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRoomType()
	 * @generated
	 * @ordered
	 */
	protected String roomType = ROOM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getServices() <em>Services</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected String services = SERVICES_EDEFAULT;

	/**
	 * The default value of the '{@link #isPaid() <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PAID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaid() <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected boolean isPaid = IS_PAID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewClassesPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCheckInDate() {
		return checkInDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCheckInDate(String newCheckInDate) {
		String oldCheckInDate = checkInDate;
		checkInDate = newCheckInDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NewClassesPackage.BOOKING__CHECK_IN_DATE, oldCheckInDate,
					checkInDate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getCheckOutDate() {
		return checkOutDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCheckOutDate(String newCheckOutDate) {
		String oldCheckOutDate = checkOutDate;
		checkOutDate = newCheckOutDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NewClassesPackage.BOOKING__CHECK_OUT_DATE, oldCheckOutDate,
					checkOutDate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getConformationNum() {
		return conformationNum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setConformationNum(int newConformationNum) {
		int oldConformationNum = conformationNum;
		conformationNum = newConformationNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NewClassesPackage.BOOKING__CONFORMATION_NUM,
					oldConformationNum, conformationNum));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setCost(int newCost) {
		int oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NewClassesPackage.BOOKING__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReceiptCreator getReceiptCreator() {
		if (receiptCreator != null && receiptCreator.eIsProxy()) {
			InternalEObject oldReceiptCreator = (InternalEObject) receiptCreator;
			receiptCreator = (ReceiptCreator) eResolveProxy(oldReceiptCreator);
			if (receiptCreator != oldReceiptCreator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NewClassesPackage.BOOKING__RECEIPT_CREATOR,
							oldReceiptCreator, receiptCreator));
			}
		}
		return receiptCreator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ReceiptCreator basicGetReceiptCreator() {
		return receiptCreator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setReceiptCreator(ReceiptCreator newReceiptCreator) {
		ReceiptCreator oldReceiptCreator = receiptCreator;
		receiptCreator = newReceiptCreator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NewClassesPackage.BOOKING__RECEIPT_CREATOR,
					oldReceiptCreator, receiptCreator));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Database getDatabaseHandler() {
		if (databaseHandler != null && databaseHandler.eIsProxy()) {
			InternalEObject oldDatabaseHandler = (InternalEObject) databaseHandler;
			databaseHandler = (Database) eResolveProxy(oldDatabaseHandler);
			if (databaseHandler != oldDatabaseHandler) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							NewClassesPackage.BOOKING__DATABASE_HANDLER,
							oldDatabaseHandler, databaseHandler));
			}
		}
		return databaseHandler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Database basicGetDatabaseHandler() {
		return databaseHandler;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setDatabaseHandler(Database newDatabaseHandler) {
		Database oldDatabaseHandler = databaseHandler;
		databaseHandler = newDatabaseHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NewClassesPackage.BOOKING__DATABASE_HANDLER,
					oldDatabaseHandler, databaseHandler));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getRoomType() {
		return roomType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRoomType(String newRoomType) {
		String oldRoomType = roomType;
		roomType = newRoomType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NewClassesPackage.BOOKING__ROOM_TYPE, oldRoomType, roomType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getServices() {
		return services;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setServices(String newServices) {
		String oldServices = services;
		services = newServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NewClassesPackage.BOOKING__SERVICES, oldServices, services));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isPaid() {
		return isPaid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setIsPaid(boolean newIsPaid) {
		boolean oldIsPaid = isPaid;
		isPaid = newIsPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					NewClassesPackage.BOOKING__IS_PAID, oldIsPaid, isPaid));
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
	public boolean checkAvalibility(int roomType, String checkInDate,
			String checkOutDate) {
		boolean available = true;
		return available;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int calculateCost(String checkInDate, String checkOutDate, String roomType, String services) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		int A = 0;
		long B = 0;
		try {
			Date dateStart = simpleDateFormat.parse(checkInDate);
			Date dateEnd = simpleDateFormat.parse(checkOutDate);
			B = Math.round((dateEnd.getTime() - dateStart.getTime())
					/ (double) 86400000);
		} 
		catch (ParseException e) {
			System.out.println("Date exception in calculateCost");
			e.printStackTrace();
		}
		A = (int) B;
		int c = 0;
		PreparedStatement myStmt;
		DatabaseImpl db;
		ResultSet myRs = null;

		try {
			db = DatabaseImpl.class.newInstance();
			db.connect();
			myStmt = db.myConn
					.prepareStatement("select Price from " + roomType);
			myRs = myStmt.executeQuery();
			if (myRs.next()) {
				int C = myRs.getInt("Price");
				c = A * C;
			} else {
				System.out.println("could not get Price");
			}

			System.out.println("Cost for booking is " + c);

		} catch (SQLException | InstantiationException | IllegalAccessException x) {
			System.out.println("Error");
			x.printStackTrace();
		}
		return c;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean pay(String addedServices, int extraDays,
			String creditCardNum, String cvc, int month, int year,
			String firstName, String lastName, int bookingCost, boolean isPaid) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int calculateBill(String addedServices, int extraDays,
			int bookingCost, boolean isPaid) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	// @SuppressWarnings("null")
	public int createBooking(String roomType, String services,
			String checkInDate, String checkOutDate) {
		PreparedStatement myStmt;
		DatabaseImpl db;
		ResultSet myRs = null;
		int a = 0;
		try {
			db = DatabaseImpl.class.newInstance();
			db.connect();

			System.out.println("\nCreating booking...");
			this.setIsPaid(false);

			try {
				InformationValidatorImpl validator = InformationValidatorImpl.class
						.newInstance();
				boolean dates = validator.validateDates(checkInDate,
						checkOutDate);
				if (dates == true) {

					this.setCheckInDate(checkInDate);
					this.setCheckOutDate(checkOutDate);
					//this.cost = calculateCost(checkInDate, checkOutDate,roomType, services);
					a = this.generateConfirmNum();
					RoomHandlerImpl Handle = new RoomHandlerImpl();
					boolean Bool = Handle.checkAvalibility(roomType, checkInDate,checkOutDate);
					if(Bool == true){
					try {
						myStmt = db.myConn.prepareStatement("select * from "
								+ roomType);
						myRs = myStmt.executeQuery();
						
						if (myRs.next()) {
							myStmt = db.myConn.prepareStatement("insert into "+ roomType
									+ "(bNum, CheckIn, CheckOut)"
									+ "values(?,?,?)");

							myStmt.setInt(1, a);
							myStmt.setString(2, checkInDate);
							myStmt.setString(3, checkOutDate);
							myStmt.executeUpdate();
							
							myStmt = db.myConn
									.prepareStatement("insert into Rooms "
											+ "(bNum, CheckIn, CheckOut, RoomType)"
											+ "values (?,?,?,?)");
							myStmt.setInt(1, a);
							myStmt.setString(2, checkInDate);
							myStmt.setString(3, checkOutDate);
							myStmt.setString(4, roomType);
							myStmt.executeUpdate();
							System.out.println("Booking number updated for "
									+ roomType + " room");
							
						}
						else if (!myRs.next()){
							System.out.println("boo");
						}
						
						else {
							System.out.println("Empty String");
							
						}

					} catch (SQLException x) {
						System.out.println("Error bitch");
						x.printStackTrace();
					}
					}else{
						System.out.println("Room is not avaliable booking implemantation.......................................");
					}
					/*
					 * try { String filename = "conformations.txt"; FileWriter
					 * fw = new FileWriter(filename, true); fw.write(a + "\n");
					 * fw.close(); } catch (IOException ioe) {
					 * System.err.println("IOException: " + ioe.getMessage()); }
					 */

				} else {
					System.out.println("Booking failed");
				}
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return a;

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void cancelBooking(int conformationNum) {

		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		PreparedStatement myStmt;
		DatabaseImpl db = new DatabaseImpl();
		ResultSet myRs = null;

		try {
			db.connect();
			myStmt = db.myConn
					.prepareStatement("delete from Rooms where bNum =?");
			myStmt.setInt(1, conformationNum);
			myRs = myStmt.executeQuery();
			System.out.println("The Booking was deleted from the database");

		} catch (SQLException e) {
			System.out.println("The confirmation number was not found in database");
			
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void reBook(String roomType, int comformationNum,
			String serviceType, String checkInDate, String checkOutDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public int generateConfirmNum() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		Random random = new Random();
		int conformationNumber = random.nextInt((10000 - 1000) + 1) + 1000;
		return (conformationNumber);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean checkAvalibility(String service, String checkInDate,
			String checkOutDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean dateChecker(String checkInDate, String checkOutDate,
			String DBcheckIn, String DBcheckOut) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setAvalibility(String service, boolean status) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateEmail(String email) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePhoneNum(long phoneNum) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validatePersonalNum(long personalNum) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateNames(String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateAddress(String address, int zipCode, String city,
			String country) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateDates(String checkInDate, String checkOutDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean checkDateOrder(String checkInDate, String checkOutDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean checkAgeRestriction(long personalNum) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean validateConfirmationNum(int conformationNum) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int checkAge(int year, int day, int month) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean makePayment(String ccNumber, String ccv, int expiryMonth,
			int expiryYear, String firstName, String lastName, double sum) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isCreditCardValid(String ccNumber, String ccv,
			int expiryMonth, int expiryYear, String firstName, String lastName) {
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
		case NewClassesPackage.BOOKING__CHECK_IN_DATE:
			return getCheckInDate();
		case NewClassesPackage.BOOKING__CHECK_OUT_DATE:
			return getCheckOutDate();
		case NewClassesPackage.BOOKING__CONFORMATION_NUM:
			return getConformationNum();
		case NewClassesPackage.BOOKING__COST:
			return getCost();
		case NewClassesPackage.BOOKING__RECEIPT_CREATOR:
			if (resolve)
				return getReceiptCreator();
			return basicGetReceiptCreator();
		case NewClassesPackage.BOOKING__DATABASE_HANDLER:
			if (resolve)
				return getDatabaseHandler();
			return basicGetDatabaseHandler();
		case NewClassesPackage.BOOKING__ROOM_TYPE:
			return getRoomType();
		case NewClassesPackage.BOOKING__SERVICES:
			return getServices();
		case NewClassesPackage.BOOKING__IS_PAID:
			return isPaid();
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
		case NewClassesPackage.BOOKING__CHECK_IN_DATE:
			setCheckInDate((String) newValue);
			return;
		case NewClassesPackage.BOOKING__CHECK_OUT_DATE:
			setCheckOutDate((String) newValue);
			return;
		case NewClassesPackage.BOOKING__CONFORMATION_NUM:
			setConformationNum((Integer) newValue);
			return;
		case NewClassesPackage.BOOKING__COST:
			setCost((Integer) newValue);
			return;
		case NewClassesPackage.BOOKING__RECEIPT_CREATOR:
			setReceiptCreator((ReceiptCreator) newValue);
			return;
		case NewClassesPackage.BOOKING__DATABASE_HANDLER:
			setDatabaseHandler((Database) newValue);
			return;
		case NewClassesPackage.BOOKING__ROOM_TYPE:
			setRoomType((String) newValue);
			return;
		case NewClassesPackage.BOOKING__SERVICES:
			setServices((String) newValue);
			return;
		case NewClassesPackage.BOOKING__IS_PAID:
			setIsPaid((Boolean) newValue);
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
		case NewClassesPackage.BOOKING__CHECK_IN_DATE:
			setCheckInDate(CHECK_IN_DATE_EDEFAULT);
			return;
		case NewClassesPackage.BOOKING__CHECK_OUT_DATE:
			setCheckOutDate(CHECK_OUT_DATE_EDEFAULT);
			return;
		case NewClassesPackage.BOOKING__CONFORMATION_NUM:
			setConformationNum(CONFORMATION_NUM_EDEFAULT);
			return;
		case NewClassesPackage.BOOKING__COST:
			setCost(COST_EDEFAULT);
			return;
		case NewClassesPackage.BOOKING__RECEIPT_CREATOR:
			setReceiptCreator((ReceiptCreator) null);
			return;
		case NewClassesPackage.BOOKING__DATABASE_HANDLER:
			setDatabaseHandler((Database) null);
			return;
		case NewClassesPackage.BOOKING__ROOM_TYPE:
			setRoomType(ROOM_TYPE_EDEFAULT);
			return;
		case NewClassesPackage.BOOKING__SERVICES:
			setServices(SERVICES_EDEFAULT);
			return;
		case NewClassesPackage.BOOKING__IS_PAID:
			setIsPaid(IS_PAID_EDEFAULT);
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
		case NewClassesPackage.BOOKING__CHECK_IN_DATE:
			return CHECK_IN_DATE_EDEFAULT == null ? checkInDate != null
					: !CHECK_IN_DATE_EDEFAULT.equals(checkInDate);
		case NewClassesPackage.BOOKING__CHECK_OUT_DATE:
			return CHECK_OUT_DATE_EDEFAULT == null ? checkOutDate != null
					: !CHECK_OUT_DATE_EDEFAULT.equals(checkOutDate);
		case NewClassesPackage.BOOKING__CONFORMATION_NUM:
			return conformationNum != CONFORMATION_NUM_EDEFAULT;
		case NewClassesPackage.BOOKING__COST:
			return cost != COST_EDEFAULT;
		case NewClassesPackage.BOOKING__RECEIPT_CREATOR:
			return receiptCreator != null;
		case NewClassesPackage.BOOKING__DATABASE_HANDLER:
			return databaseHandler != null;
		case NewClassesPackage.BOOKING__ROOM_TYPE:
			return ROOM_TYPE_EDEFAULT == null ? roomType != null
					: !ROOM_TYPE_EDEFAULT.equals(roomType);
		case NewClassesPackage.BOOKING__SERVICES:
			return SERVICES_EDEFAULT == null ? services != null
					: !SERVICES_EDEFAULT.equals(services);
		case NewClassesPackage.BOOKING__IS_PAID:
			return isPaid != IS_PAID_EDEFAULT;
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
		if (baseClass == Biller.class) {
			switch (baseOperationID) {
			case NewClassesPackage.BILLER___CALCULATE_COST__STRING_STRING_STRING_STRING:
				return NewClassesPackage.BOOKING___CALCULATE_COST__STRING_STRING_STRING_STRING;
			case NewClassesPackage.BILLER___PAY__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT_BOOLEAN:
				return NewClassesPackage.BOOKING___PAY__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT_BOOLEAN;
			case NewClassesPackage.BILLER___CALCULATE_BILL__STRING_INT_INT_BOOLEAN:
				return NewClassesPackage.BOOKING___CALCULATE_BILL__STRING_INT_INT_BOOLEAN;
			default:
				return -1;
			}
		}
		if (baseClass == Booker.class) {
			switch (baseOperationID) {
			case NewClassesPackage.BOOKER___CREATE_BOOKING__STRING_STRING_STRING_STRING:
				return NewClassesPackage.BOOKING___CREATE_BOOKING__STRING_STRING_STRING_STRING;
			case NewClassesPackage.BOOKER___CANCEL_BOOKING__INT:
				return NewClassesPackage.BOOKING___CANCEL_BOOKING__INT;
			case NewClassesPackage.BOOKER___RE_BOOK__STRING_INT_STRING_STRING_STRING:
				return NewClassesPackage.BOOKING___RE_BOOK__STRING_INT_STRING_STRING_STRING;
			case NewClassesPackage.BOOKER___GENERATE_CONFIRM_NUM:
				return NewClassesPackage.BOOKING___GENERATE_CONFIRM_NUM;
			default:
				return -1;
			}
		}
		if (baseClass == ServiceProvider.class) {
			switch (baseOperationID) {
			case NewClassesPackage.SERVICE_PROVIDER___CHECK_AVALIBILITY__STRING_STRING_STRING:
				return NewClassesPackage.BOOKING___CHECK_AVALIBILITY__STRING_STRING_STRING_1;
			case NewClassesPackage.SERVICE_PROVIDER___SET_AVALIBILITY__STRING_BOOLEAN:
				return NewClassesPackage.BOOKING___SET_AVALIBILITY__STRING_BOOLEAN;
			default:
				return -1;
			}
		}
		if (baseClass == Validator.class) {
			switch (baseOperationID) {
			case NewClassesPackage.VALIDATOR___VALIDATE_EMAIL__STRING:
				return NewClassesPackage.BOOKING___VALIDATE_EMAIL__STRING;
			case NewClassesPackage.VALIDATOR___VALIDATE_PHONE_NUM__LONG:
				return NewClassesPackage.BOOKING___VALIDATE_PHONE_NUM__LONG;
			case NewClassesPackage.VALIDATOR___VALIDATE_PERSONAL_NUM__LONG:
				return NewClassesPackage.BOOKING___VALIDATE_PERSONAL_NUM__LONG;
			case NewClassesPackage.VALIDATOR___VALIDATE_NAMES__STRING_STRING:
				return NewClassesPackage.BOOKING___VALIDATE_NAMES__STRING_STRING;
			case NewClassesPackage.VALIDATOR___VALIDATE_ADDRESS__STRING_INT_STRING_STRING:
				return NewClassesPackage.BOOKING___VALIDATE_ADDRESS__STRING_INT_STRING_STRING;
			case NewClassesPackage.VALIDATOR___VALIDATE_DATES__STRING_STRING:
				return NewClassesPackage.BOOKING___VALIDATE_DATES__STRING_STRING;
			case NewClassesPackage.VALIDATOR___CHECK_DATE_ORDER__STRING_STRING:
				return NewClassesPackage.BOOKING___CHECK_DATE_ORDER__STRING_STRING;
			case NewClassesPackage.VALIDATOR___CHECK_AGE_RESTRICTION__LONG:
				return NewClassesPackage.BOOKING___CHECK_AGE_RESTRICTION__LONG;
			case NewClassesPackage.VALIDATOR___VALIDATE_CONFIRMATION_NUM__INT:
				return NewClassesPackage.BOOKING___VALIDATE_CONFIRMATION_NUM__INT;
			case NewClassesPackage.VALIDATOR___CHECK_AGE__INT_INT_INT:
				return NewClassesPackage.BOOKING___CHECK_AGE__INT_INT_INT;
			default:
				return -1;
			}
		}
		if (baseClass == CustomerProvides.class) {
			switch (baseOperationID) {
			case NewClassesPackage.CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE:
				return NewClassesPackage.BOOKING___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE;
			case NewClassesPackage.CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING:
				return NewClassesPackage.BOOKING___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING;
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
		case NewClassesPackage.BOOKING___SET_AVALIBILITY__STRING_BOOLEAN_STRING_STRING:
			setAvalibility((String) arguments.get(0),
					(Boolean) arguments.get(1), (String) arguments.get(2),
					(String) arguments.get(3));
			return null;
		case NewClassesPackage.BOOKING___CHECK_AVALIBILITY__STRING_STRING_STRING_1:
			return checkAvalibility((String) arguments.get(0),
					(String) arguments.get(1), (String) arguments.get(2));
		case NewClassesPackage.BOOKING___DATE_CHECKER__STRING_STRING_STRING_STRING:
			return dateChecker((String) arguments.get(0),
					(String) arguments.get(1), (String) arguments.get(2),
					(String) arguments.get(3));
		case NewClassesPackage.BOOKING___CALCULATE_COST__STRING_STRING_STRING_STRING:
			return calculateCost((String) arguments.get(0),
					(String) arguments.get(1), (String) arguments.get(2),
					(String) arguments.get(3));
		case NewClassesPackage.BOOKING___PAY__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT_BOOLEAN:
			return pay((String) arguments.get(0), (Integer) arguments.get(1),
					(String) arguments.get(2), (String) arguments.get(3),
					(Integer) arguments.get(4), (Integer) arguments.get(5),
					(String) arguments.get(6), (String) arguments.get(7),
					(Integer) arguments.get(8), (Boolean) arguments.get(9));
		case NewClassesPackage.BOOKING___CALCULATE_BILL__STRING_INT_INT_BOOLEAN:
			return calculateBill((String) arguments.get(0),
					(Integer) arguments.get(1), (Integer) arguments.get(2),
					(Boolean) arguments.get(3));
		case NewClassesPackage.BOOKING___CREATE_BOOKING__STRING_STRING_STRING_STRING:
			return createBooking((String) arguments.get(0),
					(String) arguments.get(1), (String) arguments.get(2),
					(String) arguments.get(3));
		case NewClassesPackage.BOOKING___CANCEL_BOOKING__INT:
			cancelBooking((Integer) arguments.get(0));
			return null;
		case NewClassesPackage.BOOKING___RE_BOOK__STRING_INT_STRING_STRING_STRING:
			reBook((String) arguments.get(0), (Integer) arguments.get(1),
					(String) arguments.get(2), (String) arguments.get(3),
					(String) arguments.get(4));
			return null;
		case NewClassesPackage.BOOKING___GENERATE_CONFIRM_NUM:
			return generateConfirmNum();
		case NewClassesPackage.BOOKING___SET_AVALIBILITY__STRING_BOOLEAN:
			setAvalibility((String) arguments.get(0),
					(Boolean) arguments.get(1));
			return null;
		case NewClassesPackage.BOOKING___VALIDATE_EMAIL__STRING:
			return validateEmail((String) arguments.get(0));
		case NewClassesPackage.BOOKING___VALIDATE_PHONE_NUM__LONG:
			return validatePhoneNum((Long) arguments.get(0));
		case NewClassesPackage.BOOKING___VALIDATE_PERSONAL_NUM__LONG:
			return validatePersonalNum((Long) arguments.get(0));
		case NewClassesPackage.BOOKING___VALIDATE_NAMES__STRING_STRING:
			return validateNames((String) arguments.get(0),
					(String) arguments.get(1));
		case NewClassesPackage.BOOKING___VALIDATE_ADDRESS__STRING_INT_STRING_STRING:
			return validateAddress((String) arguments.get(0),
					(Integer) arguments.get(1), (String) arguments.get(2),
					(String) arguments.get(3));
		case NewClassesPackage.BOOKING___VALIDATE_DATES__STRING_STRING:
			return validateDates((String) arguments.get(0),
					(String) arguments.get(1));
		case NewClassesPackage.BOOKING___CHECK_DATE_ORDER__STRING_STRING:
			return checkDateOrder((String) arguments.get(0),
					(String) arguments.get(1));
		case NewClassesPackage.BOOKING___CHECK_AGE_RESTRICTION__LONG:
			return checkAgeRestriction((Long) arguments.get(0));
		case NewClassesPackage.BOOKING___VALIDATE_CONFIRMATION_NUM__INT:
			return validateConfirmationNum((Integer) arguments.get(0));
		case NewClassesPackage.BOOKING___CHECK_AGE__INT_INT_INT:
			return checkAge((Integer) arguments.get(0),
					(Integer) arguments.get(1), (Integer) arguments.get(2));
		case NewClassesPackage.BOOKING___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE:
			return makePayment((String) arguments.get(0),
					(String) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3), (String) arguments.get(4),
					(String) arguments.get(5), (Double) arguments.get(6));
		case NewClassesPackage.BOOKING___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING:
			return isCreditCardValid((String) arguments.get(0),
					(String) arguments.get(1), (Integer) arguments.get(2),
					(Integer) arguments.get(3), (String) arguments.get(4),
					(String) arguments.get(5));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (checkInDate: ");
		result.append(checkInDate);
		result.append(", checkOutDate: ");
		result.append(checkOutDate);
		result.append(", conformationNum: ");
		result.append(conformationNum);
		result.append(", cost: ");
		result.append(cost);
		result.append(", roomType: ");
		result.append(roomType);
		result.append(", services: ");
		result.append(services);
		result.append(", isPaid: ");
		result.append(isPaid);
		result.append(')');
		return result.toString();
	}

} // BookingImpl
