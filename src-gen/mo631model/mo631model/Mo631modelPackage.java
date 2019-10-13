/**
 */
package mo631model.mo631model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mo631model.mo631model.Mo631modelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface Mo631modelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mo631model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mo631model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mo631model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mo631modelPackage eINSTANCE = mo631model.mo631model.impl.Mo631modelPackageImpl.init();

	/**
	 * The meta object id for the '{@link mo631model.mo631model.impl.ProducerImpl <em>Producer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mo631model.mo631model.impl.ProducerImpl
	 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getProducer()
	 * @generated
	 */
	int PRODUCER = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCER__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCER__BINDING = 1;

	/**
	 * The number of structural features of the '<em>Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Producer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mo631model.mo631model.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mo631model.mo631model.impl.MessageImpl
	 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Payload</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PAYLOAD = 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mo631model.mo631model.impl.QueueImpl <em>Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mo631model.mo631model.impl.QueueImpl
	 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getQueue()
	 * @generated
	 */
	int QUEUE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE__BINDING = 2;

	/**
	 * The number of structural features of the '<em>Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUEUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mo631model.mo631model.impl.BindingImpl <em>Binding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mo631model.mo631model.impl.BindingImpl
	 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getBinding()
	 * @generated
	 */
	int BINDING = 3;

	/**
	 * The feature id for the '<em><b>Routing Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__ROUTING_KEY = 0;

	/**
	 * The feature id for the '<em><b>Exchange</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING__EXCHANGE = 1;

	/**
	 * The number of structural features of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Binding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mo631model.mo631model.impl.ConsumerImpl <em>Consumer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mo631model.mo631model.impl.ConsumerImpl
	 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getConsumer()
	 * @generated
	 */
	int CONSUMER = 4;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER__QUEUE = 0;

	/**
	 * The number of structural features of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Consumer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mo631model.mo631model.impl.ExchangeImpl <em>Exchange</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mo631model.mo631model.impl.ExchangeImpl
	 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getExchange()
	 * @generated
	 */
	int EXCHANGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exchange</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCHANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mo631model.mo631model.impl.ProducersAppImpl <em>Producers App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mo631model.mo631model.impl.ProducersAppImpl
	 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getProducersApp()
	 * @generated
	 */
	int PRODUCERS_APP = 6;

	/**
	 * The feature id for the '<em><b>Producer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCERS_APP__PRODUCER = 0;

	/**
	 * The feature id for the '<em><b>Serversettings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCERS_APP__SERVERSETTINGS = 1;

	/**
	 * The number of structural features of the '<em>Producers App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCERS_APP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Producers App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCERS_APP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mo631model.mo631model.impl.ServerSettingsImpl <em>Server Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mo631model.mo631model.impl.ServerSettingsImpl
	 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getServerSettings()
	 * @generated
	 */
	int SERVER_SETTINGS = 7;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SETTINGS__HOST = 0;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SETTINGS__PORT = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SETTINGS__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SETTINGS__USERNAME = 3;

	/**
	 * The number of structural features of the '<em>Server Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SETTINGS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Server Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mo631model.mo631model.impl.ConsumersAppImpl <em>Consumers App</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mo631model.mo631model.impl.ConsumersAppImpl
	 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getConsumersApp()
	 * @generated
	 */
	int CONSUMERS_APP = 8;

	/**
	 * The feature id for the '<em><b>Consumer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMERS_APP__CONSUMER = 0;

	/**
	 * The feature id for the '<em><b>Serversettings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMERS_APP__SERVERSETTINGS = 1;

	/**
	 * The number of structural features of the '<em>Consumers App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMERS_APP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Consumers App</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSUMERS_APP_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link mo631model.mo631model.Producer <em>Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producer</em>'.
	 * @see mo631model.mo631model.Producer
	 * @generated
	 */
	EClass getProducer();

	/**
	 * Returns the meta object for the containment reference list '{@link mo631model.mo631model.Producer#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see mo631model.mo631model.Producer#getMessage()
	 * @see #getProducer()
	 * @generated
	 */
	EReference getProducer_Message();

	/**
	 * Returns the meta object for the containment reference '{@link mo631model.mo631model.Producer#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Binding</em>'.
	 * @see mo631model.mo631model.Producer#getBinding()
	 * @see #getProducer()
	 * @generated
	 */
	EReference getProducer_Binding();

	/**
	 * Returns the meta object for class '{@link mo631model.mo631model.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see mo631model.mo631model.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link mo631model.mo631model.Message#getPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payload</em>'.
	 * @see mo631model.mo631model.Message#getPayload()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Payload();

	/**
	 * Returns the meta object for class '{@link mo631model.mo631model.Queue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue</em>'.
	 * @see mo631model.mo631model.Queue
	 * @generated
	 */
	EClass getQueue();

	/**
	 * Returns the meta object for the attribute '{@link mo631model.mo631model.Queue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mo631model.mo631model.Queue#getName()
	 * @see #getQueue()
	 * @generated
	 */
	EAttribute getQueue_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link mo631model.mo631model.Queue#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see mo631model.mo631model.Queue#getMessage()
	 * @see #getQueue()
	 * @generated
	 */
	EReference getQueue_Message();

	/**
	 * Returns the meta object for the containment reference list '{@link mo631model.mo631model.Queue#getBinding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Binding</em>'.
	 * @see mo631model.mo631model.Queue#getBinding()
	 * @see #getQueue()
	 * @generated
	 */
	EReference getQueue_Binding();

	/**
	 * Returns the meta object for class '{@link mo631model.mo631model.Binding <em>Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding</em>'.
	 * @see mo631model.mo631model.Binding
	 * @generated
	 */
	EClass getBinding();

	/**
	 * Returns the meta object for the attribute '{@link mo631model.mo631model.Binding#getRoutingKey <em>Routing Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Routing Key</em>'.
	 * @see mo631model.mo631model.Binding#getRoutingKey()
	 * @see #getBinding()
	 * @generated
	 */
	EAttribute getBinding_RoutingKey();

	/**
	 * Returns the meta object for the containment reference '{@link mo631model.mo631model.Binding#getExchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exchange</em>'.
	 * @see mo631model.mo631model.Binding#getExchange()
	 * @see #getBinding()
	 * @generated
	 */
	EReference getBinding_Exchange();

	/**
	 * Returns the meta object for class '{@link mo631model.mo631model.Consumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumer</em>'.
	 * @see mo631model.mo631model.Consumer
	 * @generated
	 */
	EClass getConsumer();

	/**
	 * Returns the meta object for the containment reference list '{@link mo631model.mo631model.Consumer#getQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Queue</em>'.
	 * @see mo631model.mo631model.Consumer#getQueue()
	 * @see #getConsumer()
	 * @generated
	 */
	EReference getConsumer_Queue();

	/**
	 * Returns the meta object for class '{@link mo631model.mo631model.Exchange <em>Exchange</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exchange</em>'.
	 * @see mo631model.mo631model.Exchange
	 * @generated
	 */
	EClass getExchange();

	/**
	 * Returns the meta object for the attribute '{@link mo631model.mo631model.Exchange#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mo631model.mo631model.Exchange#getName()
	 * @see #getExchange()
	 * @generated
	 */
	EAttribute getExchange_Name();

	/**
	 * Returns the meta object for class '{@link mo631model.mo631model.ProducersApp <em>Producers App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Producers App</em>'.
	 * @see mo631model.mo631model.ProducersApp
	 * @generated
	 */
	EClass getProducersApp();

	/**
	 * Returns the meta object for the containment reference list '{@link mo631model.mo631model.ProducersApp#getProducer <em>Producer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Producer</em>'.
	 * @see mo631model.mo631model.ProducersApp#getProducer()
	 * @see #getProducersApp()
	 * @generated
	 */
	EReference getProducersApp_Producer();

	/**
	 * Returns the meta object for the containment reference '{@link mo631model.mo631model.ProducersApp#getServersettings <em>Serversettings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serversettings</em>'.
	 * @see mo631model.mo631model.ProducersApp#getServersettings()
	 * @see #getProducersApp()
	 * @generated
	 */
	EReference getProducersApp_Serversettings();

	/**
	 * Returns the meta object for class '{@link mo631model.mo631model.ServerSettings <em>Server Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server Settings</em>'.
	 * @see mo631model.mo631model.ServerSettings
	 * @generated
	 */
	EClass getServerSettings();

	/**
	 * Returns the meta object for the attribute '{@link mo631model.mo631model.ServerSettings#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see mo631model.mo631model.ServerSettings#getHost()
	 * @see #getServerSettings()
	 * @generated
	 */
	EAttribute getServerSettings_Host();

	/**
	 * Returns the meta object for the attribute '{@link mo631model.mo631model.ServerSettings#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see mo631model.mo631model.ServerSettings#getPort()
	 * @see #getServerSettings()
	 * @generated
	 */
	EAttribute getServerSettings_Port();

	/**
	 * Returns the meta object for the attribute '{@link mo631model.mo631model.ServerSettings#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see mo631model.mo631model.ServerSettings#getPassword()
	 * @see #getServerSettings()
	 * @generated
	 */
	EAttribute getServerSettings_Password();

	/**
	 * Returns the meta object for the attribute '{@link mo631model.mo631model.ServerSettings#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see mo631model.mo631model.ServerSettings#getUsername()
	 * @see #getServerSettings()
	 * @generated
	 */
	EAttribute getServerSettings_Username();

	/**
	 * Returns the meta object for class '{@link mo631model.mo631model.ConsumersApp <em>Consumers App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Consumers App</em>'.
	 * @see mo631model.mo631model.ConsumersApp
	 * @generated
	 */
	EClass getConsumersApp();

	/**
	 * Returns the meta object for the containment reference list '{@link mo631model.mo631model.ConsumersApp#getConsumer <em>Consumer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Consumer</em>'.
	 * @see mo631model.mo631model.ConsumersApp#getConsumer()
	 * @see #getConsumersApp()
	 * @generated
	 */
	EReference getConsumersApp_Consumer();

	/**
	 * Returns the meta object for the containment reference '{@link mo631model.mo631model.ConsumersApp#getServersettings <em>Serversettings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Serversettings</em>'.
	 * @see mo631model.mo631model.ConsumersApp#getServersettings()
	 * @see #getConsumersApp()
	 * @generated
	 */
	EReference getConsumersApp_Serversettings();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mo631modelFactory getMo631modelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mo631model.mo631model.impl.ProducerImpl <em>Producer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mo631model.mo631model.impl.ProducerImpl
		 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getProducer()
		 * @generated
		 */
		EClass PRODUCER = eINSTANCE.getProducer();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCER__MESSAGE = eINSTANCE.getProducer_Message();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCER__BINDING = eINSTANCE.getProducer_Binding();

		/**
		 * The meta object literal for the '{@link mo631model.mo631model.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mo631model.mo631model.impl.MessageImpl
		 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Payload</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__PAYLOAD = eINSTANCE.getMessage_Payload();

		/**
		 * The meta object literal for the '{@link mo631model.mo631model.impl.QueueImpl <em>Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mo631model.mo631model.impl.QueueImpl
		 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getQueue()
		 * @generated
		 */
		EClass QUEUE = eINSTANCE.getQueue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUEUE__NAME = eINSTANCE.getQueue_Name();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEUE__MESSAGE = eINSTANCE.getQueue_Message();

		/**
		 * The meta object literal for the '<em><b>Binding</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUEUE__BINDING = eINSTANCE.getQueue_Binding();

		/**
		 * The meta object literal for the '{@link mo631model.mo631model.impl.BindingImpl <em>Binding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mo631model.mo631model.impl.BindingImpl
		 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getBinding()
		 * @generated
		 */
		EClass BINDING = eINSTANCE.getBinding();

		/**
		 * The meta object literal for the '<em><b>Routing Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINDING__ROUTING_KEY = eINSTANCE.getBinding_RoutingKey();

		/**
		 * The meta object literal for the '<em><b>Exchange</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING__EXCHANGE = eINSTANCE.getBinding_Exchange();

		/**
		 * The meta object literal for the '{@link mo631model.mo631model.impl.ConsumerImpl <em>Consumer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mo631model.mo631model.impl.ConsumerImpl
		 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getConsumer()
		 * @generated
		 */
		EClass CONSUMER = eINSTANCE.getConsumer();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMER__QUEUE = eINSTANCE.getConsumer_Queue();

		/**
		 * The meta object literal for the '{@link mo631model.mo631model.impl.ExchangeImpl <em>Exchange</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mo631model.mo631model.impl.ExchangeImpl
		 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getExchange()
		 * @generated
		 */
		EClass EXCHANGE = eINSTANCE.getExchange();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCHANGE__NAME = eINSTANCE.getExchange_Name();

		/**
		 * The meta object literal for the '{@link mo631model.mo631model.impl.ProducersAppImpl <em>Producers App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mo631model.mo631model.impl.ProducersAppImpl
		 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getProducersApp()
		 * @generated
		 */
		EClass PRODUCERS_APP = eINSTANCE.getProducersApp();

		/**
		 * The meta object literal for the '<em><b>Producer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCERS_APP__PRODUCER = eINSTANCE.getProducersApp_Producer();

		/**
		 * The meta object literal for the '<em><b>Serversettings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRODUCERS_APP__SERVERSETTINGS = eINSTANCE.getProducersApp_Serversettings();

		/**
		 * The meta object literal for the '{@link mo631model.mo631model.impl.ServerSettingsImpl <em>Server Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mo631model.mo631model.impl.ServerSettingsImpl
		 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getServerSettings()
		 * @generated
		 */
		EClass SERVER_SETTINGS = eINSTANCE.getServerSettings();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_SETTINGS__HOST = eINSTANCE.getServerSettings_Host();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_SETTINGS__PORT = eINSTANCE.getServerSettings_Port();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_SETTINGS__PASSWORD = eINSTANCE.getServerSettings_Password();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVER_SETTINGS__USERNAME = eINSTANCE.getServerSettings_Username();

		/**
		 * The meta object literal for the '{@link mo631model.mo631model.impl.ConsumersAppImpl <em>Consumers App</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mo631model.mo631model.impl.ConsumersAppImpl
		 * @see mo631model.mo631model.impl.Mo631modelPackageImpl#getConsumersApp()
		 * @generated
		 */
		EClass CONSUMERS_APP = eINSTANCE.getConsumersApp();

		/**
		 * The meta object literal for the '<em><b>Consumer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMERS_APP__CONSUMER = eINSTANCE.getConsumersApp_Consumer();

		/**
		 * The meta object literal for the '<em><b>Serversettings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSUMERS_APP__SERVERSETTINGS = eINSTANCE.getConsumersApp_Serversettings();

	}

} //Mo631modelPackage
