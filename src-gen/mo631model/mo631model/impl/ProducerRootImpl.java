/**
 */
package mo631model.mo631model.impl;

import java.util.Collection;

import mo631model.mo631model.Mo631modelPackage;
import mo631model.mo631model.Producer;
import mo631model.mo631model.ProducerRoot;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Producer Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.impl.ProducerRootImpl#getProducer <em>Producer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProducerRootImpl extends RootImpl implements ProducerRoot {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProducerRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mo631modelPackage.Literals.PRODUCER_ROOT;
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
					Mo631modelPackage.PRODUCER_ROOT__PRODUCER);
		}
		return producer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mo631modelPackage.PRODUCER_ROOT__PRODUCER:
			return ((InternalEList<?>) getProducer()).basicRemove(otherEnd, msgs);
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
		case Mo631modelPackage.PRODUCER_ROOT__PRODUCER:
			return getProducer();
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
		case Mo631modelPackage.PRODUCER_ROOT__PRODUCER:
			getProducer().clear();
			getProducer().addAll((Collection<? extends Producer>) newValue);
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
		case Mo631modelPackage.PRODUCER_ROOT__PRODUCER:
			getProducer().clear();
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
		case Mo631modelPackage.PRODUCER_ROOT__PRODUCER:
			return producer != null && !producer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProducerRootImpl
