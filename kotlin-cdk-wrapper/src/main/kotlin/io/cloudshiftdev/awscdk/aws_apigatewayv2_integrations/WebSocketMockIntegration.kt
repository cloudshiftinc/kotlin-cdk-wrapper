@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegration
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Mock WebSocket Integration.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration;
 * WebSocketApi webSocketApi = new WebSocketApi(this, "mywsapi");
 * WebSocketStage.Builder.create(this, "mystage")
 * .webSocketApi(webSocketApi)
 * .stageName("dev")
 * .autoDeploy(true)
 * .build();
 * webSocketApi.addRoute("sendMessage", WebSocketRouteOptions.builder()
 * .integration(WebSocketMockIntegration.Builder.create("DefaultIntegration")
 * .requestTemplates(Map.of("application/json", JSON.stringify(Map.of("statusCode", 200))))
 * .templateSelectionExpression("\\$default")
 * .build())
 * .returnResponse(true)
 * .build());
 * ```
 */
public open class WebSocketMockIntegration(
  cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration,
) : WebSocketRouteIntegration(cdkObject) {
  public constructor(id: String) :
      this(software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration(id)
  )

  public constructor(id: String, props: WebSocketMockIntegrationProps) :
      this(software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration(id,
      props.let(WebSocketMockIntegrationProps.Companion::unwrap))
  )

  public constructor(id: String, props: WebSocketMockIntegrationProps.Builder.() -> Unit) : this(id,
      WebSocketMockIntegrationProps(props)
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
   * [io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A map of Apache Velocity templates that are applied on the request payload.
     *
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     *
     * Default: - No request template provided to the integration.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html)
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     * payload. 
     */
    public fun requestTemplates(requestTemplates: Map<String, String>)

    /**
     * The template selection expression for the integration.
     *
     * Default: - No template selection expression provided.
     *
     * @param templateSelectionExpression The template selection expression for the integration. 
     */
    public fun templateSelectionExpression(templateSelectionExpression: String)
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration.Builder.create(id)

    /**
     * A map of Apache Velocity templates that are applied on the request payload.
     *
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     *
     * Default: - No request template provided to the integration.
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-api-mapping-template-reference.html)
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     * payload. 
     */
    override fun requestTemplates(requestTemplates: Map<String, String>) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    /**
     * The template selection expression for the integration.
     *
     * Default: - No template selection expression provided.
     *
     * @param templateSelectionExpression The template selection expression for the integration. 
     */
    override fun templateSelectionExpression(templateSelectionExpression: String) {
      cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(id: String, block: Builder.() -> Unit = {}):
        WebSocketMockIntegration {
      val builderImpl = BuilderImpl(id)
      return WebSocketMockIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration):
        WebSocketMockIntegration = WebSocketMockIntegration(cdkObject)

    internal fun unwrap(wrapped: WebSocketMockIntegration):
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration =
        wrapped.cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegration
  }
}
