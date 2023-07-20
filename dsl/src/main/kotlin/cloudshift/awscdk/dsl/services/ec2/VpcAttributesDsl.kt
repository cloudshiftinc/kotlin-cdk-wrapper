@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.VpcAttributes
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class VpcAttributesDsl {
    private val cdkBuilder: VpcAttributes.Builder = VpcAttributes.builder()

    private val _availabilityZones: MutableList<String> = mutableListOf()

    private val _isolatedSubnetIds: MutableList<String> = mutableListOf()

    private val _isolatedSubnetIpv4CidrBlocks: MutableList<String> = mutableListOf()

    private val _isolatedSubnetNames: MutableList<String> = mutableListOf()

    private val _isolatedSubnetRouteTableIds: MutableList<String> = mutableListOf()

    private val _privateSubnetIds: MutableList<String> = mutableListOf()

    private val _privateSubnetIpv4CidrBlocks: MutableList<String> = mutableListOf()

    private val _privateSubnetNames: MutableList<String> = mutableListOf()

    private val _privateSubnetRouteTableIds: MutableList<String> = mutableListOf()

    private val _publicSubnetIds: MutableList<String> = mutableListOf()

    private val _publicSubnetIpv4CidrBlocks: MutableList<String> = mutableListOf()

    private val _publicSubnetNames: MutableList<String> = mutableListOf()

    private val _publicSubnetRouteTableIds: MutableList<String> = mutableListOf()

    public fun availabilityZones(vararg availabilityZones: String) {
        _availabilityZones.addAll(listOf(*availabilityZones))
    }

    public fun availabilityZones(availabilityZones: Collection<String>) {
        _availabilityZones.addAll(availabilityZones)
    }

    public fun isolatedSubnetIds(vararg isolatedSubnetIds: String) {
        _isolatedSubnetIds.addAll(listOf(*isolatedSubnetIds))
    }

    public fun isolatedSubnetIds(isolatedSubnetIds: Collection<String>) {
        _isolatedSubnetIds.addAll(isolatedSubnetIds)
    }

    public fun isolatedSubnetIpv4CidrBlocks(vararg isolatedSubnetIpv4CidrBlocks: String) {
        _isolatedSubnetIpv4CidrBlocks.addAll(listOf(*isolatedSubnetIpv4CidrBlocks))
    }

    public fun isolatedSubnetIpv4CidrBlocks(isolatedSubnetIpv4CidrBlocks: Collection<String>) {
        _isolatedSubnetIpv4CidrBlocks.addAll(isolatedSubnetIpv4CidrBlocks)
    }

    public fun isolatedSubnetNames(vararg isolatedSubnetNames: String) {
        _isolatedSubnetNames.addAll(listOf(*isolatedSubnetNames))
    }

    public fun isolatedSubnetNames(isolatedSubnetNames: Collection<String>) {
        _isolatedSubnetNames.addAll(isolatedSubnetNames)
    }

    public fun isolatedSubnetRouteTableIds(vararg isolatedSubnetRouteTableIds: String) {
        _isolatedSubnetRouteTableIds.addAll(listOf(*isolatedSubnetRouteTableIds))
    }

    public fun isolatedSubnetRouteTableIds(isolatedSubnetRouteTableIds: Collection<String>) {
        _isolatedSubnetRouteTableIds.addAll(isolatedSubnetRouteTableIds)
    }

    public fun privateSubnetIds(vararg privateSubnetIds: String) {
        _privateSubnetIds.addAll(listOf(*privateSubnetIds))
    }

    public fun privateSubnetIds(privateSubnetIds: Collection<String>) {
        _privateSubnetIds.addAll(privateSubnetIds)
    }

    public fun privateSubnetIpv4CidrBlocks(vararg privateSubnetIpv4CidrBlocks: String) {
        _privateSubnetIpv4CidrBlocks.addAll(listOf(*privateSubnetIpv4CidrBlocks))
    }

    public fun privateSubnetIpv4CidrBlocks(privateSubnetIpv4CidrBlocks: Collection<String>) {
        _privateSubnetIpv4CidrBlocks.addAll(privateSubnetIpv4CidrBlocks)
    }

    public fun privateSubnetNames(vararg privateSubnetNames: String) {
        _privateSubnetNames.addAll(listOf(*privateSubnetNames))
    }

    public fun privateSubnetNames(privateSubnetNames: Collection<String>) {
        _privateSubnetNames.addAll(privateSubnetNames)
    }

    public fun privateSubnetRouteTableIds(vararg privateSubnetRouteTableIds: String) {
        _privateSubnetRouteTableIds.addAll(listOf(*privateSubnetRouteTableIds))
    }

    public fun privateSubnetRouteTableIds(privateSubnetRouteTableIds: Collection<String>) {
        _privateSubnetRouteTableIds.addAll(privateSubnetRouteTableIds)
    }

    public fun publicSubnetIds(vararg publicSubnetIds: String) {
        _publicSubnetIds.addAll(listOf(*publicSubnetIds))
    }

    public fun publicSubnetIds(publicSubnetIds: Collection<String>) {
        _publicSubnetIds.addAll(publicSubnetIds)
    }

    public fun publicSubnetIpv4CidrBlocks(vararg publicSubnetIpv4CidrBlocks: String) {
        _publicSubnetIpv4CidrBlocks.addAll(listOf(*publicSubnetIpv4CidrBlocks))
    }

    public fun publicSubnetIpv4CidrBlocks(publicSubnetIpv4CidrBlocks: Collection<String>) {
        _publicSubnetIpv4CidrBlocks.addAll(publicSubnetIpv4CidrBlocks)
    }

    public fun publicSubnetNames(vararg publicSubnetNames: String) {
        _publicSubnetNames.addAll(listOf(*publicSubnetNames))
    }

    public fun publicSubnetNames(publicSubnetNames: Collection<String>) {
        _publicSubnetNames.addAll(publicSubnetNames)
    }

    public fun publicSubnetRouteTableIds(vararg publicSubnetRouteTableIds: String) {
        _publicSubnetRouteTableIds.addAll(listOf(*publicSubnetRouteTableIds))
    }

    public fun publicSubnetRouteTableIds(publicSubnetRouteTableIds: Collection<String>) {
        _publicSubnetRouteTableIds.addAll(publicSubnetRouteTableIds)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun vpcCidrBlock(vpcCidrBlock: String) {
        cdkBuilder.vpcCidrBlock(vpcCidrBlock)
    }

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun vpnGatewayId(vpnGatewayId: String) {
        cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): VpcAttributes {
        if (_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
        if (_isolatedSubnetIds.isNotEmpty()) cdkBuilder.isolatedSubnetIds(_isolatedSubnetIds)
        if (_isolatedSubnetIpv4CidrBlocks.isNotEmpty()) {
            cdkBuilder.isolatedSubnetIpv4CidrBlocks(_isolatedSubnetIpv4CidrBlocks)
        }
        if (_isolatedSubnetNames.isNotEmpty()) cdkBuilder.isolatedSubnetNames(_isolatedSubnetNames)
        if (_isolatedSubnetRouteTableIds.isNotEmpty()) {
            cdkBuilder.isolatedSubnetRouteTableIds(_isolatedSubnetRouteTableIds)
        }
        if (_privateSubnetIds.isNotEmpty()) cdkBuilder.privateSubnetIds(_privateSubnetIds)
        if (_privateSubnetIpv4CidrBlocks.isNotEmpty()) {
            cdkBuilder.privateSubnetIpv4CidrBlocks(_privateSubnetIpv4CidrBlocks)
        }
        if (_privateSubnetNames.isNotEmpty()) cdkBuilder.privateSubnetNames(_privateSubnetNames)
        if (_privateSubnetRouteTableIds.isNotEmpty()) {
            cdkBuilder.privateSubnetRouteTableIds(_privateSubnetRouteTableIds)
        }
        if (_publicSubnetIds.isNotEmpty()) cdkBuilder.publicSubnetIds(_publicSubnetIds)
        if (_publicSubnetIpv4CidrBlocks.isNotEmpty()) {
            cdkBuilder.publicSubnetIpv4CidrBlocks(_publicSubnetIpv4CidrBlocks)
        }
        if (_publicSubnetNames.isNotEmpty()) cdkBuilder.publicSubnetNames(_publicSubnetNames)
        if (_publicSubnetRouteTableIds.isNotEmpty()) {
            cdkBuilder.publicSubnetRouteTableIds(_publicSubnetRouteTableIds)
        }
        return cdkBuilder.build()
    }
}
