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
import software.amazon.awscdk.services.cloudwatch.Unit
import software.amazon.awscdk.services.logs.IFilterPattern
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.logs.MetricFilter
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class MetricFilterDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: MetricFilter.Builder = MetricFilter.Builder.create(scope, id)

    public fun defaultValue(defaultValue: Number) {
        cdkBuilder.defaultValue(defaultValue)
    }

    public fun dimensions(dimensions: Map<String, String>) {
        cdkBuilder.dimensions(dimensions)
    }

    public fun filterName(filterName: String) {
        cdkBuilder.filterName(filterName)
    }

    public fun filterPattern(filterPattern: IFilterPattern) {
        cdkBuilder.filterPattern(filterPattern)
    }

    public fun logGroup(logGroup: ILogGroup) {
        cdkBuilder.logGroup(logGroup)
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

    public fun unit(unit: Unit) {
        cdkBuilder.unit(unit)
    }

    public fun build(): MetricFilter = cdkBuilder.build()
}
