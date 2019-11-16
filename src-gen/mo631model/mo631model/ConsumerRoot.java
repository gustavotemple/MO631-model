/**
 */
package mo631model.mo631model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumer Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.ConsumerRoot#getConsumer <em>Consumer</em>}</li>
 *   <li>{@link mo631model.mo631model.ConsumerRoot#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mo631model.mo631model.Mo631modelPackage#getConsumerRoot()
 * @model
 * @generated
 */
public interface ConsumerRoot extends Root {
	/**
	 * Returns the value of the '<em><b>Consumer</b></em>' containment reference list.
	 * The list contents are of type {@link mo631model.mo631model.Consumer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumer</em>' containment reference list.
	 * @see mo631model.mo631model.Mo631modelPackage#getConsumerRoot_Consumer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Consumer> getConsumer();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"ConsumerApp"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mo631model.mo631model.Mo631modelPackage#getConsumerRoot_Name()
	 * @model default="ConsumerApp" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mo631model.mo631model.ConsumerRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ConsumerRoot
