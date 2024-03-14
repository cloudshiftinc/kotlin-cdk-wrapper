package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.Resource
import kotlin.String

public abstract class AlarmBase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmBase,
) : Resource(cdkObject), IAlarm {
  /**
   * Trigger this action if the alarm fires.
   *
   * Typically SnsAction or AutoScalingAction.
   *
   * @param actions 
   */
  public open fun addAlarmAction(actions: IAlarmAction) {
    unwrap(this).addAlarmAction(actions.let(IAlarmAction::unwrap))
  }

  /**
   * Trigger this action if there is insufficient data to evaluate the alarm.
   *
   * Typically SnsAction or AutoScalingAction.
   *
   * @param actions 
   */
  public open fun addInsufficientDataAction(actions: IAlarmAction) {
    unwrap(this).addInsufficientDataAction(actions.let(IAlarmAction::unwrap))
  }

  /**
   * Trigger this action if the alarm returns from breaching state into ok state.
   *
   * Typically SnsAction or AutoScalingAction.
   *
   * @param actions 
   */
  public open fun addOkAction(actions: IAlarmAction) {
    unwrap(this).addOkAction(actions.let(IAlarmAction::unwrap))
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
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmBase,
  ) : AlarmBase(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.AlarmBase): AlarmBase =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AlarmBase): software.amazon.awscdk.services.cloudwatch.AlarmBase =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.AlarmBase
  }
}
