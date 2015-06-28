/**
 */
package newClasses.impl;

import java.lang.reflect.InvocationTargetException;

import javax.xml.soap.SOAPException;

import newClasses.Billing;
import newClasses.CustomerProvides;
import newClasses.GuestBiller;
import newClasses.NewClassesPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Billing</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link newClasses.impl.BillingImpl#getTotalCost <em>Total Cost</em>}</li>
 *   <li>{@link newClasses.impl.BillingImpl#isPaid <em>Is Paid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillingImpl extends MinimalEObjectImpl.Container implements
		Billing {
	/**
	 * The default value of the '{@link #getTotalCost() <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected static final int TOTAL_COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTotalCost() <em>Total Cost</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getTotalCost()
	 * @generated
	 * @ordered
	 */
	protected int totalCost = TOTAL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #isPaid() <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PAID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaid() <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected boolean isPaid = IS_PAID_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BillingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewClassesPackage.Literals.BILLING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getTotalCost() {
		return totalCost;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalCost(int newTotalCost) {
		int oldTotalCost = totalCost;
		totalCost = newTotalCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.BILLING__TOTAL_COST, oldTotalCost, totalCost));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaid() {
		return isPaid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPaid(boolean newIsPaid) {
		boolean oldIsPaid = isPaid;
		isPaid = newIsPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.BILLING__IS_PAID, oldIsPaid, isPaid));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int calculateCost(String checkInDate, String checkOutDate,
			String roomType, String services) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @author Ale Lotstršm
	 */
	public boolean pay(String addedServices, int extraDays,
			String creditCardNum, String cvc, int month, int year,
			String firstName, String lastName, int bookingCost, boolean isPaid) {
		this.totalCost = calculateBill(addedServices, extraDays, bookingCost,
				isPaid);
		double cost = (double) this.totalCost;
		this.isPaid = false;

		try {
			// Access Banking component
			se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires banking = se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires
					.instance();

			if (banking.isCreditCardValid(creditCardNum, cvc, month, year,
					firstName, lastName)) {
				System.out.println("Valid credit card");
			} else {
				System.out.println("Invalid credit card");
			}

			// Make a payment
			if (banking.makePayment(creditCardNum, cvc, month, year, firstName,
					lastName, cost)) {
				System.out.println("Payment of " + this.totalCost
						+ " successfully processed");
				this.isPaid = true;
			} else {
				System.out
						.println("Payment failed - invalid credit card or insufficient credit");
			}

		} catch (SOAPException e) {
			System.err
					.println("Error occurred while communicating with the bank");
			e.printStackTrace();
		}
		return this.isPaid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @author Ale Lotstršm
	 */
	public int calculateBill(String addedServices, int extraDays, int bookingCost, boolean isPaid) {
		//Missing calls for receiving cost of added services and extra days
		int cost = bookingCost;
		if (isPaid == false) {
			System.out.println("Total cost is: " + cost);
			return cost;
		}
		else {			
			cost = 0;
			
		return cost;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @generated
	 */
	public boolean checkOut(String checkOutDate, int roomNum, String creditCardNum, String cvc, int month, int year, String firstName, String lastName, int cost) {
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
			case NewClassesPackage.BILLING__TOTAL_COST:
				return getTotalCost();
			case NewClassesPackage.BILLING__IS_PAID:
				return isPaid();
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
			case NewClassesPackage.BILLING__TOTAL_COST:
				setTotalCost((Integer)newValue);
				return;
			case NewClassesPackage.BILLING__IS_PAID:
				setIsPaid((Boolean)newValue);
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
			case NewClassesPackage.BILLING__TOTAL_COST:
				setTotalCost(TOTAL_COST_EDEFAULT);
				return;
			case NewClassesPackage.BILLING__IS_PAID:
				setIsPaid(IS_PAID_EDEFAULT);
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
			case NewClassesPackage.BILLING__TOTAL_COST:
				return totalCost != TOTAL_COST_EDEFAULT;
			case NewClassesPackage.BILLING__IS_PAID:
				return isPaid != IS_PAID_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == CustomerProvides.class) {
			switch (baseOperationID) {
				case NewClassesPackage.CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE: return NewClassesPackage.BILLING___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE;
				case NewClassesPackage.CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING: return NewClassesPackage.BILLING___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING;
				default: return -1;
			}
		}
		if (baseClass == GuestBiller.class) {
			switch (baseOperationID) {
				case NewClassesPackage.GUEST_BILLER___ADD_SERVICE_TO_BILL__OBJECT_STRING: return NewClassesPackage.BILLING___ADD_SERVICE_TO_BILL__OBJECT_STRING;
				case NewClassesPackage.GUEST_BILLER___CHECK_OUT__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT: return NewClassesPackage.BILLING___CHECK_OUT__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT;
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
			case NewClassesPackage.BILLING___CALCULATE_COST__STRING_STRING_STRING_STRING:
				return calculateCost((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case NewClassesPackage.BILLING___PAY__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT_BOOLEAN:
				return pay((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7), (Integer)arguments.get(8), (Boolean)arguments.get(9));
			case NewClassesPackage.BILLING___CALCULATE_BILL__STRING_INT_INT_BOOLEAN:
				return calculateBill((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Boolean)arguments.get(3));
			case NewClassesPackage.BILLING___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE:
				return makePayment((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5), (Double)arguments.get(6));
			case NewClassesPackage.BILLING___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING:
				return isCreditCardValid((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case NewClassesPackage.BILLING___ADD_SERVICE_TO_BILL__OBJECT_STRING:
				return addServiceToBill(arguments.get(0), (String)arguments.get(1));
			case NewClassesPackage.BILLING___CHECK_OUT__STRING_INT_STRING_STRING_INT_INT_STRING_STRING_INT:
				return checkOut((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4), (Integer)arguments.get(5), (String)arguments.get(6), (String)arguments.get(7), (Integer)arguments.get(8));
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
		result.append(" (totalCost: ");
		result.append(totalCost);
		result.append(", isPaid: ");
		result.append(isPaid);
		result.append(')');
		return result.toString();
	}

} // BillingImpl
