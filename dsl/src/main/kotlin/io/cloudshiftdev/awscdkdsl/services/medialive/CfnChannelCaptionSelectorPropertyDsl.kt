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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Information about one caption to extract from the input.
 *
 * The parent of this entity is InputSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * CaptionSelectorProperty captionSelectorProperty = CaptionSelectorProperty.builder()
 * .languageCode("languageCode")
 * .name("name")
 * .selectorSettings(CaptionSelectorSettingsProperty.builder()
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
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselector.html)
 */
@CdkDslMarker
public class CfnChannelCaptionSelectorPropertyDsl {
    private val cdkBuilder: CfnChannel.CaptionSelectorProperty.Builder =
        CfnChannel.CaptionSelectorProperty.builder()

    /**
     * @param languageCode When specified, this field indicates the three-letter language code of
     *   the captions track to extract from the source.
     */
    public fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
    }

    /**
     * @param name The name identifier for a captions selector. This name is used to associate this
     *   captions selector with one or more captions descriptions. Names must be unique within a
     *   channel.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param selectorSettings Information about the specific audio to extract from the input. */
    public fun selectorSettings(selectorSettings: IResolvable) {
        cdkBuilder.selectorSettings(selectorSettings)
    }

    /** @param selectorSettings Information about the specific audio to extract from the input. */
    public fun selectorSettings(selectorSettings: CfnChannel.CaptionSelectorSettingsProperty) {
        cdkBuilder.selectorSettings(selectorSettings)
    }

    public fun build(): CfnChannel.CaptionSelectorProperty = cdkBuilder.build()
}
