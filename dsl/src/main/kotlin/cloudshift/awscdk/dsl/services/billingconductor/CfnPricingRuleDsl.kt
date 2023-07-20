@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnPricingRule
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnPricingRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPricingRule.Builder = CfnPricingRule.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun billingEntity(billingEntity: String) {
        cdkBuilder.billingEntity(billingEntity)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun modifierPercentage(modifierPercentage: Number) {
        cdkBuilder.modifierPercentage(modifierPercentage)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun operation(operation: String) {
        cdkBuilder.operation(operation)
    }

    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun tiering(tiering: IResolvable) {
        cdkBuilder.tiering(tiering)
    }

    public fun tiering(tiering: CfnPricingRule.TieringProperty) {
        cdkBuilder.tiering(tiering)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun usageType(usageType: String) {
        cdkBuilder.usageType(usageType)
    }

    public fun build(): CfnPricingRule {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
