package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.constructs.Construct

public interface ILogSubscriptionDestination {
  public fun bind(arg0: Construct, arg1: ILogGroup): LogSubscriptionDestinationConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.logs.ILogSubscriptionDestination,
  ) : ILogSubscriptionDestination {
    override fun bind(arg0: Construct, arg1: ILogGroup): LogSubscriptionDestinationConfig =
        unwrap(this).bind(arg0.let(Construct::unwrap),
        arg1.let(ILogGroup::unwrap)).let(LogSubscriptionDestinationConfig::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.ILogSubscriptionDestination):
        ILogSubscriptionDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ILogSubscriptionDestination):
        software.amazon.awscdk.services.logs.ILogSubscriptionDestination = (wrapped as
        Wrapper).cdkObject
  }
}
