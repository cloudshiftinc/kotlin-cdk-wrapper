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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.TokenAuthorizerProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction

/**
 * Properties for TokenAuthorizer.
 *
 * Example:
 * ```
 * Function authFn;
 * Resource books;
 * TokenAuthorizer auth = TokenAuthorizer.Builder.create(this, "booksAuthorizer")
 * .handler(authFn)
 * .build();
 * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
 * .authorizer(auth)
 * .build());
 * ```
 */
@CdkDslMarker
public class TokenAuthorizerPropsDsl {
    private val cdkBuilder: TokenAuthorizerProps.Builder = TokenAuthorizerProps.builder()

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
     * @param identitySource The request header mapping expression for the bearer token. This is
     *   typically passed as part of the header, in which case this should be
     *   `method.request.header.Authorizer` where `Authorizer` is the header containing the bearer
     *   token.
     */
    public fun identitySource(identitySource: String) {
        cdkBuilder.identitySource(identitySource)
    }

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results. Max 1 hour. Disable
     *   caching by setting this to 0.
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration) {
        cdkBuilder.resultsCacheTtl(resultsCacheTtl)
    }

    /**
     * @param validationRegex An optional regex to be matched against the authorization token. When
     *   matched the authorizer lambda is invoked, otherwise a 401 Unauthorized is returned to the
     *   client.
     */
    public fun validationRegex(validationRegex: String) {
        cdkBuilder.validationRegex(validationRegex)
    }

    public fun build(): TokenAuthorizerProps = cdkBuilder.build()
}
