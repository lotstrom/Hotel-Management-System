/**
 */
package newClasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see newClasses.NewClassesPackage#getValidator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Validator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	boolean validateEmail(String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" phoneNumRequired="true" phoneNumOrdered="false"
	 * @generated
	 */
	boolean validatePhoneNum(long phoneNum);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" personalNumRequired="true" personalNumOrdered="false"
	 * @generated
	 */
	boolean validatePersonalNum(long personalNum);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	boolean validateNames(String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" addressDataType="org.eclipse.uml2.types.String" addressRequired="true" addressOrdered="false" zipCodeDataType="org.eclipse.uml2.types.Integer" zipCodeRequired="true" zipCodeOrdered="false" cityDataType="org.eclipse.uml2.types.String" cityRequired="true" cityOrdered="false" countryDataType="org.eclipse.uml2.types.String" countryRequired="true" countryOrdered="false"
	 * @generated
	 */
	boolean validateAddress(String address, int zipCode, String city, String country);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" checkInDateDataType="org.eclipse.uml2.types.String" checkInDateRequired="true" checkInDateOrdered="false" checkOutDateDataType="org.eclipse.uml2.types.String" checkOutDateRequired="true" checkOutDateOrdered="false"
	 * @generated
	 */
	boolean validateDates(String checkInDate, String checkOutDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" checkInDateDataType="org.eclipse.uml2.types.String" checkInDateRequired="true" checkInDateOrdered="false" checkOutDateDataType="org.eclipse.uml2.types.String" checkOutDateRequired="true" checkOutDateOrdered="false"
	 * @generated
	 */
	boolean checkDateOrder(String checkInDate, String checkOutDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" personalNumRequired="true" personalNumOrdered="false"
	 * @generated
	 */
	boolean checkAgeRestriction(long personalNum);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" conformationNumDataType="org.eclipse.uml2.types.Integer" conformationNumRequired="true" conformationNumOrdered="false"
	 * @generated
	 */
	boolean validateConfirmationNum(int conformationNum);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" yearDataType="org.eclipse.uml2.types.Integer" yearRequired="true" yearOrdered="false" dayDataType="org.eclipse.uml2.types.Integer" dayRequired="true" dayOrdered="false" monthDataType="org.eclipse.uml2.types.Integer" monthRequired="true" monthOrdered="false"
	 * @generated
	 */
	int checkAge(int year, int day, int month);

} // Validator
