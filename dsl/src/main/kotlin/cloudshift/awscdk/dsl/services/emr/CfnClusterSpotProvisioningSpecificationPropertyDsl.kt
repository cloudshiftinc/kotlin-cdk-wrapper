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

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.emr.CfnCluster
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnClusterSpotProvisioningSpecificationPropertyDsl {
    private val cdkBuilder: CfnCluster.SpotProvisioningSpecificationProperty.Builder =
        CfnCluster.SpotProvisioningSpecificationProperty.builder()

    public fun allocationStrategy(allocationStrategy: String) {
        cdkBuilder.allocationStrategy(allocationStrategy)
    }

    public fun blockDurationMinutes(blockDurationMinutes: Number) {
        cdkBuilder.blockDurationMinutes(blockDurationMinutes)
    }

    public fun timeoutAction(timeoutAction: String) {
        cdkBuilder.timeoutAction(timeoutAction)
    }

    public fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
        cdkBuilder.timeoutDurationMinutes(timeoutDurationMinutes)
    }

    public fun build(): CfnCluster.SpotProvisioningSpecificationProperty = cdkBuilder.build()
}
