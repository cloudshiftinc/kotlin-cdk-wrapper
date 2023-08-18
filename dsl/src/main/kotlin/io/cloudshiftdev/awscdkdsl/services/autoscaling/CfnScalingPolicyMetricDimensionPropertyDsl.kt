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

package io.cloudshiftdev.awscdkdsl.services.autoscaling

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy

/**
 * `MetricDimension` specifies a name/value pair that is part of the identity of a CloudWatch metric
 * for the `Dimensions` property of the
 * [AWS::AutoScaling::ScalingPolicy CustomizedMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-customizedmetricspecification.html)
 * property type. Duplicate dimensions are not allowed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-scalingpolicy-metricdimension.html)
 */
@CdkDslMarker
public class CfnScalingPolicyMetricDimensionPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.MetricDimensionProperty.Builder =
        CfnScalingPolicy.MetricDimensionProperty.builder()

    /** @param name The name of the dimension. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The value of the dimension. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnScalingPolicy.MetricDimensionProperty = cdkBuilder.build()
}
