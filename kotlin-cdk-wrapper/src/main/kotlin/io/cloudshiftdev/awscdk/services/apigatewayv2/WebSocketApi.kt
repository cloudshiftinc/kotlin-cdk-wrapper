@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a new API Gateway WebSocket API endpoint.
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
public open class WebSocketApi(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApi,
) : Resource(cdkObject),
    IWebSocketApi,
    IApi {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.apigatewayv2.WebSocketApi(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WebSocketApiProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.WebSocketApi(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(WebSocketApiProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: WebSocketApiProps.Builder.() -> Unit,
  ) : this(scope, id, WebSocketApiProps(props)
  )

  /**
   * Add a new route.
   *
   * @param routeKey 
   * @param options 
   */
  public open fun addRoute(routeKey: String, options: WebSocketRouteOptions): WebSocketRoute =
      unwrap(this).addRoute(routeKey,
      options.let(WebSocketRouteOptions.Companion::unwrap)).let(WebSocketRoute::wrap)

  /**
   * Add a new route.
   *
   * @param routeKey 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d26c729411b7fb1025a8b6f57f6ce22ab29a4b7acfd980c4b4759f87d57df55")
  public open fun addRoute(routeKey: String, options: WebSocketRouteOptions.Builder.() -> Unit):
      WebSocketRoute = addRoute(routeKey, WebSocketRouteOptions(options))

  /**
   * The default endpoint for an API.
   */
  public override fun apiEndpoint(): String = unwrap(this).getApiEndpoint()

  /**
   * The identifier of this API Gateway API.
   */
  public override fun apiId(): String = unwrap(this).getApiId()

  /**
   * (deprecated) Get the "execute-api" ARN.
   *
   * @deprecated Use `arnForExecuteApiV2()` instead.
   * @param method
   * @param path
   * @param stage
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun arnForExecuteApi(): String = unwrap(this).arnForExecuteApi()

  /**
   * (deprecated) Get the "execute-api" ARN.
   *
   * @deprecated Use `arnForExecuteApiV2()` instead.
   * @param method
   * @param path
   * @param stage
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun arnForExecuteApi(method: String): String = unwrap(this).arnForExecuteApi(method)

  /**
   * (deprecated) Get the "execute-api" ARN.
   *
   * @deprecated Use `arnForExecuteApiV2()` instead.
   * @param method
   * @param path
   * @param stage
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun arnForExecuteApi(method: String, path: String): String =
      unwrap(this).arnForExecuteApi(method, path)

  /**
   * (deprecated) Get the "execute-api" ARN.
   *
   * @deprecated Use `arnForExecuteApiV2()` instead.
   * @param method
   * @param path
   * @param stage
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun arnForExecuteApi(
    method: String,
    path: String,
    stage: String,
  ): String = unwrap(this).arnForExecuteApi(method, path, stage)

  /**
   * Get the "execute-api" ARN.
   *
   * Default: - The default behavior applies when no specific route, or stage is provided.
   * In this case, the ARN will cover all routes, and all stages of this API.
   * Specifically, if 'route' is not specified, it defaults to '*', representing all routes.
   * If 'stage' is not specified, it also defaults to '*', representing all stages.
   *
   * @param route
   * @param stage
   */
  public open fun arnForExecuteApiV2(): String = unwrap(this).arnForExecuteApiV2()

  /**
   * Get the "execute-api" ARN.
   *
   * Default: - The default behavior applies when no specific route, or stage is provided.
   * In this case, the ARN will cover all routes, and all stages of this API.
   * Specifically, if 'route' is not specified, it defaults to '*', representing all routes.
   * If 'stage' is not specified, it also defaults to '*', representing all stages.
   *
   * @param route
   * @param stage
   */
  public open fun arnForExecuteApiV2(route: String): String = unwrap(this).arnForExecuteApiV2(route)

  /**
   * Get the "execute-api" ARN.
   *
   * Default: - The default behavior applies when no specific route, or stage is provided.
   * In this case, the ARN will cover all routes, and all stages of this API.
   * Specifically, if 'route' is not specified, it defaults to '*', representing all routes.
   * If 'stage' is not specified, it also defaults to '*', representing all stages.
   *
   * @param route
   * @param stage
   */
  public open fun arnForExecuteApiV2(route: String, stage: String): String =
      unwrap(this).arnForExecuteApiV2(route, stage)

  /**
   * Grant access to the API Gateway management API for this WebSocket API to an IAM principal
   * (Role/Group/User).
   *
   * @param identity The principal. 
   */
  public open fun grantManageConnections(identity: IGrantable): Grant =
      unwrap(this).grantManageConnections(identity.let(IGrantable.Companion::unwrap)).let(Grant::wrap)

  /**
   * Return the given named metric for this Api Gateway.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this Api Gateway.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions.Companion::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this Api Gateway.
   *
   * @param metricName 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * A human friendly name for this WebSocket API.
   *
   * Note that this is different from `webSocketApiId`.
   */
  public open fun webSocketApiName(): String? = unwrap(this).getWebSocketApiName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.WebSocketApi].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An API key selection expression.
     *
     * Providing this option will require an API Key be provided to access the API.
     *
     * Default: - Key is not required to access these APIs
     *
     * @param apiKeySelectionExpression An API key selection expression. 
     */
    public
        fun apiKeySelectionExpression(apiKeySelectionExpression: WebSocketApiKeySelectionExpression)

    /**
     * Name for the WebSocket API resource.
     *
     * Default: - id of the WebSocketApi construct.
     *
     * @param apiName Name for the WebSocket API resource. 
     */
    public fun apiName(apiName: String)

    /**
     * Options to configure a '$connect' route.
     *
     * Default: - no '$connect' route configured
     *
     * @param connectRouteOptions Options to configure a '$connect' route. 
     */
    public fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions)

    /**
     * Options to configure a '$connect' route.
     *
     * Default: - no '$connect' route configured
     *
     * @param connectRouteOptions Options to configure a '$connect' route. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c8481261f0d0b5b22f2484e1bf6df92e016beb803127615edc0bb99ffab26dd")
    public fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit)

    /**
     * Options to configure a '$default' route.
     *
     * Default: - no '$default' route configured
     *
     * @param defaultRouteOptions Options to configure a '$default' route. 
     */
    public fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions)

    /**
     * Options to configure a '$default' route.
     *
     * Default: - no '$default' route configured
     *
     * @param defaultRouteOptions Options to configure a '$default' route. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("658fb1801d4908fefb4409e8a8144733a7a2b9c1a89b30c10509c532847209c1")
    public fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions.Builder.() -> Unit)

    /**
     * The description of the API.
     *
     * Default: - none
     *
     * @param description The description of the API. 
     */
    public fun description(description: String)

    /**
     * Options to configure a '$disconnect' route.
     *
     * Default: - no '$disconnect' route configured
     *
     * @param disconnectRouteOptions Options to configure a '$disconnect' route. 
     */
    public fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions)

    /**
     * Options to configure a '$disconnect' route.
     *
     * Default: - no '$disconnect' route configured
     *
     * @param disconnectRouteOptions Options to configure a '$disconnect' route. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dc1e815caf975e336a52d5223f2005704be9555aa0dce37203039ecdd5b08fa")
    public
        fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit)

    /**
     * The IP address types that can invoke the API.
     *
     * Default: undefined - AWS default is IPV4
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-ip-address-type.html)
     * @param ipAddressType The IP address types that can invoke the API. 
     */
    public fun ipAddressType(ipAddressType: IpAddressType)

    /**
     * The route selection expression for the API.
     *
     * Default: '$request.body.action'
     *
     * @param routeSelectionExpression The route selection expression for the API. 
     */
    public fun routeSelectionExpression(routeSelectionExpression: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketApi.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketApi.Builder.create(scope, id)

    /**
     * An API key selection expression.
     *
     * Providing this option will require an API Key be provided to access the API.
     *
     * Default: - Key is not required to access these APIs
     *
     * @param apiKeySelectionExpression An API key selection expression. 
     */
    override
        fun apiKeySelectionExpression(apiKeySelectionExpression: WebSocketApiKeySelectionExpression) {
      cdkBuilder.apiKeySelectionExpression(apiKeySelectionExpression.let(WebSocketApiKeySelectionExpression.Companion::unwrap))
    }

    /**
     * Name for the WebSocket API resource.
     *
     * Default: - id of the WebSocketApi construct.
     *
     * @param apiName Name for the WebSocket API resource. 
     */
    override fun apiName(apiName: String) {
      cdkBuilder.apiName(apiName)
    }

    /**
     * Options to configure a '$connect' route.
     *
     * Default: - no '$connect' route configured
     *
     * @param connectRouteOptions Options to configure a '$connect' route. 
     */
    override fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions) {
      cdkBuilder.connectRouteOptions(connectRouteOptions.let(WebSocketRouteOptions.Companion::unwrap))
    }

    /**
     * Options to configure a '$connect' route.
     *
     * Default: - no '$connect' route configured
     *
     * @param connectRouteOptions Options to configure a '$connect' route. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c8481261f0d0b5b22f2484e1bf6df92e016beb803127615edc0bb99ffab26dd")
    override fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit):
        Unit = connectRouteOptions(WebSocketRouteOptions(connectRouteOptions))

    /**
     * Options to configure a '$default' route.
     *
     * Default: - no '$default' route configured
     *
     * @param defaultRouteOptions Options to configure a '$default' route. 
     */
    override fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions) {
      cdkBuilder.defaultRouteOptions(defaultRouteOptions.let(WebSocketRouteOptions.Companion::unwrap))
    }

    /**
     * Options to configure a '$default' route.
     *
     * Default: - no '$default' route configured
     *
     * @param defaultRouteOptions Options to configure a '$default' route. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("658fb1801d4908fefb4409e8a8144733a7a2b9c1a89b30c10509c532847209c1")
    override fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions.Builder.() -> Unit):
        Unit = defaultRouteOptions(WebSocketRouteOptions(defaultRouteOptions))

    /**
     * The description of the API.
     *
     * Default: - none
     *
     * @param description The description of the API. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Options to configure a '$disconnect' route.
     *
     * Default: - no '$disconnect' route configured
     *
     * @param disconnectRouteOptions Options to configure a '$disconnect' route. 
     */
    override fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions) {
      cdkBuilder.disconnectRouteOptions(disconnectRouteOptions.let(WebSocketRouteOptions.Companion::unwrap))
    }

    /**
     * Options to configure a '$disconnect' route.
     *
     * Default: - no '$disconnect' route configured
     *
     * @param disconnectRouteOptions Options to configure a '$disconnect' route. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dc1e815caf975e336a52d5223f2005704be9555aa0dce37203039ecdd5b08fa")
    override
        fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit):
        Unit = disconnectRouteOptions(WebSocketRouteOptions(disconnectRouteOptions))

    /**
     * The IP address types that can invoke the API.
     *
     * Default: undefined - AWS default is IPV4
     *
     * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-ip-address-type.html)
     * @param ipAddressType The IP address types that can invoke the API. 
     */
    override fun ipAddressType(ipAddressType: IpAddressType) {
      cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType.Companion::unwrap))
    }

    /**
     * The route selection expression for the API.
     *
     * Default: '$request.body.action'
     *
     * @param routeSelectionExpression The route selection expression for the API. 
     */
    override fun routeSelectionExpression(routeSelectionExpression: String) {
      cdkBuilder.routeSelectionExpression(routeSelectionExpression)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketApi =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.apigatewayv2.WebSocketApi.PROPERTY_INJECTION_ID

    public fun fromWebSocketApiAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: WebSocketApiAttributes,
    ): IWebSocketApi =
        software.amazon.awscdk.services.apigatewayv2.WebSocketApi.fromWebSocketApiAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(WebSocketApiAttributes.Companion::unwrap)).let(IWebSocketApi::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3b4ff8d6a572553fb0ef997552ba49de004a4b3b49f79a1b12b23cfab1c4e7c")
    public fun fromWebSocketApiAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: WebSocketApiAttributes.Builder.() -> Unit,
    ): IWebSocketApi = fromWebSocketApiAttributes(scope, id, WebSocketApiAttributes(attrs))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): WebSocketApi {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return WebSocketApi(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApi):
        WebSocketApi = WebSocketApi(cdkObject)

    internal fun unwrap(wrapped: WebSocketApi):
        software.amazon.awscdk.services.apigatewayv2.WebSocketApi = wrapped.cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketApi
  }
}
