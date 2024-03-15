@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface HttpApiAttributes {
  public fun apiEndpoint(): String? = unwrap(this).getApiEndpoint()

  public fun httpApiId(): String

  @CdkDslMarker
  public interface Builder {
    public fun apiEndpoint(apiEndpoint: String)

    public fun httpApiId(httpApiId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes.builder()

    override fun apiEndpoint(apiEndpoint: String) {
      cdkBuilder.apiEndpoint(apiEndpoint)
    }

    override fun httpApiId(httpApiId: String) {
      cdkBuilder.httpApiId(httpApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes,
  ) : CdkObject(cdkObject), HttpApiAttributes {
    override fun apiEndpoint(): String? = unwrap(this).getApiEndpoint()

    override fun httpApiId(): String = unwrap(this).getHttpApiId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpApiAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes):
        HttpApiAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpApiAttributes):
        software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigatewayv2.HttpApiAttributes
  }
}
