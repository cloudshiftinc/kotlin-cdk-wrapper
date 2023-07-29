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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation
import software.constructs.Construct

/**
 * Associates a set of DHCP options with a VPC, or associates no DHCP options with the VPC.
 *
 * After you associate the options with the VPC, any existing instances and all new instances that
 * you launch in that VPC use the options. You don't need to restart or relaunch the instances. They
 * automatically pick up the changes within a few hours, depending on how frequently the instance
 * renews its DHCP lease. You can explicitly renew the lease using the operating system on the
 * instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPCDHCPOptionsAssociation cfnVPCDHCPOptionsAssociation =
 * CfnVPCDHCPOptionsAssociation.Builder.create(this, "MyCfnVPCDHCPOptionsAssociation")
 * .dhcpOptionsId("dhcpOptionsId")
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html)
 */
@CdkDslMarker
public class CfnVPCDHCPOptionsAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPCDHCPOptionsAssociation.Builder =
        CfnVPCDHCPOptionsAssociation.Builder.create(scope, id)

    /**
     * The ID of the DHCP options set, or `default` to associate no DHCP options with the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html#cfn-ec2-vpcdhcpoptionsassociation-dhcpoptionsid)
     *
     * @param dhcpOptionsId The ID of the DHCP options set, or `default` to associate no DHCP
     *   options with the VPC.
     */
    public fun dhcpOptionsId(dhcpOptionsId: String) {
        cdkBuilder.dhcpOptionsId(dhcpOptionsId)
    }

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html#cfn-ec2-vpcdhcpoptionsassociation-vpcid)
     *
     * @param vpcId The ID of the VPC.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnVPCDHCPOptionsAssociation = cdkBuilder.build()
}
