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

  public fun bannerText(bannerText: String) {
    cdkBuilder.bannerText(bannerText)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun build(): CfnClientVpnEndpoint.ClientLoginBannerOptionsProperty = cdkBuilder.build()
}
