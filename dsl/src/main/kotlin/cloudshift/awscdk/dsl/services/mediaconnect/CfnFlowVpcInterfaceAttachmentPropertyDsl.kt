@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnFlow

@CdkDslMarker
public class CfnFlowVpcInterfaceAttachmentPropertyDsl {
  private val cdkBuilder: CfnFlow.VpcInterfaceAttachmentProperty.Builder =
      CfnFlow.VpcInterfaceAttachmentProperty.builder()

  /**
   * @param vpcInterfaceName The name of the VPC interface to use for this resource.
   */
  public fun vpcInterfaceName(vpcInterfaceName: String) {
    cdkBuilder.vpcInterfaceName(vpcInterfaceName)
  }

  public fun build(): CfnFlow.VpcInterfaceAttachmentProperty = cdkBuilder.build()
}
