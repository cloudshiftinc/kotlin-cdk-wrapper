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
import software.amazon.awscdk.services.autoscaling.CfnScalingPolicy
import kotlin.String

@CdkDslMarker
public class CfnScalingPolicyPredictiveScalingPredefinedLoadMetricPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty.Builder =
        CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty.builder()

    public fun predefinedMetricType(predefinedMetricType: String) {
        cdkBuilder.predefinedMetricType(predefinedMetricType)
    }

    public fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
    }

    public fun build(): CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty =
        cdkBuilder.build()
}
