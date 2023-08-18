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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps

/**
 * Properties for defining a `CfnVPCDHCPOptionsAssociation`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPCDHCPOptionsAssociationProps cfnVPCDHCPOptionsAssociationProps =
 * CfnVPCDHCPOptionsAssociationProps.builder()
 * .dhcpOptionsId("dhcpOptionsId")
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html)
 */
@CdkDslMarker
public class CfnVPCDHCPOptionsAssociationPropsDsl {
    private val cdkBuilder: CfnVPCDHCPOptionsAssociationProps.Builder =
        CfnVPCDHCPOptionsAssociationProps.builder()

    /**
     * @param dhcpOptionsId The ID of the DHCP options set, or `default` to associate no DHCP
     *   options with the VPC.
     */
    public fun dhcpOptionsId(dhcpOptionsId: String) {
        cdkBuilder.dhcpOptionsId(dhcpOptionsId)
    }

    /** @param vpcId The ID of the VPC. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnVPCDHCPOptionsAssociationProps = cdkBuilder.build()
}
