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
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicy
import kotlin.String

@CdkDslMarker
public class CfnScalingPolicyMetricDimensionPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.MetricDimensionProperty.Builder =
        CfnScalingPolicy.MetricDimensionProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnScalingPolicy.MetricDimensionProperty = cdkBuilder.build()
}
