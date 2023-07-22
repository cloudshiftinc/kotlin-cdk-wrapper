@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachment

@CdkDslMarker
public class CfnTransitGatewayVpcAttachmentOptionsPropertyDsl {
  private val cdkBuilder: CfnTransitGatewayVpcAttachment.OptionsProperty.Builder =
      CfnTransitGatewayVpcAttachment.OptionsProperty.builder()

  /**
   * @param applianceModeSupport Enable or disable appliance mode support.
   * The default is `disable` .
   */
  public fun applianceModeSupport(applianceModeSupport: String) {
    cdkBuilder.applianceModeSupport(applianceModeSupport)
  }

  /**
   * @param dnsSupport Enable or disable DNS support.
   * The default is `disable` .
   */
  public fun dnsSupport(dnsSupport: String) {
    cdkBuilder.dnsSupport(dnsSupport)
  }

  /**
   * @param ipv6Support Enable or disable IPv6 support.
   * The default is `disable` .
   */
  public fun ipv6Support(ipv6Support: String) {
    cdkBuilder.ipv6Support(ipv6Support)
  }

  public fun build(): CfnTransitGatewayVpcAttachment.OptionsProperty = cdkBuilder.build()
}
