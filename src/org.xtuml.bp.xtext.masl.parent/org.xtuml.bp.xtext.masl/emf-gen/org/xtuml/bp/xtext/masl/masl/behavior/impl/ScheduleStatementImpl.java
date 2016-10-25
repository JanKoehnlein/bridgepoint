/**
 * generated by Xtext 2.9.2
 */
package org.xtuml.bp.xtext.masl.masl.behavior.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtuml.bp.xtext.masl.masl.behavior.BehaviorPackage;
import org.xtuml.bp.xtext.masl.masl.behavior.Expression;
import org.xtuml.bp.xtext.masl.masl.behavior.GenerateStatement;
import org.xtuml.bp.xtext.masl.masl.behavior.ScheduleStatement;
import org.xtuml.bp.xtext.masl.masl.behavior.ScheduleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schedule Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.impl.ScheduleStatementImpl#getTimerId <em>Timer Id</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.impl.ScheduleStatementImpl#getGenerateStatement <em>Generate Statement</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.impl.ScheduleStatementImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.impl.ScheduleStatementImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.xtuml.bp.xtext.masl.masl.behavior.impl.ScheduleStatementImpl#getPeriod <em>Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScheduleStatementImpl extends AbstractStatementImpl implements ScheduleStatement {
	/**
	 * The cached value of the '{@link #getTimerId() <em>Timer Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimerId()
	 * @generated
	 * @ordered
	 */
	protected Expression timerId;

	/**
	 * The cached value of the '{@link #getGenerateStatement() <em>Generate Statement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenerateStatement()
	 * @generated
	 * @ordered
	 */
	protected GenerateStatement generateStatement;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ScheduleType TYPE_EDEFAULT = ScheduleType.AT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ScheduleType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Expression time;

	/**
	 * The cached value of the '{@link #getPeriod() <em>Period</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriod()
	 * @generated
	 * @ordered
	 */
	protected Expression period;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScheduleStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviorPackage.Literals.SCHEDULE_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTimerId() {
		return timerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimerId(Expression newTimerId, NotificationChain msgs) {
		Expression oldTimerId = timerId;
		timerId = newTimerId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCHEDULE_STATEMENT__TIMER_ID, oldTimerId, newTimerId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimerId(Expression newTimerId) {
		if (newTimerId != timerId) {
			NotificationChain msgs = null;
			if (timerId != null)
				msgs = ((InternalEObject)timerId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SCHEDULE_STATEMENT__TIMER_ID, null, msgs);
			if (newTimerId != null)
				msgs = ((InternalEObject)newTimerId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SCHEDULE_STATEMENT__TIMER_ID, null, msgs);
			msgs = basicSetTimerId(newTimerId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCHEDULE_STATEMENT__TIMER_ID, newTimerId, newTimerId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenerateStatement getGenerateStatement() {
		return generateStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGenerateStatement(GenerateStatement newGenerateStatement, NotificationChain msgs) {
		GenerateStatement oldGenerateStatement = generateStatement;
		generateStatement = newGenerateStatement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCHEDULE_STATEMENT__GENERATE_STATEMENT, oldGenerateStatement, newGenerateStatement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGenerateStatement(GenerateStatement newGenerateStatement) {
		if (newGenerateStatement != generateStatement) {
			NotificationChain msgs = null;
			if (generateStatement != null)
				msgs = ((InternalEObject)generateStatement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SCHEDULE_STATEMENT__GENERATE_STATEMENT, null, msgs);
			if (newGenerateStatement != null)
				msgs = ((InternalEObject)newGenerateStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SCHEDULE_STATEMENT__GENERATE_STATEMENT, null, msgs);
			msgs = basicSetGenerateStatement(newGenerateStatement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCHEDULE_STATEMENT__GENERATE_STATEMENT, newGenerateStatement, newGenerateStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScheduleType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ScheduleType newType) {
		ScheduleType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCHEDULE_STATEMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(Expression newTime, NotificationChain msgs) {
		Expression oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCHEDULE_STATEMENT__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Expression newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SCHEDULE_STATEMENT__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SCHEDULE_STATEMENT__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCHEDULE_STATEMENT__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPeriod() {
		return period;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPeriod(Expression newPeriod, NotificationChain msgs) {
		Expression oldPeriod = period;
		period = newPeriod;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCHEDULE_STATEMENT__PERIOD, oldPeriod, newPeriod);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriod(Expression newPeriod) {
		if (newPeriod != period) {
			NotificationChain msgs = null;
			if (period != null)
				msgs = ((InternalEObject)period).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SCHEDULE_STATEMENT__PERIOD, null, msgs);
			if (newPeriod != null)
				msgs = ((InternalEObject)newPeriod).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviorPackage.SCHEDULE_STATEMENT__PERIOD, null, msgs);
			msgs = basicSetPeriod(newPeriod, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviorPackage.SCHEDULE_STATEMENT__PERIOD, newPeriod, newPeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviorPackage.SCHEDULE_STATEMENT__TIMER_ID:
				return basicSetTimerId(null, msgs);
			case BehaviorPackage.SCHEDULE_STATEMENT__GENERATE_STATEMENT:
				return basicSetGenerateStatement(null, msgs);
			case BehaviorPackage.SCHEDULE_STATEMENT__TIME:
				return basicSetTime(null, msgs);
			case BehaviorPackage.SCHEDULE_STATEMENT__PERIOD:
				return basicSetPeriod(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviorPackage.SCHEDULE_STATEMENT__TIMER_ID:
				return getTimerId();
			case BehaviorPackage.SCHEDULE_STATEMENT__GENERATE_STATEMENT:
				return getGenerateStatement();
			case BehaviorPackage.SCHEDULE_STATEMENT__TYPE:
				return getType();
			case BehaviorPackage.SCHEDULE_STATEMENT__TIME:
				return getTime();
			case BehaviorPackage.SCHEDULE_STATEMENT__PERIOD:
				return getPeriod();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviorPackage.SCHEDULE_STATEMENT__TIMER_ID:
				setTimerId((Expression)newValue);
				return;
			case BehaviorPackage.SCHEDULE_STATEMENT__GENERATE_STATEMENT:
				setGenerateStatement((GenerateStatement)newValue);
				return;
			case BehaviorPackage.SCHEDULE_STATEMENT__TYPE:
				setType((ScheduleType)newValue);
				return;
			case BehaviorPackage.SCHEDULE_STATEMENT__TIME:
				setTime((Expression)newValue);
				return;
			case BehaviorPackage.SCHEDULE_STATEMENT__PERIOD:
				setPeriod((Expression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BehaviorPackage.SCHEDULE_STATEMENT__TIMER_ID:
				setTimerId((Expression)null);
				return;
			case BehaviorPackage.SCHEDULE_STATEMENT__GENERATE_STATEMENT:
				setGenerateStatement((GenerateStatement)null);
				return;
			case BehaviorPackage.SCHEDULE_STATEMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case BehaviorPackage.SCHEDULE_STATEMENT__TIME:
				setTime((Expression)null);
				return;
			case BehaviorPackage.SCHEDULE_STATEMENT__PERIOD:
				setPeriod((Expression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BehaviorPackage.SCHEDULE_STATEMENT__TIMER_ID:
				return timerId != null;
			case BehaviorPackage.SCHEDULE_STATEMENT__GENERATE_STATEMENT:
				return generateStatement != null;
			case BehaviorPackage.SCHEDULE_STATEMENT__TYPE:
				return type != TYPE_EDEFAULT;
			case BehaviorPackage.SCHEDULE_STATEMENT__TIME:
				return time != null;
			case BehaviorPackage.SCHEDULE_STATEMENT__PERIOD:
				return period != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ScheduleStatementImpl