package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface JsonWithStandardFieldProps {
    /**
     * If this flag is enabled, the principal identifier of the caller will be output to the log.
     */
    public fun caller(): Boolean

    /** If this flag is enabled, the http method will be output to the log. */
    public fun httpMethod(): Boolean

    /** If this flag is enabled, the source IP of request will be output to the log. */
    public fun ip(): Boolean

    /** If this flag is enabled, the request protocol will be output to the log. */
    public fun protocol(): Boolean

    /**
     * If this flag is enabled, the CLF-formatted request time((dd/MMM/yyyy:HH:mm:ss +-hhmm) will be
     * output to the log.
     */
    public fun requestTime(): Boolean

    /** If this flag is enabled, the path to your resource will be output to the log. */
    public fun resourcePath(): Boolean

    /** If this flag is enabled, the response payload length will be output to the log. */
    public fun responseLength(): Boolean

    /** If this flag is enabled, the method response status will be output to the log. */
    public fun status(): Boolean

    /** If this flag is enabled, the principal identifier of the user will be output to the log. */
    public fun user(): Boolean

    /** A builder for [JsonWithStandardFieldProps] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param caller If this flag is enabled, the principal identifier of the caller will be
         *   output to the log.
         */
        public fun caller(caller: Boolean)

        /** @param httpMethod If this flag is enabled, the http method will be output to the log. */
        public fun httpMethod(httpMethod: Boolean)

        /**
         * @param ip If this flag is enabled, the source IP of request will be output to the log.
         */
        public fun ip(ip: Boolean)

        /**
         * @param protocol If this flag is enabled, the request protocol will be output to the log.
         */
        public fun protocol(protocol: Boolean)

        /**
         * @param requestTime If this flag is enabled, the CLF-formatted request
         *   time((dd/MMM/yyyy:HH:mm:ss +-hhmm) will be output to the log.
         */
        public fun requestTime(requestTime: Boolean)

        /**
         * @param resourcePath If this flag is enabled, the path to your resource will be output to
         *   the log.
         */
        public fun resourcePath(resourcePath: Boolean)

        /**
         * @param responseLength If this flag is enabled, the response payload length will be output
         *   to the log.
         */
        public fun responseLength(responseLength: Boolean)

        /**
         * @param status If this flag is enabled, the method response status will be output to the
         *   log.
         */
        public fun status(status: Boolean)

        /**
         * @param user If this flag is enabled, the principal identifier of the user will be output
         *   to the log.
         */
        public fun user(user: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps.Builder =
            software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps.builder()

        /**
         * @param caller If this flag is enabled, the principal identifier of the caller will be
         *   output to the log.
         */
        override fun caller(caller: Boolean) {
            cdkBuilder.caller(caller)
        }

        /** @param httpMethod If this flag is enabled, the http method will be output to the log. */
        override fun httpMethod(httpMethod: Boolean) {
            cdkBuilder.httpMethod(httpMethod)
        }

        /**
         * @param ip If this flag is enabled, the source IP of request will be output to the log.
         */
        override fun ip(ip: Boolean) {
            cdkBuilder.ip(ip)
        }

        /**
         * @param protocol If this flag is enabled, the request protocol will be output to the log.
         */
        override fun protocol(protocol: Boolean) {
            cdkBuilder.protocol(protocol)
        }

        /**
         * @param requestTime If this flag is enabled, the CLF-formatted request
         *   time((dd/MMM/yyyy:HH:mm:ss +-hhmm) will be output to the log.
         */
        override fun requestTime(requestTime: Boolean) {
            cdkBuilder.requestTime(requestTime)
        }

        /**
         * @param resourcePath If this flag is enabled, the path to your resource will be output to
         *   the log.
         */
        override fun resourcePath(resourcePath: Boolean) {
            cdkBuilder.resourcePath(resourcePath)
        }

        /**
         * @param responseLength If this flag is enabled, the response payload length will be output
         *   to the log.
         */
        override fun responseLength(responseLength: Boolean) {
            cdkBuilder.responseLength(responseLength)
        }

        /**
         * @param status If this flag is enabled, the method response status will be output to the
         *   log.
         */
        override fun status(status: Boolean) {
            cdkBuilder.status(status)
        }

        /**
         * @param user If this flag is enabled, the principal identifier of the user will be output
         *   to the log.
         */
        override fun user(user: Boolean) {
            cdkBuilder.user(user)
        }

        public fun build(): software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps,
    ) : JsonWithStandardFieldProps {
        /**
         * If this flag is enabled, the principal identifier of the caller will be output to the
         * log.
         */
        override fun caller(): Boolean = unwrap(this).getCaller()

        /** If this flag is enabled, the http method will be output to the log. */
        override fun httpMethod(): Boolean = unwrap(this).getHttpMethod()

        /** If this flag is enabled, the source IP of request will be output to the log. */
        override fun ip(): Boolean = unwrap(this).getIp()

        /** If this flag is enabled, the request protocol will be output to the log. */
        override fun protocol(): Boolean = unwrap(this).getProtocol()

        /**
         * If this flag is enabled, the CLF-formatted request time((dd/MMM/yyyy:HH:mm:ss +-hhmm)
         * will be output to the log.
         */
        override fun requestTime(): Boolean = unwrap(this).getRequestTime()

        /** If this flag is enabled, the path to your resource will be output to the log. */
        override fun resourcePath(): Boolean = unwrap(this).getResourcePath()

        /** If this flag is enabled, the response payload length will be output to the log. */
        override fun responseLength(): Boolean = unwrap(this).getResponseLength()

        /** If this flag is enabled, the method response status will be output to the log. */
        override fun status(): Boolean = unwrap(this).getStatus()

        /**
         * If this flag is enabled, the principal identifier of the user will be output to the log.
         */
        override fun user(): Boolean = unwrap(this).getUser()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): JsonWithStandardFieldProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps
        ): JsonWithStandardFieldProps = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: JsonWithStandardFieldProps
        ): software.amazon.awscdk.services.apigateway.JsonWithStandardFieldProps =
            (wrapped as Wrapper).cdkObject
    }
}
