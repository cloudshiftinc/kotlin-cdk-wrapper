package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface ISubnetNetworkAclAssociation : IResource {
  public fun subnetNetworkAclAssociationAssociationId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.ISubnetNetworkAclAssociation,
  ) : ISubnetNetworkAclAssociation {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun subnetNetworkAclAssociationAssociationId(): String =
        unwrap(this).getSubnetNetworkAclAssociationAssociationId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ISubnetNetworkAclAssociation):
        ISubnetNetworkAclAssociation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISubnetNetworkAclAssociation):
        software.amazon.awscdk.services.ec2.ISubnetNetworkAclAssociation = (wrapped as
        Wrapper).cdkObject
  }
}
