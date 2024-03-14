package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String
import kotlin.Unit

public interface WebSocketStageAttributes : StageAttributes {
  public fun api(): IWebSocketApi

  public interface Builder {
    public fun api(api: IWebSocketApi) {
    }

    public fun stageName(stageName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes.builder()

    public override fun api(api: IWebSocketApi) {
      cdkBuilder.api(api.let(IWebSocketApi::unwrap))
    }

    public override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes,
  ) : WebSocketStageAttributes {
    public override fun api(): IWebSocketApi = unwrap(this).getApi().let(IWebSocketApi::wrap)

    public override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketStageAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes):
        WebSocketStageAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketStageAttributes):
        software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
