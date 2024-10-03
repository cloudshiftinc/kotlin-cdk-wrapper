@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Base options for all route specs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * RouteSpecOptionsBase routeSpecOptionsBase = RouteSpecOptionsBase.builder()
 * .priority(123)
 * .build();
 * ```
 */
public interface RouteSpecOptionsBase {
  /**
   * The priority for the route.
   *
   * When a Virtual Router has multiple routes, route match is performed in the
   * order of specified value, where 0 is the highest priority, and first matched route is selected.
   *
   * Default: - no particular priority
   */
  public fun priority(): Number? = unwrap(this).getPriority()

  /**
   * A builder for [RouteSpecOptionsBase]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param priority The priority for the route.
     * When a Virtual Router has multiple routes, route match is performed in the
     * order of specified value, where 0 is the highest priority, and first matched route is
     * selected.
     */
    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase.Builder =
        software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase.builder()

    /**
     * @param priority The priority for the route.
     * When a Virtual Router has multiple routes, route match is performed in the
     * order of specified value, where 0 is the highest priority, and first matched route is
     * selected.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase,
  ) : CdkObject(cdkObject),
      RouteSpecOptionsBase {
    /**
     * The priority for the route.
     *
     * When a Virtual Router has multiple routes, route match is performed in the
     * order of specified value, where 0 is the highest priority, and first matched route is
     * selected.
     *
     * Default: - no particular priority
     */
    override fun priority(): Number? = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RouteSpecOptionsBase {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase):
        RouteSpecOptionsBase = CdkObjectWrappers.wrap(cdkObject) as? RouteSpecOptionsBase ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RouteSpecOptionsBase):
        software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.RouteSpecOptionsBase
  }
}
