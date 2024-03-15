@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnProjectProps {
  public fun assetIds(): List<String> = unwrap(this).getAssetIds() ?: emptyList()

  public fun portalId(): String

  public fun projectDescription(): String? = unwrap(this).getProjectDescription()

  public fun projectName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun assetIds(assetIds: List<String>)

    public fun assetIds(vararg assetIds: String)

    public fun portalId(portalId: String)

    public fun projectDescription(projectDescription: String)

    public fun projectName(projectName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnProjectProps.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnProjectProps.builder()

    override fun assetIds(assetIds: List<String>) {
      cdkBuilder.assetIds(assetIds)
    }

    override fun assetIds(vararg assetIds: String): Unit = assetIds(assetIds.toList())

    override fun portalId(portalId: String) {
      cdkBuilder.portalId(portalId)
    }

    override fun projectDescription(projectDescription: String) {
      cdkBuilder.projectDescription(projectDescription)
    }

    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    override fun assetIds(): List<String> = unwrap(this).getAssetIds() ?: emptyList()

    override fun portalId(): String = unwrap(this).getPortalId()

    override fun projectDescription(): String? = unwrap(this).getProjectDescription()

    override fun projectName(): String = unwrap(this).getProjectName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnProjectProps):
        CfnProjectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.iotsitewise.CfnProjectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotsitewise.CfnProjectProps
  }
}
