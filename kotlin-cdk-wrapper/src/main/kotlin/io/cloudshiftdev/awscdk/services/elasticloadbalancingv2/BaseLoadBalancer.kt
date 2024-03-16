@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.collections.List

/**
 * Base class for both Application and Network Load Balancers.
 */
public abstract class BaseLoadBalancer internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancer,
) : Resource(cdkObject) {
  /**
   * Set a non-standard attribute on the load balancer.
   *
   * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html#load-balancer-attributes)
   * @param key 
   * @param value
   */
  public open fun attribute(key: String) {
    unwrap(this).setAttribute(key)
  }

  /**
   * Set a non-standard attribute on the load balancer.
   *
   * [Documentation](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/application-load-balancers.html#load-balancer-attributes)
   * @param key 
   * @param value
   */
  public open fun attribute(key: String, `value`: String) {
    unwrap(this).setAttribute(key, `value`)
  }

  /**
   * The ARN of this load balancer.
   *
   * Example value:
   * `arn:aws:elasticloadbalancing:us-west-2:123456789012:loadbalancer/app/my-internal-load-balancer/50dc6c495c0c9188`
   */
  public open fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

  /**
   * The canonical hosted zone ID of this load balancer.
   *
   * Example value: `Z2P70J7EXAMPLE`
   */
  public open fun loadBalancerCanonicalHostedZoneId(): String =
      unwrap(this).getLoadBalancerCanonicalHostedZoneId()

  /**
   * The DNS name of this load balancer.
   *
   * Example value: `my-load-balancer-424835706.us-west-2.elb.amazonaws.com`
   */
  public open fun loadBalancerDnsName(): String = unwrap(this).getLoadBalancerDnsName()

  /**
   * The full name of this load balancer.
   *
   * Example value: `app/my-load-balancer/50dc6c495c0c9188`
   */
  public open fun loadBalancerFullName(): String = unwrap(this).getLoadBalancerFullName()

  /**
   * The name of this load balancer.
   *
   * Example value: `my-load-balancer`
   */
  public open fun loadBalancerName(): String = unwrap(this).getLoadBalancerName()

  /**
   *
   */
  public open fun loadBalancerSecurityGroups(): List<String> =
      unwrap(this).getLoadBalancerSecurityGroups()

  /**
   * Enable access logging for this load balancer.
   *
   * A region must be specified on the stack containing the load balancer; you cannot enable logging
   * on
   * environment-agnostic stacks. See https://docs.aws.amazon.com/cdk/latest/guide/environments.html
   *
   * @param bucket 
   * @param prefix
   */
  public open fun logAccessLogs(bucket: IBucket) {
    unwrap(this).logAccessLogs(bucket.let(IBucket::unwrap))
  }

  /**
   * Enable access logging for this load balancer.
   *
   * A region must be specified on the stack containing the load balancer; you cannot enable logging
   * on
   * environment-agnostic stacks. See https://docs.aws.amazon.com/cdk/latest/guide/environments.html
   *
   * @param bucket 
   * @param prefix
   */
  public open fun logAccessLogs(bucket: IBucket, prefix: String) {
    unwrap(this).logAccessLogs(bucket.let(IBucket::unwrap), prefix)
  }

  /**
   * Remove an attribute from the load balancer.
   *
   * @param key 
   */
  public open fun removeAttribute(key: String) {
    unwrap(this).removeAttribute(key)
  }

  /**
   * The VPC this load balancer has been created in.
   *
   * This property is always defined (not `null` or `undefined`) for sub-classes of
   * `BaseLoadBalancer`.
   */
  public open fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancer):
        BaseLoadBalancer = CdkObjectWrappers.wrap(cdkObject) as BaseLoadBalancer

    internal fun unwrap(wrapped: BaseLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancer = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancer
  }
}
