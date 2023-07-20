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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.opsworks.CfnLayer
import kotlin.Number

@CdkDslMarker
public class CfnLayerAutoScalingThresholdsPropertyDsl {
    private val cdkBuilder: CfnLayer.AutoScalingThresholdsProperty.Builder =
        CfnLayer.AutoScalingThresholdsProperty.builder()

    public fun cpuThreshold(cpuThreshold: Number) {
        cdkBuilder.cpuThreshold(cpuThreshold)
    }

    public fun ignoreMetricsTime(ignoreMetricsTime: Number) {
        cdkBuilder.ignoreMetricsTime(ignoreMetricsTime)
    }

    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    public fun loadThreshold(loadThreshold: Number) {
        cdkBuilder.loadThreshold(loadThreshold)
    }

    public fun memoryThreshold(memoryThreshold: Number) {
        cdkBuilder.memoryThreshold(memoryThreshold)
    }

    public fun thresholdsWaitTime(thresholdsWaitTime: Number) {
        cdkBuilder.thresholdsWaitTime(thresholdsWaitTime)
    }

    public fun build(): CfnLayer.AutoScalingThresholdsProperty = cdkBuilder.build()
}
