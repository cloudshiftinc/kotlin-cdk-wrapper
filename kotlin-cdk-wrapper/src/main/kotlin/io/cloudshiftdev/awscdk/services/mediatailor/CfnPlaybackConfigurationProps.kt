@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediatailor

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPlaybackConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediatailor.*;
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
public interface CfnPlaybackConfigurationProps {
  /**
   * The URL for the ad decision server (ADS).
   *
   * This includes the specification of static parameters and placeholders for dynamic parameters.
   * AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed
   * when calling the ADS. Alternately, for testing you can provide a static VAST URL. The maximum
   * length is 25,000 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-addecisionserverurl)
   */
  public fun adDecisionServerUrl(): String

  /**
   * The configuration for avail suppression, also known as ad suppression.
   *
   * For more information about ad suppression, see [Ad
   * Suppression](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-availsuppression)
   */
  public fun availSuppression(): Any? = unwrap(this).getAvailSuppression()

  /**
   * The configuration for bumpers.
   *
   * Bumpers are short audio or video clips that play at the start or before the end of an ad break.
   * To learn more about bumpers, see
   * [Bumpers](https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-bumper)
   */
  public fun bumper(): Any? = unwrap(this).getBumper()

  /**
   * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for
   * content and ad segment management.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-cdnconfiguration)
   */
  public fun cdnConfiguration(): Any? = unwrap(this).getCdnConfiguration()

  /**
   * The player parameters and aliases used as dynamic variables during session initialization.
   *
   * For more information, see [Domain
   * Variables](https://docs.aws.amazon.com/mediatailor/latest/ug/variables-domain.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-configurationaliases)
   */
  public fun configurationAliases(): Any? = unwrap(this).getConfigurationAliases()

  /**
   * The configuration for a DASH source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-dashconfiguration)
   */
  public fun dashConfiguration(): Any? = unwrap(this).getDashConfiguration()

  /**
   * The configuration for HLS content.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-hlsconfiguration)
   */
  public fun hlsConfiguration(): Any? = unwrap(this).getHlsConfiguration()

  /**
   * The configuration for pre-roll ad insertion.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-liveprerollconfiguration)
   */
  public fun livePreRollConfiguration(): Any? = unwrap(this).getLivePreRollConfiguration()

  /**
   * The configuration for manifest processing rules.
   *
   * Manifest processing rules enable customization of the personalized manifests created by
   * MediaTailor.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-manifestprocessingrules)
   */
  public fun manifestProcessingRules(): Any? = unwrap(this).getManifestProcessingRules()

  /**
   * The identifier for the playback configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-name)
   */
  public fun name(): String

  /**
   * Defines the maximum duration of underfilled ad time (in seconds) allowed in an ad break.
   *
   * If the duration of underfilled ad time exceeds the personalization threshold, then the
   * personalization of the ad break is abandoned and the underlying content is shown. This feature
   * applies to *ad replacement* in live and VOD streams, rather than ad insertion, because it relies
   * on an underlying content stream. For more information about ad break behavior, including ad
   * replacement and insertion, see [Ad Behavior in AWS Elemental
   * MediaTailor](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-personalizationthresholdseconds)
   */
  public fun personalizationThresholdSeconds(): Number? =
      unwrap(this).getPersonalizationThresholdSeconds()

  /**
   * The URL for a video asset to transcode and use to fill in time that's not used by ads.
   *
   * AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the
   * slate is optional for non-VPAID playback configurations. For VPAID, the slate is required because
   * MediaTailor provides it in the slots designated for dynamic ad content. The slate must be a
   * high-quality asset that contains both audio and video.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-slateadurl)
   */
  public fun slateAdUrl(): String? = unwrap(this).getSlateAdUrl()

  /**
   * The tags to assign to the playback configuration.
   *
   * Tags are key-value pairs that you can associate with Amazon resources to help with
   * organization, access control, and cost tracking. For more information, see [Tagging AWS Elemental
   * MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name that is used to associate this playback configuration with a custom transcode profile.
   *
   * This overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have
   * already set up custom profiles with the help of AWS Support.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-transcodeprofilename)
   */
  public fun transcodeProfileName(): String? = unwrap(this).getTranscodeProfileName()

