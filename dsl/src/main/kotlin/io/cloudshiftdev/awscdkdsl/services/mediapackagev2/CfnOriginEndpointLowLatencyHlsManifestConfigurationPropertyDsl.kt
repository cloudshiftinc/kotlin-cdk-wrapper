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

package io.cloudshiftdev.awscdkdsl.services.mediapackagev2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint

/**
 * Specify a low-latency HTTP live streaming (LL-HLS) manifest configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * LowLatencyHlsManifestConfigurationProperty lowLatencyHlsManifestConfigurationProperty =
 * LowLatencyHlsManifestConfigurationProperty.builder()
 * .manifestName("manifestName")
 * // the properties below are optional
 * .childManifestName("childManifestName")
 * .filterConfiguration(FilterConfigurationProperty.builder()
 * .end("end")
 * .manifestFilter("manifestFilter")
 * .start("start")
 * .timeDelaySeconds(123)
 * .build())
 * .manifestWindowSeconds(123)
 * .programDateTimeIntervalSeconds(123)
 * .scteHls(ScteHlsProperty.builder()
 * .adMarkerHls("adMarkerHls")
 * .build())
 * .url("url")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html)
 */
@CdkDslMarker
public class CfnOriginEndpointLowLatencyHlsManifestConfigurationPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty.Builder =
        CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty.builder()

    /**
     * @param childManifestName The name of the child manifest associated with the low-latency HLS
     *   (LL-HLS) manifest configuration of the origin endpoint.
     */
    public fun childManifestName(childManifestName: String) {
        cdkBuilder.childManifestName(childManifestName)
    }

    /**
     * @param filterConfiguration Filter configuration includes settings for manifest filtering,
     *   start and end times, and time delay that apply to all of your egress requests for this
     *   manifest. </p>
     */
    public fun filterConfiguration(filterConfiguration: IResolvable) {
        cdkBuilder.filterConfiguration(filterConfiguration)
    }

    /**
     * @param filterConfiguration Filter configuration includes settings for manifest filtering,
     *   start and end times, and time delay that apply to all of your egress requests for this
     *   manifest. </p>
     */
    public fun filterConfiguration(
        filterConfiguration: CfnOriginEndpoint.FilterConfigurationProperty
    ) {
        cdkBuilder.filterConfiguration(filterConfiguration)
    }

    /**
     * @param manifestName A short short string that's appended to the endpoint URL. The manifest
     *   name creates a unique path to this endpoint. If you don't enter a value, MediaPackage uses
     *   the default manifest name, `index` . MediaPackage automatically inserts the format
     *   extension, such as `.m3u8` . You can't use the same manifest name if you use HLS manifest
     *   and low-latency HLS manifest. The `manifestName` on the `HLSManifest` object overrides the
     *   `manifestName` you provided on the `originEndpoint` object.
     */
    public fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
    }

    /** @param manifestWindowSeconds The total duration (in seconds) of the manifest's content. */
    public fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
    }

    /**
     * @param programDateTimeIntervalSeconds Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output
     *   manifest at the interval that you specify. If you don't enter an interval,
     *   `EXT-X-PROGRAM-DATE-TIME` tags aren't included in the manifest. The tags sync the stream to
     *   the wall clock so that viewers can seek to a specific time in the playback timeline on the
     *   player. `ID3Timed` metadata messages generate every 5 seconds whenever MediaPackage ingests
     *   the content.
     *
     * Irrespective of this parameter, if any `ID3Timed` metadata is in the HLS input, MediaPackage
     * passes through that metadata to the HLS output.
     */
    public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
    }

    /**
     * @param scteHls The SCTE-35 HLS configuration associated with the low-latency HLS (LL-HLS)
     *   manifest configuration of the origin endpoint.
     */
    public fun scteHls(scteHls: IResolvable) {
        cdkBuilder.scteHls(scteHls)
    }

    /**
     * @param scteHls The SCTE-35 HLS configuration associated with the low-latency HLS (LL-HLS)
     *   manifest configuration of the origin endpoint.
     */
    public fun scteHls(scteHls: CfnOriginEndpoint.ScteHlsProperty) {
        cdkBuilder.scteHls(scteHls)
    }

    /**
     * @param url The URL of the low-latency HLS (LL-HLS) manifest configuration of the origin
     *   endpoint.
     */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty =
        cdkBuilder.build()
}
