@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelUdpGroupSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.UdpGroupSettingsProperty.Builder =
      CfnChannel.UdpGroupSettingsProperty.builder()

  /**
   * @param inputLossAction Specifies the behavior of the last resort when the input video is lost,
   * and no more backup inputs are available.
   * When dropTs is selected, the entire transport stream stops emitting. When dropProgram is
   * selected, the program can be dropped from the transport stream (and replaced with null packets to
   * meet the TS bitrate requirement). Or when emitProgram is selected, the transport stream continues
   * to be produced normally with repeat frames, black frames, or slate frames substituted for the
   * absent input video.
   */
  public fun inputLossAction(inputLossAction: String) {
    cdkBuilder.inputLossAction(inputLossAction)
  }

  /**
   * @param timedMetadataId3Frame Indicates the ID3 frame that has the timecode.
   */
  public fun timedMetadataId3Frame(timedMetadataId3Frame: String) {
    cdkBuilder.timedMetadataId3Frame(timedMetadataId3Frame)
  }

  /**
   * @param timedMetadataId3Period The timed metadata interval in seconds.
   */
  public fun timedMetadataId3Period(timedMetadataId3Period: Number) {
    cdkBuilder.timedMetadataId3Period(timedMetadataId3Period)
  }

  public fun build(): CfnChannel.UdpGroupSettingsProperty = cdkBuilder.build()
}
