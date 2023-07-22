@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of one captions encode in the output.
 *
 * The parent of this entity is CaptionDescription.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * CaptionDestinationSettingsProperty captionDestinationSettingsProperty =
 * CaptionDestinationSettingsProperty.builder()
 * .aribDestinationSettings(AribDestinationSettingsProperty.builder().build())
 * .burnInDestinationSettings(BurnInDestinationSettingsProperty.builder()
 * .alignment("alignment")
 * .backgroundColor("backgroundColor")
 * .backgroundOpacity(123)
 * .font(InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build())
 * .fontColor("fontColor")
 * .fontOpacity(123)
 * .fontResolution(123)
 * .fontSize("fontSize")
 * .outlineColor("outlineColor")
 * .outlineSize(123)
 * .shadowColor("shadowColor")
 * .shadowOpacity(123)
 * .shadowXOffset(123)
 * .shadowYOffset(123)
 * .teletextGridControl("teletextGridControl")
 * .xPosition(123)
 * .yPosition(123)
 * .build())
 * .dvbSubDestinationSettings(DvbSubDestinationSettingsProperty.builder()
 * .alignment("alignment")
 * .backgroundColor("backgroundColor")
 * .backgroundOpacity(123)
 * .font(InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build())
 * .fontColor("fontColor")
 * .fontOpacity(123)
 * .fontResolution(123)
 * .fontSize("fontSize")
 * .outlineColor("outlineColor")
 * .outlineSize(123)
 * .shadowColor("shadowColor")
 * .shadowOpacity(123)
 * .shadowXOffset(123)
 * .shadowYOffset(123)
 * .teletextGridControl("teletextGridControl")
 * .xPosition(123)
 * .yPosition(123)
 * .build())
 * .ebuTtDDestinationSettings(EbuTtDDestinationSettingsProperty.builder()
 * .copyrightHolder("copyrightHolder")
 * .fillLineGap("fillLineGap")
 * .fontFamily("fontFamily")
 * .styleControl("styleControl")
 * .build())
 * .embeddedDestinationSettings(EmbeddedDestinationSettingsProperty.builder().build())
 * .embeddedPlusScte20DestinationSettings(EmbeddedPlusScte20DestinationSettingsProperty.builder().build())
 * .rtmpCaptionInfoDestinationSettings(RtmpCaptionInfoDestinationSettingsProperty.builder().build())
 * .scte20PlusEmbeddedDestinationSettings(Scte20PlusEmbeddedDestinationSettingsProperty.builder().build())
 * .scte27DestinationSettings(Scte27DestinationSettingsProperty.builder().build())
 * .smpteTtDestinationSettings(SmpteTtDestinationSettingsProperty.builder().build())
 * .teletextDestinationSettings(TeletextDestinationSettingsProperty.builder().build())
 * .ttmlDestinationSettings(TtmlDestinationSettingsProperty.builder()
 * .styleControl("styleControl")
 * .build())
 * .webvttDestinationSettings(WebvttDestinationSettingsProperty.builder()
 * .styleControl("styleControl")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captiondestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelCaptionDestinationSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.CaptionDestinationSettingsProperty.Builder =
      CfnChannel.CaptionDestinationSettingsProperty.builder()

  /**
   * @param aribDestinationSettings The configuration of one ARIB captions encode in the output.
   */
  public fun aribDestinationSettings(aribDestinationSettings: IResolvable) {
    cdkBuilder.aribDestinationSettings(aribDestinationSettings)
  }

  /**
   * @param aribDestinationSettings The configuration of one ARIB captions encode in the output.
   */
  public
      fun aribDestinationSettings(aribDestinationSettings: CfnChannel.AribDestinationSettingsProperty) {
    cdkBuilder.aribDestinationSettings(aribDestinationSettings)
  }

  /**
   * @param burnInDestinationSettings The configuration of one burn-in captions encode in the
   * output.
   */
  public fun burnInDestinationSettings(burnInDestinationSettings: IResolvable) {
    cdkBuilder.burnInDestinationSettings(burnInDestinationSettings)
  }

  /**
   * @param burnInDestinationSettings The configuration of one burn-in captions encode in the
   * output.
   */
  public
      fun burnInDestinationSettings(burnInDestinationSettings: CfnChannel.BurnInDestinationSettingsProperty) {
    cdkBuilder.burnInDestinationSettings(burnInDestinationSettings)
  }

  /**
   * @param dvbSubDestinationSettings The configuration of one DVB Sub captions encode in the
   * output.
   */
  public fun dvbSubDestinationSettings(dvbSubDestinationSettings: IResolvable) {
    cdkBuilder.dvbSubDestinationSettings(dvbSubDestinationSettings)
  }

  /**
   * @param dvbSubDestinationSettings The configuration of one DVB Sub captions encode in the
   * output.
   */
  public
      fun dvbSubDestinationSettings(dvbSubDestinationSettings: CfnChannel.DvbSubDestinationSettingsProperty) {
    cdkBuilder.dvbSubDestinationSettings(dvbSubDestinationSettings)
  }

  /**
   * @param ebuTtDDestinationSettings Settings for EBU-TT captions in the output.
   */
  public fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: IResolvable) {
    cdkBuilder.ebuTtDDestinationSettings(ebuTtDDestinationSettings)
  }

  /**
   * @param ebuTtDDestinationSettings Settings for EBU-TT captions in the output.
   */
  public
      fun ebuTtDDestinationSettings(ebuTtDDestinationSettings: CfnChannel.EbuTtDDestinationSettingsProperty) {
    cdkBuilder.ebuTtDDestinationSettings(ebuTtDDestinationSettings)
  }

  /**
   * @param embeddedDestinationSettings The configuration of one embedded captions encode in the
   * output.
   */
  public fun embeddedDestinationSettings(embeddedDestinationSettings: IResolvable) {
    cdkBuilder.embeddedDestinationSettings(embeddedDestinationSettings)
  }

  /**
   * @param embeddedDestinationSettings The configuration of one embedded captions encode in the
   * output.
   */
  public
      fun embeddedDestinationSettings(embeddedDestinationSettings: CfnChannel.EmbeddedDestinationSettingsProperty) {
    cdkBuilder.embeddedDestinationSettings(embeddedDestinationSettings)
  }

  /**
   * @param embeddedPlusScte20DestinationSettings The configuration of one embedded plus SCTE-20
   * captions encode in the output.
   */
  public
      fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: IResolvable) {
    cdkBuilder.embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings)
  }

  /**
   * @param embeddedPlusScte20DestinationSettings The configuration of one embedded plus SCTE-20
   * captions encode in the output.
   */
  public
      fun embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings: CfnChannel.EmbeddedPlusScte20DestinationSettingsProperty) {
    cdkBuilder.embeddedPlusScte20DestinationSettings(embeddedPlusScte20DestinationSettings)
  }

  /**
   * @param rtmpCaptionInfoDestinationSettings The configuration of one RTMPCaptionInfo captions
   * encode in the output.
   */
  public fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: IResolvable) {
    cdkBuilder.rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings)
  }

  /**
   * @param rtmpCaptionInfoDestinationSettings The configuration of one RTMPCaptionInfo captions
   * encode in the output.
   */
  public
      fun rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings: CfnChannel.RtmpCaptionInfoDestinationSettingsProperty) {
    cdkBuilder.rtmpCaptionInfoDestinationSettings(rtmpCaptionInfoDestinationSettings)
  }

  /**
   * @param scte20PlusEmbeddedDestinationSettings The configuration of one SCTE20 plus embedded
   * captions encode in the output.
   */
  public
      fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: IResolvable) {
    cdkBuilder.scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings)
  }

  /**
   * @param scte20PlusEmbeddedDestinationSettings The configuration of one SCTE20 plus embedded
   * captions encode in the output.
   */
  public
      fun scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings: CfnChannel.Scte20PlusEmbeddedDestinationSettingsProperty) {
    cdkBuilder.scte20PlusEmbeddedDestinationSettings(scte20PlusEmbeddedDestinationSettings)
  }

  /**
   * @param scte27DestinationSettings The configuration of one SCTE-27 captions encode in the
   * output.
   */
  public fun scte27DestinationSettings(scte27DestinationSettings: IResolvable) {
    cdkBuilder.scte27DestinationSettings(scte27DestinationSettings)
  }

  /**
   * @param scte27DestinationSettings The configuration of one SCTE-27 captions encode in the
   * output.
   */
  public
      fun scte27DestinationSettings(scte27DestinationSettings: CfnChannel.Scte27DestinationSettingsProperty) {
    cdkBuilder.scte27DestinationSettings(scte27DestinationSettings)
  }

  /**
   * @param smpteTtDestinationSettings The configuration of one SMPTE-TT captions encode in the
   * output.
   */
  public fun smpteTtDestinationSettings(smpteTtDestinationSettings: IResolvable) {
    cdkBuilder.smpteTtDestinationSettings(smpteTtDestinationSettings)
  }

  /**
   * @param smpteTtDestinationSettings The configuration of one SMPTE-TT captions encode in the
   * output.
   */
  public
      fun smpteTtDestinationSettings(smpteTtDestinationSettings: CfnChannel.SmpteTtDestinationSettingsProperty) {
    cdkBuilder.smpteTtDestinationSettings(smpteTtDestinationSettings)
  }

  /**
   * @param teletextDestinationSettings The configuration of one Teletext captions encode in the
   * output.
   */
  public fun teletextDestinationSettings(teletextDestinationSettings: IResolvable) {
    cdkBuilder.teletextDestinationSettings(teletextDestinationSettings)
  }

  /**
   * @param teletextDestinationSettings The configuration of one Teletext captions encode in the
   * output.
   */
  public
      fun teletextDestinationSettings(teletextDestinationSettings: CfnChannel.TeletextDestinationSettingsProperty) {
    cdkBuilder.teletextDestinationSettings(teletextDestinationSettings)
  }

  /**
   * @param ttmlDestinationSettings The configuration of one TTML captions encode in the output.
   */
  public fun ttmlDestinationSettings(ttmlDestinationSettings: IResolvable) {
    cdkBuilder.ttmlDestinationSettings(ttmlDestinationSettings)
  }

  /**
   * @param ttmlDestinationSettings The configuration of one TTML captions encode in the output.
   */
  public
      fun ttmlDestinationSettings(ttmlDestinationSettings: CfnChannel.TtmlDestinationSettingsProperty) {
    cdkBuilder.ttmlDestinationSettings(ttmlDestinationSettings)
  }

  /**
   * @param webvttDestinationSettings The configuration of one WebVTT captions encode in the output.
   */
  public fun webvttDestinationSettings(webvttDestinationSettings: IResolvable) {
    cdkBuilder.webvttDestinationSettings(webvttDestinationSettings)
  }

  /**
   * @param webvttDestinationSettings The configuration of one WebVTT captions encode in the output.
   */
  public
      fun webvttDestinationSettings(webvttDestinationSettings: CfnChannel.WebvttDestinationSettingsProperty) {
    cdkBuilder.webvttDestinationSettings(webvttDestinationSettings)
  }

  public fun build(): CfnChannel.CaptionDestinationSettingsProperty = cdkBuilder.build()
}
