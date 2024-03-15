@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct

public interface ILogSubscriptionDestination {
  public fun bind(arg0: Construct, arg1: ILogGroup): LogSubscriptionDestinationConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.ILogSubscriptionDestination,
  ) : CdkObject(cdkObject), ILogSubscriptionDestination {
    override fun bind(arg0: Construct, arg1: ILogGroup): LogSubscriptionDestinationConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(ILogGroup::unwrap)).let(LogSubscriptionDestinationConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ILogSubscriptionDestination):
        ILogSubscriptionDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILogSubscriptionDestination):
        software.amazon.awscdk.services.logs.ILogSubscriptionDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.logs.ILogSubscriptionDestination
  }
}
