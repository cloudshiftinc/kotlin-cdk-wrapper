@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties to initialize HttpTokenAuthorizer.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.HttpLambdaResponseType;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
 * // This function handles your auth logic
 * Function authHandler;
 * HttpLambdaAuthorizer authorizer = HttpLambdaAuthorizer.Builder.create("BooksAuthorizer",
 * authHandler)
 * .responseTypes(List.of(HttpLambdaResponseType.SIMPLE))
 * .build();
 * HttpApi api = new HttpApi(this, "HttpApi");
 * api.addRoutes(AddRoutesOptions.builder()
 * .integration(new HttpUrlIntegration("BooksIntegration", "https://get-books-proxy.example.com"))
 * .path("/books")
 * .authorizer(authorizer)
 * .build());
 * ```
 */
public interface HttpLambdaAuthorizerProps {
  /**
   * Friendly authorizer name.
   *
   * Default: - same value as `id` passed in the constructor.
   */
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  /**
   * The identity source for which authorization is requested.
   *
   * Default: ['$request.header.Authorization']
   */
  public fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

  /**
   * The types of responses the lambda can return.
   *
   * If HttpLambdaResponseType.SIMPLE is included then
   * response format 2.0 will be used.
   *
   * Default: [HttpLambdaResponseType.IAM]
   *
   * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html#http-api-lambda-authorizer.payload-format-response)
   */
  public fun responseTypes(): List<HttpLambdaResponseType> =
      unwrap(this).getResponseTypes()?.map(HttpLambdaResponseType::wrap) ?: emptyList()

  /**
   * How long APIGateway should cache the results.
   *
   * Max 1 hour.
   * Disable caching by setting this to `Duration.seconds(0)`.
   *
   * Default: Duration.minutes(5)
   */
  public fun resultsCacheTtl(): Duration? = unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)

  /**
   * A builder for [HttpLambdaAuthorizerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authorizerName Friendly authorizer name.
     */
    public fun authorizerName(authorizerName: String)

    /**
     * @param identitySource The identity source for which authorization is requested.
     */
    public fun identitySource(identitySource: List<String>)

    /**
     * @param identitySource The identity source for which authorization is requested.
     */
    public fun identitySource(vararg identitySource: String)

    /**
     * @param responseTypes The types of responses the lambda can return.
     * If HttpLambdaResponseType.SIMPLE is included then
     * response format 2.0 will be used.
     */
    public fun responseTypes(responseTypes: List<HttpLambdaResponseType>)

    /**
     * @param responseTypes The types of responses the lambda can return.
     * If HttpLambdaResponseType.SIMPLE is included then
     * response format 2.0 will be used.
     */
    public fun responseTypes(vararg responseTypes: HttpLambdaResponseType)

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results.
     * Max 1 hour.
     * Disable caching by setting this to `Duration.seconds(0)`.
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps.builder()

    /**
     * @param authorizerName Friendly authorizer name.
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * @param identitySource The identity source for which authorization is requested.
     */
    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * @param identitySource The identity source for which authorization is requested.
     */
    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    /**
     * @param responseTypes The types of responses the lambda can return.
     * If HttpLambdaResponseType.SIMPLE is included then
     * response format 2.0 will be used.
     */
    override fun responseTypes(responseTypes: List<HttpLambdaResponseType>) {
      cdkBuilder.responseTypes(responseTypes.map(HttpLambdaResponseType.Companion::unwrap))
    }

    /**
     * @param responseTypes The types of responses the lambda can return.
     * If HttpLambdaResponseType.SIMPLE is included then
     * response format 2.0 will be used.
     */
    override fun responseTypes(vararg responseTypes: HttpLambdaResponseType): Unit =
        responseTypes(responseTypes.toList())

    /**
     * @param resultsCacheTtl How long APIGateway should cache the results.
     * Max 1 hour.
     * Disable caching by setting this to `Duration.seconds(0)`.
     */
    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps,
  ) : CdkObject(cdkObject),
      HttpLambdaAuthorizerProps {
    /**
     * Friendly authorizer name.
     *
     * Default: - same value as `id` passed in the constructor.
     */
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    /**
     * The identity source for which authorization is requested.
     *
     * Default: ['$request.header.Authorization']
     */
    override fun identitySource(): List<String> = unwrap(this).getIdentitySource() ?: emptyList()

    /**
     * The types of responses the lambda can return.
     *
     * If HttpLambdaResponseType.SIMPLE is included then
     * response format 2.0 will be used.
     *
     * Default: [HttpLambdaResponseType.IAM]
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html#http-api-lambda-authorizer.payload-format-response)
     */
    override fun responseTypes(): List<HttpLambdaResponseType> =
        unwrap(this).getResponseTypes()?.map(HttpLambdaResponseType::wrap) ?: emptyList()

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     * Disable caching by setting this to `Duration.seconds(0)`.
     *
     * Default: Duration.minutes(5)
     */
    override fun resultsCacheTtl(): Duration? =
        unwrap(this).getResultsCacheTtl()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpLambdaAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps):
        HttpLambdaAuthorizerProps = CdkObjectWrappers.wrap(cdkObject) as? HttpLambdaAuthorizerProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpLambdaAuthorizerProps):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps
  }
}
