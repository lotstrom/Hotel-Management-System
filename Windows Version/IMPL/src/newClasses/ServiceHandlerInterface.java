/**
 */
package newClasses;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Handler Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see newClasses.NewClassesPackage#getServiceHandlerInterface()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ServiceHandlerInterface extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false" newTypeDataType="org.eclipse.uml2.types.String" newTypeRequired="true" newTypeOrdered="false"
	 * @generated
	 */
	void changeServiceType(int ID, String newType);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false"
	 * @generated
	 */
	void removeService(int ID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false" newPriceDataType="org.eclipse.uml2.types.Integer" newPriceRequired="true" newPriceOrdered="false"
	 * @generated
	 */
	void changeServicePrice(int ID, int newPrice);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model IDDataType="org.eclipse.uml2.types.Integer" IDRequired="true" IDOrdered="false" typeDataType="org.eclipse.uml2.types.String" typeRequired="true" typeOrdered="false" priceDataType="org.eclipse.uml2.types.Integer" priceRequired="true" priceOrdered="false"
	 * @generated
	 */
	void addService(int ID, String type, int price);

} // ServiceHandlerInterface
