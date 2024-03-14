package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface ThrottleSettings {
    /**
     * The maximum API request rate limit over a time ranging from one to a few seconds.
     *
     * Default: none
     */
    public fun burstLimit(): Number? = unwrap(this).getBurstLimit()

    /**
     * The API request steady-state rate limit (average requests per second over an extended period
     * of time).
     *
     * Default: none
     */
    public fun rateLimit(): Number? = unwrap(this).getRateLimit()

    /** A builder for [ThrottleSettings] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param burstLimit The maximum API request rate limit over a time ranging from one to a
         *   few seconds.
         */
        public fun burstLimit(burstLimit: Number)

        /**
         * @param rateLimit The API request steady-state rate limit (average requests per second
         *   over an extended period of time).
         */
        public fun rateLimit(rateLimit: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apigatewayv2.ThrottleSettings.Builder =
            software.amazon.awscdk.services.apigatewayv2.ThrottleSettings.builder()

        /**
         * @param burstLimit The maximum API request rate limit over a time ranging from one to a
         *   few seconds.
         */
        override fun burstLimit(burstLimit: Number) {
            cdkBuilder.burstLimit(burstLimit)
        }

        /**
         * @param rateLimit The API request steady-state rate limit (average requests per second
         *   over an extended period of time).
         */
        override fun rateLimit(rateLimit: Number) {
            cdkBuilder.rateLimit(rateLimit)
        }

        public fun build(): software.amazon.awscdk.services.apigatewayv2.ThrottleSettings =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.ThrottleSettings,
    ) : ThrottleSettings {
        /**
         * The maximum API request rate limit over a time ranging from one to a few seconds.
         *
         * Default: none
         */
        override fun burstLimit(): Number? = unwrap(this).getBurstLimit()

        /**
         * The API request steady-state rate limit (average requests per second over an extended
         * period of time).
         *
         * Default: none
         */
        override fun rateLimit(): Number? = unwrap(this).getRateLimit()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ThrottleSettings {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.ThrottleSettings
        ): ThrottleSettings = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ThrottleSettings
        ): software.amazon.awscdk.services.apigatewayv2.ThrottleSettings =
            (wrapped as Wrapper).cdkObject
    }
}
