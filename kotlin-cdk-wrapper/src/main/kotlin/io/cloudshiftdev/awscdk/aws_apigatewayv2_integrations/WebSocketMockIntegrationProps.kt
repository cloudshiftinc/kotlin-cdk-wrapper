@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Props for Mock type integration for a WebSocket Api.
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
public interface WebSocketMockIntegrationProps {
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
   */
  public fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates() ?:
      emptyMap()

  /**
   * The template selection expression for the integration.
   *
   * Default: - No template selection expression provided.
   */
  public fun templateSelectionExpression(): String? = unwrap(this).getTemplateSelectionExpression()

  /**
   * A builder for [WebSocketMockIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     * payload.
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     */
    public fun requestTemplates(requestTemplates: Map<String, String>)

    /**
     * @param templateSelectionExpression The template selection expression for the integration.
     */
    public fun templateSelectionExpression(templateSelectionExpression: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegrationProps.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegrationProps.builder()

    /**
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     * payload.
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     */
    override fun requestTemplates(requestTemplates: Map<String, String>) {
      cdkBuilder.requestTemplates(requestTemplates)
    }

    /**
     * @param templateSelectionExpression The template selection expression for the integration.
     */
    override fun templateSelectionExpression(templateSelectionExpression: String) {
      cdkBuilder.templateSelectionExpression(templateSelectionExpression)
    }

    public fun build():
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegrationProps,
  ) : CdkObject(cdkObject),
      WebSocketMockIntegrationProps {
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
     */
    override fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates() ?:
        emptyMap()

    /**
     * The template selection expression for the integration.
     *
     * Default: - No template selection expression provided.
     */
    override fun templateSelectionExpression(): String? =
        unwrap(this).getTemplateSelectionExpression()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketMockIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegrationProps):
        WebSocketMockIntegrationProps = CdkObjectWrappers.wrap(cdkObject) as?
        WebSocketMockIntegrationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketMockIntegrationProps):
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegrationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketMockIntegrationProps
  }
}
