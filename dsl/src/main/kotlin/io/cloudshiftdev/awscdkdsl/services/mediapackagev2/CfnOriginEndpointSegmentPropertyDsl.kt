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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint

/**
 * The segment configuration, including the segment name, duration, and other configuration values.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackagev2.*;
 * SegmentProperty segmentProperty = SegmentProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html)
 */
@CdkDslMarker
public class CfnOriginEndpointSegmentPropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.SegmentProperty.Builder =
        CfnOriginEndpoint.SegmentProperty.builder()

    /** @param encryption Whether to use encryption for the segment. */
    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    /** @param encryption Whether to use encryption for the segment. */
    public fun encryption(encryption: CfnOriginEndpoint.EncryptionProperty) {
        cdkBuilder.encryption(encryption)
    }

    /** @param includeIframeOnlyStreams Whether the segment includes I-frame-only streams. */
    public fun includeIframeOnlyStreams(includeIframeOnlyStreams: Boolean) {
        cdkBuilder.includeIframeOnlyStreams(includeIframeOnlyStreams)
    }

    /** @param includeIframeOnlyStreams Whether the segment includes I-frame-only streams. */
    public fun includeIframeOnlyStreams(includeIframeOnlyStreams: IResolvable) {
        cdkBuilder.includeIframeOnlyStreams(includeIframeOnlyStreams)
    }

    /** @param scte The SCTE-35 configuration associated with the segment. */
    public fun scte(scte: IResolvable) {
        cdkBuilder.scte(scte)
    }

    /** @param scte The SCTE-35 configuration associated with the segment. */
    public fun scte(scte: CfnOriginEndpoint.ScteProperty) {
        cdkBuilder.scte(scte)
    }

    /** @param segmentDurationSeconds The duration of the segment, in seconds. */
    public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
    }

    /** @param segmentName The name of the segment associated with the origin endpoint. */
    public fun segmentName(segmentName: String) {
        cdkBuilder.segmentName(segmentName)
    }

    /** @param tsIncludeDvbSubtitles Whether the segment includes DVB subtitles. */
    public fun tsIncludeDvbSubtitles(tsIncludeDvbSubtitles: Boolean) {
        cdkBuilder.tsIncludeDvbSubtitles(tsIncludeDvbSubtitles)
    }

    /** @param tsIncludeDvbSubtitles Whether the segment includes DVB subtitles. */
    public fun tsIncludeDvbSubtitles(tsIncludeDvbSubtitles: IResolvable) {
        cdkBuilder.tsIncludeDvbSubtitles(tsIncludeDvbSubtitles)
    }

    /** @param tsUseAudioRenditionGroup Whether the segment is an audio rendition group. */
    public fun tsUseAudioRenditionGroup(tsUseAudioRenditionGroup: Boolean) {
        cdkBuilder.tsUseAudioRenditionGroup(tsUseAudioRenditionGroup)
    }

    /** @param tsUseAudioRenditionGroup Whether the segment is an audio rendition group. */
    public fun tsUseAudioRenditionGroup(tsUseAudioRenditionGroup: IResolvable) {
        cdkBuilder.tsUseAudioRenditionGroup(tsUseAudioRenditionGroup)
    }

    public fun build(): CfnOriginEndpoint.SegmentProperty = cdkBuilder.build()
}
