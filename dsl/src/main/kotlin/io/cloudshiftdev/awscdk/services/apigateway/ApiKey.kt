package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ApiKey
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apigateway.ApiKey,
) : Resource(cdkObject), IApiKey {
    /**
     * Permits the IAM principal all read operations through this key.
     *
     * @param grantee The principal to grant access to.
     */
    public open fun grantRead(grantee: IGrantable): Grant =
        unwrap(this).grantRead(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Permits the IAM principal all read and write operations through this key.
     *
     * @param grantee The principal to grant access to.
     */
    public open fun grantReadWrite(grantee: IGrantable): Grant =
        unwrap(this).grantReadWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /**
     * Permits the IAM principal all write operations through this key.
     *
     * @param grantee The principal to grant access to.
     */
    public open fun grantWrite(grantee: IGrantable): Grant =
        unwrap(this).grantWrite(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

    /** The API key ARN. */
    public override fun keyArn(): String = unwrap(this).getKeyArn()

    /** The API key ID. */
    public override fun keyId(): String = unwrap(this).getKeyId()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.ApiKey]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * A name for the API key.
         *
         * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses
         * that ID for the API key name.
         *
         * Default: automically generated name
         *
         * @param apiKeyName A name for the API key.
         */
        public fun apiKeyName(apiKeyName: String)

        /**
         * An AWS Marketplace customer identifier to use when integrating with the AWS SaaS
         * Marketplace.
         *
         * Default: none
         *
         * @param customerId An AWS Marketplace customer identifier to use when integrating with the
         *   AWS SaaS Marketplace.
         */
        public fun customerId(customerId: String)

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
        @JvmName("6ceb4d64eca0f465918941fc63b8d30e14ea7bbd91b8cbd1d4b2234280d025cd")
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
        @JvmName("c1d5bfcca76c9e57f022bd3364f99bb0ac4ff30a341312056574fce113b61c67")
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
        @JvmName("8e13b14747b217ff1767710747d396aa04262995491c811c71dd6836c7a1e6f3")
        public fun defaultMethodOptions(defaultMethodOptions: MethodOptions.Builder.() -> Unit)

        /**
         * A description of the purpose of the API key.
         *
         * Default: none
         *
         * @param description A description of the purpose of the API key.
         */
        public fun description(description: String)

        /**
         * Indicates whether the API key can be used by clients.
         *
         * Default: true
         *
         * @param enabled Indicates whether the API key can be used by clients.
         */
        public fun enabled(enabled: Boolean)

        /**
         * Specifies whether the key identifier is distinct from the created API key value.
         *
         * Default: false
         *
         * @param generateDistinctId Specifies whether the key identifier is distinct from the
         *   created API key value.
         */
        public fun generateDistinctId(generateDistinctId: Boolean)

        /**
         * (deprecated) A list of resources this api key is associated with.
         *
         * Default: none
         * * use `stages` instead
         *
         * @param resources A list of resources this api key is associated with.
         */
        @Deprecated(message = "deprecated in CDK") public fun resources(resources: List<IRestApi>)

        /**
         * (deprecated) A list of resources this api key is associated with.
         *
         * Default: none
         * * use `stages` instead
         *
         * @param resources A list of resources this api key is associated with.
         */
        @Deprecated(message = "deprecated in CDK") public fun resources(vararg resources: IRestApi)

        /**
         * A list of Stages this api key is associated with.
         *
         * Default: - the api key is not associated with any stages
         *
         * @param stages A list of Stages this api key is associated with.
         */
        public fun stages(stages: List<IStage>)

        /**
         * A list of Stages this api key is associated with.
         *
         * Default: - the api key is not associated with any stages
         *
         * @param stages A list of Stages this api key is associated with.
         */
        public fun stages(vararg stages: IStage)

        /**
         * The value of the API key.
         *
         * Must be at least 20 characters long.
         *
         * Default: none
         *
         * @param value The value of the API key.
         */
        public fun `value`(`value`: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.apigateway.ApiKey.Builder =
            software.amazon.awscdk.services.apigateway.ApiKey.Builder.create(scope, id)

        /**
         * A name for the API key.
         *
         * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses
         * that ID for the API key name.
         *
         * Default: automically generated name
         *
         * @param apiKeyName A name for the API key.
         */
        override fun apiKeyName(apiKeyName: String) {
            cdkBuilder.apiKeyName(apiKeyName)
        }

        /**
         * An AWS Marketplace customer identifier to use when integrating with the AWS SaaS
         * Marketplace.
         *
         * Default: none
         *
         * @param customerId An AWS Marketplace customer identifier to use when integrating with the
         *   AWS SaaS Marketplace.
         */
        override fun customerId(customerId: String) {
            cdkBuilder.customerId(customerId)
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
        @JvmName("6ceb4d64eca0f465918941fc63b8d30e14ea7bbd91b8cbd1d4b2234280d025cd")
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
        @JvmName("c1d5bfcca76c9e57f022bd3364f99bb0ac4ff30a341312056574fce113b61c67")
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
        @JvmName("8e13b14747b217ff1767710747d396aa04262995491c811c71dd6836c7a1e6f3")
        override fun defaultMethodOptions(
            defaultMethodOptions: MethodOptions.Builder.() -> Unit
        ): Unit = defaultMethodOptions(MethodOptions(defaultMethodOptions))

        /**
         * A description of the purpose of the API key.
         *
         * Default: none
         *
         * @param description A description of the purpose of the API key.
         */
        override fun description(description: String) {
            cdkBuilder.description(description)
        }

        /**
         * Indicates whether the API key can be used by clients.
         *
         * Default: true
         *
         * @param enabled Indicates whether the API key can be used by clients.
         */
        override fun enabled(enabled: Boolean) {
            cdkBuilder.enabled(enabled)
        }

        /**
         * Specifies whether the key identifier is distinct from the created API key value.
         *
         * Default: false
         *
         * @param generateDistinctId Specifies whether the key identifier is distinct from the
         *   created API key value.
         */
        override fun generateDistinctId(generateDistinctId: Boolean) {
            cdkBuilder.generateDistinctId(generateDistinctId)
        }

        /**
         * (deprecated) A list of resources this api key is associated with.
         *
         * Default: none
         * * use `stages` instead
         *
         * @param resources A list of resources this api key is associated with.
         */
        @Deprecated(message = "deprecated in CDK")
        override fun resources(resources: List<IRestApi>) {
            cdkBuilder.resources(resources.map(IRestApi::unwrap))
        }

        /**
         * (deprecated) A list of resources this api key is associated with.
         *
         * Default: none
         * * use `stages` instead
         *
         * @param resources A list of resources this api key is associated with.
         */
        @Deprecated(message = "deprecated in CDK")
        override fun resources(vararg resources: IRestApi): Unit = resources(resources.toList())

        /**
         * A list of Stages this api key is associated with.
         *
         * Default: - the api key is not associated with any stages
         *
         * @param stages A list of Stages this api key is associated with.
         */
        override fun stages(stages: List<IStage>) {
            cdkBuilder.stages(stages.map(IStage::unwrap))
        }

        /**
         * A list of Stages this api key is associated with.
         *
         * Default: - the api key is not associated with any stages
         *
         * @param stages A list of Stages this api key is associated with.
         */
        override fun stages(vararg stages: IStage): Unit = stages(stages.toList())

        /**
         * The value of the API key.
         *
         * Must be at least 20 characters long.
         *
         * Default: none
         *
         * @param value The value of the API key.
         */
        override fun `value`(`value`: String) {
            cdkBuilder.`value`(`value`)
        }

        public fun build(): software.amazon.awscdk.services.apigateway.ApiKey = cdkBuilder.build()
    }

    public companion object {
        public fun fromApiKeyId(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            apiKeyId: String,
        ): IApiKey =
            software.amazon.awscdk.services.apigateway.ApiKey.fromApiKeyId(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    apiKeyId
                )
                .let(IApiKey::wrap)

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): ApiKey {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return ApiKey(builderImpl.apply(block).build())
        }

        internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiKey): ApiKey =
            ApiKey(cdkObject)

        internal fun unwrap(wrapped: ApiKey): software.amazon.awscdk.services.apigateway.ApiKey =
            wrapped.cdkObject
    }
}
