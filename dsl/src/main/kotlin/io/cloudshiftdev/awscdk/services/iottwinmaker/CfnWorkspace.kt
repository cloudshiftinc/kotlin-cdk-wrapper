package io.cloudshiftdev.awscdk.services.iottwinmaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkspace internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnWorkspace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationDateTime(): String = unwrap(this).getAttrCreationDateTime()

  public open fun attrUpdateDateTime(): String = unwrap(this).getAttrUpdateDateTime()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun role(): String = unwrap(this).getRole()

  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  public open fun s3Location(): String = unwrap(this).getS3Location()

  public open fun s3Location(`value`: String) {
    unwrap(this).setS3Location(`value`)
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
    public fun description(description: String)

    public fun role(role: String)

    public fun s3Location(s3Location: String)

    public fun tags(tags: Map<String, String>)

    public fun workspaceId(workspaceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iottwinmaker.CfnWorkspace.Builder =
        software.amazon.awscdk.services.iottwinmaker.CfnWorkspace.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun s3Location(s3Location: String) {
      cdkBuilder.s3Location(s3Location)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    override fun workspaceId(workspaceId: String) {
      cdkBuilder.workspaceId(workspaceId)
    }

    public fun build(): software.amazon.awscdk.services.iottwinmaker.CfnWorkspace =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkspace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkspace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iottwinmaker.CfnWorkspace):
        CfnWorkspace = CfnWorkspace(cdkObject)

    internal fun unwrap(wrapped: CfnWorkspace):
        software.amazon.awscdk.services.iottwinmaker.CfnWorkspace = wrapped.cdkObject
  }
}
