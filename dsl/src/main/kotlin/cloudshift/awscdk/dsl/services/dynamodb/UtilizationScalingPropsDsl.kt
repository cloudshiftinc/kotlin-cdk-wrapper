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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.dynamodb.UtilizationScalingProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class UtilizationScalingPropsDsl {
    private val cdkBuilder: UtilizationScalingProps.Builder = UtilizationScalingProps.builder()

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

    public fun targetUtilizationPercent(targetUtilizationPercent: Number) {
        cdkBuilder.targetUtilizationPercent(targetUtilizationPercent)
    }

    public fun build(): UtilizationScalingProps = cdkBuilder.build()
}
