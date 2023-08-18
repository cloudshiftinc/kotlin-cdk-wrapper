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

package io.cloudshiftdev.awscdkdsl.services.devicefarm

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.devicefarm.CfnTestGridProject

/**
 * The VPC security groups and subnets attached to the `TestGrid` project.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devicefarm.*;
 * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-devicefarm-testgridproject-vpcconfig.html)
 */
@CdkDslMarker
public class CfnTestGridProjectVpcConfigPropertyDsl {
    private val cdkBuilder: CfnTestGridProject.VpcConfigProperty.Builder =
        CfnTestGridProject.VpcConfigProperty.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    /**
     * @param securityGroupIds A list of VPC security group IDs. A security group allows inbound
     *   traffic from network interfaces (and their associated instances) that are assigned to the
     *   same security group. See
     *   [Security groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
     *   in the *Amazon Virtual Private Cloud user guide* .
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds A list of VPC security group IDs. A security group allows inbound
     *   traffic from network interfaces (and their associated instances) that are assigned to the
     *   same security group. See
     *   [Security groups](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html)
     *   in the *Amazon Virtual Private Cloud user guide* .
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * @param subnetIds A list of VPC subnet IDs. A subnet is a range of IP addresses in your VPC.
     *   You can launch Amazon resources, such as EC2 instances, into a specific subnet. When you
     *   create a subnet, you specify the IPv4 CIDR block for the subnet, which is a subset of the
     *   VPC CIDR block. See
     *   [VPCs and subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in
     *   the *Amazon Virtual Private Cloud user guide* .
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds A list of VPC subnet IDs. A subnet is a range of IP addresses in your VPC.
     *   You can launch Amazon resources, such as EC2 instances, into a specific subnet. When you
     *   create a subnet, you specify the IPv4 CIDR block for the subnet, which is a subset of the
     *   VPC CIDR block. See
     *   [VPCs and subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) in
     *   the *Amazon Virtual Private Cloud user guide* .
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /** @param vpcId A list of VPC IDs. Each VPC is given a unique ID upon creation. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnTestGridProject.VpcConfigProperty {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
