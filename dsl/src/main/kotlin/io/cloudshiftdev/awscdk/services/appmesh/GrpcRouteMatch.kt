package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface GrpcRouteMatch {
    /**
     * Create metadata based gRPC route match.
     *
     * All specified metadata must match for the route to match.
     *
     * Default: - do not match on metadata
     */
    public fun metadata(): List<HeaderMatch> =
        unwrap(this).getMetadata()?.map(HeaderMatch::wrap) ?: emptyList()

    /**
     * The method name to match from the request.
     *
     * If the method name is specified, service name must be also provided.
     *
     * Default: - do not match on method name
     */
    public fun methodName(): String? = unwrap(this).getMethodName()

    /**
     * The port to match from the request.
     *
     * Default: - do not match on port
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * Create service name based gRPC route match.
     *
     * Default: - do not match on service name
     */
    public fun serviceName(): String? = unwrap(this).getServiceName()

    /** A builder for [GrpcRouteMatch] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param metadata Create metadata based gRPC route match. All specified metadata must match
         *   for the route to match.
         */
        public fun metadata(metadata: List<HeaderMatch>)

        /**
         * @param metadata Create metadata based gRPC route match. All specified metadata must match
         *   for the route to match.
         */
        public fun metadata(vararg metadata: HeaderMatch)

        /**
         * @param methodName The method name to match from the request. If the method name is
         *   specified, service name must be also provided.
         */
        public fun methodName(methodName: String)

        /** @param port The port to match from the request. */
        public fun port(port: Number)

        /** @param serviceName Create service name based gRPC route match. */
        public fun serviceName(serviceName: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcRouteMatch.Builder =
            software.amazon.awscdk.services.appmesh.GrpcRouteMatch.builder()

        /**
         * @param metadata Create metadata based gRPC route match. All specified metadata must match
         *   for the route to match.
         */
        override fun metadata(metadata: List<HeaderMatch>) {
            cdkBuilder.metadata(metadata.map(HeaderMatch::unwrap))
        }

        /**
         * @param metadata Create metadata based gRPC route match. All specified metadata must match
         *   for the route to match.
         */
        override fun metadata(vararg metadata: HeaderMatch): Unit = metadata(metadata.toList())

        /**
         * @param methodName The method name to match from the request. If the method name is
         *   specified, service name must be also provided.
         */
        override fun methodName(methodName: String) {
            cdkBuilder.methodName(methodName)
        }

        /** @param port The port to match from the request. */
        override fun port(port: Number) {
            cdkBuilder.port(port)
        }

        /** @param serviceName Create service name based gRPC route match. */
        override fun serviceName(serviceName: String) {
            cdkBuilder.serviceName(serviceName)
        }

        public fun build(): software.amazon.awscdk.services.appmesh.GrpcRouteMatch =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appmesh.GrpcRouteMatch,
    ) : GrpcRouteMatch {
        /**
         * Create metadata based gRPC route match.
         *
         * All specified metadata must match for the route to match.
         *
         * Default: - do not match on metadata
         */
        override fun metadata(): List<HeaderMatch> =
            unwrap(this).getMetadata()?.map(HeaderMatch::wrap) ?: emptyList()

        /**
         * The method name to match from the request.
         *
         * If the method name is specified, service name must be also provided.
         *
         * Default: - do not match on method name
         */
        override fun methodName(): String? = unwrap(this).getMethodName()

        /**
         * The port to match from the request.
         *
         * Default: - do not match on port
         */
        override fun port(): Number? = unwrap(this).getPort()

        /**
         * Create service name based gRPC route match.
         *
         * Default: - do not match on service name
         */
        override fun serviceName(): String? = unwrap(this).getServiceName()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteMatch {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.GrpcRouteMatch
        ): GrpcRouteMatch = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: GrpcRouteMatch
        ): software.amazon.awscdk.services.appmesh.GrpcRouteMatch = (wrapped as Wrapper).cdkObject
    }
}
