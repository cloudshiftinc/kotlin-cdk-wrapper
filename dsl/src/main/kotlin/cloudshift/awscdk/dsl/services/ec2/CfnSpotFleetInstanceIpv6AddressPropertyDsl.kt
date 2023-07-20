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
import software.amazon.awscdk.services.ec2.CfnSpotFleet
import kotlin.String

@CdkDslMarker
public class CfnSpotFleetInstanceIpv6AddressPropertyDsl {
    private val cdkBuilder: CfnSpotFleet.InstanceIpv6AddressProperty.Builder =
        CfnSpotFleet.InstanceIpv6AddressProperty.builder()

    public fun ipv6Address(ipv6Address: String) {
        cdkBuilder.ipv6Address(ipv6Address)
    }

    public fun build(): CfnSpotFleet.InstanceIpv6AddressProperty = cdkBuilder.build()
}
