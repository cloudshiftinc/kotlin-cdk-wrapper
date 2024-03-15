@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediatailor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLiveSourceProps {
  public fun httpPackageConfigurations(): Any

  public fun liveSourceName(): String

  public fun sourceLocationName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun httpPackageConfigurations(httpPackageConfigurations: IResolvable)

    public fun httpPackageConfigurations(httpPackageConfigurations: List<Any>)

    public fun httpPackageConfigurations(vararg httpPackageConfigurations: Any)

    public fun liveSourceName(liveSourceName: String)

    public fun sourceLocationName(sourceLocationName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps.Builder =
        software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps.builder()

    override fun httpPackageConfigurations(httpPackageConfigurations: IResolvable) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations.let(IResolvable::unwrap))
    }

    override fun httpPackageConfigurations(httpPackageConfigurations: List<Any>) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations)
    }

    override fun httpPackageConfigurations(vararg httpPackageConfigurations: Any): Unit =
        httpPackageConfigurations(httpPackageConfigurations.toList())

    override fun liveSourceName(liveSourceName: String) {
      cdkBuilder.liveSourceName(liveSourceName)
    }

    override fun sourceLocationName(sourceLocationName: String) {
      cdkBuilder.sourceLocationName(sourceLocationName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps,
  ) : CdkObject(cdkObject), CfnLiveSourceProps {
    override fun httpPackageConfigurations(): Any = unwrap(this).getHttpPackageConfigurations()

    override fun liveSourceName(): String = unwrap(this).getLiveSourceName()

    override fun sourceLocationName(): String = unwrap(this).getSourceLocationName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLiveSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps):
        CfnLiveSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLiveSourceProps):
        software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps
  }
}
