@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * The base class for Alarm and CompositeAlarm resources.
 */
public abstract class AlarmBase(
  cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmBase,
) : Resource(cdkObject), IAlarm {
  /**
   * Trigger this action if the alarm fires.
   *
   * Typically SnsAction or AutoScalingAction.
   *
   * @param actions 
   */
  public open fun addAlarmAction(vararg actions: IAlarmAction) {
    unwrap(this).addAlarmAction(*actions.map(IAlarmAction::unwrap).toTypedArray())
  }

  /**
   * Trigger this action if there is insufficient data to evaluate the alarm.
   *
   * Typically SnsAction or AutoScalingAction.
   *
   * @param actions 
   */
  public open fun addInsufficientDataAction(vararg actions: IAlarmAction) {
    unwrap(this).addInsufficientDataAction(*actions.map(IAlarmAction::unwrap).toTypedArray())
  }

  /**
   * Trigger this action if the alarm returns from breaching state into ok state.
   *
   * Typically SnsAction or AutoScalingAction.
   *
   * @param actions 
   */
  public open fun addOkAction(vararg actions: IAlarmAction) {
    unwrap(this).addOkAction(*actions.map(IAlarmAction::unwrap).toTypedArray())
  }

  /**
   * Alarm ARN (i.e. arn:aws:cloudwatch:<region>:<account-id>:alarm:Foo).
   */
  public override fun alarmArn(): String = unwrap(this).getAlarmArn()

  /**
   * Name of the alarm.
   */
  public override fun alarmName(): String = unwrap(this).getAlarmName()

  /**
   * AlarmRule indicating ALARM state for Alarm.
   */
  public override fun renderAlarmRule(): String = unwrap(this).renderAlarmRule()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmBase,
  ) : AlarmBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmBase): AlarmBase =
        CdkObjectWrappers.wrap(cdkObject) as? AlarmBase ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlarmBase): software.amazon.awscdk.services.cloudwatch.AlarmBase =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.AlarmBase
  }
}
