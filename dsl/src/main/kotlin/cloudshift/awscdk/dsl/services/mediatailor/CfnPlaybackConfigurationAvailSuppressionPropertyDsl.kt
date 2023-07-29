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
import kotlin.String
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration

/**
 * The configuration for avail suppression, also known as ad suppression.
 *
 * For more information about ad suppression, see Ad Suppression
 * (https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * AvailSuppressionProperty availSuppressionProperty = AvailSuppressionProperty.builder()
 * .mode("mode")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-availsuppression.html)
 */
@CdkDslMarker
public class CfnPlaybackConfigurationAvailSuppressionPropertyDsl {
    private val cdkBuilder: CfnPlaybackConfiguration.AvailSuppressionProperty.Builder =
        CfnPlaybackConfiguration.AvailSuppressionProperty.builder()

    /**
     * @param mode Sets the ad suppression mode. By default, ad suppression is set to OFF and all ad
     *   breaks are filled with ads or slate. When Mode is set to BEHIND_LIVE_EDGE, ad suppression
     *   is active and MediaTailor won't fill ad breaks on or behind the ad suppression Value time
     *   in the manifest lookback window.
     */
    public fun mode(mode: String) {
        cdkBuilder.mode(mode)
    }

    /**
     * @param value A live edge offset time in HH:MM:SS. MediaTailor won't fill ad breaks on or
     *   behind this time in the manifest lookback window. If Value is set to 00:00:00, it is in
     *   sync with the live edge, and MediaTailor won't fill any ad breaks on or behind the live
     *   edge. If you set a Value time, MediaTailor won't fill any ad breaks on or behind this time
     *   in the manifest lookback window. For example, if you set 00:45:00, then MediaTailor will
     *   fill ad breaks that occur within 45 minutes behind the live edge, but won't fill ad breaks
     *   on or behind 45 minutes behind the live edge.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnPlaybackConfiguration.AvailSuppressionProperty = cdkBuilder.build()
}
