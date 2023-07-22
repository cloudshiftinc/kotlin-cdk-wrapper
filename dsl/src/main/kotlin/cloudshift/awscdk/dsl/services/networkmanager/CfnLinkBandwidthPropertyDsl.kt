@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.networkmanager.CfnLink

/**
 * Describes bandwidth information.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkmanager.*;
 * BandwidthProperty bandwidthProperty = BandwidthProperty.builder()
 * .downloadSpeed(123)
 * .uploadSpeed(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkmanager-link-bandwidth.html)
 */
@CdkDslMarker
public class CfnLinkBandwidthPropertyDsl {
  private val cdkBuilder: CfnLink.BandwidthProperty.Builder = CfnLink.BandwidthProperty.builder()

  /**
   * @param downloadSpeed Download speed in Mbps.
   */
  public fun downloadSpeed(downloadSpeed: Number) {
    cdkBuilder.downloadSpeed(downloadSpeed)
  }

  /**
   * @param uploadSpeed Upload speed in Mbps.
   */
  public fun uploadSpeed(uploadSpeed: Number) {
    cdkBuilder.uploadSpeed(uploadSpeed)
  }

  public fun build(): CfnLink.BandwidthProperty = cdkBuilder.build()
}
