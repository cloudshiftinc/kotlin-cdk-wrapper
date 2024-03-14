package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

public interface OriginFailoverConfig {
    /** The origin to use as the fallback origin. */
    public fun failoverOrigin(): IOrigin

    /**
     * The HTTP status codes of the response that trigger querying the failover Origin.
     *
     * Default: - 500, 502, 503 and 504
     */
    public fun statusCodes(): List<Number> = unwrap(this).getStatusCodes() ?: emptyList()

    /** A builder for [OriginFailoverConfig] */
    @CdkDslMarker
    public interface Builder {
        /** @param failoverOrigin The origin to use as the fallback origin. */
        public fun failoverOrigin(failoverOrigin: IOrigin)

        /**
         * @param statusCodes The HTTP status codes of the response that trigger querying the
         *   failover Origin.
         */
        public fun statusCodes(statusCodes: List<Number>)

        /**
         * @param statusCodes The HTTP status codes of the response that trigger querying the
         *   failover Origin.
         */
        public fun statusCodes(vararg statusCodes: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cloudfront.OriginFailoverConfig.Builder =
            software.amazon.awscdk.services.cloudfront.OriginFailoverConfig.builder()

        /** @param failoverOrigin The origin to use as the fallback origin. */
        override fun failoverOrigin(failoverOrigin: IOrigin) {
            cdkBuilder.failoverOrigin(failoverOrigin.let(IOrigin::unwrap))
        }

        /**
         * @param statusCodes The HTTP status codes of the response that trigger querying the
         *   failover Origin.
         */
        override fun statusCodes(statusCodes: List<Number>) {
            cdkBuilder.statusCodes(statusCodes)
        }

        /**
         * @param statusCodes The HTTP status codes of the response that trigger querying the
         *   failover Origin.
         */
        override fun statusCodes(vararg statusCodes: Number): Unit =
            statusCodes(statusCodes.toList())

        public fun build(): software.amazon.awscdk.services.cloudfront.OriginFailoverConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.cloudfront.OriginFailoverConfig,
    ) : OriginFailoverConfig {
        /** The origin to use as the fallback origin. */
        override fun failoverOrigin(): IOrigin = unwrap(this).getFailoverOrigin().let(IOrigin::wrap)

        /**
         * The HTTP status codes of the response that trigger querying the failover Origin.
         *
         * Default: - 500, 502, 503 and 504
         */
        override fun statusCodes(): List<Number> = unwrap(this).getStatusCodes() ?: emptyList()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): OriginFailoverConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudfront.OriginFailoverConfig
        ): OriginFailoverConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: OriginFailoverConfig
        ): software.amazon.awscdk.services.cloudfront.OriginFailoverConfig =
            (wrapped as Wrapper).cdkObject
    }
}
