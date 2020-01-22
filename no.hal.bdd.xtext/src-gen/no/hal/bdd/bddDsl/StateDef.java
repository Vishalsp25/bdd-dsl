/**
 * generated by Xtext 2.18.0.M3
 */
package no.hal.bdd.bddDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.bdd.bddDsl.StateDef#getPostive <em>Postive</em>}</li>
 *   <li>{@link no.hal.bdd.bddDsl.StateDef#getNegative <em>Negative</em>}</li>
 * </ul>
 *
 * @see no.hal.bdd.bddDsl.BddDslPackage#getStateDef()
 * @model
 * @generated
 */
public interface StateDef extends EObject
{
  /**
   * Returns the value of the '<em><b>Postive</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postive</em>' containment reference.
   * @see #setPostive(StateName)
   * @see no.hal.bdd.bddDsl.BddDslPackage#getStateDef_Postive()
   * @model containment="true"
   * @generated
   */
  StateName getPostive();

  /**
   * Sets the value of the '{@link no.hal.bdd.bddDsl.StateDef#getPostive <em>Postive</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postive</em>' containment reference.
   * @see #getPostive()
   * @generated
   */
  void setPostive(StateName value);

  /**
   * Returns the value of the '<em><b>Negative</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Negative</em>' containment reference.
   * @see #setNegative(StateName)
   * @see no.hal.bdd.bddDsl.BddDslPackage#getStateDef_Negative()
   * @model containment="true"
   * @generated
   */
  StateName getNegative();

  /**
   * Sets the value of the '{@link no.hal.bdd.bddDsl.StateDef#getNegative <em>Negative</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Negative</em>' containment reference.
   * @see #getNegative()
   * @generated
   */
  void setNegative(StateName value);

} // StateDef