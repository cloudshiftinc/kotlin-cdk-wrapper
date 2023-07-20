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
import software.amazon.awscdk.services.applicationautoscaling.CfnScalingPolicyProps
import kotlin.String

@CdkDslMarker
public class CfnScalingPolicyPropsDsl {
    private val cdkBuilder: CfnScalingPolicyProps.Builder = CfnScalingPolicyProps.builder()

    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
    }

    public fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
    }

    public fun scalableDimension(scalableDimension: String) {
        cdkBuilder.scalableDimension(scalableDimension)
    }

    public fun scalingTargetId(scalingTargetId: String) {
        cdkBuilder.scalingTargetId(scalingTargetId)
    }

    public fun serviceNamespace(serviceNamespace: String) {
        cdkBuilder.serviceNamespace(serviceNamespace)
    }

    public fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: IResolvable) {
        cdkBuilder.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration)
    }

    public fun stepScalingPolicyConfiguration(stepScalingPolicyConfiguration: CfnScalingPolicy.StepScalingPolicyConfigurationProperty) {
        cdkBuilder.stepScalingPolicyConfiguration(stepScalingPolicyConfiguration)
    }

    public fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: IResolvable) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration)
    }

    public fun targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration: CfnScalingPolicy.TargetTrackingScalingPolicyConfigurationProperty) {
        cdkBuilder.targetTrackingScalingPolicyConfiguration(targetTrackingScalingPolicyConfiguration)
    }

    public fun build(): CfnScalingPolicyProps = cdkBuilder.build()
}
