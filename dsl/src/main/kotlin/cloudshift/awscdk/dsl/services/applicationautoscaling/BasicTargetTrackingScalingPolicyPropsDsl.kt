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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.BasicTargetTrackingScalingPolicyProps
import software.amazon.awscdk.services.applicationautoscaling.PredefinedMetric
import software.amazon.awscdk.services.cloudwatch.IMetric
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class BasicTargetTrackingScalingPolicyPropsDsl {
    private val cdkBuilder: BasicTargetTrackingScalingPolicyProps.Builder =
        BasicTargetTrackingScalingPolicyProps.builder()

    public fun customMetric(customMetric: IMetric) {
        cdkBuilder.customMetric(customMetric)
    }

    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun predefinedMetric(predefinedMetric: PredefinedMetric) {
        cdkBuilder.predefinedMetric(predefinedMetric)
    }

    public fun resourceLabel(resourceLabel: String) {
        cdkBuilder.resourceLabel(resourceLabel)
    }

    public fun scaleInCooldown(scaleInCooldown: Duration) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
    }

    public fun scaleOutCooldown(scaleOutCooldown: Duration) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
    }

    public fun targetValue(targetValue: Number) {
        cdkBuilder.targetValue(targetValue)
    }

    public fun build(): BasicTargetTrackingScalingPolicyProps = cdkBuilder.build()
}
