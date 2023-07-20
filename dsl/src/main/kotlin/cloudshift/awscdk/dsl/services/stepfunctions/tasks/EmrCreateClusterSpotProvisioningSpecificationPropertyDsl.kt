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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster
import kotlin.Number

@CdkDslMarker
public class EmrCreateClusterSpotProvisioningSpecificationPropertyDsl {
    private val cdkBuilder: EmrCreateCluster.SpotProvisioningSpecificationProperty.Builder =
        EmrCreateCluster.SpotProvisioningSpecificationProperty.builder()

    public fun allocationStrategy(allocationStrategy: EmrCreateCluster.SpotAllocationStrategy) {
        cdkBuilder.allocationStrategy(allocationStrategy)
    }

    public fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
    }

    public fun timeoutAction(timeoutAction: EmrCreateCluster.SpotTimeoutAction) {
        cdkBuilder.timeoutAction(timeoutAction)
    }

    public fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
        cdkBuilder.timeoutDurationMinutes(timeoutDurationMinutes)
    }

    public fun build(): EmrCreateCluster.SpotProvisioningSpecificationProperty = cdkBuilder.build()
}
