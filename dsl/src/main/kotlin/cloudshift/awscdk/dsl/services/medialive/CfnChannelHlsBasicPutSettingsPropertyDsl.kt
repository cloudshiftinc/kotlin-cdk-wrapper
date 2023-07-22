@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of HLS Basic Put Settings.
 *
 * The parent of this entity is HlsCdnSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * HlsBasicPutSettingsProperty hlsBasicPutSettingsProperty = HlsBasicPutSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .numRetries(123)
 * .restartDelay(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsbasicputsettings.html)
 */
@CdkDslMarker
public class CfnChannelHlsBasicPutSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.HlsBasicPutSettingsProperty.Builder =
      CfnChannel.HlsBasicPutSettingsProperty.builder()

  /**
   * @param connectionRetryInterval The number of seconds to wait before retrying a connection to
   * the CDN if the connection is lost.
   */
  public fun connectionRetryInterval(connectionRetryInterval: Number) {
    cdkBuilder.connectionRetryInterval(connectionRetryInterval)
  }

  /**
   * @param filecacheDuration The size, in seconds, of the file cache for streaming outputs.
   */
  public fun filecacheDuration(filecacheDuration: Number) {
    cdkBuilder.filecacheDuration(filecacheDuration)
  }

  /**
   * @param numRetries The number of retry attempts that MediaLive makes before the channel is put
   * into an error state.
   */
  public fun numRetries(numRetries: Number) {
    cdkBuilder.numRetries(numRetries)
  }

  /**
   * @param restartDelay If a streaming output fails, the number of seconds to wait until a restart
   * is initiated.
   * A value of 0 means never restart.
   */
  public fun restartDelay(restartDelay: Number) {
    cdkBuilder.restartDelay(restartDelay)
  }

  public fun build(): CfnChannel.HlsBasicPutSettingsProperty = cdkBuilder.build()
}
