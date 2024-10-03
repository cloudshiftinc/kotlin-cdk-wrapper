@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegration
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import io.cloudshiftdev.awscdk.services.apigatewayv2.PayloadFormatVersion
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

/**
 * The Lambda Proxy integration resource for HTTP API.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
 * Function booksDefaultFn;
 * HttpLambdaIntegration booksIntegration = new HttpLambdaIntegration("BooksIntegration",
 * booksDefaultFn);
 * HttpApi httpApi = new HttpApi(this, "HttpApi");
 * httpApi.addRoutes(AddRoutesOptions.builder()
 * .path("/books")
 * .methods(List.of(HttpMethod.GET))
 * .integration(booksIntegration)
 * .build());
 * ```
 */
public open class HttpLambdaIntegration(
  cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration,
) : HttpRouteIntegration(cdkObject) {
  public constructor(id: String, handler: CloudshiftdevAwscdkServicesLambdaIFunction) :
      this(software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration(id,
      handler.let(CloudshiftdevAwscdkServicesLambdaIFunction.Companion::unwrap))
  )

  public constructor(
    id: String,
    handler: CloudshiftdevAwscdkServicesLambdaIFunction,
    props: HttpLambdaIntegrationProps,
  ) : this(software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration(id,
      handler.let(CloudshiftdevAwscdkServicesLambdaIFunction.Companion::unwrap),
      props.let(HttpLambdaIntegrationProps.Companion::unwrap))
  )

  public constructor(
    id: String,
    handler: CloudshiftdevAwscdkServicesLambdaIFunction,
    props: HttpLambdaIntegrationProps.Builder.() -> Unit,
  ) : this(id, handler, HttpLambdaIntegrationProps(props)
  )

  /**
   * Bind this integration to the route.
   *
   * @param _options 
   */
  public override fun bind(options: HttpRouteIntegrationBindOptions): HttpRouteIntegrationConfig =
      unwrap(this).bind(options.let(HttpRouteIntegrationBindOptions.Companion::unwrap)).let(HttpRouteIntegrationConfig::wrap)

  /**
   * Bind this integration to the route.
   *
   * @param _options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adeb585f7d049df388aeb961213ea487ef99967ed3fab3c9dbfc7653776fc180")
  public override fun bind(options: HttpRouteIntegrationBindOptions.Builder.() -> Unit):
      HttpRouteIntegrationConfig = bind(HttpRouteIntegrationBindOptions(options))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: undefined requests are sent to the backend unmodified
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend. 
     */
    public fun parameterMapping(parameterMapping: ParameterMapping)

    /**
     * Version of the payload sent to the lambda handler.
     *
     * Default: PayloadFormatVersion.VERSION_2_0
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     * @param payloadFormatVersion Version of the payload sent to the lambda handler. 
     */
    public fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion)

    /**
     * The maximum amount of time an integration will run before it returns without a response.
     *
     * Must be between 50 milliseconds and 29 seconds.
     *
     * Default: Duration.seconds(29)
     *
     * @param timeout The maximum amount of time an integration will run before it returns without a
     * response. 
     */
    public fun timeout(timeout: Duration)
  }

  private class BuilderImpl(
    id: String,
    handler: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration.Builder.create(id,
        handler)

    /**
     * Specifies how to transform HTTP requests before sending them to the backend.
     *
     * Default: undefined requests are sent to the backend unmodified
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-parameter-mapping.html)
     * @param parameterMapping Specifies how to transform HTTP requests before sending them to the
     * backend. 
     */
    override fun parameterMapping(parameterMapping: ParameterMapping) {
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping.Companion::unwrap))
    }

    /**
     * Version of the payload sent to the lambda handler.
     *
     * Default: PayloadFormatVersion.VERSION_2_0
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     * @param payloadFormatVersion Version of the payload sent to the lambda handler. 
     */
    override fun payloadFormatVersion(payloadFormatVersion: PayloadFormatVersion) {
      cdkBuilder.payloadFormatVersion(payloadFormatVersion.let(PayloadFormatVersion.Companion::unwrap))
    }

    /**
     * The maximum amount of time an integration will run before it returns without a response.
     *
     * Must be between 50 milliseconds and 29 seconds.
     *
     * Default: Duration.seconds(29)
     *
     * @param timeout The maximum amount of time an integration will run before it returns without a
     * response. 
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      id: String,
      handler: CloudshiftdevAwscdkServicesLambdaIFunction,
      block: Builder.() -> Unit = {},
    ): HttpLambdaIntegration {
      val builderImpl = BuilderImpl(id, CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(handler))
      return HttpLambdaIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration):
        HttpLambdaIntegration = HttpLambdaIntegration(cdkObject)

    internal fun unwrap(wrapped: HttpLambdaIntegration):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration =
        wrapped.cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration
  }
}
