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

package cloudshift.awscdk.dsl.services.lookoutmetrics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lookoutmetrics.CfnAnomalyDetector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAnomalyDetectorMetricSetPropertyDsl {
    private val cdkBuilder: CfnAnomalyDetector.MetricSetProperty.Builder =
        CfnAnomalyDetector.MetricSetProperty.builder()

    private val _dimensionList: MutableList<String> = mutableListOf()

    private val _metricList: MutableList<Any> = mutableListOf()

    public fun dimensionList(vararg dimensionList: String) {
        _dimensionList.addAll(listOf(*dimensionList))
    }

    public fun dimensionList(dimensionList: Collection<String>) {
        _dimensionList.addAll(dimensionList)
    }

    public fun metricList(vararg metricList: Any) {
        _metricList.addAll(listOf(*metricList))
    }

    public fun metricList(metricList: Collection<Any>) {
        _metricList.addAll(metricList)
    }

    public fun metricList(metricList: IResolvable) {
        cdkBuilder.metricList(metricList)
    }

    public fun metricSetDescription(metricSetDescription: String) {
        cdkBuilder.metricSetDescription(metricSetDescription)
    }

    public fun metricSetFrequency(metricSetFrequency: String) {
        cdkBuilder.metricSetFrequency(metricSetFrequency)
    }

    public fun metricSetName(metricSetName: String) {
        cdkBuilder.metricSetName(metricSetName)
    }

    public fun metricSource(metricSource: IResolvable) {
        cdkBuilder.metricSource(metricSource)
    }

    public fun metricSource(metricSource: CfnAnomalyDetector.MetricSourceProperty) {
        cdkBuilder.metricSource(metricSource)
    }

    public fun offset(offset: Number) {
        cdkBuilder.offset(offset)
    }

    public fun timestampColumn(timestampColumn: IResolvable) {
        cdkBuilder.timestampColumn(timestampColumn)
    }

    public fun timestampColumn(timestampColumn: CfnAnomalyDetector.TimestampColumnProperty) {
        cdkBuilder.timestampColumn(timestampColumn)
    }

    public fun timezone(timezone: String) {
        cdkBuilder.timezone(timezone)
    }

    public fun build(): CfnAnomalyDetector.MetricSetProperty {
        if (_dimensionList.isNotEmpty()) cdkBuilder.dimensionList(_dimensionList)
        if (_metricList.isNotEmpty()) cdkBuilder.metricList(_metricList)
        return cdkBuilder.build()
    }
}
