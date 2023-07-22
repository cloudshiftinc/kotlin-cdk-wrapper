@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet

/**
 * An object that defines the tracking options for a configuration set.
 *
 * When you use Amazon Pinpoint to send an email, it contains an invisible image that's used to
 * track when recipients open your email. If your email contains links, those links are changed
 * slightly in order to track when recipients click them.
 *
 * These images and links include references to a domain operated by AWS . You can optionally
 * configure Amazon Pinpoint to use a domain that you operate for these images and links.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pinpointemail.*;
 * TrackingOptionsProperty trackingOptionsProperty = TrackingOptionsProperty.builder()
 * .customRedirectDomain("customRedirectDomain")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html)
 */
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
