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

package io.cloudshiftdev.awscdkdsl.services.applicationautoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy

/**
 * `TargetTrackingMetricDimension` specifies a name/value pair that is part of the identity of a
 * CloudWatch metric for the `Dimensions` property of the
 * [AWS::ApplicationAutoScaling::ScalingPolicy TargetTrackingMetric](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetric.html)
 * property type. Duplicate dimensions are not allowed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.applicationautoscaling.*;
 * TargetTrackingMetricDimensionProperty targetTrackingMetricDimensionProperty =
 * TargetTrackingMetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalingpolicy-targettrackingmetricdimension.html)
 */
@CdkDslMarker
public class CfnScalingPolicyTargetTrackingMetricDimensionPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.TargetTrackingMetricDimensionProperty.Builder =
        CfnScalingPolicy.TargetTrackingMetricDimensionProperty.builder()

    /** @param name The name of the dimension. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The value of the dimension. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnScalingPolicy.TargetTrackingMetricDimensionProperty = cdkBuilder.build()
}
