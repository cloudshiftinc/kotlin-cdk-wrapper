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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

/**
 * `MetricDimension` is a subproperty of the `CloudWatchAlarmDefinition` property type.
 *
 * `MetricDimension` specifies a CloudWatch dimension, which is specified with a `Key` `Value` pair.
 * The key is known as a `Name` in CloudWatch. By default, Amazon EMR uses one dimension whose `Key`
 * is `JobFlowID` and `Value` is a variable representing the cluster ID, which is `${emr.clusterId}`
 * . This enables the automatic scaling rule for EMR to bootstrap when the cluster ID becomes
 * available during cluster creation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emr-instancegroupconfig-metricdimension.html)
 */
@CdkDslMarker
public class CfnInstanceGroupConfigMetricDimensionPropertyDsl {
    private val cdkBuilder: CfnInstanceGroupConfig.MetricDimensionProperty.Builder =
        CfnInstanceGroupConfig.MetricDimensionProperty.builder()

    /** @param key The dimension name. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The dimension value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnInstanceGroupConfig.MetricDimensionProperty = cdkBuilder.build()
}
