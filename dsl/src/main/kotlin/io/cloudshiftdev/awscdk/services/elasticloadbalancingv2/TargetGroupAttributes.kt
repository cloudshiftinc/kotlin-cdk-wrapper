package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.String
import kotlin.Unit

public interface TargetGroupAttributes {
  public fun loadBalancerArns(): String? = unwrap(this).getLoadBalancerArns()

  public fun targetGroupArn(): String

  public interface Builder {
    public fun loadBalancerArns(loadBalancerArns: String) {
    }

    public fun targetGroupArn(targetGroupArn: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes.builder()

    public override fun loadBalancerArns(loadBalancerArns: String) {
      cdkBuilder.loadBalancerArns(loadBalancerArns)
    }

    public override fun targetGroupArn(targetGroupArn: String) {
      cdkBuilder.targetGroupArn(targetGroupArn)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes,
  ) : TargetGroupAttributes {
    public override fun loadBalancerArns(): String? = unwrap(this).getLoadBalancerArns()

    public override fun targetGroupArn(): String = unwrap(this).getTargetGroupArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes):
        TargetGroupAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TargetGroupAttributes):
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
