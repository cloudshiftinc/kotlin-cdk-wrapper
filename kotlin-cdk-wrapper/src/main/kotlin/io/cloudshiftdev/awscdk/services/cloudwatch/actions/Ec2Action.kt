@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.AlarmActionConfig
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarmAction
import io.cloudshiftdev.constructs.Construct

/**
 * Use an EC2 action as an Alarm action.
 *
 * Example:
 *
 * ```
 * // Alarm must be configured with an EC2 per-instance metric
 * Alarm alarm;
 * // Attach a reboot when alarm triggers
 * alarm.addAlarmAction(
 * new Ec2Action(Ec2InstanceAction.REBOOT));
 * ```
 */
public open class Ec2Action(
  cdkObject: software.amazon.awscdk.services.cloudwatch.actions.Ec2Action,
) : CdkObject(cdkObject), IAlarmAction {
  public constructor(instanceAction: Ec2InstanceAction) :
      this(software.amazon.awscdk.services.cloudwatch.actions.Ec2Action(instanceAction.let(Ec2InstanceAction::unwrap))
  )

  /**
   * Returns an alarm action configuration to use an EC2 action as an alarm action.
   *
   * @param _scope 
   * @param _alarm 
   */
  public override fun bind(scope: Construct, alarm: IAlarm): AlarmActionConfig =
      unwrap(this).bind(scope.let(Construct::unwrap),
      alarm.let(IAlarm::unwrap)).let(AlarmActionConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.Ec2Action):
        Ec2Action = Ec2Action(cdkObject)

    internal fun unwrap(wrapped: Ec2Action):
        software.amazon.awscdk.services.cloudwatch.actions.Ec2Action = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.actions.Ec2Action
  }
}
