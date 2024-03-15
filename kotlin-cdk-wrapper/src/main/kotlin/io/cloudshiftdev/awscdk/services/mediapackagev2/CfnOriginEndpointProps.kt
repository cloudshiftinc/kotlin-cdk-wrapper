@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.mediapackagev2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnOriginEndpointProps {
  public fun channelGroupName(): String

  public fun channelName(): String

  public fun containerType(): String? = unwrap(this).getContainerType()

  public fun description(): String? = unwrap(this).getDescription()

  public fun hlsManifests(): Any? = unwrap(this).getHlsManifests()

  public fun lowLatencyHlsManifests(): Any? = unwrap(this).getLowLatencyHlsManifests()

  public fun originEndpointName(): String

  public fun segment(): Any? = unwrap(this).getSegment()

  public fun startoverWindowSeconds(): Number? = unwrap(this).getStartoverWindowSeconds()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun channelGroupName(channelGroupName: String)

    public fun channelName(channelName: String)

    public fun containerType(containerType: String)

    public fun description(description: String)

    public fun hlsManifests(hlsManifests: IResolvable)

    public fun hlsManifests(hlsManifests: List<Any>)

    public fun hlsManifests(vararg hlsManifests: Any)

    public fun lowLatencyHlsManifests(lowLatencyHlsManifests: IResolvable)

    public fun lowLatencyHlsManifests(lowLatencyHlsManifests: List<Any>)

    public fun lowLatencyHlsManifests(vararg lowLatencyHlsManifests: Any)

    public fun originEndpointName(originEndpointName: String)

    public fun segment(segment: IResolvable)

    public fun segment(segment: CfnOriginEndpoint.SegmentProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e86ee5ecc961c4823782530ff9a2084097eff49277f28780bb7e9644d58774b4")
    public fun segment(segment: CfnOriginEndpoint.SegmentProperty.Builder.() -> Unit)

    public fun startoverWindowSeconds(startoverWindowSeconds: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps.Builder =
        software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps.builder()

    override fun channelGroupName(channelGroupName: String) {
      cdkBuilder.channelGroupName(channelGroupName)
    }

    override fun channelName(channelName: String) {
      cdkBuilder.channelName(channelName)
    }

    override fun containerType(containerType: String) {
      cdkBuilder.containerType(containerType)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun hlsManifests(hlsManifests: IResolvable) {
      cdkBuilder.hlsManifests(hlsManifests.let(IResolvable::unwrap))
    }

    override fun hlsManifests(hlsManifests: List<Any>) {
      cdkBuilder.hlsManifests(hlsManifests)
    }

    override fun hlsManifests(vararg hlsManifests: Any): Unit = hlsManifests(hlsManifests.toList())

    override fun lowLatencyHlsManifests(lowLatencyHlsManifests: IResolvable) {
      cdkBuilder.lowLatencyHlsManifests(lowLatencyHlsManifests.let(IResolvable::unwrap))
    }

    override fun lowLatencyHlsManifests(lowLatencyHlsManifests: List<Any>) {
      cdkBuilder.lowLatencyHlsManifests(lowLatencyHlsManifests)
    }

    override fun lowLatencyHlsManifests(vararg lowLatencyHlsManifests: Any): Unit =
        lowLatencyHlsManifests(lowLatencyHlsManifests.toList())

    override fun originEndpointName(originEndpointName: String) {
      cdkBuilder.originEndpointName(originEndpointName)
    }

    override fun segment(segment: IResolvable) {
      cdkBuilder.segment(segment.let(IResolvable::unwrap))
    }

    override fun segment(segment: CfnOriginEndpoint.SegmentProperty) {
      cdkBuilder.segment(segment.let(CfnOriginEndpoint.SegmentProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e86ee5ecc961c4823782530ff9a2084097eff49277f28780bb7e9644d58774b4")
    override fun segment(segment: CfnOriginEndpoint.SegmentProperty.Builder.() -> Unit): Unit =
        segment(CfnOriginEndpoint.SegmentProperty(segment))

    override fun startoverWindowSeconds(startoverWindowSeconds: Number) {
      cdkBuilder.startoverWindowSeconds(startoverWindowSeconds)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.mediapackagev2.CfnOriginEndpointProps,
  ) : CdkObject(cdkObject), CfnOriginEndpointProps {
    override fun channelGroupName(): String = unwrap(this).getChannelGroupName()

    override fun channelName(): String = unwrap(this).getChannelName()

    override fun containerType(): String? = unwrap(this).getContainerType()

    override fun description(): String? = unwrap(this).getDescription()

    override fun hlsManifests(): Any? = unwrap(this).getHlsManifests()

    override fun lowLatencyHlsManifests(): Any? = unwrap(this).getLowLatencyHlsManifests()

    override fun originEndpointName(): String = unwrap(this).getOriginEndpointName()

    override fun segment(): Any? = unwrap(this).getSegment()

    override fun startoverWindowSeconds(): Number? = unwrap(this).getStartoverWindowSeconds()

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
