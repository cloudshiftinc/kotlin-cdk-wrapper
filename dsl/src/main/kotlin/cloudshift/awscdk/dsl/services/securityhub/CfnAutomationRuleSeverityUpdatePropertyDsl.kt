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
import software.amazon.awscdk.services.securityhub.CfnAutomationRule
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnAutomationRuleSeverityUpdatePropertyDsl {
    private val cdkBuilder: CfnAutomationRule.SeverityUpdateProperty.Builder =
        CfnAutomationRule.SeverityUpdateProperty.builder()

    public fun label(label: String) {
        cdkBuilder.label(label)
    }

    public fun normalized(normalized: Number) {
        cdkBuilder.normalized(normalized)
    }

    public fun product(product: Number) {
        cdkBuilder.product(product)
    }

    public fun build(): CfnAutomationRule.SeverityUpdateProperty = cdkBuilder.build()
}
