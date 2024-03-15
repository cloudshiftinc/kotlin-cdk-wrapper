@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.autoscaling.StepScalingAction
import io.cloudshiftdev.awscdk.services.cloudwatch.AlarmActionConfig
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarmAction
import io.cloudshiftdev.constructs.Construct

/**
 * Use an AutoScaling StepScalingAction as an Alarm Action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * import io.cloudshiftdev.awscdk.services.cloudwatch.actions.*;
 * StepScalingAction stepScalingAction;
 * AutoScalingAction autoScalingAction = new AutoScalingAction(stepScalingAction);
 * ```
 */
public open class AutoScalingAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.cloudwatch.actions.AutoScalingAction,
) : CdkObject(cdkObject), IAlarmAction {
  public constructor(stepScalingAction: StepScalingAction) :
      this(software.amazon.awscdk.services.cloudwatch.actions.AutoScalingAction(StepScalingAction.unwrap(stepScalingAction)))

  /**
   * Returns an alarm action configuration to use an AutoScaling StepScalingAction as an alarm
   * action.
   *
   * @param _scope 
   * @param _alarm 
   */
  public override fun bind(_scope: Construct, _alarm: IAlarm): AlarmActionConfig =
      unwrap(this).bind(_scope.let(Construct::unwrap),
      _alarm.let(IAlarm::unwrap)).let(AlarmActionConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.AutoScalingAction):
        AutoScalingAction = AutoScalingAction(cdkObject)

    internal fun unwrap(wrapped: AutoScalingAction):
        software.amazon.awscdk.services.cloudwatch.actions.AutoScalingAction = wrapped.cdkObject
  }
}
