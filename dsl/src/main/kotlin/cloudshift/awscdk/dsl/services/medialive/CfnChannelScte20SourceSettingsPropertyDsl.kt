@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelScte20SourceSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.Scte20SourceSettingsProperty.Builder =
      CfnChannel.Scte20SourceSettingsProperty.builder()

  /**
   * @param convert608To708 If upconvert, 608 data is both passed through the "608 compatibility
   * bytes" fields of the 708 wrapper as well as translated into 708.
   * Any 708 data present in the source content is discarded.
   */
  public fun convert608To708(convert608To708: String) {
    cdkBuilder.convert608To708(convert608To708)
  }

  /**
   * @param source608ChannelNumber Specifies the 608/708 channel number within the video track from
   * which to extract captions.
   */
  public fun source608ChannelNumber(source608ChannelNumber: Number) {
    cdkBuilder.source608ChannelNumber(source608ChannelNumber)
  }

  public fun build(): CfnChannel.Scte20SourceSettingsProperty = cdkBuilder.build()
}
