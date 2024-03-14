package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface RouteBaseProps {
  /**
   * The name of the route.
   *
   * Default: - An automatically generated name
   */
  public fun routeName(): String? = unwrap(this).getRouteName()

  /**
   * Protocol specific spec.
   */
  public fun routeSpec(): RouteSpec

  /**
   * A builder for [RouteBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param routeName The name of the route.
     */
    public fun routeName(routeName: String)

    /**
     * @param routeSpec Protocol specific spec. 
     */
    public fun routeSpec(routeSpec: RouteSpec)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.RouteBaseProps.Builder =
        software.amazon.awscdk.services.appmesh.RouteBaseProps.builder()

    /**
     * @param routeName The name of the route.
     */
    override fun routeName(routeName: String) {
      cdkBuilder.routeName(routeName)
    }

    /**
     * @param routeSpec Protocol specific spec. 
     */
    override fun routeSpec(routeSpec: RouteSpec) {
      cdkBuilder.routeSpec(routeSpec.let(RouteSpec::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appmesh.RouteBaseProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.RouteBaseProps,
  ) : CdkObject(cdkObject), RouteBaseProps {
    /**
     * The name of the route.
     *
     * Default: - An automatically generated name
     */
    override fun routeName(): String? = unwrap(this).getRouteName()

    /**
     * Protocol specific spec.
     */
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
