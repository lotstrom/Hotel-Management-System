/**
 */
package newClasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see newClasses.NewClassesPackage#getServiceProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ServiceProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" serviceDataType="org.eclipse.uml2.types.String" serviceRequired="true" serviceOrdered="false" checkInDateDataType="org.eclipse.uml2.types.String" checkInDateRequired="true" checkInDateOrdered="false" checkOutDateDataType="org.eclipse.uml2.types.String" checkOutDateRequired="true" checkOutDateOrdered="false"
	 * @generated
	 */
	boolean checkAvalibility(String service, String checkInDate, String checkOutDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model serviceDataType="org.eclipse.uml2.types.String" serviceRequired="true" serviceOrdered="false" statusDataType="org.eclipse.uml2.types.Boolean" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	void setAvalibility(String service, boolean status);

} // ServiceProvider
