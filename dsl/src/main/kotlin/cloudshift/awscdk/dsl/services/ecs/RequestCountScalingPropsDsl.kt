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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.RequestCountScalingProps
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationTargetGroup
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class RequestCountScalingPropsDsl {
    private val cdkBuilder: RequestCountScalingProps.Builder = RequestCountScalingProps.builder()

    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun requestsPerTarget(requestsPerTarget: Number) {
        cdkBuilder.requestsPerTarget(requestsPerTarget)
    }

    public fun scaleInCooldown(scaleInCooldown: Duration) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
    }

    public fun scaleOutCooldown(scaleOutCooldown: Duration) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
    }

    public fun targetGroup(targetGroup: ApplicationTargetGroup) {
        cdkBuilder.targetGroup(targetGroup)
    }

    public fun build(): RequestCountScalingProps = cdkBuilder.build()
}
