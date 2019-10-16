/**
 */
package mo631model.mo631model.impl;

import mo631model.mo631model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mo631modelFactoryImpl extends EFactoryImpl implements Mo631modelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mo631modelFactory init() {
		try {
			Mo631modelFactory theMo631modelFactory = (Mo631modelFactory) EPackage.Registry.INSTANCE
					.getEFactory(Mo631modelPackage.eNS_URI);
			if (theMo631modelFactory != null) {
				return theMo631modelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Mo631modelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mo631modelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Mo631modelPackage.PRODUCER:
			return createProducer();
		case Mo631modelPackage.MESSAGE:
			return createMessage();
		case Mo631modelPackage.QUEUE:
			return createQueue();
		case Mo631modelPackage.BINDING:
			return createBinding();
		case Mo631modelPackage.CONSUMER:
			return createConsumer();
		case Mo631modelPackage.EXCHANGE:
			return createExchange();
		case Mo631modelPackage.PRODUCER_ROOT:
			return createProducerRoot();
		case Mo631modelPackage.CONSUMER_ROOT:
			return createConsumerRoot();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Producer createProducer() {
		ProducerImpl producer = new ProducerImpl();
		return producer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Queue createQueue() {
		QueueImpl queue = new QueueImpl();
		return queue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Binding createBinding() {
		BindingImpl binding = new BindingImpl();
		return binding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Consumer createConsumer() {
		ConsumerImpl consumer = new ConsumerImpl();
		return consumer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Exchange createExchange() {
		ExchangeImpl exchange = new ExchangeImpl();
		return exchange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProducerRoot createProducerRoot() {
		ProducerRootImpl producerRoot = new ProducerRootImpl();
		return producerRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConsumerRoot createConsumerRoot() {
		ConsumerRootImpl consumerRoot = new ConsumerRootImpl();
		return consumerRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mo631modelPackage getMo631modelPackage() {
		return (Mo631modelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Mo631modelPackage getPackage() {
		return Mo631modelPackage.eINSTANCE;
	}

} //Mo631modelFactoryImpl
