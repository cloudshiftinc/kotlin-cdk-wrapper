@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnVPCPeeringConnectionProps {
  public fun peerOwnerId(): String? = unwrap(this).getPeerOwnerId()

  public fun peerRegion(): String? = unwrap(this).getPeerRegion()

  public fun peerRoleArn(): String? = unwrap(this).getPeerRoleArn()

  public fun peerVpcId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcId(): String

  @CdkDslMarker
  public interface Builder {
    public fun peerOwnerId(peerOwnerId: String)

    public fun peerRegion(peerRegion: String)

    public fun peerRoleArn(peerRoleArn: String)

    public fun peerVpcId(peerVpcId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps.Builder
        = software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps.builder()

    override fun peerOwnerId(peerOwnerId: String) {
      cdkBuilder.peerOwnerId(peerOwnerId)
    }

    override fun peerRegion(peerRegion: String) {
      cdkBuilder.peerRegion(peerRegion)
    }

    override fun peerRoleArn(peerRoleArn: String) {
      cdkBuilder.peerRoleArn(peerRoleArn)
    }

    override fun peerVpcId(peerVpcId: String) {
      cdkBuilder.peerVpcId(peerVpcId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps,
  ) : CdkObject(cdkObject), CfnVPCPeeringConnectionProps {
    override fun peerOwnerId(): String? = unwrap(this).getPeerOwnerId()

    override fun peerRegion(): String? = unwrap(this).getPeerRegion()

    override fun peerRoleArn(): String? = unwrap(this).getPeerRoleArn()

    override fun peerVpcId(): String = unwrap(this).getPeerVpcId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPCPeeringConnectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps):
        CfnVPCPeeringConnectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPCPeeringConnectionProps):
        software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVPCPeeringConnectionProps
  }
}
