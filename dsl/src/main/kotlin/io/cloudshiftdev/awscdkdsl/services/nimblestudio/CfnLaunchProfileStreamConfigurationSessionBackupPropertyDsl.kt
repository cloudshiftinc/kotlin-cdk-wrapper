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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnLaunchProfile

/**
 * Configures how streaming sessions are backed up when launched from this launch profile.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.nimblestudio.*;
 * StreamConfigurationSessionBackupProperty streamConfigurationSessionBackupProperty =
 * StreamConfigurationSessionBackupProperty.builder()
 * .maxBackupsToRetain(123)
 * .mode("mode")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-nimblestudio-launchprofile-streamconfigurationsessionbackup.html)
 */
@CdkDslMarker
public class CfnLaunchProfileStreamConfigurationSessionBackupPropertyDsl {
    private val cdkBuilder: CfnLaunchProfile.StreamConfigurationSessionBackupProperty.Builder =
        CfnLaunchProfile.StreamConfigurationSessionBackupProperty.builder()

    /**
     * @param maxBackupsToRetain The maximum number of backups that each streaming session created
     *   from this launch profile can have.
     */
    public fun maxBackupsToRetain(maxBackupsToRetain: Number) {
        cdkBuilder.maxBackupsToRetain(maxBackupsToRetain)
    }

    /**
     * @param mode Specifies how artists sessions are backed up. Configures backups for streaming
     *   sessions launched with this launch profile. The default value is `DEACTIVATED` , which
     *   means that backups are deactivated. To allow backups, set this value to `AUTOMATIC` .
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    public fun build(): CfnLaunchProfile.StreamConfigurationSessionBackupProperty =
        cdkBuilder.build()
}
