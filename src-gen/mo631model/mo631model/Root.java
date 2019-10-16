/**
 */
package mo631model.mo631model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mo631model.mo631model.Root#getHost <em>Host</em>}</li>
 *   <li>{@link mo631model.mo631model.Root#getPort <em>Port</em>}</li>
 *   <li>{@link mo631model.mo631model.Root#getPassword <em>Password</em>}</li>
 *   <li>{@link mo631model.mo631model.Root#getUsername <em>Username</em>}</li>
 * </ul>
 *
 * @see mo631model.mo631model.Mo631modelPackage#getRoot()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='InvalidPortNumber'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot InvalidPortNumber='Tuple {\n\tmessage : String = \'Invalid port number\',\n\tstatus : Boolean = port &gt;= 1 and port &lt;= 65535\n}.status'"
 * @generated
 */
public interface Root extends EObject {
	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * The default value is <code>"localhost"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see mo631model.mo631model.Mo631modelPackage#getRoot_Host()
	 * @model default="localhost" required="true"
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link mo631model.mo631model.Root#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"5672"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see mo631model.mo631model.Mo631modelPackage#getRoot_Port()
	 * @model default="5672" required="true"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link mo631model.mo631model.Root#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * The default value is <code>"guest"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see mo631model.mo631model.Mo631modelPackage#getRoot_Password()
	 * @model default="guest" required="true"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link mo631model.mo631model.Root#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * The default value is <code>"guest"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see mo631model.mo631model.Mo631modelPackage#getRoot_Username()
	 * @model default="guest" required="true"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link mo631model.mo631model.Root#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

} // Root
