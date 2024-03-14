package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.constructs.Construct

public interface INotificationRuleSource {
  /**
   * Returns a source configuration for notification rule.
   *
   * @param scope 
   */
  public fun bindAsNotificationRuleSource(scope: Construct): NotificationRuleSourceConfig

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource,
  ) : CdkObject(cdkObject), INotificationRuleSource {
    /**
     * Returns a source configuration for notification rule.
     *
     * @param scope 
     */
    override fun bindAsNotificationRuleSource(scope: Construct): NotificationRuleSourceConfig =
        unwrap(this).bindAsNotificationRuleSource(scope.let(Construct::unwrap)).let(NotificationRuleSourceConfig::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource):
        INotificationRuleSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INotificationRuleSource):
        software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource
  }
}
