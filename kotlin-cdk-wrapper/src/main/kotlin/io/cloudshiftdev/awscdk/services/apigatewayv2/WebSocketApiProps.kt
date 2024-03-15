@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface WebSocketApiProps {
  public fun apiKeySelectionExpression(): WebSocketApiKeySelectionExpression? =
      unwrap(this).getApiKeySelectionExpression()?.let(WebSocketApiKeySelectionExpression::wrap)

  public fun apiName(): String? = unwrap(this).getApiName()

  public fun connectRouteOptions(): WebSocketRouteOptions? =
      unwrap(this).getConnectRouteOptions()?.let(WebSocketRouteOptions::wrap)

  public fun defaultRouteOptions(): WebSocketRouteOptions? =
      unwrap(this).getDefaultRouteOptions()?.let(WebSocketRouteOptions::wrap)

  public fun description(): String? = unwrap(this).getDescription()

  public fun disconnectRouteOptions(): WebSocketRouteOptions? =
      unwrap(this).getDisconnectRouteOptions()?.let(WebSocketRouteOptions::wrap)

  public fun routeSelectionExpression(): String? = unwrap(this).getRouteSelectionExpression()

  @CdkDslMarker
  public interface Builder {
    public
        fun apiKeySelectionExpression(apiKeySelectionExpression: WebSocketApiKeySelectionExpression)

    public fun apiName(apiName: String)

    public fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3870ba1d0eed5728cd54d4d4cee16f2eaa72163ea723885a2c5c9111c02382cb")
    public fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit)

    public fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25e9d49b261bb2b6c31763e154e2bee87b852b8a18b6c0e1b5e0550a8cd5779d")
    public fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions.Builder.() -> Unit)

    public fun description(description: String)

    public fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("651268f75dbfc984cc8c8060b4b193d89f410cabcd165f98e02f14e1a74b981b")
    public
        fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit)

    public fun routeSelectionExpression(routeSelectionExpression: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps.builder()

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
    @JvmName("3870ba1d0eed5728cd54d4d4cee16f2eaa72163ea723885a2c5c9111c02382cb")
    override fun connectRouteOptions(connectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit):
        Unit = connectRouteOptions(WebSocketRouteOptions(connectRouteOptions))

    override fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions) {
      cdkBuilder.defaultRouteOptions(defaultRouteOptions.let(WebSocketRouteOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25e9d49b261bb2b6c31763e154e2bee87b852b8a18b6c0e1b5e0550a8cd5779d")
    override fun defaultRouteOptions(defaultRouteOptions: WebSocketRouteOptions.Builder.() -> Unit):
        Unit = defaultRouteOptions(WebSocketRouteOptions(defaultRouteOptions))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions) {
      cdkBuilder.disconnectRouteOptions(disconnectRouteOptions.let(WebSocketRouteOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("651268f75dbfc984cc8c8060b4b193d89f410cabcd165f98e02f14e1a74b981b")
    override
        fun disconnectRouteOptions(disconnectRouteOptions: WebSocketRouteOptions.Builder.() -> Unit):
        Unit = disconnectRouteOptions(WebSocketRouteOptions(disconnectRouteOptions))

    override fun routeSelectionExpression(routeSelectionExpression: String) {
      cdkBuilder.routeSelectionExpression(routeSelectionExpression)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps,
  ) : CdkObject(cdkObject), WebSocketApiProps {
    override fun apiKeySelectionExpression(): WebSocketApiKeySelectionExpression? =
        unwrap(this).getApiKeySelectionExpression()?.let(WebSocketApiKeySelectionExpression::wrap)

    override fun apiName(): String? = unwrap(this).getApiName()

    override fun connectRouteOptions(): WebSocketRouteOptions? =
        unwrap(this).getConnectRouteOptions()?.let(WebSocketRouteOptions::wrap)

    override fun defaultRouteOptions(): WebSocketRouteOptions? =
        unwrap(this).getDefaultRouteOptions()?.let(WebSocketRouteOptions::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun disconnectRouteOptions(): WebSocketRouteOptions? =
        unwrap(this).getDisconnectRouteOptions()?.let(WebSocketRouteOptions::wrap)

    override fun routeSelectionExpression(): String? = unwrap(this).getRouteSelectionExpression()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps):
        WebSocketApiProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketApiProps):
        software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.WebSocketApiProps
  }
}
