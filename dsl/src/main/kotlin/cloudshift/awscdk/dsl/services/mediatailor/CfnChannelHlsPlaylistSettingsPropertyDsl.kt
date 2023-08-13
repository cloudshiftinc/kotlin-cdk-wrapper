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

package cloudshift.awscdk.dsl.services.mediatailor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.mediatailor.CfnChannel

/**
 * HLS playlist configuration parameters.</p>.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * HlsPlaylistSettingsProperty hlsPlaylistSettingsProperty = HlsPlaylistSettingsProperty.builder()
 * .manifestWindowSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-hlsplaylistsettings.html)
 */
@CdkDslMarker
public class CfnChannelHlsPlaylistSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.HlsPlaylistSettingsProperty.Builder =
        CfnChannel.HlsPlaylistSettingsProperty.builder()

    /**
     * @param manifestWindowSeconds The total duration (in seconds) of each manifest. Minimum value:
     *   `30` seconds. Maximum value: `3600` seconds.</p>
     */
    public fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
    }

    public fun build(): CfnChannel.HlsPlaylistSettingsProperty = cdkBuilder.build()
}
