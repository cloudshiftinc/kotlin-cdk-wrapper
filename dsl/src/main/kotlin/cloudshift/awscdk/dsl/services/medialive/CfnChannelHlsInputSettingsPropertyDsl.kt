@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelHlsInputSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.HlsInputSettingsProperty.Builder =
      CfnChannel.HlsInputSettingsProperty.builder()

  /**
   * @param bandwidth When specified, the HLS stream with the m3u8 bandwidth that most closely
   * matches this value is chosen.
   * Otherwise, the highest bandwidth stream in the m3u8 is chosen. The bitrate is specified in bits
   * per second, as in an HLS manifest.
   */
  public fun bandwidth(bandwidth: Number) {
    cdkBuilder.bandwidth(bandwidth)
  }

  /**
   * @param bufferSegments When specified, reading of the HLS input begins this many buffer segments
   * from the end (most recently written segment).
   * When not specified, the HLS input begins with the first segment specified in the m3u8.
   */
  public fun bufferSegments(bufferSegments: Number) {
    cdkBuilder.bufferSegments(bufferSegments)
  }

  /**
   * @param retries The number of consecutive times that attempts to read a manifest or segment must
   * fail before the input is considered unavailable.
   */
  public fun retries(retries: Number) {
    cdkBuilder.retries(retries)
  }

  /**
   * @param retryInterval The number of seconds between retries when an attempt to read a manifest
   * or segment fails.
   */
  public fun retryInterval(retryInterval: Number) {
    cdkBuilder.retryInterval(retryInterval)
  }

  /**
   * @param scte35Source Identifies the source for the SCTE-35 messages that MediaLive will ingest.
   * Messages can be ingested from the content segments (in the stream) or from tags in the playlist
   * (the HLS manifest). MediaLive ignores SCTE-35 information in the source that is not selected.
   */
  public fun scte35Source(scte35Source: String) {
    cdkBuilder.scte35Source(scte35Source)
  }

  public fun build(): CfnChannel.HlsInputSettingsProperty = cdkBuilder.build()
}
