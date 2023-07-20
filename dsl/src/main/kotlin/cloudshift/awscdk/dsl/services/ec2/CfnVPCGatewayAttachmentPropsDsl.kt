@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps

@CdkDslMarker
public class CfnVPCGatewayAttachmentPropsDsl {
  private val cdkBuilder: CfnVPCGatewayAttachmentProps.Builder =
      CfnVPCGatewayAttachmentProps.builder()

  public fun internetGatewayId(internetGatewayId: String) {
    cdkBuilder.internetGatewayId(internetGatewayId)
  }

  public fun vpcId(vpcId: String) {
    cdkBuilder.vpcId(vpcId)
  }

  public fun vpnGatewayId(vpnGatewayId: String) {
    cdkBuilder.vpnGatewayId(vpnGatewayId)
  }

  public fun build(): CfnVPCGatewayAttachmentProps = cdkBuilder.build()
}
