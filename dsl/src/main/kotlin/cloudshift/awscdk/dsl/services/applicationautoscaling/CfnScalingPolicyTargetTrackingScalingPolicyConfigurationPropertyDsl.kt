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
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class CfnScalingPolicyTargetTrackingScalingPolicyConfigurationPropertyDsl {
    private val cdkBuilder: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.Builder =
        CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty.builder()

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

    public fun scaleInCooldown(scaleInCooldown: Number) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
    }

    public fun scaleOutCooldown(scaleOutCooldown: Number) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
    }

    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty =
        cdkBuilder.build()
}
