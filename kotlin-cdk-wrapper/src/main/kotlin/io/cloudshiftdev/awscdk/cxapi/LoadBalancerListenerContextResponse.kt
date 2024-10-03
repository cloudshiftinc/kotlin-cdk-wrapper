@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cxapi

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties of a discovered load balancer listener.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.cxapi.*;
 * LoadBalancerListenerContextResponse loadBalancerListenerContextResponse =
 * LoadBalancerListenerContextResponse.builder()
 * .listenerArn("listenerArn")
 * .listenerPort(123)
 * .securityGroupIds(List.of("securityGroupIds"))
 * .build();
 * ```
 */
public interface LoadBalancerListenerContextResponse {
  /**
   * The ARN of the listener.
   */
  public fun listenerArn(): String

  /**
   * The port the listener is listening on.
   */
  public fun listenerPort(): Number

  /**
   * The security groups of the load balancer.
   */
  public fun securityGroupIds(): List<String>

  /**
   * A builder for [LoadBalancerListenerContextResponse]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param listenerArn The ARN of the listener. 
     */
    public fun listenerArn(listenerArn: String)

    /**
     * @param listenerPort The port the listener is listening on. 
     */
    public fun listenerPort(listenerPort: Number)

    /**
     * @param securityGroupIds The security groups of the load balancer. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The security groups of the load balancer. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse.Builder
        = software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse.builder()

    /**
     * @param listenerArn The ARN of the listener. 
     */
    override fun listenerArn(listenerArn: String) {
      cdkBuilder.listenerArn(listenerArn)
    }

    /**
     * @param listenerPort The port the listener is listening on. 
     */
    override fun listenerPort(listenerPort: Number) {
      cdkBuilder.listenerPort(listenerPort)
    }

    /**
     * @param securityGroupIds The security groups of the load balancer. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The security groups of the load balancer. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    public fun build(): software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse,
  ) : CdkObject(cdkObject),
      LoadBalancerListenerContextResponse {
    /**
     * The ARN of the listener.
     */
    override fun listenerArn(): String = unwrap(this).getListenerArn()

    /**
     * The port the listener is listening on.
     */
    override fun listenerPort(): Number = unwrap(this).getListenerPort()

    /**
     * The security groups of the load balancer.
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        LoadBalancerListenerContextResponse {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse):
        LoadBalancerListenerContextResponse = CdkObjectWrappers.wrap(cdkObject) as?
        LoadBalancerListenerContextResponse ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerListenerContextResponse):
        software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cxapi.LoadBalancerListenerContextResponse
  }
}
