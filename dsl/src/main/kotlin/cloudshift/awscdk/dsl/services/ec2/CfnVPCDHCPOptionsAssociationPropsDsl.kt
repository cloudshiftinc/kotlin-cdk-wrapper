@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVPCDHCPOptionsAssociationProps

@CdkDslMarker
public class CfnVPCDHCPOptionsAssociationPropsDsl {
  private val cdkBuilder: CfnVPCDHCPOptionsAssociationProps.Builder =
      CfnVPCDHCPOptionsAssociationProps.builder()

  public fun dhcpOptionsId(dhcpOptionsId: String) {
    cdkBuilder.dhcpOptionsId(dhcpOptionsId)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnVPCDHCPOptionsAssociationProps = cdkBuilder.build()
}
