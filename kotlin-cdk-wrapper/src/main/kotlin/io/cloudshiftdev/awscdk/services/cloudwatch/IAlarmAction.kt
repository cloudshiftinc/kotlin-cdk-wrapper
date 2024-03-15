@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct

public interface IAlarmAction {
  public fun bind(arg0: Construct, arg1: IAlarm): AlarmActionConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.IAlarmAction,
  ) : CdkObject(cdkObject), IAlarmAction {
    override fun bind(arg0: Construct, arg1: IAlarm): AlarmActionConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(IAlarm::unwrap)).let(AlarmActionConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IAlarmAction):
        IAlarmAction = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAlarmAction):
        software.amazon.awscdk.services.cloudwatch.IAlarmAction = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudwatch.IAlarmAction
  }
}
