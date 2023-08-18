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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps

/**
 * Properties for defining a `CfnPlaybackConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * Object configurationAliases;
 * CfnPlaybackConfigurationProps cfnPlaybackConfigurationProps =
 * CfnPlaybackConfigurationProps.builder()
 * .adDecisionServerUrl("adDecisionServerUrl")
 * .name("name")
 * .videoContentSourceUrl("videoContentSourceUrl")
 * // the properties below are optional
 * .availSuppression(AvailSuppressionProperty.builder()
 * .mode("mode")
 * .value("value")
 * .build())
 * .bumper(BumperProperty.builder()
 * .endUrl("endUrl")
 * .startUrl("startUrl")
 * .build())
 * .cdnConfiguration(CdnConfigurationProperty.builder()
 * .adSegmentUrlPrefix("adSegmentUrlPrefix")
 * .contentSegmentUrlPrefix("contentSegmentUrlPrefix")
 * .build())
 * .configurationAliases(Map.of(
 * "configurationAliasesKey", configurationAliases))
 * .dashConfiguration(DashConfigurationProperty.builder()
 * .manifestEndpointPrefix("manifestEndpointPrefix")
 * .mpdLocation("mpdLocation")
 * .originManifestType("originManifestType")
 * .build())
 * .hlsConfiguration(HlsConfigurationProperty.builder()
 * .manifestEndpointPrefix("manifestEndpointPrefix")
 * .build())
 * .livePreRollConfiguration(LivePreRollConfigurationProperty.builder()
 * .adDecisionServerUrl("adDecisionServerUrl")
 * .maxDurationSeconds(123)
 * .build())
 * .manifestProcessingRules(ManifestProcessingRulesProperty.builder()
 * .adMarkerPassthrough(AdMarkerPassthroughProperty.builder()
 * .enabled(false)
 * .build())
 * .build())
 * .personalizationThresholdSeconds(123)
 * .slateAdUrl("slateAdUrl")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .transcodeProfileName("transcodeProfileName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html)
 */
@CdkDslMarker
public class CfnPlaybackConfigurationPropsDsl {
    private val cdkBuilder: CfnPlaybackConfigurationProps.Builder =
        CfnPlaybackConfigurationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param adDecisionServerUrl The URL for the ad decision server (ADS). This includes the
     *   specification of static parameters and placeholders for dynamic parameters. AWS Elemental
     *   MediaTailor substitutes player-specific and session-specific parameters as needed when
     *   calling the ADS. Alternately, for testing you can provide a static VAST URL. The maximum
     *   length is 25,000 characters.
     */
    public fun adDecisionServerUrl(adDecisionServerUrl: String) {
        cdkBuilder.adDecisionServerUrl(adDecisionServerUrl)
    }

    /**
     * @param availSuppression The configuration for avail suppression, also known as ad
     *   suppression. For more information about ad suppression, see Ad Suppression
     *   (https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html).
     */
    public fun availSuppression(availSuppression: IResolvable) {
        cdkBuilder.availSuppression(availSuppression)
    }

    /**
     * @param availSuppression The configuration for avail suppression, also known as ad
     *   suppression. For more information about ad suppression, see Ad Suppression
     *   (https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html).
     */
    public fun availSuppression(
        availSuppression: CfnPlaybackConfiguration.AvailSuppressionProperty
    ) {
        cdkBuilder.availSuppression(availSuppression)
    }

    /**
     * @param bumper The configuration for bumpers. Bumpers are short audio or video clips that play
     *   at the start or before the end of an ad break. To learn more about bumpers, see Bumpers
     *   (https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html).
     */
    public fun bumper(bumper: IResolvable) {
        cdkBuilder.bumper(bumper)
    }

    /**
     * @param bumper The configuration for bumpers. Bumpers are short audio or video clips that play
     *   at the start or before the end of an ad break. To learn more about bumpers, see Bumpers
     *   (https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html).
     */
    public fun bumper(bumper: CfnPlaybackConfiguration.BumperProperty) {
        cdkBuilder.bumper(bumper)
    }

    /**
     * @param cdnConfiguration The configuration for using a content delivery network (CDN), like
     *   Amazon CloudFront, for content and ad segment management.
     */
    public fun cdnConfiguration(cdnConfiguration: IResolvable) {
        cdkBuilder.cdnConfiguration(cdnConfiguration)
    }

    /**
     * @param cdnConfiguration The configuration for using a content delivery network (CDN), like
     *   Amazon CloudFront, for content and ad segment management.
     */
    public fun cdnConfiguration(
        cdnConfiguration: CfnPlaybackConfiguration.CdnConfigurationProperty
    ) {
        cdkBuilder.cdnConfiguration(cdnConfiguration)
    }

    /**
     * @param configurationAliases The player parameters and aliases used as dynamic variables
     *   during session initialization. For more information, see
     *   [Domain Variables](https://docs.aws.amazon.com/mediatailor/latest/ug/variables-domain.html)
     *   .
     */
    public fun configurationAliases(configurationAliases: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(configurationAliases)
        cdkBuilder.configurationAliases(builder.map)
    }

