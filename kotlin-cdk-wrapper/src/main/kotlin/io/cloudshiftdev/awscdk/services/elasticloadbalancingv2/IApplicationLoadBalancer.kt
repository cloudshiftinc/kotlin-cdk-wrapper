@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * An application load balancer.
 */
public interface IApplicationLoadBalancer : ILoadBalancerV2, IConnectable {
  /**
   * Add a new listener to this load balancer.
   *
   * @param id 
   * @param props 
   */
  public fun addListener(id: String, props: BaseApplicationListenerProps): ApplicationListener

  /**
   * Add a new listener to this load balancer.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c4214bb0ef19ba7cc886c0c0c590fdb239a96d82b7e5e0b4b1bbe44fe0af6df0")
  public fun addListener(id: String, props: BaseApplicationListenerProps.Builder.() -> Unit):
      ApplicationListener

  /**
   * The IP Address Type for this load balancer.
   *
   * Default: IpAddressType.IPV4
   */
  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  /**
   * A list of listeners that have been added to the load balancer.
   *
   * This list is only valid for owned constructs.
   */
  public fun listeners(): List<ApplicationListener>

  /**
   * The ARN of this load balancer.
   */
  public fun loadBalancerArn(): String

  /**
   * All metrics available for this load balancer.
   */
  public fun metrics(): IApplicationLoadBalancerMetrics

  /**
   * The VPC this load balancer has been created in (if available).
   *
   * If this interface is the result of an import call to fromApplicationLoadBalancerAttributes,
   * the vpc attribute will be undefined unless specified in the optional properties of that method.
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer):
        IApplicationLoadBalancer = CdkObjectWrappers.wrap(cdkObject) as IApplicationLoadBalancer

    internal fun unwrap(wrapped: IApplicationLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer
  }
}
