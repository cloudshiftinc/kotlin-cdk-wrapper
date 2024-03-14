package io.cloudshiftdev.awscdk.services.connect

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

public open class CfnContactFlowModule internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnContactFlowModule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrContactFlowModuleArn(): String = unwrap(this).getAttrContactFlowModuleArn()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun content(): String = unwrap(this).getContent()

  public open fun content(`value`: String) {
    unwrap(this).setContent(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun instanceArn(): String = unwrap(this).getInstanceArn()

  public open fun instanceArn(`value`: String) {
    unwrap(this).setInstanceArn(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun state(): String? = unwrap(this).getState()

  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun content(content: String) {
    }

    public fun description(description: String) {
    }

    public fun instanceArn(instanceArn: String) {
    }

    public fun name(name: String) {
    }

    public fun state(state: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnContactFlowModule.Builder =
        software.amazon.awscdk.services.connect.CfnContactFlowModule.Builder.create(scope, id)

    public override fun content(content: String) {
      cdkBuilder.content(content)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun instanceArn(instanceArn: String) {
      cdkBuilder.instanceArn(instanceArn)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun state(state: String) {
      cdkBuilder.state(state)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnContactFlowModule =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContactFlowModule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContactFlowModule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnContactFlowModule):
        CfnContactFlowModule = CfnContactFlowModule(cdkObject)

    internal fun unwrap(wrapped: CfnContactFlowModule):
        software.amazon.awscdk.services.connect.CfnContactFlowModule = wrapped.cdkObject
  }
}
