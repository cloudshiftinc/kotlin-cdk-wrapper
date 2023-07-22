@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet

@CdkDslMarker
public class CfnConfigurationSetTrackingOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.TrackingOptionsProperty.Builder =
      CfnConfigurationSet.TrackingOptionsProperty.builder()

  /**
   * @param customRedirectDomain The domain that you want to use for tracking open and click events.
   */
  public fun customRedirectDomain(customRedirectDomain: String) {
    cdkBuilder.customRedirectDomain(customRedirectDomain)
  }

  public fun build(): CfnConfigurationSet.TrackingOptionsProperty = cdkBuilder.build()
}
