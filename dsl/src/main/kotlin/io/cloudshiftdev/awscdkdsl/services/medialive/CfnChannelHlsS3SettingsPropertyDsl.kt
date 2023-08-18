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
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Sets up Amazon S3 as the destination for this HLS output.
 *
 * The parent of this entity is HlsCdnSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * HlsS3SettingsProperty hlsS3SettingsProperty = HlsS3SettingsProperty.builder()
 * .cannedAcl("cannedAcl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlss3settings.html)
 */
@CdkDslMarker
public class CfnChannelHlsS3SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsS3SettingsProperty.Builder =
        CfnChannel.HlsS3SettingsProperty.builder()

    /** @param cannedAcl Specify the canned ACL to apply to each S3 request. Defaults to none. */
    public fun cannedAcl(cannedAcl: String) {
        cdkBuilder.cannedAcl(cannedAcl)
    }

    public fun build(): CfnChannel.HlsS3SettingsProperty = cdkBuilder.build()
}
