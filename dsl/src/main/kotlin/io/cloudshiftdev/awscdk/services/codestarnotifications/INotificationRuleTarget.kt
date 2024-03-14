package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.constructs.Construct

public interface INotificationRuleTarget {
  public fun bindAsNotificationRuleTarget(arg0: Construct): NotificationRuleTargetConfig

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget,
  ) : INotificationRuleTarget {
    override fun bindAsNotificationRuleTarget(arg0: Construct): NotificationRuleTargetConfig =
        unwrap(this).bindAsNotificationRuleTarget(arg0.let(Construct::unwrap)).let(NotificationRuleTargetConfig::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget):
        INotificationRuleTarget = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INotificationRuleTarget):
        software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget = (wrapped as
        Wrapper).cdkObject
  }
}
