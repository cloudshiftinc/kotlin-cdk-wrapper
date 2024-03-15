@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface HttpAuthorizerAttributes {
  public fun authorizerId(): String

  public fun authorizerType(): String

  @CdkDslMarker
  public interface Builder {
    public fun authorizerId(authorizerId: String)

    public fun authorizerType(authorizerType: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes.builder()

    override fun authorizerId(authorizerId: String) {
      cdkBuilder.authorizerId(authorizerId)
    }

    override fun authorizerType(authorizerType: String) {
      cdkBuilder.authorizerType(authorizerType)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes,
  ) : CdkObject(cdkObject), HttpAuthorizerAttributes {
    override fun authorizerId(): String = unwrap(this).getAuthorizerId()

    override fun authorizerType(): String = unwrap(this).getAuthorizerType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HttpAuthorizerAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes):
        HttpAuthorizerAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: HttpAuthorizerAttributes):
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.HttpAuthorizerAttributes
  }
}
