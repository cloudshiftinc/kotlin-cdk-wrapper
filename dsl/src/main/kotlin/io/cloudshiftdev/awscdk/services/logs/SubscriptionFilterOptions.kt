package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface SubscriptionFilterOptions {
    /**
     * The destination to send the filtered events to.
     *
     * For example, a Kinesis stream or a Lambda function.
     */
    public fun destination(): ILogSubscriptionDestination

    /**
     * The name of the subscription filter.
     *
     * Default: Automatically generated
     */
    public fun filterName(): String? = unwrap(this).getFilterName()

    /** Log events matching this pattern will be sent to the destination. */
    public fun filterPattern(): IFilterPattern

    /** A builder for [SubscriptionFilterOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param destination The destination to send the filtered events to. For example, a Kinesis
         *   stream or a Lambda function.
         */
        public fun destination(destination: ILogSubscriptionDestination)

        /** @param filterName The name of the subscription filter. */
        public fun filterName(filterName: String)

        /**
         * @param filterPattern Log events matching this pattern will be sent to the destination.
         */
        public fun filterPattern(filterPattern: IFilterPattern)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.logs.SubscriptionFilterOptions.Builder =
            software.amazon.awscdk.services.logs.SubscriptionFilterOptions.builder()

        /**
         * @param destination The destination to send the filtered events to. For example, a Kinesis
         *   stream or a Lambda function.
         */
        override fun destination(destination: ILogSubscriptionDestination) {
            cdkBuilder.destination(destination.let(ILogSubscriptionDestination::unwrap))
        }

        /** @param filterName The name of the subscription filter. */
        override fun filterName(filterName: String) {
            cdkBuilder.filterName(filterName)
        }

        /**
         * @param filterPattern Log events matching this pattern will be sent to the destination.
         */
        override fun filterPattern(filterPattern: IFilterPattern) {
            cdkBuilder.filterPattern(filterPattern.let(IFilterPattern::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.logs.SubscriptionFilterOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilterOptions,
    ) : SubscriptionFilterOptions {
        /**
         * The destination to send the filtered events to.
         *
         * For example, a Kinesis stream or a Lambda function.
         */
        override fun destination(): ILogSubscriptionDestination =
            unwrap(this).getDestination().let(ILogSubscriptionDestination::wrap)

        /**
         * The name of the subscription filter.
         *
         * Default: Automatically generated
         */
        override fun filterName(): String? = unwrap(this).getFilterName()

        /** Log events matching this pattern will be sent to the destination. */
        override fun filterPattern(): IFilterPattern =
            unwrap(this).getFilterPattern().let(IFilterPattern::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): SubscriptionFilterOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.logs.SubscriptionFilterOptions
        ): SubscriptionFilterOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: SubscriptionFilterOptions
        ): software.amazon.awscdk.services.logs.SubscriptionFilterOptions =
            (wrapped as Wrapper).cdkObject
    }
}
