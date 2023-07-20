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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import kotlin.Number

@CdkDslMarker
public class CfnAutoScalingGroupTotalLocalStorageGBRequestPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty.Builder =
        CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty.builder()

    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnAutoScalingGroup.TotalLocalStorageGBRequestProperty = cdkBuilder.build()
}
