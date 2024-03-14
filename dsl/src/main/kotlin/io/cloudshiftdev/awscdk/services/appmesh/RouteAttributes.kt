package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.String
import kotlin.Unit

public interface RouteAttributes {
  public fun routeName(): String

  public fun virtualRouter(): IVirtualRouter

  public interface Builder {
    public fun routeName(routeName: String) {
    }

    public fun virtualRouter(virtualRouter: IVirtualRouter) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.RouteAttributes.Builder =
        software.amazon.awscdk.services.appmesh.RouteAttributes.builder()

    public override fun routeName(routeName: String) {
      cdkBuilder.routeName(routeName)
    }

    public override fun virtualRouter(virtualRouter: IVirtualRouter) {
      cdkBuilder.virtualRouter(virtualRouter.let(IVirtualRouter::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.RouteAttributes = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.RouteAttributes,
  ) : RouteAttributes {
    public override fun routeName(): String = unwrap(this).getRouteName()

    public override fun virtualRouter(): IVirtualRouter =
        unwrap(this).getVirtualRouter().let(IVirtualRouter::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RouteAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.RouteAttributes):
        RouteAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RouteAttributes):
        software.amazon.awscdk.services.appmesh.RouteAttributes = (wrapped as Wrapper).cdkObject
  }
}
