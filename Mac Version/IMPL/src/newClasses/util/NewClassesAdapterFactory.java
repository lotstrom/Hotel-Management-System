/**
 */
package newClasses.util;

import newClasses.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see newClasses.NewClassesPackage
 * @generated
 */
public class NewClassesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static NewClassesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewClassesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = NewClassesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewClassesSwitch<Adapter> modelSwitch =
		new NewClassesSwitch<Adapter>() {
			@Override
			public Adapter caseCustomer(Customer object) {
				return createCustomerAdapter();
			}
			@Override
			public Adapter caseBooking(Booking object) {
				return createBookingAdapter();
			}
			@Override
			public Adapter caseReceiptCreator(ReceiptCreator object) {
				return createReceiptCreatorAdapter();
			}
			@Override
			public Adapter caseReceipt(Receipt object) {
				return createReceiptAdapter();
			}
			@Override
			public Adapter caseDatabase(Database object) {
				return createDatabaseAdapter();
			}
			@Override
			public Adapter caseDB_interface(DB_interface object) {
				return createDB_interfaceAdapter();
			}
			@Override
			public Adapter caseRoomProvider(RoomProvider object) {
				return createRoomProviderAdapter();
			}
			@Override
			public Adapter caseBiller(Biller object) {
				return createBillerAdapter();
			}
			@Override
			public Adapter caseBooker(Booker object) {
				return createBookerAdapter();
			}
			@Override
			public Adapter caseServiceProvider(ServiceProvider object) {
				return createServiceProviderAdapter();
			}
			@Override
			public Adapter caseValidator(Validator object) {
				return createValidatorAdapter();
			}
			@Override
			public Adapter caseCustomerProvides(CustomerProvides object) {
				return createCustomerProvidesAdapter();
			}
			@Override
			public Adapter caseCreditCard(CreditCard object) {
				return createCreditCardAdapter();
			}
			@Override
			public Adapter caseGuest(Guest object) {
				return createGuestAdapter();
			}
			@Override
			public Adapter caseGuestBiller(GuestBiller object) {
				return createGuestBillerAdapter();
			}
			@Override
			public Adapter caseGuestInterface(GuestInterface object) {
				return createGuestInterfaceAdapter();
			}
			@Override
			public Adapter caseRoomType(RoomType object) {
				return createRoomTypeAdapter();
			}
			@Override
			public Adapter caseRoom(Room object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseInformationValidator(InformationValidator object) {
				return createInformationValidatorAdapter();
			}
			@Override
			public Adapter caseServiceHandler(ServiceHandler object) {
				return createServiceHandlerAdapter();
			}
			@Override
			public Adapter caseService(Service object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseServiceType(ServiceType object) {
				return createServiceTypeAdapter();
			}
			@Override
			public Adapter caseServiceHandlerInterface(ServiceHandlerInterface object) {
				return createServiceHandlerInterfaceAdapter();
			}
			@Override
			public Adapter caseManager(Manager object) {
				return createManagerAdapter();
			}
			@Override
			public Adapter caseRoomHandler(RoomHandler object) {
				return createRoomHandlerAdapter();
			}
			@Override
			public Adapter caseRoomHandlerInterface(RoomHandlerInterface object) {
				return createRoomHandlerInterfaceAdapter();
			}
			@Override
			public Adapter caseManagerInterface(ManagerInterface object) {
				return createManagerInterfaceAdapter();
			}
			@Override
			public Adapter caseBilling(Billing object) {
				return createBillingAdapter();
			}
			@Override
			public Adapter caseBankComponent(BankComponent object) {
				return createBankComponentAdapter();
			}
			@Override
			public Adapter caseAdministratorProvides(AdministratorProvides object) {
				return createAdministratorProvidesAdapter();
			}
			@Override
			public Adapter caseLoginChecker(LoginChecker object) {
				return createLoginCheckerAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link newClasses.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.Customer
	 * @generated
	 */
	public Adapter createCustomerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.Booking
	 * @generated
	 */
	public Adapter createBookingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.ReceiptCreator <em>Receipt Creator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.ReceiptCreator
	 * @generated
	 */
	public Adapter createReceiptCreatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.Receipt <em>Receipt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.Receipt
	 * @generated
	 */
	public Adapter createReceiptAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.Database <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.Database
	 * @generated
	 */
	public Adapter createDatabaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.DB_interface <em>DB interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.DB_interface
	 * @generated
	 */
	public Adapter createDB_interfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.RoomProvider <em>Room Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.RoomProvider
	 * @generated
	 */
	public Adapter createRoomProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.Biller <em>Biller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.Biller
	 * @generated
	 */
	public Adapter createBillerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.Booker <em>Booker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.Booker
	 * @generated
	 */
	public Adapter createBookerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.ServiceProvider <em>Service Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.ServiceProvider
	 * @generated
	 */
	public Adapter createServiceProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.Validator <em>Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.Validator
	 * @generated
	 */
	public Adapter createValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.CustomerProvides <em>Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.CustomerProvides
	 * @generated
	 */
	public Adapter createCustomerProvidesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.CreditCard <em>Credit Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.CreditCard
	 * @generated
	 */
	public Adapter createCreditCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.Guest
	 * @generated
	 */
	public Adapter createGuestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.GuestBiller <em>Guest Biller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.GuestBiller
	 * @generated
	 */
	public Adapter createGuestBillerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.GuestInterface <em>Guest Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.GuestInterface
	 * @generated
	 */
	public Adapter createGuestInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.RoomType <em>Room Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.RoomType
	 * @generated
	 */
	public Adapter createRoomTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.Room
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.InformationValidator <em>Information Validator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.InformationValidator
	 * @generated
	 */
	public Adapter createInformationValidatorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.ServiceHandler <em>Service Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.ServiceHandler
	 * @generated
	 */
	public Adapter createServiceHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.ServiceType <em>Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.ServiceType
	 * @generated
	 */
	public Adapter createServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.ServiceHandlerInterface <em>Service Handler Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.ServiceHandlerInterface
	 * @generated
	 */
	public Adapter createServiceHandlerInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.Manager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.Manager
	 * @generated
	 */
	public Adapter createManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.RoomHandler <em>Room Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.RoomHandler
	 * @generated
	 */
	public Adapter createRoomHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.RoomHandlerInterface <em>Room Handler Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.RoomHandlerInterface
	 * @generated
	 */
	public Adapter createRoomHandlerInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.ManagerInterface <em>Manager Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.ManagerInterface
	 * @generated
	 */
	public Adapter createManagerInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.Billing <em>Billing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.Billing
	 * @generated
	 */
	public Adapter createBillingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.BankComponent <em>Bank Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.BankComponent
	 * @generated
	 */
	public Adapter createBankComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.AdministratorProvides <em>Administrator Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.AdministratorProvides
	 * @generated
	 */
	public Adapter createAdministratorProvidesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link newClasses.LoginChecker <em>Login Checker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see newClasses.LoginChecker
	 * @generated
	 */
	public Adapter createLoginCheckerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //NewClassesAdapterFactory
