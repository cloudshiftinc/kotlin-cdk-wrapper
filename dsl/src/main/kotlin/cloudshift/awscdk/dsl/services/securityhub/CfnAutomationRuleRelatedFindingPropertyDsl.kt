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

package cloudshift.awscdk.dsl.services.securityhub

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.securityhub.CfnAutomationRule
import kotlin.Any
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class CfnAutomationRuleRelatedFindingPropertyDsl {
    private val cdkBuilder: CfnAutomationRule.RelatedFindingProperty.Builder =
        CfnAutomationRule.RelatedFindingProperty.builder()

    public fun id(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.id(builder.map)
    }

    public fun id(id: Any) {
        cdkBuilder.id(id)
    }

    public fun productArn(productArn: String) {
        cdkBuilder.productArn(productArn)
    }

    public fun build(): CfnAutomationRule.RelatedFindingProperty = cdkBuilder.build()
}
