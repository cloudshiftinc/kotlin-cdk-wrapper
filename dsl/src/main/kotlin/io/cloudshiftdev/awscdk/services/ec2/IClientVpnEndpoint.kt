package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.IDependable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IClientVpnEndpoint : IResource, IConnectable {
  public fun endpointId(): String

  public fun targetNetworksAssociated(): IDependable

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IClientVpnEndpoint,
  ) : IClientVpnEndpoint {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)

    public override fun endpointId(): String = unwrap(this).getEndpointId()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun targetNetworksAssociated(): IDependable =
        unwrap(this).getTargetNetworksAssociated().let(IDependable::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IClientVpnEndpoint):
        IClientVpnEndpoint = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IClientVpnEndpoint):
        software.amazon.awscdk.services.ec2.IClientVpnEndpoint = (wrapped as Wrapper).cdkObject
  }
}
