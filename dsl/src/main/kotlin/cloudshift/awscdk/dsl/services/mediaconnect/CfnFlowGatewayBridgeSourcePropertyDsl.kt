@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlow

@CdkDslMarker
public class CfnFlowGatewayBridgeSourcePropertyDsl {
  private val cdkBuilder: CfnFlow.GatewayBridgeSourceProperty.Builder =
      CfnFlow.GatewayBridgeSourceProperty.builder()

  /**
   * @param bridgeArn The ARN of the bridge feeding this flow. 
   */
  public fun bridgeArn(bridgeArn: String) {
    cdkBuilder.bridgeArn(bridgeArn)
  }

  /**
   * @param vpcInterfaceAttachment The settings for attaching a VPC interface to an resource.
   */
  public fun vpcInterfaceAttachment(vpcInterfaceAttachment: IResolvable) {
    cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment)
  }

  /**
   * @param vpcInterfaceAttachment The settings for attaching a VPC interface to an resource.
   */
  public
      fun vpcInterfaceAttachment(vpcInterfaceAttachment: CfnFlow.VpcInterfaceAttachmentProperty) {
    cdkBuilder.vpcInterfaceAttachment(vpcInterfaceAttachment)
  }

  public fun build(): CfnFlow.GatewayBridgeSourceProperty = cdkBuilder.build()
}
