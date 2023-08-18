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
 * Parameters for a packaging configuration that uses Common Media Application Format (CMAF)
 * packaging.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * CmafPackageProperty cmafPackageProperty = CmafPackageProperty.builder()
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
 * .encryption(CmafEncryptionProperty.builder()
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
 * .build())
 * .includeEncoderConfigurationInSegments(false)
 * .segmentDurationSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-cmafpackage.html)
 */
@CdkDslMarker
public class CfnPackagingConfigurationCmafPackagePropertyDsl {
    private val cdkBuilder: CfnPackagingConfiguration.CmafPackageProperty.Builder =
        CfnPackagingConfiguration.CmafPackageProperty.builder()

    private val _hlsManifests: MutableList<Any> = mutableListOf()

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: CfnPackagingConfiguration.CmafEncryptionProperty) {
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
     * @param includeEncoderConfigurationInSegments When includeEncoderConfigurationInSegments is
     *   set to true, AWS Elemental MediaPackage places your encoder's Sequence Parameter Set (SPS),
     *   Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment
     *   instead of in the init fragment. This lets you use different SPS/PPS/VPS settings for your
     *   assets during content playback.
     */
    public fun includeEncoderConfigurationInSegments(
        includeEncoderConfigurationInSegments: Boolean
    ) {
        cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments)
    }

    /**
     * @param includeEncoderConfigurationInSegments When includeEncoderConfigurationInSegments is
     *   set to true, AWS Elemental MediaPackage places your encoder's Sequence Parameter Set (SPS),
     *   Picture Parameter Set (PPS), and Video Parameter Set (VPS) metadata in every video segment
     *   instead of in the init fragment. This lets you use different SPS/PPS/VPS settings for your
     *   assets during content playback.
     */
    public fun includeEncoderConfigurationInSegments(
        includeEncoderConfigurationInSegments: IResolvable
    ) {
        cdkBuilder.includeEncoderConfigurationInSegments(includeEncoderConfigurationInSegments)
    }

    /**
     * @param segmentDurationSeconds Duration (in seconds) of each segment. Actual segments are
     *   rounded to the nearest multiple of the source fragment duration.
     */
    public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
    }

    public fun build(): CfnPackagingConfiguration.CmafPackageProperty {
        if (_hlsManifests.isNotEmpty()) cdkBuilder.hlsManifests(_hlsManifests)
        return cdkBuilder.build()
    }
}
