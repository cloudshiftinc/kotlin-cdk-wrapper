package io.cloudshiftdev.awscdk.services.billingconductor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPricingPlan internal constructor(
  private val cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingPlan,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationTime(): Number = unwrap(this).getAttrCreationTime()

  public open fun attrLastModifiedTime(): Number = unwrap(this).getAttrLastModifiedTime()

  public open fun attrSize(): Number = unwrap(this).getAttrSize()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun pricingRuleArns(): List<String> = unwrap(this).getPricingRuleArns() ?: emptyList()

  public open fun pricingRuleArns(`value`: List<String>) {
    unwrap(this).setPricingRuleArns(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun pricingRuleArns(pricingRuleArns: List<String>)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.billingconductor.CfnPricingPlan.Builder
        = software.amazon.awscdk.services.billingconductor.CfnPricingPlan.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun pricingRuleArns(pricingRuleArns: List<String>) {
      cdkBuilder.pricingRuleArns(pricingRuleArns)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnPricingPlan =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPricingPlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPricingPlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingPlan):
        CfnPricingPlan = CfnPricingPlan(cdkObject)

    internal fun unwrap(wrapped: CfnPricingPlan):
        software.amazon.awscdk.services.billingconductor.CfnPricingPlan = wrapped.cdkObject
  }
}
