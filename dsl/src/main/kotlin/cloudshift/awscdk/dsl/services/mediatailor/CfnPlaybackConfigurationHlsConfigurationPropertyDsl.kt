@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

/**
 * The configuration for HLS content.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * HlsConfigurationProperty hlsConfigurationProperty = HlsConfigurationProperty.builder()
 * .manifestEndpointPrefix("manifestEndpointPrefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-hlsconfiguration.html)
 */
@CdkDslMarker
public class CfnPlaybackConfigurationHlsConfigurationPropertyDsl {
  private val cdkBuilder: CfnPlaybackConfiguration.HlsConfigurationProperty.Builder =
      CfnPlaybackConfiguration.HlsConfigurationProperty.builder()

  /**
   * @param manifestEndpointPrefix The URL that is used to initiate a playback session for devices
   * that support Apple HLS.
   * The session uses server-side reporting.
   */
  public fun manifestEndpointPrefix(manifestEndpointPrefix: String) {
    cdkBuilder.manifestEndpointPrefix(manifestEndpointPrefix)
  }

  public fun build(): CfnPlaybackConfiguration.HlsConfigurationProperty = cdkBuilder.build()
}
