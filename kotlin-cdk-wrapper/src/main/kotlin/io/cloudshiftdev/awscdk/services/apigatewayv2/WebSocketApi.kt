@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class WebSocketApi internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApi,
) : Resource(cdkObject), IWebSocketApi, IApi {
  public open fun addRoute(routeKey: String, options: WebSocketRouteOptions): WebSocketRoute =
      unwrap(this).addRoute(routeKey,
      options.let(WebSocketRouteOptions::unwrap)).let(WebSocketRoute::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d26c729411b7fb1025a8b6f57f6ce22ab29a4b7acfd980c4b4759f87d57df55")
  public open fun addRoute(routeKey: String, options: WebSocketRouteOptions.Builder.() -> Unit):
      WebSocketRoute = addRoute(routeKey, WebSocketRouteOptions(options))

  public override fun apiEndpoint(): String = unwrap(this).getApiEndpoint()

  public override fun apiId(): String = unwrap(this).getApiId()

  public open fun arnForExecuteApi(): String = unwrap(this).arnForExecuteApi()

  public open fun arnForExecuteApi(method: String): String = unwrap(this).arnForExecuteApi(method)

  public open fun arnForExecuteApi(method: String, path: String): String =
      unwrap(this).arnForExecuteApi(method, path)

  public open fun arnForExecuteApi(
    method: String,
    path: String,
    stage: String,
  ): String = unwrap(this).arnForExecuteApi(method, path, stage)

  public open fun grantManageConnections(identity: IGrantable): Grant =
      unwrap(this).grantManageConnections(identity.let(IGrantable::unwrap)).let(Grant::wrap)

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public open fun webSocketApiName(): String? = unwrap(this).getWebSocketApiName()

  @CdkDslMarker
  public interface Builder {
    public
        fun apiKeySelectionExpression(apiKeySelectionExpression: WebSocketApiKeySelectionExpression)

    public fun apiName(apiName: String)

    public fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c8481261f0d0b5b22f2484e1bf6df92e016beb803127615edc0bb99ffab26dd")
    public fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit)

    public fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("658fb1801d4908fefb4409e8a8144733a7a2b9c1a89b30c10509c532847209c1")
    public fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions.Builder.() -> Unit)

    public fun description(description: String)

    public fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dc1e815caf975e336a52d5223f2005704be9555aa0dce37203039ecdd5b08fa")
    public
        fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit)

    public fun routeSelectionExpression(routeSelectionExpression: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketApi.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketApi.Builder.create(scope, id)

    override
        fun apiKeySelectionExpression(apiKeySelectionExpression: WebSocketApiKeySelectionExpression) {
      cdkBuilder.apiKeySelectionExpression(apiKeySelectionExpression.let(WebSocketApiKeySelectionExpression::unwrap))
    }

    override fun apiName(apiName: String) {
      cdkBuilder.apiName(apiName)
    }

    override fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions) {
      cdkBuilder.connectRouteOptions(connectRouteOptions.let(WebSocketRouteOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6c8481261f0d0b5b22f2484e1bf6df92e016beb803127615edc0bb99ffab26dd")
    override fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit):
        Unit = connectRouteOptions(WebSocketRouteOptions(connectRouteOptions))

    override fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions) {
      cdkBuilder.defaultRouteOptions(defaultRouteOptions.let(WebSocketRouteOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("658fb1801d4908fefb4409e8a8144733a7a2b9c1a89b30c10509c532847209c1")
    override fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions.Builder.() -> Unit):
        Unit = defaultRouteOptions(WebSocketRouteOptions(defaultRouteOptions))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions) {
      cdkBuilder.disconnectRouteOptions(disconnectRouteOptions.let(WebSocketRouteOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1dc1e815caf975e336a52d5223f2005704be9555aa0dce37203039ecdd5b08fa")
    override
        fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit):
        Unit = disconnectRouteOptions(WebSocketRouteOptions(disconnectRouteOptions))

    override fun routeSelectionExpression(routeSelectionExpression: String) {
      cdkBuilder.routeSelectionExpression(routeSelectionExpression)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketApi =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromWebSocketApiAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: WebSocketApiAttributes,
    ): IWebSocketApi =
        software.amazon.awscdk.services.apigatewayv2.WebSocketApi.fromWebSocketApiAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(WebSocketApiAttributes::unwrap)).let(IWebSocketApi::wrap)

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
        software.amazon.awscdk.services.apigatewayv2.WebSocketApi = wrapped.cdkObject
  }
}
