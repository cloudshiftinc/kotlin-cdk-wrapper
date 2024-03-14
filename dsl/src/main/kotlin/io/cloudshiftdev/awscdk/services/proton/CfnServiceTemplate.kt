package io.cloudshiftdev.awscdk.services.proton

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

public open class CfnServiceTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.proton.CfnServiceTemplate,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun displayName(): String? = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public open fun encryptionKey(): String? = unwrap(this).getEncryptionKey()

  public open fun encryptionKey(`value`: String) {
    unwrap(this).setEncryptionKey(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun pipelineProvisioning(): String? = unwrap(this).getPipelineProvisioning()

  public open fun pipelineProvisioning(`value`: String) {
    unwrap(this).setPipelineProvisioning(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String) {
    }

    public fun displayName(displayName: String) {
    }

    public fun encryptionKey(encryptionKey: String) {
    }

    public fun name(name: String) {
    }

    public fun pipelineProvisioning(pipelineProvisioning: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.proton.CfnServiceTemplate.Builder =
        software.amazon.awscdk.services.proton.CfnServiceTemplate.Builder.create(scope, id)

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    public override fun encryptionKey(encryptionKey: String) {
      cdkBuilder.encryptionKey(encryptionKey)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun pipelineProvisioning(pipelineProvisioning: String) {
      cdkBuilder.pipelineProvisioning(pipelineProvisioning)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.proton.CfnServiceTemplate =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServiceTemplate {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServiceTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.proton.CfnServiceTemplate):
        CfnServiceTemplate = CfnServiceTemplate(cdkObject)

    internal fun unwrap(wrapped: CfnServiceTemplate):
        software.amazon.awscdk.services.proton.CfnServiceTemplate = wrapped.cdkObject
  }
}
