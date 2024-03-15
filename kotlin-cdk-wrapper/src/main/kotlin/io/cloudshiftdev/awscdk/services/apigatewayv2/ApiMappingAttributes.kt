@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ApiMappingAttributes {
  public fun apiMappingId(): String

  @CdkDslMarker
  public interface Builder {
    public fun apiMappingId(apiMappingId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes.builder()

    override fun apiMappingId(apiMappingId: String) {
      cdkBuilder.apiMappingId(apiMappingId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes,
  ) : CdkObject(cdkObject), ApiMappingAttributes {
    override fun apiMappingId(): String = unwrap(this).getApiMappingId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiMappingAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes):
        ApiMappingAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiMappingAttributes):
        software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.ApiMappingAttributes
  }
}
