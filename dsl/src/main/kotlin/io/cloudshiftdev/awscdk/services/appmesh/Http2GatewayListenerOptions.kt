package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface Http2GatewayListenerOptions {
    /**
     * Connection pool for http listeners.
     *
     * Default: - None
     */
    public fun connectionPool(): Http2ConnectionPool? =
        unwrap(this).getConnectionPool()?.let(Http2ConnectionPool::wrap)

    /**
     * The health check information for the listener.
     *
     * Default: - no healthcheck
     */
    public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    /**
     * Port to listen for connections on.
     *
     * Default: - 8080
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * Represents the configuration for enabling TLS on a listener.
     *
     * Default: - none
     */
    public fun tls(): ListenerTlsOptions? = unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)

    /** A builder for [Http2GatewayListenerOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param connectionPool Connection pool for http listeners. */
        public fun connectionPool(connectionPool: Http2ConnectionPool)

        /** @param connectionPool Connection pool for http listeners. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("9cac8137abf16333a56f9061788721ce4b7a07d823920b31026bb9ccdef8f6f9")
        public fun connectionPool(connectionPool: Http2ConnectionPool.Builder.() -> Unit)

        /** @param healthCheck The health check information for the listener. */
        public fun healthCheck(healthCheck: HealthCheck)

        /** @param port Port to listen for connections on. */
        public fun port(port: Number)

        /** @param tls Represents the configuration for enabling TLS on a listener. */
        public fun tls(tls: ListenerTlsOptions)

        /** @param tls Represents the configuration for enabling TLS on a listener. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("c102f53c07b47df3e244c6c67bcc26dbf3703c3897a56d4edf16ca1d61cb1e72")
        public fun tls(tls: ListenerTlsOptions.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions.Builder =
            software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions.builder()

        /** @param connectionPool Connection pool for http listeners. */
        override fun connectionPool(connectionPool: Http2ConnectionPool) {
            cdkBuilder.connectionPool(connectionPool.let(Http2ConnectionPool::unwrap))
        }

        /** @param connectionPool Connection pool for http listeners. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("9cac8137abf16333a56f9061788721ce4b7a07d823920b31026bb9ccdef8f6f9")
        override fun connectionPool(connectionPool: Http2ConnectionPool.Builder.() -> Unit): Unit =
            connectionPool(Http2ConnectionPool(connectionPool))

        /** @param healthCheck The health check information for the listener. */
        override fun healthCheck(healthCheck: HealthCheck) {
            cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
        }

        /** @param port Port to listen for connections on. */
        override fun port(port: Number) {
            cdkBuilder.port(port)
        }

        /** @param tls Represents the configuration for enabling TLS on a listener. */
        override fun tls(tls: ListenerTlsOptions) {
            cdkBuilder.tls(tls.let(ListenerTlsOptions::unwrap))
        }

        /** @param tls Represents the configuration for enabling TLS on a listener. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("c102f53c07b47df3e244c6c67bcc26dbf3703c3897a56d4edf16ca1d61cb1e72")
        override fun tls(tls: ListenerTlsOptions.Builder.() -> Unit): Unit =
            tls(ListenerTlsOptions(tls))

        public fun build(): software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions,
    ) : Http2GatewayListenerOptions {
        /**
         * Connection pool for http listeners.
         *
         * Default: - None
         */
        override fun connectionPool(): Http2ConnectionPool? =
            unwrap(this).getConnectionPool()?.let(Http2ConnectionPool::wrap)

        /**
         * The health check information for the listener.
         *
         * Default: - no healthcheck
         */
        override fun healthCheck(): HealthCheck? =
            unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

        /**
         * Port to listen for connections on.
         *
         * Default: - 8080
         */
        override fun port(): Number? = unwrap(this).getPort()

        /**
         * Represents the configuration for enabling TLS on a listener.
         *
         * Default: - none
         */
        override fun tls(): ListenerTlsOptions? =
            unwrap(this).getTls()?.let(ListenerTlsOptions::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): Http2GatewayListenerOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions
        ): Http2GatewayListenerOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: Http2GatewayListenerOptions
        ): software.amazon.awscdk.services.appmesh.Http2GatewayListenerOptions =
            (wrapped as Wrapper).cdkObject
    }
}
