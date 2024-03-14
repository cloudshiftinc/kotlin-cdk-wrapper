package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import software.constructs.Construct as SoftwareConstructsConstruct

public open class RequestAuthorizer
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.apigateway.RequestAuthorizer,
) : Authorizer(cdkObject), IAuthorizer {
    /**
     * The ARN of the authorizer to be used in permission policies, such as IAM and resource-based
     * grants.
     */
    public open fun authorizerArn(): String = unwrap(this).getAuthorizerArn()

    /** The id of the authorizer. */
    public override fun authorizerId(): String = unwrap(this).getAuthorizerId()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.RequestAuthorizer]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * An optional IAM role for APIGateway to assume before calling the Lambda-based authorizer.
         *
         * The IAM role must be assumable by 'apigateway.amazonaws.com'.
         *
         * Default: - A resource policy is added to the Lambda function allowing
         * apigateway.amazonaws.com to invoke the function.
         *
         * @param assumeRole An optional IAM role for APIGateway to assume before calling the
         *   Lambda-based authorizer.
         */
        public fun assumeRole(assumeRole: IRole)

        /**
         * An optional human friendly name for the authorizer.
         *
         * Note that, this is not the primary identifier of the authorizer.
         *
         * Default: - the unique construct ID
         *
         * @param authorizerName An optional human friendly name for the authorizer.
         */
        public fun authorizerName(authorizerName: String)

        /**
         * The handler for the authorizer lambda function.
         *
         * The handler must follow a very specific protocol on the input it receives and the output
         * it needs to produce. API Gateway has documented the handler's
         * [input specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
         * and
         * [output specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
         *
         * @param handler The handler for the authorizer lambda function.
         */
        public fun handler(handler: IFunction)

        /**
         * An array of request header mapping expressions for identities.
         *
         * Supported parameter types are Header, Query String, Stage Variable, and Context. For
         * instance, extracting an authorization token from a header would use the identity source
         * `IdentitySource.header('Authorization')`.
         *
         * Note: API Gateway uses the specified identity sources as the request authorizer caching
         * key. When caching is enabled, API Gateway calls the authorizer's Lambda function only
         * after successfully verifying that all the specified identity sources are present at
         * runtime. If a specified identify source is missing, null, or empty, API Gateway returns a
         * 401 Unauthorized response without calling the authorizer Lambda function.
         *
         * [Documentation](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateAuthorizer.html#apigw-CreateAuthorizer-request-identitySource)
         *
         * @param identitySources An array of request header mapping expressions for identities.
         */
        public fun identitySources(identitySources: List<String>)

        /**
         * An array of request header mapping expressions for identities.
         *
         * Supported parameter types are Header, Query String, Stage Variable, and Context. For
         * instance, extracting an authorization token from a header would use the identity source
         * `IdentitySource.header('Authorization')`.
         *
         * Note: API Gateway uses the specified identity sources as the request authorizer caching
         * key. When caching is enabled, API Gateway calls the authorizer's Lambda function only
         * after successfully verifying that all the specified identity sources are present at
         * runtime. If a specified identify source is missing, null, or empty, API Gateway returns a
         * 401 Unauthorized response without calling the authorizer Lambda function.
         *
         * [Documentation](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateAuthorizer.html#apigw-CreateAuthorizer-request-identitySource)
         *
         * @param identitySources An array of request header mapping expressions for identities.
         */
        public fun identitySources(vararg identitySources: String)

        /**
         * How long APIGateway should cache the results.
         *
         * Max 1 hour. Disable caching by setting this to 0.
         *
         * Default: - Duration.minutes(5)
         *
         * @param resultsCacheTtl How long APIGateway should cache the results.
         */
        public fun resultsCacheTtl(resultsCacheTtl: Duration)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apigateway.RequestAuthorizer.Builder =
            software.amazon.awscdk.services.apigateway.RequestAuthorizer.Builder.create(scope, id)

        /**
         * An optional IAM role for APIGateway to assume before calling the Lambda-based authorizer.
         *
         * The IAM role must be assumable by 'apigateway.amazonaws.com'.
         *
         * Default: - A resource policy is added to the Lambda function allowing
         * apigateway.amazonaws.com to invoke the function.
         *
         * @param assumeRole An optional IAM role for APIGateway to assume before calling the
         *   Lambda-based authorizer.
         */
        override fun assumeRole(assumeRole: IRole) {
            cdkBuilder.assumeRole(assumeRole.let(IRole::unwrap))
        }

        /**
         * An optional human friendly name for the authorizer.
         *
         * Note that, this is not the primary identifier of the authorizer.
         *
         * Default: - the unique construct ID
         *
         * @param authorizerName An optional human friendly name for the authorizer.
         */
        override fun authorizerName(authorizerName: String) {
            cdkBuilder.authorizerName(authorizerName)
        }

        /**
         * The handler for the authorizer lambda function.
         *
         * The handler must follow a very specific protocol on the input it receives and the output
         * it needs to produce. API Gateway has documented the handler's
         * [input specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
         * and
         * [output specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
         *
         * @param handler The handler for the authorizer lambda function.
         */
        override fun handler(handler: IFunction) {
            cdkBuilder.handler(handler.let(IFunction::unwrap))
        }

        /**
         * An array of request header mapping expressions for identities.
         *
         * Supported parameter types are Header, Query String, Stage Variable, and Context. For
         * instance, extracting an authorization token from a header would use the identity source
         * `IdentitySource.header('Authorization')`.
         *
         * Note: API Gateway uses the specified identity sources as the request authorizer caching
         * key. When caching is enabled, API Gateway calls the authorizer's Lambda function only
         * after successfully verifying that all the specified identity sources are present at
         * runtime. If a specified identify source is missing, null, or empty, API Gateway returns a
         * 401 Unauthorized response without calling the authorizer Lambda function.
         *
         * [Documentation](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateAuthorizer.html#apigw-CreateAuthorizer-request-identitySource)
         *
         * @param identitySources An array of request header mapping expressions for identities.
         */
        override fun identitySources(identitySources: List<String>) {
            cdkBuilder.identitySources(identitySources)
        }

        /**
         * An array of request header mapping expressions for identities.
         *
         * Supported parameter types are Header, Query String, Stage Variable, and Context. For
         * instance, extracting an authorization token from a header would use the identity source
         * `IdentitySource.header('Authorization')`.
         *
         * Note: API Gateway uses the specified identity sources as the request authorizer caching
         * key. When caching is enabled, API Gateway calls the authorizer's Lambda function only
         * after successfully verifying that all the specified identity sources are present at
         * runtime. If a specified identify source is missing, null, or empty, API Gateway returns a
         * 401 Unauthorized response without calling the authorizer Lambda function.
         *
         * [Documentation](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateAuthorizer.html#apigw-CreateAuthorizer-request-identitySource)
         *
         * @param identitySources An array of request header mapping expressions for identities.
         */
        override fun identitySources(vararg identitySources: String): Unit =
            identitySources(identitySources.toList())

        /**
         * How long APIGateway should cache the results.
         *
         * Max 1 hour. Disable caching by setting this to 0.
         *
         * Default: - Duration.minutes(5)
         *
         * @param resultsCacheTtl How long APIGateway should cache the results.
         */
        override fun resultsCacheTtl(resultsCacheTtl: Duration) {
            cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.apigateway.RequestAuthorizer =
            cdkBuilder.build()
    }

    public companion object {
        init {}

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): RequestAuthorizer {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return RequestAuthorizer(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigateway.RequestAuthorizer
        ): RequestAuthorizer = RequestAuthorizer(cdkObject)

        internal fun unwrap(
            wrapped: RequestAuthorizer
        ): software.amazon.awscdk.services.apigateway.RequestAuthorizer = wrapped.cdkObject
    }
}
