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

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cxapi.VpcContextResponse
import software.amazon.awscdk.cxapi.VpcSubnetGroup
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

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

    public fun ownerAccountId(ownerAccountId: String) {
        cdkBuilder.ownerAccountId(ownerAccountId)
    }

    public fun privateSubnetIds(vararg privateSubnetIds: String) {
        _privateSubnetIds.addAll(listOf(*privateSubnetIds))
    }

    public fun privateSubnetIds(privateSubnetIds: Collection<String>) {
        _privateSubnetIds.addAll(privateSubnetIds)
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

    public fun subnetGroups(subnetGroups: VpcSubnetGroupDsl.() -> Unit) {
        _subnetGroups.add(VpcSubnetGroupDsl().apply(subnetGroups).build())
    }

    public fun subnetGroups(subnetGroups: Collection<VpcSubnetGroup>) {
        _subnetGroups.addAll(subnetGroups)
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
