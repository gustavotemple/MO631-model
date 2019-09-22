/**
 */
package mo631model.mo631model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queue</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.Queue#getName <em>Name</em>}</li>
 *   <li>{@link mo631model.mo631model.Queue#getMessage <em>Message</em>}</li>
 *   <li>{@link mo631model.mo631model.Queue#getBinding <em>Binding</em>}</li>
 *   <li>{@link mo631model.mo631model.Queue#getExchange <em>Exchange</em>}</li>
 * </ul>
 *
 * @see mo631model.mo631model.Mo631modelPackage#getQueue()
 * @model
 * @generated
 */
public interface Queue extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mo631model.mo631model.Mo631modelPackage#getQueue_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mo631model.mo631model.Queue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link mo631model.mo631model.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see mo631model.mo631model.Mo631modelPackage#getQueue_Message()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessage();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link mo631model.mo631model.Binding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see mo631model.mo631model.Mo631modelPackage#getQueue_Binding()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Binding> getBinding();

	/**
	 * Returns the value of the '<em><b>Exchange</b></em>' containment reference list.
	 * The list contents are of type {@link mo631model.mo631model.Exchange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exchange</em>' containment reference list.
	 * @see mo631model.mo631model.Mo631modelPackage#getQueue_Exchange()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Exchange> getExchange();

} // Queue
