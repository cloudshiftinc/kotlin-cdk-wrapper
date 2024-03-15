@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface RouteAttributes {
  public fun routeName(): String

  public fun virtualRouter(): IVirtualRouter

  @CdkDslMarker
  public interface Builder {
    public fun routeName(routeName: String)

    public fun virtualRouter(virtualRouter: IVirtualRouter)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.RouteAttributes.Builder =
        software.amazon.awscdk.services.appmesh.RouteAttributes.builder()

    override fun routeName(routeName: String) {
      cdkBuilder.routeName(routeName)
    }

    override fun virtualRouter(virtualRouter: IVirtualRouter) {
      cdkBuilder.virtualRouter(virtualRouter.let(IVirtualRouter::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.RouteAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.RouteAttributes,
  ) : CdkObject(cdkObject), RouteAttributes {
    override fun routeName(): String = unwrap(this).getRouteName()

    override fun virtualRouter(): IVirtualRouter =
        unwrap(this).getVirtualRouter().let(IVirtualRouter::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RouteAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.RouteAttributes):
        RouteAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RouteAttributes):
        software.amazon.awscdk.services.appmesh.RouteAttributes = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.RouteAttributes
  }
}
