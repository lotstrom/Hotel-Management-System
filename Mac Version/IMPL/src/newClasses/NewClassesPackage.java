/**
 */
package newClasses;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see newClasses.NewClassesFactory
 * @model kind="package"
 * @generated
 */
public interface NewClassesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "newClasses";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///newClasses.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "newClasses";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	NewClassesPackage eINSTANCE = newClasses.impl.NewClassesPackageImpl.init();

	/**
	 * The meta object id for the '{@link newClasses.Booker <em>Booker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.Booker
	 * @see newClasses.impl.NewClassesPackageImpl#getBooker()
	 * @generated
	 */
	int BOOKER = 8;

	/**
	 * The number of structural features of the '<em>Booker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKER___CREATE_BOOKING__STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKER___CANCEL_BOOKING__INT = 1;

	/**
	 * The operation id for the '<em>Re Book</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKER___RE_BOOK__STRING_INT_STRING_STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Generate Confirm Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKER___GENERATE_CONFIRM_NUM = 3;

	/**
	 * The number of operations of the '<em>Booker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link newClasses.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.CustomerImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRST_NAME = BOOKER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LAST_NAME = BOOKER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Personal Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PERSONAL_NUM = BOOKER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ADDRESS = BOOKER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ZIP_CODE = BOOKER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CITY = BOOKER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__COUNTRY = BOOKER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Phone Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE_NUM = BOOKER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = BOOKER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BOOKING = BOOKER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Booking Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BOOKING_NUM = BOOKER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Credit Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__CREDIT_CARD = BOOKER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Booking Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BOOKING_COST = BOOKER_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = BOOKER_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___CREATE_BOOKING__STRING_STRING_STRING_STRING = BOOKER___CREATE_BOOKING__STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___CANCEL_BOOKING__INT = BOOKER___CANCEL_BOOKING__INT;

	/**
	 * The operation id for the '<em>Re Book</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___RE_BOOK__STRING_INT_STRING_STRING_STRING = BOOKER___RE_BOOK__STRING_INT_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Generate Confirm Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___GENERATE_CONFIRM_NUM = BOOKER___GENERATE_CONFIRM_NUM;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = BOOKER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link newClasses.RoomProvider <em>Room Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.RoomProvider
	 * @see newClasses.impl.NewClassesPackageImpl#getRoomProvider()
	 * @generated
	 */
	int ROOM_PROVIDER = 6;

	/**
	 * The number of structural features of the '<em>Room Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Set Avalibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_PROVIDER___SET_AVALIBILITY__STRING_BOOLEAN_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Check Avalibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_PROVIDER___CHECK_AVALIBILITY__STRING_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Date Checker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_PROVIDER___DATE_CHECKER__STRING_STRING_STRING_STRING = 2;

	/**
	 * The number of operations of the '<em>Room Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_PROVIDER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link newClasses.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.BookingImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 1;

	/**
	 * The feature id for the '<em><b>Check In Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECK_IN_DATE = ROOM_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CHECK_OUT_DATE = ROOM_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Conformation Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CONFORMATION_NUM = ROOM_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__COST = ROOM_PROVIDER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Receipt Creator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__RECEIPT_CREATOR = ROOM_PROVIDER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Database Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__DATABASE_HANDLER = ROOM_PROVIDER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Room Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ROOM_TYPE = ROOM_PROVIDER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__SERVICES = ROOM_PROVIDER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__IS_PAID = ROOM_PROVIDER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = ROOM_PROVIDER_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Set Avalibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___SET_AVALIBILITY__STRING_BOOLEAN_STRING_STRING = ROOM_PROVIDER___SET_AVALIBILITY__STRING_BOOLEAN_STRING_STRING;

	/**
	 * The operation id for the '<em>Check Avalibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHECK_AVALIBILITY__STRING_STRING_STRING = ROOM_PROVIDER___CHECK_AVALIBILITY__STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Date Checker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___DATE_CHECKER__STRING_STRING_STRING_STRING = ROOM_PROVIDER___DATE_CHECKER__STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Calculate Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CALCULATE_COST__STRING_STRING_STRING_STRING = ROOM_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___PAY__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT_BOOLEAN = ROOM_PROVIDER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculate Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CALCULATE_BILL__STRING_INT_INT_BOOLEAN = ROOM_PROVIDER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CREATE_BOOKING__STRING_STRING_STRING_STRING = ROOM_PROVIDER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CANCEL_BOOKING__INT = ROOM_PROVIDER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Re Book</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___RE_BOOK__STRING_INT_STRING_STRING_STRING = ROOM_PROVIDER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Generate Confirm Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GENERATE_CONFIRM_NUM = ROOM_PROVIDER_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Check Avalibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHECK_AVALIBILITY__STRING_STRING_STRING_1 = ROOM_PROVIDER_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Set Avalibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___SET_AVALIBILITY__STRING_BOOLEAN = ROOM_PROVIDER_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Validate Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___VALIDATE_EMAIL__STRING = ROOM_PROVIDER_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Validate Phone Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___VALIDATE_PHONE_NUM__LONG = ROOM_PROVIDER_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Validate Personal Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___VALIDATE_PERSONAL_NUM__LONG = ROOM_PROVIDER_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Validate Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___VALIDATE_NAMES__STRING_STRING = ROOM_PROVIDER_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Validate Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___VALIDATE_ADDRESS__STRING_INT_STRING_STRING = ROOM_PROVIDER_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Validate Dates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___VALIDATE_DATES__STRING_STRING = ROOM_PROVIDER_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Check Date Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHECK_DATE_ORDER__STRING_STRING = ROOM_PROVIDER_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Check Age Restriction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHECK_AGE_RESTRICTION__LONG = ROOM_PROVIDER_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Validate Confirmation Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___VALIDATE_CONFIRMATION_NUM__INT = ROOM_PROVIDER_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Check Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CHECK_AGE__INT_INT_INT = ROOM_PROVIDER_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = ROOM_PROVIDER_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Is Credit Card Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = ROOM_PROVIDER_OPERATION_COUNT + 20;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = ROOM_PROVIDER_OPERATION_COUNT + 21;

	/**
	 * The meta object id for the '{@link newClasses.Receipt <em>Receipt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.Receipt
	 * @see newClasses.impl.NewClassesPackageImpl#getReceipt()
	 * @generated
	 */
	int RECEIPT = 3;

	/**
	 * The number of structural features of the '<em>Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Guest Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT___CREATE_GUEST_RECEIPT__OBJECT_OBJECT_INT = 0;

	/**
	 * The operation id for the '<em>Create Customer Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT___CREATE_CUSTOMER_RECEIPT__OBJECT_OBJECT_INT = 1;

	/**
	 * The number of operations of the '<em>Receipt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link newClasses.impl.ReceiptCreatorImpl <em>Receipt Creator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.ReceiptCreatorImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getReceiptCreator()
	 * @generated
	 */
	int RECEIPT_CREATOR = 2;

	/**
	 * The number of structural features of the '<em>Receipt Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_CREATOR_FEATURE_COUNT = RECEIPT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Guest Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_CREATOR___CREATE_GUEST_RECEIPT__OBJECT_OBJECT_INT = RECEIPT___CREATE_GUEST_RECEIPT__OBJECT_OBJECT_INT;

	/**
	 * The operation id for the '<em>Create Customer Receipt</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_CREATOR___CREATE_CUSTOMER_RECEIPT__OBJECT_OBJECT_INT = RECEIPT___CREATE_CUSTOMER_RECEIPT__OBJECT_OBJECT_INT;

	/**
	 * The number of operations of the '<em>Receipt Creator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIPT_CREATOR_OPERATION_COUNT = RECEIPT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link newClasses.DB_interface <em>DB interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.DB_interface
	 * @see newClasses.impl.NewClassesPackageImpl#getDB_interface()
	 * @generated
	 */
	int DB_INTERFACE = 5;

	/**
	 * The number of structural features of the '<em>DB interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Register Customer Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE___REGISTER_CUSTOMER_PAYMENT__OBJECT_INT = 0;

	/**
	 * The operation id for the '<em>Register Guest Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE___REGISTER_GUEST_PAYMENT__OBJECT_INT = 1;

	/**
	 * The operation id for the '<em>Store Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE___STORE_GUEST__OBJECT = 2;

	/**
	 * The operation id for the '<em>Store Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE___STORE_BOOKING__OBJECT = 3;

	/**
	 * The operation id for the '<em>Store Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE___STORE_CUSTOMER__OBJECT = 4;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE___CONNECT = 5;

	/**
	 * The number of operations of the '<em>DB interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DB_INTERFACE_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link newClasses.impl.DatabaseImpl <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.DatabaseImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getDatabase()
	 * @generated
	 */
	int DATABASE = 4;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_FEATURE_COUNT = DB_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Register Customer Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE___REGISTER_CUSTOMER_PAYMENT__OBJECT_INT = DB_INTERFACE___REGISTER_CUSTOMER_PAYMENT__OBJECT_INT;

	/**
	 * The operation id for the '<em>Register Guest Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE___REGISTER_GUEST_PAYMENT__OBJECT_INT = DB_INTERFACE___REGISTER_GUEST_PAYMENT__OBJECT_INT;

	/**
	 * The operation id for the '<em>Store Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE___STORE_GUEST__OBJECT = DB_INTERFACE___STORE_GUEST__OBJECT;

	/**
	 * The operation id for the '<em>Store Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE___STORE_BOOKING__OBJECT = DB_INTERFACE___STORE_BOOKING__OBJECT;

	/**
	 * The operation id for the '<em>Store Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE___STORE_CUSTOMER__OBJECT = DB_INTERFACE___STORE_CUSTOMER__OBJECT;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE___CONNECT = DB_INTERFACE___CONNECT;

	/**
	 * The number of operations of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATABASE_OPERATION_COUNT = DB_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link newClasses.Biller <em>Biller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.Biller
	 * @see newClasses.impl.NewClassesPackageImpl#getBiller()
	 * @generated
	 */
	int BILLER = 7;

	/**
	 * The number of structural features of the '<em>Biller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Calculate Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLER___CALCULATE_COST__STRING_STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLER___PAY__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT_BOOLEAN = 1;

	/**
	 * The operation id for the '<em>Calculate Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLER___CALCULATE_BILL__STRING_INT_INT_BOOLEAN = 2;

	/**
	 * The number of operations of the '<em>Biller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link newClasses.ServiceProvider <em>Service Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.ServiceProvider
	 * @see newClasses.impl.NewClassesPackageImpl#getServiceProvider()
	 * @generated
	 */
	int SERVICE_PROVIDER = 9;

	/**
	 * The number of structural features of the '<em>Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check Avalibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER___CHECK_AVALIBILITY__STRING_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Set Avalibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER___SET_AVALIBILITY__STRING_BOOLEAN = 1;

	/**
	 * The number of operations of the '<em>Service Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_PROVIDER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link newClasses.Validator <em>Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.Validator
	 * @see newClasses.impl.NewClassesPackageImpl#getValidator()
	 * @generated
	 */
	int VALIDATOR = 10;

	/**
	 * The number of structural features of the '<em>Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Validate Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___VALIDATE_EMAIL__STRING = 0;

	/**
	 * The operation id for the '<em>Validate Phone Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___VALIDATE_PHONE_NUM__LONG = 1;

	/**
	 * The operation id for the '<em>Validate Personal Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___VALIDATE_PERSONAL_NUM__LONG = 2;

	/**
	 * The operation id for the '<em>Validate Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___VALIDATE_NAMES__STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Validate Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___VALIDATE_ADDRESS__STRING_INT_STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Validate Dates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___VALIDATE_DATES__STRING_STRING = 5;

	/**
	 * The operation id for the '<em>Check Date Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___CHECK_DATE_ORDER__STRING_STRING = 6;

	/**
	 * The operation id for the '<em>Check Age Restriction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___CHECK_AGE_RESTRICTION__LONG = 7;

	/**
	 * The operation id for the '<em>Validate Confirmation Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___VALIDATE_CONFIRMATION_NUM__INT = 8;

	/**
	 * The operation id for the '<em>Check Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR___CHECK_AGE__INT_INT_INT = 9;

	/**
	 * The number of operations of the '<em>Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATOR_OPERATION_COUNT = 10;

	/**
	 * The meta object id for the '{@link newClasses.CustomerProvides <em>Customer Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.CustomerProvides
	 * @see newClasses.impl.NewClassesPackageImpl#getCustomerProvides()
	 * @generated
	 */
	int CUSTOMER_PROVIDES = 11;

	/**
	 * The number of structural features of the '<em>Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Is Credit Card Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link newClasses.impl.CreditCardImpl <em>Credit Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.CreditCardImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getCreditCard()
	 * @generated
	 */
	int CREDIT_CARD = 12;

	/**
	 * The feature id for the '<em><b>Credit Card Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CREDIT_CARD_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Cvc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CVC = 1;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__MONTH = 2;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__YEAR = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__FIRST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__LAST_NAME = 5;

	/**
	 * The number of structural features of the '<em>Credit Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Credit Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link newClasses.impl.GuestImpl <em>Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.GuestImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getGuest()
	 * @generated
	 */
	int GUEST = 13;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__FIRST_NAME = CUSTOMER__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__LAST_NAME = CUSTOMER__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Personal Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__PERSONAL_NUM = CUSTOMER__PERSONAL_NUM;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__ADDRESS = CUSTOMER__ADDRESS;

	/**
	 * The feature id for the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__ZIP_CODE = CUSTOMER__ZIP_CODE;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__CITY = CUSTOMER__CITY;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__COUNTRY = CUSTOMER__COUNTRY;

	/**
	 * The feature id for the '<em><b>Phone Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__PHONE_NUM = CUSTOMER__PHONE_NUM;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__EMAIL = CUSTOMER__EMAIL;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__BOOKING = CUSTOMER__BOOKING;

	/**
	 * The feature id for the '<em><b>Booking Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__BOOKING_NUM = CUSTOMER__BOOKING_NUM;

	/**
	 * The feature id for the '<em><b>Credit Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__CREDIT_CARD = CUSTOMER__CREDIT_CARD;

	/**
	 * The feature id for the '<em><b>Booking Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__BOOKING_COST = CUSTOMER__BOOKING_COST;

	/**
	 * The feature id for the '<em><b>Check In Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__CHECK_IN_DATE = CUSTOMER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Check Out Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__CHECK_OUT_DATE = CUSTOMER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Room Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__ROOM_NUM = CUSTOMER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Checked In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__CHECKED_IN = CUSTOMER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Checked Out</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__CHECKED_OUT = CUSTOMER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Added Services</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__ADDED_SERVICES = CUSTOMER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Extra Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__EXTRA_DAYS = CUSTOMER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__COST = CUSTOMER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Booking Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__BOOKING_PAID = CUSTOMER_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_FEATURE_COUNT = CUSTOMER_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Create Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___CREATE_BOOKING__STRING_STRING_STRING_STRING = CUSTOMER___CREATE_BOOKING__STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___CANCEL_BOOKING__INT = CUSTOMER___CANCEL_BOOKING__INT;

	/**
	 * The operation id for the '<em>Re Book</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___RE_BOOK__STRING_INT_STRING_STRING_STRING = CUSTOMER___RE_BOOK__STRING_INT_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Generate Confirm Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___GENERATE_CONFIRM_NUM = CUSTOMER___GENERATE_CONFIRM_NUM;

	/**
	 * The operation id for the '<em>Add Service To Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___ADD_SERVICE_TO_BILL__OBJECT_STRING = CUSTOMER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___CHECK_OUT__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT = CUSTOMER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Extend Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___EXTEND_STAY__OBJECT_INT_STRING = CUSTOMER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___CHECK_IN__INT_STRING = CUSTOMER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Change Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___CHANGE_ROOM__OBJECT_INT_STRING = CUSTOMER_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_OPERATION_COUNT = CUSTOMER_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link newClasses.GuestBiller <em>Guest Biller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.GuestBiller
	 * @see newClasses.impl.NewClassesPackageImpl#getGuestBiller()
	 * @generated
	 */
	int GUEST_BILLER = 14;

	/**
	 * The number of structural features of the '<em>Guest Biller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_BILLER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Service To Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_BILLER___ADD_SERVICE_TO_BILL__OBJECT_STRING = 0;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_BILLER___CHECK_OUT__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT = 1;

	/**
	 * The number of operations of the '<em>Guest Biller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_BILLER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link newClasses.GuestInterface <em>Guest Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.GuestInterface
	 * @see newClasses.impl.NewClassesPackageImpl#getGuestInterface()
	 * @generated
	 */
	int GUEST_INTERFACE = 15;

	/**
	 * The number of structural features of the '<em>Guest Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Extend Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_INTERFACE___EXTEND_STAY__OBJECT_INT_STRING = 0;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_INTERFACE___CHECK_IN__INT_STRING = 1;

	/**
	 * The operation id for the '<em>Change Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_INTERFACE___CHANGE_ROOM__OBJECT_INT_STRING = 2;

	/**
	 * The number of operations of the '<em>Guest Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_INTERFACE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link newClasses.impl.RoomTypeImpl <em>Room Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.RoomTypeImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getRoomType()
	 * @generated
	 */
	int ROOM_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE__PRICE = 1;

	/**
	 * The number of structural features of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link newClasses.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.RoomImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 17;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__TYPE = ROOM_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__PRICE = ROOM_TYPE__PRICE;

	/**
	 * The feature id for the '<em><b>Room Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ROOM_NUM = ROOM_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__STATUS = ROOM_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = ROOM_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = ROOM_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link newClasses.impl.InformationValidatorImpl <em>Information Validator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.InformationValidatorImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getInformationValidator()
	 * @generated
	 */
	int INFORMATION_VALIDATOR = 18;

	/**
	 * The number of structural features of the '<em>Information Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VALIDATOR_FEATURE_COUNT = VALIDATOR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Validate Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VALIDATOR___VALIDATE_EMAIL__STRING = VALIDATOR___VALIDATE_EMAIL__STRING;

	/**
	 * The operation id for the '<em>Validate Phone Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VALIDATOR___VALIDATE_PHONE_NUM__LONG = VALIDATOR___VALIDATE_PHONE_NUM__LONG;

	/**
	 * The operation id for the '<em>Validate Personal Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VALIDATOR___VALIDATE_PERSONAL_NUM__LONG = VALIDATOR___VALIDATE_PERSONAL_NUM__LONG;

	/**
	 * The operation id for the '<em>Validate Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VALIDATOR___VALIDATE_NAMES__STRING_STRING = VALIDATOR___VALIDATE_NAMES__STRING_STRING;

	/**
	 * The operation id for the '<em>Validate Address</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VALIDATOR___VALIDATE_ADDRESS__STRING_INT_STRING_STRING = VALIDATOR___VALIDATE_ADDRESS__STRING_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Validate Dates</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VALIDATOR___VALIDATE_DATES__STRING_STRING = VALIDATOR___VALIDATE_DATES__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Date Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VALIDATOR___CHECK_DATE_ORDER__STRING_STRING = VALIDATOR___CHECK_DATE_ORDER__STRING_STRING;

	/**
	 * The operation id for the '<em>Check Age Restriction</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VALIDATOR___CHECK_AGE_RESTRICTION__LONG = VALIDATOR___CHECK_AGE_RESTRICTION__LONG;

	/**
	 * The operation id for the '<em>Validate Confirmation Num</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VALIDATOR___VALIDATE_CONFIRMATION_NUM__INT = VALIDATOR___VALIDATE_CONFIRMATION_NUM__INT;

	/**
	 * The operation id for the '<em>Check Age</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VALIDATOR___CHECK_AGE__INT_INT_INT = VALIDATOR___CHECK_AGE__INT_INT_INT;

	/**
	 * The number of operations of the '<em>Information Validator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMATION_VALIDATOR_OPERATION_COUNT = VALIDATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link newClasses.impl.ServiceHandlerImpl <em>Service Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.ServiceHandlerImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getServiceHandler()
	 * @generated
	 */
	int SERVICE_HANDLER = 19;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER__SERVICE = SERVICE_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Service Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER_FEATURE_COUNT = SERVICE_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Check Avalibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER___CHECK_AVALIBILITY__STRING_STRING_STRING = SERVICE_PROVIDER___CHECK_AVALIBILITY__STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Set Avalibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER___SET_AVALIBILITY__STRING_BOOLEAN = SERVICE_PROVIDER___SET_AVALIBILITY__STRING_BOOLEAN;

	/**
	 * The operation id for the '<em>Change Service Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER___CHANGE_SERVICE_TYPE__INT_STRING = SERVICE_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER___REMOVE_SERVICE__INT = SERVICE_PROVIDER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Change Service Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER___CHANGE_SERVICE_PRICE__INT_INT = SERVICE_PROVIDER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER___ADD_SERVICE__INT_STRING_INT = SERVICE_PROVIDER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Service Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER_OPERATION_COUNT = SERVICE_PROVIDER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link newClasses.impl.ServiceTypeImpl <em>Service Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.ServiceTypeImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getServiceType()
	 * @generated
	 */
	int SERVICE_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE__PRICE = 1;

	/**
	 * The number of structural features of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Service Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link newClasses.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.ServiceImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__TYPE = SERVICE_TYPE__TYPE;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PRICE = SERVICE_TYPE__PRICE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = SERVICE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__STATUS = SERVICE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = SERVICE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = SERVICE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link newClasses.ServiceHandlerInterface <em>Service Handler Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.ServiceHandlerInterface
	 * @see newClasses.impl.NewClassesPackageImpl#getServiceHandlerInterface()
	 * @generated
	 */
	int SERVICE_HANDLER_INTERFACE = 22;

	/**
	 * The number of structural features of the '<em>Service Handler Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Change Service Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER_INTERFACE___CHANGE_SERVICE_TYPE__INT_STRING = 0;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER_INTERFACE___REMOVE_SERVICE__INT = 1;

	/**
	 * The operation id for the '<em>Change Service Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER_INTERFACE___CHANGE_SERVICE_PRICE__INT_INT = 2;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER_INTERFACE___ADD_SERVICE__INT_STRING_INT = 3;

	/**
	 * The number of operations of the '<em>Service Handler Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_HANDLER_INTERFACE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link newClasses.ManagerInterface <em>Manager Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.ManagerInterface
	 * @see newClasses.impl.NewClassesPackageImpl#getManagerInterface()
	 * @generated
	 */
	int MANAGER_INTERFACE = 26;

	/**
	 * The number of structural features of the '<em>Manager Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INTERFACE___LOGOUT = 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INTERFACE___LOGIN__STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Validate Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INTERFACE___VALIDATE_LOGIN__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Session Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INTERFACE___SESSION_DATA = 3;

	/**
	 * The number of operations of the '<em>Manager Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_INTERFACE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link newClasses.impl.ManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.ManagerImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getManager()
	 * @generated
	 */
	int MANAGER = 23;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__USER_NAME = MANAGER_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__PASSWORD = MANAGER_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Room Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__ROOM_HANDLER = MANAGER_INTERFACE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Service Handler</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER__SERVICE_HANDLER = MANAGER_INTERFACE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_FEATURE_COUNT = MANAGER_INTERFACE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___LOGOUT = MANAGER_INTERFACE___LOGOUT;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___LOGIN__STRING_STRING = MANAGER_INTERFACE___LOGIN__STRING_STRING;

	/**
	 * The operation id for the '<em>Validate Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___VALIDATE_LOGIN__STRING_STRING = MANAGER_INTERFACE___VALIDATE_LOGIN__STRING_STRING;

	/**
	 * The operation id for the '<em>Session Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___SESSION_DATA = MANAGER_INTERFACE___SESSION_DATA;

	/**
	 * The operation id for the '<em>Change Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___CHANGE_ROOM_TYPE__INT_STRING = MANAGER_INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___REMOVE_ROOM__INT = MANAGER_INTERFACE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Change Room Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___CHANGE_ROOM_PRICE__INT_INT = MANAGER_INTERFACE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___ADD_ROOM__INT_STRING_INT = MANAGER_INTERFACE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Change Service Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___CHANGE_SERVICE_TYPE__INT_STRING = MANAGER_INTERFACE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___REMOVE_SERVICE__INT = MANAGER_INTERFACE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Change Service Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___CHANGE_SERVICE_PRICE__INT_INT = MANAGER_INTERFACE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER___ADD_SERVICE__INT_STRING_INT = MANAGER_INTERFACE_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANAGER_OPERATION_COUNT = MANAGER_INTERFACE_OPERATION_COUNT + 8;

	/**
	 * The meta object id for the '{@link newClasses.impl.RoomHandlerImpl <em>Room Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.RoomHandlerImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getRoomHandler()
	 * @generated
	 */
	int ROOM_HANDLER = 24;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER__ROOM = ROOM_PROVIDER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Database</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER__DATABASE = ROOM_PROVIDER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_FEATURE_COUNT = ROOM_PROVIDER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Set Avalibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___SET_AVALIBILITY__STRING_BOOLEAN_STRING_STRING = ROOM_PROVIDER___SET_AVALIBILITY__STRING_BOOLEAN_STRING_STRING;

	/**
	 * The operation id for the '<em>Check Avalibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___CHECK_AVALIBILITY__STRING_STRING_STRING = ROOM_PROVIDER___CHECK_AVALIBILITY__STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Date Checker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___DATE_CHECKER__STRING_STRING_STRING_STRING = ROOM_PROVIDER___DATE_CHECKER__STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Change Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___CHANGE_ROOM_TYPE__INT_STRING = ROOM_PROVIDER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___REMOVE_ROOM__INT = ROOM_PROVIDER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Change Room Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___CHANGE_ROOM_PRICE__INT_INT = ROOM_PROVIDER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___ADD_ROOM__INT_STRING_INT = ROOM_PROVIDER_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Extend Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___EXTEND_STAY__OBJECT_INT_STRING = ROOM_PROVIDER_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Check In</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___CHECK_IN__INT_STRING = ROOM_PROVIDER_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Change Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER___CHANGE_ROOM__OBJECT_INT_STRING = ROOM_PROVIDER_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>Room Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_OPERATION_COUNT = ROOM_PROVIDER_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link newClasses.RoomHandlerInterface <em>Room Handler Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.RoomHandlerInterface
	 * @see newClasses.impl.NewClassesPackageImpl#getRoomHandlerInterface()
	 * @generated
	 */
	int ROOM_HANDLER_INTERFACE = 25;

	/**
	 * The number of structural features of the '<em>Room Handler Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Change Room Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_INTERFACE___CHANGE_ROOM_TYPE__INT_STRING = 0;

	/**
	 * The operation id for the '<em>Remove Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_INTERFACE___REMOVE_ROOM__INT = 1;

	/**
	 * The operation id for the '<em>Change Room Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_INTERFACE___CHANGE_ROOM_PRICE__INT_INT = 2;

	/**
	 * The operation id for the '<em>Add Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_INTERFACE___ADD_ROOM__INT_STRING_INT = 3;

	/**
	 * The number of operations of the '<em>Room Handler Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_HANDLER_INTERFACE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link newClasses.impl.BillingImpl <em>Billing</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.BillingImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getBilling()
	 * @generated
	 */
	int BILLING = 27;

	/**
	 * The feature id for the '<em><b>Total Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING__TOTAL_COST = BILLER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING__IS_PAID = BILLER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_FEATURE_COUNT = BILLER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Calculate Cost</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING___CALCULATE_COST__STRING_STRING_STRING_STRING = BILLER___CALCULATE_COST__STRING_STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Pay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING___PAY__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT_BOOLEAN = BILLER___PAY__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT_BOOLEAN;

	/**
	 * The operation id for the '<em>Calculate Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING___CALCULATE_BILL__STRING_INT_INT_BOOLEAN = BILLER___CALCULATE_BILL__STRING_INT_INT_BOOLEAN;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = BILLER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Is Credit Card Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = BILLER_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Service To Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING___ADD_SERVICE_TO_BILL__OBJECT_STRING = BILLER_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Check Out</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING___CHECK_OUT__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT = BILLER_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Billing</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLING_OPERATION_COUNT = BILLER_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link newClasses.impl.BankComponentImpl <em>Bank Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.BankComponentImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getBankComponent()
	 * @generated
	 */
	int BANK_COMPONENT = 28;

	/**
	 * The number of structural features of the '<em>Bank Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_COMPONENT_FEATURE_COUNT = CUSTOMER_PROVIDES_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_COMPONENT___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE;

	/**
	 * The operation id for the '<em>Is Credit Card Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_COMPONENT___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Make Deposit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_COMPONENT___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = CUSTOMER_PROVIDES_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_COMPONENT___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = CUSTOMER_PROVIDES_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Remove Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_COMPONENT___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = CUSTOMER_PROVIDES_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Balance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_COMPONENT___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING = CUSTOMER_PROVIDES_OPERATION_COUNT + 3;

	/**
	 * The number of operations of the '<em>Bank Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_COMPONENT_OPERATION_COUNT = CUSTOMER_PROVIDES_OPERATION_COUNT + 4;

	/**
	 * The meta object id for the '{@link newClasses.AdministratorProvides <em>Administrator Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.AdministratorProvides
	 * @see newClasses.impl.NewClassesPackageImpl#getAdministratorProvides()
	 * @generated
	 */
	int ADMINISTRATOR_PROVIDES = 29;

	/**
	 * The number of structural features of the '<em>Administrator Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Deposit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Add Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Remove Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Get Balance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING = 3;

	/**
	 * The number of operations of the '<em>Administrator Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link newClasses.impl.LoginCheckerImpl <em>Login Checker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see newClasses.impl.LoginCheckerImpl
	 * @see newClasses.impl.NewClassesPackageImpl#getLoginChecker()
	 * @generated
	 */
	int LOGIN_CHECKER = 30;

	/**
	 * The feature id for the '<em><b>Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CHECKER__MANAGER = MANAGER_INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Login Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CHECKER_FEATURE_COUNT = MANAGER_INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Logout</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CHECKER___LOGOUT = MANAGER_INTERFACE___LOGOUT;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CHECKER___LOGIN__STRING_STRING = MANAGER_INTERFACE___LOGIN__STRING_STRING;

	/**
	 * The operation id for the '<em>Validate Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CHECKER___VALIDATE_LOGIN__STRING_STRING = MANAGER_INTERFACE___VALIDATE_LOGIN__STRING_STRING;

	/**
	 * The operation id for the '<em>Session Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CHECKER___SESSION_DATA = MANAGER_INTERFACE___SESSION_DATA;

	/**
	 * The number of operations of the '<em>Login Checker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGIN_CHECKER_OPERATION_COUNT = MANAGER_INTERFACE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link newClasses.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see newClasses.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Customer#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see newClasses.Customer#getFirstName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Customer#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see newClasses.Customer#getLastName()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_LastName();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Customer#getPersonalNum <em>Personal Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personal Num</em>'.
	 * @see newClasses.Customer#getPersonalNum()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_PersonalNum();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Customer#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see newClasses.Customer#getAddress()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Address();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Customer#getZipCode <em>Zip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip Code</em>'.
	 * @see newClasses.Customer#getZipCode()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_ZipCode();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Customer#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see newClasses.Customer#getCity()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_City();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Customer#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see newClasses.Customer#getCountry()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Country();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Customer#getPhoneNum <em>Phone Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Num</em>'.
	 * @see newClasses.Customer#getPhoneNum()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_PhoneNum();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Customer#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see newClasses.Customer#getEmail()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Email();

	/**
	 * Returns the meta object for the reference '{@link newClasses.Customer#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Booking</em>'.
	 * @see newClasses.Customer#getBooking()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Booking();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Customer#getBookingNum <em>Booking Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Num</em>'.
	 * @see newClasses.Customer#getBookingNum()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_BookingNum();

	/**
	 * Returns the meta object for the reference '{@link newClasses.Customer#getCreditCard <em>Credit Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Card</em>'.
	 * @see newClasses.Customer#getCreditCard()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_CreditCard();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Customer#getBookingCost <em>Booking Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Cost</em>'.
	 * @see newClasses.Customer#getBookingCost()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_BookingCost();

	/**
	 * Returns the meta object for class '{@link newClasses.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see newClasses.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Booking#getCheckInDate <em>Check In Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check In Date</em>'.
	 * @see newClasses.Booking#getCheckInDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckInDate();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Booking#getCheckOutDate <em>Check Out Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Out Date</em>'.
	 * @see newClasses.Booking#getCheckOutDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_CheckOutDate();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Booking#getConformationNum <em>Conformation Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conformation Num</em>'.
	 * @see newClasses.Booking#getConformationNum()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_ConformationNum();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Booking#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see newClasses.Booking#getCost()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Cost();

	/**
	 * Returns the meta object for the reference '{@link newClasses.Booking#getReceiptCreator <em>Receipt Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receipt Creator</em>'.
	 * @see newClasses.Booking#getReceiptCreator()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_ReceiptCreator();

	/**
	 * Returns the meta object for the reference '{@link newClasses.Booking#getDatabaseHandler <em>Database Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database Handler</em>'.
	 * @see newClasses.Booking#getDatabaseHandler()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_DatabaseHandler();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Booking#getRoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Type</em>'.
	 * @see newClasses.Booking#getRoomType()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_RoomType();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Booking#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Services</em>'.
	 * @see newClasses.Booking#getServices()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Services();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Booking#isPaid <em>Is Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Paid</em>'.
	 * @see newClasses.Booking#isPaid()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_IsPaid();

	/**
	 * Returns the meta object for class '{@link newClasses.ReceiptCreator <em>Receipt Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receipt Creator</em>'.
	 * @see newClasses.ReceiptCreator
	 * @generated
	 */
	EClass getReceiptCreator();

	/**
	 * Returns the meta object for class '{@link newClasses.Receipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receipt</em>'.
	 * @see newClasses.Receipt
	 * @generated
	 */
	EClass getReceipt();

	/**
	 * Returns the meta object for the '{@link newClasses.Receipt#createGuestReceipt(java.lang.Object, java.lang.Object, int) <em>Create Guest Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Guest Receipt</em>' operation.
	 * @see newClasses.Receipt#createGuestReceipt(java.lang.Object, java.lang.Object, int)
	 * @generated
	 */
	EOperation getReceipt__CreateGuestReceipt__Object_Object_int();

	/**
	 * Returns the meta object for the '{@link newClasses.Receipt#createCustomerReceipt(java.lang.Object, java.lang.Object, int) <em>Create Customer Receipt</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Customer Receipt</em>' operation.
	 * @see newClasses.Receipt#createCustomerReceipt(java.lang.Object, java.lang.Object, int)
	 * @generated
	 */
	EOperation getReceipt__CreateCustomerReceipt__Object_Object_int();

	/**
	 * Returns the meta object for class '{@link newClasses.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see newClasses.Database
	 * @generated
	 */
	EClass getDatabase();

	/**
	 * Returns the meta object for class '{@link newClasses.DB_interface <em>DB interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DB interface</em>'.
	 * @see newClasses.DB_interface
	 * @generated
	 */
	EClass getDB_interface();

	/**
	 * Returns the meta object for the '{@link newClasses.DB_interface#registerCustomerPayment(java.lang.Object, int) <em>Register Customer Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Customer Payment</em>' operation.
	 * @see newClasses.DB_interface#registerCustomerPayment(java.lang.Object, int)
	 * @generated
	 */
	EOperation getDB_interface__RegisterCustomerPayment__Object_int();

	/**
	 * Returns the meta object for the '{@link newClasses.DB_interface#registerGuestPayment(java.lang.Object, int) <em>Register Guest Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Guest Payment</em>' operation.
	 * @see newClasses.DB_interface#registerGuestPayment(java.lang.Object, int)
	 * @generated
	 */
	EOperation getDB_interface__RegisterGuestPayment__Object_int();

	/**
	 * Returns the meta object for the '{@link newClasses.DB_interface#storeGuest(java.lang.Object) <em>Store Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Store Guest</em>' operation.
	 * @see newClasses.DB_interface#storeGuest(java.lang.Object)
	 * @generated
	 */
	EOperation getDB_interface__StoreGuest__Object();

	/**
	 * Returns the meta object for the '{@link newClasses.DB_interface#storeBooking(java.lang.Object) <em>Store Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Store Booking</em>' operation.
	 * @see newClasses.DB_interface#storeBooking(java.lang.Object)
	 * @generated
	 */
	EOperation getDB_interface__StoreBooking__Object();

	/**
	 * Returns the meta object for the '{@link newClasses.DB_interface#storeCustomer(java.lang.Object) <em>Store Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Store Customer</em>' operation.
	 * @see newClasses.DB_interface#storeCustomer(java.lang.Object)
	 * @generated
	 */
	EOperation getDB_interface__StoreCustomer__Object();

	/**
	 * Returns the meta object for the '{@link newClasses.DB_interface#connect() <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect</em>' operation.
	 * @see newClasses.DB_interface#connect()
	 * @generated
	 */
	EOperation getDB_interface__Connect();

	/**
	 * Returns the meta object for class '{@link newClasses.RoomProvider <em>Room Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Provider</em>'.
	 * @see newClasses.RoomProvider
	 * @generated
	 */
	EClass getRoomProvider();

	/**
	 * Returns the meta object for the '{@link newClasses.RoomProvider#setAvalibility(java.lang.String, boolean, java.lang.String, java.lang.String) <em>Set Avalibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Avalibility</em>' operation.
	 * @see newClasses.RoomProvider#setAvalibility(java.lang.String, boolean, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getRoomProvider__SetAvalibility__String_boolean_String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.RoomProvider#checkAvalibility(java.lang.String, java.lang.String, java.lang.String) <em>Check Avalibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Avalibility</em>' operation.
	 * @see newClasses.RoomProvider#checkAvalibility(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getRoomProvider__CheckAvalibility__String_String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.RoomProvider#dateChecker(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Date Checker</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Date Checker</em>' operation.
	 * @see newClasses.RoomProvider#dateChecker(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getRoomProvider__DateChecker__String_String_String_String();

	/**
	 * Returns the meta object for class '{@link newClasses.Biller <em>Biller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Biller</em>'.
	 * @see newClasses.Biller
	 * @generated
	 */
	EClass getBiller();

	/**
	 * Returns the meta object for the '{@link newClasses.Biller#calculateCost(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Calculate Cost</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Cost</em>' operation.
	 * @see newClasses.Biller#calculateCost(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBiller__CalculateCost__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.Biller#pay(java.lang.String, int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, int, boolean) <em>Pay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay</em>' operation.
	 * @see newClasses.Biller#pay(java.lang.String, int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, int, boolean)
	 * @generated
	 */
	EOperation getBiller__Pay__String_int_String_String_int_int_String_String_int_boolean();

	/**
	 * Returns the meta object for the '{@link newClasses.Biller#calculateBill(java.lang.String, int, int, boolean) <em>Calculate Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculate Bill</em>' operation.
	 * @see newClasses.Biller#calculateBill(java.lang.String, int, int, boolean)
	 * @generated
	 */
	EOperation getBiller__CalculateBill__String_int_int_boolean();

	/**
	 * Returns the meta object for class '{@link newClasses.Booker <em>Booker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booker</em>'.
	 * @see newClasses.Booker
	 * @generated
	 */
	EClass getBooker();

	/**
	 * Returns the meta object for the '{@link newClasses.Booker#createBooking(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Create Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Booking</em>' operation.
	 * @see newClasses.Booker#createBooking(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBooker__CreateBooking__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.Booker#cancelBooking(int) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see newClasses.Booker#cancelBooking(int)
	 * @generated
	 */
	EOperation getBooker__CancelBooking__int();

	/**
	 * Returns the meta object for the '{@link newClasses.Booker#reBook(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String) <em>Re Book</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Re Book</em>' operation.
	 * @see newClasses.Booker#reBook(java.lang.String, int, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBooker__ReBook__String_int_String_String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.Booker#generateConfirmNum() <em>Generate Confirm Num</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Confirm Num</em>' operation.
	 * @see newClasses.Booker#generateConfirmNum()
	 * @generated
	 */
	EOperation getBooker__GenerateConfirmNum();

	/**
	 * Returns the meta object for class '{@link newClasses.ServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Provider</em>'.
	 * @see newClasses.ServiceProvider
	 * @generated
	 */
	EClass getServiceProvider();

	/**
	 * Returns the meta object for the '{@link newClasses.ServiceProvider#checkAvalibility(java.lang.String, java.lang.String, java.lang.String) <em>Check Avalibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Avalibility</em>' operation.
	 * @see newClasses.ServiceProvider#checkAvalibility(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getServiceProvider__CheckAvalibility__String_String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.ServiceProvider#setAvalibility(java.lang.String, boolean) <em>Set Avalibility</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Avalibility</em>' operation.
	 * @see newClasses.ServiceProvider#setAvalibility(java.lang.String, boolean)
	 * @generated
	 */
	EOperation getServiceProvider__SetAvalibility__String_boolean();

	/**
	 * Returns the meta object for class '{@link newClasses.Validator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validator</em>'.
	 * @see newClasses.Validator
	 * @generated
	 */
	EClass getValidator();

	/**
	 * Returns the meta object for the '{@link newClasses.Validator#validateEmail(java.lang.String) <em>Validate Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Email</em>' operation.
	 * @see newClasses.Validator#validateEmail(java.lang.String)
	 * @generated
	 */
	EOperation getValidator__ValidateEmail__String();

	/**
	 * Returns the meta object for the '{@link newClasses.Validator#validatePhoneNum(long) <em>Validate Phone Num</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Phone Num</em>' operation.
	 * @see newClasses.Validator#validatePhoneNum(long)
	 * @generated
	 */
	EOperation getValidator__ValidatePhoneNum__long();

	/**
	 * Returns the meta object for the '{@link newClasses.Validator#validatePersonalNum(long) <em>Validate Personal Num</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Personal Num</em>' operation.
	 * @see newClasses.Validator#validatePersonalNum(long)
	 * @generated
	 */
	EOperation getValidator__ValidatePersonalNum__long();

	/**
	 * Returns the meta object for the '{@link newClasses.Validator#validateNames(java.lang.String, java.lang.String) <em>Validate Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Names</em>' operation.
	 * @see newClasses.Validator#validateNames(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getValidator__ValidateNames__String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.Validator#validateAddress(java.lang.String, int, java.lang.String, java.lang.String) <em>Validate Address</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Address</em>' operation.
	 * @see newClasses.Validator#validateAddress(java.lang.String, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getValidator__ValidateAddress__String_int_String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.Validator#validateDates(java.lang.String, java.lang.String) <em>Validate Dates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Dates</em>' operation.
	 * @see newClasses.Validator#validateDates(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getValidator__ValidateDates__String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.Validator#checkDateOrder(java.lang.String, java.lang.String) <em>Check Date Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Date Order</em>' operation.
	 * @see newClasses.Validator#checkDateOrder(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getValidator__CheckDateOrder__String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.Validator#checkAgeRestriction(long) <em>Check Age Restriction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Age Restriction</em>' operation.
	 * @see newClasses.Validator#checkAgeRestriction(long)
	 * @generated
	 */
	EOperation getValidator__CheckAgeRestriction__long();

	/**
	 * Returns the meta object for the '{@link newClasses.Validator#validateConfirmationNum(int) <em>Validate Confirmation Num</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Confirmation Num</em>' operation.
	 * @see newClasses.Validator#validateConfirmationNum(int)
	 * @generated
	 */
	EOperation getValidator__ValidateConfirmationNum__int();

	/**
	 * Returns the meta object for the '{@link newClasses.Validator#checkAge(int, int, int) <em>Check Age</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Age</em>' operation.
	 * @see newClasses.Validator#checkAge(int, int, int)
	 * @generated
	 */
	EOperation getValidator__CheckAge__int_int_int();

	/**
	 * Returns the meta object for class '{@link newClasses.CustomerProvides <em>Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Provides</em>'.
	 * @see newClasses.CustomerProvides
	 * @generated
	 */
	EClass getCustomerProvides();

	/**
	 * Returns the meta object for the '{@link newClasses.CustomerProvides#makePayment(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see newClasses.CustomerProvides#makePayment(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getCustomerProvides__MakePayment__String_String_int_int_String_String_double();

	/**
	 * Returns the meta object for the '{@link newClasses.CustomerProvides#isCreditCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Is Credit Card Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Credit Card Valid</em>' operation.
	 * @see newClasses.CustomerProvides#isCreditCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCustomerProvides__IsCreditCardValid__String_String_int_int_String_String();

	/**
	 * Returns the meta object for class '{@link newClasses.CreditCard <em>Credit Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Card</em>'.
	 * @see newClasses.CreditCard
	 * @generated
	 */
	EClass getCreditCard();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.CreditCard#getCreditCardNumber <em>Credit Card Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit Card Number</em>'.
	 * @see newClasses.CreditCard#getCreditCardNumber()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_CreditCardNumber();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.CreditCard#getCvc <em>Cvc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cvc</em>'.
	 * @see newClasses.CreditCard#getCvc()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_Cvc();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.CreditCard#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see newClasses.CreditCard#getMonth()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_Month();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.CreditCard#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see newClasses.CreditCard#getYear()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_Year();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.CreditCard#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see newClasses.CreditCard#getFirstName()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.CreditCard#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see newClasses.CreditCard#getLastName()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_LastName();

	/**
	 * Returns the meta object for class '{@link newClasses.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest</em>'.
	 * @see newClasses.Guest
	 * @generated
	 */
	EClass getGuest();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Guest#getCheckInDate <em>Check In Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check In Date</em>'.
	 * @see newClasses.Guest#getCheckInDate()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_CheckInDate();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Guest#getCheckOutDate <em>Check Out Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Out Date</em>'.
	 * @see newClasses.Guest#getCheckOutDate()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_CheckOutDate();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Guest#getRoomNum <em>Room Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Num</em>'.
	 * @see newClasses.Guest#getRoomNum()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_RoomNum();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Guest#isCheckedIn <em>Checked In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked In</em>'.
	 * @see newClasses.Guest#isCheckedIn()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_CheckedIn();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Guest#isCheckedOut <em>Checked Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Checked Out</em>'.
	 * @see newClasses.Guest#isCheckedOut()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_CheckedOut();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Guest#getAddedServices <em>Added Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Added Services</em>'.
	 * @see newClasses.Guest#getAddedServices()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_AddedServices();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Guest#getExtraDays <em>Extra Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Days</em>'.
	 * @see newClasses.Guest#getExtraDays()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_ExtraDays();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Guest#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see newClasses.Guest#getCost()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Cost();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Guest#isBookingPaid <em>Booking Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Paid</em>'.
	 * @see newClasses.Guest#isBookingPaid()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_BookingPaid();

	/**
	 * Returns the meta object for class '{@link newClasses.GuestBiller <em>Guest Biller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Biller</em>'.
	 * @see newClasses.GuestBiller
	 * @generated
	 */
	EClass getGuestBiller();

	/**
	 * Returns the meta object for the '{@link newClasses.GuestBiller#addServiceToBill(java.lang.Object, java.lang.String) <em>Add Service To Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Service To Bill</em>' operation.
	 * @see newClasses.GuestBiller#addServiceToBill(java.lang.Object, java.lang.String)
	 * @generated
	 */
	EOperation getGuestBiller__AddServiceToBill__Object_String();

	/**
	 * Returns the meta object for the '{@link newClasses.GuestBiller#checkOut(java.lang.String, int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, int) <em>Check Out</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out</em>' operation.
	 * @see newClasses.GuestBiller#checkOut(java.lang.String, int, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getGuestBiller__CheckOut__String_int_String_String_int_int_String_String_int();

	/**
	 * Returns the meta object for class '{@link newClasses.GuestInterface <em>Guest Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest Interface</em>'.
	 * @see newClasses.GuestInterface
	 * @generated
	 */
	EClass getGuestInterface();

	/**
	 * Returns the meta object for the '{@link newClasses.GuestInterface#extendStay(java.lang.Object, int, java.lang.String) <em>Extend Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Extend Stay</em>' operation.
	 * @see newClasses.GuestInterface#extendStay(java.lang.Object, int, java.lang.String)
	 * @generated
	 */
	EOperation getGuestInterface__ExtendStay__Object_int_String();

	/**
	 * Returns the meta object for the '{@link newClasses.GuestInterface#checkIn(int, java.lang.String) <em>Check In</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In</em>' operation.
	 * @see newClasses.GuestInterface#checkIn(int, java.lang.String)
	 * @generated
	 */
	EOperation getGuestInterface__CheckIn__int_String();

	/**
	 * Returns the meta object for the '{@link newClasses.GuestInterface#changeRoom(java.lang.Object, int, java.lang.String) <em>Change Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Room</em>' operation.
	 * @see newClasses.GuestInterface#changeRoom(java.lang.Object, int, java.lang.String)
	 * @generated
	 */
	EOperation getGuestInterface__ChangeRoom__Object_int_String();

	/**
	 * Returns the meta object for class '{@link newClasses.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Type</em>'.
	 * @see newClasses.RoomType
	 * @generated
	 */
	EClass getRoomType();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.RoomType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see newClasses.RoomType#getType()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Type();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.RoomType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see newClasses.RoomType#getPrice()
	 * @see #getRoomType()
	 * @generated
	 */
	EAttribute getRoomType_Price();

	/**
	 * Returns the meta object for class '{@link newClasses.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see newClasses.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Room#getRoomNum <em>Room Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Room Num</em>'.
	 * @see newClasses.Room#getRoomNum()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_RoomNum();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Room#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see newClasses.Room#isStatus()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Status();

	/**
	 * Returns the meta object for class '{@link newClasses.InformationValidator <em>Information Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Information Validator</em>'.
	 * @see newClasses.InformationValidator
	 * @generated
	 */
	EClass getInformationValidator();

	/**
	 * Returns the meta object for class '{@link newClasses.ServiceHandler <em>Service Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Handler</em>'.
	 * @see newClasses.ServiceHandler
	 * @generated
	 */
	EClass getServiceHandler();

	/**
	 * Returns the meta object for the reference '{@link newClasses.ServiceHandler#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service</em>'.
	 * @see newClasses.ServiceHandler#getService()
	 * @see #getServiceHandler()
	 * @generated
	 */
	EReference getServiceHandler_Service();

	/**
	 * Returns the meta object for class '{@link newClasses.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see newClasses.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Service#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see newClasses.Service#getId()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Id();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Service#isStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see newClasses.Service#isStatus()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Status();

	/**
	 * Returns the meta object for class '{@link newClasses.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Type</em>'.
	 * @see newClasses.ServiceType
	 * @generated
	 */
	EClass getServiceType();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.ServiceType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see newClasses.ServiceType#getType()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Type();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.ServiceType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see newClasses.ServiceType#getPrice()
	 * @see #getServiceType()
	 * @generated
	 */
	EAttribute getServiceType_Price();

	/**
	 * Returns the meta object for class '{@link newClasses.ServiceHandlerInterface <em>Service Handler Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Handler Interface</em>'.
	 * @see newClasses.ServiceHandlerInterface
	 * @generated
	 */
	EClass getServiceHandlerInterface();

	/**
	 * Returns the meta object for the '{@link newClasses.ServiceHandlerInterface#changeServiceType(int, java.lang.String) <em>Change Service Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Service Type</em>' operation.
	 * @see newClasses.ServiceHandlerInterface#changeServiceType(int, java.lang.String)
	 * @generated
	 */
	EOperation getServiceHandlerInterface__ChangeServiceType__int_String();

	/**
	 * Returns the meta object for the '{@link newClasses.ServiceHandlerInterface#removeService(int) <em>Remove Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Service</em>' operation.
	 * @see newClasses.ServiceHandlerInterface#removeService(int)
	 * @generated
	 */
	EOperation getServiceHandlerInterface__RemoveService__int();

	/**
	 * Returns the meta object for the '{@link newClasses.ServiceHandlerInterface#changeServicePrice(int, int) <em>Change Service Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Service Price</em>' operation.
	 * @see newClasses.ServiceHandlerInterface#changeServicePrice(int, int)
	 * @generated
	 */
	EOperation getServiceHandlerInterface__ChangeServicePrice__int_int();

	/**
	 * Returns the meta object for the '{@link newClasses.ServiceHandlerInterface#addService(int, java.lang.String, int) <em>Add Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Service</em>' operation.
	 * @see newClasses.ServiceHandlerInterface#addService(int, java.lang.String, int)
	 * @generated
	 */
	EOperation getServiceHandlerInterface__AddService__int_String_int();

	/**
	 * Returns the meta object for class '{@link newClasses.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see newClasses.Manager
	 * @generated
	 */
	EClass getManager();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Manager#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see newClasses.Manager#getUserName()
	 * @see #getManager()
	 * @generated
	 */
	EAttribute getManager_UserName();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Manager#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see newClasses.Manager#getPassword()
	 * @see #getManager()
	 * @generated
	 */
	EAttribute getManager_Password();

	/**
	 * Returns the meta object for the reference '{@link newClasses.Manager#getRoomHandler <em>Room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Handler</em>'.
	 * @see newClasses.Manager#getRoomHandler()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_RoomHandler();

	/**
	 * Returns the meta object for the reference '{@link newClasses.Manager#getServiceHandler <em>Service Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Service Handler</em>'.
	 * @see newClasses.Manager#getServiceHandler()
	 * @see #getManager()
	 * @generated
	 */
	EReference getManager_ServiceHandler();

	/**
	 * Returns the meta object for class '{@link newClasses.RoomHandler <em>Room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Handler</em>'.
	 * @see newClasses.RoomHandler
	 * @generated
	 */
	EClass getRoomHandler();

	/**
	 * Returns the meta object for the reference '{@link newClasses.RoomHandler#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see newClasses.RoomHandler#getRoom()
	 * @see #getRoomHandler()
	 * @generated
	 */
	EReference getRoomHandler_Room();

	/**
	 * Returns the meta object for the reference '{@link newClasses.RoomHandler#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Database</em>'.
	 * @see newClasses.RoomHandler#getDatabase()
	 * @see #getRoomHandler()
	 * @generated
	 */
	EReference getRoomHandler_Database();

	/**
	 * Returns the meta object for class '{@link newClasses.RoomHandlerInterface <em>Room Handler Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Handler Interface</em>'.
	 * @see newClasses.RoomHandlerInterface
	 * @generated
	 */
	EClass getRoomHandlerInterface();

	/**
	 * Returns the meta object for the '{@link newClasses.RoomHandlerInterface#changeRoomType(int, java.lang.String) <em>Change Room Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Room Type</em>' operation.
	 * @see newClasses.RoomHandlerInterface#changeRoomType(int, java.lang.String)
	 * @generated
	 */
	EOperation getRoomHandlerInterface__ChangeRoomType__int_String();

	/**
	 * Returns the meta object for the '{@link newClasses.RoomHandlerInterface#removeRoom(int) <em>Remove Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room</em>' operation.
	 * @see newClasses.RoomHandlerInterface#removeRoom(int)
	 * @generated
	 */
	EOperation getRoomHandlerInterface__RemoveRoom__int();

	/**
	 * Returns the meta object for the '{@link newClasses.RoomHandlerInterface#changeRoomPrice(int, int) <em>Change Room Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Room Price</em>' operation.
	 * @see newClasses.RoomHandlerInterface#changeRoomPrice(int, int)
	 * @generated
	 */
	EOperation getRoomHandlerInterface__ChangeRoomPrice__int_int();

	/**
	 * Returns the meta object for the '{@link newClasses.RoomHandlerInterface#addRoom(int, java.lang.String, int) <em>Add Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room</em>' operation.
	 * @see newClasses.RoomHandlerInterface#addRoom(int, java.lang.String, int)
	 * @generated
	 */
	EOperation getRoomHandlerInterface__AddRoom__int_String_int();

	/**
	 * Returns the meta object for class '{@link newClasses.ManagerInterface <em>Manager Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager Interface</em>'.
	 * @see newClasses.ManagerInterface
	 * @generated
	 */
	EClass getManagerInterface();

	/**
	 * Returns the meta object for the '{@link newClasses.ManagerInterface#logout() <em>Logout</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Logout</em>' operation.
	 * @see newClasses.ManagerInterface#logout()
	 * @generated
	 */
	EOperation getManagerInterface__Logout();

	/**
	 * Returns the meta object for the '{@link newClasses.ManagerInterface#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see newClasses.ManagerInterface#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getManagerInterface__Login__String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.ManagerInterface#validateLogin(java.lang.String, java.lang.String) <em>Validate Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Login</em>' operation.
	 * @see newClasses.ManagerInterface#validateLogin(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getManagerInterface__ValidateLogin__String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.ManagerInterface#SessionData() <em>Session Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Session Data</em>' operation.
	 * @see newClasses.ManagerInterface#SessionData()
	 * @generated
	 */
	EOperation getManagerInterface__SessionData();

	/**
	 * Returns the meta object for class '{@link newClasses.Billing <em>Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Billing</em>'.
	 * @see newClasses.Billing
	 * @generated
	 */
	EClass getBilling();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Billing#getTotalCost <em>Total Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Cost</em>'.
	 * @see newClasses.Billing#getTotalCost()
	 * @see #getBilling()
	 * @generated
	 */
	EAttribute getBilling_TotalCost();

	/**
	 * Returns the meta object for the attribute '{@link newClasses.Billing#isPaid <em>Is Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Paid</em>'.
	 * @see newClasses.Billing#isPaid()
	 * @see #getBilling()
	 * @generated
	 */
	EAttribute getBilling_IsPaid();

	/**
	 * Returns the meta object for class '{@link newClasses.BankComponent <em>Bank Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Component</em>'.
	 * @see newClasses.BankComponent
	 * @generated
	 */
	EClass getBankComponent();

	/**
	 * Returns the meta object for class '{@link newClasses.AdministratorProvides <em>Administrator Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator Provides</em>'.
	 * @see newClasses.AdministratorProvides
	 * @generated
	 */
	EClass getAdministratorProvides();

	/**
	 * Returns the meta object for the '{@link newClasses.AdministratorProvides#makeDeposit(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Make Deposit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Deposit</em>' operation.
	 * @see newClasses.AdministratorProvides#makeDeposit(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getAdministratorProvides__MakeDeposit__String_String_int_int_String_String_double();

	/**
	 * Returns the meta object for the '{@link newClasses.AdministratorProvides#addCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Add Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Credit Card</em>' operation.
	 * @see newClasses.AdministratorProvides#addCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdministratorProvides__AddCreditCard__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.AdministratorProvides#removeCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Remove Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Credit Card</em>' operation.
	 * @see newClasses.AdministratorProvides#removeCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdministratorProvides__RemoveCreditCard__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link newClasses.AdministratorProvides#getBalance(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Get Balance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Balance</em>' operation.
	 * @see newClasses.AdministratorProvides#getBalance(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdministratorProvides__GetBalance__String_String_int_int_String_String();

	/**
	 * Returns the meta object for class '{@link newClasses.LoginChecker <em>Login Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Login Checker</em>'.
	 * @see newClasses.LoginChecker
	 * @generated
	 */
	EClass getLoginChecker();

	/**
	 * Returns the meta object for the reference '{@link newClasses.LoginChecker#getManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Manager</em>'.
	 * @see newClasses.LoginChecker#getManager()
	 * @see #getLoginChecker()
	 * @generated
	 */
	EReference getLoginChecker_Manager();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	NewClassesFactory getNewClassesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link newClasses.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.CustomerImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__FIRST_NAME = eINSTANCE.getCustomer_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__LAST_NAME = eINSTANCE.getCustomer_LastName();

		/**
		 * The meta object literal for the '<em><b>Personal Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PERSONAL_NUM = eINSTANCE.getCustomer_PersonalNum();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ADDRESS = eINSTANCE.getCustomer_Address();

		/**
		 * The meta object literal for the '<em><b>Zip Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__ZIP_CODE = eINSTANCE.getCustomer_ZipCode();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__CITY = eINSTANCE.getCustomer_City();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__COUNTRY = eINSTANCE.getCustomer_Country();

		/**
		 * The meta object literal for the '<em><b>Phone Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PHONE_NUM = eINSTANCE.getCustomer_PhoneNum();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EMAIL = eINSTANCE.getCustomer_Email();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__BOOKING = eINSTANCE.getCustomer_Booking();

		/**
		 * The meta object literal for the '<em><b>Booking Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__BOOKING_NUM = eINSTANCE.getCustomer_BookingNum();

		/**
		 * The meta object literal for the '<em><b>Credit Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__CREDIT_CARD = eINSTANCE.getCustomer_CreditCard();

		/**
		 * The meta object literal for the '<em><b>Booking Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__BOOKING_COST = eINSTANCE.getCustomer_BookingCost();

		/**
		 * The meta object literal for the '{@link newClasses.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.BookingImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Check In Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CHECK_IN_DATE = eINSTANCE.getBooking_CheckInDate();

		/**
		 * The meta object literal for the '<em><b>Check Out Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CHECK_OUT_DATE = eINSTANCE.getBooking_CheckOutDate();

		/**
		 * The meta object literal for the '<em><b>Conformation Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CONFORMATION_NUM = eINSTANCE.getBooking_ConformationNum();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__COST = eINSTANCE.getBooking_Cost();

		/**
		 * The meta object literal for the '<em><b>Receipt Creator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__RECEIPT_CREATOR = eINSTANCE.getBooking_ReceiptCreator();

		/**
		 * The meta object literal for the '<em><b>Database Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__DATABASE_HANDLER = eINSTANCE.getBooking_DatabaseHandler();

		/**
		 * The meta object literal for the '<em><b>Room Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ROOM_TYPE = eINSTANCE.getBooking_RoomType();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__SERVICES = eINSTANCE.getBooking_Services();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__IS_PAID = eINSTANCE.getBooking_IsPaid();

		/**
		 * The meta object literal for the '{@link newClasses.impl.ReceiptCreatorImpl <em>Receipt Creator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.ReceiptCreatorImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getReceiptCreator()
		 * @generated
		 */
		EClass RECEIPT_CREATOR = eINSTANCE.getReceiptCreator();

		/**
		 * The meta object literal for the '{@link newClasses.Receipt <em>Receipt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.Receipt
		 * @see newClasses.impl.NewClassesPackageImpl#getReceipt()
		 * @generated
		 */
		EClass RECEIPT = eINSTANCE.getReceipt();

		/**
		 * The meta object literal for the '<em><b>Create Guest Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIPT___CREATE_GUEST_RECEIPT__OBJECT_OBJECT_INT = eINSTANCE.getReceipt__CreateGuestReceipt__Object_Object_int();

		/**
		 * The meta object literal for the '<em><b>Create Customer Receipt</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIPT___CREATE_CUSTOMER_RECEIPT__OBJECT_OBJECT_INT = eINSTANCE.getReceipt__CreateCustomerReceipt__Object_Object_int();

		/**
		 * The meta object literal for the '{@link newClasses.impl.DatabaseImpl <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.DatabaseImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getDatabase()
		 * @generated
		 */
		EClass DATABASE = eINSTANCE.getDatabase();

		/**
		 * The meta object literal for the '{@link newClasses.DB_interface <em>DB interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.DB_interface
		 * @see newClasses.impl.NewClassesPackageImpl#getDB_interface()
		 * @generated
		 */
		EClass DB_INTERFACE = eINSTANCE.getDB_interface();

		/**
		 * The meta object literal for the '<em><b>Register Customer Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DB_INTERFACE___REGISTER_CUSTOMER_PAYMENT__OBJECT_INT = eINSTANCE.getDB_interface__RegisterCustomerPayment__Object_int();

		/**
		 * The meta object literal for the '<em><b>Register Guest Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DB_INTERFACE___REGISTER_GUEST_PAYMENT__OBJECT_INT = eINSTANCE.getDB_interface__RegisterGuestPayment__Object_int();

		/**
		 * The meta object literal for the '<em><b>Store Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DB_INTERFACE___STORE_GUEST__OBJECT = eINSTANCE.getDB_interface__StoreGuest__Object();

		/**
		 * The meta object literal for the '<em><b>Store Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DB_INTERFACE___STORE_BOOKING__OBJECT = eINSTANCE.getDB_interface__StoreBooking__Object();

		/**
		 * The meta object literal for the '<em><b>Store Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DB_INTERFACE___STORE_CUSTOMER__OBJECT = eINSTANCE.getDB_interface__StoreCustomer__Object();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DB_INTERFACE___CONNECT = eINSTANCE.getDB_interface__Connect();

		/**
		 * The meta object literal for the '{@link newClasses.RoomProvider <em>Room Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.RoomProvider
		 * @see newClasses.impl.NewClassesPackageImpl#getRoomProvider()
		 * @generated
		 */
		EClass ROOM_PROVIDER = eINSTANCE.getRoomProvider();

		/**
		 * The meta object literal for the '<em><b>Set Avalibility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_PROVIDER___SET_AVALIBILITY__STRING_BOOLEAN_STRING_STRING = eINSTANCE.getRoomProvider__SetAvalibility__String_boolean_String_String();

		/**
		 * The meta object literal for the '<em><b>Check Avalibility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_PROVIDER___CHECK_AVALIBILITY__STRING_STRING_STRING = eINSTANCE.getRoomProvider__CheckAvalibility__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Date Checker</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_PROVIDER___DATE_CHECKER__STRING_STRING_STRING_STRING = eINSTANCE.getRoomProvider__DateChecker__String_String_String_String();

		/**
		 * The meta object literal for the '{@link newClasses.Biller <em>Biller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.Biller
		 * @see newClasses.impl.NewClassesPackageImpl#getBiller()
		 * @generated
		 */
		EClass BILLER = eINSTANCE.getBiller();

		/**
		 * The meta object literal for the '<em><b>Calculate Cost</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILLER___CALCULATE_COST__STRING_STRING_STRING_STRING = eINSTANCE.getBiller__CalculateCost__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Pay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILLER___PAY__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT_BOOLEAN = eINSTANCE.getBiller__Pay__String_int_String_String_int_int_String_String_int_boolean();

		/**
		 * The meta object literal for the '<em><b>Calculate Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BILLER___CALCULATE_BILL__STRING_INT_INT_BOOLEAN = eINSTANCE.getBiller__CalculateBill__String_int_int_boolean();

		/**
		 * The meta object literal for the '{@link newClasses.Booker <em>Booker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.Booker
		 * @see newClasses.impl.NewClassesPackageImpl#getBooker()
		 * @generated
		 */
		EClass BOOKER = eINSTANCE.getBooker();

		/**
		 * The meta object literal for the '<em><b>Create Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKER___CREATE_BOOKING__STRING_STRING_STRING_STRING = eINSTANCE.getBooker__CreateBooking__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKER___CANCEL_BOOKING__INT = eINSTANCE.getBooker__CancelBooking__int();

		/**
		 * The meta object literal for the '<em><b>Re Book</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKER___RE_BOOK__STRING_INT_STRING_STRING_STRING = eINSTANCE.getBooker__ReBook__String_int_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Generate Confirm Num</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKER___GENERATE_CONFIRM_NUM = eINSTANCE.getBooker__GenerateConfirmNum();

		/**
		 * The meta object literal for the '{@link newClasses.ServiceProvider <em>Service Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.ServiceProvider
		 * @see newClasses.impl.NewClassesPackageImpl#getServiceProvider()
		 * @generated
		 */
		EClass SERVICE_PROVIDER = eINSTANCE.getServiceProvider();

		/**
		 * The meta object literal for the '<em><b>Check Avalibility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_PROVIDER___CHECK_AVALIBILITY__STRING_STRING_STRING = eINSTANCE.getServiceProvider__CheckAvalibility__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Set Avalibility</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_PROVIDER___SET_AVALIBILITY__STRING_BOOLEAN = eINSTANCE.getServiceProvider__SetAvalibility__String_boolean();

		/**
		 * The meta object literal for the '{@link newClasses.Validator <em>Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.Validator
		 * @see newClasses.impl.NewClassesPackageImpl#getValidator()
		 * @generated
		 */
		EClass VALIDATOR = eINSTANCE.getValidator();

		/**
		 * The meta object literal for the '<em><b>Validate Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___VALIDATE_EMAIL__STRING = eINSTANCE.getValidator__ValidateEmail__String();

		/**
		 * The meta object literal for the '<em><b>Validate Phone Num</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___VALIDATE_PHONE_NUM__LONG = eINSTANCE.getValidator__ValidatePhoneNum__long();

		/**
		 * The meta object literal for the '<em><b>Validate Personal Num</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___VALIDATE_PERSONAL_NUM__LONG = eINSTANCE.getValidator__ValidatePersonalNum__long();

		/**
		 * The meta object literal for the '<em><b>Validate Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___VALIDATE_NAMES__STRING_STRING = eINSTANCE.getValidator__ValidateNames__String_String();

		/**
		 * The meta object literal for the '<em><b>Validate Address</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___VALIDATE_ADDRESS__STRING_INT_STRING_STRING = eINSTANCE.getValidator__ValidateAddress__String_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Validate Dates</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___VALIDATE_DATES__STRING_STRING = eINSTANCE.getValidator__ValidateDates__String_String();

		/**
		 * The meta object literal for the '<em><b>Check Date Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___CHECK_DATE_ORDER__STRING_STRING = eINSTANCE.getValidator__CheckDateOrder__String_String();

		/**
		 * The meta object literal for the '<em><b>Check Age Restriction</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___CHECK_AGE_RESTRICTION__LONG = eINSTANCE.getValidator__CheckAgeRestriction__long();

		/**
		 * The meta object literal for the '<em><b>Validate Confirmation Num</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___VALIDATE_CONFIRMATION_NUM__INT = eINSTANCE.getValidator__ValidateConfirmationNum__int();

		/**
		 * The meta object literal for the '<em><b>Check Age</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALIDATOR___CHECK_AGE__INT_INT_INT = eINSTANCE.getValidator__CheckAge__int_int_int();

		/**
		 * The meta object literal for the '{@link newClasses.CustomerProvides <em>Customer Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.CustomerProvides
		 * @see newClasses.impl.NewClassesPackageImpl#getCustomerProvides()
		 * @generated
		 */
		EClass CUSTOMER_PROVIDES = eINSTANCE.getCustomerProvides();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getCustomerProvides__MakePayment__String_String_int_int_String_String_double();

		/**
		 * The meta object literal for the '<em><b>Is Credit Card Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getCustomerProvides__IsCreditCardValid__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '{@link newClasses.impl.CreditCardImpl <em>Credit Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.CreditCardImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getCreditCard()
		 * @generated
		 */
		EClass CREDIT_CARD = eINSTANCE.getCreditCard();

		/**
		 * The meta object literal for the '<em><b>Credit Card Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__CREDIT_CARD_NUMBER = eINSTANCE.getCreditCard_CreditCardNumber();

		/**
		 * The meta object literal for the '<em><b>Cvc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__CVC = eINSTANCE.getCreditCard_Cvc();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__MONTH = eINSTANCE.getCreditCard_Month();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__YEAR = eINSTANCE.getCreditCard_Year();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__FIRST_NAME = eINSTANCE.getCreditCard_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__LAST_NAME = eINSTANCE.getCreditCard_LastName();

		/**
		 * The meta object literal for the '{@link newClasses.impl.GuestImpl <em>Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.GuestImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getGuest()
		 * @generated
		 */
		EClass GUEST = eINSTANCE.getGuest();

		/**
		 * The meta object literal for the '<em><b>Check In Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__CHECK_IN_DATE = eINSTANCE.getGuest_CheckInDate();

		/**
		 * The meta object literal for the '<em><b>Check Out Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__CHECK_OUT_DATE = eINSTANCE.getGuest_CheckOutDate();

		/**
		 * The meta object literal for the '<em><b>Room Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__ROOM_NUM = eINSTANCE.getGuest_RoomNum();

		/**
		 * The meta object literal for the '<em><b>Checked In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__CHECKED_IN = eINSTANCE.getGuest_CheckedIn();

		/**
		 * The meta object literal for the '<em><b>Checked Out</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__CHECKED_OUT = eINSTANCE.getGuest_CheckedOut();

		/**
		 * The meta object literal for the '<em><b>Added Services</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__ADDED_SERVICES = eINSTANCE.getGuest_AddedServices();

		/**
		 * The meta object literal for the '<em><b>Extra Days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__EXTRA_DAYS = eINSTANCE.getGuest_ExtraDays();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__COST = eINSTANCE.getGuest_Cost();

		/**
		 * The meta object literal for the '<em><b>Booking Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__BOOKING_PAID = eINSTANCE.getGuest_BookingPaid();

		/**
		 * The meta object literal for the '{@link newClasses.GuestBiller <em>Guest Biller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.GuestBiller
		 * @see newClasses.impl.NewClassesPackageImpl#getGuestBiller()
		 * @generated
		 */
		EClass GUEST_BILLER = eINSTANCE.getGuestBiller();

		/**
		 * The meta object literal for the '<em><b>Add Service To Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST_BILLER___ADD_SERVICE_TO_BILL__OBJECT_STRING = eINSTANCE.getGuestBiller__AddServiceToBill__Object_String();

		/**
		 * The meta object literal for the '<em><b>Check Out</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST_BILLER___CHECK_OUT__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT = eINSTANCE.getGuestBiller__CheckOut__String_int_String_String_int_int_String_String_int();

		/**
		 * The meta object literal for the '{@link newClasses.GuestInterface <em>Guest Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.GuestInterface
		 * @see newClasses.impl.NewClassesPackageImpl#getGuestInterface()
		 * @generated
		 */
		EClass GUEST_INTERFACE = eINSTANCE.getGuestInterface();

		/**
		 * The meta object literal for the '<em><b>Extend Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST_INTERFACE___EXTEND_STAY__OBJECT_INT_STRING = eINSTANCE.getGuestInterface__ExtendStay__Object_int_String();

		/**
		 * The meta object literal for the '<em><b>Check In</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST_INTERFACE___CHECK_IN__INT_STRING = eINSTANCE.getGuestInterface__CheckIn__int_String();

		/**
		 * The meta object literal for the '<em><b>Change Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST_INTERFACE___CHANGE_ROOM__OBJECT_INT_STRING = eINSTANCE.getGuestInterface__ChangeRoom__Object_int_String();

		/**
		 * The meta object literal for the '{@link newClasses.impl.RoomTypeImpl <em>Room Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.RoomTypeImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getRoomType()
		 * @generated
		 */
		EClass ROOM_TYPE = eINSTANCE.getRoomType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__TYPE = eINSTANCE.getRoomType_Type();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_TYPE__PRICE = eINSTANCE.getRoomType_Price();

		/**
		 * The meta object literal for the '{@link newClasses.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.RoomImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Room Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__ROOM_NUM = eINSTANCE.getRoom_RoomNum();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__STATUS = eINSTANCE.getRoom_Status();

		/**
		 * The meta object literal for the '{@link newClasses.impl.InformationValidatorImpl <em>Information Validator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.InformationValidatorImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getInformationValidator()
		 * @generated
		 */
		EClass INFORMATION_VALIDATOR = eINSTANCE.getInformationValidator();

		/**
		 * The meta object literal for the '{@link newClasses.impl.ServiceHandlerImpl <em>Service Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.ServiceHandlerImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getServiceHandler()
		 * @generated
		 */
		EClass SERVICE_HANDLER = eINSTANCE.getServiceHandler();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_HANDLER__SERVICE = eINSTANCE.getServiceHandler_Service();

		/**
		 * The meta object literal for the '{@link newClasses.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.ServiceImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ID = eINSTANCE.getService_Id();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__STATUS = eINSTANCE.getService_Status();

		/**
		 * The meta object literal for the '{@link newClasses.impl.ServiceTypeImpl <em>Service Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.ServiceTypeImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getServiceType()
		 * @generated
		 */
		EClass SERVICE_TYPE = eINSTANCE.getServiceType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__TYPE = eINSTANCE.getServiceType_Type();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE_TYPE__PRICE = eINSTANCE.getServiceType_Price();

		/**
		 * The meta object literal for the '{@link newClasses.ServiceHandlerInterface <em>Service Handler Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.ServiceHandlerInterface
		 * @see newClasses.impl.NewClassesPackageImpl#getServiceHandlerInterface()
		 * @generated
		 */
		EClass SERVICE_HANDLER_INTERFACE = eINSTANCE.getServiceHandlerInterface();

		/**
		 * The meta object literal for the '<em><b>Change Service Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_HANDLER_INTERFACE___CHANGE_SERVICE_TYPE__INT_STRING = eINSTANCE.getServiceHandlerInterface__ChangeServiceType__int_String();

		/**
		 * The meta object literal for the '<em><b>Remove Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_HANDLER_INTERFACE___REMOVE_SERVICE__INT = eINSTANCE.getServiceHandlerInterface__RemoveService__int();

		/**
		 * The meta object literal for the '<em><b>Change Service Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_HANDLER_INTERFACE___CHANGE_SERVICE_PRICE__INT_INT = eINSTANCE.getServiceHandlerInterface__ChangeServicePrice__int_int();

		/**
		 * The meta object literal for the '<em><b>Add Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SERVICE_HANDLER_INTERFACE___ADD_SERVICE__INT_STRING_INT = eINSTANCE.getServiceHandlerInterface__AddService__int_String_int();

		/**
		 * The meta object literal for the '{@link newClasses.impl.ManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.ManagerImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getManager()
		 * @generated
		 */
		EClass MANAGER = eINSTANCE.getManager();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER__USER_NAME = eINSTANCE.getManager_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANAGER__PASSWORD = eINSTANCE.getManager_Password();

		/**
		 * The meta object literal for the '<em><b>Room Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__ROOM_HANDLER = eINSTANCE.getManager_RoomHandler();

		/**
		 * The meta object literal for the '<em><b>Service Handler</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MANAGER__SERVICE_HANDLER = eINSTANCE.getManager_ServiceHandler();

		/**
		 * The meta object literal for the '{@link newClasses.impl.RoomHandlerImpl <em>Room Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.RoomHandlerImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getRoomHandler()
		 * @generated
		 */
		EClass ROOM_HANDLER = eINSTANCE.getRoomHandler();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_HANDLER__ROOM = eINSTANCE.getRoomHandler_Room();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_HANDLER__DATABASE = eINSTANCE.getRoomHandler_Database();

		/**
		 * The meta object literal for the '{@link newClasses.RoomHandlerInterface <em>Room Handler Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.RoomHandlerInterface
		 * @see newClasses.impl.NewClassesPackageImpl#getRoomHandlerInterface()
		 * @generated
		 */
		EClass ROOM_HANDLER_INTERFACE = eINSTANCE.getRoomHandlerInterface();

		/**
		 * The meta object literal for the '<em><b>Change Room Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLER_INTERFACE___CHANGE_ROOM_TYPE__INT_STRING = eINSTANCE.getRoomHandlerInterface__ChangeRoomType__int_String();

		/**
		 * The meta object literal for the '<em><b>Remove Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLER_INTERFACE___REMOVE_ROOM__INT = eINSTANCE.getRoomHandlerInterface__RemoveRoom__int();

		/**
		 * The meta object literal for the '<em><b>Change Room Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLER_INTERFACE___CHANGE_ROOM_PRICE__INT_INT = eINSTANCE.getRoomHandlerInterface__ChangeRoomPrice__int_int();

		/**
		 * The meta object literal for the '<em><b>Add Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_HANDLER_INTERFACE___ADD_ROOM__INT_STRING_INT = eINSTANCE.getRoomHandlerInterface__AddRoom__int_String_int();

		/**
		 * The meta object literal for the '{@link newClasses.ManagerInterface <em>Manager Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.ManagerInterface
		 * @see newClasses.impl.NewClassesPackageImpl#getManagerInterface()
		 * @generated
		 */
		EClass MANAGER_INTERFACE = eINSTANCE.getManagerInterface();

		/**
		 * The meta object literal for the '<em><b>Logout</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGER_INTERFACE___LOGOUT = eINSTANCE.getManagerInterface__Logout();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGER_INTERFACE___LOGIN__STRING_STRING = eINSTANCE.getManagerInterface__Login__String_String();

		/**
		 * The meta object literal for the '<em><b>Validate Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGER_INTERFACE___VALIDATE_LOGIN__STRING_STRING = eINSTANCE.getManagerInterface__ValidateLogin__String_String();

		/**
		 * The meta object literal for the '<em><b>Session Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MANAGER_INTERFACE___SESSION_DATA = eINSTANCE.getManagerInterface__SessionData();

		/**
		 * The meta object literal for the '{@link newClasses.impl.BillingImpl <em>Billing</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.BillingImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getBilling()
		 * @generated
		 */
		EClass BILLING = eINSTANCE.getBilling();

		/**
		 * The meta object literal for the '<em><b>Total Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING__TOTAL_COST = eINSTANCE.getBilling_TotalCost();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILLING__IS_PAID = eINSTANCE.getBilling_IsPaid();

		/**
		 * The meta object literal for the '{@link newClasses.impl.BankComponentImpl <em>Bank Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.BankComponentImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getBankComponent()
		 * @generated
		 */
		EClass BANK_COMPONENT = eINSTANCE.getBankComponent();

		/**
		 * The meta object literal for the '{@link newClasses.AdministratorProvides <em>Administrator Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.AdministratorProvides
		 * @see newClasses.impl.NewClassesPackageImpl#getAdministratorProvides()
		 * @generated
		 */
		EClass ADMINISTRATOR_PROVIDES = eINSTANCE.getAdministratorProvides();

		/**
		 * The meta object literal for the '<em><b>Make Deposit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getAdministratorProvides__MakeDeposit__String_String_int_int_String_String_double();

		/**
		 * The meta object literal for the '<em><b>Add Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getAdministratorProvides__AddCreditCard__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getAdministratorProvides__RemoveCreditCard__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Balance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getAdministratorProvides__GetBalance__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '{@link newClasses.impl.LoginCheckerImpl <em>Login Checker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see newClasses.impl.LoginCheckerImpl
		 * @see newClasses.impl.NewClassesPackageImpl#getLoginChecker()
		 * @generated
		 */
		EClass LOGIN_CHECKER = eINSTANCE.getLoginChecker();

		/**
		 * The meta object literal for the '<em><b>Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGIN_CHECKER__MANAGER = eINSTANCE.getLoginChecker_Manager();

	}

} //NewClassesPackage
