@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.apigatewayv2.ContentHandling
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegration
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

/**
 * Lambda WebSocket Integration.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
 * Function messageHandler;
 * WebSocketApi webSocketApi = new WebSocketApi(this, "mywsapi");
 * WebSocketStage.Builder.create(this, "mystage")
 * .webSocketApi(webSocketApi)
 * .stageName("dev")
 * .autoDeploy(true)
 * .build();
 * webSocketApi.addRoute("sendMessage", WebSocketRouteOptions.builder()
 * .integration(new WebSocketLambdaIntegration("SendMessageIntegration", messageHandler))
 * .build());
 * ```
 */
public open class WebSocketLambdaIntegration(
  cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration,
) : WebSocketRouteIntegration(cdkObject) {
  public constructor(id: String, handler: CloudshiftdevAwscdkServicesLambdaIFunction) :
      this(software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration(id,
      handler.let(CloudshiftdevAwscdkServicesLambdaIFunction.Companion::unwrap))
  )

  public constructor(
    id: String,
    handler: CloudshiftdevAwscdkServicesLambdaIFunction,
    props: WebSocketLambdaIntegrationProps,
  ) : this(software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration(id,
      handler.let(CloudshiftdevAwscdkServicesLambdaIFunction.Companion::unwrap),
      props.let(WebSocketLambdaIntegrationProps.Companion::unwrap))
  )

  public constructor(
    id: String,
    handler: CloudshiftdevAwscdkServicesLambdaIFunction,
    props: WebSocketLambdaIntegrationProps.Builder.() -> Unit,
  ) : this(id, handler, WebSocketLambdaIntegrationProps(props)
  )

  /**
   * Bind this integration to the route.
   *
   * @param options 
   */
  public override fun bind(options: WebSocketRouteIntegrationBindOptions):
      WebSocketRouteIntegrationConfig =
      unwrap(this).bind(options.let(WebSocketRouteIntegrationBindOptions.Companion::unwrap)).let(WebSocketRouteIntegrationConfig::wrap)

  /**
   * Bind this integration to the route.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7a7b031c3048abbe6ba7d40d85e75a2ef504b8009c343d60be7d0e9d137fa9bc")
  public override fun bind(options: WebSocketRouteIntegrationBindOptions.Builder.() -> Unit):
      WebSocketRouteIntegrationConfig = bind(WebSocketRouteIntegrationBindOptions(options))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies how to handle response payload content type conversions.
     *
     * Default: - The response payload will be passed through from the integration response to
     * the route response or method response without modification.
     *
     * @param contentHandling Specifies how to handle response payload content type conversions. 
     */
    public fun contentHandling(contentHandling: ContentHandling)

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
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration.Builder.create(id,
        handler)

    /**
     * Specifies how to handle response payload content type conversions.
     *
     * Default: - The response payload will be passed through from the integration response to
     * the route response or method response without modification.
     *
     * @param contentHandling Specifies how to handle response payload content type conversions. 
     */
    override fun contentHandling(contentHandling: ContentHandling) {
      cdkBuilder.contentHandling(contentHandling.let(ContentHandling.Companion::unwrap))
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

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      id: String,
      handler: CloudshiftdevAwscdkServicesLambdaIFunction,
      block: Builder.() -> Unit = {},
    ): WebSocketLambdaIntegration {
      val builderImpl = BuilderImpl(id, CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(handler))
      return WebSocketLambdaIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration):
        WebSocketLambdaIntegration = WebSocketLambdaIntegration(cdkObject)

    internal fun unwrap(wrapped: WebSocketLambdaIntegration):
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration =
        wrapped.cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration
  }
}
