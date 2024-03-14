package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct

public interface INotificationRuleTarget {
  /**
   * Returns a target configuration for notification rule.
   *
   * @param scope 
   */
  public fun bindAsNotificationRuleTarget(scope: Construct): NotificationRuleTargetConfig

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget,
  ) : CdkObject(cdkObject), INotificationRuleTarget {
    /**
     * Returns a target configuration for notification rule.
     *
     * @param scope 
     */
    override fun bindAsNotificationRuleTarget(scope: Construct): NotificationRuleTargetConfig =
        unwrap(this).bindAsNotificationRuleTarget(scope.let(Construct::unwrap)).let(NotificationRuleTargetConfig::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget):
        INotificationRuleTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INotificationRuleTarget):
        software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget
  }
}
