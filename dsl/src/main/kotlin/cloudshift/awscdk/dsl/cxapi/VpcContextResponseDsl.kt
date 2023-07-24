@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cxapi.VpcContextResponse
import software.amazon.awscdk.cxapi.VpcSubnetGroup
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

/**
 * Properties of a discovered VPC.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.cxapi.*;
 * VpcContextResponse vpcContextResponse = VpcContextResponse.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .vpcId("vpcId")
 * // the properties below are optional
 * .isolatedSubnetIds(List.of("isolatedSubnetIds"))
 * .isolatedSubnetNames(List.of("isolatedSubnetNames"))
 * .isolatedSubnetRouteTableIds(List.of("isolatedSubnetRouteTableIds"))
 * .ownerAccountId("ownerAccountId")
 * .privateSubnetIds(List.of("privateSubnetIds"))
 * .privateSubnetNames(List.of("privateSubnetNames"))
 * .privateSubnetRouteTableIds(List.of("privateSubnetRouteTableIds"))
 * .publicSubnetIds(List.of("publicSubnetIds"))
 * .publicSubnetNames(List.of("publicSubnetNames"))
 * .publicSubnetRouteTableIds(List.of("publicSubnetRouteTableIds"))
 * .region("region")
 * .subnetGroups(List.of(VpcSubnetGroup.builder()
 * .name("name")
 * .subnets(List.of(VpcSubnet.builder()
 * .availabilityZone("availabilityZone")
 * .routeTableId("routeTableId")
 * .subnetId("subnetId")
 * // the properties below are optional
 * .cidr("cidr")
 * .build()))
 * .type(VpcSubnetGroupType.PUBLIC)
 * .build()))
 * .vpcCidrBlock("vpcCidrBlock")
 * .vpnGatewayId("vpnGatewayId")
 * .build();
 * ```
 */
@CdkDslMarker
public class VpcContextResponseDsl {
    private val cdkBuilder: VpcContextResponse.Builder = VpcContextResponse.builder()

    private val _availabilityZones: MutableList<String> = mutableListOf()

    private val _isolatedSubnetIds: MutableList<String> = mutableListOf()

    private val _isolatedSubnetNames: MutableList<String> = mutableListOf()

    private val _isolatedSubnetRouteTableIds: MutableList<String> = mutableListOf()

    private val _privateSubnetIds: MutableList<String> = mutableListOf()

    private val _privateSubnetNames: MutableList<String> = mutableListOf()

    private val _privateSubnetRouteTableIds: MutableList<String> = mutableListOf()

    private val _publicSubnetIds: MutableList<String> = mutableListOf()

    private val _publicSubnetNames: MutableList<String> = mutableListOf()

    private val _publicSubnetRouteTableIds: MutableList<String> = mutableListOf()

    private val _subnetGroups: MutableList<VpcSubnetGroup> = mutableListOf()

    /**
     * @param availabilityZones AZs.
     */
    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    /**
     * @param availabilityZones AZs.
     */
    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    /**
     * @param isolatedSubnetIds IDs of all isolated subnets.
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    public fun isolatedSubnetIds(vararg isolatedSubnetIds: String) {
        _isolatedSubnetIds.addAll(listOf(*isolatedSubnetIds))
    }

    /**
     * @param isolatedSubnetIds IDs of all isolated subnets.
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    public fun isolatedSubnetIds(isolatedSubnetIds: Collection<String>) {
        _isolatedSubnetIds.addAll(isolatedSubnetIds)
    }

    /**
     * @param isolatedSubnetNames Name of isolated subnet groups.
     * Element count: #(isolatedGroups)
     */
    public fun isolatedSubnetNames(vararg isolatedSubnetNames: String) {
        _isolatedSubnetNames.addAll(listOf(*isolatedSubnetNames))
    }

    /**
     * @param isolatedSubnetNames Name of isolated subnet groups.
     * Element count: #(isolatedGroups)
     */
    public fun isolatedSubnetNames(isolatedSubnetNames: Collection<String>) {
        _isolatedSubnetNames.addAll(isolatedSubnetNames)
    }

