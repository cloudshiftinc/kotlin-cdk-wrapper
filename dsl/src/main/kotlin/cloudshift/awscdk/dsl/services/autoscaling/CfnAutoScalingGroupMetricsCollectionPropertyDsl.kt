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
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAutoScalingGroupMetricsCollectionPropertyDsl {
    private val cdkBuilder: CfnAutoScalingGroup.MetricsCollectionProperty.Builder =
        CfnAutoScalingGroup.MetricsCollectionProperty.builder()

    private val _metrics: MutableList<String> = mutableListOf()

    public fun granularity(granularity: String) {
        cdkBuilder.granularity(granularity)
    }

    public fun metrics(vararg metrics: String) {
        _metrics.addAll(listOf(*metrics))
    }

    public fun metrics(metrics: Collection<String>) {
        _metrics.addAll(metrics)
    }

    public fun build(): CfnAutoScalingGroup.MetricsCollectionProperty {
        if (_metrics.isNotEmpty()) cdkBuilder.metrics(_metrics)
        return cdkBuilder.build()
    }
}
