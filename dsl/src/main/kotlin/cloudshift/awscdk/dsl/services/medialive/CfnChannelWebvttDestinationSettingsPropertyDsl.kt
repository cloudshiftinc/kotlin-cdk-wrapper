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
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of Web VTT captions in the output.
 *
 * The parent of this entity is CaptionDestinationSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * WebvttDestinationSettingsProperty webvttDestinationSettingsProperty =
 * WebvttDestinationSettingsProperty.builder()
 * .styleControl("styleControl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-webvttdestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelWebvttDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.WebvttDestinationSettingsProperty.Builder =
        CfnChannel.WebvttDestinationSettingsProperty.builder()

    /**
     * @param styleControl Controls whether the color and position of the source captions is passed
     *   through to the WebVTT output captions. PASSTHROUGH - Valid only if the source captions are
     *   EMBEDDED or TELETEXT. NO_STYLE_DATA - Don't pass through the style. The output captions
     *   will not contain any font styling information.
     */
    public fun styleControl(styleControl: String) {
        cdkBuilder.styleControl(styleControl)
    }

    public fun build(): CfnChannel.WebvttDestinationSettingsProperty = cdkBuilder.build()
}
