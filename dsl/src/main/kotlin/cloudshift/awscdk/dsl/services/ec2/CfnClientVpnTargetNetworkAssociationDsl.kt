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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation
import software.constructs.Construct

/**
 * Specifies a target network to associate with a Client VPN endpoint.
 *
 * A target network is a subnet in a VPC. You can associate multiple subnets from the same VPC with
 * a Client VPN endpoint. You can associate only one subnet in each Availability Zone. We recommend
 * that you associate at least two subnets to provide Availability Zone redundancy.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnClientVpnTargetNetworkAssociation cfnClientVpnTargetNetworkAssociation =
 * CfnClientVpnTargetNetworkAssociation.Builder.create(this, "MyCfnClientVpnTargetNetworkAssociation")
 * .clientVpnEndpointId("clientVpnEndpointId")
 * .subnetId("subnetId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html)
 */
@CdkDslMarker
public class CfnClientVpnTargetNetworkAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnClientVpnTargetNetworkAssociation.Builder =
        CfnClientVpnTargetNetworkAssociation.Builder.create(scope, id)

    /**
     * The ID of the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html#cfn-ec2-clientvpntargetnetworkassociation-clientvpnendpointid)
     *
     * @param clientVpnEndpointId The ID of the Client VPN endpoint.
     */
    public fun clientVpnEndpointId(clientVpnEndpointId: String) {
        cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    /**
     * The ID of the subnet to associate with the Client VPN endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpntargetnetworkassociation.html#cfn-ec2-clientvpntargetnetworkassociation-subnetid)
     *
     * @param subnetId The ID of the subnet to associate with the Client VPN endpoint.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnClientVpnTargetNetworkAssociation = cdkBuilder.build()
}
