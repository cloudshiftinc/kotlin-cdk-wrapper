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
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnScalingPolicyPredictiveScalingCustomizedCapacityMetricPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty.Builder =
        CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty.builder()

    private val _metricDataQueries: MutableList<Any> = mutableListOf()

    public fun metricDataQueries(vararg metricDataQueries: Any) {
        _metricDataQueries.addAll(listOf(*metricDataQueries))
    }

    public fun metricDataQueries(metricDataQueries: Collection<Any>) {
        _metricDataQueries.addAll(metricDataQueries)
    }

    public fun metricDataQueries(metricDataQueries: IResolvable) {
        cdkBuilder.metricDataQueries(metricDataQueries)
    }

    public fun build(): CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty {
        if (_metricDataQueries.isNotEmpty()) cdkBuilder.metricDataQueries(_metricDataQueries)
        return cdkBuilder.build()
    }
}
