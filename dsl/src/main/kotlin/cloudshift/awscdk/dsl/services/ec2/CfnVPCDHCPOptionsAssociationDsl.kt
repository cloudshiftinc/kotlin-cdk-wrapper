@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociation
import software.constructs.Construct

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
   * @param dhcpOptionsId The ID of the DHCP options set, or `default` to associate no DHCP options
   * with the VPC. 
   */
  public fun dhcpOptionsId(dhcpOptionsId: String) {
    cdkBuilder.dhcpOptionsId(dhcpOptionsId)
  }

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcdhcpoptionsassociation.html#cfn-ec2-vpcdhcpoptionsassociation-vpcid)
   * @param vpcId The ID of the VPC. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnVPCDHCPOptionsAssociation = cdkBuilder.build()
}
