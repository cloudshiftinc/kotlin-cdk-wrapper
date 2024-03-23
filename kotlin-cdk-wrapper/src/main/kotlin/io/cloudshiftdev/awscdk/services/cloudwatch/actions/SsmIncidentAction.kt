@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.AlarmActionConfig
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarmAction
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * Use an SSM Incident Response Plan as an Alarm action.
 *
 * Example:
 *
 * ```
 * Alarm alarm;
 * // Create an Incident Manager incident based on a specific response plan
 * alarm.addAlarmAction(
 * new SsmIncidentAction("ResponsePlanName"));
 * ```
 */
public open class SsmIncidentAction(
  cdkObject: software.amazon.awscdk.services.cloudwatch.actions.SsmIncidentAction,
) : CdkObject(cdkObject), IAlarmAction {
  public constructor(responsePlanName: String) :
      this(software.amazon.awscdk.services.cloudwatch.actions.SsmIncidentAction(responsePlanName)
  )

  /**
   * Returns an alarm action configuration to use an SSM Incident as an alarm action based on an
   * Incident Manager Response Plan.
   *
   * @param _scope 
   * @param _alarm 
   */
  public override fun bind(scope: Construct, alarm: IAlarm): AlarmActionConfig =
      unwrap(this).bind(scope.let(Construct::unwrap),
      alarm.let(IAlarm::unwrap)).let(AlarmActionConfig::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.SsmIncidentAction):
        SsmIncidentAction = SsmIncidentAction(cdkObject)

    internal fun unwrap(wrapped: SsmIncidentAction):
        software.amazon.awscdk.services.cloudwatch.actions.SsmIncidentAction = wrapped.cdkObject as
        software.amazon.awscdk.services.cloudwatch.actions.SsmIncidentAction
  }
}
