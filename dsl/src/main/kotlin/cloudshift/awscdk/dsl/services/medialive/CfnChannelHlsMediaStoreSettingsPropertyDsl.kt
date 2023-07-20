@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnChannelHlsMediaStoreSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsMediaStoreSettingsProperty.Builder =
        CfnChannel.HlsMediaStoreSettingsProperty.builder()

    public fun connectionRetryInterval(connectionRetryInterval: Number) {
        cdkBuilder.connectionRetryInterval(connectionRetryInterval)
    }

    public fun filecacheDuration(filecacheDuration: Number) {
        cdkBuilder.filecacheDuration(filecacheDuration)
    }

    public fun mediaStoreStorageClass(mediaStoreStorageClass: String) {
        cdkBuilder.mediaStoreStorageClass(mediaStoreStorageClass)
    }

    public fun numRetries(numRetries: Number) {
        cdkBuilder.numRetries(numRetries)
    }

    public fun restartDelay(restartDelay: Number) {
        cdkBuilder.restartDelay(restartDelay)
    }

    public fun build(): CfnChannel.HlsMediaStoreSettingsProperty = cdkBuilder.build()
}
