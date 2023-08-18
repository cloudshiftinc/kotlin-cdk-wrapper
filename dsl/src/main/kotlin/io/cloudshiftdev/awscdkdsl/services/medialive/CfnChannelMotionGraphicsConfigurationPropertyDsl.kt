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
 * Settings to enable and configure the motion graphics overlay feature in the channel.
 *
 * The parent of this entity is EncoderSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MotionGraphicsConfigurationProperty motionGraphicsConfigurationProperty =
 * MotionGraphicsConfigurationProperty.builder()
 * .motionGraphicsInsertion("motionGraphicsInsertion")
 * .motionGraphicsSettings(MotionGraphicsSettingsProperty.builder()
 * .htmlMotionGraphicsSettings(HtmlMotionGraphicsSettingsProperty.builder().build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-motiongraphicsconfiguration.html)
 */
@CdkDslMarker
public class CfnChannelMotionGraphicsConfigurationPropertyDsl {
    private val cdkBuilder: CfnChannel.MotionGraphicsConfigurationProperty.Builder =
        CfnChannel.MotionGraphicsConfigurationProperty.builder()

    /**
     * @param motionGraphicsInsertion Enables or disables the motion graphics overlay feature in the
     *   channel.
     */
    public fun motionGraphicsInsertion(motionGraphicsInsertion: String) {
        cdkBuilder.motionGraphicsInsertion(motionGraphicsInsertion)
    }

    /**
     * @param motionGraphicsSettings Settings to enable and configure the motion graphics overlay
     *   feature in the channel.
     */
    public fun motionGraphicsSettings(motionGraphicsSettings: IResolvable) {
        cdkBuilder.motionGraphicsSettings(motionGraphicsSettings)
    }

    /**
     * @param motionGraphicsSettings Settings to enable and configure the motion graphics overlay
     *   feature in the channel.
     */
    public fun motionGraphicsSettings(
        motionGraphicsSettings: CfnChannel.MotionGraphicsSettingsProperty
    ) {
        cdkBuilder.motionGraphicsSettings(motionGraphicsSettings)
    }

    public fun build(): CfnChannel.MotionGraphicsConfigurationProperty = cdkBuilder.build()
}
