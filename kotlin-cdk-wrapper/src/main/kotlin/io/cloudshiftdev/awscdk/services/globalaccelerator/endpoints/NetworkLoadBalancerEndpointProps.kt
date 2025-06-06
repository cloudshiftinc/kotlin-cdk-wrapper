@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator.endpoints

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
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
 * .preserveClientIp(true)
 * .build()))
 * .build());
 * ```
 */
public interface NetworkLoadBalancerEndpointProps {
  /**
   * Forward the client IP address in an `X-Forwarded-For` header.
   *
   * GlobalAccelerator will create Network Interfaces in your VPC in order
   * to preserve the client IP address.
   *
   * Client IP address preservation is supported only in specific AWS Regions.
   * See the GlobalAccelerator Developer Guide for a list.
   *
   * Default: false
   */
  public fun preserveClientIp(): Boolean? = unwrap(this).getPreserveClientIp()

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
     * @param preserveClientIp Forward the client IP address in an `X-Forwarded-For` header.
     * GlobalAccelerator will create Network Interfaces in your VPC in order
     * to preserve the client IP address.
     *
     * Client IP address preservation is supported only in specific AWS Regions.
     * See the GlobalAccelerator Developer Guide for a list.
     */
    public fun preserveClientIp(preserveClientIp: Boolean)

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
     * @param preserveClientIp Forward the client IP address in an `X-Forwarded-For` header.
     * GlobalAccelerator will create Network Interfaces in your VPC in order
     * to preserve the client IP address.
     *
     * Client IP address preservation is supported only in specific AWS Regions.
     * See the GlobalAccelerator Developer Guide for a list.
     */
    override fun preserveClientIp(preserveClientIp: Boolean) {
      cdkBuilder.preserveClientIp(preserveClientIp)
    }

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
    cdkObject: software.amazon.awscdk.services.globalaccelerator.endpoints.NetworkLoadBalancerEndpointProps,
  ) : CdkObject(cdkObject),
      NetworkLoadBalancerEndpointProps {
    /**
     * Forward the client IP address in an `X-Forwarded-For` header.
     *
     * GlobalAccelerator will create Network Interfaces in your VPC in order
     * to preserve the client IP address.
     *
     * Client IP address preservation is supported only in specific AWS Regions.
     * See the GlobalAccelerator Developer Guide for a list.
     *
     * Default: false
     */
    override fun preserveClientIp(): Boolean? = unwrap(this).getPreserveClientIp()

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
