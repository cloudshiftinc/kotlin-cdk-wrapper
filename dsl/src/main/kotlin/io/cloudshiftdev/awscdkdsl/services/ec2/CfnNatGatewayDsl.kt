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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnNatGateway
import software.constructs.Construct

/**
 * Specifies a network address translation (NAT) gateway in the specified subnet.
 *
 * You can create either a public NAT gateway or a private NAT gateway. The default is a public NAT
 * gateway. If you create a public NAT gateway, you must specify an elastic IP address.
 *
 * With a NAT gateway, instances in a private subnet can connect to the internet, other AWS
 * services, or an on-premises network using the IP address of the NAT gateway. For more
 * information, see
 * [NAT gateways](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html) in the
 * *Amazon VPC User Guide* .
 *
 * If you add a default route ( `AWS::EC2::Route` resource) that points to a NAT gateway, specify
 * the NAT gateway ID for the route's `NatGatewayId` property.
 *
 * When you associate an Elastic IP address or secondary Elastic IP address with a public NAT
 * gateway, the network border group of the Elastic IP address must match the network border group
 * of the Availability Zone (AZ) that the public NAT gateway is in. Otherwise, the NAT gateway fails
 * to launch. You can see the network border group for the AZ by viewing the details of the subnet.
 * Similarly, you can view the network border group for the Elastic IP address by viewing its
 * details. For more information, see
 * [Allocate an Elastic IP address](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-eips.html#allocate-eip)
 * in the *Amazon VPC User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnNatGateway cfnNatGateway = CfnNatGateway.Builder.create(this, "MyCfnNatGateway")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .allocationId("allocationId")
 * .connectivityType("connectivityType")
 * .maxDrainDurationSeconds(123)
 * .privateIpAddress("privateIpAddress")
 * .secondaryAllocationIds(List.of("secondaryAllocationIds"))
 * .secondaryPrivateIpAddressCount(123)
 * .secondaryPrivateIpAddresses(List.of("secondaryPrivateIpAddresses"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html)
 */
@CdkDslMarker
public class CfnNatGatewayDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNatGateway.Builder = CfnNatGateway.Builder.create(scope, id)

    private val _secondaryAllocationIds: MutableList<String> = mutableListOf()

    private val _secondaryPrivateIpAddresses: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * [Public NAT gateway only] The allocation ID of the Elastic IP address that's associated with
     * the NAT gateway.
     *
     * This property is required for a public NAT gateway and cannot be specified with a private NAT
     * gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-allocationid)
     *
     * @param allocationId [Public NAT gateway only] The allocation ID of the Elastic IP address
     *   that's associated with the NAT gateway.
     */
    public fun allocationId(allocationId: String) {
        cdkBuilder.allocationId(allocationId)
    }

    /**
     * Indicates whether the NAT gateway supports public or private connectivity.
     *
     * The default is public connectivity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-connectivitytype)
     *
     * @param connectivityType Indicates whether the NAT gateway supports public or private
     *   connectivity.
     */
    public fun connectivityType(connectivityType: String) {
        cdkBuilder.connectivityType(connectivityType)
    }

    /**
     * The maximum amount of time to wait (in seconds) before forcibly releasing the IP addresses if
     * connections are still in progress.
     *
     * Default value is 350 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-maxdraindurationseconds)
     *
     * @param maxDrainDurationSeconds The maximum amount of time to wait (in seconds) before
     *   forcibly releasing the IP addresses if connections are still in progress.
     */
    public fun maxDrainDurationSeconds(maxDrainDurationSeconds: Number) {
        cdkBuilder.maxDrainDurationSeconds(maxDrainDurationSeconds)
    }

    /**
     * The private IPv4 address to assign to the NAT gateway.
     *
     * If you don't provide an address, a private IPv4 address will be automatically assigned.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-privateipaddress)
     *
     * @param privateIpAddress The private IPv4 address to assign to the NAT gateway.
     */
    public fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
    }

    /**
     * Secondary EIP allocation IDs.
     *
     * For more information, see
     * [Create a NAT gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon VPC User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryallocationids)
     *
     * @param secondaryAllocationIds Secondary EIP allocation IDs.
     */
    public fun secondaryAllocationIds(vararg secondaryAllocationIds: String) {
        _secondaryAllocationIds.addAll(listOf(*secondaryAllocationIds))
    }

    /**
     * Secondary EIP allocation IDs.
     *
     * For more information, see
     * [Create a NAT gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon VPC User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryallocationids)
     *
     * @param secondaryAllocationIds Secondary EIP allocation IDs.
     */
    public fun secondaryAllocationIds(secondaryAllocationIds: Collection<String>) {
        _secondaryAllocationIds.addAll(secondaryAllocationIds)
    }

    /**
     * [Private NAT gateway only] The number of secondary private IPv4 addresses you want to assign
     * to the NAT gateway.
     *
     * For more information about secondary addresses, see
     * [Create a NAT gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryprivateipaddresscount)
     *
     * @param secondaryPrivateIpAddressCount [Private NAT gateway only] The number of secondary
     *   private IPv4 addresses you want to assign to the NAT gateway.
     */
    public fun secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount: Number) {
        cdkBuilder.secondaryPrivateIpAddressCount(secondaryPrivateIpAddressCount)
    }

    /**
     * Secondary private IPv4 addresses.
     *
     * For more information about secondary addresses, see
     * [Create a NAT gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryprivateipaddresses)
     *
     * @param secondaryPrivateIpAddresses Secondary private IPv4 addresses.
     */
    public fun secondaryPrivateIpAddresses(vararg secondaryPrivateIpAddresses: String) {
        _secondaryPrivateIpAddresses.addAll(listOf(*secondaryPrivateIpAddresses))
    }

    /**
     * Secondary private IPv4 addresses.
     *
     * For more information about secondary addresses, see
     * [Create a NAT gateway](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-nat-gateway.html#nat-gateway-creating)
     * in the *Amazon Virtual Private Cloud User Guide* .
     *
     * `SecondaryPrivateIpAddressCount` and `SecondaryPrivateIpAddresses` cannot be set at the same
     * time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-secondaryprivateipaddresses)
     *
     * @param secondaryPrivateIpAddresses Secondary private IPv4 addresses.
     */
    public fun secondaryPrivateIpAddresses(secondaryPrivateIpAddresses: Collection<String>) {
        _secondaryPrivateIpAddresses.addAll(secondaryPrivateIpAddresses)
    }

    /**
     * The ID of the subnet in which the NAT gateway is located.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-subnetid)
     *
     * @param subnetId The ID of the subnet in which the NAT gateway is located.
     */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    /**
     * The tags for the NAT gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-tags)
     *
     * @param tags The tags for the NAT gateway.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags for the NAT gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-natgateway.html#cfn-ec2-natgateway-tags)
     *
     * @param tags The tags for the NAT gateway.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnNatGateway {
        if (_secondaryAllocationIds.isNotEmpty())
            cdkBuilder.secondaryAllocationIds(_secondaryAllocationIds)
        if (_secondaryPrivateIpAddresses.isNotEmpty())
            cdkBuilder.secondaryPrivateIpAddresses(_secondaryPrivateIpAddresses)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
