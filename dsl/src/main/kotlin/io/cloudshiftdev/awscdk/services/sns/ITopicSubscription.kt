package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CdkObject

public interface ITopicSubscription {
  /**
   * Returns a configuration used to subscribe to an SNS topic.
   *
   * @param topic topic for which subscription will be configured. 
   */
  public fun bind(topic: ITopic): TopicSubscriptionConfig

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.ITopicSubscription,
  ) : CdkObject(cdkObject), ITopicSubscription {
    /**
     * Returns a configuration used to subscribe to an SNS topic.
     *
     * @param topic topic for which subscription will be configured. 
     */
    override fun bind(topic: ITopic): TopicSubscriptionConfig =
        unwrap(this).bind(topic.let(ITopic::unwrap)).let(TopicSubscriptionConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.ITopicSubscription):
        ITopicSubscription = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ITopicSubscription):
        software.amazon.awscdk.services.sns.ITopicSubscription = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.sns.ITopicSubscription
  }
}