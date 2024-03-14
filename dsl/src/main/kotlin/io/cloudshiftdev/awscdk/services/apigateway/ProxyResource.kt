package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ProxyResource
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apigateway.ProxyResource,
) : Resource(cdkObject) {
    /**
     * Defines a new method for this resource.
     *
     * @param httpMethod
     * @param integration
     * @param options
     */
    public override fun addMethod(httpMethod: String): Method =
        unwrap(this).addMethod(httpMethod).let(Method::wrap)

    /**
     * Defines a new method for this resource.
     *
     * @param httpMethod
     * @param integration
     * @param options
     */
    public override fun addMethod(httpMethod: String, integration: Integration): Method =
        unwrap(this).addMethod(httpMethod, integration.let(Integration::unwrap)).let(Method::wrap)

    /**
     * Defines a new method for this resource.
     *
     * @param httpMethod
     * @param integration
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8787b99e9c374ffaac05faacd3953f7d78c9a3fe47bc6f0e47650d9cfcd0b026")
    public override fun addMethod(
        httpMethod: String,
        integration: Integration.Builder.() -> Unit
    ): Method = addMethod(httpMethod, Integration(integration))

    /**
     * Defines a new method for this resource.
     *
     * @param httpMethod
     * @param integration
     * @param options
     */
    public override fun addMethod(
        httpMethod: String,
        integration: Integration,
        options: MethodOptions,
    ): Method =
        unwrap(this)
            .addMethod(
                httpMethod,
                integration.let(Integration::unwrap),
                options.let(MethodOptions::unwrap)
            )
            .let(Method::wrap)

    /**
     * Defines a new method for this resource.
     *
     * @param httpMethod
     * @param integration
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("678224fda3a86593b90e20fc667cc6cc789d55db060db427dc585e28cd34194f")
    public override fun addMethod(
        httpMethod: String,
        integration: Integration,
        options: MethodOptions.Builder.() -> Unit,
    ): Method = addMethod(httpMethod, integration, MethodOptions(options))

    /**
     * If `props.anyMethod` is `true`, this will be the reference to the 'ANY' method associated
     * with this proxy resource.
     */
    public open fun anyMethod(): Method? = unwrap(this).getAnyMethod()?.let(Method::wrap)

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.ProxyResource]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * Adds an "ANY" method to this resource.
         *
         * If set to `false`, you will have to explicitly add methods to this resource after it's
         * created.
         *
         * Default: true
         *
         * @param anyMethod Adds an "ANY" method to this resource.
         */
        public fun anyMethod(anyMethod: Boolean)

        /**
         * Adds a CORS preflight OPTIONS method to this resource and all child resources.
         *
         * You can add CORS at the resource-level using `addCorsPreflight`.
         *
         * Default: - CORS is disabled
         *
         * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource
         *   and all child resources.
         */
        public fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions)

        /**
         * Adds a CORS preflight OPTIONS method to this resource and all child resources.
         *
         * You can add CORS at the resource-level using `addCorsPreflight`.
         *
         * Default: - CORS is disabled
         *
         * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource
         *   and all child resources.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7e5474dad7daa98359d3d4354ed335e2c0ed0d75940d96e8de2eb5cc00d278aa")
        public fun defaultCorsPreflightOptions(
            defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit
        )

        /**
         * An integration to use as a default for all methods created within this API unless an
         * integration is specified.
         *
         * Default: - Inherited from parent.
         *
         * @param defaultIntegration An integration to use as a default for all methods created
         *   within this API unless an integration is specified.
         */
        public fun defaultIntegration(defaultIntegration: Integration)

        /**
         * An integration to use as a default for all methods created within this API unless an
         * integration is specified.
         *
         * Default: - Inherited from parent.
         *
         * @param defaultIntegration An integration to use as a default for all methods created
         *   within this API unless an integration is specified.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("16c9192ff88b3b2ea5e0ee3864ccda493f2dd9cc6e89e22f27072702904d6749")
        public fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit)

        /**
         * Method options to use as a default for all methods created within this API unless custom
         * options are specified.
         *
         * Default: - Inherited from parent.
         *
         * @param defaultMethodOptions Method options to use as a default for all methods created
         *   within this API unless custom options are specified.
         */
        public fun defaultMethodOptions(defaultMethodOptions: MethodOptions)

        /**
         * Method options to use as a default for all methods created within this API unless custom
         * options are specified.
         *
         * Default: - Inherited from parent.
         *
         * @param defaultMethodOptions Method options to use as a default for all methods created
         *   within this API unless custom options are specified.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("66352d63561f184a2e3095d4cf647c994c40d34726c1b29bc7f3a86abc5045d8")
        public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

        /**
         * The parent resource of this resource.
         *
         * You can either pass another `Resource` object or a `RestApi` object here.
         *
         * @param parent The parent resource of this resource.
         */
        public fun parent(parent: IResource)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.apigateway.ProxyResource.Builder =
            software.amazon.awscdk.services.apigateway.ProxyResource.Builder.create(scope, id)

        /**
         * Adds an "ANY" method to this resource.
         *
         * If set to `false`, you will have to explicitly add methods to this resource after it's
         * created.
         *
         * Default: true
         *
         * @param anyMethod Adds an "ANY" method to this resource.
         */
        override fun anyMethod(anyMethod: Boolean) {
            cdkBuilder.anyMethod(anyMethod)
        }

        /**
         * Adds a CORS preflight OPTIONS method to this resource and all child resources.
         *
         * You can add CORS at the resource-level using `addCorsPreflight`.
         *
         * Default: - CORS is disabled
         *
         * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource
         *   and all child resources.
         */
        override fun defaultCorsPreflightOptions(defaultCorsPreflightOptions: CorsOptions) {
            cdkBuilder.defaultCorsPreflightOptions(
                defaultCorsPreflightOptions.let(CorsOptions::unwrap)
            )
        }

        /**
         * Adds a CORS preflight OPTIONS method to this resource and all child resources.
         *
         * You can add CORS at the resource-level using `addCorsPreflight`.
         *
         * Default: - CORS is disabled
         *
         * @param defaultCorsPreflightOptions Adds a CORS preflight OPTIONS method to this resource
         *   and all child resources.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7e5474dad7daa98359d3d4354ed335e2c0ed0d75940d96e8de2eb5cc00d278aa")
        override fun defaultCorsPreflightOptions(
            defaultCorsPreflightOptions: CorsOptions.Builder.() -> Unit
        ): Unit = defaultCorsPreflightOptions(CorsOptions(defaultCorsPreflightOptions))

        /**
         * An integration to use as a default for all methods created within this API unless an
         * integration is specified.
         *
         * Default: - Inherited from parent.
         *
         * @param defaultIntegration An integration to use as a default for all methods created
         *   within this API unless an integration is specified.
         */
        override fun defaultIntegration(defaultIntegration: Integration) {
            cdkBuilder.defaultIntegration(defaultIntegration.let(Integration::unwrap))
        }

        /**
         * An integration to use as a default for all methods created within this API unless an
         * integration is specified.
         *
         * Default: - Inherited from parent.
         *
         * @param defaultIntegration An integration to use as a default for all methods created
         *   within this API unless an integration is specified.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("16c9192ff88b3b2ea5e0ee3864ccda493f2dd9cc6e89e22f27072702904d6749")
        override fun defaultIntegration(defaultIntegration: Integration.Builder.() -> Unit): Unit =
            defaultIntegration(Integration(defaultIntegration))

        /**
         * Method options to use as a default for all methods created within this API unless custom
         * options are specified.
         *
         * Default: - Inherited from parent.
         *
         * @param defaultMethodOptions Method options to use as a default for all methods created
         *   within this API unless custom options are specified.
         */
        override fun defaultMethodOptions(defaultMethodOptions: MethodOptions) {
            cdkBuilder.defaultMethodOptions(defaultMethodOptions.let(MethodOptions::unwrap))
        }

        /**
         * Method options to use as a default for all methods created within this API unless custom
         * options are specified.
         *
         * Default: - Inherited from parent.
         *
         * @param defaultMethodOptions Method options to use as a default for all methods created
         *   within this API unless custom options are specified.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("66352d63561f184a2e3095d4cf647c994c40d34726c1b29bc7f3a86abc5045d8")
        override fun defaultMethodOptions(
            defaultMethodOptions: MethodOptions.Builder.() -> Unit
        ): Unit = defaultMethodOptions(MethodOptions(defaultMethodOptions))

        /**
         * The parent resource of this resource.
         *
         * You can either pass another `Resource` object or a `RestApi` object here.
         *
         * @param parent The parent resource of this resource.
         */
        override fun parent(parent: IResource) {
            cdkBuilder.parent(parent.let(IResource::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.apigateway.ProxyResource =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): ProxyResource {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return ProxyResource(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.ProxyResource
        ): ProxyResource = ProxyResource(cdkObject)

        internal fun unwrap(
            wrapped: ProxyResource
        ): software.amazon.awscdk.services.apigateway.ProxyResource = wrapped.cdkObject
    }
}
