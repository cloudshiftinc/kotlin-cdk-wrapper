@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.apigatewayv2.ContentHandling
import io.cloudshiftdev.awscdk.services.apigatewayv2.PassthroughBehavior
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegration
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegrationBindOptions
import io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketRouteIntegrationConfig
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * AWS WebSocket AWS Type Integration.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration;
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role apiRole;
 * Table table;
 * WebSocketApi webSocketApi = new WebSocketApi(this, "mywsapi");
 * WebSocketStage.Builder.create(this, "mystage")
 * .webSocketApi(webSocketApi)
 * .stageName("dev")
 * .autoDeploy(true)
 * .build();
 * webSocketApi.addRoute("$connect", WebSocketRouteOptions.builder()
 * .integration(WebSocketAwsIntegration.Builder.create("DynamodbPutItem")
 * .integrationUri(String.format("arn:aws:apigateway:%s:dynamodb:action/PutItem", this.region))
 * .integrationMethod(HttpMethod.POST)
 * .credentialsRole(apiRole)
 * .requestTemplates(Map.of(
 * "application/json", JSON.stringify(Map.of(
 * "TableName", table.getTableName(),
 * "Item", Map.of(
 * "id", Map.of(
 * "S", "$context.requestId"))))))
 * .build())
 * .build());
 * ```
 */
public open class WebSocketAwsIntegration(
  cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration,
) : WebSocketRouteIntegration(cdkObject) {
  public constructor(id: String, props: WebSocketAwsIntegrationProps) :
      this(software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration(id,
      props.let(WebSocketAwsIntegrationProps.Companion::unwrap))
  )

  public constructor(id: String, props: WebSocketAwsIntegrationProps.Builder.() -> Unit) : this(id,
      WebSocketAwsIntegrationProps(props)
  )

  /**
   * Bind this integration to the route.
   *
   * @param _options 
   */
  public override fun bind(options: WebSocketRouteIntegrationBindOptions):
      WebSocketRouteIntegrationConfig =
      unwrap(this).bind(options.let(WebSocketRouteIntegrationBindOptions.Companion::unwrap)).let(WebSocketRouteIntegrationConfig::wrap)

  /**
   * Bind this integration to the route.
   *
   * @param _options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7a7b031c3048abbe6ba7d40d85e75a2ef504b8009c343d60be7d0e9d137fa9bc")
  public override fun bind(options: WebSocketRouteIntegrationBindOptions.Builder.() -> Unit):
      WebSocketRouteIntegrationConfig = bind(WebSocketRouteIntegrationBindOptions(options))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration].
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
     * Specifies the credentials role required for the integration.
     *
     * Default: - No credential role provided.
     *
     * @param credentialsRole Specifies the credentials role required for the integration. 
     */
    public fun credentialsRole(credentialsRole: IRole)

    /**
     * Specifies the integration's HTTP method type.
     *
     * @param integrationMethod Specifies the integration's HTTP method type. 
     */
    public fun integrationMethod(integrationMethod: String)

    /**
     * Integration URI.
     *
     * @param integrationUri Integration URI. 
     */
    public fun integrationUri(integrationUri: String)

    /**
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in
     * the request, and the available mapping templates specified as the requestTemplates property on
     * the Integration resource.
     *
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER.
     *
     * Default: - No passthrough behavior required.
     *
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the Content-Type header in the request, and the available mapping templates specified as the
     * requestTemplates property on the Integration resource. 
     */
    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior)

    /**
     * The request parameters that API Gateway sends with the backend request.
     *
     * Specify request parameters as key-value pairs (string-to-string
     * mappings), with a destination as the key and a source as the value.
     *
     * Default: - No request parameter provided to the integration.
     *
     * @param requestParameters The request parameters that API Gateway sends with the backend
     * request. 
     */
    public fun requestParameters(requestParameters: Map<String, String>)

    /**
     * A map of Apache Velocity templates that are applied on the request payload.
     *
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     *
     * Default: - No request template provided to the integration.
     *
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
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration.Builder =
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration.Builder.create(id)

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
     * Specifies the credentials role required for the integration.
     *
     * Default: - No credential role provided.
     *
     * @param credentialsRole Specifies the credentials role required for the integration. 
     */
    override fun credentialsRole(credentialsRole: IRole) {
      cdkBuilder.credentialsRole(credentialsRole.let(IRole.Companion::unwrap))
    }

    /**
     * Specifies the integration's HTTP method type.
     *
     * @param integrationMethod Specifies the integration's HTTP method type. 
     */
    override fun integrationMethod(integrationMethod: String) {
      cdkBuilder.integrationMethod(integrationMethod)
    }

    /**
     * Integration URI.
     *
     * @param integrationUri Integration URI. 
     */
    override fun integrationUri(integrationUri: String) {
      cdkBuilder.integrationUri(integrationUri)
    }

    /**
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in
     * the request, and the available mapping templates specified as the requestTemplates property on
     * the Integration resource.
     *
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER.
     *
     * Default: - No passthrough behavior required.
     *
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the Content-Type header in the request, and the available mapping templates specified as the
     * requestTemplates property on the Integration resource. 
     */
    override fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior.Companion::unwrap))
    }

    /**
     * The request parameters that API Gateway sends with the backend request.
     *
     * Specify request parameters as key-value pairs (string-to-string
     * mappings), with a destination as the key and a source as the value.
     *
     * Default: - No request parameter provided to the integration.
     *
     * @param requestParameters The request parameters that API Gateway sends with the backend
     * request. 
     */
    override fun requestParameters(requestParameters: Map<String, String>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * A map of Apache Velocity templates that are applied on the request payload.
     *
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     *
     * Default: - No request template provided to the integration.
     *
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

    public fun build(): software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(id: String, block: Builder.() -> Unit = {}):
        WebSocketAwsIntegration {
      val builderImpl = BuilderImpl(id)
      return WebSocketAwsIntegration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration):
        WebSocketAwsIntegration = WebSocketAwsIntegration(cdkObject)

    internal fun unwrap(wrapped: WebSocketAwsIntegration):
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration =
        wrapped.cdkObject as
        software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration
  }
}
