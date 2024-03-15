@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface HttpStageAttributes : StageAttributes {
  public fun api(): IHttpApi

  @CdkDslMarker
  public interface Builder {
    public fun api(api: IHttpApi)

    public fun stageName(stageName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes.Builder
        = software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes.builder()

    override fun api(api: IHttpApi) {
      cdkBuilder.api(api.let(IHttpApi::unwrap))
    }

    override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigatewayv2.HttpStageAttributes,
  ) : CdkObject(cdkObject), HttpStageAttributes {
    override fun api(): IHttpApi = unwrap(this).getApi().let(IHttpApi::wrap)

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
