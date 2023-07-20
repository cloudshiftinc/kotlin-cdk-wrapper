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

package cloudshift.awscdk.dsl.services.applicationautoscaling

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnScalingPolicyCustomizedMetricSpecificationPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.CustomizedMetricSpecificationProperty.Builder =
        CfnScalingPolicy.CustomizedMetricSpecificationProperty.builder()

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

    public fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
    }

    public fun unit(unit: String) {
        cdkBuilder.unit(unit)
    }

    public fun build(): CfnScalingPolicy.CustomizedMetricSpecificationProperty {
        if (_dimensions.isNotEmpty()) cdkBuilder.dimensions(_dimensions)
        return cdkBuilder.build()
    }
}
