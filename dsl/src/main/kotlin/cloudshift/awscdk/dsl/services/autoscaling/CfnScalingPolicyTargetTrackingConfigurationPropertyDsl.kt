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
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class CfnScalingPolicyTargetTrackingConfigurationPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.TargetTrackingConfigurationProperty.Builder =
        CfnScalingPolicy.TargetTrackingConfigurationProperty.builder()

    public fun customizedMetricSpecification(customizedMetricSpecification: IResolvable) {
        cdkBuilder.customizedMetricSpecification(customizedMetricSpecification)
    }

    public fun customizedMetricSpecification(customizedMetricSpecification: CfnScalingPolicy.CustomizedMetricSpecificationProperty) {
        cdkBuilder.customizedMetricSpecification(customizedMetricSpecification)
    }

    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    public fun disableScaleIn(disableScaleIn: IResolvable) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    public fun predefinedMetricSpecification(predefinedMetricSpecification: IResolvable) {
        cdkBuilder.predefinedMetricSpecification(predefinedMetricSpecification)
    }

    public fun predefinedMetricSpecification(predefinedMetricSpecification: CfnScalingPolicy.PredefinedMetricSpecificationProperty) {
        cdkBuilder.predefinedMetricSpecification(predefinedMetricSpecification)
    }

    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): CfnScalingPolicy.TargetTrackingConfigurationProperty = cdkBuilder.build()
}
