@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.applicationautoscaling.StepScalingAction
import io.cloudshiftdev.awscdk.services.cloudwatch.AlarmActionConfig
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarmAction
import io.cloudshiftdev.constructs.Construct

/**
 * Use an ApplicationAutoScaling StepScalingAction as an Alarm Action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.applicationautoscaling.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.actions.*;
 * StepScalingAction stepScalingAction;
 * ApplicationScalingAction applicationScalingAction = new
 * ApplicationScalingAction(stepScalingAction);
 * ```
 */
public open class ApplicationScalingAction(
  cdkObject: software.amazon.awscdk.services.cloudwatch.actions.ApplicationScalingAction,
) : CdkObject(cdkObject), IAlarmAction {
  public constructor(stepScalingAction: StepScalingAction) :
      this(software.amazon.awscdk.services.cloudwatch.actions.ApplicationScalingAction(stepScalingAction.let(StepScalingAction.Companion::unwrap))
  )

  /**
   * Returns an alarm action configuration to use an ApplicationScaling StepScalingAction as an
   * alarm action.
   *
   * @param _scope 
   * @param _alarm 
   */
  public override fun bind(scope: Construct, alarm: IAlarm): AlarmActionConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      alarm.let(IAlarm.Companion::unwrap)).let(AlarmActionConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.ApplicationScalingAction):
        ApplicationScalingAction = ApplicationScalingAction(cdkObject)

    internal fun unwrap(wrapped: ApplicationScalingAction):
        software.amazon.awscdk.services.cloudwatch.actions.ApplicationScalingAction =
        wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.actions.ApplicationScalingAction
  }
}
