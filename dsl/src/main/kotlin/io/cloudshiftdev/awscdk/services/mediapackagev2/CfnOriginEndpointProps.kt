package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

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
  public fun containerType(): String? = unwrap(this).getContainerType()

  /**
   * The description associated with the origin endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The HLS manfiests associated with the origin endpoint configuration.
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
     * @param description The description associated with the origin endpoint.
     */
    public fun description(description: String)

    /**
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration.
     */
    public fun hlsManifests(hlsManifests: IResolvable)

    /**
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration.
     */
    public fun hlsManifests(hlsManifests: List<Any>)

    /**
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration.
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
    @Suppress("INAPPLICABLE_JVM_NAME")
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
     * @param description The description associated with the origin endpoint.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration.
     */
    override fun hlsManifests(hlsManifests: IResolvable) {
      cdkBuilder.hlsManifests(hlsManifests.let(IResolvable::unwrap))
    }

    /**
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration.
     */
    override fun hlsManifests(hlsManifests: List<Any>) {
      cdkBuilder.hlsManifests(hlsManifests)
    }

    /**
     * @param hlsManifests The HLS manfiests associated with the origin endpoint configuration.
     */
    override fun hlsManifests(vararg hlsManifests: Any): Unit = hlsManifests(hlsManifests.toList())

    /**
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint.
     */
    override fun lowLatencyHlsManifests(lowLatencyHlsManifests: IResolvable) {
      cdkBuilder.lowLatencyHlsManifests(lowLatencyHlsManifests.let(IResolvable::unwrap))
    }

    /**
     * @param lowLatencyHlsManifests The low-latency HLS (LL-HLS) manifests associated with the
     * origin endpoint.
     */
    override fun lowLatencyHlsManifests(lowLatencyHlsManifests: List<Any>) {
      cdkBuilder.lowLatencyHlsManifests(lowLatencyHlsManifests)
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
      cdkBuilder.segment(segment.let(IResolvable::unwrap))
    }

    /**
     * @param segment The segment associated with the origin endpoint.
     */
    override fun segment(segment: CfnOriginEndpoint.SegmentProperty) {
      cdkBuilder.segment(segment.let(CfnOriginEndpoint.SegmentProperty::unwrap))
    }

    /**
     * @param segment The segment associated with the origin endpoint.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags associated with the origin endpoint.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps,
  ) : CdkObject(cdkObject), CfnOriginEndpointProps {
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
    override fun containerType(): String? = unwrap(this).getContainerType()

    /**
     * The description associated with the origin endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackagev2-originendpoint.html#cfn-mediapackagev2-originendpoint-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The HLS manfiests associated with the origin endpoint configuration.
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
        CfnOriginEndpointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnOriginEndpointProps):
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps
  }
}
