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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for DVB Sub captions in the output.
 *
 * The parent of this entity is CaptionDestinationSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * DvbSubDestinationSettingsProperty dvbSubDestinationSettingsProperty =
 * DvbSubDestinationSettingsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-dvbsubdestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelDvbSubDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.DvbSubDestinationSettingsProperty.Builder =
        CfnChannel.DvbSubDestinationSettingsProperty.builder()

    /**
     * @param alignment If no explicit xPosition or yPosition is provided, setting the alignment to
     *   centered places the captions at the bottom center of the output. Similarly, setting a left
     *   alignment aligns captions to the bottom left of the output. If x and y positions are
     *   specified in conjunction with the alignment parameter, the font is justified (either left
     *   or centered) relative to those coordinates. Selecting "smart" justification left-justifies
     *   live subtitles and center-justifies pre-recorded subtitles. This option is not valid for
     *   source captions that are STL or 608/embedded. These source settings are already pre-defined
     *   by the captions stream. All burn-in and DVB-Sub font settings must match.
     */
    public fun alignment(alignment: String) {
        cdkBuilder.alignment(alignment)
    }

    /**
     * @param backgroundColor Specifies the color of the rectangle behind the captions. All burn-in
     *   and DVB-Sub font settings must match.
     */
    public fun backgroundColor(backgroundColor: String) {
        cdkBuilder.backgroundColor(backgroundColor)
    }

    /**
     * @param backgroundOpacity Specifies the opacity of the background rectangle. 255 is opaque; 0
     *   is transparent. Keeping this parameter blank is equivalent to setting it to 0
     *   (transparent). All burn-in and DVB-Sub font settings must match.
     */
    public fun backgroundOpacity(backgroundOpacity: Number) {
        cdkBuilder.backgroundOpacity(backgroundOpacity)
    }

    /**
     * @param font The external font file that is used for captions burn-in. The file extension must
     *   be .ttf or .tte. Although you can select output fonts for many different types of input
     *   captions, embedded, STL, and Teletext sources use a strict grid system. Using external
     *   fonts with these captions sources could cause an unexpected display of proportional fonts.
     *   All burn-in and DVB-Sub font settings must match.
     */
    public fun font(font: IResolvable) {
        cdkBuilder.font(font)
    }

    /**
     * @param font The external font file that is used for captions burn-in. The file extension must
     *   be .ttf or .tte. Although you can select output fonts for many different types of input
     *   captions, embedded, STL, and Teletext sources use a strict grid system. Using external
     *   fonts with these captions sources could cause an unexpected display of proportional fonts.
     *   All burn-in and DVB-Sub font settings must match.
     */
    public fun font(font: CfnChannel.InputLocationProperty) {
        cdkBuilder.font(font)
    }

    /**
     * @param fontColor Specifies the color of the burned-in captions. This option is not valid for
     *   source captions that are STL, 608/embedded, or Teletext. These source settings are already
     *   pre-defined by the captions stream. All burn-in and DVB-Sub font settings must match.
     */
    public fun fontColor(fontColor: String) {
        cdkBuilder.fontColor(fontColor)
    }

    /**
     * @param fontOpacity Specifies the opacity of the burned-in captions. 255 is opaque; 0 is
     *   transparent. All burn-in and DVB-Sub font settings must match.
     */
    public fun fontOpacity(fontOpacity: Number) {
        cdkBuilder.fontOpacity(fontOpacity)
    }

    /**
     * @param fontResolution The font resolution in DPI (dots per inch). The default is 96 dpi. All
     *   burn-in and DVB-Sub font settings must match.
     */
    public fun fontResolution(fontResolution: Number) {
        cdkBuilder.fontResolution(fontResolution)
    }

    /**
     * @param fontSize When set to auto, fontSize scales depending on the size of the output.
     *   Providing a positive integer specifies the exact font size in points. All burn-in and
     *   DVB-Sub font settings must match.
     */
    public fun fontSize(fontSize: String) {
        cdkBuilder.fontSize(fontSize)
    }

    /**
     * @param outlineColor Specifies the font outline color. This option is not valid for source
     *   captions that are either 608/embedded or Teletext. These source settings are already
     *   pre-defined by the captions stream. All burn-in and DVB-Sub font settings must match.
     */
    public fun outlineColor(outlineColor: String) {
        cdkBuilder.outlineColor(outlineColor)
    }

    /**
     * @param outlineSize Specifies the font outline size in pixels. This option is not valid for
     *   source captions that are either 608/embedded or Teletext. These source settings are already
     *   pre-defined by the captions stream. All burn-in and DVB-Sub font settings must match.
     */
    public fun outlineSize(outlineSize: Number) {
        cdkBuilder.outlineSize(outlineSize)
    }

    /**
     * @param shadowColor Specifies the color of the shadow that is cast by the captions. All
     *   burn-in and DVB-Sub font settings must match.
     */
    public fun shadowColor(shadowColor: String) {
        cdkBuilder.shadowColor(shadowColor)
    }

    /**
     * @param shadowOpacity Specifies the opacity of the shadow. 255 is opaque; 0 is transparent.
     *   Keeping this parameter blank is equivalent to setting it to 0 (transparent). All burn-in
     *   and DVB-Sub font settings must match.
     */
    public fun shadowOpacity(shadowOpacity: Number) {
        cdkBuilder.shadowOpacity(shadowOpacity)
    }

    /**
     * @param shadowXOffset Specifies the horizontal offset of the shadow relative to the captions
     *   in pixels. A value of -2 would result in a shadow offset 2 pixels to the left. All burn-in
     *   and DVB-Sub font settings must match.
     */
    public fun shadowXOffset(shadowXOffset: Number) {
        cdkBuilder.shadowXOffset(shadowXOffset)
    }

    /**
     * @param shadowYOffset Specifies the vertical offset of the shadow relative to the captions in
     *   pixels. A value of -2 would result in a shadow offset 2 pixels above the text. All burn-in
     *   and DVB-Sub font settings must match.
     */
    public fun shadowYOffset(shadowYOffset: Number) {
        cdkBuilder.shadowYOffset(shadowYOffset)
    }

    /**
     * @param teletextGridControl Controls whether a fixed grid size is used to generate the output
     *   subtitles bitmap. This applies to only Teletext inputs and DVB-Sub/Burn-in outputs.
     */
    public fun teletextGridControl(teletextGridControl: String) {
        cdkBuilder.teletextGridControl(teletextGridControl)
    }

    /**
     * @param xPosition Specifies the horizontal position of the captions relative to the left side
     *   of the output in pixels. A value of 10 would result in the captions starting 10 pixels from
     *   the left of the output. If no explicit xPosition is provided, the horizontal captions
     *   position is determined by the alignment parameter. This option is not valid for source
     *   captions that are STL, 608/embedded, or Teletext. These source settings are already
     *   pre-defined by the captions stream. All burn-in and DVB-Sub font settings must match.
     */
    public fun xPosition(xPosition: Number) {
        cdkBuilder.xPosition(xPosition)
    }

    /**
     * @param yPosition Specifies the vertical position of the captions relative to the top of the
     *   output in pixels. A value of 10 would result in the captions starting 10 pixels from the
     *   top of the output. If no explicit yPosition is provided, the captions are positioned
     *   towards the bottom of the output. This option is not valid for source captions that are
     *   STL, 608/embedded, or Teletext. These source settings are already pre-defined by the
     *   captions stream. All burn-in and DVB-Sub font settings must match.
     */
    public fun yPosition(yPosition: Number) {
        cdkBuilder.yPosition(yPosition)
    }

    public fun build(): CfnChannel.DvbSubDestinationSettingsProperty = cdkBuilder.build()
}
