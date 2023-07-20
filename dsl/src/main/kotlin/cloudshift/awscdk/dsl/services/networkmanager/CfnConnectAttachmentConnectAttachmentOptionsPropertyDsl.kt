@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnConnectAttachment

@CdkDslMarker
public class CfnConnectAttachmentConnectAttachmentOptionsPropertyDsl {
  private val cdkBuilder: CfnConnectAttachment.ConnectAttachmentOptionsProperty.Builder =
      CfnConnectAttachment.ConnectAttachmentOptionsProperty.builder()

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun build(): CfnConnectAttachment.ConnectAttachmentOptionsProperty = cdkBuilder.build()
}
