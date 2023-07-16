@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayAttachment

@CdkDslMarker
public class CfnTransitGatewayAttachmentOptionsPropertyDsl {
  private val cdkBuilder: CfnTransitGatewayAttachment.OptionsProperty.Builder =
      CfnTransitGatewayAttachment.OptionsProperty.builder()

  public fun applianceModeSupport(applianceModeSupport: String) {
    cdkBuilder.applianceModeSupport(applianceModeSupport)
  }

  public fun dnsSupport(dnsSupport: String) {
    cdkBuilder.dnsSupport(dnsSupport)
  }

  public fun ipv6Support(ipv6Support: String) {
    cdkBuilder.ipv6Support(ipv6Support)
  }

  public fun build(): CfnTransitGatewayAttachment.OptionsProperty = cdkBuilder.build()
}
