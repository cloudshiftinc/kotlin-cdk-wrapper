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
public class CfnAutoScalingGroupAcceleratorCountRequestPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.AcceleratorCountRequestProperty.Builder =
        CfnAutoScalingGroup.AcceleratorCountRequestProperty.builder()

    public fun max(max: Number) {
        cdkBuilder.max(max)
    }

    public fun min(min: Number) {
        cdkBuilder.min(min)
    }

    public fun build(): CfnAutoScalingGroup.AcceleratorCountRequestProperty = cdkBuilder.build()
}
