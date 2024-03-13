package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.collections.List

public abstract class BaseLoadBalancer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancer,
) : Resource(cdkObject) {
  public open fun attribute(key: String) {
    unwrap(this).setAttribute(key)
  }

  public open fun attribute(key: String, `value`: String) {
    unwrap(this).setAttribute(key, `value`)
  }

  public open fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

  public open fun loadBalancerCanonicalHostedZoneId(): String =
      unwrap(this).getLoadBalancerCanonicalHostedZoneId()

  public open fun loadBalancerDnsName(): String = unwrap(this).getLoadBalancerDnsName()

  public open fun loadBalancerFullName(): String = unwrap(this).getLoadBalancerFullName()

  public open fun loadBalancerName(): String = unwrap(this).getLoadBalancerName()

  public open fun loadBalancerSecurityGroups(): List<String> =
      unwrap(this).getLoadBalancerSecurityGroups() ?: emptyList()

  public open fun logAccessLogs(bucket: IBucket) {
    unwrap(this).logAccessLogs(bucket.let(IBucket::unwrap))
  }

  public open fun logAccessLogs(bucket: IBucket, prefix: String) {
    unwrap(this).logAccessLogs(bucket.let(IBucket::unwrap), prefix)
  }

  public open fun removeAttribute(key: String) {
    unwrap(this).removeAttribute(key)
  }

  public open fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancer,
  ) : BaseLoadBalancer(cdkObject)

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancer):
        BaseLoadBalancer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseLoadBalancer = (wrapped as
        Wrapper).cdkObject
  }
}
