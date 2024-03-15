@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface InstancesDistribution {
  public fun onDemandAllocationStrategy(): OnDemandAllocationStrategy? =
      unwrap(this).getOnDemandAllocationStrategy()?.let(OnDemandAllocationStrategy::wrap)

  public fun onDemandBaseCapacity(): Number? = unwrap(this).getOnDemandBaseCapacity()

  public fun onDemandPercentageAboveBaseCapacity(): Number? =
      unwrap(this).getOnDemandPercentageAboveBaseCapacity()

  public fun spotAllocationStrategy(): SpotAllocationStrategy? =
      unwrap(this).getSpotAllocationStrategy()?.let(SpotAllocationStrategy::wrap)

  public fun spotInstancePools(): Number? = unwrap(this).getSpotInstancePools()

  public fun spotMaxPrice(): String? = unwrap(this).getSpotMaxPrice()

  @CdkDslMarker
  public interface Builder {
    public fun onDemandAllocationStrategy(onDemandAllocationStrategy: OnDemandAllocationStrategy)

    public fun onDemandBaseCapacity(onDemandBaseCapacity: Number)

    public fun onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity: Number)

    public fun spotAllocationStrategy(spotAllocationStrategy: SpotAllocationStrategy)

    public fun spotInstancePools(spotInstancePools: Number)

    public fun spotMaxPrice(spotMaxPrice: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.InstancesDistribution.Builder =
        software.amazon.awscdk.services.autoscaling.InstancesDistribution.builder()

    override
        fun onDemandAllocationStrategy(onDemandAllocationStrategy: OnDemandAllocationStrategy) {
      cdkBuilder.onDemandAllocationStrategy(onDemandAllocationStrategy.let(OnDemandAllocationStrategy::unwrap))
    }

    override fun onDemandBaseCapacity(onDemandBaseCapacity: Number) {
      cdkBuilder.onDemandBaseCapacity(onDemandBaseCapacity)
    }

    override fun onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity: Number) {
      cdkBuilder.onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity)
    }

    override fun spotAllocationStrategy(spotAllocationStrategy: SpotAllocationStrategy) {
      cdkBuilder.spotAllocationStrategy(spotAllocationStrategy.let(SpotAllocationStrategy::unwrap))
    }

    override fun spotInstancePools(spotInstancePools: Number) {
      cdkBuilder.spotInstancePools(spotInstancePools)
    }

    override fun spotMaxPrice(spotMaxPrice: String) {
      cdkBuilder.spotMaxPrice(spotMaxPrice)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.InstancesDistribution =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.InstancesDistribution,
  ) : CdkObject(cdkObject), InstancesDistribution {
    override fun onDemandAllocationStrategy(): OnDemandAllocationStrategy? =
        unwrap(this).getOnDemandAllocationStrategy()?.let(OnDemandAllocationStrategy::wrap)

    override fun onDemandBaseCapacity(): Number? = unwrap(this).getOnDemandBaseCapacity()

    override fun onDemandPercentageAboveBaseCapacity(): Number? =
        unwrap(this).getOnDemandPercentageAboveBaseCapacity()

    override fun spotAllocationStrategy(): SpotAllocationStrategy? =
        unwrap(this).getSpotAllocationStrategy()?.let(SpotAllocationStrategy::wrap)

    override fun spotInstancePools(): Number? = unwrap(this).getSpotInstancePools()

    override fun spotMaxPrice(): String? = unwrap(this).getSpotMaxPrice()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstancesDistribution {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.InstancesDistribution):
        InstancesDistribution = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstancesDistribution):
        software.amazon.awscdk.services.autoscaling.InstancesDistribution = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.InstancesDistribution
  }
}
