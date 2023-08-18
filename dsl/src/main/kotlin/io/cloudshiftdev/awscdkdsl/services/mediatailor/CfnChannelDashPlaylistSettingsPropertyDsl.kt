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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.mediatailor.CfnChannel

/**
 * Dash manifest configuration parameters.</p>.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * DashPlaylistSettingsProperty dashPlaylistSettingsProperty =
 * DashPlaylistSettingsProperty.builder()
 * .manifestWindowSeconds(123)
 * .minBufferTimeSeconds(123)
 * .minUpdatePeriodSeconds(123)
 * .suggestedPresentationDelaySeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-dashplaylistsettings.html)
 */
@CdkDslMarker
public class CfnChannelDashPlaylistSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.DashPlaylistSettingsProperty.Builder =
        CfnChannel.DashPlaylistSettingsProperty.builder()

    /**
     * @param manifestWindowSeconds The total duration (in seconds) of each manifest. Minimum value:
     *   `30` seconds. Maximum value: `3600` seconds.</p>
     */
    public fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
    }

    /**
     * @param minBufferTimeSeconds Minimum amount of content (measured in seconds) that a player
     *   must keep available in the buffer. Minimum value: `2` seconds. Maximum value: `60`
     *   seconds.</p>
     */
    public fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
        cdkBuilder.minBufferTimeSeconds(minBufferTimeSeconds)
    }

    /**
     * @param minUpdatePeriodSeconds Minimum amount of time (in seconds) that the player should wait
     *   before requesting updates to the manifest. Minimum value: `2` seconds. Maximum value: `60`
     *   seconds.</p>
     */
    public fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number) {
        cdkBuilder.minUpdatePeriodSeconds(minUpdatePeriodSeconds)
    }

    /**
     * @param suggestedPresentationDelaySeconds Amount of time (in seconds) that the player should
     *   be from the live point at the end of the manifest. Minimum value: `2` seconds. Maximum
     *   value: `60` seconds.</p>
     */
    public fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number) {
        cdkBuilder.suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds)
    }

    public fun build(): CfnChannel.DashPlaylistSettingsProperty = cdkBuilder.build()
}
