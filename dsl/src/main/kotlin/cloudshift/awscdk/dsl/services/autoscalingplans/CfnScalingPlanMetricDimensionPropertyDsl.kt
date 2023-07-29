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

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

/**
 * `MetricDimension` is a subproperty of
 * [CustomizedScalingMetricSpecification](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-customizedscalingmetricspecification.html)
 * that specifies a dimension for a customized metric to use with AWS Auto Scaling ( Auto Scaling
 * Plans ). Dimensions are arbitrary name/value pairs that can be associated with a CloudWatch
 * metric. Duplicate dimensions are not allowed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscalingplans.*;
 * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-metricdimension.html)
 */
@CdkDslMarker
public class CfnScalingPlanMetricDimensionPropertyDsl {
    private val cdkBuilder: CfnScalingPlan.MetricDimensionProperty.Builder =
        CfnScalingPlan.MetricDimensionProperty.builder()

    /** @param name The name of the dimension. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param value The value of the dimension. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnScalingPlan.MetricDimensionProperty = cdkBuilder.build()
}
