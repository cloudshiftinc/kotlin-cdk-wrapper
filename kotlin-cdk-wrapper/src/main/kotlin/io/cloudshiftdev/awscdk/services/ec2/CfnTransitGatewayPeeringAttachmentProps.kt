@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTransitGatewayPeeringAttachmentProps {
  public fun peerAccountId(): String

  public fun peerRegion(): String

  public fun peerTransitGatewayId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun transitGatewayId(): String

  @CdkDslMarker
  public interface Builder {
    public fun peerAccountId(peerAccountId: String)

    public fun peerRegion(peerRegion: String)

    public fun peerTransitGatewayId(peerTransitGatewayId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transitGatewayId(transitGatewayId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps.builder()

    override fun peerAccountId(peerAccountId: String) {
      cdkBuilder.peerAccountId(peerAccountId)
    }

    override fun peerRegion(peerRegion: String) {
      cdkBuilder.peerRegion(peerRegion)
    }

    override fun peerTransitGatewayId(peerTransitGatewayId: String) {
      cdkBuilder.peerTransitGatewayId(peerTransitGatewayId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayPeeringAttachmentProps {
    override fun peerAccountId(): String = unwrap(this).getPeerAccountId()

    override fun peerRegion(): String = unwrap(this).getPeerRegion()

    override fun peerTransitGatewayId(): String = unwrap(this).getPeerTransitGatewayId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun transitGatewayId(): String = unwrap(this).getTransitGatewayId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayPeeringAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps):
        CfnTransitGatewayPeeringAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayPeeringAttachmentProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayPeeringAttachmentProps
  }
}
