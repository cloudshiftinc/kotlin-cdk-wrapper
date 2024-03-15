@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface WebSocketApiAttributes {
  public fun apiEndpoint(): String? = unwrap(this).getApiEndpoint()

  public fun webSocketId(): String

  @CdkDslMarker
  public interface Builder {
    public fun apiEndpoint(apiEndpoint: String)

    public fun webSocketId(webSocketId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes.builder()

    override fun apiEndpoint(apiEndpoint: String) {
      cdkBuilder.apiEndpoint(apiEndpoint)
    }

    override fun webSocketId(webSocketId: String) {
      cdkBuilder.webSocketId(webSocketId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes,
  ) : CdkObject(cdkObject), WebSocketApiAttributes {
    override fun apiEndpoint(): String? = unwrap(this).getApiEndpoint()

    override fun webSocketId(): String = unwrap(this).getWebSocketId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketApiAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes):
        WebSocketApiAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketApiAttributes):
        software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.WebSocketApiAttributes
  }
}
