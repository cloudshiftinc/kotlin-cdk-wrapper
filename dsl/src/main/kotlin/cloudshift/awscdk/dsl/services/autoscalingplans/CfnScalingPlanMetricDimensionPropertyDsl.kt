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

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan
import kotlin.String

@CdkDslMarker
public class CfnScalingPlanMetricDimensionPropertyDsl {
    private val cdkBuilder: CfnScalingPlan.MetricDimensionProperty.Builder =
        CfnScalingPlan.MetricDimensionProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnScalingPlan.MetricDimensionProperty = cdkBuilder.build()
}
