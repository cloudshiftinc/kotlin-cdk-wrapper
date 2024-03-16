@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The attributes used to import existing ApiMapping.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * ApiMappingAttributes apiMappingAttributes = ApiMappingAttributes.builder()
 * .apiMappingId("apiMappingId")
 * .build();
 * ```
 */
public interface ApiMappingAttributes {
  /**
   * The API mapping ID.
   */
  public fun apiMappingId(): String

  /**
   * A builder for [ApiMappingAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiMappingId The API mapping ID. 
     */
    public fun apiMappingId(apiMappingId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes.builder()

    /**
     * @param apiMappingId The API mapping ID. 
     */
    override fun apiMappingId(apiMappingId: String) {
      cdkBuilder.apiMappingId(apiMappingId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes,
  ) : CdkObject(cdkObject), ApiMappingAttributes {
    /**
     * The API mapping ID.
     */
    override fun apiMappingId(): String = unwrap(this).getApiMappingId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiMappingAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes):
        ApiMappingAttributes = CdkObjectWrappers.wrap(cdkObject) as ApiMappingAttributes

    internal fun unwrap(wrapped: ApiMappingAttributes):
        software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes
  }
}
