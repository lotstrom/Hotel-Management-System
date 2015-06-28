/**
 */
package newClasses.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import newClasses.Database;
import newClasses.NewClassesPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Database</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DatabaseImpl extends MinimalEObjectImpl.Container implements
		Database {
	public String url = "jdbc:mysql://localhost:3306/";
	public String dbName = "Hms_schema";
	public String driver = "com.mysql.jdbc.Driver";
	public String user = "root";
	public String password = "";
	public PreparedStatement myStmt = null;
	public ResultSet myRs = null;
	public java.sql.Connection myConn = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DatabaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewClassesPackage.Literals.DATABASE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void registerCustomerPayment(Object customer, int bookingCost) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void registerGuestPayment(Object guest, int totalBillCost) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void storeGuest(Object guest) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void storeBooking(Object booking) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void storeCustomer(Object customer) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */

	public void connect() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		try {
			Class.forName(driver).newInstance();
			myConn = DriverManager.getConnection(url + dbName, user, password);

		} catch (Exception ex) {
			System.out.println("Error in connection!!!");
			ex.printStackTrace();
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
		case NewClassesPackage.DATABASE___REGISTER_CUSTOMER_PAYMENT__OBJECT_INT:
			registerCustomerPayment(arguments.get(0),
					(Integer) arguments.get(1));
			return null;
		case NewClassesPackage.DATABASE___REGISTER_GUEST_PAYMENT__OBJECT_INT:
			registerGuestPayment(arguments.get(0), (Integer) arguments.get(1));
			return null;
		case NewClassesPackage.DATABASE___STORE_GUEST__OBJECT:
			storeGuest(arguments.get(0));
			return null;
		case NewClassesPackage.DATABASE___STORE_BOOKING__OBJECT:
			storeBooking(arguments.get(0));
			return null;
		case NewClassesPackage.DATABASE___STORE_CUSTOMER__OBJECT:
			storeCustomer(arguments.get(0));
			return null;
		case NewClassesPackage.DATABASE___CONNECT:
			connect();
			return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // DatabaseImpl
