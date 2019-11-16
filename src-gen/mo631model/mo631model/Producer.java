/**
 */
package mo631model.mo631model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.Producer#getMessage <em>Message</em>}</li>
 *   <li>{@link mo631model.mo631model.Producer#getBinding <em>Binding</em>}</li>
 *   <li>{@link mo631model.mo631model.Producer#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mo631model.mo631model.Mo631modelPackage#getProducer()
 * @model
 * @generated
 */
public interface Producer extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link mo631model.mo631model.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see mo631model.mo631model.Mo631modelPackage#getProducer_Message()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessage();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference.
	 * @see #setBinding(Binding)
	 * @see mo631model.mo631model.Mo631modelPackage#getProducer_Binding()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Binding getBinding();

	/**
	 * Sets the value of the '{@link mo631model.mo631model.Producer#getBinding <em>Binding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binding</em>' containment reference.
	 * @see #getBinding()
	 * @generated
	 */
	void setBinding(Binding value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mo631model.mo631model.Mo631modelPackage#getProducer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mo631model.mo631model.Producer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Producer
