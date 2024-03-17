@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The attributes used to import existing WebSocketStage.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * WebSocketApi webSocketApi;
 * WebSocketStageAttributes webSocketStageAttributes = WebSocketStageAttributes.builder()
 * .api(webSocketApi)
 * .stageName("stageName")
 * .build();
 * ```
 */
public interface WebSocketStageAttributes : StageAttributes {
  /**
   * The API to which this stage is associated.
   */
  public fun api(): IWebSocketApi

  /**
   * A builder for [WebSocketStageAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API to which this stage is associated. 
     */
    public fun api(api: IWebSocketApi)

    /**
     * @param stageName The name of the stage. 
     */
    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes.builder()

    /**
     * @param api The API to which this stage is associated. 
     */
    override fun api(api: IWebSocketApi) {
      cdkBuilder.api(api.let(IWebSocketApi::unwrap))
    }

    /**
     * @param stageName The name of the stage. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes,
  ) : CdkObject(cdkObject), WebSocketStageAttributes {
    /**
     * The API to which this stage is associated.
     */
    override fun api(): IWebSocketApi = unwrap(this).getApi().let(IWebSocketApi::wrap)

    /**
     * The name of the stage.
     */
    override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WebSocketStageAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes):
        WebSocketStageAttributes = CdkObjectWrappers.wrap(cdkObject) as? WebSocketStageAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: WebSocketStageAttributes):
        software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.WebSocketStageAttributes
  }
}
