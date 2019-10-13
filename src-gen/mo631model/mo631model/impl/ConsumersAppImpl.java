/**
 */
package mo631model.mo631model.impl;

import java.util.Collection;

import mo631model.mo631model.Consumer;
import mo631model.mo631model.ConsumersApp;
import mo631model.mo631model.Mo631modelPackage;
import mo631model.mo631model.ServerSettings;

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
 * An implementation of the model object '<em><b>Consumers App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.impl.ConsumersAppImpl#getConsumer <em>Consumer</em>}</li>
 *   <li>{@link mo631model.mo631model.impl.ConsumersAppImpl#getServersettings <em>Serversettings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConsumersAppImpl extends MinimalEObjectImpl.Container implements ConsumersApp {
	/**
	 * The cached value of the '{@link #getConsumer() <em>Consumer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumer()
	 * @generated
	 * @ordered
	 */
	protected EList<Consumer> consumer;

	/**
	 * The cached value of the '{@link #getServersettings() <em>Serversettings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServersettings()
	 * @generated
	 * @ordered
	 */
	protected ServerSettings serversettings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsumersAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mo631modelPackage.Literals.CONSUMERS_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Consumer> getConsumer() {
		if (consumer == null) {
			consumer = new EObjectContainmentEList<Consumer>(Consumer.class, this,
					Mo631modelPackage.CONSUMERS_APP__CONSUMER);
		}
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ServerSettings getServersettings() {
		return serversettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServersettings(ServerSettings newServersettings, NotificationChain msgs) {
		ServerSettings oldServersettings = serversettings;
		serversettings = newServersettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mo631modelPackage.CONSUMERS_APP__SERVERSETTINGS, oldServersettings, newServersettings);
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
	public void setServersettings(ServerSettings newServersettings) {
		if (newServersettings != serversettings) {
			NotificationChain msgs = null;
			if (serversettings != null)
				msgs = ((InternalEObject) serversettings).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Mo631modelPackage.CONSUMERS_APP__SERVERSETTINGS, null, msgs);
			if (newServersettings != null)
				msgs = ((InternalEObject) newServersettings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Mo631modelPackage.CONSUMERS_APP__SERVERSETTINGS, null, msgs);
			msgs = basicSetServersettings(newServersettings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mo631modelPackage.CONSUMERS_APP__SERVERSETTINGS,
					newServersettings, newServersettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mo631modelPackage.CONSUMERS_APP__CONSUMER:
			return ((InternalEList<?>) getConsumer()).basicRemove(otherEnd, msgs);
		case Mo631modelPackage.CONSUMERS_APP__SERVERSETTINGS:
			return basicSetServersettings(null, msgs);
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
		case Mo631modelPackage.CONSUMERS_APP__CONSUMER:
			return getConsumer();
		case Mo631modelPackage.CONSUMERS_APP__SERVERSETTINGS:
			return getServersettings();
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
		case Mo631modelPackage.CONSUMERS_APP__CONSUMER:
			getConsumer().clear();
			getConsumer().addAll((Collection<? extends Consumer>) newValue);
			return;
		case Mo631modelPackage.CONSUMERS_APP__SERVERSETTINGS:
			setServersettings((ServerSettings) newValue);
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
		case Mo631modelPackage.CONSUMERS_APP__CONSUMER:
			getConsumer().clear();
			return;
		case Mo631modelPackage.CONSUMERS_APP__SERVERSETTINGS:
			setServersettings((ServerSettings) null);
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
		case Mo631modelPackage.CONSUMERS_APP__CONSUMER:
			return consumer != null && !consumer.isEmpty();
		case Mo631modelPackage.CONSUMERS_APP__SERVERSETTINGS:
			return serversettings != null;
		}
		return super.eIsSet(featureID);
	}

} //ConsumersAppImpl
