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
 * Sets up Amazon S3 as the destination for this Archive output.
 *
 * The parent of this entity is ArchiveCdnSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * ArchiveS3SettingsProperty archiveS3SettingsProperty = ArchiveS3SettingsProperty.builder()
 * .cannedAcl("cannedAcl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-archives3settings.html)
 */
@CdkDslMarker
public class CfnChannelArchiveS3SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.ArchiveS3SettingsProperty.Builder =
        CfnChannel.ArchiveS3SettingsProperty.builder()

    /** @param cannedAcl Specify the canned ACL to apply to each S3 request. Defaults to none. */
    public fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
    }

    public fun build(): CfnChannel.ArchiveS3SettingsProperty = cdkBuilder.build()
}
