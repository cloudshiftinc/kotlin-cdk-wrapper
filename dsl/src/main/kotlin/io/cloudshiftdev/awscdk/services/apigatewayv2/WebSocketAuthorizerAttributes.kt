package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String
import kotlin.Unit

public interface WebSocketAuthorizerAttributes {
  public fun authorizerId(): String

  public fun authorizerType(): String

  public interface Builder {
    public fun authorizerId(authorizerId: String)

    public fun authorizerType(authorizerType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes.builder()

    override fun authorizerId(authorizerId: String) {
      cdkBuilder.authorizerId(authorizerId)
    }

    override fun authorizerType(authorizerType: String) {
      cdkBuilder.authorizerType(authorizerType)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes,
  ) : WebSocketAuthorizerAttributes {
    override fun authorizerId(): String = unwrap(this).getAuthorizerId()

    override fun authorizerType(): String = unwrap(this).getAuthorizerType()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketAuthorizerAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes):
        WebSocketAuthorizerAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketAuthorizerAttributes):
        software.amazon.awscdk.services.apigatewayv2.WebSocketAuthorizerAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
