package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDashboard internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDashboard,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrDashboardArn(): String = unwrap(this).getAttrDashboardArn()

  public open fun attrDashboardId(): String = unwrap(this).getAttrDashboardId()

  public open fun dashboardDefinition(): String = unwrap(this).getDashboardDefinition()

  public open fun dashboardDefinition(`value`: String) {
    unwrap(this).setDashboardDefinition(`value`)
  }

  public open fun dashboardDescription(): String = unwrap(this).getDashboardDescription()

  public open fun dashboardDescription(`value`: String) {
    unwrap(this).setDashboardDescription(`value`)
  }

  public open fun dashboardName(): String = unwrap(this).getDashboardName()

  public open fun dashboardName(`value`: String) {
    unwrap(this).setDashboardName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun projectId(): String? = unwrap(this).getProjectId()

  public open fun projectId(`value`: String) {
    unwrap(this).setProjectId(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun dashboardDefinition(dashboardDefinition: String)

    public fun dashboardDescription(dashboardDescription: String)

    public fun dashboardName(dashboardName: String)

    public fun projectId(projectId: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnDashboard.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnDashboard.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnDashboard =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDashboard {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDashboard(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnDashboard):
        CfnDashboard = CfnDashboard(cdkObject)

    internal fun unwrap(wrapped: CfnDashboard):
        software.amazon.awscdk.services.iotsitewise.CfnDashboard = wrapped.cdkObject
  }
}
