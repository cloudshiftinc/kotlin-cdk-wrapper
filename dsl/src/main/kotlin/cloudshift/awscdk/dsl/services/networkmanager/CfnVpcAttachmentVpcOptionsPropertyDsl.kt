@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnVpcAttachment

@CdkDslMarker
public class CfnVpcAttachmentVpcOptionsPropertyDsl {
  private val cdkBuilder: CfnVpcAttachment.VpcOptionsProperty.Builder =
      CfnVpcAttachment.VpcOptionsProperty.builder()

  public fun applianceModeSupport(applianceModeSupport: Boolean) {
    cdkBuilder.applianceModeSupport(applianceModeSupport)
  }

  public fun applianceModeSupport(applianceModeSupport: IResolvable) {
    cdkBuilder.applianceModeSupport(applianceModeSupport)
  }

  public fun ipv6Support(ipv6Support: Boolean) {
    cdkBuilder.ipv6Support(ipv6Support)
  }

  public fun ipv6Support(ipv6Support: IResolvable) {
    cdkBuilder.ipv6Support(ipv6Support)
  }

  public fun build(): CfnVpcAttachment.VpcOptionsProperty = cdkBuilder.build()
}
