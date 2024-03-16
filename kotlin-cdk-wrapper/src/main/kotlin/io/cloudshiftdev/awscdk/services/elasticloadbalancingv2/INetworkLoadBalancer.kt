@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * A network load balancer.
 */
public interface INetworkLoadBalancer : ILoadBalancerV2, IVpcEndpointServiceLoadBalancer,
    IConnectable {
  /**
   * Add a listener to this load balancer.
   *
   * @return The newly created listener
   * @param id 
   * @param props 
   */
  public fun addListener(id: String, props: BaseNetworkListenerProps): NetworkListener

  /**
   * Add a listener to this load balancer.
   *
   * @return The newly created listener
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a41b0d86a8d4886847b1c4ec80b30640a2d7a8098f577ff54f0dca337543d349")
  public fun addListener(id: String, props: BaseNetworkListenerProps.Builder.() -> Unit):
      NetworkListener

  /**
   * The type of IP addresses to use.
   *
   * Default: IpAddressType.IPV4
   */
  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  /**
   * All metrics available for this load balancer.
   */
  public fun metrics(): INetworkLoadBalancerMetrics

  /**
   * Security groups associated with this load balancer.
   */
  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  /**
   * The VPC this load balancer has been created in (if available).
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer):
        INetworkLoadBalancer = CdkObjectWrappers.wrap(cdkObject) as INetworkLoadBalancer

    internal fun unwrap(wrapped: INetworkLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
  }
}
