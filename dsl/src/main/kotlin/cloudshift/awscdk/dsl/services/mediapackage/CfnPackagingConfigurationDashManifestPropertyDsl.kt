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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

/**
 * Parameters for a DASH manifest.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * DashManifestProperty dashManifestProperty = DashManifestProperty.builder()
 * .manifestLayout("manifestLayout")
 * .manifestName("manifestName")
 * .minBufferTimeSeconds(123)
 * .profile("profile")
 * .scteMarkersSource("scteMarkersSource")
 * .streamSelection(StreamSelectionProperty.builder()
 * .maxVideoBitsPerSecond(123)
 * .minVideoBitsPerSecond(123)
 * .streamOrder("streamOrder")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashmanifest.html)
 */
@CdkDslMarker
public class CfnPackagingConfigurationDashManifestPropertyDsl {
    private val cdkBuilder: CfnPackagingConfiguration.DashManifestProperty.Builder =
        CfnPackagingConfiguration.DashManifestProperty.builder()

    /**
     * @param manifestLayout Determines the position of some tags in the Media Presentation
     *   Description (MPD). When set to `FULL` , elements like `SegmentTemplate` and
     *   `ContentProtection` are included in each `Representation` . When set to `COMPACT` ,
     *   duplicate elements are combined and presented at the AdaptationSet level.
     */
    public fun manifestLayout(manifestLayout: String) {
        cdkBuilder.manifestLayout(manifestLayout)
    }

    /**
     * @param manifestName A short string that's appended to the end of the endpoint URL to create a
     *   unique path to this packaging configuration.
     */
    public fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
    }

    /**
     * @param minBufferTimeSeconds Minimum amount of content (measured in seconds) that a player
     *   must keep available in the buffer.
     */
    public fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
        cdkBuilder.minBufferTimeSeconds(minBufferTimeSeconds)
    }

    /**
     * @param profile The DASH profile type. When set to `HBBTV_1_5` , the content is compliant with
     *   HbbTV 1.5.
     */
    public fun profile(profile: String) {
        cdkBuilder.profile(profile)
    }

    /**
     * @param scteMarkersSource The source of scte markers used. Value description:
     * * `SEGMENTS` - The scte markers are sourced from the segments of the ingested content.
     * * `MANIFEST` - the scte markers are sourced from the manifest of the ingested content. The
     *   MANIFEST value is compatible with source HLS playlists using the SCTE-35 Enhanced syntax (
     *   `EXT-OATCLS-SCTE35` tags). SCTE-35 Elemental and SCTE-35 Daterange syntaxes are not
     *   supported with this option.
     */
    public fun scteMarkersSource(scteMarkersSource: String) {
        cdkBuilder.scteMarkersSource(scteMarkersSource)
    }

    /**
     * @param streamSelection Limitations for outputs from the endpoint, based on the video bitrate.
     */
    public fun streamSelection(streamSelection: IResolvable) {
        cdkBuilder.streamSelection(streamSelection)
    }

    /**
     * @param streamSelection Limitations for outputs from the endpoint, based on the video bitrate.
     */
    public fun streamSelection(streamSelection: CfnPackagingConfiguration.StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection)
    }

    public fun build(): CfnPackagingConfiguration.DashManifestProperty = cdkBuilder.build()
}
