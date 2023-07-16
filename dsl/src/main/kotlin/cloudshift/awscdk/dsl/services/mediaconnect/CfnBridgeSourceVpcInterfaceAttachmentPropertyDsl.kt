@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource

@CdkDslMarker
public class CfnBridgeSourceVpcInterfaceAttachmentPropertyDsl {
  private val cdkBuilder: CfnBridgeSource.VpcInterfaceAttachmentProperty.Builder =
      CfnBridgeSource.VpcInterfaceAttachmentProperty.builder()

  public fun vpcInterfaceName(vpcInterfaceName: String) {
    cdkBuilder.vpcInterfaceName(vpcInterfaceName)
  }

  public fun build(): CfnBridgeSource.VpcInterfaceAttachmentProperty = cdkBuilder.build()
}
