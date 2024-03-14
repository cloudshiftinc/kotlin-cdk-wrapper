package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.constructs.Construct

public interface INotificationRuleSource {
  public fun bindAsNotificationRuleSource(arg0: Construct): NotificationRuleSourceConfig

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource,
  ) : INotificationRuleSource {
    override fun bindAsNotificationRuleSource(arg0: Construct): NotificationRuleSourceConfig =
        unwrap(this).bindAsNotificationRuleSource(arg0.let(Construct::unwrap)).let(NotificationRuleSourceConfig::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource):
        INotificationRuleSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INotificationRuleSource):
        software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource = (wrapped as
        Wrapper).cdkObject
  }
}
