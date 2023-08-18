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
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream

/**
 * This structure specifies a list of additional statistics to stream, and the metrics to stream
 * those additional statistics for.
 *
 * All metrics that match the combination of metric name and namespace will be streamed with the
 * additional statistics, no matter their dimensions.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudwatch.*;
 * MetricStreamStatisticsConfigurationProperty metricStreamStatisticsConfigurationProperty =
 * MetricStreamStatisticsConfigurationProperty.builder()
 * .additionalStatistics(List.of("additionalStatistics"))
 * .includeMetrics(List.of(MetricStreamStatisticsMetricProperty.builder()
 * .metricName("metricName")
 * .namespace("namespace")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudwatch-metricstream-metricstreamstatisticsconfiguration.html)
 */
@CdkDslMarker
public class CfnMetricStreamMetricStreamStatisticsConfigurationPropertyDsl {
    private val cdkBuilder: CfnMetricStream.MetricStreamStatisticsConfigurationProperty.Builder =
        CfnMetricStream.MetricStreamStatisticsConfigurationProperty.builder()

    private val _additionalStatistics: MutableList<String> = mutableListOf()

    private val _includeMetrics: MutableList<Any> = mutableListOf()

    /**
     * @param additionalStatistics The additional statistics to stream for the metrics listed in
     *   `IncludeMetrics` .
     */
    public fun additionalStatistics(vararg additionalStatistics: String) {
        _additionalStatistics.addAll(listOf(*additionalStatistics))
    }

    /**
     * @param additionalStatistics The additional statistics to stream for the metrics listed in
     *   `IncludeMetrics` .
     */
    public fun additionalStatistics(additionalStatistics: Collection<String>) {
        _additionalStatistics.addAll(additionalStatistics)
    }

    /**
     * @param includeMetrics An array that defines the metrics that are to have additional
     *   statistics streamed.
     */
    public fun includeMetrics(vararg includeMetrics: Any) {
        _includeMetrics.addAll(listOf(*includeMetrics))
    }

    /**
     * @param includeMetrics An array that defines the metrics that are to have additional
     *   statistics streamed.
     */
    public fun includeMetrics(includeMetrics: Collection<Any>) {
        _includeMetrics.addAll(includeMetrics)
    }

    /**
     * @param includeMetrics An array that defines the metrics that are to have additional
     *   statistics streamed.
     */
    public fun includeMetrics(includeMetrics: IResolvable) {
        cdkBuilder.includeMetrics(includeMetrics)
    }

    public fun build(): CfnMetricStream.MetricStreamStatisticsConfigurationProperty {
        if (_additionalStatistics.isNotEmpty())
            cdkBuilder.additionalStatistics(_additionalStatistics)
        if (_includeMetrics.isNotEmpty()) cdkBuilder.includeMetrics(_includeMetrics)
        return cdkBuilder.build()
    }
}
