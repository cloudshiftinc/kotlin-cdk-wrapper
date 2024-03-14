package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.IDependable
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IPrivateSubnet : ISubnet {
  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.IPrivateSubnet,
  ) : IPrivateSubnet {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun associateNetworkAcl(arg0: String, arg1: INetworkAcl) {
      unwrap(this).associateNetworkAcl(arg0, arg1.let(INetworkAcl::unwrap))
    }

    public override fun availabilityZone(): String = unwrap(this).getAvailabilityZone()

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun internetConnectivityEstablished(): IDependable =
        unwrap(this).getInternetConnectivityEstablished().let(IDependable::wrap)

    public override fun ipv4CidrBlock(): String = unwrap(this).getIpv4CidrBlock()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun routeTable(): IRouteTable =
        unwrap(this).getRouteTable().let(IRouteTable::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun subnetId(): String = unwrap(this).getSubnetId()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IPrivateSubnet): IPrivateSubnet
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPrivateSubnet): software.amazon.awscdk.services.ec2.IPrivateSubnet
        = (wrapped as Wrapper).cdkObject
  }
}
