@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String

/**
 * Represents a notification rule.
 */
public interface INotificationRule : IResource {
  /**
   * Adds target to notification rule.
   *
   * @return boolean - return true if it had any effect
   * @param target The SNS topic or AWS Chatbot Slack target. 
   */
  public fun addTarget(target: INotificationRuleTarget): Boolean

  /**
   * The ARN of the notification rule (i.e.
   * arn:aws:codestar-notifications:::notificationrule/01234abcde).
   */
  public fun notificationRuleArn(): String

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.INotificationRule):
        INotificationRule = CdkObjectWrappers.wrap(cdkObject) as INotificationRule

    internal fun unwrap(wrapped: INotificationRule):
        software.amazon.awscdk.services.codestarnotifications.INotificationRule = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarnotifications.INotificationRule
  }
}