    /**
     * @param isolatedSubnetRouteTableIds Route Table IDs of isolated subnet groups.
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    public fun isolatedSubnetRouteTableIds(vararg isolatedSubnetRouteTableIds: String) {
        _isolatedSubnetRouteTableIds.addAll(listOf(*isolatedSubnetRouteTableIds))
    }

    /**
     * @param isolatedSubnetRouteTableIds Route Table IDs of isolated subnet groups.
     * Element count: #(availabilityZones)   #(isolatedGroups)
     */
    public fun isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds: Collection<String>) {
        _isolatedSubnetRouteTableIds.addAll(isolatedSubnetRouteTableIds)
    }

    /**
     * @param ownerAccountId The ID of the AWS account that owns the VPC.
     */
    public fun ownerAccountId(ownerAccountId: String) {
        cdkBuilder.ownerAccountId(ownerAccountId)
    }

    /**
     * @param privateSubnetIds IDs of all private subnets.
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    public fun privateSubnetIds(vararg privateSubnetIds: String) {
        _privateSubnetIds.addAll(listOf(*privateSubnetIds))
    }

    /**
     * @param privateSubnetIds IDs of all private subnets.
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    public fun privateSubnetIds(privateSubnetIds: Collection<String>) {
        _privateSubnetIds.addAll(privateSubnetIds)
    }

    /**
     * @param privateSubnetNames Name of private subnet groups.
     * Element count: #(privateGroups)
     */
    public fun privateSubnetNames(vararg privateSubnetNames: String) {
        _privateSubnetNames.addAll(listOf(*privateSubnetNames))
    }

    /**
     * @param privateSubnetNames Name of private subnet groups.
     * Element count: #(privateGroups)
     */
    public fun privateSubnetNames(privateSubnetNames: Collection<String>) {
        _privateSubnetNames.addAll(privateSubnetNames)
    }

    /**
     * @param privateSubnetRouteTableIds Route Table IDs of private subnet groups.
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    public fun privateSubnetRouteTableIds(vararg privateSubnetRouteTableIds: String) {
        _privateSubnetRouteTableIds.addAll(listOf(*privateSubnetRouteTableIds))
    }

    /**
     * @param privateSubnetRouteTableIds Route Table IDs of private subnet groups.
     * Element count: #(availabilityZones)   #(privateGroups)
     */
    public fun privateSubnetRouteTableIds(privateSubnetRouteTableIds: Collection<String>) {
        _privateSubnetRouteTableIds.addAll(privateSubnetRouteTableIds)
    }

    /**
     * @param publicSubnetIds IDs of all public subnets.
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    public fun publicSubnetIds(vararg publicSubnetIds: String) {
        _publicSubnetIds.addAll(listOf(*publicSubnetIds))
    }

    /**
     * @param publicSubnetIds IDs of all public subnets.
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    public fun publicSubnetIds(publicSubnetIds: Collection<String>) {
        _publicSubnetIds.addAll(publicSubnetIds)
    }

    /**
     * @param publicSubnetNames Name of public subnet groups.
     * Element count: #(publicGroups)
     */
    public fun publicSubnetNames(vararg publicSubnetNames: String) {
        _publicSubnetNames.addAll(listOf(*publicSubnetNames))
    }

    /**
     * @param publicSubnetNames Name of public subnet groups.
     * Element count: #(publicGroups)
     */
    public fun publicSubnetNames(publicSubnetNames: Collection<String>) {
        _publicSubnetNames.addAll(publicSubnetNames)
    }

    /**
     * @param publicSubnetRouteTableIds Route Table IDs of public subnet groups.
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    public fun publicSubnetRouteTableIds(vararg publicSubnetRouteTableIds: String) {
        _publicSubnetRouteTableIds.addAll(listOf(*publicSubnetRouteTableIds))
    }

    /**
     * @param publicSubnetRouteTableIds Route Table IDs of public subnet groups.
     * Element count: #(availabilityZones)   #(publicGroups)
     */
    public fun publicSubnetRouteTableIds(publicSubnetRouteTableIds: Collection<String>) {
        _publicSubnetRouteTableIds.addAll(publicSubnetRouteTableIds)
    }

    /**
     * @param region The region in which the VPC is in.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * @param subnetGroups The subnet groups discovered for the given VPC.
     * Unlike the above properties, this will include asymmetric subnets,
     * if the VPC has any.
     * This property will only be populated if `VpcContextQuery.returnAsymmetricSubnets`
     * is true.
     */
    public fun subnetGroups(subnetGroups: VpcSubnetGroupDsl.() -> Unit) {
        _subnetGroups.add(VpcSubnetGroupDsl().apply(subnetGroups).build())
    }

    /**
     * @param subnetGroups The subnet groups discovered for the given VPC.
     * Unlike the above properties, this will include asymmetric subnets,
     * if the VPC has any.
     * This property will only be populated if `VpcContextQuery.returnAsymmetricSubnets`
     * is true.
     */
    public fun subnetGroups(subnetGroups: Collection<VpcSubnetGroup>) {
        _subnetGroups.addAll(subnetGroups)
    }

    /**
     * @param vpcCidrBlock VPC cidr.
     */
    public fun vpcCidrBlock(vpcCidrBlock: String) {
        cdkBuilder.vpcCidrBlock(vpcCidrBlock)
    }

    /**
     * @param vpcId VPC id.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    /**
     * @param vpnGatewayId The VPN gateway ID.
     */
    public fun vpnGatewayId(vpnGatewayId: String) {
        cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): VpcContextResponse {
        if (_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
        if (_isolatedSubnetIds.isNotEmpty()) cdkBuilder.isolatedSubnetIds(_isolatedSubnetIds)
        if (_isolatedSubnetNames.isNotEmpty()) cdkBuilder.isolatedSubnetNames(_isolatedSubnetNames)
        if (_isolatedSubnetRouteTableIds.isNotEmpty()) {
            cdkBuilder.isolatedSubnetRouteTableIds(_isolatedSubnetRouteTableIds)
        }
        if (_privateSubnetIds.isNotEmpty()) cdkBuilder.privateSubnetIds(_privateSubnetIds)
        if (_privateSubnetNames.isNotEmpty()) cdkBuilder.privateSubnetNames(_privateSubnetNames)
        if (_privateSubnetRouteTableIds.isNotEmpty()) {
            cdkBuilder.privateSubnetRouteTableIds(_privateSubnetRouteTableIds)
        }
        if (_publicSubnetIds.isNotEmpty()) cdkBuilder.publicSubnetIds(_publicSubnetIds)
        if (_publicSubnetNames.isNotEmpty()) cdkBuilder.publicSubnetNames(_publicSubnetNames)
        if (_publicSubnetRouteTableIds.isNotEmpty()) {
            cdkBuilder.publicSubnetRouteTableIds(_publicSubnetRouteTableIds)
        }
        if (_subnetGroups.isNotEmpty()) cdkBuilder.subnetGroups(_subnetGroups)
        return cdkBuilder.build()
    }
}
