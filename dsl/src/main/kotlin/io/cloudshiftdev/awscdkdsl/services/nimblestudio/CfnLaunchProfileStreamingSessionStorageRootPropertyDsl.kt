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

package io.cloudshiftdev.awscdkdsl.services.nimblestudio

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile

/**
 * The upload storage root location (folder) on streaming workstations where files are uploaded.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * StreamingSessionStorageRootProperty streamingSessionStorageRootProperty =
 * StreamingSessionStorageRootProperty.builder()
 * .linux("linux")
 * .windows("windows")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamingsessionstorageroot.html)
 */
@CdkDslMarker
public class CfnLaunchProfileStreamingSessionStorageRootPropertyDsl {
    private val cdkBuilder: CfnLaunchProfile.StreamingSessionStorageRootProperty.Builder =
        CfnLaunchProfile.StreamingSessionStorageRootProperty.builder()

    /** @param linux The folder path in Linux workstations where files are uploaded. */
    public fun linux(linux: String) {
        cdkBuilder.linux(linux)
    }

    /** @param windows The folder path in Windows workstations where files are uploaded. */
    public fun windows(windows: String) {
        cdkBuilder.windows(windows)
    }

    public fun build(): CfnLaunchProfile.StreamingSessionStorageRootProperty = cdkBuilder.build()
}
