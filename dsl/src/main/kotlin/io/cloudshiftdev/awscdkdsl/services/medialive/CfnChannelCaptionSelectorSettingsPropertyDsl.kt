@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Captions Selector Settings.
 *
 * The parent of this entity is CaptionSelector.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * CaptionSelectorSettingsProperty captionSelectorSettingsProperty =
 * CaptionSelectorSettingsProperty.builder()
 * .ancillarySourceSettings(AncillarySourceSettingsProperty.builder()
 * .sourceAncillaryChannelNumber(123)
 * .build())
 * .aribSourceSettings(AribSourceSettingsProperty.builder().build())
 * .dvbSubSourceSettings(DvbSubSourceSettingsProperty.builder()
 * .ocrLanguage("ocrLanguage")
 * .pid(123)
 * .build())
 * .embeddedSourceSettings(EmbeddedSourceSettingsProperty.builder()
 * .convert608To708("convert608To708")
 * .scte20Detection("scte20Detection")
 * .source608ChannelNumber(123)
 * .source608TrackNumber(123)
 * .build())
 * .scte20SourceSettings(Scte20SourceSettingsProperty.builder()
 * .convert608To708("convert608To708")
 * .source608ChannelNumber(123)
 * .build())
 * .scte27SourceSettings(Scte27SourceSettingsProperty.builder()
 * .ocrLanguage("ocrLanguage")
 * .pid(123)
 * .build())
 * .teletextSourceSettings(TeletextSourceSettingsProperty.builder()
 * .outputRectangle(CaptionRectangleProperty.builder()
 * .height(123)
 * .leftOffset(123)
 * .topOffset(123)
 * .width(123)
 * .build())
 * .pageNumber("pageNumber")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselectorsettings.html)
 */
@CdkDslMarker
public class CfnChannelCaptionSelectorSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.CaptionSelectorSettingsProperty.Builder =
        CfnChannel.CaptionSelectorSettingsProperty.builder()

    /**
     * @param ancillarySourceSettings Information about the ancillary captions to extract from the
     *   input.
     */
    public fun ancillarySourceSettings(ancillarySourceSettings: IResolvable) {
        cdkBuilder.ancillarySourceSettings(ancillarySourceSettings)
    }

    /**
     * @param ancillarySourceSettings Information about the ancillary captions to extract from the
     *   input.
     */
    public fun ancillarySourceSettings(
        ancillarySourceSettings: CfnChannel.AncillarySourceSettingsProperty
    ) {
        cdkBuilder.ancillarySourceSettings(ancillarySourceSettings)
    }

    /** @param aribSourceSettings Information about the ARIB captions to extract from the input. */
    public fun aribSourceSettings(aribSourceSettings: IResolvable) {
        cdkBuilder.aribSourceSettings(aribSourceSettings)
    }

    /** @param aribSourceSettings Information about the ARIB captions to extract from the input. */
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
     *   input.
     */
    public fun embeddedSourceSettings(embeddedSourceSettings: IResolvable) {
        cdkBuilder.embeddedSourceSettings(embeddedSourceSettings)
    }

    /**
     * @param embeddedSourceSettings Information about the embedded captions to extract from the
     *   input.
     */
    public fun embeddedSourceSettings(
        embeddedSourceSettings: CfnChannel.EmbeddedSourceSettingsProperty
    ) {
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
     *   input.
     */
    public fun teletextSourceSettings(teletextSourceSettings: IResolvable) {
        cdkBuilder.teletextSourceSettings(teletextSourceSettings)
    }

    /**
     * @param teletextSourceSettings Information about the Teletext captions to extract from the
     *   input.
     */
    public fun teletextSourceSettings(
        teletextSourceSettings: CfnChannel.TeletextSourceSettingsProperty
    ) {
        cdkBuilder.teletextSourceSettings(teletextSourceSettings)
    }

    public fun build(): CfnChannel.CaptionSelectorSettingsProperty = cdkBuilder.build()
}
