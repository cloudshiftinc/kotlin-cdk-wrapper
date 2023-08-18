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
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnOriginEndpoint

/**
 * Parameters for Common Media Application Format (CMAF) packaging.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * CmafPackageProperty cmafPackageProperty = CmafPackageProperty.builder()
 * .encryption(CmafEncryptionProperty.builder()
 * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
 * .resourceId("resourceId")
 * .roleArn("roleArn")
 * .systemIds(List.of("systemIds"))
 * .url("url")
 * // the properties below are optional
 * .certificateArn("certificateArn")
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .build())
 * // the properties below are optional
 * .constantInitializationVector("constantInitializationVector")
 * .encryptionMethod("encryptionMethod")
 * .keyRotationIntervalSeconds(123)
 * .build())
 * .hlsManifests(List.of(HlsManifestProperty.builder()
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
 * .build()))
 * .segmentDurationSeconds(123)
 * .segmentPrefix("segmentPrefix")
 * .streamSelection(StreamSelectionProperty.builder()
 * .maxVideoBitsPerSecond(123)
 * .minVideoBitsPerSecond(123)
 * .streamOrder("streamOrder")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-cmafpackage.html)
 */
@CdkDslMarker
public class CfnOriginEndpointCmafPackagePropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.CmafPackageProperty.Builder =
        CfnOriginEndpoint.CmafPackageProperty.builder()

    private val _hlsManifests: MutableList<Any> = mutableListOf()

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: CfnOriginEndpoint.CmafEncryptionProperty) {
        cdkBuilder.encryption(encryption)
    }

    /**
     * @param hlsManifests A list of HLS manifest configurations that are available from this
     *   endpoint.
     */
    public fun hlsManifests(vararg hlsManifests: Any) {
        _hlsManifests.addAll(listOf(*hlsManifests))
    }

    /**
     * @param hlsManifests A list of HLS manifest configurations that are available from this
     *   endpoint.
     */
    public fun hlsManifests(hlsManifests: Collection<Any>) {
        _hlsManifests.addAll(hlsManifests)
    }

    /**
     * @param hlsManifests A list of HLS manifest configurations that are available from this
     *   endpoint.
     */
    public fun hlsManifests(hlsManifests: IResolvable) {
        cdkBuilder.hlsManifests(hlsManifests)
    }

    /**
     * @param segmentDurationSeconds Duration (in seconds) of each segment. Actual segments are
     *   rounded to the nearest multiple of the source segment duration.
     */
    public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
    }

    /**
     * @param segmentPrefix An optional custom string that is prepended to the name of each segment.
     *   If not specified, the segment prefix defaults to the ChannelId.
     */
    public fun segmentPrefix(segmentPrefix: String) {
        cdkBuilder.segmentPrefix(segmentPrefix)
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
    public fun streamSelection(streamSelection: CfnOriginEndpoint.StreamSelectionProperty) {
        cdkBuilder.streamSelection(streamSelection)
    }

    public fun build(): CfnOriginEndpoint.CmafPackageProperty {
        if (_hlsManifests.isNotEmpty()) cdkBuilder.hlsManifests(_hlsManifests)
        return cdkBuilder.build()
    }
}
