/**
 */
package newClasses.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import newClasses.Guest;
import newClasses.GuestBiller;
import newClasses.GuestInterface;
import newClasses.NewClassesPackage;
import newClasses.impl.BillingImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import java.text.ParseException;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Guest</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link newClasses.impl.GuestImpl#getCheckInDate <em>Check In Date</em>}</li>
 *   <li>{@link newClasses.impl.GuestImpl#getCheckOutDate <em>Check Out Date</em>}</li>
 *   <li>{@link newClasses.impl.GuestImpl#getRoomNum <em>Room Num</em>}</li>
 *   <li>{@link newClasses.impl.GuestImpl#isCheckedIn <em>Checked In</em>}</li>
 *   <li>{@link newClasses.impl.GuestImpl#isCheckedOut <em>Checked Out</em>}</li>
 *   <li>{@link newClasses.impl.GuestImpl#getAddedServices <em>Added Services</em>}</li>
 *   <li>{@link newClasses.impl.GuestImpl#getExtraDays <em>Extra Days</em>}</li>
 *   <li>{@link newClasses.impl.GuestImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link newClasses.impl.GuestImpl#isBookingPaid <em>Booking Paid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuestImpl extends CustomerImpl implements Guest {
	/**
	 * The default value of the '{@link #getCheckInDate() <em>Check In Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCheckInDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_IN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckInDate() <em>Check In Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCheckInDate()
	 * @generated
	 * @ordered
	 */
	protected String checkInDate = CHECK_IN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCheckOutDate() <em>Check Out Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCheckOutDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CHECK_OUT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCheckOutDate() <em>Check Out Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCheckOutDate()
	 * @generated
	 * @ordered
	 */
	protected String checkOutDate = CHECK_OUT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRoomNum() <em>Room Num</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRoomNum()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOM_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRoomNum() <em>Room Num</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getRoomNum()
	 * @generated
	 * @ordered
	 */
	protected int roomNum = ROOM_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckedIn() <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_IN_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckedIn() <em>Checked In</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isCheckedIn()
	 * @generated
	 * @ordered
	 */
	protected boolean checkedIn = CHECKED_IN_EDEFAULT;

	/**
	 * The default value of the '{@link #isCheckedOut() <em>Checked Out</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isCheckedOut()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CHECKED_OUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCheckedOut() <em>Checked Out</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isCheckedOut()
	 * @generated
	 * @ordered
	 */
	protected boolean checkedOut = CHECKED_OUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddedServices() <em>Added Services</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAddedServices()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDED_SERVICES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddedServices() <em>Added Services</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAddedServices()
	 * @generated
	 * @ordered
	 */
	protected String addedServices = ADDED_SERVICES_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraDays() <em>Extra Days</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExtraDays()
	 * @generated
	 * @ordered
	 */
	protected static final int EXTRA_DAYS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExtraDays() <em>Extra Days</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getExtraDays()
	 * @generated
	 * @ordered
	 */
	protected int extraDays = EXTRA_DAYS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected int cost = COST_EDEFAULT;

	/**
	 * The default value of the '{@link #isBookingPaid() <em>Booking Paid</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isBookingPaid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOKING_PAID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBookingPaid() <em>Booking Paid</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isBookingPaid()
	 * @generated
	 * @ordered
	 */
	protected boolean bookingPaid = BOOKING_PAID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewClassesPackage.Literals.GUEST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckInDate() {
		return checkInDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckInDate(String newCheckInDate) {
		String oldCheckInDate = checkInDate;
		checkInDate = newCheckInDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.GUEST__CHECK_IN_DATE, oldCheckInDate, checkInDate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getCheckOutDate() {
		return checkOutDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckOutDate(String newCheckOutDate) {
		String oldCheckOutDate = checkOutDate;
		checkOutDate = newCheckOutDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.GUEST__CHECK_OUT_DATE, oldCheckOutDate, checkOutDate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomNum() {
		return roomNum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomNum(int newRoomNum) {
		int oldRoomNum = roomNum;
		roomNum = newRoomNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.GUEST__ROOM_NUM, oldRoomNum, roomNum));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedIn() {
		return checkedIn;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckedIn(boolean newCheckedIn) {
		boolean oldCheckedIn = checkedIn;
		checkedIn = newCheckedIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.GUEST__CHECKED_IN, oldCheckedIn, checkedIn));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCheckedOut() {
		return checkedOut;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCheckedOut(boolean newCheckedOut) {
		boolean oldCheckedOut = checkedOut;
		checkedOut = newCheckedOut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.GUEST__CHECKED_OUT, oldCheckedOut, checkedOut));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddedServices() {
		return addedServices;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddedServices(String newAddedServices) {
		String oldAddedServices = addedServices;
		addedServices = newAddedServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.GUEST__ADDED_SERVICES, oldAddedServices, addedServices));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getExtraDays() {
		return extraDays;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraDays(int newExtraDays) {
		int oldExtraDays = extraDays;
		extraDays = newExtraDays;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.GUEST__EXTRA_DAYS, oldExtraDays, extraDays));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(int newCost) {
		int oldCost = cost;
		cost = newCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.GUEST__COST, oldCost, cost));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBookingPaid() {
		return bookingPaid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingPaid(boolean newBookingPaid) {
		boolean oldBookingPaid = bookingPaid;
		bookingPaid = newBookingPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.GUEST__BOOKING_PAID, oldBookingPaid, bookingPaid));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int addServiceToBill(Object guest, String type) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean checkOut(String checkOutDate, int roomNum, String creditCardNum, String cvc, int month, int year, String firstName, String lastName, int cost) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT

		System.out.println("\nChecking out guest...");
		boolean checkedOut = false;
		boolean valid = false;

		if (this.checkedIn == true && roomNum == this.roomNum) {

			try {

				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				Date today = sdf.parse(sdf.format(new Date()));
				Date checkOut = sdf.parse(checkOutDate);
				Calendar cal = Calendar.getInstance();
				System.out.println(cal.getTime());

				if (sdf.format(today).equals(checkOutDate)) {
					System.out.println("Check-out date is correct");
					System.out.println(today);
					valid = true;
				} else if (today.after(checkOut)) {
					System.out
							.println("Invalid check-out date. Impossible to check out before checking in");
					valid = false;
				} else {
					int days = 0;
					Date current = today;

					while (current.before(checkOut)) {
						cal.add(Calendar.DAY_OF_MONTH, +1);
						current = cal.getTime();
						days++;
					}
					System.out
							.println("Check-out date for this booking is not until "
									+ days
									+ " days from now. You will still be charged for the booked days.");
					valid = true;
				}
				if (valid == true) {

					if (this.addedServices == "" && this.extraDays == 0
							&& this.bookingPaid == true) {
						System.out
								.println("Bill was paid at booking and no extra costs were added");
						checkedOut = true;
					} else {
						try {
							// Missing set availability of room
							BillingImpl bill = BillingImpl.class.newInstance();
							boolean paid = bill.pay(this.addedServices,
									this.extraDays, creditCardNum, cvc, month,
									year, firstName, lastName, cost,
									this.bookingPaid);
							if (paid == true) {
								checkedOut = true;
							} else {
								System.out.println("Check-out error!");
							}

						} catch (InstantiationException e) {
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						}
					}
				}

			} catch (ParseException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Check out is not possible without checking in");
		}
		return checkedOut;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @author Ale Lotstršm
	 */
	public boolean checkOut(String checkOutDate, int roomNum,
			String creditCardNum, String cvc, int month, int year,
			String firstName, String lastName) {
		System.out.println("\nChecking out guest...");
		boolean checkedOut = false;
		boolean valid = false;

		if (this.checkedIn == true && roomNum == this.roomNum) {

			try {

				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				Date today = sdf.parse(sdf.format(new Date()));
				Date checkOut = sdf.parse(checkOutDate);
				Calendar cal = Calendar.getInstance();
				System.out.println(cal.getTime());

				if (sdf.format(today).equals(checkOutDate)) {
					System.out.println("Check-out date is correct");
					System.out.println(today);
					valid = true;
				} else if (today.after(checkOut)) {
					System.out
							.println("Invalid check-out date. Impossible to check out before checking in");
					valid = false;
				} else {
					int days = 0;
					Date current = today;

					while (current.before(checkOut)) {
						cal.add(Calendar.DAY_OF_MONTH, +1);
						current = cal.getTime();
						days++;
					}
					System.out
							.println("Check-out date for this booking is not until "
									+ days
									+ " days from now. You will still be charged for the booked days.");
					valid = true;
				}
				if (valid == true) {

					if (this.addedServices == "" && this.extraDays == 0
							&& this.bookingPaid == true) {
						System.out
								.println("Bill was paid at booking and no extra costs were added");
						checkedOut = true;
					} else {
						try {
							// Missing set availability of room
							BillingImpl bill = BillingImpl.class.newInstance();
							boolean paid = bill.pay(this.addedServices,
									this.extraDays, creditCardNum, cvc, month,
									year, firstName, lastName, cost,
									this.bookingPaid);
							if (paid == true) {
								checkedOut = true;
							} else {
								System.out.println("Check-out error!");
							}

						} catch (InstantiationException e) {
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						}
					}
				}

			} catch (ParseException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Check out is not possible without checking in");
		}
		return checkedOut;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @throws
	 * @generated NOT
	 * @author Ale Lotstršm
	 * @throws
	 */
	@SuppressWarnings("resource")
	public int checkIn(int conformationNum, String checkInDate) {

		System.out.println("\nChecking in... booking number: "
				+ conformationNum);
		int valid = 0;
		InformationValidatorImpl IV = new InformationValidatorImpl();

		if (IV.validateConfirmationNum(conformationNum)) {
			// Not secure at all.
			System.out.println("Booking found for: " + this.getFirstName()
					+ " " + this.getLastName());
			try {
				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				Date today = sdf.parse(sdf.format(new Date()));

				if (sdf.format(today).equals(checkInDate)) {
					PreparedStatement myStmt;
					DatabaseImpl db;
					ResultSet myRs = null;
					db = DatabaseImpl.class.newInstance();
					db.connect();
					System.out.println("Check-in date matches todays date");
					System.out.println(today);
					// Has to retrieve room number and return that instead of
					// valid
					myStmt = db.myConn
							.prepareStatement("select RoomType from Rooms where bNum=?");
					myStmt.setInt(1, conformationNum);
					myRs = myStmt.executeQuery();

					if (myRs.next()) {
						if (myRs.getString("RoomType").equalsIgnoreCase("Regular")) {
							Random random = new Random();
							int roomNum = random.nextInt((5 - 1) + 1) + 1;
							myStmt = db.myConn
									.prepareStatement("insert into Regular "
											+ "(RoomNum) value(?)");
							myStmt.setInt(1,roomNum);
							myStmt.executeUpdate();
							return roomNum;
							
						} else if (myRs.getString("RoomType").equalsIgnoreCase("Economy")) {
							Random random = new Random();
							int roomNum = random.nextInt((10 - 6) + 1) + 6;
							myStmt = db.myConn
									.prepareStatement("insert into economy"
											+ "(RoomNum)" + "value(?)");
							myStmt.setInt(1,roomNum);
							myStmt.executeUpdate();
							System.out.println();
							return roomNum;
							
						} else if (myRs.getString("RoomType").equalsIgnoreCase("family")) {
							Random random = new Random();
							int roomNum = random.nextInt((15 - 11) + 1) + 11;
							myStmt = db.myConn
									.prepareStatement("insert into family"
											+ "(RoomNum)" + "value(?)");
							myStmt.setInt(1,roomNum);
							myStmt.executeUpdate();
							return roomNum;
							
						} else if (myRs.getString("RoomType").equalsIgnoreCase("lux")) {
							Random random = new Random();
							int roomNum = random.nextInt((20 - 16) + 1) + 16;
							myStmt = db.myConn
									.prepareStatement("insert into lux"
											+ "(RoomNum)" + "value(?)");
							myStmt.setInt(1,roomNum);
							myStmt.executeUpdate();
							return roomNum;
						}

						else {
							System.out
									.println("");
						}
					} else {
						System.out.println("Breaking");
					}

				} else {
					System.out.println("Wrong date!");
					System.out.println("Check-in date for this booking is "
							+ checkInDate);
				}
			} catch (ParseException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out
					.println("No booking has been made for that confirmation number.");
		}

		return valid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRoom(Object guest, int roomNum, String newRoomType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewClassesPackage.GUEST__CHECK_IN_DATE:
				return getCheckInDate();
			case NewClassesPackage.GUEST__CHECK_OUT_DATE:
				return getCheckOutDate();
			case NewClassesPackage.GUEST__ROOM_NUM:
				return getRoomNum();
			case NewClassesPackage.GUEST__CHECKED_IN:
				return isCheckedIn();
			case NewClassesPackage.GUEST__CHECKED_OUT:
				return isCheckedOut();
			case NewClassesPackage.GUEST__ADDED_SERVICES:
				return getAddedServices();
			case NewClassesPackage.GUEST__EXTRA_DAYS:
				return getExtraDays();
			case NewClassesPackage.GUEST__COST:
				return getCost();
			case NewClassesPackage.GUEST__BOOKING_PAID:
				return isBookingPaid();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case NewClassesPackage.GUEST__CHECK_IN_DATE:
				setCheckInDate((String)newValue);
				return;
			case NewClassesPackage.GUEST__CHECK_OUT_DATE:
				setCheckOutDate((String)newValue);
				return;
			case NewClassesPackage.GUEST__ROOM_NUM:
				setRoomNum((Integer)newValue);
				return;
			case NewClassesPackage.GUEST__CHECKED_IN:
				setCheckedIn((Boolean)newValue);
				return;
			case NewClassesPackage.GUEST__CHECKED_OUT:
				setCheckedOut((Boolean)newValue);
				return;
			case NewClassesPackage.GUEST__ADDED_SERVICES:
				setAddedServices((String)newValue);
				return;
			case NewClassesPackage.GUEST__EXTRA_DAYS:
				setExtraDays((Integer)newValue);
				return;
			case NewClassesPackage.GUEST__COST:
				setCost((Integer)newValue);
				return;
			case NewClassesPackage.GUEST__BOOKING_PAID:
				setBookingPaid((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case NewClassesPackage.GUEST__CHECK_IN_DATE:
				setCheckInDate(CHECK_IN_DATE_EDEFAULT);
				return;
			case NewClassesPackage.GUEST__CHECK_OUT_DATE:
				setCheckOutDate(CHECK_OUT_DATE_EDEFAULT);
				return;
			case NewClassesPackage.GUEST__ROOM_NUM:
				setRoomNum(ROOM_NUM_EDEFAULT);
				return;
			case NewClassesPackage.GUEST__CHECKED_IN:
				setCheckedIn(CHECKED_IN_EDEFAULT);
				return;
			case NewClassesPackage.GUEST__CHECKED_OUT:
				setCheckedOut(CHECKED_OUT_EDEFAULT);
				return;
			case NewClassesPackage.GUEST__ADDED_SERVICES:
				setAddedServices(ADDED_SERVICES_EDEFAULT);
				return;
			case NewClassesPackage.GUEST__EXTRA_DAYS:
				setExtraDays(EXTRA_DAYS_EDEFAULT);
				return;
			case NewClassesPackage.GUEST__COST:
				setCost(COST_EDEFAULT);
				return;
			case NewClassesPackage.GUEST__BOOKING_PAID:
				setBookingPaid(BOOKING_PAID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case NewClassesPackage.GUEST__CHECK_IN_DATE:
				return CHECK_IN_DATE_EDEFAULT == null ? checkInDate != null : !CHECK_IN_DATE_EDEFAULT.equals(checkInDate);
			case NewClassesPackage.GUEST__CHECK_OUT_DATE:
				return CHECK_OUT_DATE_EDEFAULT == null ? checkOutDate != null : !CHECK_OUT_DATE_EDEFAULT.equals(checkOutDate);
			case NewClassesPackage.GUEST__ROOM_NUM:
				return roomNum != ROOM_NUM_EDEFAULT;
			case NewClassesPackage.GUEST__CHECKED_IN:
				return checkedIn != CHECKED_IN_EDEFAULT;
			case NewClassesPackage.GUEST__CHECKED_OUT:
				return checkedOut != CHECKED_OUT_EDEFAULT;
			case NewClassesPackage.GUEST__ADDED_SERVICES:
				return ADDED_SERVICES_EDEFAULT == null ? addedServices != null : !ADDED_SERVICES_EDEFAULT.equals(addedServices);
			case NewClassesPackage.GUEST__EXTRA_DAYS:
				return extraDays != EXTRA_DAYS_EDEFAULT;
			case NewClassesPackage.GUEST__COST:
				return cost != COST_EDEFAULT;
			case NewClassesPackage.GUEST__BOOKING_PAID:
				return bookingPaid != BOOKING_PAID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == GuestBiller.class) {
			switch (baseOperationID) {
				case NewClassesPackage.GUEST_BILLER___ADD_SERVICE_TO_BILL__OBJECT_STRING: return NewClassesPackage.GUEST___ADD_SERVICE_TO_BILL__OBJECT_STRING;
				case NewClassesPackage.GUEST_BILLER___CHECK_OUT__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT: return NewClassesPackage.GUEST___CHECK_OUT__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT;
				default: return -1;
			}
		}
		if (baseClass == GuestInterface.class) {
			switch (baseOperationID) {
				case NewClassesPackage.GUEST_INTERFACE___EXTEND_STAY__OBJECT_INT_STRING: return NewClassesPackage.GUEST___EXTEND_STAY__OBJECT_INT_STRING;
				case NewClassesPackage.GUEST_INTERFACE___CHECK_IN__INT_STRING: return NewClassesPackage.GUEST___CHECK_IN__INT_STRING;
				case NewClassesPackage.GUEST_INTERFACE___CHANGE_ROOM__OBJECT_INT_STRING: return NewClassesPackage.GUEST___CHANGE_ROOM__OBJECT_INT_STRING;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case NewClassesPackage.GUEST___ADD_SERVICE_TO_BILL__OBJECT_STRING:
				return addServiceToBill(arguments.get(0), (String)arguments.get(1));
			case NewClassesPackage.GUEST___CHECK_OUT__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT:
				return checkOut((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7), (Integer)arguments.get(8));
			case NewClassesPackage.GUEST___EXTEND_STAY__OBJECT_INT_STRING:
				extendStay(arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2));
				return null;
			case NewClassesPackage.GUEST___CHECK_IN__INT_STRING:
				return checkIn((Integer)arguments.get(0), (String)arguments.get(1));
			case NewClassesPackage.GUEST___CHANGE_ROOM__OBJECT_INT_STRING:
				changeRoom(arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (checkInDate: ");
		result.append(checkInDate);
		result.append(", checkOutDate: ");
		result.append(checkOutDate);
		result.append(", roomNum: ");
		result.append(roomNum);
		result.append(", checkedIn: ");
		result.append(checkedIn);
		result.append(", checkedOut: ");
		result.append(checkedOut);
		result.append(", addedServices: ");
		result.append(addedServices);
		result.append(", extraDays: ");
		result.append(extraDays);
		result.append(", cost: ");
		result.append(cost);
		result.append(", bookingPaid: ");
		result.append(bookingPaid);
		result.append(')');
		return result.toString();
	}

} // GuestImpl
