@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit

/**
 * Properties for TokenAuthorizer.
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
public interface TokenAuthorizerProps : LambdaAuthorizerProps {
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
   */
  public fun identitySource(): String? = unwrap(this).getIdentitySource()

  /**
   * An optional regex to be matched against the authorization token.
   *
   * When matched the authorizer lambda is invoked,
   * otherwise a 401 Unauthorized is returned to the client.
   *
   * Default: - no regex filter will be applied.
   */
  public fun validationRegex(): String? = unwrap(this).getValidationRegex()

  /**
   * A builder for [TokenAuthorizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assumeRole An optional IAM role for APIGateway to assume before calling the
     * Lambda-based authorizer.
     * The IAM role must be
     * assumable by 'apigateway.amazonaws.com'.
     */
    public fun assumeRole(assumeRole: IRole)

    /**
     * @param authorizerName An optional human friendly name for the authorizer.
     * Note that, this is not the primary identifier of the authorizer.
     */
    public fun authorizerName(authorizerName: String)

    /**
     * @param handler The handler for the authorizer lambda function. 
     * The handler must follow a very specific protocol on the input it receives
     * and the output it needs to produce.  API Gateway has documented the
     * handler's [input
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
     * and [output
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
     */
    public fun handler(handler: IFunction)

    /**
     * @param identitySource The request header mapping expression for the bearer token.
     * This is typically passed as part of the header, in which case
     * this should be `method.request.header.Authorizer` where `Authorizer` is the header containing
     * the bearer token.
     */
    public fun identitySource(identitySource: String)

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results.
     * Max 1 hour.
     * Disable caching by setting this to 0.
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration)

    /**
     * @param validationRegex An optional regex to be matched against the authorization token.
     * When matched the authorizer lambda is invoked,
     * otherwise a 401 Unauthorized is returned to the client.
     */
    public fun validationRegex(validationRegex: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.TokenAuthorizerProps.Builder
        = software.amazon.awscdk.services.apigateway.TokenAuthorizerProps.builder()

    /**
     * @param assumeRole An optional IAM role for APIGateway to assume before calling the
     * Lambda-based authorizer.
     * The IAM role must be
     * assumable by 'apigateway.amazonaws.com'.
     */
    override fun assumeRole(assumeRole: IRole) {
      cdkBuilder.assumeRole(assumeRole.let(IRole.Companion::unwrap))
    }

    /**
     * @param authorizerName An optional human friendly name for the authorizer.
     * Note that, this is not the primary identifier of the authorizer.
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * @param handler The handler for the authorizer lambda function. 
     * The handler must follow a very specific protocol on the input it receives
     * and the output it needs to produce.  API Gateway has documented the
     * handler's [input
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
     * and [output
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
     */
    override fun handler(handler: IFunction) {
      cdkBuilder.handler(handler.let(IFunction.Companion::unwrap))
    }

    /**
     * @param identitySource The request header mapping expression for the bearer token.
     * This is typically passed as part of the header, in which case
     * this should be `method.request.header.Authorizer` where `Authorizer` is the header containing
     * the bearer token.
     */
    override fun identitySource(identitySource: String) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results.
     * Max 1 hour.
     * Disable caching by setting this to 0.
     */
    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration.Companion::unwrap))
    }

    /**
     * @param validationRegex An optional regex to be matched against the authorization token.
     * When matched the authorizer lambda is invoked,
     * otherwise a 401 Unauthorized is returned to the client.
     */
    override fun validationRegex(validationRegex: String) {
      cdkBuilder.validationRegex(validationRegex)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.TokenAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.TokenAuthorizerProps,
  ) : CdkObject(cdkObject),
      TokenAuthorizerProps {
    /**
     * An optional IAM role for APIGateway to assume before calling the Lambda-based authorizer.
     *
     * The IAM role must be
     * assumable by 'apigateway.amazonaws.com'.
     *
     * Default: - A resource policy is added to the Lambda function allowing
     * apigateway.amazonaws.com to invoke the function.
     */
    override fun assumeRole(): IRole? = unwrap(this).getAssumeRole()?.let(IRole::wrap)

    /**
     * An optional human friendly name for the authorizer.
     *
     * Note that, this is not the primary identifier of the authorizer.
     *
     * Default: - the unique construct ID
     */
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    /**
     * The handler for the authorizer lambda function.
     *
     * The handler must follow a very specific protocol on the input it receives
     * and the output it needs to produce.  API Gateway has documented the
     * handler's [input
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-input.html)
     * and [output
     * specification](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-lambda-authorizer-output.html).
     */
    override fun handler(): IFunction = unwrap(this).getHandler().let(IFunction::wrap)

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
     */
    override fun identitySource(): String? = unwrap(this).getIdentitySource()

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     * Disable caching by setting this to 0.
     *
     * Default: - Duration.minutes(5)
     */
    override fun resultsCacheTtl(): Duration? =
        unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

    /**
     * An optional regex to be matched against the authorization token.
     *
     * When matched the authorizer lambda is invoked,
     * otherwise a 401 Unauthorized is returned to the client.
     *
     * Default: - no regex filter will be applied.
     */
    override fun validationRegex(): String? = unwrap(this).getValidationRegex()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TokenAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.TokenAuthorizerProps):
        TokenAuthorizerProps = CdkObjectWrappers.wrap(cdkObject) as? TokenAuthorizerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TokenAuthorizerProps):
        software.amazon.awscdk.services.apigateway.TokenAuthorizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.TokenAuthorizerProps
  }
}
