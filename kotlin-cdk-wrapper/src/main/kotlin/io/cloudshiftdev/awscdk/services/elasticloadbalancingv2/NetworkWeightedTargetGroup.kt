@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface NetworkWeightedTargetGroup {
  public fun targetGroup(): INetworkTargetGroup

  public fun weight(): Number? = unwrap(this).getWeight()

  @CdkDslMarker
  public interface Builder {
    public fun targetGroup(targetGroup: INetworkTargetGroup)

    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.NetworkWeightedTargetGroup.builder()

    override fun targetGroup(targetGroup: INetworkTargetGroup) {
      cdkBuilder.targetGroup(targetGroup.let(INetworkTargetGroup::unwrap))
    }

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
    override fun targetGroup(): INetworkTargetGroup =
        unwrap(this).getTargetGroup().let(INetworkTargetGroup::wrap)

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
