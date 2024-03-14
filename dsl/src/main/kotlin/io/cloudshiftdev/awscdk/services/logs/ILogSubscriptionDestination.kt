package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.constructs.Construct

public interface ILogSubscriptionDestination {
    /**
     * Return the properties required to send subscription events to this destination.
     *
     * If necessary, the destination can use the properties of the SubscriptionFilter object itself
     * to configure its permissions to allow the subscription to write to it.
     *
     * The destination may reconfigure its own permissions in response to this function call.
     *
     * @param scope
     * @param sourceLogGroup
     */
    public fun bind(scope: Construct, sourceLogGroup: ILogGroup): LogSubscriptionDestinationConfig

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.logs.ILogSubscriptionDestination,
    ) : ILogSubscriptionDestination {
        /**
         * Return the properties required to send subscription events to this destination.
         *
         * If necessary, the destination can use the properties of the SubscriptionFilter object
         * itself to configure its permissions to allow the subscription to write to it.
         *
         * The destination may reconfigure its own permissions in response to this function call.
         *
         * @param scope
         * @param sourceLogGroup
         */
        override fun bind(
            scope: Construct,
            sourceLogGroup: ILogGroup
        ): LogSubscriptionDestinationConfig =
            unwrap(this)
                .bind(scope.let(Construct::unwrap), sourceLogGroup.let(ILogGroup::unwrap))
                .let(LogSubscriptionDestinationConfig::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.logs.ILogSubscriptionDestination
        ): ILogSubscriptionDestination = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ILogSubscriptionDestination
        ): software.amazon.awscdk.services.logs.ILogSubscriptionDestination =
            (wrapped as Wrapper).cdkObject
    }
}
