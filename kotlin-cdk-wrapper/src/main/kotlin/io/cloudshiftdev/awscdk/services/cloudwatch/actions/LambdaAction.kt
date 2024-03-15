@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.AlarmActionConfig
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarmAction
import io.cloudshiftdev.constructs.Construct

public open class LambdaAction internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.actions.LambdaAction,
) : CdkObject(cdkObject), IAlarmAction {
  public override fun bind(scope: Construct, alarm: IAlarm): AlarmActionConfig =
      unwrap(this).bind(scope.let(Construct::unwrap),
      alarm.let(IAlarm::unwrap)).let(AlarmActionConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.LambdaAction):
        LambdaAction = LambdaAction(cdkObject)

    internal fun unwrap(wrapped: LambdaAction):
        software.amazon.awscdk.services.cloudwatch.actions.LambdaAction = wrapped.cdkObject
  }
}
