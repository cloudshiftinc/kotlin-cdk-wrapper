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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.autoscaling.CpuUtilizationScalingProps
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class CpuUtilizationScalingPropsDsl {
    private val cdkBuilder: CpuUtilizationScalingProps.Builder = CpuUtilizationScalingProps.builder()

    public fun cooldown(cooldown: Duration) {
        cdkBuilder.cooldown(cooldown)
    }

    public fun disableScaleIn(disableScaleIn: Boolean) {
        cdkBuilder.disableScaleIn(disableScaleIn)
    }

    public fun estimatedInstanceWarmup(estimatedInstanceWarmup: Duration) {
        cdkBuilder.estimatedInstanceWarmup(estimatedInstanceWarmup)
    }

    public fun targetUtilizationPercent(targetUtilizationPercent: Number) {
        cdkBuilder.targetUtilizationPercent(targetUtilizationPercent)
    }

    public fun build(): CpuUtilizationScalingProps = cdkBuilder.build()
}
