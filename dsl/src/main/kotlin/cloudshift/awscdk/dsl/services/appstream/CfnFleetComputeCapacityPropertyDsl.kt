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

package cloudshift.awscdk.dsl.services.appstream

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appstream.CfnFleet
import kotlin.Number

@CdkDslMarker
public class CfnFleetComputeCapacityPropertyDsl {
    private val cdkBuilder: CfnFleet.ComputeCapacityProperty.Builder =
        CfnFleet.ComputeCapacityProperty.builder()

    public fun desiredInstances(desiredInstances: Number) {
        cdkBuilder.desiredInstances(desiredInstances)
    }

    public fun build(): CfnFleet.ComputeCapacityProperty = cdkBuilder.build()
}
