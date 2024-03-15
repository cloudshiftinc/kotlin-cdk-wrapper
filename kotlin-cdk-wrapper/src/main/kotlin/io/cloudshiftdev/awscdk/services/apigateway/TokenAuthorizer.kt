@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Token based lambda authorizer that recognizes the caller's identity as a bearer token, such as a
 * JSON Web Token (JWT) or an OAuth token.
 *
 * Based on the token, authorization is performed by a lambda function.
 *
 * Example:
 *
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
public open class TokenAuthorizer internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.TokenAuthorizer,
) : Authorizer(cdkObject), IAuthorizer {
  /**
   * The ARN of the authorizer to be used in permission policies, such as IAM and resource-based
   * grants.
   */
  public open fun authorizerArn(): String = unwrap(this).getAuthorizerArn()

  /**
   * The id of the authorizer.
   */
  public override fun authorizerId(): String = unwrap(this).getAuthorizerId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.TokenAuthorizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An optional IAM role for APIGateway to assume before calling the Lambda-based authorizer.
     *
     * The IAM role must be
     * assumable by 'apigateway.amazonaws.com'.
     *
     * Default: - A resource policy is added to the Lambda function allowing
     * apigateway.amazonaws.com to invoke the function.
     *
     * @param assumeRole An optional IAM role for APIGateway to assume before calling the
     * Lambda-based authorizer. 
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
     * The handler must follow a very specific protocol on the input it receives
     * and the output it needs to produce.  API Gateway has documented the
     * handler's [input
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
     * and [output
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
     *
     * @param handler The handler for the authorizer lambda function. 
     */
    public fun handler(handler: IFunction)

    /**
     * The request header mapping expression for the bearer token.
     *
     * This is typically passed as part of the header, in which case
     * this should be `method.request.header.Authorizer` where `Authorizer` is the header containing
     * the bearer token.
     *
     * Default: `IdentitySource.header('Authorization')`
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateAuthorizer.html#apigw-CreateAuthorizer-request-identitySource)
     * @param identitySource The request header mapping expression for the bearer token. 
     */
    public fun identitySource(identitySource: String)

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     * Disable caching by setting this to 0.
     *
     * Default: - Duration.minutes(5)
     *
     * @param resultsCacheTtl How long APIGateway should cache the results. 
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration)

    /**
     * An optional regex to be matched against the authorization token.
     *
     * When matched the authorizer lambda is invoked,
     * otherwise a 401 Unauthorized is returned to the client.
     *
     * Default: - no regex filter will be applied.
     *
     * @param validationRegex An optional regex to be matched against the authorization token. 
     */
    public fun validationRegex(validationRegex: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.TokenAuthorizer.Builder =
        software.amazon.awscdk.services.apigateway.TokenAuthorizer.Builder.create(scope, id)

    /**
     * An optional IAM role for APIGateway to assume before calling the Lambda-based authorizer.
     *
     * The IAM role must be
     * assumable by 'apigateway.amazonaws.com'.
     *
     * Default: - A resource policy is added to the Lambda function allowing
     * apigateway.amazonaws.com to invoke the function.
     *
     * @param assumeRole An optional IAM role for APIGateway to assume before calling the
     * Lambda-based authorizer. 
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
     * The handler must follow a very specific protocol on the input it receives
     * and the output it needs to produce.  API Gateway has documented the
     * handler's [input
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
     * and [output
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
     *
     * @param handler The handler for the authorizer lambda function. 
     */
    override fun handler(handler: IFunction) {
      cdkBuilder.handler(handler.let(IFunction::unwrap))
    }

    /**
     * The request header mapping expression for the bearer token.
     *
     * This is typically passed as part of the header, in which case
     * this should be `method.request.header.Authorizer` where `Authorizer` is the header containing
     * the bearer token.
     *
     * Default: `IdentitySource.header('Authorization')`
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateAuthorizer.html#apigw-CreateAuthorizer-request-identitySource)
     * @param identitySource The request header mapping expression for the bearer token. 
     */
    override fun identitySource(identitySource: String) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     * Disable caching by setting this to 0.
     *
     * Default: - Duration.minutes(5)
     *
     * @param resultsCacheTtl How long APIGateway should cache the results. 
     */
    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    /**
     * An optional regex to be matched against the authorization token.
     *
     * When matched the authorizer lambda is invoked,
     * otherwise a 401 Unauthorized is returned to the client.
     *
     * Default: - no regex filter will be applied.
     *
     * @param validationRegex An optional regex to be matched against the authorization token. 
     */
    override fun validationRegex(validationRegex: String) {
      cdkBuilder.validationRegex(validationRegex)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.TokenAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): TokenAuthorizer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return TokenAuthorizer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.TokenAuthorizer):
        TokenAuthorizer = TokenAuthorizer(cdkObject)

    internal fun unwrap(wrapped: TokenAuthorizer):
        software.amazon.awscdk.services.apigateway.TokenAuthorizer = wrapped.cdkObject
  }
}
