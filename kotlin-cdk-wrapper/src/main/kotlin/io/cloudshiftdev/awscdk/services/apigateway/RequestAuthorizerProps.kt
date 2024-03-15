@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for RequestAuthorizer.
 *
 * Example:
 *
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
public interface RequestAuthorizerProps : LambdaAuthorizerProps {
  /**
   * An array of request header mapping expressions for identities.
   *
   * Supported parameter types are
   * Header, Query String, Stage Variable, and Context. For instance, extracting an authorization
   * token from a header would use the identity source `IdentitySource.header('Authorization')`.
   *
   * Note: API Gateway uses the specified identity sources as the request authorizer caching key.
   * When caching is
   * enabled, API Gateway calls the authorizer's Lambda function only after successfully verifying
   * that all the
   * specified identity sources are present at runtime. If a specified identify source is missing,
   * null, or empty,
   * API Gateway returns a 401 Unauthorized response without calling the authorizer Lambda function.
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateAuthorizer.html#apigw-CreateAuthorizer-request-identitySource)
   */
  public fun identitySources(): List<String>

  /**
   * A builder for [RequestAuthorizerProps]
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
     * @param identitySources An array of request header mapping expressions for identities. 
     * Supported parameter types are
     * Header, Query String, Stage Variable, and Context. For instance, extracting an authorization
     * token from a header would use the identity source `IdentitySource.header('Authorization')`.
     *
     * Note: API Gateway uses the specified identity sources as the request authorizer caching key.
     * When caching is
     * enabled, API Gateway calls the authorizer's Lambda function only after successfully verifying
     * that all the
     * specified identity sources are present at runtime. If a specified identify source is missing,
     * null, or empty,
     * API Gateway returns a 401 Unauthorized response without calling the authorizer Lambda
     * function.
     */
    public fun identitySources(identitySources: List<String>)

    /**
     * @param identitySources An array of request header mapping expressions for identities. 
     * Supported parameter types are
     * Header, Query String, Stage Variable, and Context. For instance, extracting an authorization
     * token from a header would use the identity source `IdentitySource.header('Authorization')`.
     *
     * Note: API Gateway uses the specified identity sources as the request authorizer caching key.
     * When caching is
     * enabled, API Gateway calls the authorizer's Lambda function only after successfully verifying
     * that all the
     * specified identity sources are present at runtime. If a specified identify source is missing,
     * null, or empty,
     * API Gateway returns a 401 Unauthorized response without calling the authorizer Lambda
     * function.
     */
    public fun identitySources(vararg identitySources: String)

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results.
     * Max 1 hour.
     * Disable caching by setting this to 0.
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.RequestAuthorizerProps.Builder =
        software.amazon.awscdk.services.apigateway.RequestAuthorizerProps.builder()

    /**
     * @param assumeRole An optional IAM role for APIGateway to assume before calling the
     * Lambda-based authorizer.
     * The IAM role must be
     * assumable by 'apigateway.amazonaws.com'.
     */
    override fun assumeRole(assumeRole: IRole) {
      cdkBuilder.assumeRole(assumeRole.let(IRole::unwrap))
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
      cdkBuilder.handler(handler.let(IFunction::unwrap))
    }

    /**
     * @param identitySources An array of request header mapping expressions for identities. 
     * Supported parameter types are
     * Header, Query String, Stage Variable, and Context. For instance, extracting an authorization
     * token from a header would use the identity source `IdentitySource.header('Authorization')`.
     *
     * Note: API Gateway uses the specified identity sources as the request authorizer caching key.
     * When caching is
     * enabled, API Gateway calls the authorizer's Lambda function only after successfully verifying
     * that all the
     * specified identity sources are present at runtime. If a specified identify source is missing,
     * null, or empty,
     * API Gateway returns a 401 Unauthorized response without calling the authorizer Lambda
     * function.
     */
    override fun identitySources(identitySources: List<String>) {
      cdkBuilder.identitySources(identitySources)
    }

    /**
     * @param identitySources An array of request header mapping expressions for identities. 
     * Supported parameter types are
     * Header, Query String, Stage Variable, and Context. For instance, extracting an authorization
     * token from a header would use the identity source `IdentitySource.header('Authorization')`.
     *
     * Note: API Gateway uses the specified identity sources as the request authorizer caching key.
     * When caching is
     * enabled, API Gateway calls the authorizer's Lambda function only after successfully verifying
     * that all the
     * specified identity sources are present at runtime. If a specified identify source is missing,
     * null, or empty,
     * API Gateway returns a 401 Unauthorized response without calling the authorizer Lambda
     * function.
     */
    override fun identitySources(vararg identitySources: String): Unit =
        identitySources(identitySources.toList())

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results.
     * Max 1 hour.
     * Disable caching by setting this to 0.
     */
    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RequestAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.RequestAuthorizerProps,
  ) : CdkObject(cdkObject), RequestAuthorizerProps {
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
     * An array of request header mapping expressions for identities.
     *
     * Supported parameter types are
     * Header, Query String, Stage Variable, and Context. For instance, extracting an authorization
     * token from a header would use the identity source `IdentitySource.header('Authorization')`.
     *
     * Note: API Gateway uses the specified identity sources as the request authorizer caching key.
     * When caching is
     * enabled, API Gateway calls the authorizer's Lambda function only after successfully verifying
     * that all the
     * specified identity sources are present at runtime. If a specified identify source is missing,
     * null, or empty,
     * API Gateway returns a 401 Unauthorized response without calling the authorizer Lambda
     * function.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/api/API_CreateAuthorizer.html#apigw-CreateAuthorizer-request-identitySource)
     */
    override fun identitySources(): List<String> = unwrap(this).getIdentitySources()

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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RequestAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RequestAuthorizerProps):
        RequestAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestAuthorizerProps):
        software.amazon.awscdk.services.apigateway.RequestAuthorizerProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.RequestAuthorizerProps
  }
}
