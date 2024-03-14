package io.cloudshiftdev.awscdk.services.cloudwatch.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.AlarmActionConfig
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarmAction
import io.cloudshiftdev.constructs.Construct

public open class SnsAction internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.actions.SnsAction,
) : CdkObject(cdkObject), IAlarmAction {
  /**
   * Returns an alarm action configuration to use an SNS topic as an alarm action.
   *
   * @param _scope 
   * @param _alarm 
   */
  public override fun bind(_scope: Construct, _alarm: IAlarm): AlarmActionConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap),
      _alarm.let(IAlarm::unwrap)).let(AlarmActionConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.SnsAction):
        SnsAction = SnsAction(cdkObject)

    internal fun unwrap(wrapped: SnsAction):
        software.amazon.awscdk.services.cloudwatch.actions.SnsAction = wrapped.cdkObject
  }
}
