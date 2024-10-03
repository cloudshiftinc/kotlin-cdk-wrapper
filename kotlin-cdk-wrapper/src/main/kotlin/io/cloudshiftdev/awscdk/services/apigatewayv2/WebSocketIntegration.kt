@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The integration for an API route.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * Role role;
 * WebSocketApi webSocketApi;
 * WebSocketIntegration webSocketIntegration = WebSocketIntegration.Builder.create(this,
 * "MyWebSocketIntegration")
 * .integrationType(WebSocketIntegrationType.AWS_PROXY)
 * .integrationUri("integrationUri")
 * .webSocketApi(webSocketApi)
 * // the properties below are optional
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .credentialsRole(role)
 * .integrationMethod("integrationMethod")
 * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
 * .requestParameters(Map.of(
 * "requestParametersKey", "requestParameters"))
 * .requestTemplates(Map.of(
 * "requestTemplatesKey", "requestTemplates"))
 * .templateSelectionExpression("templateSelectionExpression")
 * .timeout(Duration.minutes(30))
 * .build();
 * ```
 */
public open class WebSocketIntegration(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration,
) : Resource(cdkObject),
    IWebSocketIntegration {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WebSocketIntegrationProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(WebSocketIntegrationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WebSocketIntegrationProps.Builder.() -> Unit,
  ) : this(scope, id, WebSocketIntegrationProps(props)
  )

  /**
   * Id of the integration.
   */
  public override fun integrationId(): String = unwrap(this).getIntegrationId()

  /**
   * The WebSocket API associated with this integration.
   */
  public override fun webSocketApi(): IWebSocketApi =
      unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketIntegration].
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
     * Specifies the IAM role required for the integration.
     *
     * Default: - No IAM role required.
     *
     * @param credentialsRole Specifies the IAM role required for the integration. 
     */
    public fun credentialsRole(credentialsRole: IRole)

    /**
     * Specifies the integration's HTTP method type.
     *
     * Default: - No HTTP method required.
     *
     * @param integrationMethod Specifies the integration's HTTP method type. 
     */
    public fun integrationMethod(integrationMethod: String)

    /**
     * Integration type.
     *
     * @param integrationType Integration type. 
     */
    public fun integrationType(integrationType: WebSocketIntegrationType)

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
     * Default: - No request parameters required.
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
     * Default: - No request templates required.
     *
     * @param requestTemplates A map of Apache Velocity templates that are applied on the request
     * payload. 
     */
    public fun requestTemplates(requestTemplates: Map<String, String>)

    /**
     * The template selection expression for the integration.
     *
     * Default: - No template selection expression required.
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

    /**
     * The WebSocket API to which this integration should be bound.
     *
     * @param webSocketApi The WebSocket API to which this integration should be bound. 
     */
    public fun webSocketApi(webSocketApi: IWebSocketApi)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration.Builder.create(scope, id)

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
     * Specifies the IAM role required for the integration.
     *
     * Default: - No IAM role required.
     *
     * @param credentialsRole Specifies the IAM role required for the integration. 
     */
    override fun credentialsRole(credentialsRole: IRole) {
      cdkBuilder.credentialsRole(credentialsRole.let(IRole.Companion::unwrap))
    }

    /**
     * Specifies the integration's HTTP method type.
     *
     * Default: - No HTTP method required.
     *
     * @param integrationMethod Specifies the integration's HTTP method type. 
     */
    override fun integrationMethod(integrationMethod: String) {
      cdkBuilder.integrationMethod(integrationMethod)
    }

    /**
     * Integration type.
     *
     * @param integrationType Integration type. 
     */
    override fun integrationType(integrationType: WebSocketIntegrationType) {
      cdkBuilder.integrationType(integrationType.let(WebSocketIntegrationType.Companion::unwrap))
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
     * Default: - No request parameters required.
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
     * Default: - No request templates required.
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
     * Default: - No template selection expression required.
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

    /**
     * The WebSocket API to which this integration should be bound.
     *
     * @param webSocketApi The WebSocket API to which this integration should be bound. 
     */
    override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): WebSocketIntegration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return WebSocketIntegration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration):
        WebSocketIntegration = WebSocketIntegration(cdkObject)

    internal fun unwrap(wrapped: WebSocketIntegration):
        software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketIntegration
  }
}
