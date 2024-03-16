@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Represents a CloudWatch Alarm.
 */
public interface IAlarm : IAlarmRule, IResource {
  /**
   * Alarm ARN (i.e. arn:aws:cloudwatch:<region>:<account-id>:alarm:Foo).
   */
  public fun alarmArn(): String

  /**
   * Name of the alarm.
   */
  public fun alarmName(): String

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.IAlarm): IAlarm =
        CdkObjectWrappers.wrap(cdkObject) as IAlarm

    internal fun unwrap(wrapped: IAlarm): software.amazon.awscdk.services.cloudwatch.IAlarm =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.IAlarm
  }
}
