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
import kotlin.String

@CdkDslMarker
public class CfnAutomationRuleMapFilterPropertyDsl {
    private val cdkBuilder: CfnAutomationRule.MapFilterProperty.Builder =
        CfnAutomationRule.MapFilterProperty.builder()

    public fun comparison(comparison: String) {
        cdkBuilder.comparison(comparison)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAutomationRule.MapFilterProperty = cdkBuilder.build()
}
