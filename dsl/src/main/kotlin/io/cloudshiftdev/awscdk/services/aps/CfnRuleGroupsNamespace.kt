package io.cloudshiftdev.awscdk.services.aps

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

public open class CfnRuleGroupsNamespace internal constructor(
  private val cdkObject: software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun `data`(): String = unwrap(this).getData()

  public open fun `data`(`value`: String) {
    unwrap(this).setData(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun workspace(): String = unwrap(this).getWorkspace()

  public open fun workspace(`value`: String) {
    unwrap(this).setWorkspace(`value`)
  }

  public interface Builder {
    public fun `data`(`data`: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun workspace(workspace: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace.Builder =
        software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace.Builder.create(scope, id)

    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun workspace(workspace: String) {
      cdkBuilder.workspace(workspace)
    }

    public fun build(): software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRuleGroupsNamespace {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRuleGroupsNamespace(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace):
        CfnRuleGroupsNamespace = CfnRuleGroupsNamespace(cdkObject)

    internal fun unwrap(wrapped: CfnRuleGroupsNamespace):
        software.amazon.awscdk.services.aps.CfnRuleGroupsNamespace = wrapped.cdkObject
  }
}
