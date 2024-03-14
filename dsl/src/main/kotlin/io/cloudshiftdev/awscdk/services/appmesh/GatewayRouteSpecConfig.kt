package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface GatewayRouteSpecConfig {
    /**
     * The spec for a grpc gateway route.
     *
     * Default: - no grpc spec
     */
    public fun grpcSpecConfig(): CfnGatewayRoute.GrpcGatewayRouteProperty? =
        unwrap(this).getGrpcSpecConfig()?.let(CfnGatewayRoute.GrpcGatewayRouteProperty::wrap)

    /**
     * The spec for an http2 gateway route.
     *
     * Default: - no http2 spec
     */
    public fun http2SpecConfig(): CfnGatewayRoute.HttpGatewayRouteProperty? =
        unwrap(this).getHttp2SpecConfig()?.let(CfnGatewayRoute.HttpGatewayRouteProperty::wrap)

    /**
     * The spec for an http gateway route.
     *
     * Default: - no http spec
     */
    public fun httpSpecConfig(): CfnGatewayRoute.HttpGatewayRouteProperty? =
        unwrap(this).getHttpSpecConfig()?.let(CfnGatewayRoute.HttpGatewayRouteProperty::wrap)

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

    /** A builder for [GatewayRouteSpecConfig] */
    @CdkDslMarker
    public interface Builder {
        /** @param grpcSpecConfig The spec for a grpc gateway route. */
        public fun grpcSpecConfig(grpcSpecConfig: CfnGatewayRoute.GrpcGatewayRouteProperty)

        /** @param grpcSpecConfig The spec for a grpc gateway route. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("a48e768578c81af5adabfab72a86facf38a3e71857773f94214b95f54d6e9a78")
        public fun grpcSpecConfig(
            grpcSpecConfig: CfnGatewayRoute.GrpcGatewayRouteProperty.Builder.() -> Unit
        )

        /** @param http2SpecConfig The spec for an http2 gateway route. */
        public fun http2SpecConfig(http2SpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty)

        /** @param http2SpecConfig The spec for an http2 gateway route. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("00eac5ae02075cfdca2760cfb0ef55ef0da125778059d13571c31ac32ec68b0c")
        public fun http2SpecConfig(
            http2SpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty.Builder.() -> Unit
        )

        /** @param httpSpecConfig The spec for an http gateway route. */
        public fun httpSpecConfig(httpSpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty)

        /** @param httpSpecConfig The spec for an http gateway route. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("00897ac40e45cf896dcb1fd16d121a288e413fe3e1bc4e38e8d580fdbebc6225")
        public fun httpSpecConfig(
            httpSpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty.Builder.() -> Unit
        )

        /**
         * @param priority The priority for the gateway route. When a Virtual Gateway has multiple
         *   gateway routes, gateway route match is performed in the order of specified value, where
         *   0 is the highest priority, and first matched gateway route is selected.
         */
        public fun priority(priority: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig.Builder =
            software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig.builder()

        /** @param grpcSpecConfig The spec for a grpc gateway route. */
        override fun grpcSpecConfig(grpcSpecConfig: CfnGatewayRoute.GrpcGatewayRouteProperty) {
            cdkBuilder.grpcSpecConfig(
                grpcSpecConfig.let(CfnGatewayRoute.GrpcGatewayRouteProperty::unwrap)
            )
        }

        /** @param grpcSpecConfig The spec for a grpc gateway route. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("a48e768578c81af5adabfab72a86facf38a3e71857773f94214b95f54d6e9a78")
        override fun grpcSpecConfig(
            grpcSpecConfig: CfnGatewayRoute.GrpcGatewayRouteProperty.Builder.() -> Unit
        ): Unit = grpcSpecConfig(CfnGatewayRoute.GrpcGatewayRouteProperty(grpcSpecConfig))

        /** @param http2SpecConfig The spec for an http2 gateway route. */
        override fun http2SpecConfig(http2SpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty) {
            cdkBuilder.http2SpecConfig(
                http2SpecConfig.let(CfnGatewayRoute.HttpGatewayRouteProperty::unwrap)
            )
        }

        /** @param http2SpecConfig The spec for an http2 gateway route. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("00eac5ae02075cfdca2760cfb0ef55ef0da125778059d13571c31ac32ec68b0c")
        override fun http2SpecConfig(
            http2SpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty.Builder.() -> Unit
        ): Unit = http2SpecConfig(CfnGatewayRoute.HttpGatewayRouteProperty(http2SpecConfig))

        /** @param httpSpecConfig The spec for an http gateway route. */
        override fun httpSpecConfig(httpSpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty) {
            cdkBuilder.httpSpecConfig(
                httpSpecConfig.let(CfnGatewayRoute.HttpGatewayRouteProperty::unwrap)
            )
        }

        /** @param httpSpecConfig The spec for an http gateway route. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("00897ac40e45cf896dcb1fd16d121a288e413fe3e1bc4e38e8d580fdbebc6225")
        override fun httpSpecConfig(
            httpSpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty.Builder.() -> Unit
        ): Unit = httpSpecConfig(CfnGatewayRoute.HttpGatewayRouteProperty(httpSpecConfig))

        /**
         * @param priority The priority for the gateway route. When a Virtual Gateway has multiple
         *   gateway routes, gateway route match is performed in the order of specified value, where
         *   0 is the highest priority, and first matched gateway route is selected.
         */
        override fun priority(priority: Number) {
            cdkBuilder.priority(priority)
        }

        public fun build(): software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig,
    ) : GatewayRouteSpecConfig {
        /**
         * The spec for a grpc gateway route.
         *
         * Default: - no grpc spec
         */
        override fun grpcSpecConfig(): CfnGatewayRoute.GrpcGatewayRouteProperty? =
            unwrap(this).getGrpcSpecConfig()?.let(CfnGatewayRoute.GrpcGatewayRouteProperty::wrap)

        /**
         * The spec for an http2 gateway route.
         *
         * Default: - no http2 spec
         */
        override fun http2SpecConfig(): CfnGatewayRoute.HttpGatewayRouteProperty? =
            unwrap(this).getHttp2SpecConfig()?.let(CfnGatewayRoute.HttpGatewayRouteProperty::wrap)

        /**
         * The spec for an http gateway route.
         *
         * Default: - no http spec
         */
        override fun httpSpecConfig(): CfnGatewayRoute.HttpGatewayRouteProperty? =
            unwrap(this).getHttpSpecConfig()?.let(CfnGatewayRoute.HttpGatewayRouteProperty::wrap)

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

        public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteSpecConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig
        ): GatewayRouteSpecConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: GatewayRouteSpecConfig
        ): software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig =
            (wrapped as Wrapper).cdkObject
    }
}
