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
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnSubnet
import software.constructs.Construct
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnSubnetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSubnet.Builder = CfnSubnet.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: Boolean) {
        cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    public fun assignIpv6AddressOnCreation(assignIpv6AddressOnCreation: IResolvable) {
        cdkBuilder.assignIpv6AddressOnCreation(assignIpv6AddressOnCreation)
    }

    public fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
    }

    public fun availabilityZoneId(availabilityZoneId: String) {
        cdkBuilder.availabilityZoneId(availabilityZoneId)
    }

    public fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
    }

    public fun enableDns64(enableDns64: Boolean) {
        cdkBuilder.enableDns64(enableDns64)
    }

    public fun enableDns64(enableDns64: IResolvable) {
        cdkBuilder.enableDns64(enableDns64)
    }

    public fun ipv6CidrBlock(ipv6CidrBlock: String) {
        cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    public fun ipv6Native(ipv6Native: Boolean) {
        cdkBuilder.ipv6Native(ipv6Native)
    }

    public fun ipv6Native(ipv6Native: IResolvable) {
        cdkBuilder.ipv6Native(ipv6Native)
    }

    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: Boolean) {
        cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    public fun mapPublicIpOnLaunch(mapPublicIpOnLaunch: IResolvable) {
        cdkBuilder.mapPublicIpOnLaunch(mapPublicIpOnLaunch)
    }

    public fun outpostArn(outpostArn: String) {
        cdkBuilder.outpostArn(outpostArn)
    }

    public fun privateDnsNameOptionsOnLaunch(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.privateDnsNameOptionsOnLaunch(builder.map)
    }

    public fun privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch: Any) {
        cdkBuilder.privateDnsNameOptionsOnLaunch(privateDnsNameOptionsOnLaunch)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnSubnet {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
