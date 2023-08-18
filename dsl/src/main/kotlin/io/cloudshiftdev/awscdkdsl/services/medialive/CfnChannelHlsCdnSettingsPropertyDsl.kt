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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for the CDN of an HLS output.
 *
 * The parent of this entity is HlsGroupSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * HlsCdnSettingsProperty hlsCdnSettingsProperty = HlsCdnSettingsProperty.builder()
 * .hlsAkamaiSettings(HlsAkamaiSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .httpTransferMode("httpTransferMode")
 * .numRetries(123)
 * .restartDelay(123)
 * .salt("salt")
 * .token("token")
 * .build())
 * .hlsBasicPutSettings(HlsBasicPutSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .numRetries(123)
 * .restartDelay(123)
 * .build())
 * .hlsMediaStoreSettings(HlsMediaStoreSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .mediaStoreStorageClass("mediaStoreStorageClass")
 * .numRetries(123)
 * .restartDelay(123)
 * .build())
 * .hlsS3Settings(HlsS3SettingsProperty.builder()
 * .cannedAcl("cannedAcl")
 * .build())
 * .hlsWebdavSettings(HlsWebdavSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .httpTransferMode("httpTransferMode")
 * .numRetries(123)
 * .restartDelay(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlscdnsettings.html)
 */
@CdkDslMarker
public class CfnChannelHlsCdnSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsCdnSettingsProperty.Builder =
        CfnChannel.HlsCdnSettingsProperty.builder()

    /**
     * @param hlsAkamaiSettings Sets up Akamai as the downstream system for the HLS output group.
     */
    public fun hlsAkamaiSettings(hlsAkamaiSettings: IResolvable) {
        cdkBuilder.hlsAkamaiSettings(hlsAkamaiSettings)
    }

    /**
     * @param hlsAkamaiSettings Sets up Akamai as the downstream system for the HLS output group.
     */
    public fun hlsAkamaiSettings(hlsAkamaiSettings: CfnChannel.HlsAkamaiSettingsProperty) {
        cdkBuilder.hlsAkamaiSettings(hlsAkamaiSettings)
    }

    /** @param hlsBasicPutSettings The settings for Basic Put for the HLS output. */
    public fun hlsBasicPutSettings(hlsBasicPutSettings: IResolvable) {
        cdkBuilder.hlsBasicPutSettings(hlsBasicPutSettings)
    }

    /** @param hlsBasicPutSettings The settings for Basic Put for the HLS output. */
    public fun hlsBasicPutSettings(hlsBasicPutSettings: CfnChannel.HlsBasicPutSettingsProperty) {
        cdkBuilder.hlsBasicPutSettings(hlsBasicPutSettings)
    }

    /** @param hlsMediaStoreSettings Sets up MediaStore as the destination for the HLS output. */
    public fun hlsMediaStoreSettings(hlsMediaStoreSettings: IResolvable) {
        cdkBuilder.hlsMediaStoreSettings(hlsMediaStoreSettings)
    }

    /** @param hlsMediaStoreSettings Sets up MediaStore as the destination for the HLS output. */
    public fun hlsMediaStoreSettings(
        hlsMediaStoreSettings: CfnChannel.HlsMediaStoreSettingsProperty
    ) {
        cdkBuilder.hlsMediaStoreSettings(hlsMediaStoreSettings)
    }

    /** @param hlsS3Settings Sets up Amazon S3 as the destination for this HLS output. */
    public fun hlsS3Settings(hlsS3Settings: IResolvable) {
        cdkBuilder.hlsS3Settings(hlsS3Settings)
    }

    /** @param hlsS3Settings Sets up Amazon S3 as the destination for this HLS output. */
    public fun hlsS3Settings(hlsS3Settings: CfnChannel.HlsS3SettingsProperty) {
        cdkBuilder.hlsS3Settings(hlsS3Settings)
    }

    /**
     * @param hlsWebdavSettings The settings for Web VTT captions in the HLS output group. The
     *   parent of this entity is HlsGroupSettings.
     */
    public fun hlsWebdavSettings(hlsWebdavSettings: IResolvable) {
        cdkBuilder.hlsWebdavSettings(hlsWebdavSettings)
    }

    /**
     * @param hlsWebdavSettings The settings for Web VTT captions in the HLS output group. The
     *   parent of this entity is HlsGroupSettings.
     */
    public fun hlsWebdavSettings(hlsWebdavSettings: CfnChannel.HlsWebdavSettingsProperty) {
        cdkBuilder.hlsWebdavSettings(hlsWebdavSettings)
    }

    public fun build(): CfnChannel.HlsCdnSettingsProperty = cdkBuilder.build()
}
