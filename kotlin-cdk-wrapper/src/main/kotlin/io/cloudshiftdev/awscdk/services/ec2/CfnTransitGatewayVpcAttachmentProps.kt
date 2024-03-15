@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTransitGatewayVpcAttachmentProps {
  public fun addSubnetIds(): List<String> = unwrap(this).getAddSubnetIds() ?: emptyList()

  public fun options(): Any? = unwrap(this).getOptions()

  public fun removeSubnetIds(): List<String> = unwrap(this).getRemoveSubnetIds() ?: emptyList()

  public fun subnetIds(): List<String>

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun transitGatewayId(): String

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun addSubnetIds(addSubnetIds: List<String>)

    public fun addSubnetIds(vararg addSubnetIds: String)

    public fun options(options: Any)

    public fun removeSubnetIds(removeSubnetIds: List<String>)

    public fun removeSubnetIds(vararg removeSubnetIds: String)

    public fun subnetIds(subnetIds: List<String>)

    public fun subnetIds(vararg subnetIds: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transitGatewayId(transitGatewayId: String)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps.builder()

    override fun addSubnetIds(addSubnetIds: List<String>) {
      cdkBuilder.addSubnetIds(addSubnetIds)
    }

    override fun addSubnetIds(vararg addSubnetIds: String): Unit =
        addSubnetIds(addSubnetIds.toList())

    override fun options(options: Any) {
      cdkBuilder.options(options)
    }

    override fun removeSubnetIds(removeSubnetIds: List<String>) {
      cdkBuilder.removeSubnetIds(removeSubnetIds)
    }

    override fun removeSubnetIds(vararg removeSubnetIds: String): Unit =
        removeSubnetIds(removeSubnetIds.toList())

    override fun subnetIds(subnetIds: List<String>) {
      cdkBuilder.subnetIds(subnetIds)
    }

    override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun transitGatewayId(transitGatewayId: String) {
      cdkBuilder.transitGatewayId(transitGatewayId)
    }

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayVpcAttachmentProps {
    override fun addSubnetIds(): List<String> = unwrap(this).getAddSubnetIds() ?: emptyList()

    override fun options(): Any? = unwrap(this).getOptions()

    override fun removeSubnetIds(): List<String> = unwrap(this).getRemoveSubnetIds() ?: emptyList()

    override fun subnetIds(): List<String> = unwrap(this).getSubnetIds()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun transitGatewayId(): String = unwrap(this).getTransitGatewayId()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayVpcAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps):
        CfnTransitGatewayVpcAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayVpcAttachmentProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayVpcAttachmentProps
  }
}
