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

public open class CfnProject internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnProject,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun assetIds(): List<String> = unwrap(this).getAssetIds() ?: emptyList()

  public open fun assetIds(`value`: List<String>) {
    unwrap(this).setAssetIds(`value`)
  }

  public open fun assetIds(vararg `value`: String): Unit = assetIds(`value`.toList())

  public open fun attrProjectArn(): String = unwrap(this).getAttrProjectArn()

  public open fun attrProjectId(): String = unwrap(this).getAttrProjectId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun portalId(): String = unwrap(this).getPortalId()

  public open fun portalId(`value`: String) {
    unwrap(this).setPortalId(`value`)
  }

  public open fun projectDescription(): String? = unwrap(this).getProjectDescription()

  public open fun projectDescription(`value`: String) {
    unwrap(this).setProjectDescription(`value`)
  }

  public open fun projectName(): String = unwrap(this).getProjectName()

  public open fun projectName(`value`: String) {
    unwrap(this).setProjectName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun assetIds(assetIds: List<String>)

    public fun assetIds(vararg assetIds: String)

    public fun portalId(portalId: String)

    public fun projectDescription(projectDescription: String)

    public fun projectName(projectName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnProject.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnProject.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnProject = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnProject): CfnProject
        = CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.iotsitewise.CfnProject
        = wrapped.cdkObject
  }
}
