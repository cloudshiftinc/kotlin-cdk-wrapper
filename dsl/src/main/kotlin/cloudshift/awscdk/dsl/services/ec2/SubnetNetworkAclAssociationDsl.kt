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
import software.amazon.awscdk.services.ec2.INetworkAcl
import software.amazon.awscdk.services.ec2.ISubnet
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation
import software.constructs.Construct

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * NetworkAcl networkAcl;
 * Subnet subnet;
 * SubnetNetworkAclAssociation subnetNetworkAclAssociation =
 * SubnetNetworkAclAssociation.Builder.create(this, "MySubnetNetworkAclAssociation")
 * .networkAcl(networkAcl)
 * .subnet(subnet)
 * // the properties below are optional
 * .subnetNetworkAclAssociationName("subnetNetworkAclAssociationName")
 * .build();
 * ```
 */
@CdkDslMarker
public class SubnetNetworkAclAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: SubnetNetworkAclAssociation.Builder =
        SubnetNetworkAclAssociation.Builder.create(scope, id)

    /**
     * The Network ACL this association is defined for.
     *
     * @param networkAcl The Network ACL this association is defined for.
     */
    public fun networkAcl(networkAcl: INetworkAcl) {
        cdkBuilder.networkAcl(networkAcl)
    }

    /**
     * ID of the Subnet.
     *
     * @param subnet ID of the Subnet.
     */
    public fun subnet(subnet: ISubnet) {
        cdkBuilder.subnet(subnet)
    }

    /**
     * The name of the SubnetNetworkAclAssociation.
     *
     * It is not recommended to use an explicit name.
     *
     * Default: If you don't specify a SubnetNetworkAclAssociationName, AWS CloudFormation generates
     * a unique physical ID and uses that ID for the group name.
     *
     * @param subnetNetworkAclAssociationName The name of the SubnetNetworkAclAssociation.
     */
    public fun subnetNetworkAclAssociationName(subnetNetworkAclAssociationName: String) {
        cdkBuilder.subnetNetworkAclAssociationName(subnetNetworkAclAssociationName)
    }

    public fun build(): SubnetNetworkAclAssociation = cdkBuilder.build()
}
