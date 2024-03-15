@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

public enum class SpotAllocationStrategy(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.SpotAllocationStrategy,
) {
  LOWEST_PRICE(software.amazon.awscdk.services.autoscaling.SpotAllocationStrategy.LOWEST_PRICE),
  CAPACITY_OPTIMIZED(software.amazon.awscdk.services.autoscaling.SpotAllocationStrategy.CAPACITY_OPTIMIZED),
  CAPACITY_OPTIMIZED_PRIORITIZED(software.amazon.awscdk.services.autoscaling.SpotAllocationStrategy.CAPACITY_OPTIMIZED_PRIORITIZED),
  PRICE_CAPACITY_OPTIMIZED(software.amazon.awscdk.services.autoscaling.SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.SpotAllocationStrategy):
        SpotAllocationStrategy = when (cdkObject) {
      software.amazon.awscdk.services.autoscaling.SpotAllocationStrategy.LOWEST_PRICE ->
          SpotAllocationStrategy.LOWEST_PRICE
      software.amazon.awscdk.services.autoscaling.SpotAllocationStrategy.CAPACITY_OPTIMIZED ->
          SpotAllocationStrategy.CAPACITY_OPTIMIZED
      software.amazon.awscdk.services.autoscaling.SpotAllocationStrategy.CAPACITY_OPTIMIZED_PRIORITIZED ->
          SpotAllocationStrategy.CAPACITY_OPTIMIZED_PRIORITIZED
      software.amazon.awscdk.services.autoscaling.SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED ->
          SpotAllocationStrategy.PRICE_CAPACITY_OPTIMIZED
    }

    internal fun unwrap(wrapped: SpotAllocationStrategy):
        software.amazon.awscdk.services.autoscaling.SpotAllocationStrategy = wrapped.cdkObject
  }
}
