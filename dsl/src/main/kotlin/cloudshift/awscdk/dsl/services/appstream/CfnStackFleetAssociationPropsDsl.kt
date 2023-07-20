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
import software.amazon.awscdk.services.appstream.CfnStackFleetAssociationProps
import kotlin.String

@CdkDslMarker
public class CfnStackFleetAssociationPropsDsl {
    private val cdkBuilder: CfnStackFleetAssociationProps.Builder =
        CfnStackFleetAssociationProps.builder()

    public fun fleetName(fleetName: String) {
        cdkBuilder.fleetName(fleetName)
    }

    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    public fun build(): CfnStackFleetAssociationProps = cdkBuilder.build()
}
