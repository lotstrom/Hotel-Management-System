/**
 */
package newClasses.impl;

import java.lang.reflect.InvocationTargetException;

import newClasses.NewClassesPackage;
import newClasses.Service;
import newClasses.ServiceHandler;
import newClasses.ServiceHandlerInterface;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Handler</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link newClasses.impl.ServiceHandlerImpl#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceHandlerImpl extends MinimalEObjectImpl.Container implements ServiceHandler {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected Service service;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceHandlerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return NewClassesPackage.Literals.SERVICE_HANDLER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (service != null && service.eIsProxy()) {
			InternalEObject oldService = (InternalEObject)service;
			service = (Service)eResolveProxy(oldService);
			if (service != oldService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, NewClassesPackage.SERVICE_HANDLER__SERVICE, oldService, service));
			}
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service basicGetService() {
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, NewClassesPackage.SERVICE_HANDLER__SERVICE, oldService, service));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean checkAvalibility(String service, String checkInDate, String checkOutDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvalibility(String service, boolean status) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeServiceType(int ID, String newType) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeService(int ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeServicePrice(int ID, int newPrice) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addService(int ID, String type, int price) {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case NewClassesPackage.SERVICE_HANDLER__SERVICE:
				if (resolve) return getService();
				return basicGetService();
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
			case NewClassesPackage.SERVICE_HANDLER__SERVICE:
				setService((Service)newValue);
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
			case NewClassesPackage.SERVICE_HANDLER__SERVICE:
				setService((Service)null);
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
			case NewClassesPackage.SERVICE_HANDLER__SERVICE:
				return service != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ServiceHandlerInterface.class) {
			switch (baseOperationID) {
				case NewClassesPackage.SERVICE_HANDLER_INTERFACE___CHANGE_SERVICE_TYPE__INT_STRING: return NewClassesPackage.SERVICE_HANDLER___CHANGE_SERVICE_TYPE__INT_STRING;
				case NewClassesPackage.SERVICE_HANDLER_INTERFACE___REMOVE_SERVICE__INT: return NewClassesPackage.SERVICE_HANDLER___REMOVE_SERVICE__INT;
				case NewClassesPackage.SERVICE_HANDLER_INTERFACE___CHANGE_SERVICE_PRICE__INT_INT: return NewClassesPackage.SERVICE_HANDLER___CHANGE_SERVICE_PRICE__INT_INT;
				case NewClassesPackage.SERVICE_HANDLER_INTERFACE___ADD_SERVICE__INT_STRING_INT: return NewClassesPackage.SERVICE_HANDLER___ADD_SERVICE__INT_STRING_INT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case NewClassesPackage.SERVICE_HANDLER___CHECK_AVALIBILITY__STRING_STRING_STRING:
				return checkAvalibility((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case NewClassesPackage.SERVICE_HANDLER___SET_AVALIBILITY__STRING_BOOLEAN:
				setAvalibility((String)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case NewClassesPackage.SERVICE_HANDLER___CHANGE_SERVICE_TYPE__INT_STRING:
				changeServiceType((Integer)arguments.get(0), (String)arguments.get(1));
				return null;
			case NewClassesPackage.SERVICE_HANDLER___REMOVE_SERVICE__INT:
				removeService((Integer)arguments.get(0));
				return null;
			case NewClassesPackage.SERVICE_HANDLER___CHANGE_SERVICE_PRICE__INT_INT:
				changeServicePrice((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case NewClassesPackage.SERVICE_HANDLER___ADD_SERVICE__INT_STRING_INT:
				addService((Integer)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceHandlerImpl
