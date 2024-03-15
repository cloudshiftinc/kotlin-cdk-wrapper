@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface IVirtualRouter : IResource {
  public fun addRoute(arg0: String, arg1: RouteBaseProps): Route

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("26d15a55ebceab0f13f1422d758ccb5af6cd5a843b834697e7f3e7e5194e110e")
  public fun addRoute(arg0: String, arg1: RouteBaseProps.Builder.() -> Unit): Route

  public fun mesh(): IMesh

  public fun virtualRouterArn(): String

  public fun virtualRouterName(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.IVirtualRouter,
  ) : CdkObject(cdkObject), IVirtualRouter {
    override fun addRoute(arg0: String, arg1: RouteBaseProps): Route = unwrap(this).addRoute(arg0,
        arg1.let(RouteBaseProps::unwrap)).let(Route::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("26d15a55ebceab0f13f1422d758ccb5af6cd5a843b834697e7f3e7e5194e110e")
    override fun addRoute(arg0: String, arg1: RouteBaseProps.Builder.() -> Unit): Route =
        addRoute(arg0, RouteBaseProps(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun mesh(): IMesh = unwrap(this).getMesh().let(IMesh::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun virtualRouterArn(): String = unwrap(this).getVirtualRouterArn()

    override fun virtualRouterName(): String = unwrap(this).getVirtualRouterName()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.IVirtualRouter):
        IVirtualRouter = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVirtualRouter):
        software.amazon.awscdk.services.appmesh.IVirtualRouter = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.IVirtualRouter
  }
}
