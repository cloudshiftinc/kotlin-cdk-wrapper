package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface TargetGroupAttributes {
  /**
   * A Token representing the list of ARNs for the load balancer routing to this target group.
   */
  public fun loadBalancerArns(): String? = unwrap(this).getLoadBalancerArns()

  /**
   * ARN of the target group.
   */
  public fun targetGroupArn(): String

  /**
   * A builder for [TargetGroupAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param loadBalancerArns A Token representing the list of ARNs for the load balancer routing
     * to this target group.
     */
    public fun loadBalancerArns(loadBalancerArns: String)

    /**
     * @param targetGroupArn ARN of the target group. 
     */
    public fun targetGroupArn(targetGroupArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes.builder()

    /**
     * @param loadBalancerArns A Token representing the list of ARNs for the load balancer routing
     * to this target group.
     */
    override fun loadBalancerArns(loadBalancerArns: String) {
      cdkBuilder.loadBalancerArns(loadBalancerArns)
    }

    /**
     * @param targetGroupArn ARN of the target group. 
     */
    override fun targetGroupArn(targetGroupArn: String) {
      cdkBuilder.targetGroupArn(targetGroupArn)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes
        = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes,
  ) : TargetGroupAttributes {
    /**
     * A Token representing the list of ARNs for the load balancer routing to this target group.
     */
    override fun loadBalancerArns(): String? = unwrap(this).getLoadBalancerArns()

    /**
     * ARN of the target group.
     */
    override fun targetGroupArn(): String = unwrap(this).getTargetGroupArn()
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
