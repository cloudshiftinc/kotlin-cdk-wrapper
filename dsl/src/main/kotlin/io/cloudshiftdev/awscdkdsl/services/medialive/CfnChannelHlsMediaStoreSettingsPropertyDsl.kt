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
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration of a MediaStore container as the destination for an HLS output.
 *
 * The parent of this entity is HlsCdnSettings.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * HlsMediaStoreSettingsProperty hlsMediaStoreSettingsProperty =
 * HlsMediaStoreSettingsProperty.builder()
 * .connectionRetryInterval(123)
 * .filecacheDuration(123)
 * .mediaStoreStorageClass("mediaStoreStorageClass")
 * .numRetries(123)
 * .restartDelay(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsmediastoresettings.html)
 */
@CdkDslMarker
public class CfnChannelHlsMediaStoreSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsMediaStoreSettingsProperty.Builder =
        CfnChannel.HlsMediaStoreSettingsProperty.builder()

    /**
     * @param connectionRetryInterval The number of seconds to wait before retrying a connection to
     *   the CDN if the connection is lost.
     */
    public fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
    }

    /** @param filecacheDuration The size, in seconds, of the file cache for streaming outputs. */
    public fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
    }

    /**
     * @param mediaStoreStorageClass When set to temporal, output files are stored in non-persistent
     *   memory for faster reading and writing.
     */
    public fun mediaStoreStorageClass(mediaStoreStorageClass: String) {
        cdkBuilder.mediaStoreStorageClass(mediaStoreStorageClass)
    }

    /**
     * @param numRetries The number of retry attempts that are made before the channel is put into
     *   an error state.
     */
    public fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
    }

    /**
     * @param restartDelay If a streaming output fails, the number of seconds to wait until a
     *   restart is initiated. A value of 0 means never restart.
     */
    public fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
    }

    public fun build(): CfnChannel.HlsMediaStoreSettingsProperty = cdkBuilder.build()
}
