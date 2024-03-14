package io.cloudshiftdev.awscdk.services.gamelift

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

public open class CfnMatchmakingRuleSet internal constructor(
  private val cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun ruleSetBody(): String = unwrap(this).getRuleSetBody()

  public open fun ruleSetBody(`value`: String) {
    unwrap(this).setRuleSetBody(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun name(name: String)

    public fun ruleSetBody(ruleSetBody: String)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet.Builder =
        software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet.Builder.create(scope, id)

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun ruleSetBody(ruleSetBody: String) {
      cdkBuilder.ruleSetBody(ruleSetBody)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMatchmakingRuleSet {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMatchmakingRuleSet(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet):
        CfnMatchmakingRuleSet = CfnMatchmakingRuleSet(cdkObject)

    internal fun unwrap(wrapped: CfnMatchmakingRuleSet):
        software.amazon.awscdk.services.gamelift.CfnMatchmakingRuleSet = wrapped.cdkObject
  }
}
