package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface WeightedTargetGroup {
  /**
   * The target group.
   */
  public fun targetGroup(): IApplicationTargetGroup

  /**
   * The target group's weight.
   *
   * Range is [0..1000).
   *
   * Default: 1
   */
  public fun weight(): Number? = unwrap(this).getWeight()

  /**
   * A builder for [WeightedTargetGroup]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param targetGroup The target group. 
     */
    public fun targetGroup(targetGroup: IApplicationTargetGroup)

    /**
     * @param weight The target group's weight.
     * Range is [0..1000).
     */
    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup.builder()

    /**
     * @param targetGroup The target group. 
     */
    override fun targetGroup(targetGroup: IApplicationTargetGroup) {
      cdkBuilder.targetGroup(targetGroup.let(IApplicationTargetGroup::unwrap))
    }

    /**
     * @param weight The target group's weight.
     * Range is [0..1000).
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup,
  ) : WeightedTargetGroup {
    /**
     * The target group.
     */
    override fun targetGroup(): IApplicationTargetGroup =
        unwrap(this).getTargetGroup().let(IApplicationTargetGroup::wrap)

    /**
     * The target group's weight.
     *
     * Range is [0..1000).
     *
     * Default: 1
     */
    override fun weight(): Number? = unwrap(this).getWeight()
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
