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

package io.cloudshiftdev.awscdkdsl.services.mediapackage

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

/**
 * Limitations for outputs from the endpoint, based on the video bitrate.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * StreamSelectionProperty streamSelectionProperty = StreamSelectionProperty.builder()
 * .maxVideoBitsPerSecond(123)
 * .minVideoBitsPerSecond(123)
 * .streamOrder("streamOrder")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-streamselection.html)
 */
@CdkDslMarker
public class CfnPackagingConfigurationStreamSelectionPropertyDsl {
    private val cdkBuilder: CfnPackagingConfiguration.StreamSelectionProperty.Builder =
        CfnPackagingConfiguration.StreamSelectionProperty.builder()

    /**
     * @param maxVideoBitsPerSecond The upper limit of the bitrates that this endpoint serves. If
     *   the video track exceeds this threshold, then AWS Elemental MediaPackage excludes it from
     *   output. If you don't specify a value, it defaults to 2147483647 bits per second.
     */
    public fun maxVideoBitsPerSecond(maxVideoBitsPerSecond: Number) {
        cdkBuilder.maxVideoBitsPerSecond(maxVideoBitsPerSecond)
    }

    /**
     * @param minVideoBitsPerSecond The lower limit of the bitrates that this endpoint serves. If
     *   the video track is below this threshold, then AWS Elemental MediaPackage excludes it from
     *   output. If you don't specify a value, it defaults to 0 bits per second.
     */
    public fun minVideoBitsPerSecond(minVideoBitsPerSecond: Number) {
        cdkBuilder.minVideoBitsPerSecond(minVideoBitsPerSecond)
    }

    /**
     * @param streamOrder Order in which the different video bitrates are presented to the player.
     *   Valid values: `ORIGINAL` , `VIDEO_BITRATE_ASCENDING` , `VIDEO_BITRATE_DESCENDING` .
     */
    public fun streamOrder(streamOrder: String) {
        cdkBuilder.streamOrder(streamOrder)
    }

    public fun build(): CfnPackagingConfiguration.StreamSelectionProperty = cdkBuilder.build()
}
