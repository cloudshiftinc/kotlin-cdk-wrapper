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
import kotlin.Boolean
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

/**
 * Parameters for a packaging configuration that uses HTTP Live Streaming (HLS) packaging.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * HlsPackageProperty hlsPackageProperty = HlsPackageProperty.builder()
 * .hlsManifests(List.of(HlsManifestProperty.builder()
 * .adMarkers("adMarkers")
 * .includeIframeOnlyStream(false)
 * .manifestName("manifestName")
 * .programDateTimeIntervalSeconds(123)
 * .repeatExtXKey(false)
 * .streamSelection(StreamSelectionProperty.builder()
 * .maxVideoBitsPerSecond(123)
 * .minVideoBitsPerSecond(123)
 * .streamOrder("streamOrder")
 * .build())
 * .build()))
 * // the properties below are optional
 * .encryption(HlsEncryptionProperty.builder()
 * .spekeKeyProvider(SpekeKeyProviderProperty.builder()
 * .roleArn("roleArn")
 * .systemIds(List.of("systemIds"))
 * .url("url")
 * // the properties below are optional
 * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
 * .presetSpeke20Audio("presetSpeke20Audio")
 * .presetSpeke20Video("presetSpeke20Video")
 * .build())
 * .build())
 * // the properties below are optional
 * .constantInitializationVector("constantInitializationVector")
 * .encryptionMethod("encryptionMethod")
 * .build())
 * .includeDvbSubtitles(false)
 * .segmentDurationSeconds(123)
 * .useAudioRenditionGroup(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-hlspackage.html)
 */
@CdkDslMarker
public class CfnPackagingConfigurationHlsPackagePropertyDsl {
    private val cdkBuilder: CfnPackagingConfiguration.HlsPackageProperty.Builder =
        CfnPackagingConfiguration.HlsPackageProperty.builder()

    private val _hlsManifests: MutableList<Any> = mutableListOf()

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: CfnPackagingConfiguration.HlsEncryptionProperty) {
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
     * @param includeDvbSubtitles When enabled, MediaPackage passes through digital video
     *   broadcasting (DVB) subtitles into the output.
     */
    public fun includeDvbSubtitles(includeDvbSubtitles: Boolean) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles)
    }

    /**
     * @param includeDvbSubtitles When enabled, MediaPackage passes through digital video
     *   broadcasting (DVB) subtitles into the output.
     */
    public fun includeDvbSubtitles(includeDvbSubtitles: IResolvable) {
        cdkBuilder.includeDvbSubtitles(includeDvbSubtitles)
    }

    /**
     * @param segmentDurationSeconds Duration (in seconds) of each fragment. Actual fragments are
     *   rounded to the nearest multiple of the source fragment duration.
     */
    public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
    }

    /**
     * @param useAudioRenditionGroup When true, AWS Elemental MediaPackage bundles all audio tracks
     *   in a rendition group. All other tracks in the stream can be used with any audio rendition
     *   from the group.
     */
    public fun useAudioRenditionGroup(useAudioRenditionGroup: Boolean) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup)
    }

    /**
     * @param useAudioRenditionGroup When true, AWS Elemental MediaPackage bundles all audio tracks
     *   in a rendition group. All other tracks in the stream can be used with any audio rendition
     *   from the group.
     */
    public fun useAudioRenditionGroup(useAudioRenditionGroup: IResolvable) {
        cdkBuilder.useAudioRenditionGroup(useAudioRenditionGroup)
    }

    public fun build(): CfnPackagingConfiguration.HlsPackageProperty {
        if (_hlsManifests.isNotEmpty()) cdkBuilder.hlsManifests(_hlsManifests)
        return cdkBuilder.build()
    }
}
