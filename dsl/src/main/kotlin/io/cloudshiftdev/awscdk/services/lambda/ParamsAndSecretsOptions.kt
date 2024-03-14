package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface ParamsAndSecretsOptions {
    /**
     * Whether the Parameters and Secrets Extension will cache parameters and secrets.
     *
     * Default: true
     */
    public fun cacheEnabled(): Boolean? = unwrap(this).getCacheEnabled()

    /**
     * The maximum number of secrets and parameters to cache.
     *
     * Must be a value from 0 to 1000. A value of 0 means there is no caching.
     *
     * Note: This variable is ignored if parameterStoreTtl and secretsManagerTtl are 0.
     *
     * Default: 1000
     */
    public fun cacheSize(): Number? = unwrap(this).getCacheSize()

    /**
     * The port for the local HTTP server.
     *
     * Valid port numbers are 1 - 65535.
     *
     * Default: 2773
     */
    public fun httpPort(): Number? = unwrap(this).getHttpPort()

    /**
     * The level of logging provided by the Parameters and Secrets Extension.
     *
     * Note: Set to debug to see the cache configuration.
     *
     * Default: - Logging level will be `info`
     */
    public fun logLevel(): ParamsAndSecretsLogLevel? =
        unwrap(this).getLogLevel()?.let(ParamsAndSecretsLogLevel::wrap)

    /**
     * The maximum number of connection for HTTP clients that the Parameters and Secrets Extension
     * uses to make requests to Parameter Store or Secrets Manager.
     *
     * There is no maximum limit. Minimum is 1.
     *
     * Note: Every running copy of this Lambda function may open the number of connections specified
     * by this property. Thus, the total number of connections may exceed this number.
     *
     * Default: 3
     */
    public fun maxConnections(): Number? = unwrap(this).getMaxConnections()

    /**
     * The timeout for requests to Parameter Store.
     *
     * A value of 0 means that there is no timeout.
     *
     * Default: 0
     */
    public fun parameterStoreTimeout(): Duration? =
        unwrap(this).getParameterStoreTimeout()?.let(Duration::wrap)

    /**
     * The time-to-live of a parameter in the cache.
     *
     * A value of 0 means there is no caching. The maximum time-to-live is 300 seconds.
     *
     * Note: This variable is ignored if cacheSize is 0.
     *
     * Default: 300 seconds
     */
    public fun parameterStoreTtl(): Duration? =
        unwrap(this).getParameterStoreTtl()?.let(Duration::wrap)

    /**
     * The timeout for requests to Secrets Manager.
     *
     * A value of 0 means that there is no timeout.
     *
     * Default: 0
     */
    public fun secretsManagerTimeout(): Duration? =
        unwrap(this).getSecretsManagerTimeout()?.let(Duration::wrap)

    /**
     * The time-to-live of a secret in the cache.
     *
     * A value of 0 means there is no caching. The maximum time-to-live is 300 seconds.
     *
     * Note: This variable is ignored if cacheSize is 0.
     *
     * Default: 300 seconds
     */
    public fun secretsManagerTtl(): Duration? =
        unwrap(this).getSecretsManagerTtl()?.let(Duration::wrap)

    /** A builder for [ParamsAndSecretsOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param cacheEnabled Whether the Parameters and Secrets Extension will cache parameters
         *   and secrets.
         */
        public fun cacheEnabled(cacheEnabled: Boolean)

        /**
         * @param cacheSize The maximum number of secrets and parameters to cache. Must be a value
         *   from 0 to 1000. A value of 0 means there is no caching.
         *
         * Note: This variable is ignored if parameterStoreTtl and secretsManagerTtl are 0.
         */
        public fun cacheSize(cacheSize: Number)

        /** @param httpPort The port for the local HTTP server. Valid port numbers are 1 - 65535. */
        public fun httpPort(httpPort: Number)

        /**
         * @param logLevel The level of logging provided by the Parameters and Secrets Extension.
         *   Note: Set to debug to see the cache configuration.
         */
        public fun logLevel(logLevel: ParamsAndSecretsLogLevel)

        /**
         * @param maxConnections The maximum number of connection for HTTP clients that the
         *   Parameters and Secrets Extension uses to make requests to Parameter Store or Secrets
         *   Manager. There is no maximum limit. Minimum is 1.
         *
         * Note: Every running copy of this Lambda function may open the number of connections
         * specified by this property. Thus, the total number of connections may exceed this number.
         */
        public fun maxConnections(maxConnections: Number)

        /**
         * @param parameterStoreTimeout The timeout for requests to Parameter Store. A value of 0
         *   means that there is no timeout.
         */
        public fun parameterStoreTimeout(parameterStoreTimeout: Duration)

        /**
         * @param parameterStoreTtl The time-to-live of a parameter in the cache. A value of 0 means
         *   there is no caching. The maximum time-to-live is 300 seconds.
         *
         * Note: This variable is ignored if cacheSize is 0.
         */
        public fun parameterStoreTtl(parameterStoreTtl: Duration)

        /**
         * @param secretsManagerTimeout The timeout for requests to Secrets Manager. A value of 0
         *   means that there is no timeout.
         */
        public fun secretsManagerTimeout(secretsManagerTimeout: Duration)

        /**
         * @param secretsManagerTtl The time-to-live of a secret in the cache. A value of 0 means
         *   there is no caching. The maximum time-to-live is 300 seconds.
         *
         * Note: This variable is ignored if cacheSize is 0.
         */
        public fun secretsManagerTtl(secretsManagerTtl: Duration)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions.Builder =
            software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions.builder()

        /**
         * @param cacheEnabled Whether the Parameters and Secrets Extension will cache parameters
         *   and secrets.
         */
        override fun cacheEnabled(cacheEnabled: Boolean) {
            cdkBuilder.cacheEnabled(cacheEnabled)
        }

        /**
         * @param cacheSize The maximum number of secrets and parameters to cache. Must be a value
         *   from 0 to 1000. A value of 0 means there is no caching.
         *
         * Note: This variable is ignored if parameterStoreTtl and secretsManagerTtl are 0.
         */
        override fun cacheSize(cacheSize: Number) {
            cdkBuilder.cacheSize(cacheSize)
        }

        /** @param httpPort The port for the local HTTP server. Valid port numbers are 1 - 65535. */
        override fun httpPort(httpPort: Number) {
            cdkBuilder.httpPort(httpPort)
        }

        /**
         * @param logLevel The level of logging provided by the Parameters and Secrets Extension.
         *   Note: Set to debug to see the cache configuration.
         */
        override fun logLevel(logLevel: ParamsAndSecretsLogLevel) {
            cdkBuilder.logLevel(logLevel.let(ParamsAndSecretsLogLevel::unwrap))
        }

        /**
         * @param maxConnections The maximum number of connection for HTTP clients that the
         *   Parameters and Secrets Extension uses to make requests to Parameter Store or Secrets
         *   Manager. There is no maximum limit. Minimum is 1.
         *
         * Note: Every running copy of this Lambda function may open the number of connections
         * specified by this property. Thus, the total number of connections may exceed this number.
         */
        override fun maxConnections(maxConnections: Number) {
            cdkBuilder.maxConnections(maxConnections)
        }

        /**
         * @param parameterStoreTimeout The timeout for requests to Parameter Store. A value of 0
         *   means that there is no timeout.
         */
        override fun parameterStoreTimeout(parameterStoreTimeout: Duration) {
            cdkBuilder.parameterStoreTimeout(parameterStoreTimeout.let(Duration::unwrap))
        }

        /**
         * @param parameterStoreTtl The time-to-live of a parameter in the cache. A value of 0 means
         *   there is no caching. The maximum time-to-live is 300 seconds.
         *
         * Note: This variable is ignored if cacheSize is 0.
         */
        override fun parameterStoreTtl(parameterStoreTtl: Duration) {
            cdkBuilder.parameterStoreTtl(parameterStoreTtl.let(Duration::unwrap))
        }

        /**
         * @param secretsManagerTimeout The timeout for requests to Secrets Manager. A value of 0
         *   means that there is no timeout.
         */
        override fun secretsManagerTimeout(secretsManagerTimeout: Duration) {
            cdkBuilder.secretsManagerTimeout(secretsManagerTimeout.let(Duration::unwrap))
        }

        /**
         * @param secretsManagerTtl The time-to-live of a secret in the cache. A value of 0 means
         *   there is no caching. The maximum time-to-live is 300 seconds.
         *
         * Note: This variable is ignored if cacheSize is 0.
         */
        override fun secretsManagerTtl(secretsManagerTtl: Duration) {
            cdkBuilder.secretsManagerTtl(secretsManagerTtl.let(Duration::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions,
    ) : ParamsAndSecretsOptions {
        /**
         * Whether the Parameters and Secrets Extension will cache parameters and secrets.
         *
         * Default: true
         */
        override fun cacheEnabled(): Boolean? = unwrap(this).getCacheEnabled()

        /**
         * The maximum number of secrets and parameters to cache.
         *
         * Must be a value from 0 to 1000. A value of 0 means there is no caching.
         *
         * Note: This variable is ignored if parameterStoreTtl and secretsManagerTtl are 0.
         *
         * Default: 1000
         */
        override fun cacheSize(): Number? = unwrap(this).getCacheSize()

        /**
         * The port for the local HTTP server.
         *
         * Valid port numbers are 1 - 65535.
         *
         * Default: 2773
         */
        override fun httpPort(): Number? = unwrap(this).getHttpPort()

        /**
         * The level of logging provided by the Parameters and Secrets Extension.
         *
         * Note: Set to debug to see the cache configuration.
         *
         * Default: - Logging level will be `info`
         */
        override fun logLevel(): ParamsAndSecretsLogLevel? =
            unwrap(this).getLogLevel()?.let(ParamsAndSecretsLogLevel::wrap)

        /**
         * The maximum number of connection for HTTP clients that the Parameters and Secrets
         * Extension uses to make requests to Parameter Store or Secrets Manager.
         *
         * There is no maximum limit. Minimum is 1.
         *
         * Note: Every running copy of this Lambda function may open the number of connections
         * specified by this property. Thus, the total number of connections may exceed this number.
         *
         * Default: 3
         */
        override fun maxConnections(): Number? = unwrap(this).getMaxConnections()

        /**
         * The timeout for requests to Parameter Store.
         *
         * A value of 0 means that there is no timeout.
         *
         * Default: 0
         */
        override fun parameterStoreTimeout(): Duration? =
            unwrap(this).getParameterStoreTimeout()?.let(Duration::wrap)

        /**
         * The time-to-live of a parameter in the cache.
         *
         * A value of 0 means there is no caching. The maximum time-to-live is 300 seconds.
         *
         * Note: This variable is ignored if cacheSize is 0.
         *
         * Default: 300 seconds
         */
        override fun parameterStoreTtl(): Duration? =
            unwrap(this).getParameterStoreTtl()?.let(Duration::wrap)

        /**
         * The timeout for requests to Secrets Manager.
         *
         * A value of 0 means that there is no timeout.
         *
         * Default: 0
         */
        override fun secretsManagerTimeout(): Duration? =
            unwrap(this).getSecretsManagerTimeout()?.let(Duration::wrap)

        /**
         * The time-to-live of a secret in the cache.
         *
         * A value of 0 means there is no caching. The maximum time-to-live is 300 seconds.
         *
         * Note: This variable is ignored if cacheSize is 0.
         *
         * Default: 300 seconds
         */
        override fun secretsManagerTtl(): Duration? =
            unwrap(this).getSecretsManagerTtl()?.let(Duration::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ParamsAndSecretsOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions
        ): ParamsAndSecretsOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ParamsAndSecretsOptions
        ): software.amazon.awscdk.services.lambda.ParamsAndSecretsOptions =
            (wrapped as Wrapper).cdkObject
    }
}
