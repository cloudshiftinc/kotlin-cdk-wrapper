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
 * The HLS manfiest configuration associated with the origin endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * HlsManifestConfigurationProperty hlsManifestConfigurationProperty =
 * HlsManifestConfigurationProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html)
 */
@CdkDslMarker
public class CfnOriginEndpointHlsManifestConfigurationPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.HlsManifestConfigurationProperty.Builder =
        CfnOriginEndpoint.HlsManifestConfigurationProperty.builder()

    /**
     * @param childManifestName The name of the child manifest associated with the HLS manifest
     *   configuration.
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
     * @param manifestName The name of the manifest associated with the HLS manifest configuration.
     */
    public fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
    }

    /**
     * @param manifestWindowSeconds The duration of the manifest window, in seconds, for the HLS
     *   manifest configuration.
     */
    public fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
    }

    /**
     * @param programDateTimeIntervalSeconds The `EXT-X-PROGRAM-DATE-TIME` interval, in seconds,
     *   associated with the HLS manifest configuration.
     */
    public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
    }

    /**
     * @param scteHls THE SCTE-35 HLS configuration associated with the HLS manifest configuration.
     */
    public fun scteHls(scteHls: IResolvable) {
        cdkBuilder.scteHls(scteHls)
    }

    /**
     * @param scteHls THE SCTE-35 HLS configuration associated with the HLS manifest configuration.
     */
    public fun scteHls(scteHls: CfnOriginEndpoint.ScteHlsProperty) {
        cdkBuilder.scteHls(scteHls)
    }

    /** @param url The URL of the HLS manifest configuration. */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    public fun build(): CfnOriginEndpoint.HlsManifestConfigurationProperty = cdkBuilder.build()
}
