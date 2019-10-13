/**
 */
package mo631model.mo631model.impl;

import mo631model.mo631model.Binding;
import mo631model.mo631model.Consumer;
import mo631model.mo631model.ConsumersApp;
import mo631model.mo631model.Exchange;
import mo631model.mo631model.Message;
import mo631model.mo631model.Mo631modelFactory;
import mo631model.mo631model.Mo631modelPackage;
import mo631model.mo631model.Producer;
import mo631model.mo631model.ProducersApp;
import mo631model.mo631model.Queue;
import mo631model.mo631model.ServerSettings;

import mo631model.mo631model.util.Mo631modelValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mo631modelPackageImpl extends EPackageImpl implements Mo631modelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass producerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exchangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass producersAppEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass consumersAppEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mo631model.mo631model.Mo631modelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Mo631modelPackageImpl() {
		super(eNS_URI, Mo631modelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Mo631modelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Mo631modelPackage init() {
		if (isInited)
			return (Mo631modelPackage) EPackage.Registry.INSTANCE.getEPackage(Mo631modelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMo631modelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Mo631modelPackageImpl theMo631modelPackage = registeredMo631modelPackage instanceof Mo631modelPackageImpl
				? (Mo631modelPackageImpl) registeredMo631modelPackage
				: new Mo631modelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMo631modelPackage.createPackageContents();

		// Initialize created meta-data
		theMo631modelPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put(theMo631modelPackage, new EValidator.Descriptor() {
			@Override
			public EValidator getEValidator() {
				return Mo631modelValidator.INSTANCE;
			}
		});

		// Mark meta-data to indicate it can't be changed
		theMo631modelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Mo631modelPackage.eNS_URI, theMo631modelPackage);
		return theMo631modelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProducer() {
		return producerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProducer_Message() {
		return (EReference) producerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProducer_Binding() {
		return (EReference) producerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessage_Payload() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueue() {
		return queueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getQueue_Name() {
		return (EAttribute) queueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueue_Message() {
		return (EReference) queueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueue_Binding() {
		return (EReference) queueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBinding() {
		return bindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBinding_RoutingKey() {
		return (EAttribute) bindingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBinding_Exchange() {
		return (EReference) bindingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsumer() {
		return consumerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsumer_Queue() {
		return (EReference) consumerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExchange() {
		return exchangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExchange_Name() {
		return (EAttribute) exchangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProducersApp() {
		return producersAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProducersApp_Producer() {
		return (EReference) producersAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProducersApp_Serversettings() {
		return (EReference) producersAppEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerSettings() {
		return serverSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_Host() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_Port() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_Password() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_Username() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConsumersApp() {
		return consumersAppEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsumersApp_Consumer() {
		return (EReference) consumersAppEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConsumersApp_Serversettings() {
		return (EReference) consumersAppEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mo631modelFactory getMo631modelFactory() {
		return (Mo631modelFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		producerEClass = createEClass(PRODUCER);
		createEReference(producerEClass, PRODUCER__MESSAGE);
		createEReference(producerEClass, PRODUCER__BINDING);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__PAYLOAD);

		queueEClass = createEClass(QUEUE);
		createEAttribute(queueEClass, QUEUE__NAME);
		createEReference(queueEClass, QUEUE__MESSAGE);
		createEReference(queueEClass, QUEUE__BINDING);

		bindingEClass = createEClass(BINDING);
		createEAttribute(bindingEClass, BINDING__ROUTING_KEY);
		createEReference(bindingEClass, BINDING__EXCHANGE);

		consumerEClass = createEClass(CONSUMER);
		createEReference(consumerEClass, CONSUMER__QUEUE);

		exchangeEClass = createEClass(EXCHANGE);
		createEAttribute(exchangeEClass, EXCHANGE__NAME);

		producersAppEClass = createEClass(PRODUCERS_APP);
		createEReference(producersAppEClass, PRODUCERS_APP__PRODUCER);
		createEReference(producersAppEClass, PRODUCERS_APP__SERVERSETTINGS);

		serverSettingsEClass = createEClass(SERVER_SETTINGS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__HOST);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__PORT);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__PASSWORD);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__USERNAME);

		consumersAppEClass = createEClass(CONSUMERS_APP);
		createEReference(consumersAppEClass, CONSUMERS_APP__CONSUMER);
		createEReference(consumersAppEClass, CONSUMERS_APP__SERVERSETTINGS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(producerEClass, Producer.class, "Producer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProducer_Message(), this.getMessage(), null, "message", null, 0, -1, Producer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProducer_Binding(), this.getBinding(), null, "binding", null, 1, 1, Producer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Payload(), ecorePackage.getEString(), "payload", null, 1, 1, Message.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(queueEClass, Queue.class, "Queue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQueue_Name(), ecorePackage.getEString(), "name", null, 1, 1, Queue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQueue_Message(), this.getMessage(), null, "message", null, 0, -1, Queue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getQueue_Binding(), this.getBinding(), null, "binding", null, 1, -1, Queue.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(bindingEClass, Binding.class, "Binding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBinding_RoutingKey(), ecorePackage.getEString(), "routingKey", null, 1, 1, Binding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinding_Exchange(), this.getExchange(), null, "exchange", null, 1, 1, Binding.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(consumerEClass, Consumer.class, "Consumer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsumer_Queue(), this.getQueue(), null, "queue", null, 1, -1, Consumer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(exchangeEClass, Exchange.class, "Exchange", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExchange_Name(), ecorePackage.getEString(), "name", null, 1, 1, Exchange.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(producersAppEClass, ProducersApp.class, "ProducersApp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProducersApp_Producer(), this.getProducer(), null, "producer", null, 1, -1,
				ProducersApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProducersApp_Serversettings(), this.getServerSettings(), null, "serversettings", null, 1, 1,
				ProducersApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serverSettingsEClass, ServerSettings.class, "ServerSettings", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerSettings_Host(), ecorePackage.getEString(), "host", "localhost", 1, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_Port(), ecorePackage.getEInt(), "port", "5672", 1, 1, ServerSettings.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_Password(), ecorePackage.getEString(), "password", "guest", 1, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_Username(), ecorePackage.getEString(), "username", "guest", 1, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(consumersAppEClass, ConsumersApp.class, "ConsumersApp", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConsumersApp_Consumer(), this.getConsumer(), null, "consumer", null, 1, -1,
				ConsumersApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConsumersApp_Serversettings(), this.getServerSettings(), null, "serversettings", null, 1, 1,
				ConsumersApp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation(this, source,
				new String[] { "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
						"settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "validationDelegates",
						"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot" });
		addAnnotation(consumerEClass, source, new String[] { "constraints", "QueueDuplicated" });
		addAnnotation(serverSettingsEClass, source, new String[] { "constraints", "InvalidPortNumber" });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation(consumerEClass, source, new String[] { "QueueDuplicated",
				"Tuple {\n\tmessage : String = \'Queue duplicated\',\n\tstatus : Boolean = \t\t\n\t\tlet nameBagSize : Integer = queue->collect(name)->asBag()->size() in\n\t\tlet nameSetSize : Integer = queue->collect(name)->asSet()->size() in\n\n\t\tif queue->isEmpty() then true\n\t\telse\n\t\t  nameBagSize = nameSetSize\n\t\tendif\n}.status" });
		addAnnotation(serverSettingsEClass, source, new String[] { "InvalidPortNumber",
				"Tuple {\n\tmessage : String = \'Invalid port number\',\n\tstatus : Boolean = port >= 1 and port <= 65535\n}.status" });
	}

} //Mo631modelPackageImpl
