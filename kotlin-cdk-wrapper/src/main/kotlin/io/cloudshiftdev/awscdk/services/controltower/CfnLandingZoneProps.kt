@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.controltower

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLandingZoneProps {
  public fun manifest(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun version(): String

  @CdkDslMarker
  public interface Builder {
    public fun manifest(manifest: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.controltower.CfnLandingZoneProps.Builder
        = software.amazon.awscdk.services.controltower.CfnLandingZoneProps.builder()

    override fun manifest(manifest: Any) {
      cdkBuilder.manifest(manifest)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.controltower.CfnLandingZoneProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.controltower.CfnLandingZoneProps,
  ) : CdkObject(cdkObject), CfnLandingZoneProps {
    override fun manifest(): Any = unwrap(this).getManifest()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun version(): String = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLandingZoneProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.controltower.CfnLandingZoneProps):
        CfnLandingZoneProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLandingZoneProps):
        software.amazon.awscdk.services.controltower.CfnLandingZoneProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.controltower.CfnLandingZoneProps
  }
}
