@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct

/**
 * Interface for objects that can be the targets of CloudWatch alarm actions.
 */
public interface IAlarmAction {
  /**
   * Return the properties required to send alarm actions to this CloudWatch alarm.
   *
   * @param scope root Construct that allows creating new Constructs. 
   * @param alarm CloudWatch alarm that the action will target. 
   */
  public fun bind(scope: Construct, alarm: IAlarm): AlarmActionConfig

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.IAlarmAction,
  ) : CdkObject(cdkObject), IAlarmAction {
    /**
     * Return the properties required to send alarm actions to this CloudWatch alarm.
     *
     * @param scope root Construct that allows creating new Constructs. 
     * @param alarm CloudWatch alarm that the action will target. 
     */
    override fun bind(scope: Construct, alarm: IAlarm): AlarmActionConfig =
        unwrap(this).bind(scope.let(Construct::unwrap),
        alarm.let(IAlarm::unwrap)).let(AlarmActionConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IAlarmAction):
        IAlarmAction = CdkObjectWrappers.wrap(cdkObject) as? IAlarmAction ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAlarmAction):
        software.amazon.awscdk.services.cloudwatch.IAlarmAction = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudwatch.IAlarmAction
  }
}