  /**
   * The URL prefix for the parent manifest for the stream, minus the asset ID.
   *
   * The maximum length is 512 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-videocontentsourceurl)
   */
  public fun videoContentSourceUrl(): String

  /**
   * A builder for [CfnPlaybackConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adDecisionServerUrl The URL for the ad decision server (ADS). 
     * This includes the specification of static parameters and placeholders for dynamic parameters.
     * AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed
     * when calling the ADS. Alternately, for testing you can provide a static VAST URL. The maximum
     * length is 25,000 characters.
     */
    public fun adDecisionServerUrl(adDecisionServerUrl: String)

    /**
     * @param availSuppression The configuration for avail suppression, also known as ad
     * suppression.
     * For more information about ad suppression, see [Ad
     * Suppression](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
     */
    public fun availSuppression(availSuppression: IResolvable)

    /**
     * @param availSuppression The configuration for avail suppression, also known as ad
     * suppression.
     * For more information about ad suppression, see [Ad
     * Suppression](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
     */
    public fun availSuppression(availSuppression: CfnPlaybackConfiguration.AvailSuppressionProperty)

    /**
     * @param availSuppression The configuration for avail suppression, also known as ad
     * suppression.
     * For more information about ad suppression, see [Ad
     * Suppression](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8026ba3922b4645fac3a368a451a35217382f8e0d2c964d176a220dfa0260c95")
    public
        fun availSuppression(availSuppression: CfnPlaybackConfiguration.AvailSuppressionProperty.Builder.() -> Unit)

    /**
     * @param bumper The configuration for bumpers.
     * Bumpers are short audio or video clips that play at the start or before the end of an ad
     * break. To learn more about bumpers, see
     * [Bumpers](https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html) .
     */
    public fun bumper(bumper: IResolvable)

    /**
     * @param bumper The configuration for bumpers.
     * Bumpers are short audio or video clips that play at the start or before the end of an ad
     * break. To learn more about bumpers, see
     * [Bumpers](https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html) .
     */
    public fun bumper(bumper: CfnPlaybackConfiguration.BumperProperty)

    /**
     * @param bumper The configuration for bumpers.
     * Bumpers are short audio or video clips that play at the start or before the end of an ad
     * break. To learn more about bumpers, see
     * [Bumpers](https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77c571caa44879d74f4e957d8ecd927e94d804de9735a7afe3a651a86955d6ed")
    public fun bumper(bumper: CfnPlaybackConfiguration.BumperProperty.Builder.() -> Unit)

    /**
     * @param cdnConfiguration The configuration for using a content delivery network (CDN), like
     * Amazon CloudFront, for content and ad segment management.
     */
    public fun cdnConfiguration(cdnConfiguration: IResolvable)

    /**
     * @param cdnConfiguration The configuration for using a content delivery network (CDN), like
     * Amazon CloudFront, for content and ad segment management.
     */
    public fun cdnConfiguration(cdnConfiguration: CfnPlaybackConfiguration.CdnConfigurationProperty)

    /**
     * @param cdnConfiguration The configuration for using a content delivery network (CDN), like
     * Amazon CloudFront, for content and ad segment management.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d72bd252ba0e72440ff25cd81da98020c3baf3822790d3a75479d98eafe026de")
    public
        fun cdnConfiguration(cdnConfiguration: CfnPlaybackConfiguration.CdnConfigurationProperty.Builder.() -> Unit)

    /**
     * @param configurationAliases The player parameters and aliases used as dynamic variables
     * during session initialization.
     * For more information, see [Domain
     * Variables](https://docs.aws.amazon.com/mediatailor/latest/ug/variables-domain.html) .
     */
    public fun configurationAliases(configurationAliases: IResolvable)

    /**
     * @param configurationAliases The player parameters and aliases used as dynamic variables
     * during session initialization.
     * For more information, see [Domain
     * Variables](https://docs.aws.amazon.com/mediatailor/latest/ug/variables-domain.html) .
     */
    public fun configurationAliases(configurationAliases: Map<String, Any>)

    /**
     * @param dashConfiguration The configuration for a DASH source.
     */
    public fun dashConfiguration(dashConfiguration: IResolvable)

