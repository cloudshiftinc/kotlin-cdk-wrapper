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
import kotlin.Unit
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.NetworkAcl
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.constructs.Construct

/**
 * Define a new custom network ACL.
 *
 * By default, will deny all inbound and outbound traffic unless entries are added explicitly
 * allowing it.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * NetworkAcl networkAcl = NetworkAcl.Builder.create(this, "MyNetworkAcl")
 * .vpc(vpc)
 * // the properties below are optional
 * .networkAclName("networkAclName")
 * .subnetSelection(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class NetworkAclDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: NetworkAcl.Builder = NetworkAcl.Builder.create(scope, id)

    /**
     * The name of the NetworkAcl.
     *
     * It is not recommended to use an explicit name.
     *
     * Default: If you don't specify a networkAclName, AWS CloudFormation generates a unique
     * physical ID and uses that ID for the group name.
     *
     * @param networkAclName The name of the NetworkAcl.
     */
    public fun networkAclName(networkAclName: String) {
        cdkBuilder.networkAclName(networkAclName)
    }

    /**
     * Subnets in the given VPC to associate the ACL with.
     *
     * More subnets can always be added later by calling `associateWithSubnets()`.
     *
     * Default: - No subnets associated
     *
     * @param subnetSelection Subnets in the given VPC to associate the ACL with.
     */
    public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnetSelection)
        cdkBuilder.subnetSelection(builder.build())
    }

    /**
     * Subnets in the given VPC to associate the ACL with.
     *
     * More subnets can always be added later by calling `associateWithSubnets()`.
     *
     * Default: - No subnets associated
     *
     * @param subnetSelection Subnets in the given VPC to associate the ACL with.
     */
    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    /**
     * The VPC in which to create the NetworkACL.
     *
     * @param vpc The VPC in which to create the NetworkACL.
     */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): NetworkAcl = cdkBuilder.build()
}
