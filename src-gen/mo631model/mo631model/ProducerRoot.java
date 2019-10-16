/**
 */
package mo631model.mo631model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Producer Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.ProducerRoot#getProducer <em>Producer</em>}</li>
 * </ul>
 *
 * @see mo631model.mo631model.Mo631modelPackage#getProducerRoot()
 * @model
 * @generated
 */
public interface ProducerRoot extends Root {
	/**
	 * Returns the value of the '<em><b>Producer</b></em>' containment reference list.
	 * The list contents are of type {@link mo631model.mo631model.Producer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Producer</em>' containment reference list.
	 * @see mo631model.mo631model.Mo631modelPackage#getProducerRoot_Producer()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Producer> getProducer();

} // ProducerRoot
