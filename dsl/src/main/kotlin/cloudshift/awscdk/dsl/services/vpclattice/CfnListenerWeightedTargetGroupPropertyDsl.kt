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
import software.amazon.awscdk.services.vpclattice.CfnListener
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnListenerWeightedTargetGroupPropertyDsl {
    private val cdkBuilder: CfnListener.WeightedTargetGroupProperty.Builder =
        CfnListener.WeightedTargetGroupProperty.builder()

    public fun targetGroupIdentifier(targetGroupIdentifier: String) {
        cdkBuilder.targetGroupIdentifier(targetGroupIdentifier)
    }

    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    public fun build(): CfnListener.WeightedTargetGroupProperty = cdkBuilder.build()
}
