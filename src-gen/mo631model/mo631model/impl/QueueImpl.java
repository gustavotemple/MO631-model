/**
 */
package mo631model.mo631model.impl;

import java.util.Collection;

import mo631model.mo631model.Binding;
import mo631model.mo631model.Exchange;
import mo631model.mo631model.Message;
import mo631model.mo631model.Mo631modelPackage;
import mo631model.mo631model.Queue;

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
 * An implementation of the model object '<em><b>Queue</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.impl.QueueImpl#getName <em>Name</em>}</li>
 *   <li>{@link mo631model.mo631model.impl.QueueImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link mo631model.mo631model.impl.QueueImpl#getBinding <em>Binding</em>}</li>
 *   <li>{@link mo631model.mo631model.impl.QueueImpl#getExchange <em>Exchange</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QueueImpl extends MinimalEObjectImpl.Container implements Queue {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The cached value of the '{@link #getBinding() <em>Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<Binding> binding;

	/**
	 * The cached value of the '{@link #getExchange() <em>Exchange</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExchange()
	 * @generated
	 * @ordered
	 */
	protected EList<Exchange> exchange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mo631modelPackage.Literals.QUEUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mo631modelPackage.QUEUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectContainmentEList<Message>(Message.class, this, Mo631modelPackage.QUEUE__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Binding> getBinding() {
		if (binding == null) {
			binding = new EObjectContainmentEList<Binding>(Binding.class, this, Mo631modelPackage.QUEUE__BINDING);
		}
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Exchange> getExchange() {
		if (exchange == null) {
			exchange = new EObjectContainmentEList<Exchange>(Exchange.class, this, Mo631modelPackage.QUEUE__EXCHANGE);
		}
		return exchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mo631modelPackage.QUEUE__MESSAGE:
			return ((InternalEList<?>) getMessage()).basicRemove(otherEnd, msgs);
		case Mo631modelPackage.QUEUE__BINDING:
			return ((InternalEList<?>) getBinding()).basicRemove(otherEnd, msgs);
		case Mo631modelPackage.QUEUE__EXCHANGE:
			return ((InternalEList<?>) getExchange()).basicRemove(otherEnd, msgs);
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
		case Mo631modelPackage.QUEUE__NAME:
			return getName();
		case Mo631modelPackage.QUEUE__MESSAGE:
			return getMessage();
		case Mo631modelPackage.QUEUE__BINDING:
			return getBinding();
		case Mo631modelPackage.QUEUE__EXCHANGE:
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
		case Mo631modelPackage.QUEUE__NAME:
			setName((String) newValue);
			return;
		case Mo631modelPackage.QUEUE__MESSAGE:
			getMessage().clear();
			getMessage().addAll((Collection<? extends Message>) newValue);
			return;
		case Mo631modelPackage.QUEUE__BINDING:
			getBinding().clear();
			getBinding().addAll((Collection<? extends Binding>) newValue);
			return;
		case Mo631modelPackage.QUEUE__EXCHANGE:
			getExchange().clear();
			getExchange().addAll((Collection<? extends Exchange>) newValue);
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
		case Mo631modelPackage.QUEUE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Mo631modelPackage.QUEUE__MESSAGE:
			getMessage().clear();
			return;
		case Mo631modelPackage.QUEUE__BINDING:
			getBinding().clear();
			return;
		case Mo631modelPackage.QUEUE__EXCHANGE:
			getExchange().clear();
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
		case Mo631modelPackage.QUEUE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Mo631modelPackage.QUEUE__MESSAGE:
			return message != null && !message.isEmpty();
		case Mo631modelPackage.QUEUE__BINDING:
			return binding != null && !binding.isEmpty();
		case Mo631modelPackage.QUEUE__EXCHANGE:
			return exchange != null && !exchange.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //QueueImpl
