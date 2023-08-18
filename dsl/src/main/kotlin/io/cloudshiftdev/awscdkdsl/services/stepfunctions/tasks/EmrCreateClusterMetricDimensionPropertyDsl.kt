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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

/**
 * A CloudWatch dimension, which is specified using a Key (known as a Name in CloudWatch), Value
 * pair.
 *
 * By default, Amazon EMR uses one dimension whose Key is JobFlowID and Value is a variable
 * representing the cluster ID, which is ${emr.clusterId}. This enables the rule to bootstrap when
 * the cluster ID becomes available
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * MetricDimensionProperty metricDimensionProperty = MetricDimensionProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/emr/latest/APIReference/API_MetricDimension.html)
 */
@CdkDslMarker
public class EmrCreateClusterMetricDimensionPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.MetricDimensionProperty.Builder =
        EmrCreateCluster.MetricDimensionProperty.builder()

    /** @param key The dimension name. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The dimension value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): EmrCreateCluster.MetricDimensionProperty = cdkBuilder.build()
}
