/**
 */
package newClasses.impl;

import java.lang.reflect.InvocationTargetException;

import newClasses.NewClassesPackage;
import newClasses.ReceiptCreator;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receipt Creator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ReceiptCreatorImpl extends MinimalEObjectImpl.Container implements ReceiptCreator {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiptCreatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewClassesPackage.Literals.RECEIPT_CREATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createGuestReceipt(Object guest, Object booking, int totalBillCost) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createCustomerReceipt(Object customer, Object booking, int bookingCost) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NewClassesPackage.RECEIPT_CREATOR___CREATE_GUEST_RECEIPT__OBJECT_OBJECT_INT:
				createGuestReceipt(arguments.get(0), arguments.get(1), (Integer)arguments.get(2));
				return null;
			case NewClassesPackage.RECEIPT_CREATOR___CREATE_CUSTOMER_RECEIPT__OBJECT_OBJECT_INT:
				createCustomerReceipt(arguments.get(0), arguments.get(1), (Integer)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReceiptCreatorImpl
