@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDashboardProps {
  public fun dashboardDefinition(): String

  public fun dashboardDescription(): String

  public fun dashboardName(): String

  public fun projectId(): String? = unwrap(this).getProjectId()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun dashboardDefinition(dashboardDefinition: String)

    public fun dashboardDescription(dashboardDescription: String)

    public fun dashboardName(dashboardName: String)

    public fun projectId(projectId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnDashboardProps.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnDashboardProps.builder()

    override fun dashboardDefinition(dashboardDefinition: String) {
      cdkBuilder.dashboardDefinition(dashboardDefinition)
    }

    override fun dashboardDescription(dashboardDescription: String) {
      cdkBuilder.dashboardDescription(dashboardDescription)
    }

    override fun dashboardName(dashboardName: String) {
      cdkBuilder.dashboardName(dashboardName)
    }

    override fun projectId(projectId: String) {
      cdkBuilder.projectId(projectId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnDashboardProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDashboardProps,
  ) : CdkObject(cdkObject), CfnDashboardProps {
    override fun dashboardDefinition(): String = unwrap(this).getDashboardDefinition()

    override fun dashboardDescription(): String = unwrap(this).getDashboardDescription()

    override fun dashboardName(): String = unwrap(this).getDashboardName()

    override fun projectId(): String? = unwrap(this).getProjectId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDashboardProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDashboardProps):
        CfnDashboardProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDashboardProps):
        software.amazon.awscdk.services.iotsitewise.CfnDashboardProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotsitewise.CfnDashboardProps
  }
}
