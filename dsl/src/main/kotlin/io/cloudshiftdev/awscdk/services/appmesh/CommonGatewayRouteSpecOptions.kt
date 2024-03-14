package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface CommonGatewayRouteSpecOptions {
    /**
     * The priority for the gateway route.
     *
     * When a Virtual Gateway has multiple gateway routes, gateway route match is performed in the
     * order of specified value, where 0 is the highest priority, and first matched gateway route is
     * selected.
     *
     * Default: - no particular priority
     */
    public fun priority(): Number? = unwrap(this).getPriority()

    /** A builder for [CommonGatewayRouteSpecOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param priority The priority for the gateway route. When a Virtual Gateway has multiple
         *   gateway routes, gateway route match is performed in the order of specified value, where
         *   0 is the highest priority, and first matched gateway route is selected.
         */
        public fun priority(priority: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions.Builder =
            software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions.builder()

        /**
         * @param priority The priority for the gateway route. When a Virtual Gateway has multiple
         *   gateway routes, gateway route match is performed in the order of specified value, where
         *   0 is the highest priority, and first matched gateway route is selected.
         */
        override fun priority(priority: Number) {
            cdkBuilder.priority(priority)
        }

        public fun build(): software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions,
    ) : CommonGatewayRouteSpecOptions {
        /**
         * The priority for the gateway route.
         *
         * When a Virtual Gateway has multiple gateway routes, gateway route match is performed in
         * the order of specified value, where 0 is the highest priority, and first matched gateway
         * route is selected.
         *
         * Default: - no particular priority
         */
        override fun priority(): Number? = unwrap(this).getPriority()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): CommonGatewayRouteSpecOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions
        ): CommonGatewayRouteSpecOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: CommonGatewayRouteSpecOptions
        ): software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions =
            (wrapped as Wrapper).cdkObject
    }
}
