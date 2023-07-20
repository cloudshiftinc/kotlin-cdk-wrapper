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

  public fun dhcpOptionsId(dhcpOptionsId: String) {
    cdkBuilder.dhcpOptionsId(dhcpOptionsId)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun build(): CfnVPCDHCPOptionsAssociation = cdkBuilder.build()
}
