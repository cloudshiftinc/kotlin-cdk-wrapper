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
 * The encoding information for output captions.
 *
 * The parent of this entity is EncoderSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * CaptionDescriptionProperty captionDescriptionProperty = CaptionDescriptionProperty.builder()
 * .accessibility("accessibility")
 * .captionSelectorName("captionSelectorName")
 * .destinationSettings(CaptionDestinationSettingsProperty.builder()
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
 * .build())
 * .languageCode("languageCode")
 * .languageDescription("languageDescription")
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captiondescription.html)
 */
@CdkDslMarker
public class CfnChannelCaptionDescriptionPropertyDsl {
    private val cdkBuilder: CfnChannel.CaptionDescriptionProperty.Builder =
        CfnChannel.CaptionDescriptionProperty.builder()

    /** @param accessibility the value to be set. */
    public fun accessibility(accessibility: String) {
        cdkBuilder.accessibility(accessibility)
    }

    /**
     * @param captionSelectorName Specifies which input captions selector to use as a captions
     *   source when generating output captions. This field should match a captionSelector name.
     */
    public fun captionSelectorName(captionSelectorName: String) {
        cdkBuilder.captionSelectorName(captionSelectorName)
    }

    /**
     * @param destinationSettings Additional settings for a captions destination that depend on the
     *   destination type.
     */
    public fun destinationSettings(destinationSettings: IResolvable) {
        cdkBuilder.destinationSettings(destinationSettings)
    }

    /**
     * @param destinationSettings Additional settings for a captions destination that depend on the
     *   destination type.
     */
    public fun destinationSettings(
        destinationSettings: CfnChannel.CaptionDestinationSettingsProperty
    ) {
        cdkBuilder.destinationSettings(destinationSettings)
    }

    /**
     * @param languageCode An ISO 639-2 three-digit code. For more information, see
     *   http://www.loc.gov/standards/iso639-2/.
     */
    public fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
    }

    /**
     * @param languageDescription Human-readable information to indicate the captions that are
     *   available for players (for example, English or Spanish).
     */
    public fun languageDescription(languageDescription: String) {
        cdkBuilder.languageDescription(languageDescription)
    }

    /**
     * @param name The name of the captions description. The name is used to associate a captions
     *   description with an output. Names must be unique within a channel.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnChannel.CaptionDescriptionProperty = cdkBuilder.build()
}
