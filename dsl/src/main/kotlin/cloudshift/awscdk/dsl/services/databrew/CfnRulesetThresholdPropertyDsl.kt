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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.databrew.CfnRuleset
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnRulesetThresholdPropertyDsl {
    private val cdkBuilder: CfnRuleset.ThresholdProperty.Builder =
        CfnRuleset.ThresholdProperty.builder()

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnRuleset.ThresholdProperty = cdkBuilder.build()
}
