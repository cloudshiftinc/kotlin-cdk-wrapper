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
import kotlin.Number

@CdkDslMarker
public class CfnScalingPolicyPredictiveScalingMetricSpecificationPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.Builder =
        CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty.builder()

    public fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: IResolvable) {
        cdkBuilder.customizedCapacityMetricSpecification(customizedCapacityMetricSpecification)
    }

    public fun customizedCapacityMetricSpecification(customizedCapacityMetricSpecification: CfnScalingPolicy.PredictiveScalingCustomizedCapacityMetricProperty) {
        cdkBuilder.customizedCapacityMetricSpecification(customizedCapacityMetricSpecification)
    }

    public fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: IResolvable) {
        cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification)
    }

    public fun customizedLoadMetricSpecification(customizedLoadMetricSpecification: CfnScalingPolicy.PredictiveScalingCustomizedLoadMetricProperty) {
        cdkBuilder.customizedLoadMetricSpecification(customizedLoadMetricSpecification)
    }

    public fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: IResolvable) {
        cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification)
    }

    public fun customizedScalingMetricSpecification(customizedScalingMetricSpecification: CfnScalingPolicy.PredictiveScalingCustomizedScalingMetricProperty) {
        cdkBuilder.customizedScalingMetricSpecification(customizedScalingMetricSpecification)
    }

    public fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: IResolvable) {
        cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification)
    }

    public fun predefinedLoadMetricSpecification(predefinedLoadMetricSpecification: CfnScalingPolicy.PredictiveScalingPredefinedLoadMetricProperty) {
        cdkBuilder.predefinedLoadMetricSpecification(predefinedLoadMetricSpecification)
    }

    public fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: IResolvable) {
        cdkBuilder.predefinedMetricPairSpecification(predefinedMetricPairSpecification)
    }

    public fun predefinedMetricPairSpecification(predefinedMetricPairSpecification: CfnScalingPolicy.PredictiveScalingPredefinedMetricPairProperty) {
        cdkBuilder.predefinedMetricPairSpecification(predefinedMetricPairSpecification)
    }

    public fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: IResolvable) {
        cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification)
    }

    public fun predefinedScalingMetricSpecification(predefinedScalingMetricSpecification: CfnScalingPolicy.PredictiveScalingPredefinedScalingMetricProperty) {
        cdkBuilder.predefinedScalingMetricSpecification(predefinedScalingMetricSpecification)
    }

    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): CfnScalingPolicy.PredictiveScalingMetricSpecificationProperty =
        cdkBuilder.build()
}
