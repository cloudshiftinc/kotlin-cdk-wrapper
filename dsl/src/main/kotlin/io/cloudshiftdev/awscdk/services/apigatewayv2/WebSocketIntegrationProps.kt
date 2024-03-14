package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface WebSocketIntegrationProps {
  /**
   * Specifies the IAM role required for the integration.
   *
   * Default: - No IAM role required.
   */
  public fun credentialsRole(): IRole? = unwrap(this).getCredentialsRole()?.let(IRole::wrap)

  /**
   * Specifies the integration's HTTP method type.
   *
   * Default: - No HTTP method required.
   */
  public fun integrationMethod(): String? = unwrap(this).getIntegrationMethod()

  /**
   * Integration type.
   */
  public fun integrationType(): WebSocketIntegrationType

  /**
   * Integration URI.
   */
  public fun integrationUri(): String

  /**
   * Specifies the pass-through behavior for incoming requests based on the Content-Type header in
   * the request, and the available mapping templates specified as the requestTemplates property on the
   * Integration resource.
   *
   * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
   * NEVER.
   *
   * Default: - No passthrough behavior required.
   */
  public fun passthroughBehavior(): PassthroughBehavior? =
      unwrap(this).getPassthroughBehavior()?.let(PassthroughBehavior::wrap)

  /**
   * The request parameters that API Gateway sends with the backend request.
   *
   * Specify request parameters as key-value pairs (string-to-string
   * mappings), with a destination as the key and a source as the value.
   *
   * Default: - No request parameters required.
   */
  public fun requestParameters(): Map<String, String> = unwrap(this).getRequestParameters() ?:
      emptyMap()

  /**
   * A map of Apache Velocity templates that are applied on the request payload.
   *
   * ```
   * { "application/json": "{ \"statusCode\": 200 }" }
   * ```
   *
   * Default: - No request templates required.
   */
  public fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates() ?:
      emptyMap()

  /**
   * The template selection expression for the integration.
   *
   * Default: - No template selection expression required.
   */
  public fun templateSelectionExpression(): String? = unwrap(this).getTemplateSelectionExpression()

  /**
   * The WebSocket API to which this integration should be bound.
   */
  public fun webSocketApi(): IWebSocketApi

  /**
   * A builder for [WebSocketIntegrationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param credentialsRole Specifies the IAM role required for the integration.
     */
    public fun credentialsRole(credentialsRole: IRole)

    /**
     * @param integrationMethod Specifies the integration's HTTP method type.
     */
    public fun integrationMethod(integrationMethod: String)

    /**
     * @param integrationType Integration type. 
     */
    public fun integrationType(integrationType: WebSocketIntegrationType)

    /**
     * @param integrationUri Integration URI. 
     */
    public fun integrationUri(integrationUri: String)

    /**
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the Content-Type header in the request, and the available mapping templates specified as the
     * requestTemplates property on the Integration resource.
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER.
     */
    public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior)

    /**
     * @param requestParameters The request parameters that API Gateway sends with the backend
     * request.
     * Specify request parameters as key-value pairs (string-to-string
     * mappings), with a destination as the key and a source as the value.
     */
    public fun requestParameters(requestParameters: Map<String, String>)

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

    /**
     * @param webSocketApi The WebSocket API to which this integration should be bound. 
     */
    public fun webSocketApi(webSocketApi: IWebSocketApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationProps.builder()

    /**
     * @param credentialsRole Specifies the IAM role required for the integration.
     */
    override fun credentialsRole(credentialsRole: IRole) {
      cdkBuilder.credentialsRole(credentialsRole.let(IRole::unwrap))
    }

    /**
     * @param integrationMethod Specifies the integration's HTTP method type.
     */
    override fun integrationMethod(integrationMethod: String) {
      cdkBuilder.integrationMethod(integrationMethod)
    }

    /**
     * @param integrationType Integration type. 
     */
    override fun integrationType(integrationType: WebSocketIntegrationType) {
      cdkBuilder.integrationType(integrationType.let(WebSocketIntegrationType::unwrap))
    }

    /**
     * @param integrationUri Integration URI. 
     */
    override fun integrationUri(integrationUri: String) {
      cdkBuilder.integrationUri(integrationUri)
    }

    /**
     * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
     * the Content-Type header in the request, and the available mapping templates specified as the
     * requestTemplates property on the Integration resource.
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER.
     */
    override fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
      cdkBuilder.passthroughBehavior(passthroughBehavior.let(PassthroughBehavior::unwrap))
    }

    /**
     * @param requestParameters The request parameters that API Gateway sends with the backend
     * request.
     * Specify request parameters as key-value pairs (string-to-string
     * mappings), with a destination as the key and a source as the value.
     */
    override fun requestParameters(requestParameters: Map<String, String>) {
      cdkBuilder.requestParameters(requestParameters)
    }

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

    /**
     * @param webSocketApi The WebSocket API to which this integration should be bound. 
     */
    override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationProps,
  ) : CdkObject(cdkObject), WebSocketIntegrationProps {
    /**
     * Specifies the IAM role required for the integration.
     *
     * Default: - No IAM role required.
     */
    override fun credentialsRole(): IRole? = unwrap(this).getCredentialsRole()?.let(IRole::wrap)

    /**
     * Specifies the integration's HTTP method type.
     *
     * Default: - No HTTP method required.
     */
    override fun integrationMethod(): String? = unwrap(this).getIntegrationMethod()

    /**
     * Integration type.
     */
    override fun integrationType(): WebSocketIntegrationType =
        unwrap(this).getIntegrationType().let(WebSocketIntegrationType::wrap)

    /**
     * Integration URI.
     */
    override fun integrationUri(): String = unwrap(this).getIntegrationUri()

    /**
     * Specifies the pass-through behavior for incoming requests based on the Content-Type header in
     * the request, and the available mapping templates specified as the requestTemplates property on
     * the Integration resource.
     *
     * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
     * NEVER.
     *
     * Default: - No passthrough behavior required.
     */
    override fun passthroughBehavior(): PassthroughBehavior? =
        unwrap(this).getPassthroughBehavior()?.let(PassthroughBehavior::wrap)

    /**
     * The request parameters that API Gateway sends with the backend request.
     *
     * Specify request parameters as key-value pairs (string-to-string
     * mappings), with a destination as the key and a source as the value.
     *
     * Default: - No request parameters required.
     */
    override fun requestParameters(): Map<String, String> = unwrap(this).getRequestParameters() ?:
        emptyMap()

    /**
     * A map of Apache Velocity templates that are applied on the request payload.
     *
     * ```
     * { "application/json": "{ \"statusCode\": 200 }" }
     * ```
     *
     * Default: - No request templates required.
     */
    override fun requestTemplates(): Map<String, String> = unwrap(this).getRequestTemplates() ?:
        emptyMap()

    /**
     * The template selection expression for the integration.
     *
     * Default: - No template selection expression required.
     */
    override fun templateSelectionExpression(): String? =
        unwrap(this).getTemplateSelectionExpression()

    /**
     * The WebSocket API to which this integration should be bound.
     */
    override fun webSocketApi(): IWebSocketApi =
        unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationProps):
        WebSocketIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketIntegrationProps):
        software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketIntegrationProps
  }
}
