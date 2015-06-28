/**
 */
package newClasses.impl;

import java.lang.reflect.InvocationTargetException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import newClasses.InformationValidator;
import newClasses.NewClassesPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Information Validator</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class InformationValidatorImpl extends MinimalEObjectImpl.Container
		implements InformationValidator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected InformationValidatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewClassesPackage.Literals.INFORMATION_VALIDATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @author Ale Lotstršm
	 */
	public boolean validateEmail(String email) {
		Pattern emailPattern = Pattern
				.compile("[a-zA-Z0-9[!#$%&'()*+,/\\-_\\.\"]]+@[a-zA-Z0-9[!#$%&'()*+,/\\-_\"]]+\\.[a-zA-Z0-9[!#$%&'()*+,/\\-_\"\\.]]+");
		Matcher m = emailPattern.matcher(email);
		if (m.matches()) {
			System.out.println("Email is valid");
			return true;
		} else {
			System.out.println("Email is invalid");
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @author Ale Lotstršm
	 */
	public boolean validatePhoneNum(long phoneNum) {
		int length = (int) (Math.log10(phoneNum) + 1);
		if (length == 10) {
			System.out.println("Phone number is valid. ");
			return true;
		} else {
			System.out
					.println("Invalid phone number, It needs to be 10 digits long.");
			return false;
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @author Ale Lotstršm
	 */
	public boolean validatePersonalNum(long personalNum) {
		int length = (int) (Math.log10(personalNum) + 1);
		if (length == 10) {
			System.out.println("Personal number is valid.");
			boolean age = checkAgeRestriction((int) personalNum);
			if (age == true) {
				return true;
			} else {
				return false;
			}
		} else {
			System.out
					.println("Invalid personal number, It needs to be 10 digits long.");
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @author Ale Lotstršm
	 */
	public boolean validateNames(String firstName, String lastName) {
		if (firstName.matches("[a-zA-Z]+$") && lastName.matches("[a-zA-Z]+$")) {
			System.out.println("Valid names");
			return true;
		} else {
			System.out.println("Name is invalid, please check your input! ");
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @author Ale Lotstršm
	 */
	public boolean validateAddress(String address, int zipCode, String city,
			String country) {
		int length = (int) (Math.log10(zipCode) + 1);

		if (length == 5 && address.matches("[a-zA-Z]+$")
				&& city.matches("[a-zA-Z]+$") && country.matches("[a-zA-Z]+$")) {
			System.out.println("Adress valididated");
			return true;
		} else {
			System.out
					.println("Adress is invalid, please check your input! Names can not contain other characters than letters and zip code needs to be exactly 5 digits.");
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 * @author Ale Lotstršm
	 */
	public boolean validateDates(String checkInDate, String checkOutDate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		sdf.setLenient(false);
		boolean checkIn = false;
		boolean checkOut = false;
		try {
			sdf.parse(checkInDate);
			System.out.println("Check-in date is valid");
			checkIn = true;
		} catch (ParseException ex) {
			System.out.println("Invalid check-in date");
		}
		try {
			sdf.parse(checkOutDate);
			System.out.println("Check-out date is valid");
			checkOut = true;
		} catch (ParseException ex) {
			System.out.println("Invalid check-out date");
		}
		if (checkIn == true && checkOut == true) {
			boolean order = checkDateOrder(checkInDate, checkOutDate);
			if (order == true) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkDateOrder(String checkInDate, String checkOutDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		// throw new UnsupportedOperationException();
		try{
		    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		    Date today = sdf.parse(sdf.format(new Date()));
		    
		            
		                
		                   Date CheckIn = sdf.parse(checkInDate);
		                   Date CheckOut = sdf.parse(checkOutDate);
		                   
		                
		        	if(CheckIn.compareTo(CheckOut)>0){
		        		System.out.println("ERROR: Checkindate is after Checkoutdate");
		        		return false;
		        	}else if(CheckIn.compareTo(CheckOut)<0 && CheckIn.after(today) || CheckIn.compareTo(today)==0){
		        		System.out.println("Correct: Checkindate is before Checkoutdate and both dates are in the present/future");
		        		return true;
		        	}else if(CheckIn.compareTo(CheckOut)==0){
		        		System.out.println("Error:Cant have checkin and checkout on the same date");
		        		return false;
		        	}else {return false;}
		 
		    	}catch(ParseException ex){
		    		ex.printStackTrace();
		    	}    return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkAgeRestriction(long personalNum) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean checkAgeRestriction(int personalNum) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		// throw new UnsupportedOperationException();

		String personNr = "" + personalNum;
		String Pnr = "";

		for (int i = 0; i < personNr.length(); i++) {
			if (personNr.charAt(i) != '-') {
				Pnr += personNr.charAt(i);
			}
		}

		int years = Integer.parseInt(Pnr.substring(0, 2));
		int months = Integer.parseInt(Pnr.substring(2, 4));
		int days = Integer.parseInt(Pnr.substring(4, 6));

		int[] array = new int[Pnr.length()];
		for (int i = 0; i < Pnr.length(); i++) {
			array[i] = Pnr.charAt(i);
		}

		/*if (checkAge(years, months, days) > 18 || checkAge(years, months, days) == 18) {
			System.out.println("LEGAL AGE");
			return true;
		} else {
			System.out.println("ILLEGAL AGE");
			return false;
		}*/
return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean validateConfirmationNum(int confirmationNum) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		DatabaseImpl db;
		PreparedStatement myStmt;
		ResultSet myRs;
		
		try {
			db = DatabaseImpl.class.newInstance();
			db.connect();
			myStmt = db.myConn.prepareStatement("select bNum from Rooms where bNum=?");
			myStmt.setInt(1, confirmationNum);
			myRs = myStmt.executeQuery();
			
			if(myRs.next()){
				if(myRs.getInt("bNum")==confirmationNum){
				System.out.println("confirmation number exists");
				return true;}
				else{
					System.out.println("non existing confirmation number");}
			}
			else{
				System.out.println("non existing record for this number");
				return false;
			}
			
			}
			
		catch (Exception e) {
			System.out.println("could not find the database");
		}
		return false;
	
}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int checkAge(int year, int day, int month) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		int amountYear = 0;
		int fullYear = 0;
		int monthYear = 0;
		int dayYear = 0;

		if (year > 12) {
			fullYear = 1900 + year;
		} else {
			fullYear = 2000 + year;
		}
		amountYear = 2015 - fullYear;
		if (month <= 11) {
			monthYear = amountYear;
		} else {
			monthYear = amountYear - 1;
		}
		if (day < 3) {
			dayYear = amountYear;
		} else {
			dayYear = amountYear - 1;

		}

		return dayYear;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case NewClassesPackage.INFORMATION_VALIDATOR___VALIDATE_EMAIL__STRING:
				return validateEmail((String)arguments.get(0));
			case NewClassesPackage.INFORMATION_VALIDATOR___VALIDATE_PHONE_NUM__LONG:
				return validatePhoneNum((Long)arguments.get(0));
			case NewClassesPackage.INFORMATION_VALIDATOR___VALIDATE_PERSONAL_NUM__LONG:
				return validatePersonalNum((Long)arguments.get(0));
			case NewClassesPackage.INFORMATION_VALIDATOR___VALIDATE_NAMES__STRING_STRING:
				return validateNames((String)arguments.get(0), (String)arguments.get(1));
			case NewClassesPackage.INFORMATION_VALIDATOR___VALIDATE_ADDRESS__STRING_INT_STRING_STRING:
				return validateAddress((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case NewClassesPackage.INFORMATION_VALIDATOR___VALIDATE_DATES__STRING_STRING:
				return validateDates((String)arguments.get(0), (String)arguments.get(1));
			case NewClassesPackage.INFORMATION_VALIDATOR___CHECK_DATE_ORDER__STRING_STRING:
				return checkDateOrder((String)arguments.get(0), (String)arguments.get(1));
			case NewClassesPackage.INFORMATION_VALIDATOR___CHECK_AGE_RESTRICTION__LONG:
				return checkAgeRestriction((Long)arguments.get(0));
			case NewClassesPackage.INFORMATION_VALIDATOR___VALIDATE_CONFIRMATION_NUM__INT:
				return validateConfirmationNum((Integer)arguments.get(0));
			case NewClassesPackage.INFORMATION_VALIDATOR___CHECK_AGE__INT_INT_INT:
				return checkAge((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} // InformationValidatorImpl
