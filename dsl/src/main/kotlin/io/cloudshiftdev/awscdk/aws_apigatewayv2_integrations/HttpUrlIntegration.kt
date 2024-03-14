package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpMethod
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegration
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegrationBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.HttpRouteIntegrationConfig
import io.cloudshiftdev.awscdk.services.apigatewayv2.ParameterMapping
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public open class HttpUrlIntegration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration,
) : HttpRouteIntegration(cdkObject) {
  /**
   * Bind this integration to the route.
   *
   * @param _options 
   */
  public override fun bind(_options: HttpRouteIntegrationBindOptions): HttpRouteIntegrationConfig =
      unwrap(this).bind(_options.let(HttpRouteIntegrationBindOptions::unwrap)).let(HttpRouteIntegrationConfig::wrap)

  /**
   * Bind this integration to the route.
   *
   * @param _options 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("adeb585f7d049df388aeb961213ea487ef99967ed3fab3c9dbfc7653776fc180")
  public override fun bind(_options: HttpRouteIntegrationBindOptions.Builder.() -> Unit):
      HttpRouteIntegrationConfig = bind(HttpRouteIntegrationBindOptions(_options))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The HTTP method that must be used to invoke the underlying HTTP proxy.
     *
     * Default: HttpMethod.ANY
     *
     * @param method The HTTP method that must be used to invoke the underlying HTTP proxy. 
     */
    public fun method(method: HttpMethod)

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
  }

  private class BuilderImpl(
    id: String,
    url: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration.Builder.create(id,
        url)

    /**
     * The HTTP method that must be used to invoke the underlying HTTP proxy.
     *
     * Default: HttpMethod.ANY
     *
     * @param method The HTTP method that must be used to invoke the underlying HTTP proxy. 
     */
    override fun method(method: HttpMethod) {
      cdkBuilder.method(method.let(HttpMethod::unwrap))
    }

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
      cdkBuilder.parameterMapping(parameterMapping.let(ParameterMapping::unwrap))
    }

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      id: String,
      url: String,
      block: Builder.() -> Unit = {},
    ): HttpUrlIntegration {
      val builderImpl = BuilderImpl(id, url)
      return HttpUrlIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration):
        HttpUrlIntegration = HttpUrlIntegration(cdkObject)

    internal fun unwrap(wrapped: HttpUrlIntegration):
        software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration = wrapped.cdkObject
  }
}
