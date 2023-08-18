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
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings for EBU-TT captions in the output.
 *
 * The parent of this entity is CaptionDestinationSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * EbuTtDDestinationSettingsProperty ebuTtDDestinationSettingsProperty =
 * EbuTtDDestinationSettingsProperty.builder()
 * .copyrightHolder("copyrightHolder")
 * .fillLineGap("fillLineGap")
 * .fontFamily("fontFamily")
 * .styleControl("styleControl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-ebuttddestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelEbuTtDDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.EbuTtDDestinationSettingsProperty.Builder =
        CfnChannel.EbuTtDDestinationSettingsProperty.builder()

    /**
     * @param copyrightHolder Applies only if you plan to convert these source captions to EBU-TT-D
     *   or TTML in an output. Complete this field if you want to include the name of the copyright
     *   holder in the copyright metadata tag in the TTML
     */
    public fun copyrightHolder(copyrightHolder: String) {
        cdkBuilder.copyrightHolder(copyrightHolder)
    }

    /**
     * @param fillLineGap Specifies how to handle the gap between the lines (in multi-line
     *   captions).
     * * enabled: Fill with the captions background color (as specified in the input captions).
     * * disabled: Leave the gap unfilled.
     */
    public fun fillLineGap(fillLineGap: String) {
        cdkBuilder.fillLineGap(fillLineGap)
    }

    /**
     * @param fontFamily Specifies the font family to include in the font data attached to the
     *   EBU-TT captions. Valid only if styleControl is set to include. If you leave this field
     *   empty, the font family is set to "monospaced". (If styleControl is set to exclude, the font
     *   family is always set to "monospaced".) You specify only the font family. All other style
     *   information (color, bold, position and so on) is copied from the input captions. The size
     *   is always set to 100% to allow the downstream player to choose the size. - Enter a list of
     *   font families, as a comma-separated list of font names, in order of preference. The name
     *   can be a font family (such as “Arial”), or a generic font family (such as “serif”), or
     *   “default” (to let the downstream player choose the font).
     * * Leave blank to set the family to “monospace”.
     */
    public fun fontFamily(fontFamily: String) {
        cdkBuilder.fontFamily(fontFamily)
    }

    /**
     * @param styleControl Specifies the style information (font color, font position, and so on) to
     *   include in the font data that is attached to the EBU-TT captions.
     * * include: Take the style information (font color, font position, and so on) from the source
     *   captions and include that information in the font data attached to the EBU-TT captions.
     *   This option is valid only if the source captions are Embedded or Teletext.
     * * exclude: In the font data attached to the EBU-TT captions, set the font family to
     *   "monospaced". Do not include any other style information.
     */
    public fun styleControl(styleControl: String) {
        cdkBuilder.styleControl(styleControl)
    }

    public fun build(): CfnChannel.EbuTtDDestinationSettingsProperty = cdkBuilder.build()
}
