@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnClientVpnEndpoint

@CdkDslMarker
public class CfnClientVpnEndpointClientLoginBannerOptionsPropertyDsl {
  private val cdkBuilder: CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty.Builder =
      CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty.builder()

  /**
   * @param bannerText Customizable text that will be displayed in a banner on AWS provided clients
   * when a VPN session is established.
   * UTF-8 encoded characters only. Maximum of 1400 characters.
   */
  public fun bannerText(bannerText: String) {
    cdkBuilder.bannerText(bannerText)
  }

  /**
   * @param enabled Enable or disable a customizable text banner that will be displayed on AWS
   * provided clients when a VPN session is established. 
   * Valid values: `true | false`
   *
   * Default value: `false`
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Enable or disable a customizable text banner that will be displayed on AWS
   * provided clients when a VPN session is established. 
   * Valid values: `true | false`
   *
   * Default value: `false`
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty = cdkBuilder.build()
}
