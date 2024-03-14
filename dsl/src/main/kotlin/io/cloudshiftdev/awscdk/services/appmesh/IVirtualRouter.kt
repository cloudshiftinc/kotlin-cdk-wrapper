package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IVirtualRouter : IResource {
  public fun addRoute(arg0: String, arg1: RouteBaseProps): Route

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26d15a55ebceab0f13f1422d758ccb5af6cd5a843b834697e7f3e7e5194e110e")
  public fun addRoute(arg0: String, arg1: RouteBaseProps.Builder.() -> Unit): Route

  public fun mesh(): IMesh

  public fun virtualRouterArn(): String

  public fun virtualRouterName(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.IVirtualRouter,
  ) : IVirtualRouter {
    public override fun addRoute(arg0: String, arg1: RouteBaseProps): Route =
        unwrap(this).addRoute(arg0, arg1.let(RouteBaseProps::unwrap)).let(Route::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26d15a55ebceab0f13f1422d758ccb5af6cd5a843b834697e7f3e7e5194e110e")
    public override fun addRoute(arg0: String, arg1: RouteBaseProps.Builder.() -> Unit): Route =
        addRoute(arg0, RouteBaseProps(arg1))

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun virtualRouterArn(): String = unwrap(this).getVirtualRouterArn()

    public override fun virtualRouterName(): String = unwrap(this).getVirtualRouterName()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IVirtualRouter):
        IVirtualRouter = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVirtualRouter):
        software.amazon.awscdk.services.appmesh.IVirtualRouter = (wrapped as Wrapper).cdkObject
  }
}
