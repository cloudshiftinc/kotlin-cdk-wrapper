@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface WeightedTargetGroup {
  public fun targetGroup(): IApplicationTargetGroup

  public fun weight(): Number? = unwrap(this).getWeight()

  @CdkDslMarker
  public interface Builder {
    public fun targetGroup(targetGroup: IApplicationTargetGroup)

    public fun weight(weight: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup.builder()

    override fun targetGroup(targetGroup: IApplicationTargetGroup) {
      cdkBuilder.targetGroup(targetGroup.let(IApplicationTargetGroup::unwrap))
    }

    override fun weight(weight: Number) {
      cdkBuilder.weight(weight)
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup,
  ) : CdkObject(cdkObject), WeightedTargetGroup {
    override fun targetGroup(): IApplicationTargetGroup =
        unwrap(this).getTargetGroup().let(IApplicationTargetGroup::wrap)

    override fun weight(): Number? = unwrap(this).getWeight()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): WeightedTargetGroup {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup):
        WeightedTargetGroup = Wrapper(cdkObject)

    internal fun unwrap(wrapped: WeightedTargetGroup):
        software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.WeightedTargetGroup
  }
}
