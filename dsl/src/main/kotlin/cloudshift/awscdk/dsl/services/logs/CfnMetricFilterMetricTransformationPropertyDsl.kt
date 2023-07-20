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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.logs.CfnMetricFilter
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnMetricFilterMetricTransformationPropertyDsl {
    private val cdkBuilder: CfnMetricFilter.MetricTransformationProperty.Builder =
        CfnMetricFilter.MetricTransformationProperty.builder()

    private val _dimensions: MutableList<Any> = mutableListOf()

    public fun defaultValue(defaultValue: Number) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun dimensions(vararg dimensions: Any) {
        _dimensions.addAll(listOf(*dimensions))
    }

    public fun dimensions(dimensions: Collection<Any>) {
        _dimensions.addAll(dimensions)
    }

    public fun dimensions(dimensions: IResolvable) {
        cdkBuilder.dimensions(dimensions)
    }

    public fun metricName(metricName: String) {
        cdkBuilder.metricName(metricName)
    }

    public fun metricNamespace(metricNamespace: String) {
        cdkBuilder.metricNamespace(metricNamespace)
    }

    public fun metricValue(metricValue: String) {
        cdkBuilder.metricValue(metricValue)
    }

    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnMetricFilter.MetricTransformationProperty {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        return cdkBuilder.build()
    }
}
