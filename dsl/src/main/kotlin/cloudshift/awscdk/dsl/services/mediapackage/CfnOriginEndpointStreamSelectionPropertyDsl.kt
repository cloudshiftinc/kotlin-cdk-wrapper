@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

@CdkDslMarker
public class CfnOriginEndpointStreamSelectionPropertyDsl {
  private val cdkBuilder: CfnOriginEndpoint.StreamSelectionProperty.Builder =
      CfnOriginEndpoint.StreamSelectionProperty.builder()

  /**
   * @param maxVideoBitsPerSecond The upper limit of the bitrates that this endpoint serves.
   * If the video track exceeds this threshold, then AWS Elemental MediaPackage excludes it from
   * output. If you don't specify a value, it defaults to 2147483647 bits per second.
   */
  public fun maxVideoBitsPerSecond(maxVideoBitsPerSecond: Number) {
    cdkBuilder.maxVideoBitsPerSecond(maxVideoBitsPerSecond)
  }

  /**
   * @param minVideoBitsPerSecond The lower limit of the bitrates that this endpoint serves.
   * If the video track is below this threshold, then AWS Elemental MediaPackage excludes it from
   * output. If you don't specify a value, it defaults to 0 bits per second.
   */
  public fun minVideoBitsPerSecond(minVideoBitsPerSecond: Number) {
    cdkBuilder.minVideoBitsPerSecond(minVideoBitsPerSecond)
  }

  /**
   * @param streamOrder Order in which the different video bitrates are presented to the player.
   * Valid values: `ORIGINAL` , `VIDEO_BITRATE_ASCENDING` , `VIDEO_BITRATE_DESCENDING` .
   */
  public fun streamOrder(streamOrder: String) {
    cdkBuilder.streamOrder(streamOrder)
  }

  public fun build(): CfnOriginEndpoint.StreamSelectionProperty = cdkBuilder.build()
}
