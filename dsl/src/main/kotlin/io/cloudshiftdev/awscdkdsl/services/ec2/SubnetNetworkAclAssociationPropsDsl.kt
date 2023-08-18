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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.INetworkAcl
import software.amazon.awscdk.services.ec2.ISubnet
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps

/**
 * Properties to create a SubnetNetworkAclAssociation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * NetworkAcl networkAcl;
 * Subnet subnet;
 * SubnetNetworkAclAssociationProps subnetNetworkAclAssociationProps =
 * SubnetNetworkAclAssociationProps.builder()
 * .networkAcl(networkAcl)
 * .subnet(subnet)
 * // the properties below are optional
 * .subnetNetworkAclAssociationName("subnetNetworkAclAssociationName")
 * .build();
 * ```
 */
@CdkDslMarker
public class SubnetNetworkAclAssociationPropsDsl {
    private val cdkBuilder: SubnetNetworkAclAssociationProps.Builder =
        SubnetNetworkAclAssociationProps.builder()

    /** @param networkAcl The Network ACL this association is defined for. */
    public fun networkAcl(networkAcl: INetworkAcl) {
        cdkBuilder.networkAcl(networkAcl)
    }

    /** @param subnet ID of the Subnet. */
    public fun subnet(subnet: ISubnet) {
        cdkBuilder.subnet(subnet)
    }

    /**
     * @param subnetNetworkAclAssociationName The name of the SubnetNetworkAclAssociation. It is not
     *   recommended to use an explicit name.
     */
    public fun subnetNetworkAclAssociationName(subnetNetworkAclAssociationName: String) {
        cdkBuilder.subnetNetworkAclAssociationName(subnetNetworkAclAssociationName)
    }

    public fun build(): SubnetNetworkAclAssociationProps = cdkBuilder.build()
}
