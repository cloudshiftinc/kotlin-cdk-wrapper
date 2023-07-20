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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.networkfirewall.CfnFirewall
import kotlin.String

@CdkDslMarker
public class CfnFirewallSubnetMappingPropertyDsl {
    private val cdkBuilder: CfnFirewall.SubnetMappingProperty.Builder =
        CfnFirewall.SubnetMappingProperty.builder()

    public fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnFirewall.SubnetMappingProperty = cdkBuilder.build()
}
