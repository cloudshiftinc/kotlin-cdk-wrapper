@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridge

@CdkDslMarker
public class CfnBridgeBridgeFlowSourcePropertyDsl {
  private val cdkBuilder: CfnBridge.BridgeFlowSourceProperty.Builder =
      CfnBridge.BridgeFlowSourceProperty.builder()

  /**
   * @param flowArn The ARN of the cloud flow used as a source of this bridge. 
   */
  public fun flowArn(flowArn: String) {
    cdkBuilder.flowArn(flowArn)
  }

  /**
   * @param flowVpcInterfaceAttachment The name of the VPC interface attachment to use for this
   * source.
   */
  public fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: IResolvable) {
    cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment)
  }

  /**
   * @param flowVpcInterfaceAttachment The name of the VPC interface attachment to use for this
   * source.
   */
  public
      fun flowVpcInterfaceAttachment(flowVpcInterfaceAttachment: CfnBridge.VpcInterfaceAttachmentProperty) {
    cdkBuilder.flowVpcInterfaceAttachment(flowVpcInterfaceAttachment)
  }

  /**
   * @param name The name of the flow source. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnBridge.BridgeFlowSourceProperty = cdkBuilder.build()
}
