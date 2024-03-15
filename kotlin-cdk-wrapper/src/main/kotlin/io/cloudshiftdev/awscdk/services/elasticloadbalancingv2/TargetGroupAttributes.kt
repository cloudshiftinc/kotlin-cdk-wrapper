@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface TargetGroupAttributes {
  public fun loadBalancerArns(): String? = unwrap(this).getLoadBalancerArns()

  public fun targetGroupArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun loadBalancerArns(loadBalancerArns: String)

    public fun targetGroupArn(targetGroupArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes.builder()

    override fun loadBalancerArns(loadBalancerArns: String) {
      cdkBuilder.loadBalancerArns(loadBalancerArns)
    }

    override fun targetGroupArn(targetGroupArn: String) {
      cdkBuilder.targetGroupArn(targetGroupArn)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes,
  ) : CdkObject(cdkObject), TargetGroupAttributes {
    override fun loadBalancerArns(): String? = unwrap(this).getLoadBalancerArns()

    override fun targetGroupArn(): String = unwrap(this).getTargetGroupArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes):
        TargetGroupAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TargetGroupAttributes):
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.TargetGroupAttributes
  }
}
