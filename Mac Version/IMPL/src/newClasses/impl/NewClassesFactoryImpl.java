/**
 */
package newClasses.impl;

import newClasses.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NewClassesFactoryImpl extends EFactoryImpl implements NewClassesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NewClassesFactory init() {
		try {
			NewClassesFactory theNewClassesFactory = (NewClassesFactory)EPackage.Registry.INSTANCE.getEFactory(NewClassesPackage.eNS_URI);
			if (theNewClassesFactory != null) {
				return theNewClassesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new NewClassesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewClassesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case NewClassesPackage.CUSTOMER: return createCustomer();
			case NewClassesPackage.BOOKING: return createBooking();
			case NewClassesPackage.RECEIPT_CREATOR: return createReceiptCreator();
			case NewClassesPackage.DATABASE: return createDatabase();
			case NewClassesPackage.CREDIT_CARD: return createCreditCard();
			case NewClassesPackage.GUEST: return createGuest();
			case NewClassesPackage.ROOM_TYPE: return createRoomType();
			case NewClassesPackage.ROOM: return createRoom();
			case NewClassesPackage.INFORMATION_VALIDATOR: return createInformationValidator();
			case NewClassesPackage.SERVICE_HANDLER: return createServiceHandler();
			case NewClassesPackage.SERVICE: return createService();
			case NewClassesPackage.SERVICE_TYPE: return createServiceType();
			case NewClassesPackage.MANAGER: return createManager();
			case NewClassesPackage.ROOM_HANDLER: return createRoomHandler();
			case NewClassesPackage.BILLING: return createBilling();
			case NewClassesPackage.BANK_COMPONENT: return createBankComponent();
			case NewClassesPackage.LOGIN_CHECKER: return createLoginChecker();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Booking createBooking() {
		BookingImpl booking = new BookingImpl();
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiptCreator createReceiptCreator() {
		ReceiptCreatorImpl receiptCreator = new ReceiptCreatorImpl();
		return receiptCreator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Database createDatabase() {
		DatabaseImpl database = new DatabaseImpl();
		return database;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard createCreditCard() {
		CreditCardImpl creditCard = new CreditCardImpl();
		return creditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest createGuest() {
		GuestImpl guest = new GuestImpl();
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomType createRoomType() {
		RoomTypeImpl roomType = new RoomTypeImpl();
		return roomType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room createRoom() {
		RoomImpl room = new RoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationValidator createInformationValidator() {
		InformationValidatorImpl informationValidator = new InformationValidatorImpl();
		return informationValidator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceHandler createServiceHandler() {
		ServiceHandlerImpl serviceHandler = new ServiceHandlerImpl();
		return serviceHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceType createServiceType() {
		ServiceTypeImpl serviceType = new ServiceTypeImpl();
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager createManager() {
		ManagerImpl manager = new ManagerImpl();
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomHandler createRoomHandler() {
		RoomHandlerImpl roomHandler = new RoomHandlerImpl();
		return roomHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Billing createBilling() {
		BillingImpl billing = new BillingImpl();
		return billing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankComponent createBankComponent() {
		BankComponentImpl bankComponent = new BankComponentImpl();
		return bankComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoginChecker createLoginChecker() {
		LoginCheckerImpl loginChecker = new LoginCheckerImpl();
		return loginChecker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewClassesPackage getNewClassesPackage() {
		return (NewClassesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static NewClassesPackage getPackage() {
		return NewClassesPackage.eINSTANCE;
	}

} //NewClassesFactoryImpl
