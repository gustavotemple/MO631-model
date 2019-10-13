/**
 */
package mo631model.mo631model.impl;

import java.util.Collection;

import mo631model.mo631model.Mo631modelPackage;
import mo631model.mo631model.Producer;
import mo631model.mo631model.ProducersApp;
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
 * An implementation of the model object '<em><b>Producers App</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.impl.ProducersAppImpl#getProducer <em>Producer</em>}</li>
 *   <li>{@link mo631model.mo631model.impl.ProducersAppImpl#getServersettings <em>Serversettings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProducersAppImpl extends MinimalEObjectImpl.Container implements ProducersApp {
	/**
	 * The cached value of the '{@link #getProducer() <em>Producer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProducer()
	 * @generated
	 * @ordered
	 */
	protected EList<Producer> producer;

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
	protected ProducersAppImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mo631modelPackage.Literals.PRODUCERS_APP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Producer> getProducer() {
		if (producer == null) {
			producer = new EObjectContainmentEList<Producer>(Producer.class, this,
					Mo631modelPackage.PRODUCERS_APP__PRODUCER);
		}
		return producer;
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
					Mo631modelPackage.PRODUCERS_APP__SERVERSETTINGS, oldServersettings, newServersettings);
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
						EOPPOSITE_FEATURE_BASE - Mo631modelPackage.PRODUCERS_APP__SERVERSETTINGS, null, msgs);
			if (newServersettings != null)
				msgs = ((InternalEObject) newServersettings).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Mo631modelPackage.PRODUCERS_APP__SERVERSETTINGS, null, msgs);
			msgs = basicSetServersettings(newServersettings, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mo631modelPackage.PRODUCERS_APP__SERVERSETTINGS,
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
		case Mo631modelPackage.PRODUCERS_APP__PRODUCER:
			return ((InternalEList<?>) getProducer()).basicRemove(otherEnd, msgs);
		case Mo631modelPackage.PRODUCERS_APP__SERVERSETTINGS:
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
		case Mo631modelPackage.PRODUCERS_APP__PRODUCER:
			return getProducer();
		case Mo631modelPackage.PRODUCERS_APP__SERVERSETTINGS:
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
		case Mo631modelPackage.PRODUCERS_APP__PRODUCER:
			getProducer().clear();
			getProducer().addAll((Collection<? extends Producer>) newValue);
			return;
		case Mo631modelPackage.PRODUCERS_APP__SERVERSETTINGS:
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
		case Mo631modelPackage.PRODUCERS_APP__PRODUCER:
			getProducer().clear();
			return;
		case Mo631modelPackage.PRODUCERS_APP__SERVERSETTINGS:
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
		case Mo631modelPackage.PRODUCERS_APP__PRODUCER:
			return producer != null && !producer.isEmpty();
		case Mo631modelPackage.PRODUCERS_APP__SERVERSETTINGS:
			return serversettings != null;
		}
		return super.eIsSet(featureID);
	}

} //ProducersAppImpl
