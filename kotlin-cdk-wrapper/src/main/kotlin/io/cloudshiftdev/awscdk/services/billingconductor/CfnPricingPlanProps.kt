@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.billingconductor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPricingPlan`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.billingconductor.*;
 * CfnPricingPlanProps cfnPricingPlanProps = CfnPricingPlanProps.builder()
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
public interface CfnPricingPlanProps {
  /**
   * The pricing plan description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of a pricing plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-name)
   */
  public fun name(): String

  /**
   * The `PricingRuleArns` that are associated with the Pricing Plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-pricingrulearns)
   */
  public fun pricingRuleArns(): List<String> = unwrap(this).getPricingRuleArns() ?: emptyList()

  /**
   * A map that contains tag keys and tag values that are attached to a pricing plan.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPricingPlanProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The pricing plan description.
     */
    public fun description(description: String)

    /**
     * @param name The name of a pricing plan. 
     */
    public fun name(name: String)

    /**
     * @param pricingRuleArns The `PricingRuleArns` that are associated with the Pricing Plan.
     */
    public fun pricingRuleArns(pricingRuleArns: List<String>)

    /**
     * @param pricingRuleArns The `PricingRuleArns` that are associated with the Pricing Plan.
     */
    public fun pricingRuleArns(vararg pricingRuleArns: String)

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a pricing plan.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a pricing plan.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps.Builder =
        software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps.builder()

    /**
     * @param description The pricing plan description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of a pricing plan. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param pricingRuleArns The `PricingRuleArns` that are associated with the Pricing Plan.
     */
    override fun pricingRuleArns(pricingRuleArns: List<String>) {
      cdkBuilder.pricingRuleArns(pricingRuleArns)
    }

    /**
     * @param pricingRuleArns The `PricingRuleArns` that are associated with the Pricing Plan.
     */
    override fun pricingRuleArns(vararg pricingRuleArns: String): Unit =
        pricingRuleArns(pricingRuleArns.toList())

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a pricing plan.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a pricing plan.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps,
  ) : CdkObject(cdkObject), CfnPricingPlanProps {
    /**
     * The pricing plan description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of a pricing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The `PricingRuleArns` that are associated with the Pricing Plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-pricingrulearns)
     */
    override fun pricingRuleArns(): List<String> = unwrap(this).getPricingRuleArns() ?: emptyList()

    /**
     * A map that contains tag keys and tag values that are attached to a pricing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPricingPlanProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps):
        CfnPricingPlanProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPricingPlanProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPricingPlanProps):
        software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps
  }
}
