@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@CdkDslMarker
public class CfnConfigurationSetTrackingOptionsPropertyDsl {
  private val cdkBuilder: CfnConfigurationSet.TrackingOptionsProperty.Builder =
      CfnConfigurationSet.TrackingOptionsProperty.builder()

  /**
   * @param customRedirectDomain The custom subdomain that is used to redirect email recipients to
   * the Amazon SES event tracking domain.
   */
  public fun customRedirectDomain(customRedirectDomain: String) {
    cdkBuilder.customRedirectDomain(customRedirectDomain)
  }

  public fun build(): CfnConfigurationSet.TrackingOptionsProperty = cdkBuilder.build()
}
