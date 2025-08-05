@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnOriginEndpoint`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
 * CfnOriginEndpointProps cfnOriginEndpointProps = CfnOriginEndpointProps.builder()
 * .channelGroupName("channelGroupName")
 * .channelName("channelName")
 * .containerType("containerType")
 * .originEndpointName("originEndpointName")
 * // the properties below are optional
 * .dashManifests(List.of(DashManifestConfigurationProperty.builder()
 * .manifestName("manifestName")
 * // the properties below are optional
 * .baseUrls(List.of(DashBaseUrlProperty.builder()
 * .url("url")
 * // the properties below are optional
 * .dvbPriority(123)
 * .dvbWeight(123)
 * .serviceLocation("serviceLocation")
 * .build()))
 * .compactness("compactness")
 * .drmSignaling("drmSignaling")
 * .dvbSettings(DashDvbSettingsProperty.builder()
 * .errorMetrics(List.of(DashDvbMetricsReportingProperty.builder()
 * .reportingUrl("reportingUrl")
 * // the properties below are optional
 * .probability(123)
 * .build()))
 * .fontDownload(DashDvbFontDownloadProperty.builder()
 * .fontFamily("fontFamily")
 * .mimeType("mimeType")
 * .url("url")
 * .build())
 * .build())
 * .filterConfiguration(FilterConfigurationProperty.builder()
 * .clipStartTime("clipStartTime")
 * .end("end")
 * .manifestFilter("manifestFilter")
 * .start("start")
 * .timeDelaySeconds(123)
 * .build())
 * .manifestWindowSeconds(123)
 * .minBufferTimeSeconds(123)
 * .minUpdatePeriodSeconds(123)
 * .periodTriggers(List.of("periodTriggers"))
 * .profiles(List.of("profiles"))
 * .programInformation(DashProgramInformationProperty.builder()
 * .copyright("copyright")
 * .languageCode("languageCode")
 * .moreInformationUrl("moreInformationUrl")
 * .source("source")
 * .title("title")
 * .build())
 * .scteDash(ScteDashProperty.builder()
 * .adMarkerDash("adMarkerDash")
 * .build())
 * .segmentTemplateFormat("segmentTemplateFormat")
 * .subtitleConfiguration(DashSubtitleConfigurationProperty.builder()
 * .ttmlConfiguration(DashTtmlConfigurationProperty.builder()
 * .ttmlProfile("ttmlProfile")
 * .build())
 * .build())
 * .suggestedPresentationDelaySeconds(123)
 * .utcTiming(DashUtcTimingProperty.builder()
 * .timingMode("timingMode")
 * .timingSource("timingSource")
 * .build())
 * .build()))
 * .description("description")
 * .forceEndpointErrorConfiguration(ForceEndpointErrorConfigurationProperty.builder()
 * .endpointErrorConditions(List.of("endpointErrorConditions"))
 * .build())
 * .hlsManifests(List.of(HlsManifestConfigurationProperty.builder()
 * .manifestName("manifestName")
 * // the properties below are optional
 * .childManifestName("childManifestName")
 * .filterConfiguration(FilterConfigurationProperty.builder()
 * .clipStartTime("clipStartTime")
 * .end("end")
 * .manifestFilter("manifestFilter")
 * .start("start")
 * .timeDelaySeconds(123)
 * .build())
 * .manifestWindowSeconds(123)
 * .programDateTimeIntervalSeconds(123)
 * .scteHls(ScteHlsProperty.builder()
 * .adMarkerHls("adMarkerHls")
 * .build())
 * .startTag(StartTagProperty.builder()
 * .timeOffset(123)
 * // the properties below are optional
 * .precise(false)
 * .build())
 * .url("url")
 * .urlEncodeChildManifest(false)
 * .build()))
 * .lowLatencyHlsManifests(List.of(LowLatencyHlsManifestConfigurationProperty.builder()
 * .manifestName("manifestName")
 * // the properties below are optional
 * .childManifestName("childManifestName")
 * .filterConfiguration(FilterConfigurationProperty.builder()
 * .clipStartTime("clipStartTime")
 * .end("end")
 * .manifestFilter("manifestFilter")
 * .start("start")
 * .timeDelaySeconds(123)
 * .build())
 * .manifestWindowSeconds(123)
 * .programDateTimeIntervalSeconds(123)
 * .scteHls(ScteHlsProperty.builder()
 * .adMarkerHls("adMarkerHls")
 * .build())
 * .startTag(StartTagProperty.builder()
 * .timeOffset(123)
 * // the properties below are optional
 * .precise(false)
 * .build())
 * .url("url")
 * .urlEncodeChildManifest(false)
 * .build()))
 * .segment(SegmentProperty.builder()
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
 * .build())
 * .startoverWindowSeconds(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html)
 */
public interface CfnOriginEndpointProps {
  /**
   * The name of the channel group associated with the origin endpoint configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-channelgroupname)
   */
  public fun channelGroupName(): String

  /**
   * The channel name associated with the origin endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-channelname)
   */
  public fun channelName(): String

  /**
   * The container type associated with the origin endpoint configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-containertype)
   */
  public fun containerType(): String

  /**
   * A DASH manifest configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-dashmanifests)
   */
  public fun dashManifests(): Any? = unwrap(this).getDashManifests()

  /**
   * The description associated with the origin endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The failover settings for the endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-forceendpointerrorconfiguration)
   */
  public fun forceEndpointErrorConfiguration(): Any? =
      unwrap(this).getForceEndpointErrorConfiguration()

  /**
   * The HLS manifests associated with the origin endpoint configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-hlsmanifests)
   */
  public fun hlsManifests(): Any? = unwrap(this).getHlsManifests()

  /**
   * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifests)
   */
  public fun lowLatencyHlsManifests(): Any? = unwrap(this).getLowLatencyHlsManifests()

  /**
   * The name of the origin endpoint associated with the origin endpoint configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-originendpointname)
   */
  public fun originEndpointName(): String

  /**
   * The segment associated with the origin endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-segment)
   */
  public fun segment(): Any? = unwrap(this).getSegment()

  /**
   * The size of the window (in seconds) to specify a window of the live stream that's available for
   * on-demand viewing.
   *
   * Viewers can start-over or catch-up on content that falls within the window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-startoverwindowseconds)
   */
  public fun startoverWindowSeconds(): Number? = unwrap(this).getStartoverWindowSeconds()

  /**
   * The tags associated with the origin endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnOriginEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param channelGroupName The name of the channel group associated with the origin endpoint
     * configuration. 
     */
    public fun channelGroupName(channelGroupName: String)

    /**
     * @param channelName The channel name associated with the origin endpoint. 
     */
    public fun channelName(channelName: String)

    /**
     * @param containerType The container type associated with the origin endpoint configuration. 
     */
    public fun containerType(containerType: String)

    /**
     * @param dashManifests A DASH manifest configuration.
     */
    public fun dashManifests(dashManifests: IResolvable)

    /**
     * @param dashManifests A DASH manifest configuration.
     */
    public fun dashManifests(dashManifests: List<Any>)

    /**
     * @param dashManifests A DASH manifest configuration.
     */
    public fun dashManifests(vararg dashManifests: Any)

    /**
     * @param description The description associated with the origin endpoint.
     */
    public fun description(description: String)

    /**
     * @param forceEndpointErrorConfiguration The failover settings for the endpoint.
     */
    public fun forceEndpointErrorConfiguration(forceEndpointErrorConfiguration: IResolvable)

    /**
     * @param forceEndpointErrorConfiguration The failover settings for the endpoint.
     */
    public
        fun forceEndpointErrorConfiguration(forceEndpointErrorConfiguration: CfnOriginEndpoint.ForceEndpointErrorConfigurationProperty)

    /**
     * @param forceEndpointErrorConfiguration The failover settings for the endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c860eeca035db7ada9cfea1747ec40f43d4a9093396800a7d6cbcb1de92bd6d")
    public
        fun forceEndpointErrorConfiguration(forceEndpointErrorConfiguration: CfnOriginEndpoint.ForceEndpointErrorConfigurationProperty.Builder.() -> Unit)

    /**
     * @param hlsManifests The HLS manifests associated with the origin endpoint configuration.
     */
    public fun hlsManifests(hlsManifests: IResolvable)

    /**
     * @param hlsManifests The HLS manifests associated with the origin endpoint configuration.
     */
    public fun hlsManifests(hlsManifests: List<Any>)

    /**
     * @param hlsManifests The HLS manifests associated with the origin endpoint configuration.
     */
    public fun hlsManifests(vararg hlsManifests: Any)

    /**
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint.
     */
    public fun lowLatencyHlsManifests(lowLatencyHlsManifests: IResolvable)

    /**
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint.
     */
    public fun lowLatencyHlsManifests(lowLatencyHlsManifests: List<Any>)

    /**
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint.
     */
    public fun lowLatencyHlsManifests(vararg lowLatencyHlsManifests: Any)

    /**
     * @param originEndpointName The name of the origin endpoint associated with the origin endpoint
     * configuration. 
     */
    public fun originEndpointName(originEndpointName: String)

    /**
     * @param segment The segment associated with the origin endpoint.
     */
    public fun segment(segment: IResolvable)

    /**
     * @param segment The segment associated with the origin endpoint.
     */
    public fun segment(segment: CfnOriginEndpoint.SegmentProperty)

    /**
     * @param segment The segment associated with the origin endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e86ee5ecc961c4823782530ff9a2084097eff49277f28780bb7e9644d58774b4")
    public fun segment(segment: CfnOriginEndpoint.SegmentProperty.Builder.() -> Unit)

    /**
     * @param startoverWindowSeconds The size of the window (in seconds) to specify a window of the
     * live stream that's available for on-demand viewing.
     * Viewers can start-over or catch-up on content that falls within the window.
     */
    public fun startoverWindowSeconds(startoverWindowSeconds: Number)

    /**
     * @param tags The tags associated with the origin endpoint.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags associated with the origin endpoint.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps.Builder =
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps.builder()

    /**
     * @param channelGroupName The name of the channel group associated with the origin endpoint
     * configuration. 
     */
    override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    /**
     * @param channelName The channel name associated with the origin endpoint. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * @param containerType The container type associated with the origin endpoint configuration. 
     */
    override fun containerType(containerType: String) {
      cdkBuilder.containerType(containerType)
    }

    /**
     * @param dashManifests A DASH manifest configuration.
     */
    override fun dashManifests(dashManifests: IResolvable) {
      cdkBuilder.dashManifests(dashManifests.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dashManifests A DASH manifest configuration.
     */
    override fun dashManifests(dashManifests: List<Any>) {
      cdkBuilder.dashManifests(dashManifests.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param dashManifests A DASH manifest configuration.
     */
    override fun dashManifests(vararg dashManifests: Any): Unit =
        dashManifests(dashManifests.toList())

    /**
     * @param description The description associated with the origin endpoint.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param forceEndpointErrorConfiguration The failover settings for the endpoint.
     */
    override fun forceEndpointErrorConfiguration(forceEndpointErrorConfiguration: IResolvable) {
      cdkBuilder.forceEndpointErrorConfiguration(forceEndpointErrorConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param forceEndpointErrorConfiguration The failover settings for the endpoint.
     */
    override
        fun forceEndpointErrorConfiguration(forceEndpointErrorConfiguration: CfnOriginEndpoint.ForceEndpointErrorConfigurationProperty) {
      cdkBuilder.forceEndpointErrorConfiguration(forceEndpointErrorConfiguration.let(CfnOriginEndpoint.ForceEndpointErrorConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param forceEndpointErrorConfiguration The failover settings for the endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c860eeca035db7ada9cfea1747ec40f43d4a9093396800a7d6cbcb1de92bd6d")
    override
        fun forceEndpointErrorConfiguration(forceEndpointErrorConfiguration: CfnOriginEndpoint.ForceEndpointErrorConfigurationProperty.Builder.() -> Unit):
        Unit =
        forceEndpointErrorConfiguration(CfnOriginEndpoint.ForceEndpointErrorConfigurationProperty(forceEndpointErrorConfiguration))

    /**
     * @param hlsManifests The HLS manifests associated with the origin endpoint configuration.
     */
    override fun hlsManifests(hlsManifests: IResolvable) {
      cdkBuilder.hlsManifests(hlsManifests.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param hlsManifests The HLS manifests associated with the origin endpoint configuration.
     */
    override fun hlsManifests(hlsManifests: List<Any>) {
      cdkBuilder.hlsManifests(hlsManifests.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param hlsManifests The HLS manifests associated with the origin endpoint configuration.
     */
    override fun hlsManifests(vararg hlsManifests: Any): Unit = hlsManifests(hlsManifests.toList())

    /**
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint.
     */
    override fun lowLatencyHlsManifests(lowLatencyHlsManifests: IResolvable) {
      cdkBuilder.lowLatencyHlsManifests(lowLatencyHlsManifests.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint.
     */
    override fun lowLatencyHlsManifests(lowLatencyHlsManifests: List<Any>) {
      cdkBuilder.lowLatencyHlsManifests(lowLatencyHlsManifests.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint.
     */
    override fun lowLatencyHlsManifests(vararg lowLatencyHlsManifests: Any): Unit =
        lowLatencyHlsManifests(lowLatencyHlsManifests.toList())

    /**
     * @param originEndpointName The name of the origin endpoint associated with the origin endpoint
     * configuration. 
     */
    override fun originEndpointName(originEndpointName: String) {
      cdkBuilder.originEndpointName(originEndpointName)
    }

    /**
     * @param segment The segment associated with the origin endpoint.
     */
    override fun segment(segment: IResolvable) {
      cdkBuilder.segment(segment.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param segment The segment associated with the origin endpoint.
     */
    override fun segment(segment: CfnOriginEndpoint.SegmentProperty) {
      cdkBuilder.segment(segment.let(CfnOriginEndpoint.SegmentProperty.Companion::unwrap))
    }

    /**
     * @param segment The segment associated with the origin endpoint.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e86ee5ecc961c4823782530ff9a2084097eff49277f28780bb7e9644d58774b4")
    override fun segment(segment: CfnOriginEndpoint.SegmentProperty.Builder.() -> Unit): Unit =
        segment(CfnOriginEndpoint.SegmentProperty(segment))

    /**
     * @param startoverWindowSeconds The size of the window (in seconds) to specify a window of the
     * live stream that's available for on-demand viewing.
     * Viewers can start-over or catch-up on content that falls within the window.
     */
    override fun startoverWindowSeconds(startoverWindowSeconds: Number) {
      cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
    }

    /**
     * @param tags The tags associated with the origin endpoint.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags associated with the origin endpoint.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps,
  ) : CdkObject(cdkObject),
      CfnOriginEndpointProps {
    /**
     * The name of the channel group associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-channelgroupname)
     */
    override fun channelGroupName(): String = unwrap(this).getChannelGroupName()

    /**
     * The channel name associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-channelname)
     */
    override fun channelName(): String = unwrap(this).getChannelName()

    /**
     * The container type associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-containertype)
     */
    override fun containerType(): String = unwrap(this).getContainerType()

    /**
     * A DASH manifest configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-dashmanifests)
     */
    override fun dashManifests(): Any? = unwrap(this).getDashManifests()

    /**
     * The description associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The failover settings for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-forceendpointerrorconfiguration)
     */
    override fun forceEndpointErrorConfiguration(): Any? =
        unwrap(this).getForceEndpointErrorConfiguration()

    /**
     * The HLS manifests associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-hlsmanifests)
     */
    override fun hlsManifests(): Any? = unwrap(this).getHlsManifests()

    /**
     * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifests)
     */
    override fun lowLatencyHlsManifests(): Any? = unwrap(this).getLowLatencyHlsManifests()

    /**
     * The name of the origin endpoint associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-originendpointname)
     */
    override fun originEndpointName(): String = unwrap(this).getOriginEndpointName()

    /**
     * The segment associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-segment)
     */
    override fun segment(): Any? = unwrap(this).getSegment()

    /**
     * The size of the window (in seconds) to specify a window of the live stream that's available
     * for on-demand viewing.
     *
     * Viewers can start-over or catch-up on content that falls within the window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-startoverwindowseconds)
     */
    override fun startoverWindowSeconds(): Number? = unwrap(this).getStartoverWindowSeconds()

    /**
     * The tags associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnOriginEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps):
        CfnOriginEndpointProps = CdkObjectWrappers.wrap(cdkObject) as? CfnOriginEndpointProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOriginEndpointProps):
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps
  }
}
