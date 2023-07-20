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
import software.amazon.awscdk.services.applicationautoscaling.CfnScalableTarget
import kotlin.Boolean

@CdkDslMarker
public class CfnScalableTargetSuspendedStatePropertyDsl {
    private val cdkBuilder: CfnScalableTarget.SuspendedStateProperty.Builder =
        CfnScalableTarget.SuspendedStateProperty.builder()

    public fun dynamicScalingInSuspended(dynamicScalingInSuspended: Boolean) {
        cdkBuilder.dynamicScalingInSuspended(dynamicScalingInSuspended)
    }

    public fun dynamicScalingInSuspended(dynamicScalingInSuspended: IResolvable) {
        cdkBuilder.dynamicScalingInSuspended(dynamicScalingInSuspended)
    }

    public fun dynamicScalingOutSuspended(dynamicScalingOutSuspended: Boolean) {
        cdkBuilder.dynamicScalingOutSuspended(dynamicScalingOutSuspended)
    }

    public fun dynamicScalingOutSuspended(dynamicScalingOutSuspended: IResolvable) {
        cdkBuilder.dynamicScalingOutSuspended(dynamicScalingOutSuspended)
    }

    public fun scheduledScalingSuspended(scheduledScalingSuspended: Boolean) {
        cdkBuilder.scheduledScalingSuspended(scheduledScalingSuspended)
    }

    public fun scheduledScalingSuspended(scheduledScalingSuspended: IResolvable) {
        cdkBuilder.scheduledScalingSuspended(scheduledScalingSuspended)
    }

    public fun build(): CfnScalableTarget.SuspendedStateProperty = cdkBuilder.build()
}
