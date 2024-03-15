@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct

public interface INotificationRuleTarget {
  public fun bindAsNotificationRuleTarget(arg0: Construct): NotificationRuleTargetConfig

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget,
  ) : CdkObject(cdkObject), INotificationRuleTarget {
    override fun bindAsNotificationRuleTarget(arg0: Construct): NotificationRuleTargetConfig =
        unwrap(this).bindAsNotificationRuleTarget(arg0.let(Construct::unwrap)).let(NotificationRuleTargetConfig::wrap)
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
