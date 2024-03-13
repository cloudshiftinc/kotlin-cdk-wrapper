package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import kotlin.Number
import kotlin.Unit

public interface WeightedTargetGroup {
  public fun targetGroup(): IApplicationTargetGroup

  public fun weight(): Number? = unwrap(this).getWeight()

  public interface Builder {
    public fun targetGroup(targetGroup: IApplicationTargetGroup) {
    }

    public fun weight(weight: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup.builder()

    public override fun targetGroup(targetGroup: IApplicationTargetGroup) {
      cdkBuilder.targetGroup(targetGroup.let(IApplicationTargetGroup::unwrap))
    }

    public override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup,
  ) : WeightedTargetGroup {
    public override fun targetGroup(): IApplicationTargetGroup =
        unwrap(this).getTargetGroup().let(IApplicationTargetGroup::wrap)

    public override fun weight(): Number? = unwrap(this).getWeight()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): WeightedTargetGroup {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup):
        WeightedTargetGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WeightedTargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup = (wrapped as
        Wrapper).cdkObject
  }
}
