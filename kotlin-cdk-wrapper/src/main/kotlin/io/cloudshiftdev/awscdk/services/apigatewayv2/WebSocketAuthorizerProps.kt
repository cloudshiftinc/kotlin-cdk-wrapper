@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface WebSocketAuthorizerProps {
  public fun authorizerName(): String? = unwrap(this).getAuthorizerName()

  public fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

  public fun identitySource(): List<String>

  public fun type(): WebSocketAuthorizerType

  public fun webSocketApi(): IWebSocketApi

  @CdkDslMarker
  public interface Builder {
    public fun authorizerName(authorizerName: String)

    public fun authorizerUri(authorizerUri: String)

    public fun identitySource(identitySource: List<String>)

    public fun identitySource(vararg identitySource: String)

    public fun type(type: WebSocketAuthorizerType)

    public fun webSocketApi(webSocketApi: IWebSocketApi)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps.builder()

    override fun authorizerName(authorizerName: String) {
      cdkBuilder.authorizerName(authorizerName)
    }

    override fun authorizerUri(authorizerUri: String) {
      cdkBuilder.authorizerUri(authorizerUri)
    }

    override fun identitySource(identitySource: List<String>) {
      cdkBuilder.identitySource(identitySource)
    }

    override fun identitySource(vararg identitySource: String): Unit =
        identitySource(identitySource.toList())

    override fun type(type: WebSocketAuthorizerType) {
      cdkBuilder.type(type.let(WebSocketAuthorizerType::unwrap))
    }

    override fun webSocketApi(webSocketApi: IWebSocketApi) {
      cdkBuilder.webSocketApi(webSocketApi.let(IWebSocketApi::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps,
  ) : CdkObject(cdkObject), WebSocketAuthorizerProps {
    override fun authorizerName(): String? = unwrap(this).getAuthorizerName()

    override fun authorizerUri(): String? = unwrap(this).getAuthorizerUri()

    override fun identitySource(): List<String> = unwrap(this).getIdentitySource()

    override fun type(): WebSocketAuthorizerType =
        unwrap(this).getType().let(WebSocketAuthorizerType::wrap)

    override fun webSocketApi(): IWebSocketApi =
        unwrap(this).getWebSocketApi().let(IWebSocketApi::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketAuthorizerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps):
        WebSocketAuthorizerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketAuthorizerProps):
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerProps
  }
}