    /**
     * @param dashConfiguration The configuration for a DASH source.
     */
    public
        fun dashConfiguration(dashConfiguration: CfnPlaybackConfiguration.DashConfigurationProperty)

    /**
     * @param dashConfiguration The configuration for a DASH source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab9a6790602423c0b91c25ed17f298b2ee9723fd955db2420e3786c66b4612bf")
    public
        fun dashConfiguration(dashConfiguration: CfnPlaybackConfiguration.DashConfigurationProperty.Builder.() -> Unit)

    /**
     * @param hlsConfiguration The configuration for HLS content.
     */
    public fun hlsConfiguration(hlsConfiguration: IResolvable)

    /**
     * @param hlsConfiguration The configuration for HLS content.
     */
    public fun hlsConfiguration(hlsConfiguration: CfnPlaybackConfiguration.HlsConfigurationProperty)

    /**
     * @param hlsConfiguration The configuration for HLS content.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff87bacd09a477cc16ba0960b3b96e444632543798fcab3539fde920ef4596ce")
    public
        fun hlsConfiguration(hlsConfiguration: CfnPlaybackConfiguration.HlsConfigurationProperty.Builder.() -> Unit)

    /**
     * @param livePreRollConfiguration The configuration for pre-roll ad insertion.
     */
    public fun livePreRollConfiguration(livePreRollConfiguration: IResolvable)

    /**
     * @param livePreRollConfiguration The configuration for pre-roll ad insertion.
     */
    public
        fun livePreRollConfiguration(livePreRollConfiguration: CfnPlaybackConfiguration.LivePreRollConfigurationProperty)

    /**
     * @param livePreRollConfiguration The configuration for pre-roll ad insertion.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("540b8a134d0608705410d3d40ab82f8883e15c1ecacfefe7c63c550ac5e4f6c5")
    public
        fun livePreRollConfiguration(livePreRollConfiguration: CfnPlaybackConfiguration.LivePreRollConfigurationProperty.Builder.() -> Unit)

    /**
     * @param manifestProcessingRules The configuration for manifest processing rules.
     * Manifest processing rules enable customization of the personalized manifests created by
     * MediaTailor.
     */
    public fun manifestProcessingRules(manifestProcessingRules: IResolvable)

    /**
     * @param manifestProcessingRules The configuration for manifest processing rules.
     * Manifest processing rules enable customization of the personalized manifests created by
     * MediaTailor.
     */
    public
        fun manifestProcessingRules(manifestProcessingRules: CfnPlaybackConfiguration.ManifestProcessingRulesProperty)

    /**
     * @param manifestProcessingRules The configuration for manifest processing rules.
     * Manifest processing rules enable customization of the personalized manifests created by
     * MediaTailor.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("669e7cb5e56087622f66455eb08ae0454596ea24e3c5a18c6f72b0cb18c5b406")
    public
        fun manifestProcessingRules(manifestProcessingRules: CfnPlaybackConfiguration.ManifestProcessingRulesProperty.Builder.() -> Unit)

    /**
     * @param name The identifier for the playback configuration. 
     */
    public fun name(name: String)

    /**
     * @param personalizationThresholdSeconds Defines the maximum duration of underfilled ad time
     * (in seconds) allowed in an ad break.
     * If the duration of underfilled ad time exceeds the personalization threshold, then the
     * personalization of the ad break is abandoned and the underlying content is shown. This feature
     * applies to *ad replacement* in live and VOD streams, rather than ad insertion, because it relies
     * on an underlying content stream. For more information about ad break behavior, including ad
     * replacement and insertion, see [Ad Behavior in AWS Elemental
     * MediaTailor](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
     */
    public fun personalizationThresholdSeconds(personalizationThresholdSeconds: Number)

    /**
     * @param slateAdUrl The URL for a video asset to transcode and use to fill in time that's not
     * used by ads.
     * AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the
     * slate is optional for non-VPAID playback configurations. For VPAID, the slate is required
     * because MediaTailor provides it in the slots designated for dynamic ad content. The slate must
     * be a high-quality asset that contains both audio and video.
     */
    public fun slateAdUrl(slateAdUrl: String)

