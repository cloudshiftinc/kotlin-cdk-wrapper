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

package io.cloudshiftdev.awscdkdsl.services.billingconductor

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps

/**
 * Properties for defining a `CfnPricingPlan`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.billingconductor.*;
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
@CdkDslMarker
public class CfnPricingPlanPropsDsl {
    private val cdkBuilder: CfnPricingPlanProps.Builder = CfnPricingPlanProps.builder()

    private val _pricingRuleArns: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description The pricing plan description. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param name The name of a pricing plan. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param pricingRuleArns The `PricingRuleArns` that are associated with the Pricing Plan. */
    public fun pricingRuleArns(vararg pricingRuleArns: String) {
        _pricingRuleArns.addAll(listOf(*pricingRuleArns))
    }

    /** @param pricingRuleArns The `PricingRuleArns` that are associated with the Pricing Plan. */
    public fun pricingRuleArns(pricingRuleArns: Collection<String>) {
        _pricingRuleArns.addAll(pricingRuleArns)
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a pricing plan.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags A map that contains tag keys and tag values that are attached to a pricing plan.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPricingPlanProps {
        if (_pricingRuleArns.isNotEmpty()) cdkBuilder.pricingRuleArns(_pricingRuleArns)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
