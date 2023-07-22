@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelCaptionSelectorSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.CaptionSelectorSettingsProperty.Builder =
      CfnChannel.CaptionSelectorSettingsProperty.builder()

  /**
   * @param ancillarySourceSettings Information about the ancillary captions to extract from the
   * input.
   */
  public fun ancillarySourceSettings(ancillarySourceSettings: IResolvable) {
    cdkBuilder.ancillarySourceSettings(ancillarySourceSettings)
  }

  /**
   * @param ancillarySourceSettings Information about the ancillary captions to extract from the
   * input.
   */
  public
      fun ancillarySourceSettings(ancillarySourceSettings: CfnChannel.AncillarySourceSettingsProperty) {
    cdkBuilder.ancillarySourceSettings(ancillarySourceSettings)
  }

  /**
   * @param aribSourceSettings Information about the ARIB captions to extract from the input.
   */
  public fun aribSourceSettings(aribSourceSettings: IResolvable) {
    cdkBuilder.aribSourceSettings(aribSourceSettings)
  }

  /**
   * @param aribSourceSettings Information about the ARIB captions to extract from the input.
   */
  public fun aribSourceSettings(aribSourceSettings: CfnChannel.AribSourceSettingsProperty) {
    cdkBuilder.aribSourceSettings(aribSourceSettings)
  }

  /**
   * @param dvbSubSourceSettings Information about the DVB Sub captions to extract from the input.
   */
  public fun dvbSubSourceSettings(dvbSubSourceSettings: IResolvable) {
    cdkBuilder.dvbSubSourceSettings(dvbSubSourceSettings)
  }

  /**
   * @param dvbSubSourceSettings Information about the DVB Sub captions to extract from the input.
   */
  public fun dvbSubSourceSettings(dvbSubSourceSettings: CfnChannel.DvbSubSourceSettingsProperty) {
    cdkBuilder.dvbSubSourceSettings(dvbSubSourceSettings)
  }

  /**
   * @param embeddedSourceSettings Information about the embedded captions to extract from the
   * input.
   */
  public fun embeddedSourceSettings(embeddedSourceSettings: IResolvable) {
    cdkBuilder.embeddedSourceSettings(embeddedSourceSettings)
  }

  /**
   * @param embeddedSourceSettings Information about the embedded captions to extract from the
   * input.
   */
  public
      fun embeddedSourceSettings(embeddedSourceSettings: CfnChannel.EmbeddedSourceSettingsProperty) {
    cdkBuilder.embeddedSourceSettings(embeddedSourceSettings)
  }

  /**
   * @param scte20SourceSettings Information about the SCTE-20 captions to extract from the input.
   */
  public fun scte20SourceSettings(scte20SourceSettings: IResolvable) {
    cdkBuilder.scte20SourceSettings(scte20SourceSettings)
  }

  /**
   * @param scte20SourceSettings Information about the SCTE-20 captions to extract from the input.
   */
  public fun scte20SourceSettings(scte20SourceSettings: CfnChannel.Scte20SourceSettingsProperty) {
    cdkBuilder.scte20SourceSettings(scte20SourceSettings)
  }

  /**
   * @param scte27SourceSettings Information about the SCTE-27 captions to extract from the input.
   */
  public fun scte27SourceSettings(scte27SourceSettings: IResolvable) {
    cdkBuilder.scte27SourceSettings(scte27SourceSettings)
  }

  /**
   * @param scte27SourceSettings Information about the SCTE-27 captions to extract from the input.
   */
  public fun scte27SourceSettings(scte27SourceSettings: CfnChannel.Scte27SourceSettingsProperty) {
    cdkBuilder.scte27SourceSettings(scte27SourceSettings)
  }

  /**
   * @param teletextSourceSettings Information about the Teletext captions to extract from the
   * input.
   */
  public fun teletextSourceSettings(teletextSourceSettings: IResolvable) {
    cdkBuilder.teletextSourceSettings(teletextSourceSettings)
  }

  /**
   * @param teletextSourceSettings Information about the Teletext captions to extract from the
   * input.
   */
  public
      fun teletextSourceSettings(teletextSourceSettings: CfnChannel.TeletextSourceSettingsProperty) {
    cdkBuilder.teletextSourceSettings(teletextSourceSettings)
  }

  public fun build(): CfnChannel.CaptionSelectorSettingsProperty = cdkBuilder.build()
}
