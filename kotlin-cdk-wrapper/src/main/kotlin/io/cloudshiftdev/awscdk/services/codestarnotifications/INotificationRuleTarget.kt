@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct

/**
 * Represents a notification target That allows AWS Chatbot and SNS topic to associate with this
 * rule target.
 */
public interface INotificationRuleTarget {
  /**
   * Returns a target configuration for notification rule.
   *
   * @param scope 
   */
  public fun bindAsNotificationRuleTarget(scope: Construct): NotificationRuleTargetConfig

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget):
        INotificationRuleTarget = CdkObjectWrappers.wrap(cdkObject) as INotificationRuleTarget

    internal fun unwrap(wrapped: INotificationRuleTarget):
        software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget
  }
}
