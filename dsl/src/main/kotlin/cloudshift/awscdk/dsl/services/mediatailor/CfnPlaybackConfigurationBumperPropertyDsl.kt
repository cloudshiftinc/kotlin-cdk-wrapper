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
 * The configuration for bumpers.
 *
 * Bumpers are short audio or video clips that play at the start or before the end of an ad break.
 * To learn more about bumpers, see Bumpers
 * (https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * BumperProperty bumperProperty = BumperProperty.builder()
 * .endUrl("endUrl")
 * .startUrl("startUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-bumper.html)
 */
@CdkDslMarker
public class CfnPlaybackConfigurationBumperPropertyDsl {
    private val cdkBuilder: CfnPlaybackConfiguration.BumperProperty.Builder =
        CfnPlaybackConfiguration.BumperProperty.builder()

    /** @param endUrl The URL for the end bumper asset. */
    public fun endUrl(endUrl: String) {
        cdkBuilder.endUrl(endUrl)
    }

    /** @param startUrl The URL for the start bumper asset. */
    public fun startUrl(startUrl: String) {
        cdkBuilder.startUrl(startUrl)
    }

    public fun build(): CfnPlaybackConfiguration.BumperProperty = cdkBuilder.build()
}
