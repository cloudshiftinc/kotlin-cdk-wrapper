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
import software.amazon.awscdk.services.logs.CfnMetricFilterProps
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnMetricFilterPropsDsl {
    private val cdkBuilder: CfnMetricFilterProps.Builder = CfnMetricFilterProps.builder()

    private val _metricTransformations: MutableList<Any> = mutableListOf()

    public fun filterName(filterName: String) {
        cdkBuilder.filterName(filterName)
    }

    public fun filterPattern(filterPattern: String) {
        cdkBuilder.filterPattern(filterPattern)
    }

    public fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
    }

    public fun metricTransformations(vararg metricTransformations: Any) {
        _metricTransformations.addAll(listOf(*metricTransformations))
    }

    public fun metricTransformations(metricTransformations: Collection<Any>) {
        _metricTransformations.addAll(metricTransformations)
    }

    public fun metricTransformations(metricTransformations: IResolvable) {
        cdkBuilder.metricTransformations(metricTransformations)
    }

    public fun build(): CfnMetricFilterProps {
        if (_metricTransformations.isNotEmpty()) cdkBuilder.metricTransformations(_metricTransformations)
        return cdkBuilder.build()
    }
}
