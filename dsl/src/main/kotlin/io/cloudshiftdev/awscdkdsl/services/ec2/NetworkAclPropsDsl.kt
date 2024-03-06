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
import software.amazon.awscdk.services.ec2.NetworkAclProps
import software.amazon.awscdk.services.ec2.SubnetSelection

/**
 * Properties to create NetworkAcl.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * NetworkAclProps networkAclProps = NetworkAclProps.builder()
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
public class NetworkAclPropsDsl {
    private val cdkBuilder: NetworkAclProps.Builder = NetworkAclProps.builder()

    /**
     * @param networkAclName The name of the NetworkAcl. Since the NetworkAcl resource doesn't
     *   support providing a physical name, the value provided here will be recorded in the `Name`
     *   tag.
     */
    public fun networkAclName(networkAclName: String) {
        cdkBuilder.networkAclName(networkAclName)
    }

    /**
     * @param subnetSelection Subnets in the given VPC to associate the ACL with. More subnets can
     *   always be added later by calling `associateWithSubnets()`.
     */
    public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(subnetSelection)
        cdkBuilder.subnetSelection(builder.build())
    }

    /**
     * @param subnetSelection Subnets in the given VPC to associate the ACL with. More subnets can
     *   always be added later by calling `associateWithSubnets()`.
     */
    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    /** @param vpc The VPC in which to create the NetworkACL. */
    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): NetworkAclProps = cdkBuilder.build()
}
