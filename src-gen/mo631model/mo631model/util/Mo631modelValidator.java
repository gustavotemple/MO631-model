/**
 */
package mo631model.mo631model.util;

import java.util.Map;

import mo631model.mo631model.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see mo631model.mo631model.Mo631modelPackage
 * @generated
 */
public class Mo631modelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Mo631modelValidator INSTANCE = new Mo631modelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "mo631model.mo631model";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mo631modelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Mo631modelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Mo631modelPackage.PRODUCER:
			return validateProducer((Producer) value, diagnostics, context);
		case Mo631modelPackage.MESSAGE:
			return validateMessage((Message) value, diagnostics, context);
		case Mo631modelPackage.QUEUE:
			return validateQueue((Queue) value, diagnostics, context);
		case Mo631modelPackage.BINDING:
			return validateBinding((Binding) value, diagnostics, context);
		case Mo631modelPackage.CONSUMER:
			return validateConsumer((Consumer) value, diagnostics, context);
		case Mo631modelPackage.EXCHANGE:
			return validateExchange((Exchange) value, diagnostics, context);
		case Mo631modelPackage.PRODUCERS_APP:
			return validateProducersApp((ProducersApp) value, diagnostics, context);
		case Mo631modelPackage.SERVER_SETTINGS:
			return validateServerSettings((ServerSettings) value, diagnostics, context);
		case Mo631modelPackage.CONSUMERS_APP:
			return validateConsumersApp((ConsumersApp) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProducer(Producer producer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(producer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessage(Message message, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(message, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueue(Queue queue, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queue, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinding(Binding binding, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binding, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsumer(Consumer consumer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(consumer, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(consumer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(consumer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(consumer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(consumer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(consumer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(consumer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(consumer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(consumer, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateConsumer_QueueDuplicated(consumer, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the QueueDuplicated constraint of '<em>Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CONSUMER__QUEUE_DUPLICATED__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Queue duplicated',\n" + "\tstatus : Boolean = \t\t\n"
			+ "\t\tlet nameBagSize : Integer = queue->collect(name)->asBag()->size() in\n"
			+ "\t\tlet nameSetSize : Integer = queue->collect(name)->asSet()->size() in\n" + "\n"
			+ "\t\tif queue->isEmpty() then true\n" + "\t\telse\n" + "\t\t  nameBagSize = nameSetSize\n" + "\t\tendif\n"
			+ "}.status";

	/**
	 * Validates the QueueDuplicated constraint of '<em>Consumer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsumer_QueueDuplicated(Consumer consumer, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Mo631modelPackage.Literals.CONSUMER, consumer, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "QueueDuplicated",
				CONSUMER__QUEUE_DUPLICATED__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExchange(Exchange exchange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(exchange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProducersApp(ProducersApp producersApp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(producersApp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerSettings(ServerSettings serverSettings, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(serverSettings, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(serverSettings, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(serverSettings, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(serverSettings, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(serverSettings, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(serverSettings, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(serverSettings, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(serverSettings, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(serverSettings, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateServerSettings_InvalidPortNumber(serverSettings, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the InvalidPortNumber constraint of '<em>Server Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SERVER_SETTINGS__INVALID_PORT_NUMBER__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Invalid port number',\n" + "\tstatus : Boolean = port >= 1 and port <= 65535\n"
			+ "}.status";

	/**
	 * Validates the InvalidPortNumber constraint of '<em>Server Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServerSettings_InvalidPortNumber(ServerSettings serverSettings, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate(Mo631modelPackage.Literals.SERVER_SETTINGS, serverSettings, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot", "InvalidPortNumber",
				SERVER_SETTINGS__INVALID_PORT_NUMBER__EEXPRESSION, Diagnostic.ERROR, DIAGNOSTIC_SOURCE, 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConsumersApp(ConsumersApp consumersApp, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(consumersApp, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Mo631modelValidator
