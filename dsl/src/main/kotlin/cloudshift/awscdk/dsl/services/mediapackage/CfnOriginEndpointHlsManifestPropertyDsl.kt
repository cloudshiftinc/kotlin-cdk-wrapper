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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

/**
 * An HTTP Live Streaming (HLS) manifest configuration on a CMAF endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * HlsManifestProperty hlsManifestProperty = HlsManifestProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .adMarkers("adMarkers")
 * .adsOnDeliveryRestrictions("adsOnDeliveryRestrictions")
 * .adTriggers(List.of("adTriggers"))
 * .includeIframeOnlyStream(false)
 * .manifestName("manifestName")
 * .playlistType("playlistType")
 * .playlistWindowSeconds(123)
 * .programDateTimeIntervalSeconds(123)
 * .url("url")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-hlsmanifest.html)
 */
@CdkDslMarker
public class CfnOriginEndpointHlsManifestPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.HlsManifestProperty.Builder =
        CfnOriginEndpoint.HlsManifestProperty.builder()

    private val _adTriggers: MutableList<String> = mutableListOf()

    /**
     * @param adMarkers Controls how ad markers are included in the packaged endpoint. Valid values:
     * * `NONE` - Omits all SCTE-35 ad markers from the output.
     * * `PASSTHROUGH` - Creates a copy in the output of the SCTE-35 ad markers (comments) taken
     *   directly from the input manifest.
     * * `SCTE35_ENHANCED` - Generates ad markers and blackout tags in the output based on the
     *   SCTE-35 messages from the input manifest.
     */
    public fun adMarkers(adMarkers: String) {
        cdkBuilder.adMarkers(adMarkers)
    }

    /**
     * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage treats
     *   as ad markers in the output manifest. Valid values:
     * * `BREAK`
     * * `DISTRIBUTOR_ADVERTISEMENT`
     * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
     * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
     * * `PROVIDER_ADVERTISEMENT`
     * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
     * * `PROVIDER_PLACEMENT_OPPORTUNITY`
     * * `SPLICE_INSERT`
     */
    public fun adTriggers(vararg adTriggers: String) {
        _adTriggers.addAll(listOf(*adTriggers))
    }

    /**
     * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage treats
     *   as ad markers in the output manifest. Valid values:
     * * `BREAK`
     * * `DISTRIBUTOR_ADVERTISEMENT`
     * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY`
     * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY`
     * * `PROVIDER_ADVERTISEMENT`
     * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY`
     * * `PROVIDER_PLACEMENT_OPPORTUNITY`
     * * `SPLICE_INSERT`
     */
    public fun adTriggers(adTriggers: Collection<String>) {
        _adTriggers.addAll(adTriggers)
    }

    /**
     * @param adsOnDeliveryRestrictions The flags on SCTE-35 segmentation descriptors that have to
     *   be present for AWS Elemental MediaPackage to insert ad markers in the output manifest. For
     *   information about SCTE-35 in AWS Elemental MediaPackage , see
     *   [SCTE-35 Message Options in AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/scte.html)
     *   .
     */
    public fun adsOnDeliveryRestrictions(adsOnDeliveryRestrictions: String) {
        cdkBuilder.adsOnDeliveryRestrictions(adsOnDeliveryRestrictions)
    }

    /**
     * @param id The manifest ID is required and must be unique within the OriginEndpoint. The ID
     *   can't be changed after the endpoint is created.
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param includeIframeOnlyStream Applies to stream sets with a single video track only. When
     *   true, the stream set includes an additional I-frame only stream, along with the other
     *   tracks. If false, this extra stream is not included.
     */
    public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
    }

    /**
     * @param includeIframeOnlyStream Applies to stream sets with a single video track only. When
     *   true, the stream set includes an additional I-frame only stream, along with the other
     *   tracks. If false, this extra stream is not included.
     */
    public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
    }

    /**
     * @param manifestName A short string that's appended to the end of the endpoint URL to create a
     *   unique path to this endpoint. The manifestName on the HLSManifest object overrides the
     *   manifestName that you provided on the originEndpoint object.
     */
    public fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
    }

    /**
     * @param playlistType When specified as either `event` or `vod` , a corresponding
     *   `EXT-X-PLAYLIST-TYPE` entry is included in the media playlist. Indicates if the playlist is
     *   live-to-VOD content.
     */
    public fun playlistType(playlistType: String) {
        cdkBuilder.playlistType(playlistType)
    }

    /** @param playlistWindowSeconds Time window (in seconds) contained in each parent manifest. */
    public fun playlistWindowSeconds(playlistWindowSeconds: Number) {
        cdkBuilder.playlistWindowSeconds(playlistWindowSeconds)
    }

    /**
     * @param programDateTimeIntervalSeconds Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output
     *   manifest at the interval that you specify. Additionally, ID3Timed metadata messages are
     *   generated every 5 seconds starting when the content was ingested.
     *
     * Irrespective of this parameter, if any ID3Timed metadata is in the HLS input, it is passed
     * through to the HLS output.
     *
     * Omit this attribute or enter `0` to indicate that the `EXT-X-PROGRAM-DATE-TIME` tags are not
     * included in the manifest.
     */
    public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
    }

    /** @param url The URL that's used to request this manifest from this endpoint. */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnOriginEndpoint.HlsManifestProperty {
        if (_adTriggers.isNotEmpty()) cdkBuilder.adTriggers(_adTriggers)
        return cdkBuilder.build()
    }
}
