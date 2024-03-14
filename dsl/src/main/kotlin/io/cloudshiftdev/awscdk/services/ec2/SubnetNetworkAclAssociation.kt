package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SubnetNetworkAclAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation,
) : Resource(cdkObject), ISubnetNetworkAclAssociation {
  public open fun networkAcl(): INetworkAcl = unwrap(this).getNetworkAcl().let(INetworkAcl::wrap)

  public open fun subnet(): ISubnet = unwrap(this).getSubnet().let(ISubnet::wrap)

  public override fun subnetNetworkAclAssociationAssociationId(): String =
      unwrap(this).getSubnetNetworkAclAssociationAssociationId()

  public interface Builder {
    public fun networkAcl(networkAcl: INetworkAcl) {
    }

    public fun subnet(subnet: ISubnet) {
    }

    public fun subnetNetworkAclAssociationName(subnetNetworkAclAssociationName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation.Builder
        = software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation.Builder.create(scope, id)

    public override fun networkAcl(networkAcl: INetworkAcl) {
      cdkBuilder.networkAcl(networkAcl.let(INetworkAcl::unwrap))
    }

    public override fun subnet(subnet: ISubnet) {
      cdkBuilder.subnet(subnet.let(ISubnet::unwrap))
    }

    public override fun subnetNetworkAclAssociationName(subnetNetworkAclAssociationName: String) {
      cdkBuilder.subnetNetworkAclAssociationName(subnetNetworkAclAssociationName)
    }

    public fun build(): software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public open fun fromSubnetNetworkAclAssociationAssociationId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      subnetNetworkAclAssociationAssociationId: String,
    ): ISubnetNetworkAclAssociation =
        software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation.fromSubnetNetworkAclAssociationAssociationId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, subnetNetworkAclAssociationAssociationId).let(ISubnetNetworkAclAssociation::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SubnetNetworkAclAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SubnetNetworkAclAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation):
        SubnetNetworkAclAssociation = SubnetNetworkAclAssociation(cdkObject)

    internal fun unwrap(wrapped: SubnetNetworkAclAssociation):
        software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation = wrapped.cdkObject
  }
}
