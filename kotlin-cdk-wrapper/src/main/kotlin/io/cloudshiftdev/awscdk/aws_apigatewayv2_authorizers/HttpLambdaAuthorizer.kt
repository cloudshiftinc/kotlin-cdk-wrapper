@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteAuthorizerBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteAuthorizerConfig
import io.cloudshiftdev.awscdk.services.apigatewayv2.IHttpRouteAuthorizer
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

/**
 * Authorize Http Api routes via a lambda function.
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
public open class HttpLambdaAuthorizer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer,
) : CdkObject(cdkObject), IHttpRouteAuthorizer {
  public constructor(id: String, handler: CloudshiftdevAwscdkServicesLambdaIFunction) :
      this(software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer(id,
      handler.let(CloudshiftdevAwscdkServicesLambdaIFunction::unwrap))
  )

  public constructor(
    id: String,
    handler: CloudshiftdevAwscdkServicesLambdaIFunction,
    props: HttpLambdaAuthorizerProps,
  ) : this(software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer(id,
      handler.let(CloudshiftdevAwscdkServicesLambdaIFunction::unwrap),
      props.let(HttpLambdaAuthorizerProps::unwrap))
  )

  public constructor(
    id: String,
    handler: CloudshiftdevAwscdkServicesLambdaIFunction,
    props: HttpLambdaAuthorizerProps.Builder.() -> Unit,
  ) : this(id, handler, HttpLambdaAuthorizerProps(props)
  )

  /**
   * Bind this authorizer to a specified Http route.
   *
   * @param options 
   */
  public override fun bind(options: HttpRouteAuthorizerBindOptions): HttpRouteAuthorizerConfig =
      unwrap(this).bind(options.let(HttpRouteAuthorizerBindOptions::unwrap)).let(HttpRouteAuthorizerConfig::wrap)

  /**
   * Bind this authorizer to a specified Http route.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7264f1d1173f23e66027e915fda55df480ab8eab246316ad2f01f98a1f9a28cc")
  public override fun bind(options: HttpRouteAuthorizerBindOptions.Builder.() -> Unit):
      HttpRouteAuthorizerConfig = bind(HttpRouteAuthorizerBindOptions(options))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Friendly authorizer name.
     *
     * Default: - same value as `id` passed in the constructor.
     *
     * @param authorizerName Friendly authorizer name. 
     */
    public fun authorizerName(authorizerName: String)

    /**
     * The identity source for which authorization is requested.
     *
     * Default: ['$request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(identitySource: List<String>)

    /**
     * The identity source for which authorization is requested.
     *
     * Default: ['$request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested. 
     */
    public fun identitySource(vararg identitySource: String)

    /**
     * The types of responses the lambda can return.
     *
     * If HttpLambdaResponseType.SIMPLE is included then
     * response format 2.0 will be used.
     *
     * Default: [HttpLambdaResponseType.IAM]
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html#http-api-lambda-authorizer.payload-format-response)
     * @param responseTypes The types of responses the lambda can return. 
     */
    public fun responseTypes(responseTypes: List<HttpLambdaResponseType>)

    /**
     * The types of responses the lambda can return.
     *
     * If HttpLambdaResponseType.SIMPLE is included then
     * response format 2.0 will be used.
     *
     * Default: [HttpLambdaResponseType.IAM]
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html#http-api-lambda-authorizer.payload-format-response)
     * @param responseTypes The types of responses the lambda can return. 
     */
    public fun responseTypes(vararg responseTypes: HttpLambdaResponseType)

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     * Disable caching by setting this to `Duration.seconds(0)`.
     *
     * Default: Duration.minutes(5)
     *
     * @param resultsCacheTtl How long APIGateway should cache the results. 
     */
    public fun resultsCacheTtl(resultsCacheTtl: Duration)
  }

  private class BuilderImpl(
    id: String,
    handler: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer.Builder =
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer.Builder.create(id,
        handler)

    /**
     * Friendly authorizer name.
     *
     * Default: - same value as `id` passed in the constructor.
     *
     * @param authorizerName Friendly authorizer name. 
     */
    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * The identity source for which authorization is requested.
     *
     * Default: ['$request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested. 
     */
    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    /**
     * The identity source for which authorization is requested.
     *
     * Default: ['$request.header.Authorization']
     *
     * @param identitySource The identity source for which authorization is requested. 
     */
    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    /**
     * The types of responses the lambda can return.
     *
     * If HttpLambdaResponseType.SIMPLE is included then
     * response format 2.0 will be used.
     *
     * Default: [HttpLambdaResponseType.IAM]
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html#http-api-lambda-authorizer.payload-format-response)
     * @param responseTypes The types of responses the lambda can return. 
     */
    override fun responseTypes(responseTypes: List<HttpLambdaResponseType>) {
      cdkBuilder.responseTypes(responseTypes.map(HttpLambdaResponseType::unwrap))
    }

    /**
     * The types of responses the lambda can return.
     *
     * If HttpLambdaResponseType.SIMPLE is included then
     * response format 2.0 will be used.
     *
     * Default: [HttpLambdaResponseType.IAM]
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-lambda-authorizer.html#http-api-lambda-authorizer.payload-format-response)
     * @param responseTypes The types of responses the lambda can return. 
     */
    override fun responseTypes(vararg responseTypes: HttpLambdaResponseType): Unit =
        responseTypes(responseTypes.toList())

    /**
     * How long APIGateway should cache the results.
     *
     * Max 1 hour.
     * Disable caching by setting this to `Duration.seconds(0)`.
     *
     * Default: Duration.minutes(5)
     *
     * @param resultsCacheTtl How long APIGateway should cache the results. 
     */
    override fun resultsCacheTtl(resultsCacheTtl: Duration) {
      cdkBuilder.resultsCacheTtl(resultsCacheTtl.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      id: String,
      handler: CloudshiftdevAwscdkServicesLambdaIFunction,
      block: Builder.() -> Unit = {},
    ): HttpLambdaAuthorizer {
      val builderImpl = BuilderImpl(id, CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(handler))
      return HttpLambdaAuthorizer(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer):
        HttpLambdaAuthorizer = HttpLambdaAuthorizer(cdkObject)

    internal fun unwrap(wrapped: HttpLambdaAuthorizer):
        software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer = wrapped.cdkObject
  }
}
