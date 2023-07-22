@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps

@CdkDslMarker
public class CfnVPCDHCPOptionsAssociationPropsDsl {
  private val cdkBuilder: CfnVPCDHCPOptionsAssociationProps.Builder =
      CfnVPCDHCPOptionsAssociationProps.builder()

  /**
   * @param dhcpOptionsId The ID of the DHCP options set, or `default` to associate no DHCP options
   * with the VPC. 
   */
  public fun dhcpOptionsId(dhcpOptionsId: String) {
    cdkBuilder.dhcpOptionsId(dhcpOptionsId)
  }

  /**
   * @param vpcId The ID of the VPC. 
   */
  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnVPCDHCPOptionsAssociationProps = cdkBuilder.build()
}
