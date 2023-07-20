@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpoint

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pinpoint.CfnCampaign

@CdkDslMarker
public class CfnCampaignInAppMessageButtonPropertyDsl {
  private val cdkBuilder: CfnCampaign.InAppMessageButtonProperty.Builder =
      CfnCampaign.InAppMessageButtonProperty.builder()

  public fun android(android: IResolvable) {
    cdkBuilder.android(android)
  }

  public fun android(android: CfnCampaign.OverrideButtonConfigurationProperty) {
    cdkBuilder.android(android)
  }

  public fun defaultConfig(defaultConfig: IResolvable) {
    cdkBuilder.defaultConfig(defaultConfig)
  }

  public fun defaultConfig(defaultConfig: CfnCampaign.DefaultButtonConfigurationProperty) {
    cdkBuilder.defaultConfig(defaultConfig)
  }

  public fun ios(ios: IResolvable) {
    cdkBuilder.ios(ios)
  }

  public fun ios(ios: CfnCampaign.OverrideButtonConfigurationProperty) {
    cdkBuilder.ios(ios)
  }

  public fun web(web: IResolvable) {
    cdkBuilder.web(web)
  }

  public fun web(web: CfnCampaign.OverrideButtonConfigurationProperty) {
    cdkBuilder.web(web)
  }

  public fun build(): CfnCampaign.InAppMessageButtonProperty = cdkBuilder.build()
}
