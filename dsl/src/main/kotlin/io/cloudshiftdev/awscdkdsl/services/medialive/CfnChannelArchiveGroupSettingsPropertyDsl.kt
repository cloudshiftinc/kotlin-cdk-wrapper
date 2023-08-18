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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for an archive output group.
 *
 * The parent of this entity is OutputGroupSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * ArchiveGroupSettingsProperty archiveGroupSettingsProperty =
 * ArchiveGroupSettingsProperty.builder()
 * .archiveCdnSettings(ArchiveCdnSettingsProperty.builder()
 * .archiveS3Settings(ArchiveS3SettingsProperty.builder()
 * .cannedAcl("cannedAcl")
 * .build())
 * .build())
 * .destination(OutputLocationRefProperty.builder()
 * .destinationRefId("destinationRefId")
 * .build())
 * .rolloverInterval(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-archivegroupsettings.html)
 */
@CdkDslMarker
public class CfnChannelArchiveGroupSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.ArchiveGroupSettingsProperty.Builder =
        CfnChannel.ArchiveGroupSettingsProperty.builder()

    /** @param archiveCdnSettings Settings to configure the destination of an Archive output. */
    public fun archiveCdnSettings(archiveCdnSettings: IResolvable) {
        cdkBuilder.archiveCdnSettings(archiveCdnSettings)
    }

    /** @param archiveCdnSettings Settings to configure the destination of an Archive output. */
    public fun archiveCdnSettings(archiveCdnSettings: CfnChannel.ArchiveCdnSettingsProperty) {
        cdkBuilder.archiveCdnSettings(archiveCdnSettings)
    }

    /** @param destination A directory and base file name where archive files should be written. */
    public fun destination(destination: IResolvable) {
        cdkBuilder.destination(destination)
    }

    /** @param destination A directory and base file name where archive files should be written. */
    public fun destination(destination: CfnChannel.OutputLocationRefProperty) {
        cdkBuilder.destination(destination)
    }

    /**
     * @param rolloverInterval The number of seconds to write to an archive file before closing and
     *   starting a new one.
     */
    public fun rolloverInterval(rolloverInterval: Number) {
        cdkBuilder.rolloverInterval(rolloverInterval)
    }

    public fun build(): CfnChannel.ArchiveGroupSettingsProperty = cdkBuilder.build()
}
