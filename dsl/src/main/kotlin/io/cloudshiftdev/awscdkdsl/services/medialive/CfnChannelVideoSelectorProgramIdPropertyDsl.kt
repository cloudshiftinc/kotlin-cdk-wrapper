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
import kotlin.Number
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Used to extract video by the program ID.
 *
 * The parent of this entity is VideoSelectorSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * VideoSelectorProgramIdProperty videoSelectorProgramIdProperty =
 * VideoSelectorProgramIdProperty.builder()
 * .programId(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-videoselectorprogramid.html)
 */
@CdkDslMarker
public class CfnChannelVideoSelectorProgramIdPropertyDsl {
    private val cdkBuilder: CfnChannel.VideoSelectorProgramIdProperty.Builder =
        CfnChannel.VideoSelectorProgramIdProperty.builder()

    /**
     * @param programId Selects a specific program from within a multi-program transport stream. If
     *   the program doesn't exist, MediaLive selects the first program within the transport stream
     *   by default.
     */
    public fun programId(programId: Number) {
        cdkBuilder.programId(programId)
    }

    public fun build(): CfnChannel.VideoSelectorProgramIdProperty = cdkBuilder.build()
}
