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

public interface CfnVodSourceProps {
  public fun httpPackageConfigurations(): Any

  public fun sourceLocationName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vodSourceName(): String

  @CdkDslMarker
  public interface Builder {
    public fun httpPackageConfigurations(httpPackageConfigurations: IResolvable)

    public fun httpPackageConfigurations(httpPackageConfigurations: List<Any>)

    public fun httpPackageConfigurations(vararg httpPackageConfigurations: Any)

    public fun sourceLocationName(sourceLocationName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vodSourceName(vodSourceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediatailor.CfnVodSourceProps.Builder =
        software.amazon.awscdk.services.mediatailor.CfnVodSourceProps.builder()

    override fun httpPackageConfigurations(httpPackageConfigurations: IResolvable) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations.let(IResolvable::unwrap))
    }

    override fun httpPackageConfigurations(httpPackageConfigurations: List<Any>) {
      cdkBuilder.httpPackageConfigurations(httpPackageConfigurations)
    }

    override fun httpPackageConfigurations(vararg httpPackageConfigurations: Any): Unit =
        httpPackageConfigurations(httpPackageConfigurations.toList())

    override fun sourceLocationName(sourceLocationName: String) {
      cdkBuilder.sourceLocationName(sourceLocationName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vodSourceName(vodSourceName: String) {
      cdkBuilder.vodSourceName(vodSourceName)
    }

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnVodSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediatailor.CfnVodSourceProps,
  ) : CdkObject(cdkObject), CfnVodSourceProps {
    override fun httpPackageConfigurations(): Any = unwrap(this).getHttpPackageConfigurations()

    override fun sourceLocationName(): String = unwrap(this).getSourceLocationName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vodSourceName(): String = unwrap(this).getVodSourceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVodSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnVodSourceProps):
        CfnVodSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVodSourceProps):
        software.amazon.awscdk.services.mediatailor.CfnVodSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.mediatailor.CfnVodSourceProps
  }
}
