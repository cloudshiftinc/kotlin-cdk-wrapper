package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node

public interface INetworkAclEntry : IResource {
  public fun networkAcl(): INetworkAcl

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.INetworkAclEntry,
  ) : INetworkAclEntry {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun networkAcl(): INetworkAcl = unwrap(this).getNetworkAcl().let(INetworkAcl::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.INetworkAclEntry):
        INetworkAclEntry = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INetworkAclEntry):
        software.amazon.awscdk.services.ec2.INetworkAclEntry = (wrapped as Wrapper).cdkObject
  }
}
