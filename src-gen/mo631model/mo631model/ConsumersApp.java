/**
 */
package mo631model.mo631model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumers App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.ConsumersApp#getConsumer <em>Consumer</em>}</li>
 *   <li>{@link mo631model.mo631model.ConsumersApp#getServersettings <em>Serversettings</em>}</li>
 * </ul>
 *
 * @see mo631model.mo631model.Mo631modelPackage#getConsumersApp()
 * @model
 * @generated
 */
public interface ConsumersApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Consumer</b></em>' containment reference list.
	 * The list contents are of type {@link mo631model.mo631model.Consumer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer</em>' containment reference list.
	 * @see mo631model.mo631model.Mo631modelPackage#getConsumersApp_Consumer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Consumer> getConsumer();

	/**
	 * Returns the value of the '<em><b>Serversettings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serversettings</em>' containment reference.
	 * @see #setServersettings(ServerSettings)
	 * @see mo631model.mo631model.Mo631modelPackage#getConsumersApp_Serversettings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServerSettings getServersettings();

	/**
	 * Sets the value of the '{@link mo631model.mo631model.ConsumersApp#getServersettings <em>Serversettings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serversettings</em>' containment reference.
	 * @see #getServersettings()
	 * @generated
	 */
	void setServersettings(ServerSettings value);

} // ConsumersApp
