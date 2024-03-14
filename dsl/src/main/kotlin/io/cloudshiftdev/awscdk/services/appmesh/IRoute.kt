package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IRoute : IResource {
  public fun routeArn(): String

  public fun routeName(): String

  public fun virtualRouter(): IVirtualRouter

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.IRoute,
  ) : IRoute {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun routeArn(): String = unwrap(this).getRouteArn()

    public override fun routeName(): String = unwrap(this).getRouteName()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun virtualRouter(): IVirtualRouter =
        unwrap(this).getVirtualRouter().let(IVirtualRouter::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IRoute): IRoute =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IRoute): software.amazon.awscdk.services.appmesh.IRoute = (wrapped
        as Wrapper).cdkObject
  }
}
