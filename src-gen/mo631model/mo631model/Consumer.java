/**
 */
package mo631model.mo631model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.Consumer#getQueue <em>Queue</em>}</li>
 * </ul>
 *
 * @see mo631model.mo631model.Mo631modelPackage#getConsumer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='QueueDuplicated'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot QueueDuplicated='Tuple {\n\tmessage : String = \'Queue duplicated\',\n\tstatus : Boolean = \t\t\n\t\tlet nameBagSize : Integer = queue-&gt;collect(name)-&gt;asBag()-&gt;size() in\n\t\tlet nameSetSize : Integer = queue-&gt;collect(name)-&gt;asSet()-&gt;size() in\n\t\t\n\t\tif queue-&gt;isEmpty() then true\n\t\telse\n\t\t  nameBagSize = nameSetSize\n\t\tendif\n}.status'"
 * @generated
 */
public interface Consumer extends EObject {
	/**
	 * Returns the value of the '<em><b>Queue</b></em>' containment reference list.
	 * The list contents are of type {@link mo631model.mo631model.Queue}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue</em>' containment reference list.
	 * @see mo631model.mo631model.Mo631modelPackage#getConsumer_Queue()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Queue> getQueue();

} // Consumer
