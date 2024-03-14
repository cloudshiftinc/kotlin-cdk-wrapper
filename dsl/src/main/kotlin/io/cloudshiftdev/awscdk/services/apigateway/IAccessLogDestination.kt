package io.cloudshiftdev.awscdk.services.apigateway

public interface IAccessLogDestination {
    /**
     * Binds this destination to the RestApi Stage.
     *
     * @param stage
     */
    public fun bind(stage: IStage): AccessLogDestinationConfig

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigateway.IAccessLogDestination,
    ) : IAccessLogDestination {
        /**
         * Binds this destination to the RestApi Stage.
         *
         * @param stage
         */
        override fun bind(stage: IStage): AccessLogDestinationConfig =
            unwrap(this).bind(stage.let(IStage::unwrap)).let(AccessLogDestinationConfig::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.IAccessLogDestination
        ): IAccessLogDestination = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IAccessLogDestination
        ): software.amazon.awscdk.services.apigateway.IAccessLogDestination =
            (wrapped as Wrapper).cdkObject
    }
}
