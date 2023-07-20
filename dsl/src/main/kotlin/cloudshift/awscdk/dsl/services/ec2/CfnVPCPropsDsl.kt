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
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVPCProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnVPCPropsDsl {
    private val cdkBuilder: CfnVPCProps.Builder = CfnVPCProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
    }

    public fun enableDnsHostnames(enableDnsHostnames: Boolean) {
        cdkBuilder.enableDnsHostnames(enableDnsHostnames)
    }

    public fun enableDnsHostnames(enableDnsHostnames: IResolvable) {
        cdkBuilder.enableDnsHostnames(enableDnsHostnames)
    }

    public fun enableDnsSupport(enableDnsSupport: Boolean) {
        cdkBuilder.enableDnsSupport(enableDnsSupport)
    }

    public fun enableDnsSupport(enableDnsSupport: IResolvable) {
        cdkBuilder.enableDnsSupport(enableDnsSupport)
    }

    public fun instanceTenancy(instanceTenancy: String) {
        cdkBuilder.instanceTenancy(instanceTenancy)
    }

    public fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
        cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
        cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnVPCProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
