package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IGatewayRoute : IResource {
  public fun gatewayRouteArn(): String

  public fun gatewayRouteName(): String

  public fun virtualGateway(): IVirtualGateway

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.IGatewayRoute,
  ) : IGatewayRoute {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun gatewayRouteArn(): String = unwrap(this).getGatewayRouteArn()

    public override fun gatewayRouteName(): String = unwrap(this).getGatewayRouteName()

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun virtualGateway(): IVirtualGateway =
        unwrap(this).getVirtualGateway().let(IVirtualGateway::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IGatewayRoute):
        IGatewayRoute = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IGatewayRoute):
        software.amazon.awscdk.services.appmesh.IGatewayRoute = (wrapped as Wrapper).cdkObject
  }
}
