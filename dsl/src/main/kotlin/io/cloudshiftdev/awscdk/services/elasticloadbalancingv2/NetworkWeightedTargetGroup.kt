package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface NetworkWeightedTargetGroup {
  /**
   * The target group.
   */
  public fun targetGroup(): INetworkTargetGroup

  /**
   * The target group's weight.
   *
   * Range is [0..1000).
   *
   * Default: 1
   */
  public fun weight(): Number? = unwrap(this).getWeight()

  /**
   * A builder for [NetworkWeightedTargetGroup]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param targetGroup The target group. 
     */
    public fun targetGroup(targetGroup: INetworkTargetGroup)

    /**
     * @param weight The target group's weight.
     * Range is [0..1000).
     */
    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup.builder()

    /**
     * @param targetGroup The target group. 
     */
    override fun targetGroup(targetGroup: INetworkTargetGroup) {
      cdkBuilder.targetGroup(targetGroup.let(INetworkTargetGroup::unwrap))
    }

    /**
     * @param weight The target group's weight.
     * Range is [0..1000).
     */
    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup,
  ) : CdkObject(cdkObject), NetworkWeightedTargetGroup {
    /**
     * The target group.
     */
    override fun targetGroup(): INetworkTargetGroup =
        unwrap(this).getTargetGroup().let(INetworkTargetGroup::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkWeightedTargetGroup {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup):
        NetworkWeightedTargetGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkWeightedTargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup
  }
}
