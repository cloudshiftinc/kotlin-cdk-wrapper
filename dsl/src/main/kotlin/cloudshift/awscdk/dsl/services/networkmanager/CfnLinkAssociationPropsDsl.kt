@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps

/**
 * Properties for defining a `CfnLinkAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * CfnLinkAssociationProps cfnLinkAssociationProps = CfnLinkAssociationProps.builder()
 * .deviceId("deviceId")
 * .globalNetworkId("globalNetworkId")
 * .linkId("linkId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkmanager-linkassociation.html)
 */
@CdkDslMarker
public class CfnLinkAssociationPropsDsl {
    private val cdkBuilder: CfnLinkAssociationProps.Builder = CfnLinkAssociationProps.builder()

    /** @param deviceId The device ID for the link association. */
    public fun deviceId(deviceId: String) {
        cdkBuilder.deviceId(deviceId)
    }

    /** @param globalNetworkId The ID of the global network. */
    public fun globalNetworkId(globalNetworkId: String) {
        cdkBuilder.globalNetworkId(globalNetworkId)
    }

    /** @param linkId The ID of the link. */
    public fun linkId(linkId: String) {
        cdkBuilder.linkId(linkId)
    }

    public fun build(): CfnLinkAssociationProps = cdkBuilder.build()
}
