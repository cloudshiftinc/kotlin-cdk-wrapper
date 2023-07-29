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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector

/**
 * A calculation made by contrasting a measure and a dimension from your source data.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lookoutmetrics.*;
 * MetricProperty metricProperty = MetricProperty.builder()
 * .aggregationFunction("aggregationFunction")
 * .metricName("metricName")
 * // the properties below are optional
 * .namespace("namespace")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lookoutmetrics-anomalydetector-metric.html)
 */
@CdkDslMarker
public class CfnAnomalyDetectorMetricPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.MetricProperty.Builder =
        CfnAnomalyDetector.MetricProperty.builder()

    /** @param aggregationFunction The function with which the metric is calculated. */
    public fun aggregationFunction(aggregationFunction: String) {
        cdkBuilder.aggregationFunction(aggregationFunction)
    }

    /** @param metricName The name of the metric. */
    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    /** @param namespace The namespace for the metric. */
    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun build(): CfnAnomalyDetector.MetricProperty = cdkBuilder.build()
}
