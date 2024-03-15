@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPlaybackKeyPairProps {
  public fun name(): String? = unwrap(this).getName()

  public fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun name(name: String)

    public fun publicKeyMaterial(publicKeyMaterial: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps.Builder =
        software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun publicKeyMaterial(publicKeyMaterial: String) {
      cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps,
  ) : CdkObject(cdkObject), CfnPlaybackKeyPairProps {
    override fun name(): String? = unwrap(this).getName()

    override fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPlaybackKeyPairProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps):
        CfnPlaybackKeyPairProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPlaybackKeyPairProps):
        software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ivs.CfnPlaybackKeyPairProps
  }
}