    /**
     * @param tags The tags to assign to the playback configuration.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to assign to the playback configuration.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param transcodeProfileName The name that is used to associate this playback configuration
     * with a custom transcode profile.
     * This overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have
     * already set up custom profiles with the help of AWS Support.
     */
    public fun transcodeProfileName(transcodeProfileName: String)

    /**
     * @param videoContentSourceUrl The URL prefix for the parent manifest for the stream, minus the
     * asset ID. 
     * The maximum length is 512 characters.
     */
    public fun videoContentSourceUrl(videoContentSourceUrl: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps.Builder =
        software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps.builder()

    /**
     * @param adDecisionServerUrl The URL for the ad decision server (ADS). 
     * This includes the specification of static parameters and placeholders for dynamic parameters.
     * AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed
     * when calling the ADS. Alternately, for testing you can provide a static VAST URL. The maximum
     * length is 25,000 characters.
     */
    override fun adDecisionServerUrl(adDecisionServerUrl: String) {
      cdkBuilder.adDecisionServerUrl(adDecisionServerUrl)
    }

    /**
     * @param availSuppression The configuration for avail suppression, also known as ad
     * suppression.
     * For more information about ad suppression, see [Ad
     * Suppression](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
     */
    override fun availSuppression(availSuppression: IResolvable) {
      cdkBuilder.availSuppression(availSuppression.let(IResolvable::unwrap))
    }

    /**
     * @param availSuppression The configuration for avail suppression, also known as ad
     * suppression.
     * For more information about ad suppression, see [Ad
     * Suppression](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
     */
    override
        fun availSuppression(availSuppression: CfnPlaybackConfiguration.AvailSuppressionProperty) {
      cdkBuilder.availSuppression(availSuppression.let(CfnPlaybackConfiguration.AvailSuppressionProperty::unwrap))
    }

    /**
     * @param availSuppression The configuration for avail suppression, also known as ad
     * suppression.
     * For more information about ad suppression, see [Ad
     * Suppression](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8026ba3922b4645fac3a368a451a35217382f8e0d2c964d176a220dfa0260c95")
    override
        fun availSuppression(availSuppression: CfnPlaybackConfiguration.AvailSuppressionProperty.Builder.() -> Unit):
        Unit = availSuppression(CfnPlaybackConfiguration.AvailSuppressionProperty(availSuppression))

    /**
     * @param bumper The configuration for bumpers.
     * Bumpers are short audio or video clips that play at the start or before the end of an ad
     * break. To learn more about bumpers, see
     * [Bumpers](https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html) .
     */
    override fun bumper(bumper: IResolvable) {
      cdkBuilder.bumper(bumper.let(IResolvable::unwrap))
    }

    /**
     * @param bumper The configuration for bumpers.
     * Bumpers are short audio or video clips that play at the start or before the end of an ad
     * break. To learn more about bumpers, see
     * [Bumpers](https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html) .
     */
    override fun bumper(bumper: CfnPlaybackConfiguration.BumperProperty) {
      cdkBuilder.bumper(bumper.let(CfnPlaybackConfiguration.BumperProperty::unwrap))
    }

    /**
     * @param bumper The configuration for bumpers.
     * Bumpers are short audio or video clips that play at the start or before the end of an ad
     * break. To learn more about bumpers, see
     * [Bumpers](https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("77c571caa44879d74f4e957d8ecd927e94d804de9735a7afe3a651a86955d6ed")
    override fun bumper(bumper: CfnPlaybackConfiguration.BumperProperty.Builder.() -> Unit): Unit =
        bumper(CfnPlaybackConfiguration.BumperProperty(bumper))

    /**
     * @param cdnConfiguration The configuration for using a content delivery network (CDN), like
     * Amazon CloudFront, for content and ad segment management.
     */
    override fun cdnConfiguration(cdnConfiguration: IResolvable) {
      cdkBuilder.cdnConfiguration(cdnConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param cdnConfiguration The configuration for using a content delivery network (CDN), like
     * Amazon CloudFront, for content and ad segment management.
     */
    override
        fun cdnConfiguration(cdnConfiguration: CfnPlaybackConfiguration.CdnConfigurationProperty) {
      cdkBuilder.cdnConfiguration(cdnConfiguration.let(CfnPlaybackConfiguration.CdnConfigurationProperty::unwrap))
    }

    /**
     * @param cdnConfiguration The configuration for using a content delivery network (CDN), like
     * Amazon CloudFront, for content and ad segment management.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d72bd252ba0e72440ff25cd81da98020c3baf3822790d3a75479d98eafe026de")
    override
        fun cdnConfiguration(cdnConfiguration: CfnPlaybackConfiguration.CdnConfigurationProperty.Builder.() -> Unit):
        Unit = cdnConfiguration(CfnPlaybackConfiguration.CdnConfigurationProperty(cdnConfiguration))

    /**
     * @param configurationAliases The player parameters and aliases used as dynamic variables
     * during session initialization.
     * For more information, see [Domain
     * Variables](https://docs.aws.amazon.com/mediatailor/latest/ug/variables-domain.html) .
     */
    override fun configurationAliases(configurationAliases: IResolvable) {
      cdkBuilder.configurationAliases(configurationAliases.let(IResolvable::unwrap))
    }

    /**
     * @param configurationAliases The player parameters and aliases used as dynamic variables
     * during session initialization.
     * For more information, see [Domain
     * Variables](https://docs.aws.amazon.com/mediatailor/latest/ug/variables-domain.html) .
     */
    override fun configurationAliases(configurationAliases: Map<String, Any>) {
      cdkBuilder.configurationAliases(configurationAliases)
    }

    /**
     * @param dashConfiguration The configuration for a DASH source.
     */
    override fun dashConfiguration(dashConfiguration: IResolvable) {
      cdkBuilder.dashConfiguration(dashConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param dashConfiguration The configuration for a DASH source.
     */
    override
        fun dashConfiguration(dashConfiguration: CfnPlaybackConfiguration.DashConfigurationProperty) {
      cdkBuilder.dashConfiguration(dashConfiguration.let(CfnPlaybackConfiguration.DashConfigurationProperty::unwrap))
    }

    /**
     * @param dashConfiguration The configuration for a DASH source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ab9a6790602423c0b91c25ed17f298b2ee9723fd955db2420e3786c66b4612bf")
    override
        fun dashConfiguration(dashConfiguration: CfnPlaybackConfiguration.DashConfigurationProperty.Builder.() -> Unit):
        Unit =
        dashConfiguration(CfnPlaybackConfiguration.DashConfigurationProperty(dashConfiguration))

    /**
     * @param hlsConfiguration The configuration for HLS content.
     */
    override fun hlsConfiguration(hlsConfiguration: IResolvable) {
      cdkBuilder.hlsConfiguration(hlsConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param hlsConfiguration The configuration for HLS content.
     */
    override
        fun hlsConfiguration(hlsConfiguration: CfnPlaybackConfiguration.HlsConfigurationProperty) {
      cdkBuilder.hlsConfiguration(hlsConfiguration.let(CfnPlaybackConfiguration.HlsConfigurationProperty::unwrap))
    }

    /**
     * @param hlsConfiguration The configuration for HLS content.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ff87bacd09a477cc16ba0960b3b96e444632543798fcab3539fde920ef4596ce")
    override
        fun hlsConfiguration(hlsConfiguration: CfnPlaybackConfiguration.HlsConfigurationProperty.Builder.() -> Unit):
        Unit = hlsConfiguration(CfnPlaybackConfiguration.HlsConfigurationProperty(hlsConfiguration))

    /**
     * @param livePreRollConfiguration The configuration for pre-roll ad insertion.
     */
    override fun livePreRollConfiguration(livePreRollConfiguration: IResolvable) {
      cdkBuilder.livePreRollConfiguration(livePreRollConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param livePreRollConfiguration The configuration for pre-roll ad insertion.
     */
    override
        fun livePreRollConfiguration(livePreRollConfiguration: CfnPlaybackConfiguration.LivePreRollConfigurationProperty) {
      cdkBuilder.livePreRollConfiguration(livePreRollConfiguration.let(CfnPlaybackConfiguration.LivePreRollConfigurationProperty::unwrap))
    }

    /**
     * @param livePreRollConfiguration The configuration for pre-roll ad insertion.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("540b8a134d0608705410d3d40ab82f8883e15c1ecacfefe7c63c550ac5e4f6c5")
    override
        fun livePreRollConfiguration(livePreRollConfiguration: CfnPlaybackConfiguration.LivePreRollConfigurationProperty.Builder.() -> Unit):
        Unit =
        livePreRollConfiguration(CfnPlaybackConfiguration.LivePreRollConfigurationProperty(livePreRollConfiguration))

    /**
     * @param manifestProcessingRules The configuration for manifest processing rules.
     * Manifest processing rules enable customization of the personalized manifests created by
     * MediaTailor.
     */
    override fun manifestProcessingRules(manifestProcessingRules: IResolvable) {
      cdkBuilder.manifestProcessingRules(manifestProcessingRules.let(IResolvable::unwrap))
    }

    /**
     * @param manifestProcessingRules The configuration for manifest processing rules.
     * Manifest processing rules enable customization of the personalized manifests created by
     * MediaTailor.
     */
    override
        fun manifestProcessingRules(manifestProcessingRules: CfnPlaybackConfiguration.ManifestProcessingRulesProperty) {
      cdkBuilder.manifestProcessingRules(manifestProcessingRules.let(CfnPlaybackConfiguration.ManifestProcessingRulesProperty::unwrap))
    }

    /**
     * @param manifestProcessingRules The configuration for manifest processing rules.
     * Manifest processing rules enable customization of the personalized manifests created by
     * MediaTailor.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("669e7cb5e56087622f66455eb08ae0454596ea24e3c5a18c6f72b0cb18c5b406")
    override
        fun manifestProcessingRules(manifestProcessingRules: CfnPlaybackConfiguration.ManifestProcessingRulesProperty.Builder.() -> Unit):
        Unit =
        manifestProcessingRules(CfnPlaybackConfiguration.ManifestProcessingRulesProperty(manifestProcessingRules))

    /**
     * @param name The identifier for the playback configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param personalizationThresholdSeconds Defines the maximum duration of underfilled ad time
     * (in seconds) allowed in an ad break.
     * If the duration of underfilled ad time exceeds the personalization threshold, then the
     * personalization of the ad break is abandoned and the underlying content is shown. This feature
     * applies to *ad replacement* in live and VOD streams, rather than ad insertion, because it relies
     * on an underlying content stream. For more information about ad break behavior, including ad
     * replacement and insertion, see [Ad Behavior in AWS Elemental
     * MediaTailor](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
     */
    override fun personalizationThresholdSeconds(personalizationThresholdSeconds: Number) {
      cdkBuilder.personalizationThresholdSeconds(personalizationThresholdSeconds)
    }

    /**
     * @param slateAdUrl The URL for a video asset to transcode and use to fill in time that's not
     * used by ads.
     * AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the
     * slate is optional for non-VPAID playback configurations. For VPAID, the slate is required
     * because MediaTailor provides it in the slots designated for dynamic ad content. The slate must
     * be a high-quality asset that contains both audio and video.
     */
    override fun slateAdUrl(slateAdUrl: String) {
      cdkBuilder.slateAdUrl(slateAdUrl)
    }

    /**
     * @param tags The tags to assign to the playback configuration.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags to assign to the playback configuration.
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param transcodeProfileName The name that is used to associate this playback configuration
     * with a custom transcode profile.
     * This overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have
     * already set up custom profiles with the help of AWS Support.
     */
    override fun transcodeProfileName(transcodeProfileName: String) {
      cdkBuilder.transcodeProfileName(transcodeProfileName)
    }

    /**
     * @param videoContentSourceUrl The URL prefix for the parent manifest for the stream, minus the
     * asset ID. 
     * The maximum length is 512 characters.
     */
    override fun videoContentSourceUrl(videoContentSourceUrl: String) {
      cdkBuilder.videoContentSourceUrl(videoContentSourceUrl)
    }

    public fun build(): software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps,
  ) : CdkObject(cdkObject), CfnPlaybackConfigurationProps {
    /**
     * The URL for the ad decision server (ADS).
     *
     * This includes the specification of static parameters and placeholders for dynamic parameters.
     * AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as needed
     * when calling the ADS. Alternately, for testing you can provide a static VAST URL. The maximum
     * length is 25,000 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-addecisionserverurl)
     */
    override fun adDecisionServerUrl(): String = unwrap(this).getAdDecisionServerUrl()

    /**
     * The configuration for avail suppression, also known as ad suppression.
     *
     * For more information about ad suppression, see [Ad
     * Suppression](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-availsuppression)
     */
    override fun availSuppression(): Any? = unwrap(this).getAvailSuppression()

    /**
     * The configuration for bumpers.
     *
     * Bumpers are short audio or video clips that play at the start or before the end of an ad
     * break. To learn more about bumpers, see
     * [Bumpers](https://docs.aws.amazon.com/mediatailor/latest/ug/bumpers.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-bumper)
     */
    override fun bumper(): Any? = unwrap(this).getBumper()

    /**
     * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for
     * content and ad segment management.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-cdnconfiguration)
     */
    override fun cdnConfiguration(): Any? = unwrap(this).getCdnConfiguration()

    /**
     * The player parameters and aliases used as dynamic variables during session initialization.
     *
     * For more information, see [Domain
     * Variables](https://docs.aws.amazon.com/mediatailor/latest/ug/variables-domain.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-configurationaliases)
     */
    override fun configurationAliases(): Any? = unwrap(this).getConfigurationAliases()

    /**
     * The configuration for a DASH source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-dashconfiguration)
     */
    override fun dashConfiguration(): Any? = unwrap(this).getDashConfiguration()

    /**
     * The configuration for HLS content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-hlsconfiguration)
     */
    override fun hlsConfiguration(): Any? = unwrap(this).getHlsConfiguration()

    /**
     * The configuration for pre-roll ad insertion.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-liveprerollconfiguration)
     */
    override fun livePreRollConfiguration(): Any? = unwrap(this).getLivePreRollConfiguration()

    /**
     * The configuration for manifest processing rules.
     *
     * Manifest processing rules enable customization of the personalized manifests created by
     * MediaTailor.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-manifestprocessingrules)
     */
    override fun manifestProcessingRules(): Any? = unwrap(this).getManifestProcessingRules()

    /**
     * The identifier for the playback configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Defines the maximum duration of underfilled ad time (in seconds) allowed in an ad break.
     *
     * If the duration of underfilled ad time exceeds the personalization threshold, then the
     * personalization of the ad break is abandoned and the underlying content is shown. This feature
     * applies to *ad replacement* in live and VOD streams, rather than ad insertion, because it relies
     * on an underlying content stream. For more information about ad break behavior, including ad
     * replacement and insertion, see [Ad Behavior in AWS Elemental
     * MediaTailor](https://docs.aws.amazon.com/mediatailor/latest/ug/ad-behavior.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-personalizationthresholdseconds)
     */
    override fun personalizationThresholdSeconds(): Number? =
        unwrap(this).getPersonalizationThresholdSeconds()

    /**
     * The URL for a video asset to transcode and use to fill in time that's not used by ads.
     *
     * AWS Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the
     * slate is optional for non-VPAID playback configurations. For VPAID, the slate is required
     * because MediaTailor provides it in the slots designated for dynamic ad content. The slate must
     * be a high-quality asset that contains both audio and video.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-slateadurl)
     */
    override fun slateAdUrl(): String? = unwrap(this).getSlateAdUrl()

    /**
     * The tags to assign to the playback configuration.
     *
     * Tags are key-value pairs that you can associate with Amazon resources to help with
     * organization, access control, and cost tracking. For more information, see [Tagging AWS
     * Elemental MediaTailor Resources](https://docs.aws.amazon.com/mediatailor/latest/ug/tagging.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name that is used to associate this playback configuration with a custom transcode
     * profile.
     *
     * This overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have
     * already set up custom profiles with the help of AWS Support.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-transcodeprofilename)
     */
    override fun transcodeProfileName(): String? = unwrap(this).getTranscodeProfileName()

    /**
     * The URL prefix for the parent manifest for the stream, minus the asset ID.
     *
     * The maximum length is 512 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-playbackconfiguration.html#cfn-mediatailor-playbackconfiguration-videocontentsourceurl)
     */
    override fun videoContentSourceUrl(): String = unwrap(this).getVideoContentSourceUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPlaybackConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps):
        CfnPlaybackConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPlaybackConfigurationProps):
        software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.mediatailor.CfnPlaybackConfigurationProps
  }
}
