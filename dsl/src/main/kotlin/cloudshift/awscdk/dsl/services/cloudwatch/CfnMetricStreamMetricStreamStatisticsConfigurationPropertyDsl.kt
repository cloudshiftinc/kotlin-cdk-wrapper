@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnMetricStream
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnMetricStreamMetricStreamStatisticsConfigurationPropertyDsl {
    private val cdkBuilder: CfnMetricStream.MetricStreamStatisticsConfigurationProperty.Builder =
        CfnMetricStream.MetricStreamStatisticsConfigurationProperty.builder()

    private val _additionalStatistics: MutableList<String> = mutableListOf()

    private val _includeMetrics: MutableList<Any> = mutableListOf()

    public fun additionalStatistics(vararg additionalStatistics: String) {
        _additionalStatistics.addAll(listOf(*additionalStatistics))
    }

    public fun additionalStatistics(additionalStatistics: Collection<String>) {
        _additionalStatistics.addAll(additionalStatistics)
    }

    public fun includeMetrics(vararg includeMetrics: Any) {
        _includeMetrics.addAll(listOf(*includeMetrics))
    }

    public fun includeMetrics(includeMetrics: Collection<Any>) {
        _includeMetrics.addAll(includeMetrics)
    }

    public fun includeMetrics(includeMetrics: IResolvable) {
        cdkBuilder.includeMetrics(includeMetrics)
    }

    public fun build(): CfnMetricStream.MetricStreamStatisticsConfigurationProperty {
        if (_additionalStatistics.isNotEmpty()) cdkBuilder.additionalStatistics(_additionalStatistics)
        if (_includeMetrics.isNotEmpty()) cdkBuilder.includeMetrics(_includeMetrics)
        return cdkBuilder.build()
    }
}
