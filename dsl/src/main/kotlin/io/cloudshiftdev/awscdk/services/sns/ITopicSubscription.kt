package io.cloudshiftdev.awscdk.services.sns

public interface ITopicSubscription {
    /**
     * Returns a configuration used to subscribe to an SNS topic.
     *
     * @param topic topic for which subscription will be configured.
     */
    public fun bind(topic: ITopic): TopicSubscriptionConfig

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.sns.ITopicSubscription,
    ) : ITopicSubscription {
        /**
         * Returns a configuration used to subscribe to an SNS topic.
         *
         * @param topic topic for which subscription will be configured.
         */
        override fun bind(topic: ITopic): TopicSubscriptionConfig =
            unwrap(this).bind(topic.let(ITopic::unwrap)).let(TopicSubscriptionConfig::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.sns.ITopicSubscription
        ): ITopicSubscription = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ITopicSubscription
        ): software.amazon.awscdk.services.sns.ITopicSubscription = (wrapped as Wrapper).cdkObject
    }
}
