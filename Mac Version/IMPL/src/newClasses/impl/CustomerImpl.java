/**
 */
package newClasses.impl;

import java.lang.reflect.InvocationTargetException;

import newClasses.Booking;
import newClasses.CreditCard;
import newClasses.Customer;
import newClasses.NewClassesPackage;
import newClasses.impl.BookingImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link newClasses.impl.CustomerImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link newClasses.impl.CustomerImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link newClasses.impl.CustomerImpl#getPersonalNum <em>Personal Num</em>}</li>
 *   <li>{@link newClasses.impl.CustomerImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link newClasses.impl.CustomerImpl#getZipCode <em>Zip Code</em>}</li>
 *   <li>{@link newClasses.impl.CustomerImpl#getCity <em>City</em>}</li>
 *   <li>{@link newClasses.impl.CustomerImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link newClasses.impl.CustomerImpl#getPhoneNum <em>Phone Num</em>}</li>
 *   <li>{@link newClasses.impl.CustomerImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link newClasses.impl.CustomerImpl#getBooking <em>Booking</em>}</li>
 *   <li>{@link newClasses.impl.CustomerImpl#getBookingNum <em>Booking Num</em>}</li>
 *   <li>{@link newClasses.impl.CustomerImpl#getCreditCard <em>Credit Card</em>}</li>
 *   <li>{@link newClasses.impl.CustomerImpl#getBookingCost <em>Booking Cost</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CustomerImpl extends MinimalEObjectImpl.Container implements Customer {
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersonalNum() <em>Personal Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalNum()
	 * @generated
	 * @ordered
	 */
	protected static final long PERSONAL_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPersonalNum() <em>Personal Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalNum()
	 * @generated
	 * @ordered
	 */
	protected long personalNum = PERSONAL_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getZipCode() <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipCode()
	 * @generated
	 * @ordered
	 */
	protected static final int ZIP_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getZipCode() <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipCode()
	 * @generated
	 * @ordered
	 */
	protected int zipCode = ZIP_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhoneNum() <em>Phone Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNum()
	 * @generated
	 * @ordered
	 */
	protected static final long PHONE_NUM_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPhoneNum() <em>Phone Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNum()
	 * @generated
	 * @ordered
	 */
	protected long phoneNum = PHONE_NUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected Booking booking;

	/**
	 * The default value of the '{@link #getBookingNum() <em>Booking Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingNum()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_NUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingNum() <em>Booking Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingNum()
	 * @generated
	 * @ordered
	 */
	protected int bookingNum = BOOKING_NUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreditCard() <em>Credit Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCard()
	 * @generated
	 * @ordered
	 */
	protected CreditCard creditCard;

	/**
	 * The default value of the '{@link #getBookingCost() <em>Booking Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingCost()
	 * @generated
	 * @ordered
	 */
	protected static final int BOOKING_COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBookingCost() <em>Booking Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingCost()
	 * @generated
	 * @ordered
	 */
	protected int bookingCost = BOOKING_COST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewClassesPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CUSTOMER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CUSTOMER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPersonalNum() {
		return personalNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonalNum(long newPersonalNum) {
		long oldPersonalNum = personalNum;
		personalNum = newPersonalNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CUSTOMER__PERSONAL_NUM, oldPersonalNum, personalNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CUSTOMER__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getZipCode() {
		return zipCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZipCode(int newZipCode) {
		int oldZipCode = zipCode;
		zipCode = newZipCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CUSTOMER__ZIP_CODE, oldZipCode, zipCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CUSTOMER__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CUSTOMER__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPhoneNum() {
		return phoneNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNum(long newPhoneNum) {
		long oldPhoneNum = phoneNum;
		phoneNum = newPhoneNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CUSTOMER__PHONE_NUM, oldPhoneNum, phoneNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CUSTOMER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking getBooking() {
		if (booking != null && booking.eIsProxy()) {
			InternalEObject oldBooking = (InternalEObject)booking;
			booking = (Booking)eResolveProxy(oldBooking);
			if (booking != oldBooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NewClassesPackage.CUSTOMER__BOOKING, oldBooking, booking));
			}
		}
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking basicGetBooking() {
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooking(Booking newBooking) {
		Booking oldBooking = booking;
		booking = newBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CUSTOMER__BOOKING, oldBooking, booking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBookingNum() {
		return bookingNum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingNum(int newBookingNum) {
		int oldBookingNum = bookingNum;
		bookingNum = newBookingNum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CUSTOMER__BOOKING_NUM, oldBookingNum, bookingNum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard getCreditCard() {
		if (creditCard != null && creditCard.eIsProxy()) {
			InternalEObject oldCreditCard = (InternalEObject)creditCard;
			creditCard = (CreditCard)eResolveProxy(oldCreditCard);
			if (creditCard != oldCreditCard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NewClassesPackage.CUSTOMER__CREDIT_CARD, oldCreditCard, creditCard));
			}
		}
		return creditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard basicGetCreditCard() {
		return creditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCard(CreditCard newCreditCard) {
		CreditCard oldCreditCard = creditCard;
		creditCard = newCreditCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CUSTOMER__CREDIT_CARD, oldCreditCard, creditCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBookingCost() {
		return bookingCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingCost(int newBookingCost) {
		int oldBookingCost = bookingCost;
		bookingCost = newBookingCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CUSTOMER__BOOKING_COST, oldBookingCost, bookingCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 * @author Ale Lotstršm
	 */
	public int createBooking(String roomType, String services, String checkInDate, String checkOutDate) {
		//Initialises Booking
				int num = 0;
				try {
					BookingImpl booking = BookingImpl.class.newInstance();
					num = booking.createBooking(roomType, services, checkInDate, checkOutDate);
					if(num > 0) {
						this.bookingCost = booking.calculateCost(checkInDate, checkOutDate, roomType, services );
					} else {
						System.out.println("");
					}
					
					
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			
			return num;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBooking(int conformationNum) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reBook(String roomType, int comformationNum, String serviceType, String checkInDate, String checkOutDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int generateConfirmNum() {
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
			case NewClassesPackage.CUSTOMER__FIRST_NAME:
				return getFirstName();
			case NewClassesPackage.CUSTOMER__LAST_NAME:
				return getLastName();
			case NewClassesPackage.CUSTOMER__PERSONAL_NUM:
				return getPersonalNum();
			case NewClassesPackage.CUSTOMER__ADDRESS:
				return getAddress();
			case NewClassesPackage.CUSTOMER__ZIP_CODE:
				return getZipCode();
			case NewClassesPackage.CUSTOMER__CITY:
				return getCity();
			case NewClassesPackage.CUSTOMER__COUNTRY:
				return getCountry();
			case NewClassesPackage.CUSTOMER__PHONE_NUM:
				return getPhoneNum();
			case NewClassesPackage.CUSTOMER__EMAIL:
				return getEmail();
			case NewClassesPackage.CUSTOMER__BOOKING:
				if (resolve) return getBooking();
				return basicGetBooking();
			case NewClassesPackage.CUSTOMER__BOOKING_NUM:
				return getBookingNum();
			case NewClassesPackage.CUSTOMER__CREDIT_CARD:
				if (resolve) return getCreditCard();
				return basicGetCreditCard();
			case NewClassesPackage.CUSTOMER__BOOKING_COST:
				return getBookingCost();
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
			case NewClassesPackage.CUSTOMER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case NewClassesPackage.CUSTOMER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case NewClassesPackage.CUSTOMER__PERSONAL_NUM:
				setPersonalNum((Long)newValue);
				return;
			case NewClassesPackage.CUSTOMER__ADDRESS:
				setAddress((String)newValue);
				return;
			case NewClassesPackage.CUSTOMER__ZIP_CODE:
				setZipCode((Integer)newValue);
				return;
			case NewClassesPackage.CUSTOMER__CITY:
				setCity((String)newValue);
				return;
			case NewClassesPackage.CUSTOMER__COUNTRY:
				setCountry((String)newValue);
				return;
			case NewClassesPackage.CUSTOMER__PHONE_NUM:
				setPhoneNum((Long)newValue);
				return;
			case NewClassesPackage.CUSTOMER__EMAIL:
				setEmail((String)newValue);
				return;
			case NewClassesPackage.CUSTOMER__BOOKING:
				setBooking((Booking)newValue);
				return;
			case NewClassesPackage.CUSTOMER__BOOKING_NUM:
				setBookingNum((Integer)newValue);
				return;
			case NewClassesPackage.CUSTOMER__CREDIT_CARD:
				setCreditCard((CreditCard)newValue);
				return;
			case NewClassesPackage.CUSTOMER__BOOKING_COST:
				setBookingCost((Integer)newValue);
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
			case NewClassesPackage.CUSTOMER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case NewClassesPackage.CUSTOMER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case NewClassesPackage.CUSTOMER__PERSONAL_NUM:
				setPersonalNum(PERSONAL_NUM_EDEFAULT);
				return;
			case NewClassesPackage.CUSTOMER__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
				return;
			case NewClassesPackage.CUSTOMER__ZIP_CODE:
				setZipCode(ZIP_CODE_EDEFAULT);
				return;
			case NewClassesPackage.CUSTOMER__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case NewClassesPackage.CUSTOMER__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case NewClassesPackage.CUSTOMER__PHONE_NUM:
				setPhoneNum(PHONE_NUM_EDEFAULT);
				return;
			case NewClassesPackage.CUSTOMER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case NewClassesPackage.CUSTOMER__BOOKING:
				setBooking((Booking)null);
				return;
			case NewClassesPackage.CUSTOMER__BOOKING_NUM:
				setBookingNum(BOOKING_NUM_EDEFAULT);
				return;
			case NewClassesPackage.CUSTOMER__CREDIT_CARD:
				setCreditCard((CreditCard)null);
				return;
			case NewClassesPackage.CUSTOMER__BOOKING_COST:
				setBookingCost(BOOKING_COST_EDEFAULT);
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
			case NewClassesPackage.CUSTOMER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case NewClassesPackage.CUSTOMER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case NewClassesPackage.CUSTOMER__PERSONAL_NUM:
				return personalNum != PERSONAL_NUM_EDEFAULT;
			case NewClassesPackage.CUSTOMER__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
			case NewClassesPackage.CUSTOMER__ZIP_CODE:
				return zipCode != ZIP_CODE_EDEFAULT;
			case NewClassesPackage.CUSTOMER__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case NewClassesPackage.CUSTOMER__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case NewClassesPackage.CUSTOMER__PHONE_NUM:
				return phoneNum != PHONE_NUM_EDEFAULT;
			case NewClassesPackage.CUSTOMER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case NewClassesPackage.CUSTOMER__BOOKING:
				return booking != null;
			case NewClassesPackage.CUSTOMER__BOOKING_NUM:
				return bookingNum != BOOKING_NUM_EDEFAULT;
			case NewClassesPackage.CUSTOMER__CREDIT_CARD:
				return creditCard != null;
			case NewClassesPackage.CUSTOMER__BOOKING_COST:
				return bookingCost != BOOKING_COST_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NewClassesPackage.CUSTOMER___CREATE_BOOKING__STRING_STRING_STRING_STRING:
				return createBooking((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case NewClassesPackage.CUSTOMER___CANCEL_BOOKING__INT:
				cancelBooking((Integer)arguments.get(0));
				return null;
			case NewClassesPackage.CUSTOMER___RE_BOOK__STRING_INT_STRING_STRING_STRING:
				reBook((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
				return null;
			case NewClassesPackage.CUSTOMER___GENERATE_CONFIRM_NUM:
				return generateConfirmNum();
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
		result.append(" (firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", personalNum: ");
		result.append(personalNum);
		result.append(", address: ");
		result.append(address);
		result.append(", zipCode: ");
		result.append(zipCode);
		result.append(", city: ");
		result.append(city);
		result.append(", country: ");
		result.append(country);
		result.append(", phoneNum: ");
		result.append(phoneNum);
		result.append(", email: ");
		result.append(email);
		result.append(", bookingNum: ");
		result.append(bookingNum);
		result.append(", bookingCost: ");
		result.append(bookingCost);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
