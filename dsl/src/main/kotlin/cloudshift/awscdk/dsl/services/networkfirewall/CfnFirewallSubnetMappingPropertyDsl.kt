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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkfirewall.CfnFirewall

/**
 * The ID for a subnet that you want to associate with the firewall.
 *
 * AWS Network Firewall creates an instance of the associated firewall in each subnet that you
 * specify, to filter traffic in the subnet's Availability Zone.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * SubnetMappingProperty subnetMappingProperty = SubnetMappingProperty.builder()
 * .subnetId("subnetId")
 * // the properties below are optional
 * .ipAddressType("ipAddressType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewall-subnetmapping.html)
 */
@CdkDslMarker
public class CfnFirewallSubnetMappingPropertyDsl {
    private val cdkBuilder: CfnFirewall.SubnetMappingProperty.Builder =
        CfnFirewall.SubnetMappingProperty.builder()

    /**
     * @param ipAddressType The subnet's IP address type. You can't change the IP address type after
     *   you create the subnet.
     */
    public fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    /** @param subnetId The unique identifier for the subnet. */
    public fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
    }

    public fun build(): CfnFirewall.SubnetMappingProperty = cdkBuilder.build()
}
