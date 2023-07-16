@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnFlowOutput

@CdkDslMarker
public class CfnFlowOutputVpcInterfaceAttachmentPropertyDsl {
  private val cdkBuilder: CfnFlowOutput.VpcInterfaceAttachmentProperty.Builder =
      CfnFlowOutput.VpcInterfaceAttachmentProperty.builder()

  public fun vpcInterfaceName(vpcInterfaceName: String) {
    cdkBuilder.vpcInterfaceName(vpcInterfaceName)
  }

  public fun build(): CfnFlowOutput.VpcInterfaceAttachmentProperty = cdkBuilder.build()
}
