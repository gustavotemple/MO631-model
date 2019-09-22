/**
 */
package mo631model.mo631model.impl;

import java.util.Collection;

import mo631model.mo631model.Binding;
import mo631model.mo631model.Exchange;
import mo631model.mo631model.Message;
import mo631model.mo631model.Mo631modelPackage;
import mo631model.mo631model.Producer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Producer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.impl.ProducerImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link mo631model.mo631model.impl.ProducerImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link mo631model.mo631model.impl.ProducerImpl#getExchange <em>Exchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProducerImpl extends MinimalEObjectImpl.Container implements Producer {
	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message;

	/**
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected Binding binding;

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
	protected ProducerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mo631modelPackage.Literals.PRODUCER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectContainmentEList<Message>(Message.class, this, Mo631modelPackage.PRODUCER__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binding getBinding() {
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinding(Binding newBinding, NotificationChain msgs) {
		Binding oldBinding = binding;
		binding = newBinding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mo631modelPackage.PRODUCER__BINDING, oldBinding, newBinding);
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
	public void setBinding(Binding newBinding) {
		if (newBinding != binding) {
			NotificationChain msgs = null;
			if (binding != null)
				msgs = ((InternalEObject) binding).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Mo631modelPackage.PRODUCER__BINDING, null, msgs);
			if (newBinding != null)
				msgs = ((InternalEObject) newBinding).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Mo631modelPackage.PRODUCER__BINDING, null, msgs);
			msgs = basicSetBinding(newBinding, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mo631modelPackage.PRODUCER__BINDING, newBinding,
					newBinding));
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
					Mo631modelPackage.PRODUCER__EXCHANGE, oldExchange, newExchange);
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
						EOPPOSITE_FEATURE_BASE - Mo631modelPackage.PRODUCER__EXCHANGE, null, msgs);
			if (newExchange != null)
				msgs = ((InternalEObject) newExchange).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Mo631modelPackage.PRODUCER__EXCHANGE, null, msgs);
			msgs = basicSetExchange(newExchange, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mo631modelPackage.PRODUCER__EXCHANGE, newExchange,
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
		case Mo631modelPackage.PRODUCER__MESSAGE:
			return ((InternalEList<?>) getMessage()).basicRemove(otherEnd, msgs);
		case Mo631modelPackage.PRODUCER__BINDING:
			return basicSetBinding(null, msgs);
		case Mo631modelPackage.PRODUCER__EXCHANGE:
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
		case Mo631modelPackage.PRODUCER__MESSAGE:
			return getMessage();
		case Mo631modelPackage.PRODUCER__BINDING:
			return getBinding();
		case Mo631modelPackage.PRODUCER__EXCHANGE:
			return getExchange();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Mo631modelPackage.PRODUCER__MESSAGE:
			getMessage().clear();
			getMessage().addAll((Collection<? extends Message>) newValue);
			return;
		case Mo631modelPackage.PRODUCER__BINDING:
			setBinding((Binding) newValue);
			return;
		case Mo631modelPackage.PRODUCER__EXCHANGE:
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
		case Mo631modelPackage.PRODUCER__MESSAGE:
			getMessage().clear();
			return;
		case Mo631modelPackage.PRODUCER__BINDING:
			setBinding((Binding) null);
			return;
		case Mo631modelPackage.PRODUCER__EXCHANGE:
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
		case Mo631modelPackage.PRODUCER__MESSAGE:
			return message != null && !message.isEmpty();
		case Mo631modelPackage.PRODUCER__BINDING:
			return binding != null;
		case Mo631modelPackage.PRODUCER__EXCHANGE:
			return exchange != null;
		}
		return super.eIsSet(featureID);
	}

} //ProducerImpl