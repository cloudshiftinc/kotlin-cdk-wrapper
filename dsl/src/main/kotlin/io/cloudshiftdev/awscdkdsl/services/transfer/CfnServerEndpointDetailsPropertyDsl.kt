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

package io.cloudshiftdev.awscdkdsl.services.transfer

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.transfer.CfnServer

/**
 * The virtual private cloud (VPC) endpoint settings that are configured for your server.
 *
 * When you host your endpoint within your VPC, you can make your endpoint accessible only to
 * resources within your VPC, or you can attach Elastic IP addresses and make your endpoint
 * accessible to clients over the internet. Your VPC's default security groups are automatically
 * assigned to your endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.transfer.*;
 * EndpointDetailsProperty endpointDetailsProperty = EndpointDetailsProperty.builder()
 * .addressAllocationIds(List.of("addressAllocationIds"))
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcEndpointId("vpcEndpointId")
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-transfer-server-endpointdetails.html)
 */
@CdkDslMarker
public class CfnServerEndpointDetailsPropertyDsl {
    private val cdkBuilder: CfnServer.EndpointDetailsProperty.Builder =
        CfnServer.EndpointDetailsProperty.builder()

    private val _addressAllocationIds: MutableList<String> = mutableListOf()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    private val _subnetIds: MutableList<String> = mutableListOf()

    /**
     * @param addressAllocationIds A list of address allocation IDs that are required to attach an
     *   Elastic IP address to your server's endpoint. An address allocation ID corresponds to the
     *   allocation ID of an Elastic IP address. This value can be retrieved from the `allocationId`
     *   field from the Amazon EC2
     *   [Address](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Address.html) data
     *   type. One way to retrieve this value is by calling the EC2
     *   [DescribeAddresses](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html)
     *   API.
     *
     * This parameter is optional. Set this parameter if you want to make your VPC endpoint
     * public-facing. For details, see
     * [Create an internet-facing endpoint for your server](https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#create-internet-facing-endpoint)
     * .
     *
     * This property can only be set as follows:
     * * `EndpointType` must be set to `VPC`
     * * The Transfer Family server must be offline.
     * * You cannot set this parameter for Transfer Family servers that use the FTP protocol.
     * * The server must already have `SubnetIds` populated ( `SubnetIds` and `AddressAllocationIds`
     *   cannot be updated simultaneously).
     * * `AddressAllocationIds` can't contain duplicates, and must be equal in length to `SubnetIds`
     *   . For example, if you have three subnet IDs, you must also specify three address allocation
     *   IDs.
     * * Call the `UpdateServer` API to set or change this parameter.
     */
    public fun addressAllocationIds(vararg addressAllocationIds: String) {
        _addressAllocationIds.addAll(listOf(*addressAllocationIds))
    }

    /**
     * @param addressAllocationIds A list of address allocation IDs that are required to attach an
     *   Elastic IP address to your server's endpoint. An address allocation ID corresponds to the
     *   allocation ID of an Elastic IP address. This value can be retrieved from the `allocationId`
     *   field from the Amazon EC2
     *   [Address](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_Address.html) data
     *   type. One way to retrieve this value is by calling the EC2
     *   [DescribeAddresses](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAddresses.html)
     *   API.
     *
     * This parameter is optional. Set this parameter if you want to make your VPC endpoint
     * public-facing. For details, see
     * [Create an internet-facing endpoint for your server](https://docs.aws.amazon.com/transfer/latest/userguide/create-server-in-vpc.html#create-internet-facing-endpoint)
     * .
     *
     * This property can only be set as follows:
     * * `EndpointType` must be set to `VPC`
     * * The Transfer Family server must be offline.
     * * You cannot set this parameter for Transfer Family servers that use the FTP protocol.
     * * The server must already have `SubnetIds` populated ( `SubnetIds` and `AddressAllocationIds`
     *   cannot be updated simultaneously).
     * * `AddressAllocationIds` can't contain duplicates, and must be equal in length to `SubnetIds`
     *   . For example, if you have three subnet IDs, you must also specify three address allocation
     *   IDs.
     * * Call the `UpdateServer` API to set or change this parameter.
     */
    public fun addressAllocationIds(addressAllocationIds: Collection<String>) {
        _addressAllocationIds.addAll(addressAllocationIds)
    }

    /**
     * @param securityGroupIds A list of security groups IDs that are available to attach to your
     *   server's endpoint.
     *
     * This property can only be set when `EndpointType` is set to `VPC` .
     *
     * You can edit the `SecurityGroupIds` property in the
     * [UpdateServer](https://docs.aws.amazon.com/transfer/latest/userguide/API_UpdateServer.html)
     * API only if you are changing the `EndpointType` from `PUBLIC` or `VPC_ENDPOINT` to `VPC` . To
     * change security groups associated with your server's VPC endpoint after creation, use the
     * Amazon EC2
     * [ModifyVpcEndpoint](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyVpcEndpoint.html)
     * API.
     */
    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    /**
     * @param securityGroupIds A list of security groups IDs that are available to attach to your
     *   server's endpoint.
     *
     * This property can only be set when `EndpointType` is set to `VPC` .
     *
     * You can edit the `SecurityGroupIds` property in the
     * [UpdateServer](https://docs.aws.amazon.com/transfer/latest/userguide/API_UpdateServer.html)
     * API only if you are changing the `EndpointType` from `PUBLIC` or `VPC_ENDPOINT` to `VPC` . To
     * change security groups associated with your server's VPC endpoint after creation, use the
     * Amazon EC2
     * [ModifyVpcEndpoint](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyVpcEndpoint.html)
     * API.
     */
    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    /**
     * @param subnetIds A list of subnet IDs that are required to host your server endpoint in your
     *   VPC.
     *
     * This property can only be set when `EndpointType` is set to `VPC` .
     */
    public fun subnetIds(vararg subnetIds: String) {
        _subnetIds.addAll(listOf(*subnetIds))
    }

    /**
     * @param subnetIds A list of subnet IDs that are required to host your server endpoint in your
     *   VPC.
     *
     * This property can only be set when `EndpointType` is set to `VPC` .
     */
    public fun subnetIds(subnetIds: Collection<String>) {
        _subnetIds.addAll(subnetIds)
    }

    /**
     * @param vpcEndpointId The ID of the VPC endpoint.
     *
     * This property can only be set when `EndpointType` is set to `VPC_ENDPOINT` .
     */
    public fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
    }

    /**
     * @param vpcId The VPC ID of the virtual private cloud in which the server's endpoint will be
     *   hosted.
     *
     * This property can only be set when `EndpointType` is set to `VPC` .
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnServer.EndpointDetailsProperty {
        if (_addressAllocationIds.isNotEmpty())
            cdkBuilder.addressAllocationIds(_addressAllocationIds)
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        if (_subnetIds.isNotEmpty()) cdkBuilder.subnetIds(_subnetIds)
        return cdkBuilder.build()
    }
}
