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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps

/**
 * Properties for defining a `CfnOriginEndpoint`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * CfnOriginEndpointProps cfnOriginEndpointProps = CfnOriginEndpointProps.builder()
 * .channelGroupName("channelGroupName")
 * .channelName("channelName")
 * .originEndpointName("originEndpointName")
 * // the properties below are optional
 * .containerType("containerType")
 * .description("description")
 * .hlsManifests(List.of(HlsManifestConfigurationProperty.builder()
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
 * .build()))
 * .lowLatencyHlsManifests(List.of(LowLatencyHlsManifestConfigurationProperty.builder()
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
 * .build()))
 * .segment(SegmentProperty.builder()
 * .encryption(EncryptionProperty.builder()
 * .encryptionMethod(EncryptionMethodProperty.builder()
 * .cmafEncryptionMethod("cmafEncryptionMethod")
 * .tsEncryptionMethod("tsEncryptionMethod")
 * .build())
 * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
 * .drmSystems(List.of("drmSystems"))
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .resourceId("resourceId")
 * .roleArn("roleArn")
 * .url("url")
 * .build())
 * // the properties below are optional
 * .constantInitializationVector("constantInitializationVector")
 * .keyRotationIntervalSeconds(123)
 * .build())
 * .includeIframeOnlyStreams(false)
 * .scte(ScteProperty.builder()
 * .scteFilter(List.of("scteFilter"))
 * .build())
 * .segmentDurationSeconds(123)
 * .segmentName("segmentName")
 * .tsIncludeDvbSubtitles(false)
 * .tsUseAudioRenditionGroup(false)
 * .build())
 * .startoverWindowSeconds(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html)
 */
@CdkDslMarker
public class CfnOriginEndpointPropsDsl {
    private val cdkBuilder: CfnOriginEndpointProps.Builder = CfnOriginEndpointProps.builder()

    private val _hlsManifests: MutableList<Any> = mutableListOf()

    private val _lowLatencyHlsManifests: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param channelGroupName The name of the channel group associated with the origin endpoint
     *   configuration.
     */
    public fun channelGroupName(channelGroupName: String) {
        cdkBuilder.channelGroupName(channelGroupName)
    }

    /** @param channelName The channel name associated with the origin endpoint. */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /**
     * @param containerType The container type associated with the origin endpoint configuration.
     */
    public fun containerType(containerType: String) {
        cdkBuilder.containerType(containerType)
    }

    /** @param description The description associated with the origin endpoint. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param hlsManifests The HLS manfiests associated with the origin endpoint configuration. */
    public fun hlsManifests(vararg hlsManifests: Any) {
        _hlsManifests.addAll(listOf(*hlsManifests))
    }

    /** @param hlsManifests The HLS manfiests associated with the origin endpoint configuration. */
    public fun hlsManifests(hlsManifests: Collection<Any>) {
        _hlsManifests.addAll(hlsManifests)
    }

    /** @param hlsManifests The HLS manfiests associated with the origin endpoint configuration. */
    public fun hlsManifests(hlsManifests: IResolvable) {
        cdkBuilder.hlsManifests(hlsManifests)
    }

    /**
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     *   origin endpoint.
     */
    public fun lowLatencyHlsManifests(vararg lowLatencyHlsManifests: Any) {
        _lowLatencyHlsManifests.addAll(listOf(*lowLatencyHlsManifests))
    }

    /**
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     *   origin endpoint.
     */
    public fun lowLatencyHlsManifests(lowLatencyHlsManifests: Collection<Any>) {
        _lowLatencyHlsManifests.addAll(lowLatencyHlsManifests)
    }

    /**
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     *   origin endpoint.
     */
    public fun lowLatencyHlsManifests(lowLatencyHlsManifests: IResolvable) {
        cdkBuilder.lowLatencyHlsManifests(lowLatencyHlsManifests)
    }

    /**
     * @param originEndpointName The name of the origin endpoint associated with the origin endpoint
     *   configuration.
     */
    public fun originEndpointName(originEndpointName: String) {
        cdkBuilder.originEndpointName(originEndpointName)
    }

    /** @param segment The segment associated with the origin endpoint. */
    public fun segment(segment: IResolvable) {
        cdkBuilder.segment(segment)
    }

    /** @param segment The segment associated with the origin endpoint. */
    public fun segment(segment: CfnOriginEndpoint.SegmentProperty) {
        cdkBuilder.segment(segment)
    }

    /**
     * @param startoverWindowSeconds The size of the window (in seconds) to specify a window of the
     *   live stream that's available for on-demand viewing. Viewers can start-over or catch-up on
     *   content that falls within the window.
     */
    public fun startoverWindowSeconds(startoverWindowSeconds: Number) {
        cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
    }

    /** @param tags The tags associated with the origin endpoint. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags associated with the origin endpoint. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnOriginEndpointProps {
        if (_hlsManifests.isNotEmpty()) cdkBuilder.hlsManifests(_hlsManifests)
        if (_lowLatencyHlsManifests.isNotEmpty())
            cdkBuilder.lowLatencyHlsManifests(_lowLatencyHlsManifests)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
