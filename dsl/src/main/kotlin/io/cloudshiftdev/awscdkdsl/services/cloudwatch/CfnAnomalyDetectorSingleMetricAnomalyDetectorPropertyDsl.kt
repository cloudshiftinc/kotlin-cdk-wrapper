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

package io.cloudshiftdev.awscdkdsl.services.cloudwatch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnAnomalyDetector

/**
 * Designates the CloudWatch metric and statistic that provides the time series the anomaly detector
 * uses as input.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * SingleMetricAnomalyDetectorProperty singleMetricAnomalyDetectorProperty =
 * SingleMetricAnomalyDetectorProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .metricName("metricName")
 * .namespace("namespace")
 * .stat("stat")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-anomalydetector-singlemetricanomalydetector.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorSingleMetricAnomalyDetectorPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.Builder =
        CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty.builder()

    private val _dimensions: MutableList<Any> = mutableListOf()

    /** @param dimensions The metric dimensions to create the anomaly detection model for. */
    public fun dimensions(vararg dimensions: Any) {
        _dimensions.addAll(listOf(*dimensions))
    }

    /** @param dimensions The metric dimensions to create the anomaly detection model for. */
    public fun dimensions(dimensions: Collection<Any>) {
        _dimensions.addAll(dimensions)
    }

    /** @param dimensions The metric dimensions to create the anomaly detection model for. */
    public fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions)
    }

    /** @param metricName The name of the metric to create the anomaly detection model for. */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /** @param namespace The namespace of the metric to create the anomaly detection model for. */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    /** @param stat The statistic to use for the metric and anomaly detection model. */
    public fun stat(stat: String) {
        cdkBuilder.stat(stat)
    }

    public fun build(): CfnAnomalyDetector.SingleMetricAnomalyDetectorProperty {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        return cdkBuilder.build()
    }
}
