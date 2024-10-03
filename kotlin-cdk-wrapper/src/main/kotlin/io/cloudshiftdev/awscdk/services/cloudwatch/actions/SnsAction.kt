@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.AlarmActionConfig
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarmAction
import io.cloudshiftdev.awscdk.services.sns.ITopic
import io.cloudshiftdev.constructs.Construct

/**
 * Use an SNS topic as an alarm action.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cloudwatch.actions.*;
 * Alarm alarm;
 * Topic topic = new Topic(this, "Topic");
 * alarm.addAlarmAction(new SnsAction(topic));
 * ```
 */
public open class SnsAction(
  cdkObject: software.amazon.awscdk.services.cloudwatch.actions.SnsAction,
) : CdkObject(cdkObject),
    IAlarmAction {
  public constructor(topic: ITopic) :
      this(software.amazon.awscdk.services.cloudwatch.actions.SnsAction(topic.let(ITopic.Companion::unwrap))
  )

  /**
   * Returns an alarm action configuration to use an SNS topic as an alarm action.
   *
   * @param _scope 
   * @param _alarm 
   */
  public override fun bind(scope: Construct, alarm: IAlarm): AlarmActionConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      alarm.let(IAlarm.Companion::unwrap)).let(AlarmActionConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.SnsAction):
        SnsAction = SnsAction(cdkObject)

    internal fun unwrap(wrapped: SnsAction):
        software.amazon.awscdk.services.cloudwatch.actions.SnsAction = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.actions.SnsAction
  }
}
