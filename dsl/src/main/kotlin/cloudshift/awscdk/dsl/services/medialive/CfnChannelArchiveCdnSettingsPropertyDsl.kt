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
 * Settings to configure the destination of an Archive output.
 *
 * The parent of this entity is ArchiveGroupSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * ArchiveCdnSettingsProperty archiveCdnSettingsProperty = ArchiveCdnSettingsProperty.builder()
 * .archiveS3Settings(ArchiveS3SettingsProperty.builder()
 * .cannedAcl("cannedAcl")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-archivecdnsettings.html)
 */
@CdkDslMarker
public class CfnChannelArchiveCdnSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.ArchiveCdnSettingsProperty.Builder =
        CfnChannel.ArchiveCdnSettingsProperty.builder()

    /** @param archiveS3Settings Sets up Amazon S3 as the destination for this Archive output. */
    public fun archiveS3Settings(archiveS3Settings: IResolvable) {
        cdkBuilder.archiveS3Settings(archiveS3Settings)
    }

    /** @param archiveS3Settings Sets up Amazon S3 as the destination for this Archive output. */
    public fun archiveS3Settings(archiveS3Settings: CfnChannel.ArchiveS3SettingsProperty) {
        cdkBuilder.archiveS3Settings(archiveS3Settings)
    }

    public fun build(): CfnChannel.ArchiveCdnSettingsProperty = cdkBuilder.build()
}
