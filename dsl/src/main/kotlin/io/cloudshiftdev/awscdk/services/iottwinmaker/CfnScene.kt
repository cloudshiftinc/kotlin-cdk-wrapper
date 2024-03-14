package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnScene internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnScene,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationDateTime(): String = unwrap(this).getAttrCreationDateTime()

  public open fun attrGeneratedSceneMetadata(): IResolvable =
      unwrap(this).getAttrGeneratedSceneMetadata().let(IResolvable::wrap)

  public open fun attrUpdateDateTime(): String = unwrap(this).getAttrUpdateDateTime()

  public open fun capabilities(): List<String> = unwrap(this).getCapabilities() ?: emptyList()

  public open fun capabilities(`value`: List<String>) {
    unwrap(this).setCapabilities(`value`)
  }

  public open fun contentLocation(): String = unwrap(this).getContentLocation()

  public open fun contentLocation(`value`: String) {
    unwrap(this).setContentLocation(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun sceneId(): String = unwrap(this).getSceneId()

  public open fun sceneId(`value`: String) {
    unwrap(this).setSceneId(`value`)
  }

  public open fun sceneMetadata(): Any? = unwrap(this).getSceneMetadata()

  public open fun sceneMetadata(`value`: IResolvable) {
    unwrap(this).setSceneMetadata(`value`.let(IResolvable::unwrap))
  }

  public open fun sceneMetadata(`value`: Map<String, String>) {
    unwrap(this).setSceneMetadata(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun workspaceId(): String = unwrap(this).getWorkspaceId()

  public open fun workspaceId(`value`: String) {
    unwrap(this).setWorkspaceId(`value`)
  }

  public interface Builder {
    public fun capabilities(capabilities: List<String>) {
    }

    public fun contentLocation(contentLocation: String) {
    }

    public fun description(description: String) {
    }

    public fun sceneId(sceneId: String) {
    }

    public fun sceneMetadata(sceneMetadata: IResolvable) {
    }

    public fun sceneMetadata(sceneMetadata: Map<String, String>) {
    }

    public fun tags(tags: Map<String, String>) {
    }

    public fun workspaceId(workspaceId: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnScene.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnScene.Builder.create(scope, id)

    public override fun capabilities(capabilities: List<String>) {
      cdkBuilder.capabilities(capabilities)
    }

    public override fun contentLocation(contentLocation: String) {
      cdkBuilder.contentLocation(contentLocation)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun sceneId(sceneId: String) {
      cdkBuilder.sceneId(sceneId)
    }

    public override fun sceneMetadata(sceneMetadata: IResolvable) {
      cdkBuilder.sceneMetadata(sceneMetadata.let(IResolvable::unwrap))
    }

    public override fun sceneMetadata(sceneMetadata: Map<String, String>) {
      cdkBuilder.sceneMetadata(sceneMetadata)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnScene = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScene {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScene(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnScene): CfnScene =
        CfnScene(cdkObject)

    internal fun unwrap(wrapped: CfnScene): software.amazon.awscdk.services.iottwinmaker.CfnScene =
        wrapped.cdkObject
  }
}
