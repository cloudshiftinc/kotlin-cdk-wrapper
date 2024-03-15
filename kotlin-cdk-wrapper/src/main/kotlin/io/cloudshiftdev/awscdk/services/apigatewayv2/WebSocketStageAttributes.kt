@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface WebSocketStageAttributes : StageAttributes {
  public fun api(): IWebSocketApi

  @CdkDslMarker
  public interface Builder {
    public fun api(api: IWebSocketApi)

    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes.builder()

    override fun api(api: IWebSocketApi) {
      cdkBuilder.api(api.let(IWebSocketApi::unwrap))
    }

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes,
  ) : CdkObject(cdkObject), WebSocketStageAttributes {
    override fun api(): IWebSocketApi = unwrap(this).getApi().let(IWebSocketApi::wrap)

    override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketStageAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes):
        WebSocketStageAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketStageAttributes):
        software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes
  }
}
