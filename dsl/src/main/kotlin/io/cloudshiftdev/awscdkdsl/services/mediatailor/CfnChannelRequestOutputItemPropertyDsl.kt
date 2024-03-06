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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnChannel

/**
 * The output configuration for this channel.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * RequestOutputItemProperty requestOutputItemProperty = RequestOutputItemProperty.builder()
 * .manifestName("manifestName")
 * .sourceGroup("sourceGroup")
 * // the properties below are optional
 * .dashPlaylistSettings(DashPlaylistSettingsProperty.builder()
 * .manifestWindowSeconds(123)
 * .minBufferTimeSeconds(123)
 * .minUpdatePeriodSeconds(123)
 * .suggestedPresentationDelaySeconds(123)
 * .build())
 * .hlsPlaylistSettings(HlsPlaylistSettingsProperty.builder()
 * .adMarkupType(List.of("adMarkupType"))
 * .manifestWindowSeconds(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-requestoutputitem.html)
 */
@CdkDslMarker
public class CfnChannelRequestOutputItemPropertyDsl {
    private val cdkBuilder: CfnChannel.RequestOutputItemProperty.Builder =
        CfnChannel.RequestOutputItemProperty.builder()

    /** @param dashPlaylistSettings DASH manifest configuration parameters. */
    public fun dashPlaylistSettings(dashPlaylistSettings: IResolvable) {
        cdkBuilder.dashPlaylistSettings(dashPlaylistSettings)
    }

    /** @param dashPlaylistSettings DASH manifest configuration parameters. */
    public fun dashPlaylistSettings(dashPlaylistSettings: CfnChannel.DashPlaylistSettingsProperty) {
        cdkBuilder.dashPlaylistSettings(dashPlaylistSettings)
    }

    /** @param hlsPlaylistSettings HLS playlist configuration parameters. */
    public fun hlsPlaylistSettings(hlsPlaylistSettings: IResolvable) {
        cdkBuilder.hlsPlaylistSettings(hlsPlaylistSettings)
    }

    /** @param hlsPlaylistSettings HLS playlist configuration parameters. */
    public fun hlsPlaylistSettings(hlsPlaylistSettings: CfnChannel.HlsPlaylistSettingsProperty) {
        cdkBuilder.hlsPlaylistSettings(hlsPlaylistSettings)
    }

    /**
     * @param manifestName The name of the manifest for the channel. The name appears in the
     *   `PlaybackUrl` .
     */
    public fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
    }

    /**
     * @param sourceGroup A string used to match which `HttpPackageConfiguration` is used for each
     *   `VodSource` .
     */
    public fun sourceGroup(sourceGroup: String) {
        cdkBuilder.sourceGroup(sourceGroup)
    }

    public fun build(): CfnChannel.RequestOutputItemProperty = cdkBuilder.build()
}
