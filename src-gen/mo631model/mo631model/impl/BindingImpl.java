/**
 */
package mo631model.mo631model.impl;

import mo631model.mo631model.Binding;
import mo631model.mo631model.Exchange;
import mo631model.mo631model.Mo631modelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.impl.BindingImpl#getRoutingKey <em>Routing Key</em>}</li>
 *   <li>{@link mo631model.mo631model.impl.BindingImpl#getExchange <em>Exchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding {
	/**
	 * The default value of the '{@link #getRoutingKey() <em>Routing Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingKey()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTING_KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoutingKey() <em>Routing Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutingKey()
	 * @generated
	 * @ordered
	 */
	protected String routingKey = ROUTING_KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExchange() <em>Exchange</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchange()
	 * @generated
	 * @ordered
	 */
	protected Exchange exchange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mo631modelPackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRoutingKey() {
		return routingKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRoutingKey(String newRoutingKey) {
		String oldRoutingKey = routingKey;
		routingKey = newRoutingKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mo631modelPackage.BINDING__ROUTING_KEY, oldRoutingKey,
					routingKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Exchange getExchange() {
		return exchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExchange(Exchange newExchange, NotificationChain msgs) {
		Exchange oldExchange = exchange;
		exchange = newExchange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mo631modelPackage.BINDING__EXCHANGE, oldExchange, newExchange);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExchange(Exchange newExchange) {
		if (newExchange != exchange) {
			NotificationChain msgs = null;
			if (exchange != null)
				msgs = ((InternalEObject) exchange).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Mo631modelPackage.BINDING__EXCHANGE, null, msgs);
			if (newExchange != null)
				msgs = ((InternalEObject) newExchange).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Mo631modelPackage.BINDING__EXCHANGE, null, msgs);
			msgs = basicSetExchange(newExchange, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mo631modelPackage.BINDING__EXCHANGE, newExchange,
					newExchange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mo631modelPackage.BINDING__EXCHANGE:
			return basicSetExchange(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mo631modelPackage.BINDING__ROUTING_KEY:
			return getRoutingKey();
		case Mo631modelPackage.BINDING__EXCHANGE:
			return getExchange();
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
		case Mo631modelPackage.BINDING__ROUTING_KEY:
			setRoutingKey((String) newValue);
			return;
		case Mo631modelPackage.BINDING__EXCHANGE:
			setExchange((Exchange) newValue);
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
		case Mo631modelPackage.BINDING__ROUTING_KEY:
			setRoutingKey(ROUTING_KEY_EDEFAULT);
			return;
		case Mo631modelPackage.BINDING__EXCHANGE:
			setExchange((Exchange) null);
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
		case Mo631modelPackage.BINDING__ROUTING_KEY:
			return ROUTING_KEY_EDEFAULT == null ? routingKey != null : !ROUTING_KEY_EDEFAULT.equals(routingKey);
		case Mo631modelPackage.BINDING__EXCHANGE:
			return exchange != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (routingKey: ");
		result.append(routingKey);
		result.append(')');
		return result.toString();
	}

} //BindingImpl
