package io.cloudshiftdev.awscdk.services.sns

public interface ITopicSubscription {
  public fun bind(arg0: ITopic): TopicSubscriptionConfig

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.sns.ITopicSubscription,
  ) : ITopicSubscription {
    override fun bind(arg0: ITopic): TopicSubscriptionConfig =
        unwrap(this).bind(arg0.let(ITopic::unwrap)).let(TopicSubscriptionConfig::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.ITopicSubscription):
        ITopicSubscription = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITopicSubscription):
        software.amazon.awscdk.services.sns.ITopicSubscription = (wrapped as Wrapper).cdkObject
  }
}
