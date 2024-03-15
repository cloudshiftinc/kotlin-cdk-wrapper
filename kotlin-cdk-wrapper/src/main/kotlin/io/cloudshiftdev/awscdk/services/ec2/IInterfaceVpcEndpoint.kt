@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IInterfaceVpcEndpoint : IVpcEndpoint, IConnectable {
  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint,
  ) : CdkObject(cdkObject), IInterfaceVpcEndpoint {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun vpcEndpointId(): String = unwrap(this).getVpcEndpointId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint):
        IInterfaceVpcEndpoint = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInterfaceVpcEndpoint):
        software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint
  }
}
