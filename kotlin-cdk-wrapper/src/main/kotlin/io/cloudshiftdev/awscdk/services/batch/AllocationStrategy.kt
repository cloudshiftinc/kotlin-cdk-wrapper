@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

public enum class AllocationStrategy(
  private val cdkObject: software.amazon.awscdk.services.batch.AllocationStrategy,
) {
  BEST_FIT(software.amazon.awscdk.services.batch.AllocationStrategy.BEST_FIT),
  BEST_FIT_PROGRESSIVE(software.amazon.awscdk.services.batch.AllocationStrategy.BEST_FIT_PROGRESSIVE),
  SPOT_CAPACITY_OPTIMIZED(software.amazon.awscdk.services.batch.AllocationStrategy.SPOT_CAPACITY_OPTIMIZED),
  SPOT_PRICE_CAPACITY_OPTIMIZED(software.amazon.awscdk.services.batch.AllocationStrategy.SPOT_PRICE_CAPACITY_OPTIMIZED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.AllocationStrategy):
        AllocationStrategy = when (cdkObject) {
      software.amazon.awscdk.services.batch.AllocationStrategy.BEST_FIT ->
          AllocationStrategy.BEST_FIT
      software.amazon.awscdk.services.batch.AllocationStrategy.BEST_FIT_PROGRESSIVE ->
          AllocationStrategy.BEST_FIT_PROGRESSIVE
      software.amazon.awscdk.services.batch.AllocationStrategy.SPOT_CAPACITY_OPTIMIZED ->
          AllocationStrategy.SPOT_CAPACITY_OPTIMIZED
      software.amazon.awscdk.services.batch.AllocationStrategy.SPOT_PRICE_CAPACITY_OPTIMIZED ->
          AllocationStrategy.SPOT_PRICE_CAPACITY_OPTIMIZED
    }

    internal fun unwrap(wrapped: AllocationStrategy):
        software.amazon.awscdk.services.batch.AllocationStrategy = wrapped.cdkObject
  }
}
