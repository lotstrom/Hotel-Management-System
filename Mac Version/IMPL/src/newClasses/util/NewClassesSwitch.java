/**
 */
package newClasses.util;

import newClasses.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see newClasses.NewClassesPackage
 * @generated
 */
public class NewClassesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NewClassesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewClassesSwitch() {
		if (modelPackage == null) {
			modelPackage = NewClassesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case NewClassesPackage.CUSTOMER: {
				Customer customer = (Customer)theEObject;
				T result = caseCustomer(customer);
				if (result == null) result = caseBooker(customer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.BOOKING: {
				Booking booking = (Booking)theEObject;
				T result = caseBooking(booking);
				if (result == null) result = caseRoomProvider(booking);
				if (result == null) result = caseBiller(booking);
				if (result == null) result = caseBooker(booking);
				if (result == null) result = caseServiceProvider(booking);
				if (result == null) result = caseValidator(booking);
				if (result == null) result = caseCustomerProvides(booking);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.RECEIPT_CREATOR: {
				ReceiptCreator receiptCreator = (ReceiptCreator)theEObject;
				T result = caseReceiptCreator(receiptCreator);
				if (result == null) result = caseReceipt(receiptCreator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.RECEIPT: {
				Receipt receipt = (Receipt)theEObject;
				T result = caseReceipt(receipt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.DATABASE: {
				Database database = (Database)theEObject;
				T result = caseDatabase(database);
				if (result == null) result = caseDB_interface(database);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.DB_INTERFACE: {
				DB_interface dB_interface = (DB_interface)theEObject;
				T result = caseDB_interface(dB_interface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.ROOM_PROVIDER: {
				RoomProvider roomProvider = (RoomProvider)theEObject;
				T result = caseRoomProvider(roomProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.BILLER: {
				Biller biller = (Biller)theEObject;
				T result = caseBiller(biller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.BOOKER: {
				Booker booker = (Booker)theEObject;
				T result = caseBooker(booker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.SERVICE_PROVIDER: {
				ServiceProvider serviceProvider = (ServiceProvider)theEObject;
				T result = caseServiceProvider(serviceProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.VALIDATOR: {
				Validator validator = (Validator)theEObject;
				T result = caseValidator(validator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.CUSTOMER_PROVIDES: {
				CustomerProvides customerProvides = (CustomerProvides)theEObject;
				T result = caseCustomerProvides(customerProvides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.CREDIT_CARD: {
				CreditCard creditCard = (CreditCard)theEObject;
				T result = caseCreditCard(creditCard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.GUEST: {
				Guest guest = (Guest)theEObject;
				T result = caseGuest(guest);
				if (result == null) result = caseCustomer(guest);
				if (result == null) result = caseGuestBiller(guest);
				if (result == null) result = caseGuestInterface(guest);
				if (result == null) result = caseBooker(guest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.GUEST_BILLER: {
				GuestBiller guestBiller = (GuestBiller)theEObject;
				T result = caseGuestBiller(guestBiller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.GUEST_INTERFACE: {
				GuestInterface guestInterface = (GuestInterface)theEObject;
				T result = caseGuestInterface(guestInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.ROOM_TYPE: {
				RoomType roomType = (RoomType)theEObject;
				T result = caseRoomType(roomType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.ROOM: {
				Room room = (Room)theEObject;
				T result = caseRoom(room);
				if (result == null) result = caseRoomType(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.INFORMATION_VALIDATOR: {
				InformationValidator informationValidator = (InformationValidator)theEObject;
				T result = caseInformationValidator(informationValidator);
				if (result == null) result = caseValidator(informationValidator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.SERVICE_HANDLER: {
				ServiceHandler serviceHandler = (ServiceHandler)theEObject;
				T result = caseServiceHandler(serviceHandler);
				if (result == null) result = caseServiceProvider(serviceHandler);
				if (result == null) result = caseServiceHandlerInterface(serviceHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = caseServiceType(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.SERVICE_TYPE: {
				ServiceType serviceType = (ServiceType)theEObject;
				T result = caseServiceType(serviceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.SERVICE_HANDLER_INTERFACE: {
				ServiceHandlerInterface serviceHandlerInterface = (ServiceHandlerInterface)theEObject;
				T result = caseServiceHandlerInterface(serviceHandlerInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.MANAGER: {
				Manager manager = (Manager)theEObject;
				T result = caseManager(manager);
				if (result == null) result = caseManagerInterface(manager);
				if (result == null) result = caseRoomHandlerInterface(manager);
				if (result == null) result = caseServiceHandlerInterface(manager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.ROOM_HANDLER: {
				RoomHandler roomHandler = (RoomHandler)theEObject;
				T result = caseRoomHandler(roomHandler);
				if (result == null) result = caseRoomProvider(roomHandler);
				if (result == null) result = caseRoomHandlerInterface(roomHandler);
				if (result == null) result = caseGuestInterface(roomHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.ROOM_HANDLER_INTERFACE: {
				RoomHandlerInterface roomHandlerInterface = (RoomHandlerInterface)theEObject;
				T result = caseRoomHandlerInterface(roomHandlerInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.MANAGER_INTERFACE: {
				ManagerInterface managerInterface = (ManagerInterface)theEObject;
				T result = caseManagerInterface(managerInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.BILLING: {
				Billing billing = (Billing)theEObject;
				T result = caseBilling(billing);
				if (result == null) result = caseBiller(billing);
				if (result == null) result = caseCustomerProvides(billing);
				if (result == null) result = caseGuestBiller(billing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.BANK_COMPONENT: {
				BankComponent bankComponent = (BankComponent)theEObject;
				T result = caseBankComponent(bankComponent);
				if (result == null) result = caseCustomerProvides(bankComponent);
				if (result == null) result = caseAdministratorProvides(bankComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.ADMINISTRATOR_PROVIDES: {
				AdministratorProvides administratorProvides = (AdministratorProvides)theEObject;
				T result = caseAdministratorProvides(administratorProvides);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case NewClassesPackage.LOGIN_CHECKER: {
				LoginChecker loginChecker = (LoginChecker)theEObject;
				T result = caseLoginChecker(loginChecker);
				if (result == null) result = caseManagerInterface(loginChecker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomer(Customer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booking</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooking(Booking object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receipt Creator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receipt Creator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiptCreator(ReceiptCreator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receipt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receipt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceipt(Receipt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Database</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Database</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDatabase(Database object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DB interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DB interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDB_interface(DB_interface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomProvider(RoomProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Biller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Biller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBiller(Biller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Booker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Booker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBooker(Booker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceProvider(ServiceProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidator(Validator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomerProvides(CustomerProvides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credit Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credit Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreditCard(CreditCard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuest(Guest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest Biller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest Biller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuestBiller(GuestBiller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Guest Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guest Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuestInterface(GuestInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomType(RoomType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoom(Room object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Information Validator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Information Validator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformationValidator(InformationValidator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceHandler(ServiceHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseService(Service object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceType(ServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Handler Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Handler Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceHandlerInterface(ServiceHandlerInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManager(Manager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomHandler(RoomHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room Handler Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room Handler Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoomHandlerInterface(RoomHandlerInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManagerInterface(ManagerInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Billing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Billing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBilling(Billing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBankComponent(BankComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrator Provides</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrator Provides</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministratorProvides(AdministratorProvides object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Login Checker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Login Checker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoginChecker(LoginChecker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //NewClassesSwitch
