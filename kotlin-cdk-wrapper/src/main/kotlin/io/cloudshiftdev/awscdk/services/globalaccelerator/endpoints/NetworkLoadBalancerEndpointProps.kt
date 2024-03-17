@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Properties for a NetworkLoadBalancerEndpoint.
 *
 * Example:
 *
 * ```
 * NetworkLoadBalancer nlb;
 * Listener listener;
 * listener.addEndpointGroup("Group", EndpointGroupOptions.builder()
 * .endpoints(List.of(
 * NetworkLoadBalancerEndpoint.Builder.create(nlb)
 * .weight(128)
 * .build()))
 * .build());
 * ```
 */
public interface NetworkLoadBalancerEndpointProps {
  /**
   * Endpoint weight across all endpoints in the group.
   *
   * Must be a value between 0 and 255.
   *
   * Default: 128
   */
  public fun weight(): Number? = unwrap(this).getWeight()

  /**
   * A builder for [NetworkLoadBalancerEndpointProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param weight Endpoint weight across all endpoints in the group.
     * Must be a value between 0 and 255.
     */
    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps.Builder
        =
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps.builder()

    /**
     * @param weight Endpoint weight across all endpoints in the group.
     * Must be a value between 0 and 255.
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build():
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps,
  ) : CdkObject(cdkObject), NetworkLoadBalancerEndpointProps {
    /**
     * Endpoint weight across all endpoints in the group.
     *
     * Must be a value between 0 and 255.
     *
     * Default: 128
     */
    override fun weight(): Number? = unwrap(this).getWeight()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkLoadBalancerEndpointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps):
        NetworkLoadBalancerEndpointProps = CdkObjectWrappers.wrap(cdkObject) as?
        NetworkLoadBalancerEndpointProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancerEndpointProps):
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps
  }
}
