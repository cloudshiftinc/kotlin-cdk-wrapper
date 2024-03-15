@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch.actions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cloudwatch.AlarmActionConfig
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarm
import io.cloudshiftdev.awscdk.services.cloudwatch.IAlarmAction
import io.cloudshiftdev.constructs.Construct

/**
 * Use an SSM OpsItem action as an Alarm action.
 *
 * Example:
 *
 * ```
 * Alarm alarm;
 * // Create an OpsItem with specific severity and category when alarm triggers
 * alarm.addAlarmAction(
 * new SsmAction(OpsItemSeverity.CRITICAL, OpsItemCategory.PERFORMANCE));
 * ```
 */
public open class SsmAction internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.actions.SsmAction,
) : CdkObject(cdkObject), IAlarmAction {
  public constructor(severity: OpsItemSeverity) :
      this(software.amazon.awscdk.services.cloudwatch.actions.SsmAction(severity.let(OpsItemSeverity::unwrap))
  )

  public constructor(severity: OpsItemSeverity, category: OpsItemCategory) :
      this(software.amazon.awscdk.services.cloudwatch.actions.SsmAction(severity.let(OpsItemSeverity::unwrap),
      category.let(OpsItemCategory::unwrap))
  )

  /**
   * Returns an alarm action configuration to use an SSM OpsItem action as an alarm action.
   *
   * @param _scope 
   * @param _alarm 
   */
  public override fun bind(scope: Construct, alarm: IAlarm): AlarmActionConfig =
      unwrap(this).bind(scope.let(Construct::unwrap),
      alarm.let(IAlarm::unwrap)).let(AlarmActionConfig::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.actions.SsmAction):
        SsmAction = SsmAction(cdkObject)

    internal fun unwrap(wrapped: SsmAction):
        software.amazon.awscdk.services.cloudwatch.actions.SsmAction = wrapped.cdkObject
  }
}
