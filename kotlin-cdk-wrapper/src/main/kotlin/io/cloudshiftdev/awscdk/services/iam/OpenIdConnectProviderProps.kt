@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface OpenIdConnectProviderProps {
  public fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

  public fun thumbprints(): List<String> = unwrap(this).getThumbprints() ?: emptyList()

  public fun url(): String

  @CdkDslMarker
  public interface Builder {
    public fun clientIds(clientIds: List<String>)

    public fun clientIds(vararg clientIds: String)

    public fun thumbprints(thumbprints: List<String>)

    public fun thumbprints(vararg thumbprints: String)

    public fun url(url: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.OpenIdConnectProviderProps.Builder =
        software.amazon.awscdk.services.iam.OpenIdConnectProviderProps.builder()

    override fun clientIds(clientIds: List<String>) {
      cdkBuilder.clientIds(clientIds)
    }

    override fun clientIds(vararg clientIds: String): Unit = clientIds(clientIds.toList())

    override fun thumbprints(thumbprints: List<String>) {
      cdkBuilder.thumbprints(thumbprints)
    }

    override fun thumbprints(vararg thumbprints: String): Unit = thumbprints(thumbprints.toList())

    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.iam.OpenIdConnectProviderProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.OpenIdConnectProviderProps,
  ) : CdkObject(cdkObject), OpenIdConnectProviderProps {
    override fun clientIds(): List<String> = unwrap(this).getClientIds() ?: emptyList()

    override fun thumbprints(): List<String> = unwrap(this).getThumbprints() ?: emptyList()

    override fun url(): String = unwrap(this).getUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OpenIdConnectProviderProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.OpenIdConnectProviderProps):
        OpenIdConnectProviderProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OpenIdConnectProviderProps):
        software.amazon.awscdk.services.iam.OpenIdConnectProviderProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iam.OpenIdConnectProviderProps
  }
}
