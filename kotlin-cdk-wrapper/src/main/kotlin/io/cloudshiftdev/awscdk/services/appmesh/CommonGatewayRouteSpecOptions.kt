@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

/**
 * Base options for all gateway route specs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appmesh.*;
 * CommonGatewayRouteSpecOptions commonGatewayRouteSpecOptions =
 * CommonGatewayRouteSpecOptions.builder()
 * .priority(123)
 * .build();
 * ```
 */
public interface CommonGatewayRouteSpecOptions {
  /**
   * The priority for the gateway route.
   *
   * When a Virtual Gateway has multiple gateway routes, gateway route match
   * is performed in the order of specified value, where 0 is the highest priority,
   * and first matched gateway route is selected.
   *
   * Default: - no particular priority
   */
  public fun priority(): Number? = unwrap(this).getPriority()

  /**
   * A builder for [CommonGatewayRouteSpecOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param priority The priority for the gateway route.
     * When a Virtual Gateway has multiple gateway routes, gateway route match
     * is performed in the order of specified value, where 0 is the highest priority,
     * and first matched gateway route is selected.
     */
    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions.Builder =
        software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions.builder()

    /**
     * @param priority The priority for the gateway route.
     * When a Virtual Gateway has multiple gateway routes, gateway route match
     * is performed in the order of specified value, where 0 is the highest priority,
     * and first matched gateway route is selected.
     */
    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions,
  ) : CdkObject(cdkObject), CommonGatewayRouteSpecOptions {
    /**
     * The priority for the gateway route.
     *
     * When a Virtual Gateway has multiple gateway routes, gateway route match
     * is performed in the order of specified value, where 0 is the highest priority,
     * and first matched gateway route is selected.
     *
     * Default: - no particular priority
     */
    override fun priority(): Number? = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommonGatewayRouteSpecOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions):
        CommonGatewayRouteSpecOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommonGatewayRouteSpecOptions):
        software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.CommonGatewayRouteSpecOptions
  }
}
