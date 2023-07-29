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

package cloudshift.awscdk.dsl.services.mediatailor

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfiguration
import software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps
import software.constructs.Construct

public object mediatailor {
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
     * For HLS, when set to true, MediaTailor passes through EXT-X-CUE-IN, EXT-X-CUE-OUT, and
     * EXT-X-SPLICEPOINT-SCTE35 ad markers from the origin manifest to the MediaTailor personalized
     * manifest.
     *
     * No logic is applied to these ad markers. For example, if EXT-X-CUE-OUT has a value of 60, but
     * no ads are filled for that ad break, MediaTailor will not set the value to 0.
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
     * For more information about ad suppression, see Ad Suppression
     * (https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html).
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
     * break. To learn more about bumpers, see Bumpers
     * (https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html).
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
}
