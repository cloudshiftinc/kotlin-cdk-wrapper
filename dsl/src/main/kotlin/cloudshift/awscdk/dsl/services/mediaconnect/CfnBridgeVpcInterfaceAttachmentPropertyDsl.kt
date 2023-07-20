@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnBridge

@CdkDslMarker
public class CfnBridgeVpcInterfaceAttachmentPropertyDsl {
  private val cdkBuilder: CfnBridge.VpcInterfaceAttachmentProperty.Builder =
      CfnBridge.VpcInterfaceAttachmentProperty.builder()

  public fun vpcInterfaceName(vpcInterfaceName: String) {
    cdkBuilder.vpcInterfaceName(vpcInterfaceName)
  }

  public fun build(): CfnBridge.VpcInterfaceAttachmentProperty = cdkBuilder.build()
}
