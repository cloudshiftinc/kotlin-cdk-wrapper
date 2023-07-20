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

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget
import kotlin.Number

@CdkDslMarker
public class CfnScalableTargetScalableTargetActionPropertyDsl {
    private val cdkBuilder: CfnScalableTarget.ScalableTargetActionProperty.Builder =
        CfnScalableTarget.ScalableTargetActionProperty.builder()

    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): CfnScalableTarget.ScalableTargetActionProperty = cdkBuilder.build()
}
