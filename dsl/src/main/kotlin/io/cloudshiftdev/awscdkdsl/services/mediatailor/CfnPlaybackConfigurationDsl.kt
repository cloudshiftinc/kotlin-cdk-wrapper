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
import software.constructs.Construct

/**
 * Adds a new playback configuration to AWS Elemental MediaTailor .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * Object configurationAliases;
 * CfnPlaybackConfiguration cfnPlaybackConfiguration = CfnPlaybackConfiguration.Builder.create(this,
 * "MyCfnPlaybackConfiguration")
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
public class CfnPlaybackConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnPlaybackConfiguration.Builder =
        CfnPlaybackConfiguration.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The URL for the ad decision server (ADS).
     *
     * This includes the specification of static parameters and placeholders for dynamic parameters.
     * AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as
     * needed when calling the ADS. Alternately, for testing you can provide a static VAST URL. The
     * maximum length is 25,000 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-addecisionserverurl)
     *
     * @param adDecisionServerUrl The URL for the ad decision server (ADS).
     */
    public fun adDecisionServerUrl(adDecisionServerUrl: String) {
        cdkBuilder.adDecisionServerUrl(adDecisionServerUrl)
    }

    /**
     * The configuration for avail suppression, also known as ad suppression.
     *
     * For more information about ad suppression, see
     * [Ad Suppression](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-availsuppression)
     *
     * @param availSuppression The configuration for avail suppression, also known as ad
     *   suppression.
     */
    public fun availSuppression(availSuppression: IResolvable) {
        cdkBuilder.availSuppression(availSuppression)
    }

    /**
     * The configuration for avail suppression, also known as ad suppression.
     *
     * For more information about ad suppression, see
     * [Ad Suppression](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-availsuppression)
     *
     * @param availSuppression The configuration for avail suppression, also known as ad
     *   suppression.
     */
    public fun availSuppression(
        availSuppression: CfnPlaybackConfiguration.AvailSuppressionProperty
    ) {
        cdkBuilder.availSuppression(availSuppression)
    }

    /**
     * The configuration for bumpers.
     *
     * Bumpers are short audio or video clips that play at the start or before the end of an ad
     * break. To learn more about bumpers, see
     * [Bumpers](https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-bumper)
     *
     * @param bumper The configuration for bumpers.
     */
    public fun bumper(bumper: IResolvable) {
        cdkBuilder.bumper(bumper)
    }

    /**
     * The configuration for bumpers.
     *
     * Bumpers are short audio or video clips that play at the start or before the end of an ad
     * break. To learn more about bumpers, see
     * [Bumpers](https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-bumper)
     *
     * @param bumper The configuration for bumpers.
     */
    public fun bumper(bumper: CfnPlaybackConfiguration.BumperProperty) {
        cdkBuilder.bumper(bumper)
    }

    /**
     * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for
     * content and ad segment management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-cdnconfiguration)
     *
     * @param cdnConfiguration The configuration for using a content delivery network (CDN), like
     *   Amazon CloudFront, for content and ad segment management.
     */
    public fun cdnConfiguration(cdnConfiguration: IResolvable) {
        cdkBuilder.cdnConfiguration(cdnConfiguration)
    }

    /**
     * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for
     * content and ad segment management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-cdnconfiguration)
     *
     * @param cdnConfiguration The configuration for using a content delivery network (CDN), like
     *   Amazon CloudFront, for content and ad segment management.
     */
    public fun cdnConfiguration(
        cdnConfiguration: CfnPlaybackConfiguration.CdnConfigurationProperty
    ) {
        cdkBuilder.cdnConfiguration(cdnConfiguration)
    }

    /**
     * The player parameters and aliases used as dynamic variables during session initialization.
     *
     * For more information, see
     * [Domain Variables](https://docs.aws.amazon.com/mediatailor/latest/ug/variables-domain.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-configurationaliases)
     *
     * @param configurationAliases The player parameters and aliases used as dynamic variables
     *   during session initialization.
     */
    public fun configurationAliases(configurationAliases: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(configurationAliases)
        cdkBuilder.configurationAliases(builder.map)
    }

    /**
     * The player parameters and aliases used as dynamic variables during session initialization.
     *
     * For more information, see
     * [Domain Variables](https://docs.aws.amazon.com/mediatailor/latest/ug/variables-domain.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-configurationaliases)
     *
     * @param configurationAliases The player parameters and aliases used as dynamic variables
     *   during session initialization.
     */
    public fun configurationAliases(configurationAliases: Map<String, Any>) {
        cdkBuilder.configurationAliases(configurationAliases)
    }

    /**
     * The player parameters and aliases used as dynamic variables during session initialization.
     *
     * For more information, see
     * [Domain Variables](https://docs.aws.amazon.com/mediatailor/latest/ug/variables-domain.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-configurationaliases)
     *
     * @param configurationAliases The player parameters and aliases used as dynamic variables
     *   during session initialization.
     */
    public fun configurationAliases(configurationAliases: IResolvable) {
        cdkBuilder.configurationAliases(configurationAliases)
    }

    /**
     * The configuration for a DASH source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-dashconfiguration)
     *
     * @param dashConfiguration The configuration for a DASH source.
     */
    public fun dashConfiguration(dashConfiguration: IResolvable) {
        cdkBuilder.dashConfiguration(dashConfiguration)
    }

    /**
     * The configuration for a DASH source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-dashconfiguration)
     *
     * @param dashConfiguration The configuration for a DASH source.
     */
    public fun dashConfiguration(
        dashConfiguration: CfnPlaybackConfiguration.DashConfigurationProperty
    ) {
        cdkBuilder.dashConfiguration(dashConfiguration)
    }

    /**
     * The configuration for HLS content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-hlsconfiguration)
     *
     * @param hlsConfiguration The configuration for HLS content.
     */
    public fun hlsConfiguration(hlsConfiguration: IResolvable) {
        cdkBuilder.hlsConfiguration(hlsConfiguration)
    }

    /**
     * The configuration for HLS content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-hlsconfiguration)
     *
     * @param hlsConfiguration The configuration for HLS content.
     */
    public fun hlsConfiguration(
        hlsConfiguration: CfnPlaybackConfiguration.HlsConfigurationProperty
    ) {
        cdkBuilder.hlsConfiguration(hlsConfiguration)
    }

    /**
     * The configuration for pre-roll ad insertion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-liveprerollconfiguration)
     *
     * @param livePreRollConfiguration The configuration for pre-roll ad insertion.
     */
    public fun livePreRollConfiguration(livePreRollConfiguration: IResolvable) {
        cdkBuilder.livePreRollConfiguration(livePreRollConfiguration)
    }

    /**
     * The configuration for pre-roll ad insertion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-liveprerollconfiguration)
     *
     * @param livePreRollConfiguration The configuration for pre-roll ad insertion.
     */
    public fun livePreRollConfiguration(
        livePreRollConfiguration: CfnPlaybackConfiguration.LivePreRollConfigurationProperty
    ) {
        cdkBuilder.livePreRollConfiguration(livePreRollConfiguration)
    }

    /**
     * The configuration for manifest processing rules.
     *
     * Manifest processing rules enable customization of the personalized manifests created by
     * MediaTailor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-manifestprocessingrules)
     *
     * @param manifestProcessingRules The configuration for manifest processing rules.
     */
    public fun manifestProcessingRules(manifestProcessingRules: IResolvable) {
        cdkBuilder.manifestProcessingRules(manifestProcessingRules)
    }

    /**
     * The configuration for manifest processing rules.
     *
     * Manifest processing rules enable customization of the personalized manifests created by
     * MediaTailor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-manifestprocessingrules)
     *
     * @param manifestProcessingRules The configuration for manifest processing rules.
     */
    public fun manifestProcessingRules(
        manifestProcessingRules: CfnPlaybackConfiguration.ManifestProcessingRulesProperty
    ) {
        cdkBuilder.manifestProcessingRules(manifestProcessingRules)
    }

    /**
     * The identifier for the playback configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-name)
     *
     * @param name The identifier for the playback configuration.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Defines the maximum duration of underfilled ad time (in seconds) allowed in an ad break.
     *
     * If the duration of underfilled ad time exceeds the personalization threshold, then the
     * personalization of the ad break is abandoned and the underlying content is shown. This
     * feature applies to *ad replacement* in live and VOD streams, rather than ad insertion,
     * because it relies on an underlying content stream. For more information about ad break
     * behavior, including ad replacement and insertion, see
     * [Ad Behavior in AWS Elemental MediaTailor](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-personalizationthresholdseconds)
     *
     * @param personalizationThresholdSeconds Defines the maximum duration of underfilled ad time
     *   (in seconds) allowed in an ad break.
     */
    public fun personalizationThresholdSeconds(personalizationThresholdSeconds: Number) {
        cdkBuilder.personalizationThresholdSeconds(personalizationThresholdSeconds)
    }

    /**
     * The URL for a video asset to transcode and use to fill in time that's not used by ads.
     *
     * AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the
     * slate is optional for non-VPAID playback configurations. For VPAID, the slate is required
     * because MediaTailor provides it in the slots designated for dynamic ad content. The slate
     * must be a high-quality asset that contains both audio and video.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-slateadurl)
     *
     * @param slateAdUrl The URL for a video asset to transcode and use to fill in time that's not
     *   used by ads.
     */
    public fun slateAdUrl(slateAdUrl: String) {
        cdkBuilder.slateAdUrl(slateAdUrl)
    }

    /**
     * The tags to assign to the playback configuration.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see
     * [Tagging AWS Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-tags)
     *
     * @param tags The tags to assign to the playback configuration.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to assign to the playback configuration.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see
     * [Tagging AWS Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-tags)
     *
     * @param tags The tags to assign to the playback configuration.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The name that is used to associate this playback configuration with a custom transcode
     * profile.
     *
     * This overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have
     * already set up custom profiles with the help of AWS Support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-transcodeprofilename)
     *
     * @param transcodeProfileName The name that is used to associate this playback configuration
     *   with a custom transcode profile.
     */
    public fun transcodeProfileName(transcodeProfileName: String) {
        cdkBuilder.transcodeProfileName(transcodeProfileName)
    }

    /**
     * The URL prefix for the parent manifest for the stream, minus the asset ID.
     *
     * The maximum length is 512 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-videocontentsourceurl)
     *
     * @param videoContentSourceUrl The URL prefix for the parent manifest for the stream, minus the
     *   asset ID.
     */
    public fun videoContentSourceUrl(videoContentSourceUrl: String) {
        cdkBuilder.videoContentSourceUrl(videoContentSourceUrl)
    }

    public fun build(): CfnPlaybackConfiguration {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
