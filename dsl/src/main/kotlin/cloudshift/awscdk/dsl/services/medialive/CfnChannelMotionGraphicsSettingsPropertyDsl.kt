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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings to enable and configure the motion graphics overlay feature in the channel.
 *
 * The parent of this entity is MotionGraphicsConfiguration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MotionGraphicsSettingsProperty motionGraphicsSettingsProperty =
 * MotionGraphicsSettingsProperty.builder()
 * .htmlMotionGraphicsSettings(HtmlMotionGraphicsSettingsProperty.builder().build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-motiongraphicssettings.html)
 */
@CdkDslMarker
public class CfnChannelMotionGraphicsSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.MotionGraphicsSettingsProperty.Builder =
        CfnChannel.MotionGraphicsSettingsProperty.builder()

    /**
     * @param htmlMotionGraphicsSettings Settings to configure the motion graphics overlay to use an
     *   HTML asset.
     */
    public fun htmlMotionGraphicsSettings(htmlMotionGraphicsSettings: IResolvable) {
        cdkBuilder.htmlMotionGraphicsSettings(htmlMotionGraphicsSettings)
    }

    /**
     * @param htmlMotionGraphicsSettings Settings to configure the motion graphics overlay to use an
     *   HTML asset.
     */
    public fun htmlMotionGraphicsSettings(
        htmlMotionGraphicsSettings: CfnChannel.HtmlMotionGraphicsSettingsProperty
    ) {
        cdkBuilder.htmlMotionGraphicsSettings(htmlMotionGraphicsSettings)
    }

    public fun build(): CfnChannel.MotionGraphicsSettingsProperty = cdkBuilder.build()
}
