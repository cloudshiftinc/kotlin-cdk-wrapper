package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface RedirectOptions {
    /**
     * The hostname.
     *
     * This component is not percent-encoded. The hostname can contain #{host}.
     *
     * Default: - No change
     */
    public fun host(): String? = unwrap(this).getHost()

    /**
     * The absolute path, starting with the leading "/".
     *
     * This component is not percent-encoded. The path can contain #{host}, #{path}, and #{port}.
     *
     * Default: - No change
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * The HTTP redirect code.
     *
     * The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
     *
     * Default: false
     */
    public fun permanent(): Boolean? = unwrap(this).getPermanent()

    /**
     * The port.
     *
     * You can specify a value from 1 to 65535 or #{port}.
     *
     * Default: - No change
     */
    public fun port(): String? = unwrap(this).getPort()

    /**
     * The protocol.
     *
     * You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to HTTPS,
     * and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
     *
     * Default: - No change
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * The query parameters, URL-encoded when necessary, but not percent-encoded.
     *
     * Do not include the leading "?", as it is automatically added. You can specify any of the
     * reserved keywords.
     *
     * Default: - No change
     */
    public fun query(): String? = unwrap(this).getQuery()

    /** A builder for [RedirectOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param host The hostname. This component is not percent-encoded. The hostname can
         *   contain #{host}.
         */
        public fun host(host: String)

        /**
         * @param path The absolute path, starting with the leading "/". This component is not
         *   percent-encoded. The path can contain #{host}, #{path}, and #{port}.
         */
        public fun path(path: String)

        /**
         * @param permanent The HTTP redirect code. The redirect is either permanent (HTTP 301) or
         *   temporary (HTTP 302).
         */
        public fun permanent(permanent: Boolean)

        /** @param port The port. You can specify a value from 1 to 65535 or #{port}. */
        public fun port(port: String)

        /**
         * @param protocol The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can
         *   redirect HTTP to HTTP, HTTP to HTTPS, and HTTPS to HTTPS. You cannot redirect HTTPS to
         *   HTTP.
         */
        public fun protocol(protocol: String)

        /**
         * @param query The query parameters, URL-encoded when necessary, but not percent-encoded.
         *   Do not include the leading "?", as it is automatically added. You can specify any of
         *   the reserved keywords.
         */
        public fun query(query: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions.Builder =
            software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions.builder()

        /**
         * @param host The hostname. This component is not percent-encoded. The hostname can
         *   contain #{host}.
         */
        override fun host(host: String) {
            cdkBuilder.host(host)
        }

        /**
         * @param path The absolute path, starting with the leading "/". This component is not
         *   percent-encoded. The path can contain #{host}, #{path}, and #{port}.
         */
        override fun path(path: String) {
            cdkBuilder.path(path)
        }

        /**
         * @param permanent The HTTP redirect code. The redirect is either permanent (HTTP 301) or
         *   temporary (HTTP 302).
         */
        override fun permanent(permanent: Boolean) {
            cdkBuilder.permanent(permanent)
        }

        /** @param port The port. You can specify a value from 1 to 65535 or #{port}. */
        override fun port(port: String) {
            cdkBuilder.port(port)
        }

        /**
         * @param protocol The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can
         *   redirect HTTP to HTTP, HTTP to HTTPS, and HTTPS to HTTPS. You cannot redirect HTTPS to
         *   HTTP.
         */
        override fun protocol(protocol: String) {
            cdkBuilder.protocol(protocol)
        }

        /**
         * @param query The query parameters, URL-encoded when necessary, but not percent-encoded.
         *   Do not include the leading "?", as it is automatically added. You can specify any of
         *   the reserved keywords.
         */
        override fun query(query: String) {
            cdkBuilder.query(query)
        }

        public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions,
    ) : RedirectOptions {
        /**
         * The hostname.
         *
         * This component is not percent-encoded. The hostname can contain #{host}.
         *
         * Default: - No change
         */
        override fun host(): String? = unwrap(this).getHost()

        /**
         * The absolute path, starting with the leading "/".
         *
         * This component is not percent-encoded. The path can contain #{host}, #{path},
         * and #{port}.
         *
         * Default: - No change
         */
        override fun path(): String? = unwrap(this).getPath()

        /**
         * The HTTP redirect code.
         *
         * The redirect is either permanent (HTTP 301) or temporary (HTTP 302).
         *
         * Default: false
         */
        override fun permanent(): Boolean? = unwrap(this).getPermanent()

        /**
         * The port.
         *
         * You can specify a value from 1 to 65535 or #{port}.
         *
         * Default: - No change
         */
        override fun port(): String? = unwrap(this).getPort()

        /**
         * The protocol.
         *
         * You can specify HTTP, HTTPS, or #{protocol}. You can redirect HTTP to HTTP, HTTP to
         * HTTPS, and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
         *
         * Default: - No change
         */
        override fun protocol(): String? = unwrap(this).getProtocol()

        /**
         * The query parameters, URL-encoded when necessary, but not percent-encoded.
         *
         * Do not include the leading "?", as it is automatically added. You can specify any of the
         * reserved keywords.
         *
         * Default: - No change
         */
        override fun query(): String? = unwrap(this).getQuery()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): RedirectOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions
        ): RedirectOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: RedirectOptions
        ): software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions =
            (wrapped as Wrapper).cdkObject
    }
}
