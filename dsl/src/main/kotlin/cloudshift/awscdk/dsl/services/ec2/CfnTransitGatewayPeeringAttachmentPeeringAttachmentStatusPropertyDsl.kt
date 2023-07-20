@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachment

@CdkDslMarker
public class CfnTransitGatewayPeeringAttachmentPeeringAttachmentStatusPropertyDsl {
  private val cdkBuilder: CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty.Builder
      = CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty.builder()

  public fun code(code: String) {
    cdkBuilder.code(code)
  }

  public fun message(message: String) {
    cdkBuilder.message(message)
  }

  public fun build(): CfnTransitGatewayPeeringAttachment.PeeringAttachmentStatusProperty =
      cdkBuilder.build()
}
