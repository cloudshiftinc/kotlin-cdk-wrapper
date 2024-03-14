package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Any
import kotlin.Unit

public interface LoadBalancerTargetProps {
  public fun targetJson(): Any? = unwrap(this).getTargetJson()

  public fun targetType(): TargetType

  public interface Builder {
    public fun targetJson(targetJson: Any)

    public fun targetType(targetType: TargetType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps.builder()

    override fun targetJson(targetJson: Any) {
      cdkBuilder.targetJson(targetJson)
    }

    override fun targetType(targetType: TargetType) {
      cdkBuilder.targetType(targetType.let(TargetType::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps,
  ) : LoadBalancerTargetProps {
    override fun targetJson(): Any? = unwrap(this).getTargetJson()

    override fun targetType(): TargetType = unwrap(this).getTargetType().let(TargetType::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerTargetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps):
        LoadBalancerTargetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerTargetProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.LoadBalancerTargetProps = (wrapped as
        Wrapper).cdkObject
  }
}
