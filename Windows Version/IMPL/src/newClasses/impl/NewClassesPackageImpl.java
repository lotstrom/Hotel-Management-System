/**
 */
package newClasses.impl;

import newClasses.AdministratorProvides;
import newClasses.BankComponent;
import newClasses.Biller;
import newClasses.Billing;
import newClasses.Booker;
import newClasses.Booking;
import newClasses.CreditCard;
import newClasses.Customer;
import newClasses.CustomerProvides;
import newClasses.DB_interface;
import newClasses.Database;
import newClasses.Guest;
import newClasses.GuestBiller;
import newClasses.GuestInterface;
import newClasses.InformationValidator;
import newClasses.LoginChecker;
import newClasses.Manager;
import newClasses.ManagerInterface;
import newClasses.NewClassesFactory;
import newClasses.NewClassesPackage;
import newClasses.Receipt;
import newClasses.ReceiptCreator;
import newClasses.Room;
import newClasses.RoomHandler;
import newClasses.RoomHandlerInterface;
import newClasses.RoomProvider;
import newClasses.RoomType;
import newClasses.Service;
import newClasses.ServiceHandler;
import newClasses.ServiceHandlerInterface;
import newClasses.ServiceProvider;
import newClasses.ServiceType;
import newClasses.Validator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NewClassesPackageImpl extends EPackageImpl implements NewClassesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiptCreatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dB_interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerProvidesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestBillerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informationValidatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceHandlerInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomHandlerInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass managerInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administratorProvidesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loginCheckerEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see newClasses.NewClassesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NewClassesPackageImpl() {
		super(eNS_URI, NewClassesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link NewClassesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NewClassesPackage init() {
		if (isInited) return (NewClassesPackage)EPackage.Registry.INSTANCE.getEPackage(NewClassesPackage.eNS_URI);

		// Obtain or create and register package
		NewClassesPackageImpl theNewClassesPackage = (NewClassesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NewClassesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NewClassesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theNewClassesPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theNewClassesPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNewClassesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NewClassesPackage.eNS_URI, theNewClassesPackage);
		return theNewClassesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_FirstName() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_LastName() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_PersonalNum() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Address() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_ZipCode() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_City() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Country() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_PhoneNum() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Email() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_Booking() {
		return (EReference)customerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_BookingNum() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_CreditCard() {
		return (EReference)customerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_BookingCost() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_CheckInDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_CheckOutDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_ConformationNum() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Cost() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_ReceiptCreator() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_DatabaseHandler() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_RoomType() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Services() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_IsPaid() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiptCreator() {
		return receiptCreatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceipt() {
		return receiptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceipt__CreateGuestReceipt__Object_Object_int() {
		return receiptEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceipt__CreateCustomerReceipt__Object_Object_int() {
		return receiptEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDatabase() {
		return databaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDB_interface() {
		return dB_interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDB_interface__RegisterCustomerPayment__Object_int() {
		return dB_interfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDB_interface__RegisterGuestPayment__Object_int() {
		return dB_interfaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDB_interface__StoreGuest__Object() {
		return dB_interfaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDB_interface__StoreBooking__Object() {
		return dB_interfaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDB_interface__StoreCustomer__Object() {
		return dB_interfaceEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDB_interface__Connect() {
		return dB_interfaceEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomProvider() {
		return roomProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomProvider__SetAvalibility__String_boolean_String_String() {
		return roomProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomProvider__CheckAvalibility__String_String_String() {
		return roomProviderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomProvider__DateChecker__String_String_String_String() {
		return roomProviderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBiller() {
		return billerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBiller__CalculateCost__String_String_String_String() {
		return billerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBiller__Pay__String_int_String_String_int_int_String_String_int_boolean() {
		return billerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBiller__CalculateBill__String_int_int_boolean() {
		return billerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooker() {
		return bookerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooker__CreateBooking__String_String_String_String() {
		return bookerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooker__CancelBooking__int() {
		return bookerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooker__ReBook__String_int_String_String_String() {
		return bookerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooker__GenerateConfirmNum() {
		return bookerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceProvider() {
		return serviceProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceProvider__CheckAvalibility__String_String_String() {
		return serviceProviderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceProvider__SetAvalibility__String_boolean() {
		return serviceProviderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidator() {
		return validatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValidator__ValidateEmail__String() {
		return validatorEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValidator__ValidatePhoneNum__long() {
		return validatorEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValidator__ValidatePersonalNum__long() {
		return validatorEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValidator__ValidateNames__String_String() {
		return validatorEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValidator__ValidateAddress__String_int_String_String() {
		return validatorEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValidator__ValidateDates__String_String() {
		return validatorEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValidator__CheckDateOrder__String_String() {
		return validatorEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValidator__CheckAgeRestriction__long() {
		return validatorEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValidator__ValidateConfirmationNum__int() {
		return validatorEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getValidator__CheckAge__int_int_int() {
		return validatorEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerProvides() {
		return customerProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerProvides__MakePayment__String_String_int_int_String_String_double() {
		return customerProvidesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomerProvides__IsCreditCardValid__String_String_int_int_String_String() {
		return customerProvidesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreditCard() {
		return creditCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCard_CreditCardNumber() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCard_Cvc() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCard_Month() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCard_Year() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCard_FirstName() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCard_LastName() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuest() {
		return guestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_CheckInDate() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_CheckOutDate() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_RoomNum() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_CheckedIn() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_CheckedOut() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_AddedServices() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_ExtraDays() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Cost() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_BookingPaid() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuestBiller() {
		return guestBillerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuestBiller__AddServiceToBill__Object_String() {
		return guestBillerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuestBiller__CheckOut__String_int_String_String_int_int_String_String_int() {
		return guestBillerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuestInterface() {
		return guestInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuestInterface__ExtendStay__Object_int_String() {
		return guestInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuestInterface__CheckIn__int_String() {
		return guestInterfaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuestInterface__ChangeRoom__Object_int_String() {
		return guestInterfaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomType() {
		return roomTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Type() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomType_Price() {
		return (EAttribute)roomTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_RoomNum() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoom_Status() {
		return (EAttribute)roomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformationValidator() {
		return informationValidatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceHandler() {
		return serviceHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceHandler_Service() {
		return (EReference)serviceHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Id() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Status() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceType() {
		return serviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceType_Type() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceType_Price() {
		return (EAttribute)serviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceHandlerInterface() {
		return serviceHandlerInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceHandlerInterface__ChangeServiceType__int_String() {
		return serviceHandlerInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceHandlerInterface__RemoveService__int() {
		return serviceHandlerInterfaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceHandlerInterface__ChangeServicePrice__int_int() {
		return serviceHandlerInterfaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceHandlerInterface__AddService__int_String_int() {
		return serviceHandlerInterfaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManager() {
		return managerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManager_UserName() {
		return (EAttribute)managerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManager_Password() {
		return (EAttribute)managerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_RoomHandler() {
		return (EReference)managerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManager_ServiceHandler() {
		return (EReference)managerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomHandler() {
		return roomHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomHandler_Room() {
		return (EReference)roomHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomHandler_Database() {
		return (EReference)roomHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomHandlerInterface() {
		return roomHandlerInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandlerInterface__ChangeRoomType__int_String() {
		return roomHandlerInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandlerInterface__RemoveRoom__int() {
		return roomHandlerInterfaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandlerInterface__ChangeRoomPrice__int_int() {
		return roomHandlerInterfaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomHandlerInterface__AddRoom__int_String_int() {
		return roomHandlerInterfaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagerInterface() {
		return managerInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManagerInterface__Logout() {
		return managerInterfaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManagerInterface__Login__String_String() {
		return managerInterfaceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManagerInterface__ValidateLogin__String_String() {
		return managerInterfaceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getManagerInterface__SessionData() {
		return managerInterfaceEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBilling() {
		return billingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBilling_TotalCost() {
		return (EAttribute)billingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBilling_IsPaid() {
		return (EAttribute)billingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBankComponent() {
		return bankComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministratorProvides() {
		return administratorProvidesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdministratorProvides__MakeDeposit__String_String_int_int_String_String_double() {
		return administratorProvidesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdministratorProvides__AddCreditCard__String_String_int_int_String_String() {
		return administratorProvidesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdministratorProvides__RemoveCreditCard__String_String_int_int_String_String() {
		return administratorProvidesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdministratorProvides__GetBalance__String_String_int_int_String_String() {
		return administratorProvidesEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoginChecker() {
		return loginCheckerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoginChecker_Manager() {
		return (EReference)loginCheckerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewClassesFactory getNewClassesFactory() {
		return (NewClassesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__FIRST_NAME);
		createEAttribute(customerEClass, CUSTOMER__LAST_NAME);
		createEAttribute(customerEClass, CUSTOMER__PERSONAL_NUM);
		createEAttribute(customerEClass, CUSTOMER__ADDRESS);
		createEAttribute(customerEClass, CUSTOMER__ZIP_CODE);
		createEAttribute(customerEClass, CUSTOMER__CITY);
		createEAttribute(customerEClass, CUSTOMER__COUNTRY);
		createEAttribute(customerEClass, CUSTOMER__PHONE_NUM);
		createEAttribute(customerEClass, CUSTOMER__EMAIL);
		createEReference(customerEClass, CUSTOMER__BOOKING);
		createEAttribute(customerEClass, CUSTOMER__BOOKING_NUM);
		createEReference(customerEClass, CUSTOMER__CREDIT_CARD);
		createEAttribute(customerEClass, CUSTOMER__BOOKING_COST);

		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__CHECK_IN_DATE);
		createEAttribute(bookingEClass, BOOKING__CHECK_OUT_DATE);
		createEAttribute(bookingEClass, BOOKING__CONFORMATION_NUM);
		createEAttribute(bookingEClass, BOOKING__COST);
		createEReference(bookingEClass, BOOKING__RECEIPT_CREATOR);
		createEReference(bookingEClass, BOOKING__DATABASE_HANDLER);
		createEAttribute(bookingEClass, BOOKING__ROOM_TYPE);
		createEAttribute(bookingEClass, BOOKING__SERVICES);
		createEAttribute(bookingEClass, BOOKING__IS_PAID);

		receiptCreatorEClass = createEClass(RECEIPT_CREATOR);

		receiptEClass = createEClass(RECEIPT);
		createEOperation(receiptEClass, RECEIPT___CREATE_GUEST_RECEIPT__OBJECT_OBJECT_INT);
		createEOperation(receiptEClass, RECEIPT___CREATE_CUSTOMER_RECEIPT__OBJECT_OBJECT_INT);

		databaseEClass = createEClass(DATABASE);

		dB_interfaceEClass = createEClass(DB_INTERFACE);
		createEOperation(dB_interfaceEClass, DB_INTERFACE___REGISTER_CUSTOMER_PAYMENT__OBJECT_INT);
		createEOperation(dB_interfaceEClass, DB_INTERFACE___REGISTER_GUEST_PAYMENT__OBJECT_INT);
		createEOperation(dB_interfaceEClass, DB_INTERFACE___STORE_GUEST__OBJECT);
		createEOperation(dB_interfaceEClass, DB_INTERFACE___STORE_BOOKING__OBJECT);
		createEOperation(dB_interfaceEClass, DB_INTERFACE___STORE_CUSTOMER__OBJECT);
		createEOperation(dB_interfaceEClass, DB_INTERFACE___CONNECT);

		roomProviderEClass = createEClass(ROOM_PROVIDER);
		createEOperation(roomProviderEClass, ROOM_PROVIDER___SET_AVALIBILITY__STRING_BOOLEAN_STRING_STRING);
		createEOperation(roomProviderEClass, ROOM_PROVIDER___CHECK_AVALIBILITY__STRING_STRING_STRING);
		createEOperation(roomProviderEClass, ROOM_PROVIDER___DATE_CHECKER__STRING_STRING_STRING_STRING);

		billerEClass = createEClass(BILLER);
		createEOperation(billerEClass, BILLER___CALCULATE_COST__STRING_STRING_STRING_STRING);
		createEOperation(billerEClass, BILLER___PAY__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT_BOOLEAN);
		createEOperation(billerEClass, BILLER___CALCULATE_BILL__STRING_INT_INT_BOOLEAN);

		bookerEClass = createEClass(BOOKER);
		createEOperation(bookerEClass, BOOKER___CREATE_BOOKING__STRING_STRING_STRING_STRING);
		createEOperation(bookerEClass, BOOKER___CANCEL_BOOKING__INT);
		createEOperation(bookerEClass, BOOKER___RE_BOOK__STRING_INT_STRING_STRING_STRING);
		createEOperation(bookerEClass, BOOKER___GENERATE_CONFIRM_NUM);

		serviceProviderEClass = createEClass(SERVICE_PROVIDER);
		createEOperation(serviceProviderEClass, SERVICE_PROVIDER___CHECK_AVALIBILITY__STRING_STRING_STRING);
		createEOperation(serviceProviderEClass, SERVICE_PROVIDER___SET_AVALIBILITY__STRING_BOOLEAN);

		validatorEClass = createEClass(VALIDATOR);
		createEOperation(validatorEClass, VALIDATOR___VALIDATE_EMAIL__STRING);
		createEOperation(validatorEClass, VALIDATOR___VALIDATE_PHONE_NUM__LONG);
		createEOperation(validatorEClass, VALIDATOR___VALIDATE_PERSONAL_NUM__LONG);
		createEOperation(validatorEClass, VALIDATOR___VALIDATE_NAMES__STRING_STRING);
		createEOperation(validatorEClass, VALIDATOR___VALIDATE_ADDRESS__STRING_INT_STRING_STRING);
		createEOperation(validatorEClass, VALIDATOR___VALIDATE_DATES__STRING_STRING);
		createEOperation(validatorEClass, VALIDATOR___CHECK_DATE_ORDER__STRING_STRING);
		createEOperation(validatorEClass, VALIDATOR___CHECK_AGE_RESTRICTION__LONG);
		createEOperation(validatorEClass, VALIDATOR___VALIDATE_CONFIRMATION_NUM__INT);
		createEOperation(validatorEClass, VALIDATOR___CHECK_AGE__INT_INT_INT);

		customerProvidesEClass = createEClass(CUSTOMER_PROVIDES);
		createEOperation(customerProvidesEClass, CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE);
		createEOperation(customerProvidesEClass, CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING);

		creditCardEClass = createEClass(CREDIT_CARD);
		createEAttribute(creditCardEClass, CREDIT_CARD__CREDIT_CARD_NUMBER);
		createEAttribute(creditCardEClass, CREDIT_CARD__CVC);
		createEAttribute(creditCardEClass, CREDIT_CARD__MONTH);
		createEAttribute(creditCardEClass, CREDIT_CARD__YEAR);
		createEAttribute(creditCardEClass, CREDIT_CARD__FIRST_NAME);
		createEAttribute(creditCardEClass, CREDIT_CARD__LAST_NAME);

		guestEClass = createEClass(GUEST);
		createEAttribute(guestEClass, GUEST__CHECK_IN_DATE);
		createEAttribute(guestEClass, GUEST__CHECK_OUT_DATE);
		createEAttribute(guestEClass, GUEST__ROOM_NUM);
		createEAttribute(guestEClass, GUEST__CHECKED_IN);
		createEAttribute(guestEClass, GUEST__CHECKED_OUT);
		createEAttribute(guestEClass, GUEST__ADDED_SERVICES);
		createEAttribute(guestEClass, GUEST__EXTRA_DAYS);
		createEAttribute(guestEClass, GUEST__COST);
		createEAttribute(guestEClass, GUEST__BOOKING_PAID);

		guestBillerEClass = createEClass(GUEST_BILLER);
		createEOperation(guestBillerEClass, GUEST_BILLER___ADD_SERVICE_TO_BILL__OBJECT_STRING);
		createEOperation(guestBillerEClass, GUEST_BILLER___CHECK_OUT__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT);

		guestInterfaceEClass = createEClass(GUEST_INTERFACE);
		createEOperation(guestInterfaceEClass, GUEST_INTERFACE___EXTEND_STAY__OBJECT_INT_STRING);
		createEOperation(guestInterfaceEClass, GUEST_INTERFACE___CHECK_IN__INT_STRING);
		createEOperation(guestInterfaceEClass, GUEST_INTERFACE___CHANGE_ROOM__OBJECT_INT_STRING);

		roomTypeEClass = createEClass(ROOM_TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__TYPE);
		createEAttribute(roomTypeEClass, ROOM_TYPE__PRICE);

		roomEClass = createEClass(ROOM);
		createEAttribute(roomEClass, ROOM__ROOM_NUM);
		createEAttribute(roomEClass, ROOM__STATUS);

		informationValidatorEClass = createEClass(INFORMATION_VALIDATOR);

		serviceHandlerEClass = createEClass(SERVICE_HANDLER);
		createEReference(serviceHandlerEClass, SERVICE_HANDLER__SERVICE);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__ID);
		createEAttribute(serviceEClass, SERVICE__STATUS);

		serviceTypeEClass = createEClass(SERVICE_TYPE);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__TYPE);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__PRICE);

		serviceHandlerInterfaceEClass = createEClass(SERVICE_HANDLER_INTERFACE);
		createEOperation(serviceHandlerInterfaceEClass, SERVICE_HANDLER_INTERFACE___CHANGE_SERVICE_TYPE__INT_STRING);
		createEOperation(serviceHandlerInterfaceEClass, SERVICE_HANDLER_INTERFACE___REMOVE_SERVICE__INT);
		createEOperation(serviceHandlerInterfaceEClass, SERVICE_HANDLER_INTERFACE___CHANGE_SERVICE_PRICE__INT_INT);
		createEOperation(serviceHandlerInterfaceEClass, SERVICE_HANDLER_INTERFACE___ADD_SERVICE__INT_STRING_INT);

		managerEClass = createEClass(MANAGER);
		createEAttribute(managerEClass, MANAGER__USER_NAME);
		createEAttribute(managerEClass, MANAGER__PASSWORD);
		createEReference(managerEClass, MANAGER__ROOM_HANDLER);
		createEReference(managerEClass, MANAGER__SERVICE_HANDLER);

		roomHandlerEClass = createEClass(ROOM_HANDLER);
		createEReference(roomHandlerEClass, ROOM_HANDLER__ROOM);
		createEReference(roomHandlerEClass, ROOM_HANDLER__DATABASE);

		roomHandlerInterfaceEClass = createEClass(ROOM_HANDLER_INTERFACE);
		createEOperation(roomHandlerInterfaceEClass, ROOM_HANDLER_INTERFACE___CHANGE_ROOM_TYPE__INT_STRING);
		createEOperation(roomHandlerInterfaceEClass, ROOM_HANDLER_INTERFACE___REMOVE_ROOM__INT);
		createEOperation(roomHandlerInterfaceEClass, ROOM_HANDLER_INTERFACE___CHANGE_ROOM_PRICE__INT_INT);
		createEOperation(roomHandlerInterfaceEClass, ROOM_HANDLER_INTERFACE___ADD_ROOM__INT_STRING_INT);

		managerInterfaceEClass = createEClass(MANAGER_INTERFACE);
		createEOperation(managerInterfaceEClass, MANAGER_INTERFACE___LOGOUT);
		createEOperation(managerInterfaceEClass, MANAGER_INTERFACE___LOGIN__STRING_STRING);
		createEOperation(managerInterfaceEClass, MANAGER_INTERFACE___VALIDATE_LOGIN__STRING_STRING);
		createEOperation(managerInterfaceEClass, MANAGER_INTERFACE___SESSION_DATA);

		billingEClass = createEClass(BILLING);
		createEAttribute(billingEClass, BILLING__TOTAL_COST);
		createEAttribute(billingEClass, BILLING__IS_PAID);

		bankComponentEClass = createEClass(BANK_COMPONENT);

		administratorProvidesEClass = createEClass(ADMINISTRATOR_PROVIDES);
		createEOperation(administratorProvidesEClass, ADMINISTRATOR_PROVIDES___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE);
		createEOperation(administratorProvidesEClass, ADMINISTRATOR_PROVIDES___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(administratorProvidesEClass, ADMINISTRATOR_PROVIDES___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(administratorProvidesEClass, ADMINISTRATOR_PROVIDES___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING);

		loginCheckerEClass = createEClass(LOGIN_CHECKER);
		createEReference(loginCheckerEClass, LOGIN_CHECKER__MANAGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		customerEClass.getESuperTypes().add(this.getBooker());
		bookingEClass.getESuperTypes().add(this.getRoomProvider());
		bookingEClass.getESuperTypes().add(this.getBiller());
		bookingEClass.getESuperTypes().add(this.getBooker());
		bookingEClass.getESuperTypes().add(this.getServiceProvider());
		bookingEClass.getESuperTypes().add(this.getValidator());
		bookingEClass.getESuperTypes().add(this.getCustomerProvides());
		receiptCreatorEClass.getESuperTypes().add(this.getReceipt());
		databaseEClass.getESuperTypes().add(this.getDB_interface());
		guestEClass.getESuperTypes().add(this.getCustomer());
		guestEClass.getESuperTypes().add(this.getGuestBiller());
		guestEClass.getESuperTypes().add(this.getGuestInterface());
		roomEClass.getESuperTypes().add(this.getRoomType());
		informationValidatorEClass.getESuperTypes().add(this.getValidator());
		serviceHandlerEClass.getESuperTypes().add(this.getServiceProvider());
		serviceHandlerEClass.getESuperTypes().add(this.getServiceHandlerInterface());
		serviceEClass.getESuperTypes().add(this.getServiceType());
		managerEClass.getESuperTypes().add(this.getManagerInterface());
		managerEClass.getESuperTypes().add(this.getRoomHandlerInterface());
		managerEClass.getESuperTypes().add(this.getServiceHandlerInterface());
		roomHandlerEClass.getESuperTypes().add(this.getRoomProvider());
		roomHandlerEClass.getESuperTypes().add(this.getRoomHandlerInterface());
		roomHandlerEClass.getESuperTypes().add(this.getGuestInterface());
		billingEClass.getESuperTypes().add(this.getBiller());
		billingEClass.getESuperTypes().add(this.getCustomerProvides());
		billingEClass.getESuperTypes().add(this.getGuestBiller());
		bankComponentEClass.getESuperTypes().add(this.getCustomerProvides());
		bankComponentEClass.getESuperTypes().add(this.getAdministratorProvides());
		loginCheckerEClass.getESuperTypes().add(this.getManagerInterface());

		// Initialize classes, features, and operations; add parameters
		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_LastName(), theTypesPackage.getString(), "lastName", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_PersonalNum(), ecorePackage.getELong(), "personalNum", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Address(), theTypesPackage.getString(), "address", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_ZipCode(), theTypesPackage.getInteger(), "zipCode", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_City(), theTypesPackage.getString(), "city", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Country(), theTypesPackage.getString(), "country", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_PhoneNum(), ecorePackage.getELong(), "phoneNum", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Email(), theTypesPackage.getString(), "email", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCustomer_Booking(), this.getBooking(), null, "booking", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_BookingNum(), theTypesPackage.getInteger(), "bookingNum", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCustomer_CreditCard(), this.getCreditCard(), null, "creditCard", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_BookingCost(), theTypesPackage.getInteger(), "bookingCost", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_CheckInDate(), theTypesPackage.getString(), "checkInDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_CheckOutDate(), theTypesPackage.getString(), "checkOutDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_ConformationNum(), theTypesPackage.getInteger(), "conformationNum", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Cost(), theTypesPackage.getInteger(), "cost", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_ReceiptCreator(), this.getReceiptCreator(), null, "receiptCreator", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_DatabaseHandler(), this.getDatabase(), null, "databaseHandler", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_RoomType(), theTypesPackage.getString(), "roomType", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Services(), theTypesPackage.getString(), "services", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_IsPaid(), theTypesPackage.getBoolean(), "isPaid", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(receiptCreatorEClass, ReceiptCreator.class, "ReceiptCreator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(receiptEClass, Receipt.class, "Receipt", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getReceipt__CreateGuestReceipt__Object_Object_int(), null, "createGuestReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "totalBillCost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getReceipt__CreateCustomerReceipt__Object_Object_int(), null, "createCustomerReceipt", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "bookingCost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(databaseEClass, Database.class, "Database", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dB_interfaceEClass, DB_interface.class, "DB_interface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getDB_interface__RegisterCustomerPayment__Object_int(), null, "registerCustomerPayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "bookingCost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDB_interface__RegisterGuestPayment__Object_int(), null, "registerGuestPayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "totalBillCost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDB_interface__StoreGuest__Object(), null, "storeGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDB_interface__StoreBooking__Object(), null, "storeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "booking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getDB_interface__StoreCustomer__Object(), null, "storeCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "customer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getDB_interface__Connect(), null, "connect", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomProviderEClass, RoomProvider.class, "RoomProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRoomProvider__SetAvalibility__String_boolean_String_String(), null, "setAvalibility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "status", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomProvider__CheckAvalibility__String_String_String(), theTypesPackage.getBoolean(), "checkAvalibility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomProvider__DateChecker__String_String_String_String(), theTypesPackage.getBoolean(), "dateChecker", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "DBcheckIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "DBcheckOut", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(billerEClass, Biller.class, "Biller", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBiller__CalculateCost__String_String_String_String(), theTypesPackage.getInteger(), "calculateCost", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "services", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBiller__Pay__String_int_String_String_int_int_String_String_int_boolean(), theTypesPackage.getBoolean(), "pay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "addedServices", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "extraDays", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "creditCardNum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "cvc", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "month", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "year", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "bookingCost", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "isPaid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBiller__CalculateBill__String_int_int_boolean(), theTypesPackage.getInteger(), "calculateBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "addedServices", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "extraDays", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "bookingCost", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "isPaid", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookerEClass, Booker.class, "Booker", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getBooker__CreateBooking__String_String_String_String(), theTypesPackage.getInteger(), "createBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "services", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooker__CancelBooking__int(), null, "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "conformationNum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBooker__ReBook__String_int_String_String_String(), null, "reBook", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "comformationNum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooker__GenerateConfirmNum(), theTypesPackage.getInteger(), "generateConfirmNum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(serviceProviderEClass, ServiceProvider.class, "ServiceProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getServiceProvider__CheckAvalibility__String_String_String(), theTypesPackage.getBoolean(), "checkAvalibility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getServiceProvider__SetAvalibility__String_boolean(), null, "setAvalibility", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "service", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "status", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(validatorEClass, Validator.class, "Validator", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getValidator__ValidateEmail__String(), theTypesPackage.getBoolean(), "validateEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__ValidatePhoneNum__long(), theTypesPackage.getBoolean(), "validatePhoneNum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "phoneNum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__ValidatePersonalNum__long(), theTypesPackage.getBoolean(), "validatePersonalNum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "personalNum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__ValidateNames__String_String(), theTypesPackage.getBoolean(), "validateNames", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__ValidateAddress__String_int_String_String(), theTypesPackage.getBoolean(), "validateAddress", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "address", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "zipCode", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "city", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "country", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__ValidateDates__String_String(), theTypesPackage.getBoolean(), "validateDates", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__CheckDateOrder__String_String(), theTypesPackage.getBoolean(), "checkDateOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__CheckAgeRestriction__long(), theTypesPackage.getBoolean(), "checkAgeRestriction", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getELong(), "personalNum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__ValidateConfirmationNum__int(), theTypesPackage.getBoolean(), "validateConfirmationNum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "conformationNum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getValidator__CheckAge__int_int_int(), theTypesPackage.getInteger(), "checkAge", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "year", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "day", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "month", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(customerProvidesEClass, CustomerProvides.class, "CustomerProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getCustomerProvides__MakePayment__String_String_int_int_String_String_double(), ecorePackage.getEBoolean(), "makePayment", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "sum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getCustomerProvides__IsCreditCardValid__String_String_int_int_String_String(), ecorePackage.getEBoolean(), "isCreditCardValid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(creditCardEClass, CreditCard.class, "CreditCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreditCard_CreditCardNumber(), theTypesPackage.getString(), "creditCardNumber", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_Cvc(), theTypesPackage.getString(), "cvc", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_Month(), theTypesPackage.getInteger(), "month", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_Year(), theTypesPackage.getInteger(), "year", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_LastName(), theTypesPackage.getString(), "lastName", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guestEClass, Guest.class, "Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuest_CheckInDate(), theTypesPackage.getString(), "checkInDate", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_CheckOutDate(), theTypesPackage.getString(), "checkOutDate", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_RoomNum(), theTypesPackage.getInteger(), "roomNum", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_CheckedIn(), theTypesPackage.getBoolean(), "checkedIn", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_CheckedOut(), theTypesPackage.getBoolean(), "checkedOut", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_AddedServices(), theTypesPackage.getString(), "addedServices", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_ExtraDays(), theTypesPackage.getInteger(), "extraDays", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_Cost(), theTypesPackage.getInteger(), "cost", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_BookingPaid(), theTypesPackage.getBoolean(), "bookingPaid", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guestBillerEClass, GuestBiller.class, "GuestBiller", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getGuestBiller__AddServiceToBill__Object_String(), theTypesPackage.getInteger(), "addServiceToBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGuestBiller__CheckOut__String_int_String_String_int_int_String_String_int(), theTypesPackage.getBoolean(), "checkOut", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "creditCardNum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "cvc", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "month", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "year", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "cost", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(guestInterfaceEClass, GuestInterface.class, "GuestInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getGuestInterface__ExtendStay__Object_int_String(), null, "extendStay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "newCheckOutDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGuestInterface__CheckIn__int_String(), theTypesPackage.getInteger(), "checkIn", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "conformationNum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "checkInDate", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getGuestInterface__ChangeRoom__Object_int_String(), null, "changeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "guest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "newRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(roomTypeEClass, RoomType.class, "RoomType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomType_Type(), theTypesPackage.getString(), "type", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomType_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, RoomType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoom_RoomNum(), theTypesPackage.getInteger(), "roomNum", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoom_Status(), theTypesPackage.getBoolean(), "status", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(informationValidatorEClass, InformationValidator.class, "InformationValidator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(serviceHandlerEClass, ServiceHandler.class, "ServiceHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceHandler_Service(), this.getService(), null, "service", null, 1, 1, ServiceHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_Status(), theTypesPackage.getBoolean(), "status", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceType_Type(), theTypesPackage.getString(), "type", null, 1, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getServiceType_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceHandlerInterfaceEClass, ServiceHandlerInterface.class, "ServiceHandlerInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getServiceHandlerInterface__ChangeServiceType__int_String(), null, "changeServiceType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "newType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getServiceHandlerInterface__RemoveService__int(), null, "removeService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getServiceHandlerInterface__ChangeServicePrice__int_int(), null, "changeServicePrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "newPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getServiceHandlerInterface__AddService__int_String_int(), null, "addService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "type", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(managerEClass, Manager.class, "Manager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManager_UserName(), theTypesPackage.getString(), "userName", null, 1, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getManager_Password(), theTypesPackage.getString(), "password", null, 1, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getManager_RoomHandler(), this.getRoomHandler(), null, "roomHandler", null, 1, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getManager_ServiceHandler(), this.getServiceHandler(), null, "serviceHandler", null, 1, 1, Manager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomHandlerEClass, RoomHandler.class, "RoomHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomHandler_Room(), this.getRoom(), null, "room", null, 1, 1, RoomHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoomHandler_Database(), this.getDatabase(), null, "database", null, 1, 1, RoomHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomHandlerInterfaceEClass, RoomHandlerInterface.class, "RoomHandlerInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getRoomHandlerInterface__ChangeRoomType__int_String(), null, "changeRoomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomHandlerInterface__RemoveRoom__int(), null, "removeRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomHandlerInterface__ChangeRoomPrice__int_int(), null, "changeRoomPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "newPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomHandlerInterface__AddRoom__int_String_int(), null, "addRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "roomNum", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(managerInterfaceEClass, ManagerInterface.class, "ManagerInterface", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getManagerInterface__Logout(), null, "logout", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getManagerInterface__Login__String_String(), null, "login", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "userName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getManagerInterface__ValidateLogin__String_String(), theTypesPackage.getBoolean(), "validateLogin", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "userName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "password", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getManagerInterface__SessionData(), null, "SessionData", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(billingEClass, Billing.class, "Billing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBilling_TotalCost(), theTypesPackage.getInteger(), "totalCost", null, 1, 1, Billing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBilling_IsPaid(), theTypesPackage.getBoolean(), "isPaid", null, 1, 1, Billing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(bankComponentEClass, BankComponent.class, "BankComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(administratorProvidesEClass, AdministratorProvides.class, "AdministratorProvides", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getAdministratorProvides__MakeDeposit__String_String_int_int_String_String_double(), ecorePackage.getEDouble(), "makeDeposit", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "sum", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdministratorProvides__AddCreditCard__String_String_int_int_String_String(), ecorePackage.getEBoolean(), "addCreditCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdministratorProvides__RemoveCreditCard__String_String_int_int_String_String(), ecorePackage.getEBoolean(), "removeCreditCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getAdministratorProvides__GetBalance__String_String_int_int_String_String(), ecorePackage.getEDouble(), "getBalance", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(loginCheckerEClass, LoginChecker.class, "LoginChecker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoginChecker_Manager(), this.getManager(), null, "manager", null, 1, 1, LoginChecker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (getBooking_RoomType(), 
		   source, 
		   new String[] {
			 "originalName", "roomType "
		   });
	}

} //NewClassesPackageImpl
