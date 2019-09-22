/**
 */
package mo631model.mo631model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.Binding#getRoutingKey <em>Routing Key</em>}</li>
 * </ul>
 *
 * @see mo631model.mo631model.Mo631modelPackage#getBinding()
 * @model
 * @generated
 */
public interface Binding extends EObject {
	/**
	 * Returns the value of the '<em><b>Routing Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routing Key</em>' attribute.
	 * @see #setRoutingKey(String)
	 * @see mo631model.mo631model.Mo631modelPackage#getBinding_RoutingKey()
	 * @model required="true"
	 * @generated
	 */
	String getRoutingKey();

	/**
	 * Sets the value of the '{@link mo631model.mo631model.Binding#getRoutingKey <em>Routing Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Routing Key</em>' attribute.
	 * @see #getRoutingKey()
	 * @generated
	 */
	void setRoutingKey(String value);

} // Binding
