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

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.vpclattice.CfnRule
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnRuleWeightedTargetGroupPropertyDsl {
    private val cdkBuilder: CfnRule.WeightedTargetGroupProperty.Builder =
        CfnRule.WeightedTargetGroupProperty.builder()

    public fun targetGroupIdentifier(targetGroupIdentifier: String) {
        cdkBuilder.targetGroupIdentifier(targetGroupIdentifier)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnRule.WeightedTargetGroupProperty = cdkBuilder.build()
}
