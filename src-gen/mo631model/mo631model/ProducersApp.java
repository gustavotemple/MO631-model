/**
 */
package mo631model.mo631model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producers App</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.ProducersApp#getProducer <em>Producer</em>}</li>
 *   <li>{@link mo631model.mo631model.ProducersApp#getServersettings <em>Serversettings</em>}</li>
 * </ul>
 *
 * @see mo631model.mo631model.Mo631modelPackage#getProducersApp()
 * @model
 * @generated
 */
public interface ProducersApp extends EObject {
	/**
	 * Returns the value of the '<em><b>Producer</b></em>' containment reference list.
	 * The list contents are of type {@link mo631model.mo631model.Producer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producer</em>' containment reference list.
	 * @see mo631model.mo631model.Mo631modelPackage#getProducersApp_Producer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Producer> getProducer();

	/**
	 * Returns the value of the '<em><b>Serversettings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serversettings</em>' containment reference.
	 * @see #setServersettings(ServerSettings)
	 * @see mo631model.mo631model.Mo631modelPackage#getProducersApp_Serversettings()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ServerSettings getServersettings();

	/**
	 * Sets the value of the '{@link mo631model.mo631model.ProducersApp#getServersettings <em>Serversettings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serversettings</em>' containment reference.
	 * @see #getServersettings()
	 * @generated
	 */
	void setServersettings(ServerSettings value);

} // ProducersApp
