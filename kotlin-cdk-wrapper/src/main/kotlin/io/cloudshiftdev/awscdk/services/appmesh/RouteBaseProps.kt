@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface RouteBaseProps {
  public fun routeName(): String? = unwrap(this).getRouteName()

  public fun routeSpec(): RouteSpec

  @CdkDslMarker
  public interface Builder {
    public fun routeName(routeName: String)

    public fun routeSpec(routeSpec: RouteSpec)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.RouteBaseProps.Builder =
        software.amazon.awscdk.services.appmesh.RouteBaseProps.builder()

    override fun routeName(routeName: String) {
      cdkBuilder.routeName(routeName)
    }

    override fun routeSpec(routeSpec: RouteSpec) {
      cdkBuilder.routeSpec(routeSpec.let(RouteSpec::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.RouteBaseProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.RouteBaseProps,
  ) : CdkObject(cdkObject), RouteBaseProps {
    override fun routeName(): String? = unwrap(this).getRouteName()

    override fun routeSpec(): RouteSpec = unwrap(this).getRouteSpec().let(RouteSpec::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RouteBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.RouteBaseProps):
        RouteBaseProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RouteBaseProps):
        software.amazon.awscdk.services.appmesh.RouteBaseProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.RouteBaseProps
  }
}
