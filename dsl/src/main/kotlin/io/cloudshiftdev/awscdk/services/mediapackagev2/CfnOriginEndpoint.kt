package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnOriginEndpoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) of the origin endpoint.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The timestamp of the creation of the origin endpoint.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

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
  public open fun containerType(): String? = unwrap(this).getContainerType()

  /**
   * The container type associated with the origin endpoint configuration.
   */
  public open fun containerType(`value`: String) {
    unwrap(this).setContainerType(`value`)
  }

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
   * The HLS manfiests associated with the origin endpoint configuration.
   */
  public open fun hlsManifests(): Any? = unwrap(this).getHlsManifests()

  /**
   * The HLS manfiests associated with the origin endpoint configuration.
   */
  public open fun hlsManifests(`value`: IResolvable) {
    unwrap(this).setHlsManifests(`value`.let(IResolvable::unwrap))
  }

  /**
   * The HLS manfiests associated with the origin endpoint configuration.
   */
  public open fun hlsManifests(__idx_ac66f0: List<Any>) {
    unwrap(this).setHlsManifests(__idx_ac66f0)
  }

  /**
   * The HLS manfiests associated with the origin endpoint configuration.
   */
  public open fun hlsManifests(vararg __idx_ac66f0: Any): Unit = hlsManifests(__idx_ac66f0.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
   */
  public open fun lowLatencyHlsManifests(): Any? = unwrap(this).getLowLatencyHlsManifests()

  /**
   * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
   */
  public open fun lowLatencyHlsManifests(`value`: IResolvable) {
    unwrap(this).setLowLatencyHlsManifests(`value`.let(IResolvable::unwrap))
  }

  /**
   * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
   */
  public open fun lowLatencyHlsManifests(__idx_ac66f0: List<Any>) {
    unwrap(this).setLowLatencyHlsManifests(__idx_ac66f0)
  }

  /**
   * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
   */
  public open fun lowLatencyHlsManifests(vararg __idx_ac66f0: Any): Unit =
      lowLatencyHlsManifests(__idx_ac66f0.toList())

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
    unwrap(this).setSegment(`value`.let(IResolvable::unwrap))
  }

  /**
   * The segment associated with the origin endpoint.
   */
  public open fun segment(`value`: SegmentProperty) {
    unwrap(this).setSegment(`value`.let(SegmentProperty::unwrap))
  }

  /**
   * The segment associated with the origin endpoint.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
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
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
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
     * The description associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-description)
     * @param description The description associated with the origin endpoint. 
     */
    public fun description(description: String)

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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
     * The description associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-description)
     * @param description The description associated with the origin endpoint. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The HLS manfiests associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-hlsmanifests)
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration. 
     */
    override fun hlsManifests(hlsManifests: IResolvable) {
      cdkBuilder.hlsManifests(hlsManifests.let(IResolvable::unwrap))
    }

    /**
     * The HLS manfiests associated with the origin endpoint configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-hlsmanifests)
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration. 
     */
    override fun hlsManifests(hlsManifests: List<Any>) {
      cdkBuilder.hlsManifests(hlsManifests)
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
      cdkBuilder.lowLatencyHlsManifests(lowLatencyHlsManifests.let(IResolvable::unwrap))
    }

    /**
     * The low-latency HLS (LL-HLS) manifests associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifests)
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint. 
     */
    override fun lowLatencyHlsManifests(lowLatencyHlsManifests: List<Any>) {
      cdkBuilder.lowLatencyHlsManifests(lowLatencyHlsManifests)
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
      cdkBuilder.segment(segment.let(IResolvable::unwrap))
    }

    /**
     * The segment associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-segment)
     * @param segment The segment associated with the origin endpoint. 
     */
    override fun segment(segment: SegmentProperty) {
      cdkBuilder.segment(segment.let(SegmentProperty::unwrap))
    }

    /**
     * The segment associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-segment)
     * @param segment The segment associated with the origin endpoint. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
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
    init {

    }

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
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint = wrapped.cdkObject
  }

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

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty,
    ) : EncryptionMethodProperty {
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
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionMethodProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty):
          EncryptionMethodProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionMethodProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionMethodProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface FilterConfigurationProperty {
    /**
     * Optionally specify the end time for all of your manifest egress requests.
     *
     * When you include end time, note that you cannot use end time query parameters for this
     * manifest's endpoint URL.</p>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-end)
     */
    public fun end(): String? = unwrap(this).getEnd()

    /**
     * Optionally specify one or more manifest filters for all of your manifest egress requests.
     *
     * When you include a manifest filter, note that you cannot use an identical manifest filter
     * query parameter for this manifest's endpoint URL.</p>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-manifestfilter)
     */
    public fun manifestFilter(): String? = unwrap(this).getManifestFilter()

    /**
     * Optionally specify the start time for all of your manifest egress requests.
     *
     * When you include start time, note that you cannot use start time query parameters for this
     * manifest's endpoint URL.</p>
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-start)
     */
    public fun start(): String? = unwrap(this).getStart()

    /**
     * Optionally specify the time delay for all of your manifest egress requests.
     *
     * Enter a value that is smaller than your endpoint's startover window. When you include time
     * delay, note that you cannot use time delay query parameters for this manifest's endpoint
     * URL.</p>
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
       * @param end Optionally specify the end time for all of your manifest egress requests.
       * When you include end time, note that you cannot use end time query parameters for this
       * manifest's endpoint URL.</p>
       */
      public fun end(end: String)

      /**
       * @param manifestFilter Optionally specify one or more manifest filters for all of your
       * manifest egress requests.
       * When you include a manifest filter, note that you cannot use an identical manifest filter
       * query parameter for this manifest's endpoint URL.</p>
       */
      public fun manifestFilter(manifestFilter: String)

      /**
       * @param start Optionally specify the start time for all of your manifest egress requests.
       * When you include start time, note that you cannot use start time query parameters for this
       * manifest's endpoint URL.</p>
       */
      public fun start(start: String)

      /**
       * @param timeDelaySeconds Optionally specify the time delay for all of your manifest egress
       * requests.
       * Enter a value that is smaller than your endpoint's startover window. When you include time
       * delay, note that you cannot use time delay query parameters for this manifest's endpoint
       * URL.</p>
       */
      public fun timeDelaySeconds(timeDelaySeconds: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty.builder()

      /**
       * @param end Optionally specify the end time for all of your manifest egress requests.
       * When you include end time, note that you cannot use end time query parameters for this
       * manifest's endpoint URL.</p>
       */
      override fun end(end: String) {
        cdkBuilder.end(end)
      }

      /**
       * @param manifestFilter Optionally specify one or more manifest filters for all of your
       * manifest egress requests.
       * When you include a manifest filter, note that you cannot use an identical manifest filter
       * query parameter for this manifest's endpoint URL.</p>
       */
      override fun manifestFilter(manifestFilter: String) {
        cdkBuilder.manifestFilter(manifestFilter)
      }

      /**
       * @param start Optionally specify the start time for all of your manifest egress requests.
       * When you include start time, note that you cannot use start time query parameters for this
       * manifest's endpoint URL.</p>
       */
      override fun start(start: String) {
        cdkBuilder.start(start)
      }

      /**
       * @param timeDelaySeconds Optionally specify the time delay for all of your manifest egress
       * requests.
       * Enter a value that is smaller than your endpoint's startover window. When you include time
       * delay, note that you cannot use time delay query parameters for this manifest's endpoint
       * URL.</p>
       */
      override fun timeDelaySeconds(timeDelaySeconds: Number) {
        cdkBuilder.timeDelaySeconds(timeDelaySeconds)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty,
    ) : FilterConfigurationProperty {
      /**
       * Optionally specify the end time for all of your manifest egress requests.
       *
       * When you include end time, note that you cannot use end time query parameters for this
       * manifest's endpoint URL.</p>
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-end)
       */
      override fun end(): String? = unwrap(this).getEnd()

      /**
       * Optionally specify one or more manifest filters for all of your manifest egress requests.
       *
       * When you include a manifest filter, note that you cannot use an identical manifest filter
       * query parameter for this manifest's endpoint URL.</p>
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-manifestfilter)
       */
      override fun manifestFilter(): String? = unwrap(this).getManifestFilter()

      /**
       * Optionally specify the start time for all of your manifest egress requests.
       *
       * When you include start time, note that you cannot use start time query parameters for this
       * manifest's endpoint URL.</p>
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-start)
       */
      override fun start(): String? = unwrap(this).getStart()

      /**
       * Optionally specify the time delay for all of your manifest egress requests.
       *
       * Enter a value that is smaller than your endpoint's startover window. When you include time
       * delay, note that you cannot use time delay query parameters for this manifest's endpoint
       * URL.</p>
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-filterconfiguration.html#cfn-mediapackagev2-originendpoint-filterconfiguration-timedelayseconds)
       */
      override fun timeDelaySeconds(): Number? = unwrap(this).getTimeDelaySeconds()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty):
          FilterConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.FilterConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionContractConfiguration The encryption contract configuration associated
       * with the SPEKE key provider. 
       */
      override
          fun encryptionContractConfiguration(encryptionContractConfiguration: EncryptionContractConfigurationProperty) {
        cdkBuilder.encryptionContractConfiguration(encryptionContractConfiguration.let(EncryptionContractConfigurationProperty::unwrap))
      }

      /**
       * @param encryptionContractConfiguration The encryption contract configuration associated
       * with the SPEKE key provider. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty,
    ) : SpekeKeyProviderProperty {
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
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SpekeKeyProviderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty):
          SpekeKeyProviderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SpekeKeyProviderProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SpekeKeyProviderProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

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

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty,
    ) : ScteHlsProperty {
      /**
       * The SCTE-35 HLS ad-marker configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-sctehls.html#cfn-mediapackagev2-originendpoint-sctehls-admarkerhls)
       */
      override fun adMarkerHls(): String? = unwrap(this).getAdMarkerHls()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScteHlsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty):
          ScteHlsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScteHlsProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteHlsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

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
       */
      override fun presetSpeke20Video(presetSpeke20Video: String) {
        cdkBuilder.presetSpeke20Video(presetSpeke20Video)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty,
    ) : EncryptionContractConfigurationProperty {
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-encryptioncontractconfiguration.html#cfn-mediapackagev2-originendpoint-encryptioncontractconfiguration-presetspeke20video)
       */
      override fun presetSpeke20Video(): String = unwrap(this).getPresetSpeke20Video()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EncryptionContractConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty):
          EncryptionContractConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionContractConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionContractConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c2552766ba01398d4ac04c908b00e89fb7ee64b4c6f9a85ed57ecc63df313fc")
      public fun scteHls(scteHls: ScteHlsProperty.Builder.() -> Unit)

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
        cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      override fun filterConfiguration(filterConfiguration: FilterConfigurationProperty) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(FilterConfigurationProperty::unwrap))
      }

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.scteHls(scteHls.let(IResolvable::unwrap))
      }

      /**
       * @param scteHls THE SCTE-35 HLS configuration associated with the HLS manifest
       * configuration.
       */
      override fun scteHls(scteHls: ScteHlsProperty) {
        cdkBuilder.scteHls(scteHls.let(ScteHlsProperty::unwrap))
      }

      /**
       * @param scteHls THE SCTE-35 HLS configuration associated with the HLS manifest
       * configuration.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8c2552766ba01398d4ac04c908b00e89fb7ee64b4c6f9a85ed57ecc63df313fc")
      override fun scteHls(scteHls: ScteHlsProperty.Builder.() -> Unit): Unit =
          scteHls(ScteHlsProperty(scteHls))

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

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty,
    ) : HlsManifestConfigurationProperty {
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
       * The URL of the HLS manifest configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-hlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-hlsmanifestconfiguration-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsManifestConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty):
          HlsManifestConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsManifestConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.HlsManifestConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.encryption(encryption.let(IResolvable::unwrap))
      }

      /**
       * @param encryption Whether to use encryption for the segment.
       */
      override fun encryption(encryption: EncryptionProperty) {
        cdkBuilder.encryption(encryption.let(EncryptionProperty::unwrap))
      }

      /**
       * @param encryption Whether to use encryption for the segment.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.includeIframeOnlyStreams(includeIframeOnlyStreams.let(IResolvable::unwrap))
      }

      /**
       * @param scte The SCTE-35 configuration associated with the segment.
       */
      override fun scte(scte: IResolvable) {
        cdkBuilder.scte(scte.let(IResolvable::unwrap))
      }

      /**
       * @param scte The SCTE-35 configuration associated with the segment.
       */
      override fun scte(scte: ScteProperty) {
        cdkBuilder.scte(scte.let(ScteProperty::unwrap))
      }

      /**
       * @param scte The SCTE-35 configuration associated with the segment.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.tsIncludeDvbSubtitles(tsIncludeDvbSubtitles.let(IResolvable::unwrap))
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
        cdkBuilder.tsUseAudioRenditionGroup(tsUseAudioRenditionGroup.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty,
    ) : SegmentProperty {
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
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SegmentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty):
          SegmentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SegmentProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.SegmentProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

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
     * in the playback timeline on the player. `ID3Timed` metadata messages generate every 5 seconds
     * whenever MediaPackage ingests the content.
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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
       * time in the playback timeline on the player. `ID3Timed` metadata messages generate every 5
       * seconds whenever MediaPackage ingests the content.
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
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("687f873b6a36ecb424fbd5ad87d30682ab0a19e26a068ecafd0eab5823883846")
      public fun scteHls(scteHls: ScteHlsProperty.Builder.() -> Unit)

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
        cdkBuilder.filterConfiguration(filterConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      override fun filterConfiguration(filterConfiguration: FilterConfigurationProperty) {
        cdkBuilder.filterConfiguration(filterConfiguration.let(FilterConfigurationProperty::unwrap))
      }

      /**
       * @param filterConfiguration Filter configuration includes settings for manifest filtering,
       * start and end times, and time delay that apply to all of your egress requests for this
       * manifest.
       * </p>
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
       * time in the playback timeline on the player. `ID3Timed` metadata messages generate every 5
       * seconds whenever MediaPackage ingests the content.
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
        cdkBuilder.scteHls(scteHls.let(IResolvable::unwrap))
      }

      /**
       * @param scteHls The SCTE-35 HLS configuration associated with the low-latency HLS (LL-HLS)
       * manifest configuration of the origin endpoint.
       */
      override fun scteHls(scteHls: ScteHlsProperty) {
        cdkBuilder.scteHls(scteHls.let(ScteHlsProperty::unwrap))
      }

      /**
       * @param scteHls The SCTE-35 HLS configuration associated with the low-latency HLS (LL-HLS)
       * manifest configuration of the origin endpoint.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("687f873b6a36ecb424fbd5ad87d30682ab0a19e26a068ecafd0eab5823883846")
      override fun scteHls(scteHls: ScteHlsProperty.Builder.() -> Unit): Unit =
          scteHls(ScteHlsProperty(scteHls))

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

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty,
    ) : LowLatencyHlsManifestConfigurationProperty {
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
       * time in the playback timeline on the player. `ID3Timed` metadata messages generate every 5
       * seconds whenever MediaPackage ingests the content.
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
       * The URL of the low-latency HLS (LL-HLS) manifest configuration of the origin endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration.html#cfn-mediapackagev2-originendpoint-lowlatencyhlsmanifestconfiguration-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          LowLatencyHlsManifestConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty):
          LowLatencyHlsManifestConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LowLatencyHlsManifestConfigurationProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.LowLatencyHlsManifestConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

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

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty,
    ) : ScteProperty {
      /**
       * The filter associated with the SCTE-35 configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackagev2-originendpoint-scte.html#cfn-mediapackagev2-originendpoint-scte-sctefilter)
       */
      override fun scteFilter(): List<String> = unwrap(this).getScteFilter() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty):
          ScteProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScteProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.ScteProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.encryptionMethod(encryptionMethod.let(IResolvable::unwrap))
      }

      /**
       * @param encryptionMethod The encryption method to use. 
       */
      override fun encryptionMethod(encryptionMethod: EncryptionMethodProperty) {
        cdkBuilder.encryptionMethod(encryptionMethod.let(EncryptionMethodProperty::unwrap))
      }

      /**
       * @param encryptionMethod The encryption method to use. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
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
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(IResolvable::unwrap))
      }

      /**
       * @param spekeKeyProvider The SPEKE key provider to use for encryption. 
       */
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty) {
        cdkBuilder.spekeKeyProvider(spekeKeyProvider.let(SpekeKeyProviderProperty::unwrap))
      }

      /**
       * @param spekeKeyProvider The SPEKE key provider to use for encryption. 
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("339a27bb3e0ef9f95e7b6f49e755e4597fbf8f1c92ea9044619c2c2b14273e17")
      override fun spekeKeyProvider(spekeKeyProvider: SpekeKeyProviderProperty.Builder.() -> Unit):
          Unit = spekeKeyProvider(SpekeKeyProviderProperty(spekeKeyProvider))

      public fun build():
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty,
    ) : EncryptionProperty {
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
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty):
          EncryptionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionProperty):
          software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpoint.EncryptionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
