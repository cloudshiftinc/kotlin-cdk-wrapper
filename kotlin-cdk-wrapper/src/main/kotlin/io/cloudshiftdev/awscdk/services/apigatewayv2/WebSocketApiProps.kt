@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Props for WebSocket API.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer;
 * import io.cloudshiftdev.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
 * // This function handles your auth logic
 * Function authHandler;
 * // This function handles your WebSocket requests
 * Function handler;
 * WebSocketLambdaAuthorizer authorizer = new WebSocketLambdaAuthorizer("Authorizer", authHandler);
 * WebSocketLambdaIntegration integration = new WebSocketLambdaIntegration("Integration", handler);
 * WebSocketApi.Builder.create(this, "WebSocketApi")
 * .connectRouteOptions(WebSocketRouteOptions.builder()
 * .integration(integration)
 * .authorizer(authorizer)
 * .build())
 * .build();
 * ```
 */
public interface WebSocketApiProps {
  /**
   * An API key selection expression.
   *
   * Providing this option will require an API Key be provided to access the API.
   *
   * Default: - Key is not required to access these APIs
   */
  public fun apiKeySelectionExpression(): WebSocketApiKeySelectionExpression? =
      unwrap(this).getApiKeySelectionExpression()?.let(WebSocketApiKeySelectionExpression::wrap)

  /**
   * Name for the WebSocket API resource.
   *
   * Default: - id of the WebSocketApi construct.
   */
  public fun apiName(): String? = unwrap(this).getApiName()

  /**
   * Options to configure a '$connect' route.
   *
   * Default: - no '$connect' route configured
   */
  public fun connectRouteOptions(): WebSocketRouteOptions? =
      unwrap(this).getConnectRouteOptions()?.let(WebSocketRouteOptions::wrap)

  /**
   * Options to configure a '$default' route.
   *
   * Default: - no '$default' route configured
   */
  public fun defaultRouteOptions(): WebSocketRouteOptions? =
      unwrap(this).getDefaultRouteOptions()?.let(WebSocketRouteOptions::wrap)

  /**
   * The description of the API.
   *
   * Default: - none
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Options to configure a '$disconnect' route.
   *
   * Default: - no '$disconnect' route configured
   */
  public fun disconnectRouteOptions(): WebSocketRouteOptions? =
      unwrap(this).getDisconnectRouteOptions()?.let(WebSocketRouteOptions::wrap)

  /**
   * The route selection expression for the API.
   *
   * Default: '$request.body.action'
   */
  public fun routeSelectionExpression(): String? = unwrap(this).getRouteSelectionExpression()

  /**
   * A builder for [WebSocketApiProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKeySelectionExpression An API key selection expression.
     * Providing this option will require an API Key be provided to access the API.
     */
    public
        fun apiKeySelectionExpression(apiKeySelectionExpression: WebSocketApiKeySelectionExpression)

    /**
     * @param apiName Name for the WebSocket API resource.
     */
    public fun apiName(apiName: String)

    /**
     * @param connectRouteOptions Options to configure a '$connect' route.
     */
    public fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions)

    /**
     * @param connectRouteOptions Options to configure a '$connect' route.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3870ba1d0eed5728cd54d4d4cee16f2eaa72163ea723885a2c5c9111c02382cb")
    public fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit)

    /**
     * @param defaultRouteOptions Options to configure a '$default' route.
     */
    public fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions)

    /**
     * @param defaultRouteOptions Options to configure a '$default' route.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25e9d49b261bb2b6c31763e154e2bee87b852b8a18b6c0e1b5e0550a8cd5779d")
    public fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions.Builder.() -> Unit)

    /**
     * @param description The description of the API.
     */
    public fun description(description: String)

    /**
     * @param disconnectRouteOptions Options to configure a '$disconnect' route.
     */
    public fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions)

    /**
     * @param disconnectRouteOptions Options to configure a '$disconnect' route.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("651268f75dbfc984cc8c8060b4b193d89f410cabcd165f98e02f14e1a74b981b")
    public
        fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit)

    /**
     * @param routeSelectionExpression The route selection expression for the API.
     */
    public fun routeSelectionExpression(routeSelectionExpression: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps.builder()

    /**
     * @param apiKeySelectionExpression An API key selection expression.
     * Providing this option will require an API Key be provided to access the API.
     */
    override
        fun apiKeySelectionExpression(apiKeySelectionExpression: WebSocketApiKeySelectionExpression) {
      cdkBuilder.apiKeySelectionExpression(apiKeySelectionExpression.let(WebSocketApiKeySelectionExpression.Companion::unwrap))
    }

    /**
     * @param apiName Name for the WebSocket API resource.
     */
    override fun apiName(apiName: String) {
      cdkBuilder.apiName(apiName)
    }

    /**
     * @param connectRouteOptions Options to configure a '$connect' route.
     */
    override fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions) {
      cdkBuilder.connectRouteOptions(connectRouteOptions.let(WebSocketRouteOptions.Companion::unwrap))
    }

    /**
     * @param connectRouteOptions Options to configure a '$connect' route.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3870ba1d0eed5728cd54d4d4cee16f2eaa72163ea723885a2c5c9111c02382cb")
    override fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit):
        Unit = connectRouteOptions(WebSocketRouteOptions(connectRouteOptions))

    /**
     * @param defaultRouteOptions Options to configure a '$default' route.
     */
    override fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions) {
      cdkBuilder.defaultRouteOptions(defaultRouteOptions.let(WebSocketRouteOptions.Companion::unwrap))
    }

    /**
     * @param defaultRouteOptions Options to configure a '$default' route.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25e9d49b261bb2b6c31763e154e2bee87b852b8a18b6c0e1b5e0550a8cd5779d")
    override fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions.Builder.() -> Unit):
        Unit = defaultRouteOptions(WebSocketRouteOptions(defaultRouteOptions))

    /**
     * @param description The description of the API.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param disconnectRouteOptions Options to configure a '$disconnect' route.
     */
    override fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions) {
      cdkBuilder.disconnectRouteOptions(disconnectRouteOptions.let(WebSocketRouteOptions.Companion::unwrap))
    }

    /**
     * @param disconnectRouteOptions Options to configure a '$disconnect' route.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("651268f75dbfc984cc8c8060b4b193d89f410cabcd165f98e02f14e1a74b981b")
    override
        fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit):
        Unit = disconnectRouteOptions(WebSocketRouteOptions(disconnectRouteOptions))

    /**
     * @param routeSelectionExpression The route selection expression for the API.
     */
    override fun routeSelectionExpression(routeSelectionExpression: String) {
      cdkBuilder.routeSelectionExpression(routeSelectionExpression)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps,
  ) : CdkObject(cdkObject),
      WebSocketApiProps {
    /**
     * An API key selection expression.
     *
     * Providing this option will require an API Key be provided to access the API.
     *
     * Default: - Key is not required to access these APIs
     */
    override fun apiKeySelectionExpression(): WebSocketApiKeySelectionExpression? =
        unwrap(this).getApiKeySelectionExpression()?.let(WebSocketApiKeySelectionExpression::wrap)

    /**
     * Name for the WebSocket API resource.
     *
     * Default: - id of the WebSocketApi construct.
     */
    override fun apiName(): String? = unwrap(this).getApiName()

    /**
     * Options to configure a '$connect' route.
     *
     * Default: - no '$connect' route configured
     */
    override fun connectRouteOptions(): WebSocketRouteOptions? =
        unwrap(this).getConnectRouteOptions()?.let(WebSocketRouteOptions::wrap)

    /**
     * Options to configure a '$default' route.
     *
     * Default: - no '$default' route configured
     */
    override fun defaultRouteOptions(): WebSocketRouteOptions? =
        unwrap(this).getDefaultRouteOptions()?.let(WebSocketRouteOptions::wrap)

    /**
     * The description of the API.
     *
     * Default: - none
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Options to configure a '$disconnect' route.
     *
     * Default: - no '$disconnect' route configured
     */
    override fun disconnectRouteOptions(): WebSocketRouteOptions? =
        unwrap(this).getDisconnectRouteOptions()?.let(WebSocketRouteOptions::wrap)

    /**
     * The route selection expression for the API.
     *
     * Default: '$request.body.action'
     */
    override fun routeSelectionExpression(): String? = unwrap(this).getRouteSelectionExpression()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps):
        WebSocketApiProps = CdkObjectWrappers.wrap(cdkObject) as? WebSocketApiProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketApiProps):
        software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps
  }
}
