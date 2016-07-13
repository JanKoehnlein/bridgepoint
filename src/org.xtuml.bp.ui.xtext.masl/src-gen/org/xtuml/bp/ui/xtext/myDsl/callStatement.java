/**
 * generated by Xtext 2.9.1
 */
package org.xtuml.bp.ui.xtext.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>call Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.callStatement#getP <em>P</em>}</li>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.callStatement#getE <em>E</em>}</li>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.callStatement#getC <em>C</em>}</li>
 *   <li>{@link org.xtuml.bp.ui.xtext.myDsl.callStatement#getA <em>A</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#getcallStatement()
 * @model
 * @generated
 */
public interface callStatement extends EObject
{
  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference.
   * @see #setP(primaryExpression)
   * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#getcallStatement_P()
   * @model containment="true"
   * @generated
   */
  primaryExpression getP();

  /**
   * Sets the value of the '{@link org.xtuml.bp.ui.xtext.myDsl.callStatement#getP <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' containment reference.
   * @see #getP()
   * @generated
   */
  void setP(primaryExpression value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link org.xtuml.bp.ui.xtext.myDsl.expression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#getcallStatement_E()
   * @model containment="true"
   * @generated
   */
  EList<expression> getE();

  /**
   * Returns the value of the '<em><b>C</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>C</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>C</em>' attribute list.
   * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#getcallStatement_C()
   * @model unique="false"
   * @generated
   */
  EList<String> getC();

  /**
   * Returns the value of the '<em><b>A</b></em>' containment reference list.
   * The list contents are of type {@link org.xtuml.bp.ui.xtext.myDsl.argumentList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>A</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>A</em>' containment reference list.
   * @see org.xtuml.bp.ui.xtext.myDsl.MyDslPackage#getcallStatement_A()
   * @model containment="true"
   * @generated
   */
  EList<argumentList> getA();

} // callStatement
