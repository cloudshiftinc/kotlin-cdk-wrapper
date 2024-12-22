@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies the configuration parameters for a MediaPackage V2 origin endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
 * CfnOriginEndpoint cfnOriginEndpoint = CfnOriginEndpoint.Builder.create(this,
 * "MyCfnOriginEndpoint")
 * .channelGroupName("channelGroupName")
 * .channelName("channelName")
 * .containerType("containerType")
 * .originEndpointName("originEndpointName")
 * // the properties below are optional
 * .dashManifests(List.of(DashManifestConfigurationProperty.builder()
 * .manifestName("manifestName")
 * // the properties below are optional
 * .drmSignaling("drmSignaling")
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
 * .scteDash(ScteDashProperty.builder()
 * .adMarkerDash("adMarkerDash")
 * .build())
 * .segmentTemplateFormat("segmentTemplateFormat")
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
public open class CfnOriginEndpoint(
  cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOriginEndpointProps,
  ) :
      this(software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnOriginEndpointProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnOriginEndpointProps.Builder.() -> Unit,
  ) : this(scope, id, CfnOriginEndpointProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the origin endpoint.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The timestamp of the creation of the origin endpoint.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   *
   */
  public open fun attrDashManifestUrls(): List<String> = unwrap(this).getAttrDashManifestUrls()

  /**
   *
   */
  public open fun attrHlsManifestUrls(): List<String> = unwrap(this).getAttrHlsManifestUrls()

  /**
   *
   */
  public open fun attrLowLatencyHlsManifestUrls(): List<String> =
      unwrap(this).getAttrLowLatencyHlsManifestUrls()

  /**
   * The timestamp of the modification of the origin endpoint.
   */
  public open fun attrModifiedAt(): String = unwrap(this).getAttrModifiedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The name of the channel group associated with the origin endpoint configuration.
   */
  public open fun channelGroupName(): String = unwrap(this).getChannelGroupName()

  /**
   * The name of the channel group associated with the origin endpoint configuration.
   */
  public open fun channelGroupName(`value`: String) {
    unwrap(this).setChannelGroupName(`value`)
  }

  /**
   * The channel name associated with the origin endpoint.
   */
  public open fun channelName(): String = unwrap(this).getChannelName()

  /**
   * The channel name associated with the origin endpoint.
   */
  public open fun channelName(`value`: String) {
    unwrap(this).setChannelName(`value`)
  }

  /**
   * The container type associated with the origin endpoint configuration.
   */
  public open fun containerType(): String = unwrap(this).getContainerType()

  /**
   * The container type associated with the origin endpoint configuration.
   */
  public open fun containerType(`value`: String) {
    unwrap(this).setContainerType(`value`)
  }

  /**
   * A DASH manifest configuration.
   */
  public open fun dashManifests(): Any? = unwrap(this).getDashManifests()

  /**
   * A DASH manifest configuration.
   */
  public open fun dashManifests(`value`: IResolvable) {
    unwrap(this).setDashManifests(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A DASH manifest configuration.
   */
  public open fun dashManifests(`value`: List<Any>) {
    unwrap(this).setDashManifests(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A DASH manifest configuration.
   */
  public open fun dashManifests(vararg `value`: Any): Unit = dashManifests(`value`.toList())

  /**
   * The description associated with the origin endpoint.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description associated with the origin endpoint.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The failover settings for the endpoint.
   */
  public open fun forceEndpointErrorConfiguration(): Any? =
      unwrap(this).getForceEndpointErrorConfiguration()

  /**
   * The failover settings for the endpoint.
   */
  public open fun forceEndpointErrorConfiguration(`value`: IResolvable) {
    unwrap(this).setForceEndpointErrorConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The failover settings for the endpoint.
   */
  public open
      fun forceEndpointErrorConfiguration(`value`: ForceEndpointErrorConfigurationProperty) {
    unwrap(this).setForceEndpointErrorConfiguration(`value`.let(ForceEndpointErrorConfigurationProperty.Companion::unwrap))
  }

  /**
   * The failover settings for the endpoint.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("31efe0d6dc69efb78649f668db1822360bf376011260ada8302631686204eeee")
  public open
      fun forceEndpointErrorConfiguration(`value`: ForceEndpointErrorConfigurationProperty.Builder.() -> Unit):
      Unit = forceEndpointErrorConfiguration(ForceEndpointErrorConfigurationProperty(`value`))

  /**
   * The HLS manfiests associated with the origin endpoint configuration.
   */
  public open fun hlsManifests(): Any? = unwrap(this).getHlsManifests()

  /**
   * The HLS manfiests associated with the origin endpoint configuration.
   */
  public open fun hlsManifests(`value`: IResolvable) {
    unwrap(this).setHlsManifests(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The HLS manfiests associated with the origin endpoint configuration.
   */
  public open fun hlsManifests(`value`: List<Any>) {
    unwrap(this).setHlsManifests(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The HLS manfiests associated with the origin endpoint configuration.
   */
  public open fun hlsManifests(vararg `value`: Any): Unit = hlsManifests(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
   */
  public open fun lowLatencyHlsManifests(): Any? = unwrap(this).getLowLatencyHlsManifests()

  /**
   * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
   */
  public open fun lowLatencyHlsManifests(`value`: IResolvable) {
    unwrap(this).setLowLatencyHlsManifests(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
   */
  public open fun lowLatencyHlsManifests(`value`: List<Any>) {
    unwrap(this).setLowLatencyHlsManifests(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
   */
  public open fun lowLatencyHlsManifests(vararg `value`: Any): Unit =
      lowLatencyHlsManifests(`value`.toList())

  /**
   * The name of the origin endpoint associated with the origin endpoint configuration.
   */
  public open fun originEndpointName(): String = unwrap(this).getOriginEndpointName()

  /**
   * The name of the origin endpoint associated with the origin endpoint configuration.
   */
  public open fun originEndpointName(`value`: String) {
    unwrap(this).setOriginEndpointName(`value`)
  }

  /**
   * The segment associated with the origin endpoint.
   */
  public open fun segment(): Any? = unwrap(this).getSegment()

  /**
   * The segment associated with the origin endpoint.
   */
  public open fun segment(`value`: IResolvable) {
    unwrap(this).setSegment(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The segment associated with the origin endpoint.
   */
  public open fun segment(`value`: SegmentProperty) {
    unwrap(this).setSegment(`value`.let(SegmentProperty.Companion::unwrap))
  }

  /**
   * The segment associated with the origin endpoint.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0030fa27f15fd8266644709d437fc7ddb95acd4ef255e7f4fb9e8ea963b56a09")
  public open fun segment(`value`: SegmentProperty.Builder.() -> Unit): Unit =
      segment(SegmentProperty(`value`))

  /**
   * The size of the window (in seconds) to specify a window of the live stream that's available for
   * on-demand viewing.
   */
  public open fun startoverWindowSeconds(): Number? = unwrap(this).getStartoverWindowSeconds()

  /**
   * The size of the window (in seconds) to specify a window of the live stream that's available for
   * on-demand viewing.
   */
  public open fun startoverWindowSeconds(`value`: Number) {
    unwrap(this).setStartoverWindowSeconds(`value`)
  }

  /**
   * The tags associated with the origin endpoint.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags associated with the origin endpoint.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags associated with the origin endpoint.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediapackagev2.CfnOriginEndpoint].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the channel group associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-channelgroupname)
     * @param channelGroupName The name of the channel group associated with the origin endpoint
     * configuration. 
     */
    public fun channelGroupName(channelGroupName: String)

    /**
     * The channel name associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-channelname)
     * @param channelName The channel name associated with the origin endpoint. 
     */
    public fun channelName(channelName: String)

    /**
     * The container type associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-containertype)
     * @param containerType The container type associated with the origin endpoint configuration. 
     */
    public fun containerType(containerType: String)

    /**
     * A DASH manifest configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-dashmanifests)
     * @param dashManifests A DASH manifest configuration. 
     */
    public fun dashManifests(dashManifests: IResolvable)

    /**
     * A DASH manifest configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-dashmanifests)
     * @param dashManifests A DASH manifest configuration. 
     */
    public fun dashManifests(dashManifests: List<Any>)

    /**
     * A DASH manifest configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-dashmanifests)
     * @param dashManifests A DASH manifest configuration. 
     */
    public fun dashManifests(vararg dashManifests: Any)

    /**
     * The description associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-description)
     * @param description The description associated with the origin endpoint. 
     */
    public fun description(description: String)

    /**
     * The failover settings for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-forceendpointerrorconfiguration)
     * @param forceEndpointErrorConfiguration The failover settings for the endpoint. 
     */
    public fun forceEndpointErrorConfiguration(forceEndpointErrorConfiguration: IResolvable)

    /**
     * The failover settings for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-forceendpointerrorconfiguration)
     * @param forceEndpointErrorConfiguration The failover settings for the endpoint. 
     */
    public
        fun forceEndpointErrorConfiguration(forceEndpointErrorConfiguration: ForceEndpointErrorConfigurationProperty)

    /**
     * The failover settings for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-forceendpointerrorconfiguration)
     * @param forceEndpointErrorConfiguration The failover settings for the endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("947eff8aee5de70bb9564e9bc4a915d63ba9ee4b0b2819652b4b9065b300679d")
    public
        fun forceEndpointErrorConfiguration(forceEndpointErrorConfiguration: ForceEndpointErrorConfigurationProperty.Builder.() -> Unit)

    /**
     * The HLS manfiests associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-hlsmanifests)
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration. 
     */
    public fun hlsManifests(hlsManifests: IResolvable)

    /**
     * The HLS manfiests associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-hlsmanifests)
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration. 
     */
    public fun hlsManifests(hlsManifests: List<Any>)

    /**
     * The HLS manfiests associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-hlsmanifests)
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration. 
     */
    public fun hlsManifests(vararg hlsManifests: Any)

    /**
     * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifests)
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint. 
     */
    public fun lowLatencyHlsManifests(lowLatencyHlsManifests: IResolvable)

    /**
     * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifests)
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint. 
     */
    public fun lowLatencyHlsManifests(lowLatencyHlsManifests: List<Any>)

    /**
     * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifests)
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint. 
     */
    public fun lowLatencyHlsManifests(vararg lowLatencyHlsManifests: Any)

    /**
     * The name of the origin endpoint associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-originendpointname)
     * @param originEndpointName The name of the origin endpoint associated with the origin endpoint
     * configuration. 
     */
    public fun originEndpointName(originEndpointName: String)

    /**
     * The segment associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-segment)
     * @param segment The segment associated with the origin endpoint. 
     */
    public fun segment(segment: IResolvable)

    /**
     * The segment associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-segment)
     * @param segment The segment associated with the origin endpoint. 
     */
    public fun segment(segment: SegmentProperty)

    /**
     * The segment associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-segment)
     * @param segment The segment associated with the origin endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("888ca8fa0dfe89a1ccb17471efd9347cbeec41d418f2679feca29c30421aa053")
    public fun segment(segment: SegmentProperty.Builder.() -> Unit)

    /**
     * The size of the window (in seconds) to specify a window of the live stream that's available
     * for on-demand viewing.
     *
     * Viewers can start-over or catch-up on content that falls within the window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-startoverwindowseconds)
     * @param startoverWindowSeconds The size of the window (in seconds) to specify a window of the
     * live stream that's available for on-demand viewing. 
     */
    public fun startoverWindowSeconds(startoverWindowSeconds: Number)

    /**
     * The tags associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-tags)
     * @param tags The tags associated with the origin endpoint. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-tags)
     * @param tags The tags associated with the origin endpoint. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.Builder
        = software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.Builder.create(scope, id)

    /**
     * The name of the channel group associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-channelgroupname)
     * @param channelGroupName The name of the channel group associated with the origin endpoint
     * configuration. 
     */
    override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    /**
     * The channel name associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-channelname)
     * @param channelName The channel name associated with the origin endpoint. 
     */
    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    /**
     * The container type associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-containertype)
     * @param containerType The container type associated with the origin endpoint configuration. 
     */
    override fun containerType(containerType: String) {
      cdkBuilder.containerType(containerType)
    }

    /**
     * A DASH manifest configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-dashmanifests)
     * @param dashManifests A DASH manifest configuration. 
     */
    override fun dashManifests(dashManifests: IResolvable) {
      cdkBuilder.dashManifests(dashManifests.let(IResolvable.Companion::unwrap))
    }

    /**
     * A DASH manifest configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-dashmanifests)
     * @param dashManifests A DASH manifest configuration. 
     */
    override fun dashManifests(dashManifests: List<Any>) {
      cdkBuilder.dashManifests(dashManifests.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A DASH manifest configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-dashmanifests)
     * @param dashManifests A DASH manifest configuration. 
     */
    override fun dashManifests(vararg dashManifests: Any): Unit =
        dashManifests(dashManifests.toList())

    /**
     * The description associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-description)
     * @param description The description associated with the origin endpoint. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The failover settings for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-forceendpointerrorconfiguration)
     * @param forceEndpointErrorConfiguration The failover settings for the endpoint. 
     */
    override fun forceEndpointErrorConfiguration(forceEndpointErrorConfiguration: IResolvable) {
      cdkBuilder.forceEndpointErrorConfiguration(forceEndpointErrorConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * The failover settings for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-forceendpointerrorconfiguration)
     * @param forceEndpointErrorConfiguration The failover settings for the endpoint. 
     */
    override
        fun forceEndpointErrorConfiguration(forceEndpointErrorConfiguration: ForceEndpointErrorConfigurationProperty) {
      cdkBuilder.forceEndpointErrorConfiguration(forceEndpointErrorConfiguration.let(ForceEndpointErrorConfigurationProperty.Companion::unwrap))
    }

    /**
     * The failover settings for the endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-forceendpointerrorconfiguration)
     * @param forceEndpointErrorConfiguration The failover settings for the endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("947eff8aee5de70bb9564e9bc4a915d63ba9ee4b0b2819652b4b9065b300679d")
    override
        fun forceEndpointErrorConfiguration(forceEndpointErrorConfiguration: ForceEndpointErrorConfigurationProperty.Builder.() -> Unit):
        Unit =
        forceEndpointErrorConfiguration(ForceEndpointErrorConfigurationProperty(forceEndpointErrorConfiguration))

    /**
     * The HLS manfiests associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-hlsmanifests)
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration. 
     */
    override fun hlsManifests(hlsManifests: IResolvable) {
      cdkBuilder.hlsManifests(hlsManifests.let(IResolvable.Companion::unwrap))
    }

    /**
     * The HLS manfiests associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-hlsmanifests)
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration. 
     */
    override fun hlsManifests(hlsManifests: List<Any>) {
      cdkBuilder.hlsManifests(hlsManifests.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The HLS manfiests associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-hlsmanifests)
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration. 
     */
    override fun hlsManifests(vararg hlsManifests: Any): Unit = hlsManifests(hlsManifests.toList())

    /**
     * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifests)
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint. 
     */
    override fun lowLatencyHlsManifests(lowLatencyHlsManifests: IResolvable) {
      cdkBuilder.lowLatencyHlsManifests(lowLatencyHlsManifests.let(IResolvable.Companion::unwrap))
    }

    /**
     * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifests)
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint. 
     */
    override fun lowLatencyHlsManifests(lowLatencyHlsManifests: List<Any>) {
      cdkBuilder.lowLatencyHlsManifests(lowLatencyHlsManifests.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifests)
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint. 
     */
    override fun lowLatencyHlsManifests(vararg lowLatencyHlsManifests: Any): Unit =
        lowLatencyHlsManifests(lowLatencyHlsManifests.toList())

    /**
     * The name of the origin endpoint associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-originendpointname)
     * @param originEndpointName The name of the origin endpoint associated with the origin endpoint
     * configuration. 
     */
    override fun originEndpointName(originEndpointName: String) {
      cdkBuilder.originEndpointName(originEndpointName)
    }

    /**
     * The segment associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-segment)
     * @param segment The segment associated with the origin endpoint. 
     */
    override fun segment(segment: IResolvable) {
      cdkBuilder.segment(segment.let(IResolvable.Companion::unwrap))
    }

    /**
     * The segment associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-segment)
     * @param segment The segment associated with the origin endpoint. 
     */
    override fun segment(segment: SegmentProperty) {
      cdkBuilder.segment(segment.let(SegmentProperty.Companion::unwrap))
    }

    /**
     * The segment associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-segment)
     * @param segment The segment associated with the origin endpoint. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("888ca8fa0dfe89a1ccb17471efd9347cbeec41d418f2679feca29c30421aa053")
    override fun segment(segment: SegmentProperty.Builder.() -> Unit): Unit =
        segment(SegmentProperty(segment))

    /**
     * The size of the window (in seconds) to specify a window of the live stream that's available
     * for on-demand viewing.
     *
     * Viewers can start-over or catch-up on content that falls within the window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-startoverwindowseconds)
     * @param startoverWindowSeconds The size of the window (in seconds) to specify a window of the
     * live stream that's available for on-demand viewing. 
     */
    override fun startoverWindowSeconds(startoverWindowSeconds: Number) {
      cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
    }

    /**
     * The tags associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-tags)
     * @param tags The tags associated with the origin endpoint. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-tags)
     * @param tags The tags associated with the origin endpoint. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnOriginEndpoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnOriginEndpoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint):
        CfnOriginEndpoint = CfnOriginEndpoint(cdkObject)

    internal fun unwrap(wrapped: CfnOriginEndpoint):
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint = wrapped.cdkObject as
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint
  }

  /**
   * Retrieve the DASH manifest configuration.</p>.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * DashManifestConfigurationProperty dashManifestConfigurationProperty =
   * DashManifestConfigurationProperty.builder()
   * .manifestName("manifestName")
   * // the properties below are optional
   * .drmSignaling("drmSignaling")
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
   * .scteDash(ScteDashProperty.builder()
   * .adMarkerDash("adMarkerDash")
   * .build())
   * .segmentTemplateFormat("segmentTemplateFormat")
   * .suggestedPresentationDelaySeconds(123)
   * .utcTiming(DashUtcTimingProperty.builder()
   * .timingMode("timingMode")
   * .timingSource("timingSource")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html)
   */
  public interface DashManifestConfigurationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-drmsignaling)
     */
    public fun drmSignaling(): String? = unwrap(this).getDrmSignaling()

    /**
     * Filter configuration includes settings for manifest filtering, start and end times, and time
     * delay that apply to all of your egress requests for this manifest.
     *
     * </p>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-filterconfiguration)
     */
    public fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

    /**
     * A short string that's appended to the endpoint URL.
     *
     * The manifest name creates a unique path to this endpoint. If you don't enter a value,
     * MediaPackage uses the default manifest name, index. </p>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-manifestname)
     */
    public fun manifestName(): String

    /**
     * The total duration (in seconds) of the manifest's content.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-manifestwindowseconds)
     */
    public fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

    /**
     * Minimum amount of content (in seconds) that a player must keep available in the buffer.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-minbuffertimeseconds)
     */
    public fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

    /**
     * Minimum amount of time (in seconds) that the player should wait before requesting updates to
     * the manifest.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-minupdateperiodseconds)
     */
    public fun minUpdatePeriodSeconds(): Number? = unwrap(this).getMinUpdatePeriodSeconds()

    /**
     * A list of triggers that controls when AWS Elemental MediaPackage separates the MPEG-DASH
     * manifest into multiple periods.
     *
     * Leave this value empty to indicate that the manifest is contained all in one period.
     * For more information about periods in the DASH manifest, see [Multi-period DASH in AWS
     * Elemental
     * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html).</p>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-periodtriggers)
     */
    public fun periodTriggers(): List<String> = unwrap(this).getPeriodTriggers() ?: emptyList()

    /**
     * The SCTE configuration.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-sctedash)
     */
    public fun scteDash(): Any? = unwrap(this).getScteDash()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-segmenttemplateformat)
     */
    public fun segmentTemplateFormat(): String? = unwrap(this).getSegmentTemplateFormat()

    /**
     * The amount of time (in seconds) that the player should be from the end of the manifest.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-suggestedpresentationdelayseconds)
     */
    public fun suggestedPresentationDelaySeconds(): Number? =
        unwrap(this).getSuggestedPresentationDelaySeconds()

    /**
     * Determines the type of UTC timing included in the DASH Media Presentation Description
     * (MPD).</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-utctiming)
     */
    public fun utcTiming(): Any? = unwrap(this).getUtcTiming()

    /**
     * A builder for [DashManifestConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param drmSignaling the value to be set.
       */
      public fun drmSignaling(drmSignaling: String)

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      public fun filterConfiguration(filterConfiguration: IResolvable)

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      public fun filterConfiguration(filterConfiguration: FilterConfigurationProperty)

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9c71597cb955dbd506744c1077ee76abd6acdc3884ce17cd2562482051335b6")
      public
          fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit)

      /**
       * @param manifestName A short string that's appended to the endpoint URL. 
       * The manifest name creates a unique path to this endpoint. If you don't enter a value,
       * MediaPackage uses the default manifest name, index. </p>
       */
      public fun manifestName(manifestName: String)

      /**
       * @param manifestWindowSeconds The total duration (in seconds) of the manifest's
       * content.</p>.
       */
      public fun manifestWindowSeconds(manifestWindowSeconds: Number)

      /**
       * @param minBufferTimeSeconds Minimum amount of content (in seconds) that a player must keep
       * available in the buffer.</p>.
       */
      public fun minBufferTimeSeconds(minBufferTimeSeconds: Number)

      /**
       * @param minUpdatePeriodSeconds Minimum amount of time (in seconds) that the player should
       * wait before requesting updates to the manifest.</p>.
       */
      public fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number)

      /**
       * @param periodTriggers A list of triggers that controls when AWS Elemental MediaPackage
       * separates the MPEG-DASH manifest into multiple periods.
       * Leave this value empty to indicate that the manifest is contained all in one period.
       * For more information about periods in the DASH manifest, see [Multi-period DASH in AWS
       * Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html).</p>
       */
      public fun periodTriggers(periodTriggers: List<String>)

      /**
       * @param periodTriggers A list of triggers that controls when AWS Elemental MediaPackage
       * separates the MPEG-DASH manifest into multiple periods.
       * Leave this value empty to indicate that the manifest is contained all in one period.
       * For more information about periods in the DASH manifest, see [Multi-period DASH in AWS
       * Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html).</p>
       */
      public fun periodTriggers(vararg periodTriggers: String)

      /**
       * @param scteDash The SCTE configuration.</p>.
       */
      public fun scteDash(scteDash: IResolvable)

      /**
       * @param scteDash The SCTE configuration.</p>.
       */
      public fun scteDash(scteDash: ScteDashProperty)

      /**
       * @param scteDash The SCTE configuration.</p>.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38790bb2dbacae4b3fd4a62c1b3a8203ea772a5c13552e23b40f72c28e14584f")
      public fun scteDash(scteDash: ScteDashProperty.Builder.() -> Unit)

      /**
       * @param segmentTemplateFormat the value to be set.
       */
      public fun segmentTemplateFormat(segmentTemplateFormat: String)

      /**
       * @param suggestedPresentationDelaySeconds The amount of time (in seconds) that the player
       * should be from the end of the manifest.</p>.
       */
      public fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number)

      /**
       * @param utcTiming Determines the type of UTC timing included in the DASH Media Presentation
       * Description (MPD).</p>.
       */
      public fun utcTiming(utcTiming: IResolvable)

      /**
       * @param utcTiming Determines the type of UTC timing included in the DASH Media Presentation
       * Description (MPD).</p>.
       */
      public fun utcTiming(utcTiming: DashUtcTimingProperty)

      /**
       * @param utcTiming Determines the type of UTC timing included in the DASH Media Presentation
       * Description (MPD).</p>.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7fc2a5e9905d25d702d76df25aa6f17a90741e74417f395d514442fb4e389b3")
      public fun utcTiming(utcTiming: DashUtcTimingProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashManifestConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashManifestConfigurationProperty.builder()

      /**
       * @param drmSignaling the value to be set.
       */
      override fun drmSignaling(drmSignaling: String) {
        cdkBuilder.drmSignaling(drmSignaling)
      }

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      override fun filterConfiguration(filterConfiguration: IResolvable) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      override fun filterConfiguration(filterConfiguration: FilterConfigurationProperty) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(FilterConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9c71597cb955dbd506744c1077ee76abd6acdc3884ce17cd2562482051335b6")
      override
          fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit):
          Unit = filterConfiguration(FilterConfigurationProperty(filterConfiguration))

      /**
       * @param manifestName A short string that's appended to the endpoint URL. 
       * The manifest name creates a unique path to this endpoint. If you don't enter a value,
       * MediaPackage uses the default manifest name, index. </p>
       */
      override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      /**
       * @param manifestWindowSeconds The total duration (in seconds) of the manifest's
       * content.</p>.
       */
      override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      /**
       * @param minBufferTimeSeconds Minimum amount of content (in seconds) that a player must keep
       * available in the buffer.</p>.
       */
      override fun minBufferTimeSeconds(minBufferTimeSeconds: Number) {
        cdkBuilder.minBufferTimeSeconds(minBufferTimeSeconds)
      }

      /**
       * @param minUpdatePeriodSeconds Minimum amount of time (in seconds) that the player should
       * wait before requesting updates to the manifest.</p>.
       */
      override fun minUpdatePeriodSeconds(minUpdatePeriodSeconds: Number) {
        cdkBuilder.minUpdatePeriodSeconds(minUpdatePeriodSeconds)
      }

      /**
       * @param periodTriggers A list of triggers that controls when AWS Elemental MediaPackage
       * separates the MPEG-DASH manifest into multiple periods.
       * Leave this value empty to indicate that the manifest is contained all in one period.
       * For more information about periods in the DASH manifest, see [Multi-period DASH in AWS
       * Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html).</p>
       */
      override fun periodTriggers(periodTriggers: List<String>) {
        cdkBuilder.periodTriggers(periodTriggers)
      }

      /**
       * @param periodTriggers A list of triggers that controls when AWS Elemental MediaPackage
       * separates the MPEG-DASH manifest into multiple periods.
       * Leave this value empty to indicate that the manifest is contained all in one period.
       * For more information about periods in the DASH manifest, see [Multi-period DASH in AWS
       * Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html).</p>
       */
      override fun periodTriggers(vararg periodTriggers: String): Unit =
          periodTriggers(periodTriggers.toList())

      /**
       * @param scteDash The SCTE configuration.</p>.
       */
      override fun scteDash(scteDash: IResolvable) {
        cdkBuilder.scteDash(scteDash.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param scteDash The SCTE configuration.</p>.
       */
      override fun scteDash(scteDash: ScteDashProperty) {
        cdkBuilder.scteDash(scteDash.let(ScteDashProperty.Companion::unwrap))
      }

      /**
       * @param scteDash The SCTE configuration.</p>.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("38790bb2dbacae4b3fd4a62c1b3a8203ea772a5c13552e23b40f72c28e14584f")
      override fun scteDash(scteDash: ScteDashProperty.Builder.() -> Unit): Unit =
          scteDash(ScteDashProperty(scteDash))

      /**
       * @param segmentTemplateFormat the value to be set.
       */
      override fun segmentTemplateFormat(segmentTemplateFormat: String) {
        cdkBuilder.segmentTemplateFormat(segmentTemplateFormat)
      }

      /**
       * @param suggestedPresentationDelaySeconds The amount of time (in seconds) that the player
       * should be from the end of the manifest.</p>.
       */
      override fun suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds: Number) {
        cdkBuilder.suggestedPresentationDelaySeconds(suggestedPresentationDelaySeconds)
      }

      /**
       * @param utcTiming Determines the type of UTC timing included in the DASH Media Presentation
       * Description (MPD).</p>.
       */
      override fun utcTiming(utcTiming: IResolvable) {
        cdkBuilder.utcTiming(utcTiming.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param utcTiming Determines the type of UTC timing included in the DASH Media Presentation
       * Description (MPD).</p>.
       */
      override fun utcTiming(utcTiming: DashUtcTimingProperty) {
        cdkBuilder.utcTiming(utcTiming.let(DashUtcTimingProperty.Companion::unwrap))
      }

      /**
       * @param utcTiming Determines the type of UTC timing included in the DASH Media Presentation
       * Description (MPD).</p>.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f7fc2a5e9905d25d702d76df25aa6f17a90741e74417f395d514442fb4e389b3")
      override fun utcTiming(utcTiming: DashUtcTimingProperty.Builder.() -> Unit): Unit =
          utcTiming(DashUtcTimingProperty(utcTiming))

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashManifestConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashManifestConfigurationProperty,
    ) : CdkObject(cdkObject),
        DashManifestConfigurationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-drmsignaling)
       */
      override fun drmSignaling(): String? = unwrap(this).getDrmSignaling()

      /**
       * Filter configuration includes settings for manifest filtering, start and end times, and
       * time delay that apply to all of your egress requests for this manifest.
       *
       * </p>
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-filterconfiguration)
       */
      override fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

      /**
       * A short string that's appended to the endpoint URL.
       *
       * The manifest name creates a unique path to this endpoint. If you don't enter a value,
       * MediaPackage uses the default manifest name, index. </p>
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-manifestname)
       */
      override fun manifestName(): String = unwrap(this).getManifestName()

      /**
       * The total duration (in seconds) of the manifest's content.</p>.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-manifestwindowseconds)
       */
      override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

      /**
       * Minimum amount of content (in seconds) that a player must keep available in the
       * buffer.</p>.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-minbuffertimeseconds)
       */
      override fun minBufferTimeSeconds(): Number? = unwrap(this).getMinBufferTimeSeconds()

      /**
       * Minimum amount of time (in seconds) that the player should wait before requesting updates
       * to the manifest.</p>.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-minupdateperiodseconds)
       */
      override fun minUpdatePeriodSeconds(): Number? = unwrap(this).getMinUpdatePeriodSeconds()

      /**
       * A list of triggers that controls when AWS Elemental MediaPackage separates the MPEG-DASH
       * manifest into multiple periods.
       *
       * Leave this value empty to indicate that the manifest is contained all in one period.
       * For more information about periods in the DASH manifest, see [Multi-period DASH in AWS
       * Elemental
       * MediaPackage](https://docs.aws.amazon.com/mediapackage/latest/userguide/multi-period.html).</p>
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-periodtriggers)
       */
      override fun periodTriggers(): List<String> = unwrap(this).getPeriodTriggers() ?: emptyList()

      /**
       * The SCTE configuration.</p>.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-sctedash)
       */
      override fun scteDash(): Any? = unwrap(this).getScteDash()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-segmenttemplateformat)
       */
      override fun segmentTemplateFormat(): String? = unwrap(this).getSegmentTemplateFormat()

      /**
       * The amount of time (in seconds) that the player should be from the end of the
       * manifest.</p>.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-suggestedpresentationdelayseconds)
       */
      override fun suggestedPresentationDelaySeconds(): Number? =
          unwrap(this).getSuggestedPresentationDelaySeconds()

      /**
       * Determines the type of UTC timing included in the DASH Media Presentation Description
       * (MPD).</p>.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-dashmanifestconfiguration-utctiming)
       */
      override fun utcTiming(): Any? = unwrap(this).getUtcTiming()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DashManifestConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashManifestConfigurationProperty):
          DashManifestConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DashManifestConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashManifestConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashManifestConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashManifestConfigurationProperty
    }
  }

  /**
   * Determines the type of UTC timing included in the DASH Media Presentation Description (MPD).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * DashUtcTimingProperty dashUtcTimingProperty = DashUtcTimingProperty.builder()
   * .timingMode("timingMode")
   * .timingSource("timingSource")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashutctiming.html)
   */
  public interface DashUtcTimingProperty {
    /**
     * The UTC timing mode.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashutctiming.html#cfn-mediapackagev2-originendpoint-dashutctiming-timingmode)
     */
    public fun timingMode(): String? = unwrap(this).getTimingMode()

    /**
     * The the method that the player uses to synchronize to coordinated universal time (UTC) wall
     * clock time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashutctiming.html#cfn-mediapackagev2-originendpoint-dashutctiming-timingsource)
     */
    public fun timingSource(): String? = unwrap(this).getTimingSource()

    /**
     * A builder for [DashUtcTimingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param timingMode The UTC timing mode.
       */
      public fun timingMode(timingMode: String)

      /**
       * @param timingSource The the method that the player uses to synchronize to coordinated
       * universal time (UTC) wall clock time.
       */
      public fun timingSource(timingSource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashUtcTimingProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashUtcTimingProperty.builder()

      /**
       * @param timingMode The UTC timing mode.
       */
      override fun timingMode(timingMode: String) {
        cdkBuilder.timingMode(timingMode)
      }

      /**
       * @param timingSource The the method that the player uses to synchronize to coordinated
       * universal time (UTC) wall clock time.
       */
      override fun timingSource(timingSource: String) {
        cdkBuilder.timingSource(timingSource)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashUtcTimingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashUtcTimingProperty,
    ) : CdkObject(cdkObject),
        DashUtcTimingProperty {
      /**
       * The UTC timing mode.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashutctiming.html#cfn-mediapackagev2-originendpoint-dashutctiming-timingmode)
       */
      override fun timingMode(): String? = unwrap(this).getTimingMode()

      /**
       * The the method that the player uses to synchronize to coordinated universal time (UTC) wall
       * clock time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-dashutctiming.html#cfn-mediapackagev2-originendpoint-dashutctiming-timingsource)
       */
      override fun timingSource(): String? = unwrap(this).getTimingSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DashUtcTimingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashUtcTimingProperty):
          DashUtcTimingProperty = CdkObjectWrappers.wrap(cdkObject) as? DashUtcTimingProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DashUtcTimingProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashUtcTimingProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.DashUtcTimingProperty
    }
  }

  /**
   * Use `encryptionContractConfiguration` to configure one or more content encryption keys for your
   * endpoints that use SPEKE Version 2.0. The encryption contract defines which content keys are used
   * to encrypt the audio and video tracks in your stream. To configure the encryption contract,
   * specify which audio and video encryption presets to use.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * EncryptionContractConfigurationProperty encryptionContractConfigurationProperty =
   * EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptioncontractconfiguration.html)
   */
  public interface EncryptionContractConfigurationProperty {
    /**
     * A collection of audio encryption presets.
     *
     * Value description:
     *
     * * `PRESET-AUDIO-1` - Use one content key to encrypt all of the audio tracks in your stream.
     * * `PRESET-AUDIO-2` - Use one content key to encrypt all of the stereo audio tracks and one
     * content key to encrypt all of the multichannel audio tracks.
     * * `PRESET-AUDIO-3` - Use one content key to encrypt all of the stereo audio tracks, one
     * content key to encrypt all of the multichannel audio tracks with 3 to 6 channels, and one
     * content key to encrypt all of the multichannel audio tracks with more than 6 channels.
     * * `SHARED` - Use the same content key for all of the audio and video tracks in your stream.
     * * `UNENCRYPTED` - Don't encrypt any of the audio tracks in your stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptioncontractconfiguration.html#cfn-mediapackagev2-originendpoint-encryptioncontractconfiguration-presetspeke20audio)
     */
    public fun presetSpeke20Audio(): String

    /**
     * The SPEKE Version 2.0 preset video associated with the encryption contract configuration of
     * the origin endpoint.
     *
     * A collection of video encryption presets.
     *
     * Value description:
     *
     * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
     * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one
     * content key for all HD and higher resolutions video tracks.
     * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content
     * key for HD video tracks and one content key for all UHD video tracks.
     * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content
     * key for HD video tracks, one content key for all UHD1 video tracks and one content key for all
     * UHD2 video tracks.
     * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content
     * key for HD1 video tracks, one content key for HD2 video tracks, one content key for all UHD1
     * video tracks and one content key for all UHD2 video tracks.
     * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content
     * key for HD1 video tracks, one content key for HD2 video tracks and one content key for all UHD
     * video tracks.
     * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one
     * content key for HD2 video tracks and one content key for all UHD video tracks.
     * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one
     * content key for HD2 video tracks, one content key for all UHD1 video tracks and one content key
     * for all UHD2 video tracks.
     * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
     * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptioncontractconfiguration.html#cfn-mediapackagev2-originendpoint-encryptioncontractconfiguration-presetspeke20video)
     */
    public fun presetSpeke20Video(): String

    /**
     * A builder for [EncryptionContractConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param presetSpeke20Audio A collection of audio encryption presets. 
       * Value description:
       *
       * * `PRESET-AUDIO-1` - Use one content key to encrypt all of the audio tracks in your stream.
       * * `PRESET-AUDIO-2` - Use one content key to encrypt all of the stereo audio tracks and one
       * content key to encrypt all of the multichannel audio tracks.
       * * `PRESET-AUDIO-3` - Use one content key to encrypt all of the stereo audio tracks, one
       * content key to encrypt all of the multichannel audio tracks with 3 to 6 channels, and one
       * content key to encrypt all of the multichannel audio tracks with more than 6 channels.
       * * `SHARED` - Use the same content key for all of the audio and video tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the audio tracks in your stream.
       */
      public fun presetSpeke20Audio(presetSpeke20Audio: String)

      /**
       * @param presetSpeke20Video The SPEKE Version 2.0 preset video associated with the encryption
       * contract configuration of the origin endpoint. 
       * A collection of video encryption presets.
       *
       * Value description:
       *
       * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
       * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one
       * content key for all HD and higher resolutions video tracks.
       * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks, one content key for all UHD1 video tracks and one content key for all
       * UHD2 video tracks.
       * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks, one content key for all UHD1
       * video tracks and one content key for all UHD2 video tracks.
       * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks and one content key for all UHD
       * video tracks.
       * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
       * key for all UHD2 video tracks.
       * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
       */
      public fun presetSpeke20Video(presetSpeke20Video: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty.builder()

      /**
       * @param presetSpeke20Audio A collection of audio encryption presets. 
       * Value description:
       *
       * * `PRESET-AUDIO-1` - Use one content key to encrypt all of the audio tracks in your stream.
       * * `PRESET-AUDIO-2` - Use one content key to encrypt all of the stereo audio tracks and one
       * content key to encrypt all of the multichannel audio tracks.
       * * `PRESET-AUDIO-3` - Use one content key to encrypt all of the stereo audio tracks, one
       * content key to encrypt all of the multichannel audio tracks with 3 to 6 channels, and one
       * content key to encrypt all of the multichannel audio tracks with more than 6 channels.
       * * `SHARED` - Use the same content key for all of the audio and video tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the audio tracks in your stream.
       */
      override fun presetSpeke20Audio(presetSpeke20Audio: String) {
        cdkBuilder.presetSpeke20Audio(presetSpeke20Audio)
      }

      /**
       * @param presetSpeke20Video The SPEKE Version 2.0 preset video associated with the encryption
       * contract configuration of the origin endpoint. 
       * A collection of video encryption presets.
       *
       * Value description:
       *
       * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
       * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one
       * content key for all HD and higher resolutions video tracks.
       * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks, one content key for all UHD1 video tracks and one content key for all
       * UHD2 video tracks.
       * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks, one content key for all UHD1
       * video tracks and one content key for all UHD2 video tracks.
       * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks and one content key for all UHD
       * video tracks.
       * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
       * key for all UHD2 video tracks.
       * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
       */
      override fun presetSpeke20Video(presetSpeke20Video: String) {
        cdkBuilder.presetSpeke20Video(presetSpeke20Video)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty,
    ) : CdkObject(cdkObject),
        EncryptionContractConfigurationProperty {
      /**
       * A collection of audio encryption presets.
       *
       * Value description:
       *
       * * `PRESET-AUDIO-1` - Use one content key to encrypt all of the audio tracks in your stream.
       * * `PRESET-AUDIO-2` - Use one content key to encrypt all of the stereo audio tracks and one
       * content key to encrypt all of the multichannel audio tracks.
       * * `PRESET-AUDIO-3` - Use one content key to encrypt all of the stereo audio tracks, one
       * content key to encrypt all of the multichannel audio tracks with 3 to 6 channels, and one
       * content key to encrypt all of the multichannel audio tracks with more than 6 channels.
       * * `SHARED` - Use the same content key for all of the audio and video tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the audio tracks in your stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptioncontractconfiguration.html#cfn-mediapackagev2-originendpoint-encryptioncontractconfiguration-presetspeke20audio)
       */
      override fun presetSpeke20Audio(): String = unwrap(this).getPresetSpeke20Audio()

      /**
       * The SPEKE Version 2.0 preset video associated with the encryption contract configuration of
       * the origin endpoint.
       *
       * A collection of video encryption presets.
       *
       * Value description:
       *
       * * `PRESET-VIDEO-1` - Use one content key to encrypt all of the video tracks in your stream.
       * * `PRESET-VIDEO-2` - Use one content key to encrypt all of the SD video tracks and one
       * content key for all HD and higher resolutions video tracks.
       * * `PRESET-VIDEO-3` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-4` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD video tracks, one content key for all UHD1 video tracks and one content key for all
       * UHD2 video tracks.
       * * `PRESET-VIDEO-5` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks, one content key for all UHD1
       * video tracks and one content key for all UHD2 video tracks.
       * * `PRESET-VIDEO-6` - Use one content key to encrypt all of the SD video tracks, one content
       * key for HD1 video tracks, one content key for HD2 video tracks and one content key for all UHD
       * video tracks.
       * * `PRESET-VIDEO-7` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks and one content key for all UHD video tracks.
       * * `PRESET-VIDEO-8` - Use one content key to encrypt all of the SD+HD1 video tracks, one
       * content key for HD2 video tracks, one content key for all UHD1 video tracks and one content
       * key for all UHD2 video tracks.
       * * `SHARED` - Use the same content key for all of the video and audio tracks in your stream.
       * * `UNENCRYPTED` - Don't encrypt any of the video tracks in your stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptioncontractconfiguration.html#cfn-mediapackagev2-originendpoint-encryptioncontractconfiguration-presetspeke20video)
       */
      override fun presetSpeke20Video(): String = unwrap(this).getPresetSpeke20Video()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          EncryptionContractConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty):
          EncryptionContractConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EncryptionContractConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionContractConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty
    }
  }

  /**
   * The encryption method associated with the origin endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * EncryptionMethodProperty encryptionMethodProperty = EncryptionMethodProperty.builder()
   * .cmafEncryptionMethod("cmafEncryptionMethod")
   * .tsEncryptionMethod("tsEncryptionMethod")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptionmethod.html)
   */
  public interface EncryptionMethodProperty {
    /**
     * The encryption method to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptionmethod.html#cfn-mediapackagev2-originendpoint-encryptionmethod-cmafencryptionmethod)
     */
    public fun cmafEncryptionMethod(): String? = unwrap(this).getCmafEncryptionMethod()

    /**
     * The encryption method to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptionmethod.html#cfn-mediapackagev2-originendpoint-encryptionmethod-tsencryptionmethod)
     */
    public fun tsEncryptionMethod(): String? = unwrap(this).getTsEncryptionMethod()

    /**
     * A builder for [EncryptionMethodProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cmafEncryptionMethod The encryption method to use.
       */
      public fun cmafEncryptionMethod(cmafEncryptionMethod: String)

      /**
       * @param tsEncryptionMethod The encryption method to use.
       */
      public fun tsEncryptionMethod(tsEncryptionMethod: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty.builder()

      /**
       * @param cmafEncryptionMethod The encryption method to use.
       */
      override fun cmafEncryptionMethod(cmafEncryptionMethod: String) {
        cdkBuilder.cmafEncryptionMethod(cmafEncryptionMethod)
      }

      /**
       * @param tsEncryptionMethod The encryption method to use.
       */
      override fun tsEncryptionMethod(tsEncryptionMethod: String) {
        cdkBuilder.tsEncryptionMethod(tsEncryptionMethod)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty,
    ) : CdkObject(cdkObject),
        EncryptionMethodProperty {
      /**
       * The encryption method to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptionmethod.html#cfn-mediapackagev2-originendpoint-encryptionmethod-cmafencryptionmethod)
       */
      override fun cmafEncryptionMethod(): String? = unwrap(this).getCmafEncryptionMethod()

      /**
       * The encryption method to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptionmethod.html#cfn-mediapackagev2-originendpoint-encryptionmethod-tsencryptionmethod)
       */
      override fun tsEncryptionMethod(): String? = unwrap(this).getTsEncryptionMethod()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionMethodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty):
          EncryptionMethodProperty = CdkObjectWrappers.wrap(cdkObject) as? EncryptionMethodProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionMethodProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty
    }
  }

  /**
   * The parameters for encrypting content.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * EncryptionProperty encryptionProperty = EncryptionProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryption.html)
   */
  public interface EncryptionProperty {
    /**
     * A 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with
     * the key for encrypting content.
     *
     * If you don't specify a value, then MediaPackage creates the constant initialization vector
     * (IV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryption.html#cfn-mediapackagev2-originendpoint-encryption-constantinitializationvector)
     */
    public fun constantInitializationVector(): String? =
        unwrap(this).getConstantInitializationVector()

    /**
     * The encryption method to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryption.html#cfn-mediapackagev2-originendpoint-encryption-encryptionmethod)
     */
    public fun encryptionMethod(): Any

    /**
     * The interval, in seconds, to rotate encryption keys for the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryption.html#cfn-mediapackagev2-originendpoint-encryption-keyrotationintervalseconds)
     */
    public fun keyRotationIntervalSeconds(): Number? = unwrap(this).getKeyRotationIntervalSeconds()

    /**
     * The SPEKE key provider to use for encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryption.html#cfn-mediapackagev2-originendpoint-encryption-spekekeyprovider)
     */
    public fun spekeKeyProvider(): Any

    /**
     * A builder for [EncryptionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
       * 32-character string, used in conjunction with the key for encrypting content.
       * If you don't specify a value, then MediaPackage creates the constant initialization vector
       * (IV).
       */
      public fun constantInitializationVector(constantInitializationVector: String)

      /**
       * @param encryptionMethod The encryption method to use. 
       */
      public fun encryptionMethod(encryptionMethod: IResolvable)

      /**
       * @param encryptionMethod The encryption method to use. 
       */
      public fun encryptionMethod(encryptionMethod: EncryptionMethodProperty)

      /**
       * @param encryptionMethod The encryption method to use. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b82338da2eb0244c9f97d1e7cf2e2ef5ef53f5c835bb6a06264c958e9fd7ab2")
      public fun encryptionMethod(encryptionMethod: EncryptionMethodProperty.Builder.() -> Unit)

      /**
       * @param keyRotationIntervalSeconds The interval, in seconds, to rotate encryption keys for
       * the origin endpoint.
       */
      public fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number)

      /**
       * @param spekeKeyProvider The SPEKE key provider to use for encryption. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: IResolvable)

      /**
       * @param spekeKeyProvider The SPEKE key provider to use for encryption. 
       */
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty)

      /**
       * @param spekeKeyProvider The SPEKE key provider to use for encryption. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("339a27bb3e0ef9f95e7b6f49e755e4597fbf8f1c92ea9044619c2c2b14273e17")
      public fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty.builder()

      /**
       * @param constantInitializationVector A 128-bit, 16-byte hex value represented by a
       * 32-character string, used in conjunction with the key for encrypting content.
       * If you don't specify a value, then MediaPackage creates the constant initialization vector
       * (IV).
       */
      override fun constantInitializationVector(constantInitializationVector: String) {
        cdkBuilder.constantInitializationVector(constantInitializationVector)
      }

      /**
       * @param encryptionMethod The encryption method to use. 
       */
      override fun encryptionMethod(encryptionMethod: IResolvable) {
        cdkBuilder.encryptionMethod(encryptionMethod.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param encryptionMethod The encryption method to use. 
       */
      override fun encryptionMethod(encryptionMethod: EncryptionMethodProperty) {
        cdkBuilder.encryptionMethod(encryptionMethod.let(EncryptionMethodProperty.Companion::unwrap))
      }

      /**
       * @param encryptionMethod The encryption method to use. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1b82338da2eb0244c9f97d1e7cf2e2ef5ef53f5c835bb6a06264c958e9fd7ab2")
      override fun encryptionMethod(encryptionMethod: EncryptionMethodProperty.Builder.() -> Unit):
          Unit = encryptionMethod(EncryptionMethodProperty(encryptionMethod))

      /**
       * @param keyRotationIntervalSeconds The interval, in seconds, to rotate encryption keys for
       * the origin endpoint.
       */
      override fun keyRotationIntervalSeconds(keyRotationIntervalSeconds: Number) {
        cdkBuilder.keyRotationIntervalSeconds(keyRotationIntervalSeconds)
      }

      /**
       * @param spekeKeyProvider The SPEKE key provider to use for encryption. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: IResolvable) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param spekeKeyProvider The SPEKE key provider to use for encryption. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty.Companion::unwrap))
      }

      /**
       * @param spekeKeyProvider The SPEKE key provider to use for encryption. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("339a27bb3e0ef9f95e7b6f49e755e4597fbf8f1c92ea9044619c2c2b14273e17")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty,
    ) : CdkObject(cdkObject),
        EncryptionProperty {
      /**
       * A 128-bit, 16-byte hex value represented by a 32-character string, used in conjunction with
       * the key for encrypting content.
       *
       * If you don't specify a value, then MediaPackage creates the constant initialization vector
       * (IV).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryption.html#cfn-mediapackagev2-originendpoint-encryption-constantinitializationvector)
       */
      override fun constantInitializationVector(): String? =
          unwrap(this).getConstantInitializationVector()

      /**
       * The encryption method to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryption.html#cfn-mediapackagev2-originendpoint-encryption-encryptionmethod)
       */
      override fun encryptionMethod(): Any = unwrap(this).getEncryptionMethod()

      /**
       * The interval, in seconds, to rotate encryption keys for the origin endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryption.html#cfn-mediapackagev2-originendpoint-encryption-keyrotationintervalseconds)
       */
      override fun keyRotationIntervalSeconds(): Number? =
          unwrap(this).getKeyRotationIntervalSeconds()

      /**
       * The SPEKE key provider to use for encryption.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryption.html#cfn-mediapackagev2-originendpoint-encryption-spekekeyprovider)
       */
      override fun spekeKeyProvider(): Any = unwrap(this).getSpekeKeyProvider()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty):
          EncryptionProperty = CdkObjectWrappers.wrap(cdkObject) as? EncryptionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty
    }
  }

  /**
   * Filter configuration includes settings for manifest filtering, start and end times, and time
   * delay that apply to all of your egress requests for this manifest.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * FilterConfigurationProperty filterConfigurationProperty = FilterConfigurationProperty.builder()
   * .clipStartTime("clipStartTime")
   * .end("end")
   * .manifestFilter("manifestFilter")
   * .start("start")
   * .timeDelaySeconds(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html)
   */
  public interface FilterConfigurationProperty {
    /**
     * Optionally specify the clip start time for all of your manifest egress requests.
     *
     * When you include clip start time, note that you cannot use clip start time query parameters
     * for this manifest's endpoint URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-clipstarttime)
     */
    public fun clipStartTime(): String? = unwrap(this).getClipStartTime()

    /**
     * Optionally specify the end time for all of your manifest egress requests.
     *
     * When you include end time, note that you cannot use end time query parameters for this
     * manifest's endpoint URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-end)
     */
    public fun end(): String? = unwrap(this).getEnd()

    /**
     * Optionally specify one or more manifest filters for all of your manifest egress requests.
     *
     * When you include a manifest filter, note that you cannot use an identical manifest filter
     * query parameter for this manifest's endpoint URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-manifestfilter)
     */
    public fun manifestFilter(): String? = unwrap(this).getManifestFilter()

    /**
     * Optionally specify the start time for all of your manifest egress requests.
     *
     * When you include start time, note that you cannot use start time query parameters for this
     * manifest's endpoint URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-start)
     */
    public fun start(): String? = unwrap(this).getStart()

    /**
     * Optionally specify the time delay for all of your manifest egress requests.
     *
     * Enter a value that is smaller than your endpoint's startover window. When you include time
     * delay, note that you cannot use time delay query parameters for this manifest's endpoint URL.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-timedelayseconds)
     */
    public fun timeDelaySeconds(): Number? = unwrap(this).getTimeDelaySeconds()

    /**
     * A builder for [FilterConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param clipStartTime Optionally specify the clip start time for all of your manifest egress
       * requests.
       * When you include clip start time, note that you cannot use clip start time query parameters
       * for this manifest's endpoint URL.
       */
      public fun clipStartTime(clipStartTime: String)

      /**
       * @param end Optionally specify the end time for all of your manifest egress requests.
       * When you include end time, note that you cannot use end time query parameters for this
       * manifest's endpoint URL.
       */
      public fun end(end: String)

      /**
       * @param manifestFilter Optionally specify one or more manifest filters for all of your
       * manifest egress requests.
       * When you include a manifest filter, note that you cannot use an identical manifest filter
       * query parameter for this manifest's endpoint URL.
       */
      public fun manifestFilter(manifestFilter: String)

      /**
       * @param start Optionally specify the start time for all of your manifest egress requests.
       * When you include start time, note that you cannot use start time query parameters for this
       * manifest's endpoint URL.
       */
      public fun start(start: String)

      /**
       * @param timeDelaySeconds Optionally specify the time delay for all of your manifest egress
       * requests.
       * Enter a value that is smaller than your endpoint's startover window. When you include time
       * delay, note that you cannot use time delay query parameters for this manifest's endpoint URL.
       */
      public fun timeDelaySeconds(timeDelaySeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty.builder()

      /**
       * @param clipStartTime Optionally specify the clip start time for all of your manifest egress
       * requests.
       * When you include clip start time, note that you cannot use clip start time query parameters
       * for this manifest's endpoint URL.
       */
      override fun clipStartTime(clipStartTime: String) {
        cdkBuilder.clipStartTime(clipStartTime)
      }

      /**
       * @param end Optionally specify the end time for all of your manifest egress requests.
       * When you include end time, note that you cannot use end time query parameters for this
       * manifest's endpoint URL.
       */
      override fun end(end: String) {
        cdkBuilder.end(end)
      }

      /**
       * @param manifestFilter Optionally specify one or more manifest filters for all of your
       * manifest egress requests.
       * When you include a manifest filter, note that you cannot use an identical manifest filter
       * query parameter for this manifest's endpoint URL.
       */
      override fun manifestFilter(manifestFilter: String) {
        cdkBuilder.manifestFilter(manifestFilter)
      }

      /**
       * @param start Optionally specify the start time for all of your manifest egress requests.
       * When you include start time, note that you cannot use start time query parameters for this
       * manifest's endpoint URL.
       */
      override fun start(start: String) {
        cdkBuilder.start(start)
      }

      /**
       * @param timeDelaySeconds Optionally specify the time delay for all of your manifest egress
       * requests.
       * Enter a value that is smaller than your endpoint's startover window. When you include time
       * delay, note that you cannot use time delay query parameters for this manifest's endpoint URL.
       */
      override fun timeDelaySeconds(timeDelaySeconds: Number) {
        cdkBuilder.timeDelaySeconds(timeDelaySeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty,
    ) : CdkObject(cdkObject),
        FilterConfigurationProperty {
      /**
       * Optionally specify the clip start time for all of your manifest egress requests.
       *
       * When you include clip start time, note that you cannot use clip start time query parameters
       * for this manifest's endpoint URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-clipstarttime)
       */
      override fun clipStartTime(): String? = unwrap(this).getClipStartTime()

      /**
       * Optionally specify the end time for all of your manifest egress requests.
       *
       * When you include end time, note that you cannot use end time query parameters for this
       * manifest's endpoint URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-end)
       */
      override fun end(): String? = unwrap(this).getEnd()

      /**
       * Optionally specify one or more manifest filters for all of your manifest egress requests.
       *
       * When you include a manifest filter, note that you cannot use an identical manifest filter
       * query parameter for this manifest's endpoint URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-manifestfilter)
       */
      override fun manifestFilter(): String? = unwrap(this).getManifestFilter()

      /**
       * Optionally specify the start time for all of your manifest egress requests.
       *
       * When you include start time, note that you cannot use start time query parameters for this
       * manifest's endpoint URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-start)
       */
      override fun start(): String? = unwrap(this).getStart()

      /**
       * Optionally specify the time delay for all of your manifest egress requests.
       *
       * Enter a value that is smaller than your endpoint's startover window. When you include time
       * delay, note that you cannot use time delay query parameters for this manifest's endpoint URL.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-timedelayseconds)
       */
      override fun timeDelaySeconds(): Number? = unwrap(this).getTimeDelaySeconds()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty):
          FilterConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FilterConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty
    }
  }

  /**
   * The failover settings for the endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * ForceEndpointErrorConfigurationProperty forceEndpointErrorConfigurationProperty =
   * ForceEndpointErrorConfigurationProperty.builder()
   * .endpointErrorConditions(List.of("endpointErrorConditions"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-forceendpointerrorconfiguration.html)
   */
  public interface ForceEndpointErrorConfigurationProperty {
    /**
     * The failover conditions for the endpoint. The options are:.
     *
     * * `STALE_MANIFEST` - The manifest stalled and there are no new segments or parts.
     * * `INCOMPLETE_MANIFEST` - There is a gap in the manifest.
     * * `MISSING_DRM_KEY` - Key rotation is enabled but we're unable to fetch the key for the
     * current key period.
     * * `SLATE_INPUT` - The segments which contain slate content are considered to be missing
     * content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-forceendpointerrorconfiguration.html#cfn-mediapackagev2-originendpoint-forceendpointerrorconfiguration-endpointerrorconditions)
     */
    public fun endpointErrorConditions(): List<String> = unwrap(this).getEndpointErrorConditions()
        ?: emptyList()

    /**
     * A builder for [ForceEndpointErrorConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpointErrorConditions The failover conditions for the endpoint. The options are:.
       * * `STALE_MANIFEST` - The manifest stalled and there are no new segments or parts.
       * * `INCOMPLETE_MANIFEST` - There is a gap in the manifest.
       * * `MISSING_DRM_KEY` - Key rotation is enabled but we're unable to fetch the key for the
       * current key period.
       * * `SLATE_INPUT` - The segments which contain slate content are considered to be missing
       * content.
       */
      public fun endpointErrorConditions(endpointErrorConditions: List<String>)

      /**
       * @param endpointErrorConditions The failover conditions for the endpoint. The options are:.
       * * `STALE_MANIFEST` - The manifest stalled and there are no new segments or parts.
       * * `INCOMPLETE_MANIFEST` - There is a gap in the manifest.
       * * `MISSING_DRM_KEY` - Key rotation is enabled but we're unable to fetch the key for the
       * current key period.
       * * `SLATE_INPUT` - The segments which contain slate content are considered to be missing
       * content.
       */
      public fun endpointErrorConditions(vararg endpointErrorConditions: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ForceEndpointErrorConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ForceEndpointErrorConfigurationProperty.builder()

      /**
       * @param endpointErrorConditions The failover conditions for the endpoint. The options are:.
       * * `STALE_MANIFEST` - The manifest stalled and there are no new segments or parts.
       * * `INCOMPLETE_MANIFEST` - There is a gap in the manifest.
       * * `MISSING_DRM_KEY` - Key rotation is enabled but we're unable to fetch the key for the
       * current key period.
       * * `SLATE_INPUT` - The segments which contain slate content are considered to be missing
       * content.
       */
      override fun endpointErrorConditions(endpointErrorConditions: List<String>) {
        cdkBuilder.endpointErrorConditions(endpointErrorConditions)
      }

      /**
       * @param endpointErrorConditions The failover conditions for the endpoint. The options are:.
       * * `STALE_MANIFEST` - The manifest stalled and there are no new segments or parts.
       * * `INCOMPLETE_MANIFEST` - There is a gap in the manifest.
       * * `MISSING_DRM_KEY` - Key rotation is enabled but we're unable to fetch the key for the
       * current key period.
       * * `SLATE_INPUT` - The segments which contain slate content are considered to be missing
       * content.
       */
      override fun endpointErrorConditions(vararg endpointErrorConditions: String): Unit =
          endpointErrorConditions(endpointErrorConditions.toList())

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ForceEndpointErrorConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ForceEndpointErrorConfigurationProperty,
    ) : CdkObject(cdkObject),
        ForceEndpointErrorConfigurationProperty {
      /**
       * The failover conditions for the endpoint. The options are:.
       *
       * * `STALE_MANIFEST` - The manifest stalled and there are no new segments or parts.
       * * `INCOMPLETE_MANIFEST` - There is a gap in the manifest.
       * * `MISSING_DRM_KEY` - Key rotation is enabled but we're unable to fetch the key for the
       * current key period.
       * * `SLATE_INPUT` - The segments which contain slate content are considered to be missing
       * content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-forceendpointerrorconfiguration.html#cfn-mediapackagev2-originendpoint-forceendpointerrorconfiguration-endpointerrorconditions)
       */
      override fun endpointErrorConditions(): List<String> =
          unwrap(this).getEndpointErrorConditions() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ForceEndpointErrorConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ForceEndpointErrorConfigurationProperty):
          ForceEndpointErrorConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ForceEndpointErrorConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ForceEndpointErrorConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ForceEndpointErrorConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ForceEndpointErrorConfigurationProperty
    }
  }

  /**
   * The HLS manfiest configuration associated with the origin endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * HlsManifestConfigurationProperty hlsManifestConfigurationProperty =
   * HlsManifestConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html)
   */
  public interface HlsManifestConfigurationProperty {
    /**
     * The name of the child manifest associated with the HLS manifest configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-childmanifestname)
     */
    public fun childManifestName(): String? = unwrap(this).getChildManifestName()

    /**
     * Filter configuration includes settings for manifest filtering, start and end times, and time
     * delay that apply to all of your egress requests for this manifest.
     *
     * </p>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-filterconfiguration)
     */
    public fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

    /**
     * The name of the manifest associated with the HLS manifest configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-manifestname)
     */
    public fun manifestName(): String

    /**
     * The duration of the manifest window, in seconds, for the HLS manifest configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-manifestwindowseconds)
     */
    public fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

    /**
     * The `EXT-X-PROGRAM-DATE-TIME` interval, in seconds, associated with the HLS manifest
     * configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-programdatetimeintervalseconds)
     */
    public fun programDateTimeIntervalSeconds(): Number? =
        unwrap(this).getProgramDateTimeIntervalSeconds()

    /**
     * THE SCTE-35 HLS configuration associated with the HLS manifest configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-sctehls)
     */
    public fun scteHls(): Any? = unwrap(this).getScteHls()

    /**
     * To insert an EXT-X-START tag in your HLS playlist, specify a StartTag configuration object
     * with a valid TimeOffset.
     *
     * When you do, you can also optionally specify whether to include a PRECISE value in the
     * EXT-X-START tag.</p>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-starttag)
     */
    public fun startTag(): Any? = unwrap(this).getStartTag()

    /**
     * The URL of the HLS manifest configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [HlsManifestConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param childManifestName The name of the child manifest associated with the HLS manifest
       * configuration.
       */
      public fun childManifestName(childManifestName: String)

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      public fun filterConfiguration(filterConfiguration: IResolvable)

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      public fun filterConfiguration(filterConfiguration: FilterConfigurationProperty)

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0aee2c032693bff8484255c2220fc44ce6cb6a02c0f9ebe20ec091ab4fd812a")
      public
          fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit)

      /**
       * @param manifestName The name of the manifest associated with the HLS manifest
       * configuration. 
       */
      public fun manifestName(manifestName: String)

      /**
       * @param manifestWindowSeconds The duration of the manifest window, in seconds, for the HLS
       * manifest configuration.
       */
      public fun manifestWindowSeconds(manifestWindowSeconds: Number)

      /**
       * @param programDateTimeIntervalSeconds The `EXT-X-PROGRAM-DATE-TIME` interval, in seconds,
       * associated with the HLS manifest configuration.
       */
      public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number)

      /**
       * @param scteHls THE SCTE-35 HLS configuration associated with the HLS manifest
       * configuration.
       */
      public fun scteHls(scteHls: IResolvable)

      /**
       * @param scteHls THE SCTE-35 HLS configuration associated with the HLS manifest
       * configuration.
       */
      public fun scteHls(scteHls: ScteHlsProperty)

      /**
       * @param scteHls THE SCTE-35 HLS configuration associated with the HLS manifest
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c2552766ba01398d4ac04c908b00e89fb7ee64b4c6f9a85ed57ecc63df313fc")
      public fun scteHls(scteHls: ScteHlsProperty.Builder.() -> Unit)

      /**
       * @param startTag To insert an EXT-X-START tag in your HLS playlist, specify a StartTag
       * configuration object with a valid TimeOffset.
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       */
      public fun startTag(startTag: IResolvable)

      /**
       * @param startTag To insert an EXT-X-START tag in your HLS playlist, specify a StartTag
       * configuration object with a valid TimeOffset.
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       */
      public fun startTag(startTag: StartTagProperty)

      /**
       * @param startTag To insert an EXT-X-START tag in your HLS playlist, specify a StartTag
       * configuration object with a valid TimeOffset.
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43eb43fd53dacd3efac7f4eb52f4186ee8e5cee2e144ff4d0ec91ad13725d23f")
      public fun startTag(startTag: StartTagProperty.Builder.() -> Unit)

      /**
       * @param url The URL of the HLS manifest configuration.
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty.builder()

      /**
       * @param childManifestName The name of the child manifest associated with the HLS manifest
       * configuration.
       */
      override fun childManifestName(childManifestName: String) {
        cdkBuilder.childManifestName(childManifestName)
      }

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      override fun filterConfiguration(filterConfiguration: IResolvable) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      override fun filterConfiguration(filterConfiguration: FilterConfigurationProperty) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(FilterConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d0aee2c032693bff8484255c2220fc44ce6cb6a02c0f9ebe20ec091ab4fd812a")
      override
          fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit):
          Unit = filterConfiguration(FilterConfigurationProperty(filterConfiguration))

      /**
       * @param manifestName The name of the manifest associated with the HLS manifest
       * configuration. 
       */
      override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      /**
       * @param manifestWindowSeconds The duration of the manifest window, in seconds, for the HLS
       * manifest configuration.
       */
      override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      /**
       * @param programDateTimeIntervalSeconds The `EXT-X-PROGRAM-DATE-TIME` interval, in seconds,
       * associated with the HLS manifest configuration.
       */
      override fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
      }

      /**
       * @param scteHls THE SCTE-35 HLS configuration associated with the HLS manifest
       * configuration.
       */
      override fun scteHls(scteHls: IResolvable) {
        cdkBuilder.scteHls(scteHls.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param scteHls THE SCTE-35 HLS configuration associated with the HLS manifest
       * configuration.
       */
      override fun scteHls(scteHls: ScteHlsProperty) {
        cdkBuilder.scteHls(scteHls.let(ScteHlsProperty.Companion::unwrap))
      }

      /**
       * @param scteHls THE SCTE-35 HLS configuration associated with the HLS manifest
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c2552766ba01398d4ac04c908b00e89fb7ee64b4c6f9a85ed57ecc63df313fc")
      override fun scteHls(scteHls: ScteHlsProperty.Builder.() -> Unit): Unit =
          scteHls(ScteHlsProperty(scteHls))

      /**
       * @param startTag To insert an EXT-X-START tag in your HLS playlist, specify a StartTag
       * configuration object with a valid TimeOffset.
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       */
      override fun startTag(startTag: IResolvable) {
        cdkBuilder.startTag(startTag.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param startTag To insert an EXT-X-START tag in your HLS playlist, specify a StartTag
       * configuration object with a valid TimeOffset.
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       */
      override fun startTag(startTag: StartTagProperty) {
        cdkBuilder.startTag(startTag.let(StartTagProperty.Companion::unwrap))
      }

      /**
       * @param startTag To insert an EXT-X-START tag in your HLS playlist, specify a StartTag
       * configuration object with a valid TimeOffset.
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43eb43fd53dacd3efac7f4eb52f4186ee8e5cee2e144ff4d0ec91ad13725d23f")
      override fun startTag(startTag: StartTagProperty.Builder.() -> Unit): Unit =
          startTag(StartTagProperty(startTag))

      /**
       * @param url The URL of the HLS manifest configuration.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty,
    ) : CdkObject(cdkObject),
        HlsManifestConfigurationProperty {
      /**
       * The name of the child manifest associated with the HLS manifest configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-childmanifestname)
       */
      override fun childManifestName(): String? = unwrap(this).getChildManifestName()

      /**
       * Filter configuration includes settings for manifest filtering, start and end times, and
       * time delay that apply to all of your egress requests for this manifest.
       *
       * </p>
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-filterconfiguration)
       */
      override fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

      /**
       * The name of the manifest associated with the HLS manifest configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-manifestname)
       */
      override fun manifestName(): String = unwrap(this).getManifestName()

      /**
       * The duration of the manifest window, in seconds, for the HLS manifest configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-manifestwindowseconds)
       */
      override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

      /**
       * The `EXT-X-PROGRAM-DATE-TIME` interval, in seconds, associated with the HLS manifest
       * configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-programdatetimeintervalseconds)
       */
      override fun programDateTimeIntervalSeconds(): Number? =
          unwrap(this).getProgramDateTimeIntervalSeconds()

      /**
       * THE SCTE-35 HLS configuration associated with the HLS manifest configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-sctehls)
       */
      override fun scteHls(): Any? = unwrap(this).getScteHls()

      /**
       * To insert an EXT-X-START tag in your HLS playlist, specify a StartTag configuration object
       * with a valid TimeOffset.
       *
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-starttag)
       */
      override fun startTag(): Any? = unwrap(this).getStartTag()

      /**
       * The URL of the HLS manifest configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HlsManifestConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty):
          HlsManifestConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HlsManifestConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsManifestConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty
    }
  }

  /**
   * Specify a low-latency HTTP live streaming (LL-HLS) manifest configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * LowLatencyHlsManifestConfigurationProperty lowLatencyHlsManifestConfigurationProperty =
   * LowLatencyHlsManifestConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html)
   */
  public interface LowLatencyHlsManifestConfigurationProperty {
    /**
     * The name of the child manifest associated with the low-latency HLS (LL-HLS) manifest
     * configuration of the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-childmanifestname)
     */
    public fun childManifestName(): String? = unwrap(this).getChildManifestName()

    /**
     * Filter configuration includes settings for manifest filtering, start and end times, and time
     * delay that apply to all of your egress requests for this manifest.
     *
     * </p>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-filterconfiguration)
     */
    public fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

    /**
     * A short short string that's appended to the endpoint URL.
     *
     * The manifest name creates a unique path to this endpoint. If you don't enter a value,
     * MediaPackage uses the default manifest name, `index` . MediaPackage automatically inserts the
     * format extension, such as `.m3u8` . You can't use the same manifest name if you use HLS manifest
     * and low-latency HLS manifest. The `manifestName` on the `HLSManifest` object overrides the
     * `manifestName` you provided on the `originEndpoint` object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-manifestname)
     */
    public fun manifestName(): String

    /**
     * The total duration (in seconds) of the manifest's content.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-manifestwindowseconds)
     */
    public fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

    /**
     * Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output manifest at the interval that you
     * specify.
     *
     * If you don't enter an interval, `EXT-X-PROGRAM-DATE-TIME` tags aren't included in the
     * manifest. The tags sync the stream to the wall clock so that viewers can seek to a specific time
     * in the playback timeline on the player.
     *
     * Irrespective of this parameter, if any `ID3Timed` metadata is in the HLS input, MediaPackage
     * passes through that metadata to the HLS output.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-programdatetimeintervalseconds)
     */
    public fun programDateTimeIntervalSeconds(): Number? =
        unwrap(this).getProgramDateTimeIntervalSeconds()

    /**
     * The SCTE-35 HLS configuration associated with the low-latency HLS (LL-HLS) manifest
     * configuration of the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-sctehls)
     */
    public fun scteHls(): Any? = unwrap(this).getScteHls()

    /**
     * To insert an EXT-X-START tag in your HLS playlist, specify a StartTag configuration object
     * with a valid TimeOffset.
     *
     * When you do, you can also optionally specify whether to include a PRECISE value in the
     * EXT-X-START tag.</p>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-starttag)
     */
    public fun startTag(): Any? = unwrap(this).getStartTag()

    /**
     * The URL of the low-latency HLS (LL-HLS) manifest configuration of the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [LowLatencyHlsManifestConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param childManifestName The name of the child manifest associated with the low-latency HLS
       * (LL-HLS) manifest configuration of the origin endpoint.
       */
      public fun childManifestName(childManifestName: String)

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      public fun filterConfiguration(filterConfiguration: IResolvable)

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      public fun filterConfiguration(filterConfiguration: FilterConfigurationProperty)

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e60276fbe3576bbb1f200a20e4faae25c52ef9ea8bc9f0248f931dcc59627ce8")
      public
          fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit)

      /**
       * @param manifestName A short short string that's appended to the endpoint URL. 
       * The manifest name creates a unique path to this endpoint. If you don't enter a value,
       * MediaPackage uses the default manifest name, `index` . MediaPackage automatically inserts the
       * format extension, such as `.m3u8` . You can't use the same manifest name if you use HLS
       * manifest and low-latency HLS manifest. The `manifestName` on the `HLSManifest` object
       * overrides the `manifestName` you provided on the `originEndpoint` object.
       */
      public fun manifestName(manifestName: String)

      /**
       * @param manifestWindowSeconds The total duration (in seconds) of the manifest's content.
       */
      public fun manifestWindowSeconds(manifestWindowSeconds: Number)

      /**
       * @param programDateTimeIntervalSeconds Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output
       * manifest at the interval that you specify.
       * If you don't enter an interval, `EXT-X-PROGRAM-DATE-TIME` tags aren't included in the
       * manifest. The tags sync the stream to the wall clock so that viewers can seek to a specific
       * time in the playback timeline on the player.
       *
       * Irrespective of this parameter, if any `ID3Timed` metadata is in the HLS input,
       * MediaPackage passes through that metadata to the HLS output.
       */
      public fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number)

      /**
       * @param scteHls The SCTE-35 HLS configuration associated with the low-latency HLS (LL-HLS)
       * manifest configuration of the origin endpoint.
       */
      public fun scteHls(scteHls: IResolvable)

      /**
       * @param scteHls The SCTE-35 HLS configuration associated with the low-latency HLS (LL-HLS)
       * manifest configuration of the origin endpoint.
       */
      public fun scteHls(scteHls: ScteHlsProperty)

      /**
       * @param scteHls The SCTE-35 HLS configuration associated with the low-latency HLS (LL-HLS)
       * manifest configuration of the origin endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("687f873b6a36ecb424fbd5ad87d30682ab0a19e26a068ecafd0eab5823883846")
      public fun scteHls(scteHls: ScteHlsProperty.Builder.() -> Unit)

      /**
       * @param startTag To insert an EXT-X-START tag in your HLS playlist, specify a StartTag
       * configuration object with a valid TimeOffset.
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       */
      public fun startTag(startTag: IResolvable)

      /**
       * @param startTag To insert an EXT-X-START tag in your HLS playlist, specify a StartTag
       * configuration object with a valid TimeOffset.
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       */
      public fun startTag(startTag: StartTagProperty)

      /**
       * @param startTag To insert an EXT-X-START tag in your HLS playlist, specify a StartTag
       * configuration object with a valid TimeOffset.
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd9c6291a1a8674dd45c02619fb284e3b031a041d42ea827b7637e2042ce8612")
      public fun startTag(startTag: StartTagProperty.Builder.() -> Unit)

      /**
       * @param url The URL of the low-latency HLS (LL-HLS) manifest configuration of the origin
       * endpoint.
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty.builder()

      /**
       * @param childManifestName The name of the child manifest associated with the low-latency HLS
       * (LL-HLS) manifest configuration of the origin endpoint.
       */
      override fun childManifestName(childManifestName: String) {
        cdkBuilder.childManifestName(childManifestName)
      }

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      override fun filterConfiguration(filterConfiguration: IResolvable) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      override fun filterConfiguration(filterConfiguration: FilterConfigurationProperty) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(FilterConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e60276fbe3576bbb1f200a20e4faae25c52ef9ea8bc9f0248f931dcc59627ce8")
      override
          fun filterConfiguration(filterConfiguration: FilterConfigurationProperty.Builder.() -> Unit):
          Unit = filterConfiguration(FilterConfigurationProperty(filterConfiguration))

      /**
       * @param manifestName A short short string that's appended to the endpoint URL. 
       * The manifest name creates a unique path to this endpoint. If you don't enter a value,
       * MediaPackage uses the default manifest name, `index` . MediaPackage automatically inserts the
       * format extension, such as `.m3u8` . You can't use the same manifest name if you use HLS
       * manifest and low-latency HLS manifest. The `manifestName` on the `HLSManifest` object
       * overrides the `manifestName` you provided on the `originEndpoint` object.
       */
      override fun manifestName(manifestName: String) {
        cdkBuilder.manifestName(manifestName)
      }

      /**
       * @param manifestWindowSeconds The total duration (in seconds) of the manifest's content.
       */
      override fun manifestWindowSeconds(manifestWindowSeconds: Number) {
        cdkBuilder.manifestWindowSeconds(manifestWindowSeconds)
      }

      /**
       * @param programDateTimeIntervalSeconds Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output
       * manifest at the interval that you specify.
       * If you don't enter an interval, `EXT-X-PROGRAM-DATE-TIME` tags aren't included in the
       * manifest. The tags sync the stream to the wall clock so that viewers can seek to a specific
       * time in the playback timeline on the player.
       *
       * Irrespective of this parameter, if any `ID3Timed` metadata is in the HLS input,
       * MediaPackage passes through that metadata to the HLS output.
       */
      override fun programDateTimeIntervalSeconds(programDateTimeIntervalSeconds: Number) {
        cdkBuilder.programDateTimeIntervalSeconds(programDateTimeIntervalSeconds)
      }

      /**
       * @param scteHls The SCTE-35 HLS configuration associated with the low-latency HLS (LL-HLS)
       * manifest configuration of the origin endpoint.
       */
      override fun scteHls(scteHls: IResolvable) {
        cdkBuilder.scteHls(scteHls.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param scteHls The SCTE-35 HLS configuration associated with the low-latency HLS (LL-HLS)
       * manifest configuration of the origin endpoint.
       */
      override fun scteHls(scteHls: ScteHlsProperty) {
        cdkBuilder.scteHls(scteHls.let(ScteHlsProperty.Companion::unwrap))
      }

      /**
       * @param scteHls The SCTE-35 HLS configuration associated with the low-latency HLS (LL-HLS)
       * manifest configuration of the origin endpoint.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("687f873b6a36ecb424fbd5ad87d30682ab0a19e26a068ecafd0eab5823883846")
      override fun scteHls(scteHls: ScteHlsProperty.Builder.() -> Unit): Unit =
          scteHls(ScteHlsProperty(scteHls))

      /**
       * @param startTag To insert an EXT-X-START tag in your HLS playlist, specify a StartTag
       * configuration object with a valid TimeOffset.
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       */
      override fun startTag(startTag: IResolvable) {
        cdkBuilder.startTag(startTag.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param startTag To insert an EXT-X-START tag in your HLS playlist, specify a StartTag
       * configuration object with a valid TimeOffset.
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       */
      override fun startTag(startTag: StartTagProperty) {
        cdkBuilder.startTag(startTag.let(StartTagProperty.Companion::unwrap))
      }

      /**
       * @param startTag To insert an EXT-X-START tag in your HLS playlist, specify a StartTag
       * configuration object with a valid TimeOffset.
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cd9c6291a1a8674dd45c02619fb284e3b031a041d42ea827b7637e2042ce8612")
      override fun startTag(startTag: StartTagProperty.Builder.() -> Unit): Unit =
          startTag(StartTagProperty(startTag))

      /**
       * @param url The URL of the low-latency HLS (LL-HLS) manifest configuration of the origin
       * endpoint.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty,
    ) : CdkObject(cdkObject),
        LowLatencyHlsManifestConfigurationProperty {
      /**
       * The name of the child manifest associated with the low-latency HLS (LL-HLS) manifest
       * configuration of the origin endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-childmanifestname)
       */
      override fun childManifestName(): String? = unwrap(this).getChildManifestName()

      /**
       * Filter configuration includes settings for manifest filtering, start and end times, and
       * time delay that apply to all of your egress requests for this manifest.
       *
       * </p>
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-filterconfiguration)
       */
      override fun filterConfiguration(): Any? = unwrap(this).getFilterConfiguration()

      /**
       * A short short string that's appended to the endpoint URL.
       *
       * The manifest name creates a unique path to this endpoint. If you don't enter a value,
       * MediaPackage uses the default manifest name, `index` . MediaPackage automatically inserts the
       * format extension, such as `.m3u8` . You can't use the same manifest name if you use HLS
       * manifest and low-latency HLS manifest. The `manifestName` on the `HLSManifest` object
       * overrides the `manifestName` you provided on the `originEndpoint` object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-manifestname)
       */
      override fun manifestName(): String = unwrap(this).getManifestName()

      /**
       * The total duration (in seconds) of the manifest's content.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-manifestwindowseconds)
       */
      override fun manifestWindowSeconds(): Number? = unwrap(this).getManifestWindowSeconds()

      /**
       * Inserts `EXT-X-PROGRAM-DATE-TIME` tags in the output manifest at the interval that you
       * specify.
       *
       * If you don't enter an interval, `EXT-X-PROGRAM-DATE-TIME` tags aren't included in the
       * manifest. The tags sync the stream to the wall clock so that viewers can seek to a specific
       * time in the playback timeline on the player.
       *
       * Irrespective of this parameter, if any `ID3Timed` metadata is in the HLS input,
       * MediaPackage passes through that metadata to the HLS output.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-programdatetimeintervalseconds)
       */
      override fun programDateTimeIntervalSeconds(): Number? =
          unwrap(this).getProgramDateTimeIntervalSeconds()

      /**
       * The SCTE-35 HLS configuration associated with the low-latency HLS (LL-HLS) manifest
       * configuration of the origin endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-sctehls)
       */
      override fun scteHls(): Any? = unwrap(this).getScteHls()

      /**
       * To insert an EXT-X-START tag in your HLS playlist, specify a StartTag configuration object
       * with a valid TimeOffset.
       *
       * When you do, you can also optionally specify whether to include a PRECISE value in the
       * EXT-X-START tag.</p>
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-starttag)
       */
      override fun startTag(): Any? = unwrap(this).getStartTag()

      /**
       * The URL of the low-latency HLS (LL-HLS) manifest configuration of the origin endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LowLatencyHlsManifestConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty):
          LowLatencyHlsManifestConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LowLatencyHlsManifestConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LowLatencyHlsManifestConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty
    }
  }

  /**
   * The SCTE configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * ScteDashProperty scteDashProperty = ScteDashProperty.builder()
   * .adMarkerDash("adMarkerDash")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-sctedash.html)
   */
  public interface ScteDashProperty {
    /**
     * Choose how ad markers are included in the packaged content.
     *
     * If you include ad markers in the content stream in your upstream encoders, then you need to
     * inform MediaPackage what to do with the ad markers in the output.
     *
     * Value description:
     *
     * * `Binary` - The SCTE-35 marker is expressed as a hex-string (Base64 string) rather than full
     * XML.
     * * `XML` - The SCTE marker is expressed fully in XML.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-sctedash.html#cfn-mediapackagev2-originendpoint-sctedash-admarkerdash)
     */
    public fun adMarkerDash(): String? = unwrap(this).getAdMarkerDash()

    /**
     * A builder for [ScteDashProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adMarkerDash Choose how ad markers are included in the packaged content.
       * If you include ad markers in the content stream in your upstream encoders, then you need to
       * inform MediaPackage what to do with the ad markers in the output.
       *
       * Value description:
       *
       * * `Binary` - The SCTE-35 marker is expressed as a hex-string (Base64 string) rather than
       * full XML.
       * * `XML` - The SCTE marker is expressed fully in XML.
       */
      public fun adMarkerDash(adMarkerDash: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteDashProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteDashProperty.builder()

      /**
       * @param adMarkerDash Choose how ad markers are included in the packaged content.
       * If you include ad markers in the content stream in your upstream encoders, then you need to
       * inform MediaPackage what to do with the ad markers in the output.
       *
       * Value description:
       *
       * * `Binary` - The SCTE-35 marker is expressed as a hex-string (Base64 string) rather than
       * full XML.
       * * `XML` - The SCTE marker is expressed fully in XML.
       */
      override fun adMarkerDash(adMarkerDash: String) {
        cdkBuilder.adMarkerDash(adMarkerDash)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteDashProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteDashProperty,
    ) : CdkObject(cdkObject),
        ScteDashProperty {
      /**
       * Choose how ad markers are included in the packaged content.
       *
       * If you include ad markers in the content stream in your upstream encoders, then you need to
       * inform MediaPackage what to do with the ad markers in the output.
       *
       * Value description:
       *
       * * `Binary` - The SCTE-35 marker is expressed as a hex-string (Base64 string) rather than
       * full XML.
       * * `XML` - The SCTE marker is expressed fully in XML.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-sctedash.html#cfn-mediapackagev2-originendpoint-sctedash-admarkerdash)
       */
      override fun adMarkerDash(): String? = unwrap(this).getAdMarkerDash()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScteDashProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteDashProperty):
          ScteDashProperty = CdkObjectWrappers.wrap(cdkObject) as? ScteDashProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScteDashProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteDashProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteDashProperty
    }
  }

  /**
   * The SCTE-35 HLS configuration associated with the origin endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * ScteHlsProperty scteHlsProperty = ScteHlsProperty.builder()
   * .adMarkerHls("adMarkerHls")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-sctehls.html)
   */
  public interface ScteHlsProperty {
    /**
     * The SCTE-35 HLS ad-marker configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-sctehls.html#cfn-mediapackagev2-originendpoint-sctehls-admarkerhls)
     */
    public fun adMarkerHls(): String? = unwrap(this).getAdMarkerHls()

    /**
     * A builder for [ScteHlsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param adMarkerHls The SCTE-35 HLS ad-marker configuration.
       */
      public fun adMarkerHls(adMarkerHls: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty.Builder =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty.builder()

      /**
       * @param adMarkerHls The SCTE-35 HLS ad-marker configuration.
       */
      override fun adMarkerHls(adMarkerHls: String) {
        cdkBuilder.adMarkerHls(adMarkerHls)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty,
    ) : CdkObject(cdkObject),
        ScteHlsProperty {
      /**
       * The SCTE-35 HLS ad-marker configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-sctehls.html#cfn-mediapackagev2-originendpoint-sctehls-admarkerhls)
       */
      override fun adMarkerHls(): String? = unwrap(this).getAdMarkerHls()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScteHlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty):
          ScteHlsProperty = CdkObjectWrappers.wrap(cdkObject) as? ScteHlsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScteHlsProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty
    }
  }

  /**
   * The SCTE-35 configuration associated with the origin endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * ScteProperty scteProperty = ScteProperty.builder()
   * .scteFilter(List.of("scteFilter"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-scte.html)
   */
  public interface ScteProperty {
    /**
     * The filter associated with the SCTE-35 configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-scte.html#cfn-mediapackagev2-originendpoint-scte-sctefilter)
     */
    public fun scteFilter(): List<String> = unwrap(this).getScteFilter() ?: emptyList()

    /**
     * A builder for [ScteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param scteFilter The filter associated with the SCTE-35 configuration.
       */
      public fun scteFilter(scteFilter: List<String>)

      /**
       * @param scteFilter The filter associated with the SCTE-35 configuration.
       */
      public fun scteFilter(vararg scteFilter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty.Builder =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty.builder()

      /**
       * @param scteFilter The filter associated with the SCTE-35 configuration.
       */
      override fun scteFilter(scteFilter: List<String>) {
        cdkBuilder.scteFilter(scteFilter)
      }

      /**
       * @param scteFilter The filter associated with the SCTE-35 configuration.
       */
      override fun scteFilter(vararg scteFilter: String): Unit = scteFilter(scteFilter.toList())

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty,
    ) : CdkObject(cdkObject),
        ScteProperty {
      /**
       * The filter associated with the SCTE-35 configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-scte.html#cfn-mediapackagev2-originendpoint-scte-sctefilter)
       */
      override fun scteFilter(): List<String> = unwrap(this).getScteFilter() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty):
          ScteProperty = CdkObjectWrappers.wrap(cdkObject) as? ScteProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScteProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty
    }
  }

  /**
   * The segment configuration, including the segment name, duration, and other configuration
   * values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * SegmentProperty segmentProperty = SegmentProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html)
   */
  public interface SegmentProperty {
    /**
     * Whether to use encryption for the segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-encryption)
     */
    public fun encryption(): Any? = unwrap(this).getEncryption()

    /**
     * Whether the segment includes I-frame-only streams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-includeiframeonlystreams)
     */
    public fun includeIframeOnlyStreams(): Any? = unwrap(this).getIncludeIframeOnlyStreams()

    /**
     * The SCTE-35 configuration associated with the segment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-scte)
     */
    public fun scte(): Any? = unwrap(this).getScte()

    /**
     * The duration of the segment, in seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-segmentdurationseconds)
     */
    public fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

    /**
     * The name of the segment associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-segmentname)
     */
    public fun segmentName(): String? = unwrap(this).getSegmentName()

    /**
     * Whether the segment includes DVB subtitles.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-tsincludedvbsubtitles)
     */
    public fun tsIncludeDvbSubtitles(): Any? = unwrap(this).getTsIncludeDvbSubtitles()

    /**
     * Whether the segment is an audio rendition group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-tsuseaudiorenditiongroup)
     */
    public fun tsUseAudioRenditionGroup(): Any? = unwrap(this).getTsUseAudioRenditionGroup()

    /**
     * A builder for [SegmentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param encryption Whether to use encryption for the segment.
       */
      public fun encryption(encryption: IResolvable)

      /**
       * @param encryption Whether to use encryption for the segment.
       */
      public fun encryption(encryption: EncryptionProperty)

      /**
       * @param encryption Whether to use encryption for the segment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d1bec01a89747d6578cae965850636a5d90e9195105ca0248e95860ef7b6bd1")
      public fun encryption(encryption: EncryptionProperty.Builder.() -> Unit)

      /**
       * @param includeIframeOnlyStreams Whether the segment includes I-frame-only streams.
       */
      public fun includeIframeOnlyStreams(includeIframeOnlyStreams: Boolean)

      /**
       * @param includeIframeOnlyStreams Whether the segment includes I-frame-only streams.
       */
      public fun includeIframeOnlyStreams(includeIframeOnlyStreams: IResolvable)

      /**
       * @param scte The SCTE-35 configuration associated with the segment.
       */
      public fun scte(scte: IResolvable)

      /**
       * @param scte The SCTE-35 configuration associated with the segment.
       */
      public fun scte(scte: ScteProperty)

      /**
       * @param scte The SCTE-35 configuration associated with the segment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2dfdadafc1cbc1040d7aee7c3c4106e426cdf53444c360acf09caa8bd35ba364")
      public fun scte(scte: ScteProperty.Builder.() -> Unit)

      /**
       * @param segmentDurationSeconds The duration of the segment, in seconds.
       */
      public fun segmentDurationSeconds(segmentDurationSeconds: Number)

      /**
       * @param segmentName The name of the segment associated with the origin endpoint.
       */
      public fun segmentName(segmentName: String)

      /**
       * @param tsIncludeDvbSubtitles Whether the segment includes DVB subtitles.
       */
      public fun tsIncludeDvbSubtitles(tsIncludeDvbSubtitles: Boolean)

      /**
       * @param tsIncludeDvbSubtitles Whether the segment includes DVB subtitles.
       */
      public fun tsIncludeDvbSubtitles(tsIncludeDvbSubtitles: IResolvable)

      /**
       * @param tsUseAudioRenditionGroup Whether the segment is an audio rendition group.
       */
      public fun tsUseAudioRenditionGroup(tsUseAudioRenditionGroup: Boolean)

      /**
       * @param tsUseAudioRenditionGroup Whether the segment is an audio rendition group.
       */
      public fun tsUseAudioRenditionGroup(tsUseAudioRenditionGroup: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty.Builder =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty.builder()

      /**
       * @param encryption Whether to use encryption for the segment.
       */
      override fun encryption(encryption: IResolvable) {
        cdkBuilder.encryption(encryption.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param encryption Whether to use encryption for the segment.
       */
      override fun encryption(encryption: EncryptionProperty) {
        cdkBuilder.encryption(encryption.let(EncryptionProperty.Companion::unwrap))
      }

      /**
       * @param encryption Whether to use encryption for the segment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d1bec01a89747d6578cae965850636a5d90e9195105ca0248e95860ef7b6bd1")
      override fun encryption(encryption: EncryptionProperty.Builder.() -> Unit): Unit =
          encryption(EncryptionProperty(encryption))

      /**
       * @param includeIframeOnlyStreams Whether the segment includes I-frame-only streams.
       */
      override fun includeIframeOnlyStreams(includeIframeOnlyStreams: Boolean) {
        cdkBuilder.includeIframeOnlyStreams(includeIframeOnlyStreams)
      }

      /**
       * @param includeIframeOnlyStreams Whether the segment includes I-frame-only streams.
       */
      override fun includeIframeOnlyStreams(includeIframeOnlyStreams: IResolvable) {
        cdkBuilder.includeIframeOnlyStreams(includeIframeOnlyStreams.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param scte The SCTE-35 configuration associated with the segment.
       */
      override fun scte(scte: IResolvable) {
        cdkBuilder.scte(scte.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param scte The SCTE-35 configuration associated with the segment.
       */
      override fun scte(scte: ScteProperty) {
        cdkBuilder.scte(scte.let(ScteProperty.Companion::unwrap))
      }

      /**
       * @param scte The SCTE-35 configuration associated with the segment.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2dfdadafc1cbc1040d7aee7c3c4106e426cdf53444c360acf09caa8bd35ba364")
      override fun scte(scte: ScteProperty.Builder.() -> Unit): Unit = scte(ScteProperty(scte))

      /**
       * @param segmentDurationSeconds The duration of the segment, in seconds.
       */
      override fun segmentDurationSeconds(segmentDurationSeconds: Number) {
        cdkBuilder.segmentDurationSeconds(segmentDurationSeconds)
      }

      /**
       * @param segmentName The name of the segment associated with the origin endpoint.
       */
      override fun segmentName(segmentName: String) {
        cdkBuilder.segmentName(segmentName)
      }

      /**
       * @param tsIncludeDvbSubtitles Whether the segment includes DVB subtitles.
       */
      override fun tsIncludeDvbSubtitles(tsIncludeDvbSubtitles: Boolean) {
        cdkBuilder.tsIncludeDvbSubtitles(tsIncludeDvbSubtitles)
      }

      /**
       * @param tsIncludeDvbSubtitles Whether the segment includes DVB subtitles.
       */
      override fun tsIncludeDvbSubtitles(tsIncludeDvbSubtitles: IResolvable) {
        cdkBuilder.tsIncludeDvbSubtitles(tsIncludeDvbSubtitles.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tsUseAudioRenditionGroup Whether the segment is an audio rendition group.
       */
      override fun tsUseAudioRenditionGroup(tsUseAudioRenditionGroup: Boolean) {
        cdkBuilder.tsUseAudioRenditionGroup(tsUseAudioRenditionGroup)
      }

      /**
       * @param tsUseAudioRenditionGroup Whether the segment is an audio rendition group.
       */
      override fun tsUseAudioRenditionGroup(tsUseAudioRenditionGroup: IResolvable) {
        cdkBuilder.tsUseAudioRenditionGroup(tsUseAudioRenditionGroup.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty,
    ) : CdkObject(cdkObject),
        SegmentProperty {
      /**
       * Whether to use encryption for the segment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-encryption)
       */
      override fun encryption(): Any? = unwrap(this).getEncryption()

      /**
       * Whether the segment includes I-frame-only streams.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-includeiframeonlystreams)
       */
      override fun includeIframeOnlyStreams(): Any? = unwrap(this).getIncludeIframeOnlyStreams()

      /**
       * The SCTE-35 configuration associated with the segment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-scte)
       */
      override fun scte(): Any? = unwrap(this).getScte()

      /**
       * The duration of the segment, in seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-segmentdurationseconds)
       */
      override fun segmentDurationSeconds(): Number? = unwrap(this).getSegmentDurationSeconds()

      /**
       * The name of the segment associated with the origin endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-segmentname)
       */
      override fun segmentName(): String? = unwrap(this).getSegmentName()

      /**
       * Whether the segment includes DVB subtitles.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-tsincludedvbsubtitles)
       */
      override fun tsIncludeDvbSubtitles(): Any? = unwrap(this).getTsIncludeDvbSubtitles()

      /**
       * Whether the segment is an audio rendition group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-segment.html#cfn-mediapackagev2-originendpoint-segment-tsuseaudiorenditiongroup)
       */
      override fun tsUseAudioRenditionGroup(): Any? = unwrap(this).getTsUseAudioRenditionGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SegmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty):
          SegmentProperty = CdkObjectWrappers.wrap(cdkObject) as? SegmentProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SegmentProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty
    }
  }

  /**
   * The parameters for the SPEKE key provider.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * SpekeKeyProviderProperty spekeKeyProviderProperty = SpekeKeyProviderProperty.builder()
   * .drmSystems(List.of("drmSystems"))
   * .encryptionContractConfiguration(EncryptionContractConfigurationProperty.builder()
   * .presetSpeke20Audio("presetSpeke20Audio")
   * .presetSpeke20Video("presetSpeke20Video")
   * .build())
   * .resourceId("resourceId")
   * .roleArn("roleArn")
   * .url("url")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-spekekeyprovider.html)
   */
  public interface SpekeKeyProviderProperty {
    /**
     * The DRM solution provider you're using to protect your content during distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-spekekeyprovider.html#cfn-mediapackagev2-originendpoint-spekekeyprovider-drmsystems)
     */
    public fun drmSystems(): List<String>

    /**
     * The encryption contract configuration associated with the SPEKE key provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-spekekeyprovider.html#cfn-mediapackagev2-originendpoint-spekekeyprovider-encryptioncontractconfiguration)
     */
    public fun encryptionContractConfiguration(): Any

    /**
     * The unique identifier for the content.
     *
     * The service sends this identifier to the key server to identify the current endpoint. How
     * unique you make this identifier depends on how fine-grained you want access controls to be. The
     * service does not permit you to use the same ID for two simultaneous encryption processes. The
     * resource ID is also known as the content ID.
     *
     * The following example shows a resource ID: `MovieNight20171126093045`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-spekekeyprovider.html#cfn-mediapackagev2-originendpoint-spekekeyprovider-resourceid)
     */
    public fun resourceId(): String

    /**
     * The ARN for the IAM role granted by the key provider that provides access to the key provider
     * API.
     *
     * This role must have a trust policy that allows MediaPackage to assume the role, and it must
     * have a sufficient permissions policy to allow access to the specific key retrieval URL. Get this
     * from your DRM solution provider.
     *
     * Valid format: `arn:aws:iam::{accountID}:role/{name}` . The following example shows a role
     * ARN: `arn:aws:iam::444455556666:role/SpekeAccess`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-spekekeyprovider.html#cfn-mediapackagev2-originendpoint-spekekeyprovider-rolearn)
     */
    public fun roleArn(): String

    /**
     * The URL of the SPEKE key provider.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-spekekeyprovider.html#cfn-mediapackagev2-originendpoint-spekekeyprovider-url)
     */
    public fun url(): String

    /**
     * A builder for [SpekeKeyProviderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param drmSystems The DRM solution provider you're using to protect your content during
       * distribution. 
       */
      public fun drmSystems(drmSystems: List<String>)

      /**
       * @param drmSystems The DRM solution provider you're using to protect your content during
       * distribution. 
       */
      public fun drmSystems(vararg drmSystems: String)

      /**
       * @param encryptionContractConfiguration The encryption contract configuration associated
       * with the SPEKE key provider. 
       */
      public fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable)

      /**
       * @param encryptionContractConfiguration The encryption contract configuration associated
       * with the SPEKE key provider. 
       */
      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty)

      /**
       * @param encryptionContractConfiguration The encryption contract configuration associated
       * with the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9db9cff9bfbd8728fd67b1051dc3470d4e32793577b17a37cad937f99ec96867")
      public
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty.Builder.() -> Unit)

      /**
       * @param resourceId The unique identifier for the content. 
       * The service sends this identifier to the key server to identify the current endpoint. How
       * unique you make this identifier depends on how fine-grained you want access controls to be.
       * The service does not permit you to use the same ID for two simultaneous encryption processes.
       * The resource ID is also known as the content ID.
       *
       * The following example shows a resource ID: `MovieNight20171126093045`
       */
      public fun resourceId(resourceId: String)

      /**
       * @param roleArn The ARN for the IAM role granted by the key provider that provides access to
       * the key provider API. 
       * This role must have a trust policy that allows MediaPackage to assume the role, and it must
       * have a sufficient permissions policy to allow access to the specific key retrieval URL. Get
       * this from your DRM solution provider.
       *
       * Valid format: `arn:aws:iam::{accountID}:role/{name}` . The following example shows a role
       * ARN: `arn:aws:iam::444455556666:role/SpekeAccess`
       */
      public fun roleArn(roleArn: String)

      /**
       * @param url The URL of the SPEKE key provider. 
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty.builder()

      /**
       * @param drmSystems The DRM solution provider you're using to protect your content during
       * distribution. 
       */
      override fun drmSystems(drmSystems: List<String>) {
        cdkBuilder.drmSystems(drmSystems)
      }

      /**
       * @param drmSystems The DRM solution provider you're using to protect your content during
       * distribution. 
       */
      override fun drmSystems(vararg drmSystems: String): Unit = drmSystems(drmSystems.toList())

      /**
       * @param encryptionContractConfiguration The encryption contract configuration associated
       * with the SPEKE key provider. 
       */
      override fun encryptionContractConfiguration(encryptionContractConfiguration: IResolvable) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param encryptionContractConfiguration The encryption contract configuration associated
       * with the SPEKE key provider. 
       */
      override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(EncryptionContractConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param encryptionContractConfiguration The encryption contract configuration associated
       * with the SPEKE key provider. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9db9cff9bfbd8728fd67b1051dc3470d4e32793577b17a37cad937f99ec96867")
      override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty.Builder.() -> Unit):
          Unit =
          encryptionContractConfiguration(EncryptionContractConfigurationProperty(encryptionContractConfiguration))

      /**
       * @param resourceId The unique identifier for the content. 
       * The service sends this identifier to the key server to identify the current endpoint. How
       * unique you make this identifier depends on how fine-grained you want access controls to be.
       * The service does not permit you to use the same ID for two simultaneous encryption processes.
       * The resource ID is also known as the content ID.
       *
       * The following example shows a resource ID: `MovieNight20171126093045`
       */
      override fun resourceId(resourceId: String) {
        cdkBuilder.resourceId(resourceId)
      }

      /**
       * @param roleArn The ARN for the IAM role granted by the key provider that provides access to
       * the key provider API. 
       * This role must have a trust policy that allows MediaPackage to assume the role, and it must
       * have a sufficient permissions policy to allow access to the specific key retrieval URL. Get
       * this from your DRM solution provider.
       *
       * Valid format: `arn:aws:iam::{accountID}:role/{name}` . The following example shows a role
       * ARN: `arn:aws:iam::444455556666:role/SpekeAccess`
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      /**
       * @param url The URL of the SPEKE key provider. 
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty,
    ) : CdkObject(cdkObject),
        SpekeKeyProviderProperty {
      /**
       * The DRM solution provider you're using to protect your content during distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-spekekeyprovider.html#cfn-mediapackagev2-originendpoint-spekekeyprovider-drmsystems)
       */
      override fun drmSystems(): List<String> = unwrap(this).getDrmSystems()

      /**
       * The encryption contract configuration associated with the SPEKE key provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-spekekeyprovider.html#cfn-mediapackagev2-originendpoint-spekekeyprovider-encryptioncontractconfiguration)
       */
      override fun encryptionContractConfiguration(): Any =
          unwrap(this).getEncryptionContractConfiguration()

      /**
       * The unique identifier for the content.
       *
       * The service sends this identifier to the key server to identify the current endpoint. How
       * unique you make this identifier depends on how fine-grained you want access controls to be.
       * The service does not permit you to use the same ID for two simultaneous encryption processes.
       * The resource ID is also known as the content ID.
       *
       * The following example shows a resource ID: `MovieNight20171126093045`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-spekekeyprovider.html#cfn-mediapackagev2-originendpoint-spekekeyprovider-resourceid)
       */
      override fun resourceId(): String = unwrap(this).getResourceId()

      /**
       * The ARN for the IAM role granted by the key provider that provides access to the key
       * provider API.
       *
       * This role must have a trust policy that allows MediaPackage to assume the role, and it must
       * have a sufficient permissions policy to allow access to the specific key retrieval URL. Get
       * this from your DRM solution provider.
       *
       * Valid format: `arn:aws:iam::{accountID}:role/{name}` . The following example shows a role
       * ARN: `arn:aws:iam::444455556666:role/SpekeAccess`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-spekekeyprovider.html#cfn-mediapackagev2-originendpoint-spekekeyprovider-rolearn)
       */
      override fun roleArn(): String = unwrap(this).getRoleArn()

      /**
       * The URL of the SPEKE key provider.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-spekekeyprovider.html#cfn-mediapackagev2-originendpoint-spekekeyprovider-url)
       */
      override fun url(): String = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpekeKeyProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty):
          SpekeKeyProviderProperty = CdkObjectWrappers.wrap(cdkObject) as? SpekeKeyProviderProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpekeKeyProviderProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty
    }
  }

  /**
   * To insert an EXT-X-START tag in your HLS playlist, specify a StartTag configuration object with
   * a valid TimeOffset.
   *
   * When you do, you can also optionally specify whether to include a PRECISE value in the
   * EXT-X-START tag.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.mediapackagev2.*;
   * StartTagProperty startTagProperty = StartTagProperty.builder()
   * .timeOffset(123)
   * // the properties below are optional
   * .precise(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-starttag.html)
   */
  public interface StartTagProperty {
    /**
     * Specify the value for PRECISE within your EXT-X-START tag.
     *
     * Leave blank, or choose false, to use the default value NO. Choose yes to use the value YES.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-starttag.html#cfn-mediapackagev2-originendpoint-starttag-precise)
     */
    public fun precise(): Any? = unwrap(this).getPrecise()

    /**
     * Specify the value for TIME-OFFSET within your EXT-X-START tag.
     *
     * Enter a signed floating point value which, if positive, must be less than the configured
     * manifest duration minus three times the configured segment target duration. If negative, the
     * absolute value must be larger than three times the configured segment target duration, and the
     * absolute value must be smaller than the configured manifest duration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-starttag.html#cfn-mediapackagev2-originendpoint-starttag-timeoffset)
     */
    public fun timeOffset(): Number

    /**
     * A builder for [StartTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param precise Specify the value for PRECISE within your EXT-X-START tag.
       * Leave blank, or choose false, to use the default value NO. Choose yes to use the value YES.
       */
      public fun precise(precise: Boolean)

      /**
       * @param precise Specify the value for PRECISE within your EXT-X-START tag.
       * Leave blank, or choose false, to use the default value NO. Choose yes to use the value YES.
       */
      public fun precise(precise: IResolvable)

      /**
       * @param timeOffset Specify the value for TIME-OFFSET within your EXT-X-START tag. 
       * Enter a signed floating point value which, if positive, must be less than the configured
       * manifest duration minus three times the configured segment target duration. If negative, the
       * absolute value must be larger than three times the configured segment target duration, and the
       * absolute value must be smaller than the configured manifest duration.
       */
      public fun timeOffset(timeOffset: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.StartTagProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.StartTagProperty.builder()

      /**
       * @param precise Specify the value for PRECISE within your EXT-X-START tag.
       * Leave blank, or choose false, to use the default value NO. Choose yes to use the value YES.
       */
      override fun precise(precise: Boolean) {
        cdkBuilder.precise(precise)
      }

      /**
       * @param precise Specify the value for PRECISE within your EXT-X-START tag.
       * Leave blank, or choose false, to use the default value NO. Choose yes to use the value YES.
       */
      override fun precise(precise: IResolvable) {
        cdkBuilder.precise(precise.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param timeOffset Specify the value for TIME-OFFSET within your EXT-X-START tag. 
       * Enter a signed floating point value which, if positive, must be less than the configured
       * manifest duration minus three times the configured segment target duration. If negative, the
       * absolute value must be larger than three times the configured segment target duration, and the
       * absolute value must be smaller than the configured manifest duration.
       */
      override fun timeOffset(timeOffset: Number) {
        cdkBuilder.timeOffset(timeOffset)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.StartTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.StartTagProperty,
    ) : CdkObject(cdkObject),
        StartTagProperty {
      /**
       * Specify the value for PRECISE within your EXT-X-START tag.
       *
       * Leave blank, or choose false, to use the default value NO. Choose yes to use the value YES.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-starttag.html#cfn-mediapackagev2-originendpoint-starttag-precise)
       */
      override fun precise(): Any? = unwrap(this).getPrecise()

      /**
       * Specify the value for TIME-OFFSET within your EXT-X-START tag.
       *
       * Enter a signed floating point value which, if positive, must be less than the configured
       * manifest duration minus three times the configured segment target duration. If negative, the
       * absolute value must be larger than three times the configured segment target duration, and the
       * absolute value must be smaller than the configured manifest duration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-starttag.html#cfn-mediapackagev2-originendpoint-starttag-timeoffset)
       */
      override fun timeOffset(): Number = unwrap(this).getTimeOffset()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StartTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.StartTagProperty):
          StartTagProperty = CdkObjectWrappers.wrap(cdkObject) as? StartTagProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StartTagProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.StartTagProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.StartTagProperty
    }
  }
}
