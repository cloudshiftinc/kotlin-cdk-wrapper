@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTrafficMirrorSessionProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun networkInterfaceId(): String

  public fun packetLength(): Number? = unwrap(this).getPacketLength()

  public fun sessionNumber(): Number

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun trafficMirrorFilterId(): String

  public fun trafficMirrorTargetId(): String

  public fun virtualNetworkId(): Number? = unwrap(this).getVirtualNetworkId()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun networkInterfaceId(networkInterfaceId: String)

    public fun packetLength(packetLength: Number)

    public fun sessionNumber(sessionNumber: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun trafficMirrorFilterId(trafficMirrorFilterId: String)

    public fun trafficMirrorTargetId(trafficMirrorTargetId: String)

    public fun virtualNetworkId(virtualNetworkId: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps.Builder
        = software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    override fun packetLength(packetLength: Number) {
      cdkBuilder.packetLength(packetLength)
    }

    override fun sessionNumber(sessionNumber: Number) {
      cdkBuilder.sessionNumber(sessionNumber)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun trafficMirrorFilterId(trafficMirrorFilterId: String) {
      cdkBuilder.trafficMirrorFilterId(trafficMirrorFilterId)
    }

    override fun trafficMirrorTargetId(trafficMirrorTargetId: String) {
      cdkBuilder.trafficMirrorTargetId(trafficMirrorTargetId)
    }

    override fun virtualNetworkId(virtualNetworkId: Number) {
      cdkBuilder.virtualNetworkId(virtualNetworkId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps,
  ) : CdkObject(cdkObject), CfnTrafficMirrorSessionProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun networkInterfaceId(): String = unwrap(this).getNetworkInterfaceId()

    override fun packetLength(): Number? = unwrap(this).getPacketLength()

    override fun sessionNumber(): Number = unwrap(this).getSessionNumber()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun trafficMirrorFilterId(): String = unwrap(this).getTrafficMirrorFilterId()

    override fun trafficMirrorTargetId(): String = unwrap(this).getTrafficMirrorTargetId()

    override fun virtualNetworkId(): Number? = unwrap(this).getVirtualNetworkId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTrafficMirrorSessionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps):
        CfnTrafficMirrorSessionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTrafficMirrorSessionProps):
        software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTrafficMirrorSessionProps
  }
}
