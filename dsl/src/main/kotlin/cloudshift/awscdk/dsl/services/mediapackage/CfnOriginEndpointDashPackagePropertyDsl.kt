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
 * Parameters for DASH packaging.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediapackage.*;
 * DashPackageProperty dashPackageProperty = DashPackageProperty.builder()
 * .adsOnDeliveryRestrictions("adsOnDeliveryRestrictions")
 * .adTriggers(List.of("adTriggers"))
 * .encryption(DashEncryptionProperty.builder()
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
 * .keyRotationIntervalSeconds(123)
 * .build())
 * .includeIframeOnlyStream(false)
 * .manifestLayout("manifestLayout")
 * .manifestWindowSeconds(123)
 * .minBufferTimeSeconds(123)
 * .minUpdatePeriodSeconds(123)
 * .periodTriggers(List.of("periodTriggers"))
 * .profile("profile")
 * .segmentDurationSeconds(123)
 * .segmentTemplateFormat("segmentTemplateFormat")
 * .streamSelection(StreamSelectionProperty.builder()
 * .maxVideoBitsPerSecond(123)
 * .minVideoBitsPerSecond(123)
 * .streamOrder("streamOrder")
 * .build())
 * .suggestedPresentationDelaySeconds(123)
 * .utcTiming("utcTiming")
 * .utcTimingUri("utcTimingUri")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-originendpoint-dashpackage.html)
 */
@CdkDslMarker
public class CfnOriginEndpointDashPackagePropertyDsl {
    private val cdkBuilder: CfnOriginEndpoint.DashPackageProperty.Builder =
        CfnOriginEndpoint.DashPackageProperty.builder()

    private val _adTriggers: MutableList<String> = mutableListOf()

    private val _periodTriggers: MutableList<String> = mutableListOf()

    /**
     * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage treats
     *   as ad markers in the output manifest. Valid values:
     * * `BREAK`
     * * `DISTRIBUTOR_ADVERTISEMENT`
     * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY` .
     * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY` .
     * * `PROVIDER_ADVERTISEMENT` .
     * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY` .
     * * `PROVIDER_PLACEMENT_OPPORTUNITY` .
     * * `SPLICE_INSERT` .
     */
    public fun adTriggers(vararg adTriggers: String) {
        _adTriggers.addAll(listOf(*adTriggers))
    }

    /**
     * @param adTriggers Specifies the SCTE-35 message types that AWS Elemental MediaPackage treats
     *   as ad markers in the output manifest. Valid values:
     * * `BREAK`
     * * `DISTRIBUTOR_ADVERTISEMENT`
     * * `DISTRIBUTOR_OVERLAY_PLACEMENT_OPPORTUNITY` .
     * * `DISTRIBUTOR_PLACEMENT_OPPORTUNITY` .
     * * `PROVIDER_ADVERTISEMENT` .
     * * `PROVIDER_OVERLAY_PLACEMENT_OPPORTUNITY` .
     * * `PROVIDER_PLACEMENT_OPPORTUNITY` .
     * * `SPLICE_INSERT` .
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

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption)
    }

    /** @param encryption Parameters for encrypting content. */
    public fun encryption(encryption: CfnOriginEndpoint.DashEncryptionProperty) {
        cdkBuilder.encryption(encryption)
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
     * @param manifestLayout Determines the position of some tags in the manifest. Valid values:
     * * `FULL` - Elements like `SegmentTemplate` and `ContentProtection` are included in each
     *   `Representation` .
     * * `COMPACT` - Duplicate elements are combined and presented at the `AdaptationSet` level.
     */
    public fun manifestLayout(manifestLayout: String) {
        cdkBuilder.manifestLayout(manifestLayout)
    }

    /** @param manifestWindowSeconds Time window (in seconds) contained in each manifest. */
    public fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
    }

    /**
     * @param minBufferTimeSeconds Minimum amount of content (measured in seconds) that a player
     *   must keep available in the buffer.
     */
    public fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
        cdkBuilder.minBufferTimeSeconds(minBufferTimeSeconds)
    }

    /**
     * @param minUpdatePeriodSeconds Minimum amount of time (in seconds) that the player should wait
     *   before requesting updates to the manifest.
     */
    public fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number) {
        cdkBuilder.minUpdatePeriodSeconds(minUpdatePeriodSeconds)
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
     * @param profile The DASH profile for the output. Valid values:
     * * `NONE` - The output doesn't use a DASH profile.
     * * `HBBTV_1_5` - The output is compliant with HbbTV v1.5.
     * * `DVB_DASH_2014` - The output is compliant with DVB-DASH 2014.
     */
    public fun profile(profile: String) {
        cdkBuilder.profile(profile)
    }

    /**
     * @param segmentDurationSeconds Duration (in seconds) of each fragment. Actual fragments are
     *   rounded to the nearest multiple of the source fragment duration.
     */
    public fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
    }

    /**
     * @param segmentTemplateFormat Determines the type of variable used in the `media` URL of the
     *   `SegmentTemplate` tag in the manifest. Also specifies if segment timeline information is
     *   included in `SegmentTimeline` or `SegmentTemplate` .
     *
     * Valid values:
     * * `NUMBER_WITH_TIMELINE` - The `$Number$` variable is used in the `media` URL. The value of
     *   this variable is the sequential number of the segment. A full `SegmentTimeline` object is
     *   presented in each `SegmentTemplate` .
     * * `NUMBER_WITH_DURATION` - The `$Number$` variable is used in the `media` URL and a
     *   `duration` attribute is added to the segment template. The `SegmentTimeline` object is
     *   removed from the representation.
     * * `TIME_WITH_TIMELINE` - The `$Time$` variable is used in the `media` URL. The value of this
     *   variable is the timestamp of when the segment starts. A full `SegmentTimeline` object is
     *   presented in each `SegmentTemplate` .
     */
    public fun segmentTemplateFormat(segmentTemplateFormat: String) {
        cdkBuilder.segmentTemplateFormat(segmentTemplateFormat)
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

    /**
     * @param suggestedPresentationDelaySeconds Amount of time (in seconds) that the player should
     *   be from the live point at the end of the manifest.
     */
    public fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number) {
        cdkBuilder.suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds)
    }

    /**
     * @param utcTiming Determines the type of UTC timing included in the DASH Media Presentation
     *   Description (MPD).
     */
    public fun utcTiming(utcTiming: String) {
        cdkBuilder.utcTiming(utcTiming)
    }

    /**
     * @param utcTimingUri Specifies the value attribute of the UTC timing field when utcTiming is
     *   set to HTTP-ISO or HTTP-HEAD.
     */
    public fun utcTimingUri(utcTimingUri: String) {
        cdkBuilder.utcTimingUri(utcTimingUri)
    }

    public fun build(): CfnOriginEndpoint.DashPackageProperty {
        if (_adTriggers.isNotEmpty()) cdkBuilder.adTriggers(_adTriggers)
        if (_periodTriggers.isNotEmpty()) cdkBuilder.periodTriggers(_periodTriggers)
        return cdkBuilder.build()
    }
}
