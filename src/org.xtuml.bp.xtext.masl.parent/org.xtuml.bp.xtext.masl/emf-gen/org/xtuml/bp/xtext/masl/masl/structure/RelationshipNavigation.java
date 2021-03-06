/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.structure;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Navigation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.RelationshipNavigation#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.RelationshipNavigation#getObjectOrRole <em>Object Or Role</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.structure.RelationshipNavigation#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getRelationshipNavigation()
 * @model
 * @generated
 */
public interface RelationshipNavigation extends EObject {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' reference.
	 * @see #setRelationship(RelationshipDefinition)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getRelationshipNavigation_Relationship()
	 * @model
	 * @generated
	 */
	RelationshipDefinition getRelationship();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.RelationshipNavigation#getRelationship <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship</em>' reference.
	 * @see #getRelationship()
	 * @generated
	 */
	void setRelationship(RelationshipDefinition value);

	/**
	 * Returns the value of the '<em><b>Object Or Role</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Or Role</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Or Role</em>' reference.
	 * @see #setObjectOrRole(ObjectOrRole)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getRelationshipNavigation_ObjectOrRole()
	 * @model
	 * @generated
	 */
	ObjectOrRole getObjectOrRole();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.RelationshipNavigation#getObjectOrRole <em>Object Or Role</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Or Role</em>' reference.
	 * @see #getObjectOrRole()
	 * @generated
	 */
	void setObjectOrRole(ObjectOrRole value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(ObjectDeclaration)
	 * @see org.xtuml.bp.xtext.masl.masl.structure.StructurePackage#getRelationshipNavigation_Object()
	 * @model
	 * @generated
	 */
	ObjectDeclaration getObject();

	/**
	 * Sets the value of the '{@link org.xtuml.bp.xtext.masl.masl.structure.RelationshipNavigation#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(ObjectDeclaration value);

} // RelationshipNavigation
