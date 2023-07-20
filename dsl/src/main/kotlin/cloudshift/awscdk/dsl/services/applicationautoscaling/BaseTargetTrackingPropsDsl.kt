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
import software.amazon.awscdk.services.applicationautoscaling.BaseTargetTrackingProps
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class BaseTargetTrackingPropsDsl {
    private val cdkBuilder: BaseTargetTrackingProps.Builder = BaseTargetTrackingProps.builder()

    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    public fun policyName(policyName: String) {
        cdkBuilder.policyName(policyName)
    }

    public fun scaleInCooldown(scaleInCooldown: Duration) {
        cdkBuilder.scaleInCooldown(scaleInCooldown)
    }

    public fun scaleOutCooldown(scaleOutCooldown: Duration) {
        cdkBuilder.scaleOutCooldown(scaleOutCooldown)
    }

    public fun build(): BaseTargetTrackingProps = cdkBuilder.build()
}
