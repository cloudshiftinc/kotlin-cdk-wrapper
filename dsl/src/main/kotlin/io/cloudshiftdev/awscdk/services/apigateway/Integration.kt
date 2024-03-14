package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class Integration
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apigateway.Integration,
) {
    /**
     * Can be overridden by subclasses to allow the integration to interact with the method being
     * integrated, access the REST API object, method ARNs, etc.
     *
     * @param _method
     */
    public open fun bind(_method: Method): IntegrationConfig =
        unwrap(this).bind(_method.let(Method::unwrap)).let(IntegrationConfig::wrap)

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.Integration]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The integration's HTTP method type.
         *
         * Required unless you use a MOCK integration.
         *
         * @param integrationHttpMethod The integration's HTTP method type.
         */
        public fun integrationHttpMethod(integrationHttpMethod: String)

        /**
         * Integration options.
         *
         * @param options Integration options.
         */
        public fun options(options: IntegrationOptions)

        /**
         * Integration options.
         *
         * @param options Integration options.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("bc199e2f86a9a6366f5ffe8ba92e0e2672d1e026c257ca1eaa91f561b6f2f16d")
        public fun options(options: IntegrationOptions.Builder.() -> Unit)

        /**
         * Specifies an API method integration type.
         *
         * @param type Specifies an API method integration type.
         */
        public fun type(type: IntegrationType)

        /**
         * The Uniform Resource Identifier (URI) for the integration.
         * * If you specify HTTP for the `type` property, specify the API endpoint URL.
         * * If you specify MOCK for the `type` property, don't specify this property.
         * * If you specify AWS for the `type` property, specify an AWS service that follows this
         *   form:
         *   `arn:partition:apigateway:region:subdomain.service|service:path|action/service_api.`
         *   For example, a Lambda function URI follows this form:
         *   arn:partition:apigateway:region:lambda:path/path. The path is usually in the form
         *   /2015-03-31/functions/LambdaFunctionARN/invocations.
         *
         * [Documentation](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#uri)
         *
         * @param uri The Uniform Resource Identifier (URI) for the integration.
         */
        public fun uri(uri: Any)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.apigateway.Integration.Builder =
            software.amazon.awscdk.services.apigateway.Integration.Builder.create()

        /**
         * The integration's HTTP method type.
         *
         * Required unless you use a MOCK integration.
         *
         * @param integrationHttpMethod The integration's HTTP method type.
         */
        override fun integrationHttpMethod(integrationHttpMethod: String) {
            cdkBuilder.integrationHttpMethod(integrationHttpMethod)
        }

        /**
         * Integration options.
         *
         * @param options Integration options.
         */
        override fun options(options: IntegrationOptions) {
            cdkBuilder.options(options.let(IntegrationOptions::unwrap))
        }

        /**
         * Integration options.
         *
         * @param options Integration options.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("bc199e2f86a9a6366f5ffe8ba92e0e2672d1e026c257ca1eaa91f561b6f2f16d")
        override fun options(options: IntegrationOptions.Builder.() -> Unit): Unit =
            options(IntegrationOptions(options))

        /**
         * Specifies an API method integration type.
         *
         * @param type Specifies an API method integration type.
         */
        override fun type(type: IntegrationType) {
            cdkBuilder.type(type.let(IntegrationType::unwrap))
        }

        /**
         * The Uniform Resource Identifier (URI) for the integration.
         * * If you specify HTTP for the `type` property, specify the API endpoint URL.
         * * If you specify MOCK for the `type` property, don't specify this property.
         * * If you specify AWS for the `type` property, specify an AWS service that follows this
         *   form:
         *   `arn:partition:apigateway:region:subdomain.service|service:path|action/service_api.`
         *   For example, a Lambda function URI follows this form:
         *   arn:partition:apigateway:region:lambda:path/path. The path is usually in the form
         *   /2015-03-31/functions/LambdaFunctionARN/invocations.
         *
         * [Documentation](https://docs.aws.amazon.com/apigateway/api-reference/resource/integration/#uri)
         *
         * @param uri The Uniform Resource Identifier (URI) for the integration.
         */
        override fun uri(uri: Any) {
            cdkBuilder.uri(uri)
        }

        public fun build(): software.amazon.awscdk.services.apigateway.Integration =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): Integration {
            val builderImpl = BuilderImpl()
            return Integration(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.Integration
        ): Integration = Integration(cdkObject)

        internal fun unwrap(
            wrapped: Integration
        ): software.amazon.awscdk.services.apigateway.Integration = wrapped.cdkObject
    }
}
