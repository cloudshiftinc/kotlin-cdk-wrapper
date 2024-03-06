@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.networkfirewall

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration

/**
 * A single IP address specification.
 *
 * This is used in the
 * [MatchAttributes](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html)
 * source and destination settings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * AddressProperty addressProperty = AddressProperty.builder()
 * .addressDefinition("addressDefinition")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-address.html)
 */
@CdkDslMarker
public class CfnTLSInspectionConfigurationAddressPropertyDsl {
    private val cdkBuilder: CfnTLSInspectionConfiguration.AddressProperty.Builder =
        CfnTLSInspectionConfiguration.AddressProperty.builder()

    /**
     * @param addressDefinition Specify an IP address or a block of IP addresses in Classless
     *   Inter-Domain Routing (CIDR) notation. Network Firewall supports all address ranges for IPv4
     *   and IPv6.
     *
     * Examples:
     * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
     *   `192.0.2.44/32` .
     * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
     *   specify `192.0.2.0/24` .
     * * To configure Network Firewall to inspect for the IP address
     *   1111:0000:0000:0000:0000:0000:0000:0111, specify
     *   `1111:0000:0000:0000:0000:0000:0000:0111/128` .
     * * To configure Network Firewall to inspect for IP addresses from
     *   1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     *   `1111:0000:0000:0000:0000:0000:0000:0000/64` .
     *
     * For more information about CIDR notation, see the Wikipedia entry
     * [Classless Inter-Domain Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * .
     */
    public fun addressDefinition(addressDefinition: String) {
        cdkBuilder.addressDefinition(addressDefinition)
    }

    public fun build(): CfnTLSInspectionConfiguration.AddressProperty = cdkBuilder.build()
}
