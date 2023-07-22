@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * A reference to an OutputDestination ID that is defined in the channel.
 *
 * This entity is used by ArchiveGroupSettings, FrameCaptureGroupSettings, HlsGroupSettings,
 * MediaPackageGroupSettings, MSSmoothGroupSettings, RtmpOutputSettings, and UdpOutputSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * OutputLocationRefProperty outputLocationRefProperty = OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputlocationref.html)
 */
@CdkDslMarker
public class CfnChannelOutputLocationRefPropertyDsl {
  private val cdkBuilder: CfnChannel.OutputLocationRefProperty.Builder =
      CfnChannel.OutputLocationRefProperty.builder()

  /**
   * @param destinationRefId A reference ID for this destination.
   */
  public fun destinationRefId(destinationRefId: String) {
    cdkBuilder.destinationRefId(destinationRefId)
  }

  public fun build(): CfnChannel.OutputLocationRefProperty = cdkBuilder.build()
}
