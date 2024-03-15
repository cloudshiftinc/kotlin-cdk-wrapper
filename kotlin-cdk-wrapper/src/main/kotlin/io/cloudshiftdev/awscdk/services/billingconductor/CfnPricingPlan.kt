@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.billingconductor

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a pricing plan that is used for computing AWS charges for billing groups.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.billingconductor.*;
 * CfnPricingPlan cfnPricingPlan = CfnPricingPlan.Builder.create(this, "MyCfnPricingPlan")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .pricingRuleArns(List.of("pricingRuleArns"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html)
 */
public open class CfnPricingPlan internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingPlan,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the created pricing plan.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The time the pricing plan was created.
   */
  public open fun attrCreationTime(): Number = unwrap(this).getAttrCreationTime()

  /**
   * The most recent time the pricing plan was modified.
   */
  public open fun attrLastModifiedTime(): Number = unwrap(this).getAttrLastModifiedTime()

  /**
   * The pricing rules count currently associated with this pricing plan list element.
   */
  public open fun attrSize(): Number = unwrap(this).getAttrSize()

  /**
   * The pricing plan description.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The pricing plan description.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of a pricing plan.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of a pricing plan.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The `PricingRuleArns` that are associated with the Pricing Plan.
   */
  public open fun pricingRuleArns(): List<String> = unwrap(this).getPricingRuleArns() ?: emptyList()

  /**
   * The `PricingRuleArns` that are associated with the Pricing Plan.
   */
  public open fun pricingRuleArns(`value`: List<String>) {
    unwrap(this).setPricingRuleArns(`value`)
  }

  /**
   * The `PricingRuleArns` that are associated with the Pricing Plan.
   */
  public open fun pricingRuleArns(vararg `value`: String): Unit = pricingRuleArns(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A map that contains tag keys and tag values that are attached to a pricing plan.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * A map that contains tag keys and tag values that are attached to a pricing plan.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * A map that contains tag keys and tag values that are attached to a pricing plan.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.billingconductor.CfnPricingPlan].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The pricing plan description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-description)
     * @param description The pricing plan description. 
     */
    public fun description(description: String)

    /**
     * The name of a pricing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-name)
     * @param name The name of a pricing plan. 
     */
    public fun name(name: String)

    /**
     * The `PricingRuleArns` that are associated with the Pricing Plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-pricingrulearns)
     * @param pricingRuleArns The `PricingRuleArns` that are associated with the Pricing Plan. 
     */
    public fun pricingRuleArns(pricingRuleArns: List<String>)

    /**
     * The `PricingRuleArns` that are associated with the Pricing Plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-pricingrulearns)
     * @param pricingRuleArns The `PricingRuleArns` that are associated with the Pricing Plan. 
     */
    public fun pricingRuleArns(vararg pricingRuleArns: String)

    /**
     * A map that contains tag keys and tag values that are attached to a pricing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a pricing plan. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A map that contains tag keys and tag values that are attached to a pricing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a pricing plan. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.billingconductor.CfnPricingPlan.Builder
        = software.amazon.awscdk.services.billingconductor.CfnPricingPlan.Builder.create(scope, id)

    /**
     * The pricing plan description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-description)
     * @param description The pricing plan description. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of a pricing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-name)
     * @param name The name of a pricing plan. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The `PricingRuleArns` that are associated with the Pricing Plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-pricingrulearns)
     * @param pricingRuleArns The `PricingRuleArns` that are associated with the Pricing Plan. 
     */
    override fun pricingRuleArns(pricingRuleArns: List<String>) {
      cdkBuilder.pricingRuleArns(pricingRuleArns)
    }

    /**
     * The `PricingRuleArns` that are associated with the Pricing Plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-pricingrulearns)
     * @param pricingRuleArns The `PricingRuleArns` that are associated with the Pricing Plan. 
     */
    override fun pricingRuleArns(vararg pricingRuleArns: String): Unit =
        pricingRuleArns(pricingRuleArns.toList())

    /**
     * A map that contains tag keys and tag values that are attached to a pricing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a pricing plan. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * A map that contains tag keys and tag values that are attached to a pricing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-tags)
     * @param tags A map that contains tag keys and tag values that are attached to a pricing plan. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnPricingPlan =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.billingconductor.CfnPricingPlan.CFN_RESOURCE_TYPE_NAME

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
