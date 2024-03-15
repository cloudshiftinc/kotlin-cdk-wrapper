@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface OpenIdConnectProviderProps {
  public fun url(): String

  @CdkDslMarker
  public interface Builder {
    public fun url(url: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.OpenIdConnectProviderProps.Builder =
        software.amazon.awscdk.services.eks.OpenIdConnectProviderProps.builder()

    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.eks.OpenIdConnectProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.OpenIdConnectProviderProps,
  ) : CdkObject(cdkObject), OpenIdConnectProviderProps {
    override fun url(): String = unwrap(this).getUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OpenIdConnectProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.OpenIdConnectProviderProps):
        OpenIdConnectProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OpenIdConnectProviderProps):
        software.amazon.awscdk.services.eks.OpenIdConnectProviderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.OpenIdConnectProviderProps
  }
}
