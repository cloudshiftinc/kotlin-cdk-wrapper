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

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnScalingPolicyMetricPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.MetricProperty.Builder =
        CfnScalingPolicy.MetricProperty.builder()

    private val _dimensions: MutableList<Any> = mutableListOf()

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

    public fun namespace(namespace: String) {
        cdkBuilder.namespace(namespace)
    }

    public fun build(): CfnScalingPolicy.MetricProperty {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        return cdkBuilder.build()
    }
}
