@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.opsworks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.opsworks.CfnLayer

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * AutoScalingThresholdsProperty autoScalingThresholdsProperty =
 * AutoScalingThresholdsProperty.builder()
 * .cpuThreshold(123)
 * .ignoreMetricsTime(123)
 * .instanceCount(123)
 * .loadThreshold(123)
 * .memoryThreshold(123)
 * .thresholdsWaitTime(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-autoscalingthresholds.html)
 */
@CdkDslMarker
public class CfnLayerAutoScalingThresholdsPropertyDsl {
    private val cdkBuilder: CfnLayer.AutoScalingThresholdsProperty.Builder =
        CfnLayer.AutoScalingThresholdsProperty.builder()

    /**
     * @param cpuThreshold The CPU utilization threshold, as a percent of the available CPU. A value
     *   of -1 disables the threshold.
     */
    public fun cpuThreshold(cpuThreshold: Number) {
        cdkBuilder.cpuThreshold(cpuThreshold)
    }

    /**
     * @param ignoreMetricsTime The amount of time (in minutes) after a scaling event occurs that
     *   AWS OpsWorks Stacks should ignore metrics and suppress additional scaling events. For
     *   example, AWS OpsWorks Stacks adds new instances following an upscaling event but the
     *   instances won't start reducing the load until they have been booted and configured. There
     *   is no point in raising additional scaling events during that operation, which typically
     *   takes several minutes. `IgnoreMetricsTime` allows you to direct AWS OpsWorks Stacks to
     *   suppress scaling events long enough to get the new instances online.
     */
    public fun ignoreMetricsTime(ignoreMetricsTime: Number) {
        cdkBuilder.ignoreMetricsTime(ignoreMetricsTime)
    }

    /**
     * @param instanceCount The number of instances to add or remove when the load exceeds a
     *   threshold.
     */
    public fun instanceCount(instanceCount: Number) {
        cdkBuilder.instanceCount(instanceCount)
    }

    /**
     * @param loadThreshold The load threshold. A value of -1 disables the threshold. For more
     *   information about how load is computed, see
     *   [Load (computing)](https://docs.aws.amazon.com/http://en.wikipedia.org/wiki/Load_%28computing%29)
     *   .
     */
    public fun loadThreshold(loadThreshold: Number) {
        cdkBuilder.loadThreshold(loadThreshold)
    }

    /**
     * @param memoryThreshold The memory utilization threshold, as a percent of the available
     *   memory. A value of -1 disables the threshold.
     */
    public fun memoryThreshold(memoryThreshold: Number) {
        cdkBuilder.memoryThreshold(memoryThreshold)
    }

    /**
     * @param thresholdsWaitTime The amount of time, in minutes, that the load must exceed a
     *   threshold before more instances are added or removed.
     */
    public fun thresholdsWaitTime(thresholdsWaitTime: Number) {
        cdkBuilder.thresholdsWaitTime(thresholdsWaitTime)
    }

    public fun build(): CfnLayer.AutoScalingThresholdsProperty = cdkBuilder.build()
}
