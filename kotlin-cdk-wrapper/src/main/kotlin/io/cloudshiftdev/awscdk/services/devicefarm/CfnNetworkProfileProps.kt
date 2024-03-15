@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnNetworkProfileProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun downlinkBandwidthBits(): Number? = unwrap(this).getDownlinkBandwidthBits()

  public fun downlinkDelayMs(): Number? = unwrap(this).getDownlinkDelayMs()

  public fun downlinkJitterMs(): Number? = unwrap(this).getDownlinkJitterMs()

  public fun downlinkLossPercent(): Number? = unwrap(this).getDownlinkLossPercent()

  public fun name(): String

  public fun projectArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun uplinkBandwidthBits(): Number? = unwrap(this).getUplinkBandwidthBits()

  public fun uplinkDelayMs(): Number? = unwrap(this).getUplinkDelayMs()

  public fun uplinkJitterMs(): Number? = unwrap(this).getUplinkJitterMs()

  public fun uplinkLossPercent(): Number? = unwrap(this).getUplinkLossPercent()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun downlinkBandwidthBits(downlinkBandwidthBits: Number)

    public fun downlinkDelayMs(downlinkDelayMs: Number)

    public fun downlinkJitterMs(downlinkJitterMs: Number)

    public fun downlinkLossPercent(downlinkLossPercent: Number)

    public fun name(name: String)

    public fun projectArn(projectArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun uplinkBandwidthBits(uplinkBandwidthBits: Number)

    public fun uplinkDelayMs(uplinkDelayMs: Number)

    public fun uplinkJitterMs(uplinkJitterMs: Number)

    public fun uplinkLossPercent(uplinkLossPercent: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps.Builder =
        software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun downlinkBandwidthBits(downlinkBandwidthBits: Number) {
      cdkBuilder.downlinkBandwidthBits(downlinkBandwidthBits)
    }

    override fun downlinkDelayMs(downlinkDelayMs: Number) {
      cdkBuilder.downlinkDelayMs(downlinkDelayMs)
    }

    override fun downlinkJitterMs(downlinkJitterMs: Number) {
      cdkBuilder.downlinkJitterMs(downlinkJitterMs)
    }

    override fun downlinkLossPercent(downlinkLossPercent: Number) {
      cdkBuilder.downlinkLossPercent(downlinkLossPercent)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun projectArn(projectArn: String) {
      cdkBuilder.projectArn(projectArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun uplinkBandwidthBits(uplinkBandwidthBits: Number) {
      cdkBuilder.uplinkBandwidthBits(uplinkBandwidthBits)
    }

    override fun uplinkDelayMs(uplinkDelayMs: Number) {
      cdkBuilder.uplinkDelayMs(uplinkDelayMs)
    }

    override fun uplinkJitterMs(uplinkJitterMs: Number) {
      cdkBuilder.uplinkJitterMs(uplinkJitterMs)
    }

    override fun uplinkLossPercent(uplinkLossPercent: Number) {
      cdkBuilder.uplinkLossPercent(uplinkLossPercent)
    }

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps,
  ) : CdkObject(cdkObject), CfnNetworkProfileProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun downlinkBandwidthBits(): Number? = unwrap(this).getDownlinkBandwidthBits()

    override fun downlinkDelayMs(): Number? = unwrap(this).getDownlinkDelayMs()

    override fun downlinkJitterMs(): Number? = unwrap(this).getDownlinkJitterMs()

    override fun downlinkLossPercent(): Number? = unwrap(this).getDownlinkLossPercent()

    override fun name(): String = unwrap(this).getName()

    override fun projectArn(): String = unwrap(this).getProjectArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun uplinkBandwidthBits(): Number? = unwrap(this).getUplinkBandwidthBits()

    override fun uplinkDelayMs(): Number? = unwrap(this).getUplinkDelayMs()

    override fun uplinkJitterMs(): Number? = unwrap(this).getUplinkJitterMs()

    override fun uplinkLossPercent(): Number? = unwrap(this).getUplinkLossPercent()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNetworkProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps):
        CfnNetworkProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkProfileProps):
        software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.devicefarm.CfnNetworkProfileProps
  }
}
