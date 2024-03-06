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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediatailor.CfnChannel
import software.amazon.awscdk.services.mediatailor.CfnChannelPolicy
import software.amazon.awscdk.services.mediatailor.CfnChannelPolicyProps
import software.amazon.awscdk.services.mediatailor.CfnChannelProps
import software.amazon.awscdk.services.mediatailor.CfnLiveSource
import software.amazon.awscdk.services.mediatailor.CfnLiveSourceProps
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps
import software.amazon.awscdk.services.mediatailor.CfnSourceLocation
import software.amazon.awscdk.services.mediatailor.CfnSourceLocationProps
import software.amazon.awscdk.services.mediatailor.CfnVodSource
import software.amazon.awscdk.services.mediatailor.CfnVodSourceProps
import software.constructs.Construct

public object mediatailor {
    /**
     * The configuration parameters for a channel.
     *
     * For information about MediaTailor channels, see
     * [Working with channels](https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-channels.html)
     * in the *MediaTailor User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * CfnChannel cfnChannel = CfnChannel.Builder.create(this, "MyCfnChannel")
     * .channelName("channelName")
     * .outputs(List.of(RequestOutputItemProperty.builder()
     * .manifestName("manifestName")
     * .sourceGroup("sourceGroup")
     * // the properties below are optional
     * .dashPlaylistSettings(DashPlaylistSettingsProperty.builder()
     * .manifestWindowSeconds(123)
     * .minBufferTimeSeconds(123)
     * .minUpdatePeriodSeconds(123)
     * .suggestedPresentationDelaySeconds(123)
     * .build())
     * .hlsPlaylistSettings(HlsPlaylistSettingsProperty.builder()
     * .adMarkupType(List.of("adMarkupType"))
     * .manifestWindowSeconds(123)
     * .build())
     * .build()))
     * .playbackMode("playbackMode")
     * // the properties below are optional
     * .fillerSlate(SlateSourceProperty.builder()
     * .sourceLocationName("sourceLocationName")
     * .vodSourceName("vodSourceName")
     * .build())
     * .logConfiguration(LogConfigurationForChannelProperty.builder()
     * .logTypes(List.of("logTypes"))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tier("tier")
     * .timeShiftConfiguration(TimeShiftConfigurationProperty.builder()
     * .maxTimeDelaySeconds(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html)
     */
    public inline fun cfnChannel(
        scope: Construct,
        id: String,
        block: CfnChannelDsl.() -> Unit = {},
    ): CfnChannel {
        val builder = CfnChannelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Dash manifest configuration parameters.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * DashPlaylistSettingsProperty dashPlaylistSettingsProperty =
     * DashPlaylistSettingsProperty.builder()
     * .manifestWindowSeconds(123)
     * .minBufferTimeSeconds(123)
     * .minUpdatePeriodSeconds(123)
     * .suggestedPresentationDelaySeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-dashplaylistsettings.html)
     */
    public inline fun cfnChannelDashPlaylistSettingsProperty(
        block: CfnChannelDashPlaylistSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.DashPlaylistSettingsProperty {
        val builder = CfnChannelDashPlaylistSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * HLS playlist configuration parameters.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * HlsPlaylistSettingsProperty hlsPlaylistSettingsProperty = HlsPlaylistSettingsProperty.builder()
     * .adMarkupType(List.of("adMarkupType"))
     * .manifestWindowSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-hlsplaylistsettings.html)
     */
    public inline fun cfnChannelHlsPlaylistSettingsProperty(
        block: CfnChannelHlsPlaylistSettingsPropertyDsl.() -> Unit = {}
    ): CfnChannel.HlsPlaylistSettingsProperty {
        val builder = CfnChannelHlsPlaylistSettingsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The log configuration for the channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * LogConfigurationForChannelProperty logConfigurationForChannelProperty =
     * LogConfigurationForChannelProperty.builder()
     * .logTypes(List.of("logTypes"))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-logconfigurationforchannel.html)
     */
    public inline fun cfnChannelLogConfigurationForChannelProperty(
        block: CfnChannelLogConfigurationForChannelPropertyDsl.() -> Unit = {}
    ): CfnChannel.LogConfigurationForChannelProperty {
        val builder = CfnChannelLogConfigurationForChannelPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Specifies an IAM policy for the channel.
     *
     * IAM policies are used to control access to your channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * Object policy;
     * CfnChannelPolicy cfnChannelPolicy = CfnChannelPolicy.Builder.create(this, "MyCfnChannelPolicy")
     * .channelName("channelName")
     * .policy(policy)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html)
     */
    public inline fun cfnChannelPolicy(
        scope: Construct,
        id: String,
        block: CfnChannelPolicyDsl.() -> Unit = {},
    ): CfnChannelPolicy {
        val builder = CfnChannelPolicyDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnChannelPolicy`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * Object policy;
     * CfnChannelPolicyProps cfnChannelPolicyProps = CfnChannelPolicyProps.builder()
     * .channelName("channelName")
     * .policy(policy)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channelpolicy.html)
     */
    public inline fun cfnChannelPolicyProps(
        block: CfnChannelPolicyPropsDsl.() -> Unit = {}
    ): CfnChannelPolicyProps {
        val builder = CfnChannelPolicyPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnChannel`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * CfnChannelProps cfnChannelProps = CfnChannelProps.builder()
     * .channelName("channelName")
     * .outputs(List.of(RequestOutputItemProperty.builder()
     * .manifestName("manifestName")
     * .sourceGroup("sourceGroup")
     * // the properties below are optional
     * .dashPlaylistSettings(DashPlaylistSettingsProperty.builder()
     * .manifestWindowSeconds(123)
     * .minBufferTimeSeconds(123)
     * .minUpdatePeriodSeconds(123)
     * .suggestedPresentationDelaySeconds(123)
     * .build())
     * .hlsPlaylistSettings(HlsPlaylistSettingsProperty.builder()
     * .adMarkupType(List.of("adMarkupType"))
     * .manifestWindowSeconds(123)
     * .build())
     * .build()))
     * .playbackMode("playbackMode")
     * // the properties below are optional
     * .fillerSlate(SlateSourceProperty.builder()
     * .sourceLocationName("sourceLocationName")
     * .vodSourceName("vodSourceName")
     * .build())
     * .logConfiguration(LogConfigurationForChannelProperty.builder()
     * .logTypes(List.of("logTypes"))
     * .build())
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .tier("tier")
     * .timeShiftConfiguration(TimeShiftConfigurationProperty.builder()
     * .maxTimeDelaySeconds(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html)
     */
    public inline fun cfnChannelProps(block: CfnChannelPropsDsl.() -> Unit = {}): CfnChannelProps {
        val builder = CfnChannelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The output configuration for this channel.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * RequestOutputItemProperty requestOutputItemProperty = RequestOutputItemProperty.builder()
     * .manifestName("manifestName")
     * .sourceGroup("sourceGroup")
     * // the properties below are optional
     * .dashPlaylistSettings(DashPlaylistSettingsProperty.builder()
     * .manifestWindowSeconds(123)
     * .minBufferTimeSeconds(123)
     * .minUpdatePeriodSeconds(123)
     * .suggestedPresentationDelaySeconds(123)
     * .build())
     * .hlsPlaylistSettings(HlsPlaylistSettingsProperty.builder()
     * .adMarkupType(List.of("adMarkupType"))
     * .manifestWindowSeconds(123)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-requestoutputitem.html)
     */
    public inline fun cfnChannelRequestOutputItemProperty(
        block: CfnChannelRequestOutputItemPropertyDsl.() -> Unit = {}
    ): CfnChannel.RequestOutputItemProperty {
        val builder = CfnChannelRequestOutputItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Slate VOD source configuration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * SlateSourceProperty slateSourceProperty = SlateSourceProperty.builder()
     * .sourceLocationName("sourceLocationName")
     * .vodSourceName("vodSourceName")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-slatesource.html)
     */
    public inline fun cfnChannelSlateSourceProperty(
        block: CfnChannelSlateSourcePropertyDsl.() -> Unit = {}
    ): CfnChannel.SlateSourceProperty {
        val builder = CfnChannelSlateSourcePropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for time-shifted viewing.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * TimeShiftConfigurationProperty timeShiftConfigurationProperty =
     * TimeShiftConfigurationProperty.builder()
     * .maxTimeDelaySeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-channel-timeshiftconfiguration.html)
     */
    public inline fun cfnChannelTimeShiftConfigurationProperty(
        block: CfnChannelTimeShiftConfigurationPropertyDsl.() -> Unit = {}
    ): CfnChannel.TimeShiftConfigurationProperty {
        val builder = CfnChannelTimeShiftConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Live source configuration parameters.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * CfnLiveSource cfnLiveSource = CfnLiveSource.Builder.create(this, "MyCfnLiveSource")
     * .httpPackageConfigurations(List.of(HttpPackageConfigurationProperty.builder()
     * .path("path")
     * .sourceGroup("sourceGroup")
     * .type("type")
     * .build()))
     * .liveSourceName("liveSourceName")
     * .sourceLocationName("sourceLocationName")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html)
     */
    public inline fun cfnLiveSource(
        scope: Construct,
        id: String,
        block: CfnLiveSourceDsl.() -> Unit = {},
    ): CfnLiveSource {
        val builder = CfnLiveSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The HTTP package configuration properties for the requested VOD source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * HttpPackageConfigurationProperty httpPackageConfigurationProperty =
     * HttpPackageConfigurationProperty.builder()
     * .path("path")
     * .sourceGroup("sourceGroup")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-livesource-httppackageconfiguration.html)
     */
    public inline fun cfnLiveSourceHttpPackageConfigurationProperty(
        block: CfnLiveSourceHttpPackageConfigurationPropertyDsl.() -> Unit = {}
    ): CfnLiveSource.HttpPackageConfigurationProperty {
        val builder = CfnLiveSourceHttpPackageConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnLiveSource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * CfnLiveSourceProps cfnLiveSourceProps = CfnLiveSourceProps.builder()
     * .httpPackageConfigurations(List.of(HttpPackageConfigurationProperty.builder()
     * .path("path")
     * .sourceGroup("sourceGroup")
     * .type("type")
     * .build()))
     * .liveSourceName("liveSourceName")
     * .sourceLocationName("sourceLocationName")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-livesource.html)
     */
    public inline fun cfnLiveSourceProps(
        block: CfnLiveSourcePropsDsl.() -> Unit = {}
    ): CfnLiveSourceProps {
        val builder = CfnLiveSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Adds a new playback configuration to AWS Elemental MediaTailor .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * Object configurationAliases;
     * CfnPlaybackConfiguration cfnPlaybackConfiguration =
     * CfnPlaybackConfiguration.Builder.create(this, "MyCfnPlaybackConfiguration")
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
    public inline fun cfnPlaybackConfiguration(
        scope: Construct,
        id: String,
        block: CfnPlaybackConfigurationDsl.() -> Unit = {},
    ): CfnPlaybackConfiguration {
        val builder = CfnPlaybackConfigurationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * For HLS, when set to `true` , MediaTailor passes through `EXT-X-CUE-IN` , `EXT-X-CUE-OUT` ,
     * and `EXT-X-SPLICEPOINT-SCTE35` ad markers from the origin manifest to the MediaTailor
     * personalized manifest.
     *
     * No logic is applied to these ad markers. For example, if `EXT-X-CUE-OUT` has a value of `60`
     * , but no ads are filled for that ad break, MediaTailor will not set the value to `0` .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * AdMarkerPassthroughProperty adMarkerPassthroughProperty = AdMarkerPassthroughProperty.builder()
     * .enabled(false)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-admarkerpassthrough.html)
     */
    public inline fun cfnPlaybackConfigurationAdMarkerPassthroughProperty(
        block: CfnPlaybackConfigurationAdMarkerPassthroughPropertyDsl.() -> Unit = {}
    ): CfnPlaybackConfiguration.AdMarkerPassthroughProperty {
        val builder = CfnPlaybackConfigurationAdMarkerPassthroughPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for avail suppression, also known as ad suppression.
     *
     * For more information about ad suppression, see
     * [Ad Suppression](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * AvailSuppressionProperty availSuppressionProperty = AvailSuppressionProperty.builder()
     * .mode("mode")
     * .value("value")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-availsuppression.html)
     */
    public inline fun cfnPlaybackConfigurationAvailSuppressionProperty(
        block: CfnPlaybackConfigurationAvailSuppressionPropertyDsl.() -> Unit = {}
    ): CfnPlaybackConfiguration.AvailSuppressionProperty {
        val builder = CfnPlaybackConfigurationAvailSuppressionPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for bumpers.
     *
     * Bumpers are short audio or video clips that play at the start or before the end of an ad
     * break. To learn more about bumpers, see
     * [Bumpers](https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html) .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * BumperProperty bumperProperty = BumperProperty.builder()
     * .endUrl("endUrl")
     * .startUrl("startUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-bumper.html)
     */
    public inline fun cfnPlaybackConfigurationBumperProperty(
        block: CfnPlaybackConfigurationBumperPropertyDsl.() -> Unit = {}
    ): CfnPlaybackConfiguration.BumperProperty {
        val builder = CfnPlaybackConfigurationBumperPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for
     * content and ad segment management.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * CdnConfigurationProperty cdnConfigurationProperty = CdnConfigurationProperty.builder()
     * .adSegmentUrlPrefix("adSegmentUrlPrefix")
     * .contentSegmentUrlPrefix("contentSegmentUrlPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-cdnconfiguration.html)
     */
    public inline fun cfnPlaybackConfigurationCdnConfigurationProperty(
        block: CfnPlaybackConfigurationCdnConfigurationPropertyDsl.() -> Unit = {}
    ): CfnPlaybackConfiguration.CdnConfigurationProperty {
        val builder = CfnPlaybackConfigurationCdnConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for DASH content.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * DashConfigurationProperty dashConfigurationProperty = DashConfigurationProperty.builder()
     * .manifestEndpointPrefix("manifestEndpointPrefix")
     * .mpdLocation("mpdLocation")
     * .originManifestType("originManifestType")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-dashconfiguration.html)
     */
    public inline fun cfnPlaybackConfigurationDashConfigurationProperty(
        block: CfnPlaybackConfigurationDashConfigurationPropertyDsl.() -> Unit = {}
    ): CfnPlaybackConfiguration.DashConfigurationProperty {
        val builder = CfnPlaybackConfigurationDashConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for HLS content.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * HlsConfigurationProperty hlsConfigurationProperty = HlsConfigurationProperty.builder()
     * .manifestEndpointPrefix("manifestEndpointPrefix")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-hlsconfiguration.html)
     */
    public inline fun cfnPlaybackConfigurationHlsConfigurationProperty(
        block: CfnPlaybackConfigurationHlsConfigurationPropertyDsl.() -> Unit = {}
    ): CfnPlaybackConfiguration.HlsConfigurationProperty {
        val builder = CfnPlaybackConfigurationHlsConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for pre-roll ad insertion.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * LivePreRollConfigurationProperty livePreRollConfigurationProperty =
     * LivePreRollConfigurationProperty.builder()
     * .adDecisionServerUrl("adDecisionServerUrl")
     * .maxDurationSeconds(123)
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-liveprerollconfiguration.html)
     */
    public inline fun cfnPlaybackConfigurationLivePreRollConfigurationProperty(
        block: CfnPlaybackConfigurationLivePreRollConfigurationPropertyDsl.() -> Unit = {}
    ): CfnPlaybackConfiguration.LivePreRollConfigurationProperty {
        val builder = CfnPlaybackConfigurationLivePreRollConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The configuration for manifest processing rules.
     *
     * Manifest processing rules enable customization of the personalized manifests created by
     * MediaTailor.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * ManifestProcessingRulesProperty manifestProcessingRulesProperty =
     * ManifestProcessingRulesProperty.builder()
     * .adMarkerPassthrough(AdMarkerPassthroughProperty.builder()
     * .enabled(false)
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-playbackconfiguration-manifestprocessingrules.html)
     */
    public inline fun cfnPlaybackConfigurationManifestProcessingRulesProperty(
        block: CfnPlaybackConfigurationManifestProcessingRulesPropertyDsl.() -> Unit = {}
    ): CfnPlaybackConfiguration.ManifestProcessingRulesProperty {
        val builder = CfnPlaybackConfigurationManifestProcessingRulesPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun cfnPlaybackConfigurationProps(
        block: CfnPlaybackConfigurationPropsDsl.() -> Unit = {}
    ): CfnPlaybackConfigurationProps {
        val builder = CfnPlaybackConfigurationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * A source location is a container for sources.
     *
     * For more information about source locations, see
     * [Working with source locations](https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-source-locations.html)
     * in the *MediaTailor User Guide* .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * CfnSourceLocation cfnSourceLocation = CfnSourceLocation.Builder.create(this,
     * "MyCfnSourceLocation")
     * .httpConfiguration(HttpConfigurationProperty.builder()
     * .baseUrl("baseUrl")
     * .build())
     * .sourceLocationName("sourceLocationName")
     * // the properties below are optional
     * .accessConfiguration(AccessConfigurationProperty.builder()
     * .accessType("accessType")
     * .secretsManagerAccessTokenConfiguration(SecretsManagerAccessTokenConfigurationProperty.builder()
     * .headerName("headerName")
     * .secretArn("secretArn")
     * .secretStringKey("secretStringKey")
     * .build())
     * .build())
     * .defaultSegmentDeliveryConfiguration(DefaultSegmentDeliveryConfigurationProperty.builder()
     * .baseUrl("baseUrl")
     * .build())
     * .segmentDeliveryConfigurations(List.of(SegmentDeliveryConfigurationProperty.builder()
     * .baseUrl("baseUrl")
     * .name("name")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html)
     */
    public inline fun cfnSourceLocation(
        scope: Construct,
        id: String,
        block: CfnSourceLocationDsl.() -> Unit = {},
    ): CfnSourceLocation {
        val builder = CfnSourceLocationDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Access configuration parameters.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * AccessConfigurationProperty accessConfigurationProperty = AccessConfigurationProperty.builder()
     * .accessType("accessType")
     * .secretsManagerAccessTokenConfiguration(SecretsManagerAccessTokenConfigurationProperty.builder()
     * .headerName("headerName")
     * .secretArn("secretArn")
     * .secretStringKey("secretStringKey")
     * .build())
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-accessconfiguration.html)
     */
    public inline fun cfnSourceLocationAccessConfigurationProperty(
        block: CfnSourceLocationAccessConfigurationPropertyDsl.() -> Unit = {}
    ): CfnSourceLocation.AccessConfigurationProperty {
        val builder = CfnSourceLocationAccessConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The optional configuration for a server that serves segments.
     *
     * Use this if you want the segment delivery server to be different from the source location
     * server. For example, you can configure your source location server to be an origination
     * server, such as MediaPackage, and the segment delivery server to be a content delivery
     * network (CDN), such as CloudFront. If you don't specify a segment delivery server, then the
     * source location server is used.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * DefaultSegmentDeliveryConfigurationProperty defaultSegmentDeliveryConfigurationProperty =
     * DefaultSegmentDeliveryConfigurationProperty.builder()
     * .baseUrl("baseUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-defaultsegmentdeliveryconfiguration.html)
     */
    public inline fun cfnSourceLocationDefaultSegmentDeliveryConfigurationProperty(
        block: CfnSourceLocationDefaultSegmentDeliveryConfigurationPropertyDsl.() -> Unit = {}
    ): CfnSourceLocation.DefaultSegmentDeliveryConfigurationProperty {
        val builder = CfnSourceLocationDefaultSegmentDeliveryConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The HTTP configuration for the source location.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * HttpConfigurationProperty httpConfigurationProperty = HttpConfigurationProperty.builder()
     * .baseUrl("baseUrl")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-httpconfiguration.html)
     */
    public inline fun cfnSourceLocationHttpConfigurationProperty(
        block: CfnSourceLocationHttpConfigurationPropertyDsl.() -> Unit = {}
    ): CfnSourceLocation.HttpConfigurationProperty {
        val builder = CfnSourceLocationHttpConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnSourceLocation`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * CfnSourceLocationProps cfnSourceLocationProps = CfnSourceLocationProps.builder()
     * .httpConfiguration(HttpConfigurationProperty.builder()
     * .baseUrl("baseUrl")
     * .build())
     * .sourceLocationName("sourceLocationName")
     * // the properties below are optional
     * .accessConfiguration(AccessConfigurationProperty.builder()
     * .accessType("accessType")
     * .secretsManagerAccessTokenConfiguration(SecretsManagerAccessTokenConfigurationProperty.builder()
     * .headerName("headerName")
     * .secretArn("secretArn")
     * .secretStringKey("secretStringKey")
     * .build())
     * .build())
     * .defaultSegmentDeliveryConfiguration(DefaultSegmentDeliveryConfigurationProperty.builder()
     * .baseUrl("baseUrl")
     * .build())
     * .segmentDeliveryConfigurations(List.of(SegmentDeliveryConfigurationProperty.builder()
     * .baseUrl("baseUrl")
     * .name("name")
     * .build()))
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-sourcelocation.html)
     */
    public inline fun cfnSourceLocationProps(
        block: CfnSourceLocationPropsDsl.() -> Unit = {}
    ): CfnSourceLocationProps {
        val builder = CfnSourceLocationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * AWS Secrets Manager access token configuration parameters.
     *
     * For information about Secrets Manager access token authentication, see
     * [Working with AWS Secrets Manager access token authentication](https://docs.aws.amazon.com/mediatailor/latest/ug/channel-assembly-access-configuration-access-token.html)
     * .
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * SecretsManagerAccessTokenConfigurationProperty secretsManagerAccessTokenConfigurationProperty =
     * SecretsManagerAccessTokenConfigurationProperty.builder()
     * .headerName("headerName")
     * .secretArn("secretArn")
     * .secretStringKey("secretStringKey")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-secretsmanageraccesstokenconfiguration.html)
     */
    public inline fun cfnSourceLocationSecretsManagerAccessTokenConfigurationProperty(
        block: CfnSourceLocationSecretsManagerAccessTokenConfigurationPropertyDsl.() -> Unit = {}
    ): CfnSourceLocation.SecretsManagerAccessTokenConfigurationProperty {
        val builder = CfnSourceLocationSecretsManagerAccessTokenConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The segment delivery configuration settings.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * SegmentDeliveryConfigurationProperty segmentDeliveryConfigurationProperty =
     * SegmentDeliveryConfigurationProperty.builder()
     * .baseUrl("baseUrl")
     * .name("name")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-sourcelocation-segmentdeliveryconfiguration.html)
     */
    public inline fun cfnSourceLocationSegmentDeliveryConfigurationProperty(
        block: CfnSourceLocationSegmentDeliveryConfigurationPropertyDsl.() -> Unit = {}
    ): CfnSourceLocation.SegmentDeliveryConfigurationProperty {
        val builder = CfnSourceLocationSegmentDeliveryConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The VOD source configuration parameters.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * CfnVodSource cfnVodSource = CfnVodSource.Builder.create(this, "MyCfnVodSource")
     * .httpPackageConfigurations(List.of(HttpPackageConfigurationProperty.builder()
     * .path("path")
     * .sourceGroup("sourceGroup")
     * .type("type")
     * .build()))
     * .sourceLocationName("sourceLocationName")
     * .vodSourceName("vodSourceName")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html)
     */
    public inline fun cfnVodSource(
        scope: Construct,
        id: String,
        block: CfnVodSourceDsl.() -> Unit = {},
    ): CfnVodSource {
        val builder = CfnVodSourceDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * The HTTP package configuration properties for the requested VOD source.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * HttpPackageConfigurationProperty httpPackageConfigurationProperty =
     * HttpPackageConfigurationProperty.builder()
     * .path("path")
     * .sourceGroup("sourceGroup")
     * .type("type")
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediatailor-vodsource-httppackageconfiguration.html)
     */
    public inline fun cfnVodSourceHttpPackageConfigurationProperty(
        block: CfnVodSourceHttpPackageConfigurationPropertyDsl.() -> Unit = {}
    ): CfnVodSource.HttpPackageConfigurationProperty {
        val builder = CfnVodSourceHttpPackageConfigurationPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties for defining a `CfnVodSource`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.mediatailor.*;
     * CfnVodSourceProps cfnVodSourceProps = CfnVodSourceProps.builder()
     * .httpPackageConfigurations(List.of(HttpPackageConfigurationProperty.builder()
     * .path("path")
     * .sourceGroup("sourceGroup")
     * .type("type")
     * .build()))
     * .sourceLocationName("sourceLocationName")
     * .vodSourceName("vodSourceName")
     * // the properties below are optional
     * .tags(List.of(CfnTag.builder()
     * .key("key")
     * .value("value")
     * .build()))
     * .build();
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-vodsource.html)
     */
    public inline fun cfnVodSourceProps(
        block: CfnVodSourcePropsDsl.() -> Unit = {}
    ): CfnVodSourceProps {
        val builder = CfnVodSourcePropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
