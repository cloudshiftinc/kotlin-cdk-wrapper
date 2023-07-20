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

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.networkmanager.CfnLinkAssociation
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnLinkAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLinkAssociation.Builder = CfnLinkAssociation.Builder.create(scope, id)

    public fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
    }

    public fun globalNetworkId(globalNetworkId: String) {
        cdkBuilder.globalNetworkId(globalNetworkId)
    }

    public fun linkId(linkId: String) {
        cdkBuilder.linkId(linkId)
    }

    public fun build(): CfnLinkAssociation = cdkBuilder.build()
}
