@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.RequestAuthorizerProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction

/**
 * Properties for RequestAuthorizer.
 *
 * Example:
 * ```
 * Function authFn;
 * Resource books;
 * RequestAuthorizer auth = RequestAuthorizer.Builder.create(this, "booksAuthorizer")
 * .handler(authFn)
 * .identitySources(List.of(IdentitySource.header("Authorization")))
 * .build();
 * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
 * .authorizer(auth)
 * .build());
 * ```
 */
@CdkDslMarker
public class RequestAuthorizerPropsDsl {
    private val cdkBuilder: RequestAuthorizerProps.Builder = RequestAuthorizerProps.builder()

    private val _identitySources: MutableList<String> = mutableListOf()

    /**
     * @param assumeRole An optional IAM role for APIGateway to assume before calling the
     *   Lambda-based authorizer. The IAM role must be assumable by 'apigateway.amazonaws.com'.
     */
    public fun assumeRole(assumeRole: IRole) {
        cdkBuilder.assumeRole(assumeRole)
    }

    /**
     * @param authorizerName An optional human friendly name for the authorizer. Note that, this is
     *   not the primary identifier of the authorizer.
     */
    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * @param handler The handler for the authorizer lambda function. The handler must follow a very
     *   specific protocol on the input it receives and the output it needs to produce. API Gateway
     *   has documented the handler's
     *   [input specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
     *   and
     *   [output specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
     */
    public fun handler(handler: IFunction) {
        cdkBuilder.handler(handler)
    }

    /**
     * @param identitySources An array of request header mapping expressions for identities.
     *   Supported parameter types are Header, Query String, Stage Variable, and Context. For
     *   instance, extracting an authorization token from a header would use the identity source
     *   `IdentitySource.header('Authorization')`.
     *
     * Note: API Gateway uses the specified identity sources as the request authorizer caching key.
     * When caching is enabled, API Gateway calls the authorizer's Lambda function only after
     * successfully verifying that all the specified identity sources are present at runtime. If a
     * specified identify source is missing, null, or empty, API Gateway returns a 401 Unauthorized
     * response without calling the authorizer Lambda function.
     */
    public fun identitySources(vararg identitySources: String) {
        _identitySources.addAll(listOf(*identitySources))
    }

    /**
     * @param identitySources An array of request header mapping expressions for identities.
     *   Supported parameter types are Header, Query String, Stage Variable, and Context. For
     *   instance, extracting an authorization token from a header would use the identity source
     *   `IdentitySource.header('Authorization')`.
     *
     * Note: API Gateway uses the specified identity sources as the request authorizer caching key.
     * When caching is enabled, API Gateway calls the authorizer's Lambda function only after
     * successfully verifying that all the specified identity sources are present at runtime. If a
     * specified identify source is missing, null, or empty, API Gateway returns a 401 Unauthorized
     * response without calling the authorizer Lambda function.
     */
    public fun identitySources(identitySources: Collection<String>) {
        _identitySources.addAll(identitySources)
    }

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results. Max 1 hour. Disable
     *   caching by setting this to 0.
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration) {
        cdkBuilder.resultsCacheTtl(resultsCacheTtl)
    }

    public fun build(): RequestAuthorizerProps {
        if (_identitySources.isNotEmpty()) cdkBuilder.identitySources(_identitySources)
        return cdkBuilder.build()
    }
}
