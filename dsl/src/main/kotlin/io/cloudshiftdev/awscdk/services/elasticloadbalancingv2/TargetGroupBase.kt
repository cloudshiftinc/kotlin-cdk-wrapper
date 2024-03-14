package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IDependable
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public abstract class TargetGroupBase internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupBase,
) : Construct(cdkObject), ITargetGroup {
  public open fun attribute(key: String) {
    unwrap(this).setAttribute(key)
  }

  public open fun attribute(key: String, `value`: String) {
    unwrap(this).setAttribute(key, `value`)
  }

  public open fun configureHealthCheck(healthCheck: HealthCheck) {
    unwrap(this).configureHealthCheck(healthCheck.let(HealthCheck::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f554491e118e7a54cb37648906be94aee10cc54ff98ade5299197f592d896271")
  public open fun configureHealthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
      configureHealthCheck(HealthCheck(healthCheck))

  public open fun firstLoadBalancerFullName(): String = unwrap(this).getFirstLoadBalancerFullName()

  public open fun healthCheck(): HealthCheck = unwrap(this).getHealthCheck().let(HealthCheck::wrap)

  public open fun healthCheck(`value`: HealthCheck) {
    unwrap(this).setHealthCheck(`value`.let(HealthCheck::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e0f33e44948799569485cb1f367fa4ea11fde47dadc1cb6f7a11c775fb22e41")
  public open fun healthCheck(`value`: HealthCheck.Builder.() -> Unit): Unit =
      healthCheck(HealthCheck(`value`))

  public override fun loadBalancerArns(): String = unwrap(this).getLoadBalancerArns()

  public override fun loadBalancerAttached(): IDependable =
      unwrap(this).getLoadBalancerAttached().let(IDependable::wrap)

  public override fun targetGroupArn(): String = unwrap(this).getTargetGroupArn()

  public open fun targetGroupFullName(): String = unwrap(this).getTargetGroupFullName()

  public open fun targetGroupLoadBalancerArns(): List<String> =
      unwrap(this).getTargetGroupLoadBalancerArns()

  public override fun targetGroupName(): String = unwrap(this).getTargetGroupName()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupBase,
  ) : TargetGroupBase(cdkObject)

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupBase):
        TargetGroupBase = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TargetGroupBase):
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupBase = (wrapped as
        Wrapper).cdkObject
  }
}
