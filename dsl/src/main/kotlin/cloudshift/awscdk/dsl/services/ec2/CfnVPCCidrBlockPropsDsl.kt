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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnVPCCidrBlockProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnVPCCidrBlockPropsDsl {
    private val cdkBuilder: CfnVPCCidrBlockProps.Builder = CfnVPCCidrBlockProps.builder()

    public fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: Boolean) {
        cdkBuilder.amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock)
    }

    public fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: IResolvable) {
        cdkBuilder.amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock)
    }

    public fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
    }

    public fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
        cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
        cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    public fun ipv6CidrBlock(ipv6CidrBlock: String) {
        cdkBuilder.ipv6CidrBlock(ipv6CidrBlock)
    }

    public fun ipv6IpamPoolId(ipv6IpamPoolId: String) {
        cdkBuilder.ipv6IpamPoolId(ipv6IpamPoolId)
    }

    public fun ipv6NetmaskLength(ipv6NetmaskLength: Number) {
        cdkBuilder.ipv6NetmaskLength(ipv6NetmaskLength)
    }

    public fun ipv6Pool(ipv6Pool: String) {
        cdkBuilder.ipv6Pool(ipv6Pool)
    }

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnVPCCidrBlockProps = cdkBuilder.build()
}
