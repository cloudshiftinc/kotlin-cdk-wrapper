@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.AlarmActionConfig
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarmAction
import io.cloudshiftdev.constructs.Construct
import kotlin.Any

/**
 * Use a Lambda action as an Alarm action.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * Alarm alarm;
 * Function fn;
 * Alias alias;
 * Version version;
 * // Attach a Lambda Function when alarm triggers
 * alarm.addAlarmAction(
 * new LambdaAction(fn));
 * // Attach a Lambda Function Alias when alarm triggers
 * alarm.addAlarmAction(
 * new LambdaAction(alias));
 * // Attach a Lambda Function version when alarm triggers
 * alarm.addAlarmAction(
 * new LambdaAction(version));
 * ```
 */
public open class LambdaAction(
  cdkObject: software.amazon.awscdk.services.cloudwatch.actions.LambdaAction,
) : CdkObject(cdkObject),
    IAlarmAction {
  public constructor(lambdaFunction: Any) :
      this(software.amazon.awscdk.services.cloudwatch.actions.LambdaAction(lambdaFunction)
  )

  /**
   * Returns an alarm action configuration to use a Lambda action as an alarm action.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonCloudWatch/latest/APIReference/API_PutMetricAlarm.html)
   * @param scope 
   * @param alarm 
   */
  public override fun bind(scope: Construct, alarm: IAlarm): AlarmActionConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      alarm.let(IAlarm.Companion::unwrap)).let(AlarmActionConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.LambdaAction):
        LambdaAction = LambdaAction(cdkObject)

    internal fun unwrap(wrapped: LambdaAction):
        software.amazon.awscdk.services.cloudwatch.actions.LambdaAction = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.actions.LambdaAction
  }
}
