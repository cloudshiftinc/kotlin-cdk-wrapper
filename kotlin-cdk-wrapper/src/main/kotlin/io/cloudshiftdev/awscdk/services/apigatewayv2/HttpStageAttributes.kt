@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * The attributes used to import existing HttpStage.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * HttpApi httpApi;
 * HttpStageAttributes httpStageAttributes = HttpStageAttributes.builder()
 * .api(httpApi)
 * .stageName("stageName")
 * .build();
 * ```
 */
public interface HttpStageAttributes : StageAttributes {
  /**
   * The API to which this stage is associated.
   */
  public fun api(): IHttpApi

  /**
   * A builder for [HttpStageAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param api The API to which this stage is associated. 
     */
    public fun api(api: IHttpApi)

    /**
     * @param stageName The name of the stage. 
     */
    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes.Builder
        = software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes.builder()

    /**
     * @param api The API to which this stage is associated. 
     */
    override fun api(api: IHttpApi) {
      cdkBuilder.api(api.let(IHttpApi::unwrap))
    }

    /**
     * @param stageName The name of the stage. 
     */
    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes,
  ) : CdkObject(cdkObject), HttpStageAttributes {
    /**
     * The API to which this stage is associated.
     */
    override fun api(): IHttpApi = unwrap(this).getApi().let(IHttpApi::wrap)

    /**
     * The name of the stage.
     */
    override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpStageAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes):
        HttpStageAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpStageAttributes):
        software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes
  }
}
