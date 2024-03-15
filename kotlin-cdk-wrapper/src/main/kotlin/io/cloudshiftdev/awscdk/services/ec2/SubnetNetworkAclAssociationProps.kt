@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SubnetNetworkAclAssociationProps {
  public fun networkAcl(): INetworkAcl

  public fun subnet(): ISubnet

  public fun subnetNetworkAclAssociationName(): String? =
      unwrap(this).getSubnetNetworkAclAssociationName()

  @CdkDslMarker
  public interface Builder {
    public fun networkAcl(networkAcl: INetworkAcl)

    public fun subnet(subnet: ISubnet)

    public fun subnetNetworkAclAssociationName(subnetNetworkAclAssociationName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps.builder()

    override fun networkAcl(networkAcl: INetworkAcl) {
      cdkBuilder.networkAcl(networkAcl.let(INetworkAcl::unwrap))
    }

    override fun subnet(subnet: ISubnet) {
      cdkBuilder.subnet(subnet.let(ISubnet::unwrap))
    }

    override fun subnetNetworkAclAssociationName(subnetNetworkAclAssociationName: String) {
      cdkBuilder.subnetNetworkAclAssociationName(subnetNetworkAclAssociationName)
    }

    public fun build(): software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps,
  ) : CdkObject(cdkObject), SubnetNetworkAclAssociationProps {
    override fun networkAcl(): INetworkAcl = unwrap(this).getNetworkAcl().let(INetworkAcl::wrap)

    override fun subnet(): ISubnet = unwrap(this).getSubnet().let(ISubnet::wrap)

    override fun subnetNetworkAclAssociationName(): String? =
        unwrap(this).getSubnetNetworkAclAssociationName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SubnetNetworkAclAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps):
        SubnetNetworkAclAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SubnetNetworkAclAssociationProps):
        software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps
  }
}
