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
import software.amazon.awscdk.services.ec2.VpcIpamOptions
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class VpcIpamOptionsDsl {
    private val cdkBuilder: VpcIpamOptions.Builder = VpcIpamOptions.builder()

    public fun cidrBlock(cidrBlock: String) {
        cdkBuilder.cidrBlock(cidrBlock)
    }

    public fun ipv4IpamPoolId(ipv4IpamPoolId: String) {
        cdkBuilder.ipv4IpamPoolId(ipv4IpamPoolId)
    }

    public fun ipv4NetmaskLength(ipv4NetmaskLength: Number) {
        cdkBuilder.ipv4NetmaskLength(ipv4NetmaskLength)
    }

    public fun build(): VpcIpamOptions = cdkBuilder.build()
}
