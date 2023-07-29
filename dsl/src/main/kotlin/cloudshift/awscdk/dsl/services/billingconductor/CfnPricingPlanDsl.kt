@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.billingconductor.CfnPricingPlan
import software.constructs.Construct

/**
 * Creates a pricing plan that is used for computing AWS charges for billing groups.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.billingconductor.*;
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
@CdkDslMarker
public class CfnPricingPlanDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPricingPlan.Builder = CfnPricingPlan.Builder.create(scope, id)

    private val _pricingRuleArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The pricing plan description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-description)
     *
     * @param description The pricing plan description.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of a pricing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-name)
     *
     * @param name The name of a pricing plan.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The `PricingRuleArns` that are associated with the Pricing Plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-pricingrulearns)
     *
     * @param pricingRuleArns The `PricingRuleArns` that are associated with the Pricing Plan.
     */
    public fun pricingRuleArns(vararg pricingRuleArns: String) {
        _pricingRuleArns.addAll(listOf(*pricingRuleArns))
    }

    /**
     * The `PricingRuleArns` that are associated with the Pricing Plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-pricingrulearns)
     *
     * @param pricingRuleArns The `PricingRuleArns` that are associated with the Pricing Plan.
     */
    public fun pricingRuleArns(pricingRuleArns: Collection<String>) {
        _pricingRuleArns.addAll(pricingRuleArns)
    }

    /**
     * A map that contains tag keys and tag values that are attached to a pricing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-tags)
     *
     * @param tags A map that contains tag keys and tag values that are attached to a pricing plan.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A map that contains tag keys and tag values that are attached to a pricing plan.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingplan.html#cfn-billingconductor-pricingplan-tags)
     *
     * @param tags A map that contains tag keys and tag values that are attached to a pricing plan.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPricingPlan {
        if (_pricingRuleArns.isNotEmpty()) cdkBuilder.pricingRuleArns(_pricingRuleArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
