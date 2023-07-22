@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutput

@CdkDslMarker
public class CfnFlowOutputVpcInterfaceAttachmentPropertyDsl {
  private val cdkBuilder: CfnFlowOutput.VpcInterfaceAttachmentProperty.Builder =
      CfnFlowOutput.VpcInterfaceAttachmentProperty.builder()

  /**
   * @param vpcInterfaceName The name of the VPC interface that you want to send your output to.
   */
  public fun vpcInterfaceName(vpcInterfaceName: String) {
    cdkBuilder.vpcInterfaceName(vpcInterfaceName)
  }

  public fun build(): CfnFlowOutput.VpcInterfaceAttachmentProperty = cdkBuilder.build()
}
