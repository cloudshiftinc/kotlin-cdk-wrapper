package io.cloudshiftdev.awscdk.services.cloudwatch.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.AlarmActionConfig
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarmAction
import io.cloudshiftdev.constructs.Construct

public open class ApplicationScalingAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cloudwatch.actions.ApplicationScalingAction,
) : CdkObject(cdkObject), IAlarmAction {
  /**
   * Returns an alarm action configuration to use an ApplicationScaling StepScalingAction as an
   * alarm action.
   *
   * @param _scope 
   * @param _alarm 
   */
  public override fun bind(_scope: Construct, _alarm: IAlarm): AlarmActionConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap),
      _alarm.let(IAlarm::unwrap)).let(AlarmActionConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.ApplicationScalingAction):
        ApplicationScalingAction = ApplicationScalingAction(cdkObject)

    internal fun unwrap(wrapped: ApplicationScalingAction):
        software.amazon.awscdk.services.cloudwatch.actions.ApplicationScalingAction =
        wrapped.cdkObject
  }
}
