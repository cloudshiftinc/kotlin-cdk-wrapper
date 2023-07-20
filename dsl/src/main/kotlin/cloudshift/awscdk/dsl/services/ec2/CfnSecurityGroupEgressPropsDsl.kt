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
import software.amazon.awscdk.services.ec2.CfnSecurityGroupEgressProps
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnSecurityGroupEgressPropsDsl {
    private val cdkBuilder: CfnSecurityGroupEgressProps.Builder =
        CfnSecurityGroupEgressProps.builder()

    public fun cidrIp(cidrIp: String) {
        cdkBuilder.cidrIp(cidrIp)
    }

    public fun cidrIpv6(cidrIpv6: String) {
        cdkBuilder.cidrIpv6(cidrIpv6)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun destinationPrefixListId(destinationPrefixListId: String) {
        cdkBuilder.destinationPrefixListId(destinationPrefixListId)
    }

    public fun destinationSecurityGroupId(destinationSecurityGroupId: String) {
        cdkBuilder.destinationSecurityGroupId(destinationSecurityGroupId)
    }

    public fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
    }

    public fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
    }

    public fun ipProtocol(ipProtocol: String) {
        cdkBuilder.ipProtocol(ipProtocol)
    }

    public fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
    }

    public fun build(): CfnSecurityGroupEgressProps = cdkBuilder.build()
}
