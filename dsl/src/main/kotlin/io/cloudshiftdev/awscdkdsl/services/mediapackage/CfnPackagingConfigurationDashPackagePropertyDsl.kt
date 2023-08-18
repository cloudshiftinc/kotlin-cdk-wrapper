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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnPackagingConfiguration

/**
 * Parameters for a packaging configuration that uses Dynamic Adaptive Streaming over HTTP (DASH)
 * packaging.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * DashPackageProperty dashPackageProperty = DashPackageProperty.builder()
 * .dashManifests(List.of(DashManifestProperty.builder()
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
 * .build()))
 * // the properties below are optional
 * .encryption(DashEncryptionProperty.builder()
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
 * .includeIframeOnlyStream(false)
 * .periodTriggers(List.of("periodTriggers"))
 * .segmentDurationSeconds(123)
 * .segmentTemplateFormat("segmentTemplateFormat")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-packagingconfiguration-dashpackage.html)
 */
@CdkDslMarker
public class CfnPackagingConfigurationDashPackagePropertyDsl {
    private val cdkBuilder: CfnPackagingConfiguration.DashPackageProperty.Builder =
        CfnPackagingConfiguration.DashPackageProperty.builder()

    private val _dashManifests: MutableList<Any> = mutableListOf()

    private val _periodTriggers: MutableList<String> = mutableListOf()

    /**
     * @param dashManifests A list of DASH manifest configurations that are available from this
     *   endpoint.
     */
    public fun dashManifests(vararg dashManifests: Any) {
        _dashManifests.addAll(listOf(*dashManifests))
    }

    /**
     * @param dashManifests A list of DASH manifest configurations that are available from this
     *   endpoint.
     */
    public fun dashManifests(dashManifests: Collection<Any>) {
        _dashManifests.addAll(dashManifests)
    }

    /**
     * @param dashManifests A list of DASH manifest configurations that are available from this
     *   endpoint.
     */
    public fun dashManifests(dashManifests: IResolvable) {
        cdkBuilder.dashManifests(dashManifests)
    }

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: CfnPackagingConfiguration.DashEncryptionProperty) {
        cdkBuilder.encryption(encryption)
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
     * @param includeIframeOnlyStream This applies only to stream sets with a single video track.
     *   When true, the stream set includes an additional I-frame trick-play only stream, along with
     *   the other tracks. If false, this extra stream is not included.
     */
    public fun includeIframeOnlyStream(includeIframeOnlyStream: Boolean) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
    }

    /**
     * @param includeIframeOnlyStream This applies only to stream sets with a single video track.
     *   When true, the stream set includes an additional I-frame trick-play only stream, along with
     *   the other tracks. If false, this extra stream is not included.
     */
    public fun includeIframeOnlyStream(includeIframeOnlyStream: IResolvable) {
        cdkBuilder.includeIframeOnlyStream(includeIframeOnlyStream)
    }

    /**
     * @param periodTriggers Controls whether AWS Elemental MediaPackage produces single-period or
     *   multi-period DASH manifests. For more information about periods, see
     *   [Multi-period DASH in AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html)
     *   .
     *
     * Valid values:
     * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
     *   created based on the SCTE-35 ad markers present in the input manifest.
     * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This is
     *   the default setting.
     */
    public fun periodTriggers(vararg periodTriggers: String) {
        _periodTriggers.addAll(listOf(*periodTriggers))
    }

    /**
     * @param periodTriggers Controls whether AWS Elemental MediaPackage produces single-period or
     *   multi-period DASH manifests. For more information about periods, see
     *   [Multi-period DASH in AWS Elemental MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/ug/multi-period.html)
     *   .
     *
     * Valid values:
     * * `ADS` - AWS Elemental MediaPackage will produce multi-period DASH manifests. Periods are
     *   created based on the SCTE-35 ad markers present in the input manifest.
     * * *No value* - AWS Elemental MediaPackage will produce single-period DASH manifests. This is
     *   the default setting.
     */
    public fun periodTriggers(periodTriggers: Collection<String>) {
        _periodTriggers.addAll(periodTriggers)
    }

    /**
     * @param segmentDurationSeconds Duration (in seconds) of each fragment. Actual fragments are
     *   rounded to the nearest multiple of the source segment duration.
     */
    public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
    }

    /**
     * @param segmentTemplateFormat Determines the type of SegmentTemplate included in the Media
     *   Presentation Description (MPD). When set to `NUMBER_WITH_TIMELINE` , a full timeline is
     *   presented in each SegmentTemplate, with $Number$ media URLs. When set to
     *   `TIME_WITH_TIMELINE` , a full timeline is presented in each SegmentTemplate, with $Time$
     *   media URLs. When set to `NUMBER_WITH_DURATION` , only a duration is included in each
     *   SegmentTemplate, with $Number$ media URLs.
     */
    public fun segmentTemplateFormat(segmentTemplateFormat: String) {
        cdkBuilder.segmentTemplateFormat(segmentTemplateFormat)
    }

    public fun build(): CfnPackagingConfiguration.DashPackageProperty {
        if (_dashManifests.isNotEmpty()) cdkBuilder.dashManifests(_dashManifests)
        if (_periodTriggers.isNotEmpty()) cdkBuilder.periodTriggers(_periodTriggers)
        return cdkBuilder.build()
    }
}
