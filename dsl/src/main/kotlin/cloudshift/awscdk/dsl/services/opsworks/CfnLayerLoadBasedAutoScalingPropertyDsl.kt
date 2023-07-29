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

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnLayer

/**
 * Describes a layer's load-based auto scaling configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opsworks.*;
 * LoadBasedAutoScalingProperty loadBasedAutoScalingProperty =
 * LoadBasedAutoScalingProperty.builder()
 * .downScaling(AutoScalingThresholdsProperty.builder()
 * .cpuThreshold(123)
 * .ignoreMetricsTime(123)
 * .instanceCount(123)
 * .loadThreshold(123)
 * .memoryThreshold(123)
 * .thresholdsWaitTime(123)
 * .build())
 * .enable(false)
 * .upScaling(AutoScalingThresholdsProperty.builder()
 * .cpuThreshold(123)
 * .ignoreMetricsTime(123)
 * .instanceCount(123)
 * .loadThreshold(123)
 * .memoryThreshold(123)
 * .thresholdsWaitTime(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-layer-loadbasedautoscaling.html)
 */
@CdkDslMarker
public class CfnLayerLoadBasedAutoScalingPropertyDsl {
    private val cdkBuilder: CfnLayer.LoadBasedAutoScalingProperty.Builder =
        CfnLayer.LoadBasedAutoScalingProperty.builder()

    /**
     * @param downScaling An `AutoScalingThresholds` object that describes the downscaling
     *   configuration, which defines how and when AWS OpsWorks Stacks reduces the number of
     *   instances.
     */
    public fun downScaling(downScaling: IResolvable) {
        cdkBuilder.downScaling(downScaling)
    }

    /**
     * @param downScaling An `AutoScalingThresholds` object that describes the downscaling
     *   configuration, which defines how and when AWS OpsWorks Stacks reduces the number of
     *   instances.
     */
    public fun downScaling(downScaling: CfnLayer.AutoScalingThresholdsProperty) {
        cdkBuilder.downScaling(downScaling)
    }

    /** @param enable Whether load-based auto scaling is enabled for the layer. */
    public fun enable(enable: Boolean) {
        cdkBuilder.enable(enable)
    }

    /** @param enable Whether load-based auto scaling is enabled for the layer. */
    public fun enable(enable: IResolvable) {
        cdkBuilder.enable(enable)
    }

    /**
     * @param upScaling An `AutoScalingThresholds` object that describes the upscaling
     *   configuration, which defines how and when AWS OpsWorks Stacks increases the number of
     *   instances.
     */
    public fun upScaling(upScaling: IResolvable) {
        cdkBuilder.upScaling(upScaling)
    }

    /**
     * @param upScaling An `AutoScalingThresholds` object that describes the upscaling
     *   configuration, which defines how and when AWS OpsWorks Stacks increases the number of
     *   instances.
     */
    public fun upScaling(upScaling: CfnLayer.AutoScalingThresholdsProperty) {
        cdkBuilder.upScaling(upScaling)
    }

    public fun build(): CfnLayer.LoadBasedAutoScalingProperty = cdkBuilder.build()
}
