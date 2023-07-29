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
 * Destination settings for a MediaPackage output.
 *
 * The parent of this entity is OutputDestination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * MediaPackageOutputDestinationSettingsProperty mediaPackageOutputDestinationSettingsProperty =
 * MediaPackageOutputDestinationSettingsProperty.builder()
 * .channelId("channelId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-mediapackageoutputdestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelMediaPackageOutputDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.MediaPackageOutputDestinationSettingsProperty.Builder =
        CfnChannel.MediaPackageOutputDestinationSettingsProperty.builder()

    /**
     * @param channelId The ID of the channel in MediaPackage that is the destination for this
     *   output group. You don't need to specify the individual inputs in MediaPackage; MediaLive
     *   handles the connection of the two MediaLive pipelines to the two MediaPackage inputs. The
     *   MediaPackage channel and MediaLive channel must be in the same Region.
     */
    public fun channelId(channelId: String) {
        cdkBuilder.channelId(channelId)
    }

    public fun build(): CfnChannel.MediaPackageOutputDestinationSettingsProperty =
        cdkBuilder.build()
}
