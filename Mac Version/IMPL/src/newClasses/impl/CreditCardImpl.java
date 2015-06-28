/**
 */
package newClasses.impl;

import newClasses.CreditCard;
import newClasses.NewClassesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Credit Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link newClasses.impl.CreditCardImpl#getCreditCardNumber <em>Credit Card Number</em>}</li>
 *   <li>{@link newClasses.impl.CreditCardImpl#getCvc <em>Cvc</em>}</li>
 *   <li>{@link newClasses.impl.CreditCardImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link newClasses.impl.CreditCardImpl#getYear <em>Year</em>}</li>
 *   <li>{@link newClasses.impl.CreditCardImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link newClasses.impl.CreditCardImpl#getLastName <em>Last Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CreditCardImpl extends MinimalEObjectImpl.Container implements CreditCard {
	/**
	 * The default value of the '{@link #getCreditCardNumber() <em>Credit Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String CREDIT_CARD_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreditCardNumber() <em>Credit Card Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCardNumber()
	 * @generated
	 * @ordered
	 */
	protected String creditCardNumber = CREDIT_CARD_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCvc() <em>Cvc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvc()
	 * @generated
	 * @ordered
	 */
	protected static final String CVC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCvc() <em>Cvc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCvc()
	 * @generated
	 * @ordered
	 */
	protected String cvc = CVC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected static final int MONTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonth()
	 * @generated
	 * @ordered
	 */
	protected int month = MONTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditCardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewClassesPackage.Literals.CREDIT_CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCardNumber(String newCreditCardNumber) {
		String oldCreditCardNumber = creditCardNumber;
		creditCardNumber = newCreditCardNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CREDIT_CARD__CREDIT_CARD_NUMBER, oldCreditCardNumber, creditCardNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCvc() {
		return cvc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCvc(String newCvc) {
		String oldCvc = cvc;
		cvc = newCvc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CREDIT_CARD__CVC, oldCvc, cvc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonth(int newMonth) {
		int oldMonth = month;
		month = newMonth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CREDIT_CARD__MONTH, oldMonth, month));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CREDIT_CARD__YEAR, oldYear, year));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CREDIT_CARD__FIRST_NAME, oldFirstName, firstName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.CREDIT_CARD__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewClassesPackage.CREDIT_CARD__CREDIT_CARD_NUMBER:
				return getCreditCardNumber();
			case NewClassesPackage.CREDIT_CARD__CVC:
				return getCvc();
			case NewClassesPackage.CREDIT_CARD__MONTH:
				return getMonth();
			case NewClassesPackage.CREDIT_CARD__YEAR:
				return getYear();
			case NewClassesPackage.CREDIT_CARD__FIRST_NAME:
				return getFirstName();
			case NewClassesPackage.CREDIT_CARD__LAST_NAME:
				return getLastName();
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
			case NewClassesPackage.CREDIT_CARD__CREDIT_CARD_NUMBER:
				setCreditCardNumber((String)newValue);
				return;
			case NewClassesPackage.CREDIT_CARD__CVC:
				setCvc((String)newValue);
				return;
			case NewClassesPackage.CREDIT_CARD__MONTH:
				setMonth((Integer)newValue);
				return;
			case NewClassesPackage.CREDIT_CARD__YEAR:
				setYear((Integer)newValue);
				return;
			case NewClassesPackage.CREDIT_CARD__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case NewClassesPackage.CREDIT_CARD__LAST_NAME:
				setLastName((String)newValue);
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
			case NewClassesPackage.CREDIT_CARD__CREDIT_CARD_NUMBER:
				setCreditCardNumber(CREDIT_CARD_NUMBER_EDEFAULT);
				return;
			case NewClassesPackage.CREDIT_CARD__CVC:
				setCvc(CVC_EDEFAULT);
				return;
			case NewClassesPackage.CREDIT_CARD__MONTH:
				setMonth(MONTH_EDEFAULT);
				return;
			case NewClassesPackage.CREDIT_CARD__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case NewClassesPackage.CREDIT_CARD__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case NewClassesPackage.CREDIT_CARD__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
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
			case NewClassesPackage.CREDIT_CARD__CREDIT_CARD_NUMBER:
				return CREDIT_CARD_NUMBER_EDEFAULT == null ? creditCardNumber != null : !CREDIT_CARD_NUMBER_EDEFAULT.equals(creditCardNumber);
			case NewClassesPackage.CREDIT_CARD__CVC:
				return CVC_EDEFAULT == null ? cvc != null : !CVC_EDEFAULT.equals(cvc);
			case NewClassesPackage.CREDIT_CARD__MONTH:
				return month != MONTH_EDEFAULT;
			case NewClassesPackage.CREDIT_CARD__YEAR:
				return year != YEAR_EDEFAULT;
			case NewClassesPackage.CREDIT_CARD__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case NewClassesPackage.CREDIT_CARD__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
		}
		return super.eIsSet(featureID);
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
		result.append(" (creditCardNumber: ");
		result.append(creditCardNumber);
		result.append(", cvc: ");
		result.append(cvc);
		result.append(", month: ");
		result.append(month);
		result.append(", year: ");
		result.append(year);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(')');
		return result.toString();
	}

} //CreditCardImpl
