@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

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
