@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTransitGatewayRouteTableAttachmentProps {
  public fun peeringId(): String

  public fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun transitGatewayRouteTableArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun peeringId(peeringId: String)

    public fun proposedSegmentChange(proposedSegmentChange: IResolvable)

    public
        fun proposedSegmentChange(proposedSegmentChange: CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2eb22f8427a1c5451293ede1b0bbbebd992635a041ae6e46e273bec6a10d39ae")
    public
        fun proposedSegmentChange(proposedSegmentChange: CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transitGatewayRouteTableArn(transitGatewayRouteTableArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps.Builder
        =
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps.builder()

    override fun peeringId(peeringId: String) {
      cdkBuilder.peeringId(peeringId)
    }

    override fun proposedSegmentChange(proposedSegmentChange: IResolvable) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(IResolvable::unwrap))
    }

    override
        fun proposedSegmentChange(proposedSegmentChange: CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty) {
      cdkBuilder.proposedSegmentChange(proposedSegmentChange.let(CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2eb22f8427a1c5451293ede1b0bbbebd992635a041ae6e46e273bec6a10d39ae")
    override
        fun proposedSegmentChange(proposedSegmentChange: CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty.Builder.() -> Unit):
        Unit =
        proposedSegmentChange(CfnTransitGatewayRouteTableAttachment.ProposedSegmentChangeProperty(proposedSegmentChange))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun transitGatewayRouteTableArn(transitGatewayRouteTableArn: String) {
      cdkBuilder.transitGatewayRouteTableArn(transitGatewayRouteTableArn)
    }

    public fun build():
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayRouteTableAttachmentProps {
    override fun peeringId(): String = unwrap(this).getPeeringId()

    override fun proposedSegmentChange(): Any? = unwrap(this).getProposedSegmentChange()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun transitGatewayRouteTableArn(): String =
        unwrap(this).getTransitGatewayRouteTableArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayRouteTableAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps):
        CfnTransitGatewayRouteTableAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRouteTableAttachmentProps):
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.networkmanager.CfnTransitGatewayRouteTableAttachmentProps
  }
}
