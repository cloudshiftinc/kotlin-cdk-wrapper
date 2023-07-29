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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnPricingRule
import software.constructs.Construct

/**
 * Creates a pricing rule which can be associated with a pricing plan, or a set of pricing plans.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.billingconductor.*;
 * CfnPricingRule cfnPricingRule = CfnPricingRule.Builder.create(this, "MyCfnPricingRule")
 * .name("name")
 * .scope("scope")
 * .type("type")
 * // the properties below are optional
 * .billingEntity("billingEntity")
 * .description("description")
 * .modifierPercentage(123)
 * .operation("operation")
 * .service("service")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tiering(TieringProperty.builder()
 * .freeTier(FreeTierProperty.builder()
 * .activated(false)
 * .build())
 * .build())
 * .usageType("usageType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html)
 */
@CdkDslMarker
public class CfnPricingRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPricingRule.Builder = CfnPricingRule.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The seller of services provided by AWS , their affiliates, or third-party providers selling
     * services via AWS Marketplace .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-billingentity)
     *
     * @param billingEntity The seller of services provided by AWS , their affiliates, or
     *   third-party providers selling services via AWS Marketplace .
     */
    public fun billingEntity(billingEntity: String) {
        cdkBuilder.billingEntity(billingEntity)
    }

    /**
     * The pricing rule description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-description)
     *
     * @param description The pricing rule description.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * A percentage modifier applied on the public pricing rates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-modifierpercentage)
     *
     * @param modifierPercentage A percentage modifier applied on the public pricing rates.
     */
    public fun modifierPercentage(modifierPercentage: Number) {
        cdkBuilder.modifierPercentage(modifierPercentage)
    }

    /**
     * The name of a pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-name)
     *
     * @param name The name of a pricing rule.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Operation is the specific AWS action covered by this line item.
     *
     * This describes the specific usage of the line item.
     *
     * If the `Scope` attribute is set to `SKU` , this attribute indicates which operation the
     * `PricingRule` is modifying. For example, a value of `RunInstances:0202` indicates the
     * operation of running an Amazon EC2 instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-operation)
     *
     * @param operation Operation is the specific AWS action covered by this line item.
     */
    public fun operation(operation: String) {
        cdkBuilder.operation(operation)
    }

    /**
     * The scope of pricing rule that indicates if it's globally applicable or service-specific.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-scope)
     *
     * @param scope The scope of pricing rule that indicates if it's globally applicable or
     *   service-specific.
     */
    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    /**
     * If the `Scope` attribute is `SERVICE` , this attribute indicates which service the
     * `PricingRule` is applicable for.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-service)
     *
     * @param service If the `Scope` attribute is `SERVICE` , this attribute indicates which service
     *   the `PricingRule` is applicable for.
     */
    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    /**
     * A map that contains tag keys and tag values that are attached to a pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tags)
     *
     * @param tags A map that contains tag keys and tag values that are attached to a pricing rule.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A map that contains tag keys and tag values that are attached to a pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tags)
     *
     * @param tags A map that contains tag keys and tag values that are attached to a pricing rule.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The set of tiering configurations for the pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tiering)
     *
     * @param tiering The set of tiering configurations for the pricing rule.
     */
    public fun tiering(tiering: IResolvable) {
        cdkBuilder.tiering(tiering)
    }

    /**
     * The set of tiering configurations for the pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-tiering)
     *
     * @param tiering The set of tiering configurations for the pricing rule.
     */
    public fun tiering(tiering: CfnPricingRule.TieringProperty) {
        cdkBuilder.tiering(tiering)
    }

    /**
     * The type of pricing rule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-type)
     *
     * @param type The type of pricing rule.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * Usage Type is the unit that each service uses to measure the usage of a specific type of
     * resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-pricingrule.html#cfn-billingconductor-pricingrule-usagetype)
     *
     * @param usageType Usage Type is the unit that each service uses to measure the usage of a
     *   specific type of resource.
     */
    public fun usageType(usageType: String) {
        cdkBuilder.usageType(usageType)
    }

    public fun build(): CfnPricingRule {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