    /**
     * @param configurationAliases The player parameters and aliases used as dynamic variables
     *   during session initialization. For more information, see
     *   [Domain Variables](https://docs.aws.amazon.com/mediatailor/latest/ug/variables-domain.html)
     *   .
     */
    public fun configurationAliases(configurationAliases: Map<String, Any>) {
        cdkBuilder.configurationAliases(configurationAliases)
    }

    /**
     * @param configurationAliases The player parameters and aliases used as dynamic variables
     *   during session initialization. For more information, see
     *   [Domain Variables](https://docs.aws.amazon.com/mediatailor/latest/ug/variables-domain.html)
     *   .
     */
    public fun configurationAliases(configurationAliases: IResolvable) {
        cdkBuilder.configurationAliases(configurationAliases)
    }

    /** @param dashConfiguration The configuration for DASH PUT operations. */
    public fun dashConfiguration(dashConfiguration: IResolvable) {
        cdkBuilder.dashConfiguration(dashConfiguration)
    }

    /** @param dashConfiguration The configuration for DASH PUT operations. */
    public fun dashConfiguration(
        dashConfiguration: CfnPlaybackConfiguration.DashConfigurationProperty
    ) {
        cdkBuilder.dashConfiguration(dashConfiguration)
    }

    /** @param hlsConfiguration The configuration for HLS content. */
    public fun hlsConfiguration(hlsConfiguration: IResolvable) {
        cdkBuilder.hlsConfiguration(hlsConfiguration)
    }

    /** @param hlsConfiguration The configuration for HLS content. */
    public fun hlsConfiguration(
        hlsConfiguration: CfnPlaybackConfiguration.HlsConfigurationProperty
    ) {
        cdkBuilder.hlsConfiguration(hlsConfiguration)
    }

    /** @param livePreRollConfiguration The configuration for pre-roll ad insertion. */
    public fun livePreRollConfiguration(livePreRollConfiguration: IResolvable) {
        cdkBuilder.livePreRollConfiguration(livePreRollConfiguration)
    }

    /** @param livePreRollConfiguration The configuration for pre-roll ad insertion. */
    public fun livePreRollConfiguration(
        livePreRollConfiguration: CfnPlaybackConfiguration.LivePreRollConfigurationProperty
    ) {
        cdkBuilder.livePreRollConfiguration(livePreRollConfiguration)
    }

    /**
     * @param manifestProcessingRules The configuration for manifest processing rules. Manifest
     *   processing rules enable customization of the personalized manifests created by MediaTailor.
     */
    public fun manifestProcessingRules(manifestProcessingRules: IResolvable) {
        cdkBuilder.manifestProcessingRules(manifestProcessingRules)
    }

    /**
     * @param manifestProcessingRules The configuration for manifest processing rules. Manifest
     *   processing rules enable customization of the personalized manifests created by MediaTailor.
     */
    public fun manifestProcessingRules(
        manifestProcessingRules: CfnPlaybackConfiguration.ManifestProcessingRulesProperty
    ) {
        cdkBuilder.manifestProcessingRules(manifestProcessingRules)
    }

    /** @param name The identifier for the playback configuration. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param personalizationThresholdSeconds Defines the maximum duration of underfilled ad time
     *   (in seconds) allowed in an ad break. If the duration of underfilled ad time exceeds the
     *   personalization threshold, then the personalization of the ad break is abandoned and the
     *   underlying content is shown. This feature applies to ad replacement in live and VOD
     *   streams, rather than ad insertion, because it relies on an underlying content stream. For
     *   more information about ad break behavior, including ad replacement and insertion, see Ad
     *   Behavior in AWS Elemental MediaTailor
     *   (https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html).
     */
    public fun personalizationThresholdSeconds(personalizationThresholdSeconds: Number) {
        cdkBuilder.personalizationThresholdSeconds(personalizationThresholdSeconds)
    }

    /**
     * @param slateAdUrl The URL for a high-quality video asset to transcode and use to fill in time
     *   that's not used by ads. AWS Elemental MediaTailor shows the slate to fill in gaps in media
     *   content. Configuring the slate is optional for non-VPAID configurations. For VPAID, the
     *   slate is required because MediaTailor provides it in the slots that are designated for
     *   dynamic ad content. The slate must be a high-quality asset that contains both audio and
     *   video.
     */
    public fun slateAdUrl(slateAdUrl: String) {
        cdkBuilder.slateAdUrl(slateAdUrl)
    }

    /** @param tags The tags to assign to the playback configuration. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The tags to assign to the playback configuration. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param transcodeProfileName The name that is used to associate this playback configuration
     *   with a custom transcode profile. This overrides the dynamic transcoding defaults of
     *   MediaTailor. Use this only if you have already set up custom profiles with the help of AWS
     *   Support.
     */
    public fun transcodeProfileName(transcodeProfileName: String) {
        cdkBuilder.transcodeProfileName(transcodeProfileName)
    }

    /**
     * @param videoContentSourceUrl The URL prefix for the parent manifest for the stream, minus the
     *   asset ID. The maximum length is 512 characters.
     */
    public fun videoContentSourceUrl(videoContentSourceUrl: String) {
        cdkBuilder.videoContentSourceUrl(videoContentSourceUrl)
    }

    public fun build(): CfnPlaybackConfigurationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
