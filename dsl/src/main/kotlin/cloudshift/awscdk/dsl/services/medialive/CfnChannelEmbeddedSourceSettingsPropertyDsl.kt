@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelEmbeddedSourceSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.EmbeddedSourceSettingsProperty.Builder =
      CfnChannel.EmbeddedSourceSettingsProperty.builder()

  /**
   * @param convert608To708 If this is upconvert, 608 data is both passed through the "608
   * compatibility bytes" fields of the 708 wrapper as well as translated into 708.
   * If 708 data is present in the source content, it is discarded.
   */
  public fun convert608To708(convert608To708: String) {
    cdkBuilder.convert608To708(convert608To708)
  }

  /**
   * @param scte20Detection Set to "auto" to handle streams with intermittent or non-aligned SCTE-20
   * and embedded captions.
   */
  public fun scte20Detection(scte20Detection: String) {
    cdkBuilder.scte20Detection(scte20Detection)
  }

  /**
   * @param source608ChannelNumber Specifies the 608/708 channel number within the video track from
   * which to extract captions.
   * This is unused for passthrough.
   */
  public fun source608ChannelNumber(source608ChannelNumber: Number) {
    cdkBuilder.source608ChannelNumber(source608ChannelNumber)
  }

  /**
   * @param source608TrackNumber This field is unused and deprecated.
   */
  public fun source608TrackNumber(source608TrackNumber: Number) {
    cdkBuilder.source608TrackNumber(source608TrackNumber)
  }

  public fun build(): CfnChannel.EmbeddedSourceSettingsProperty = cdkBuilder.build()
}
