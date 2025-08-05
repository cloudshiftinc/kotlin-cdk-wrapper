@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

public enum class CapacityDistributionStrategy(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.CapacityDistributionStrategy,
) {
  BALANCED_ONLY(software.amazon.awscdk.services.autoscaling.CapacityDistributionStrategy.BALANCED_ONLY),
  BALANCED_BEST_EFFORT(software.amazon.awscdk.services.autoscaling.CapacityDistributionStrategy.BALANCED_BEST_EFFORT),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CapacityDistributionStrategy):
        CapacityDistributionStrategy = when (cdkObject) {
      software.amazon.awscdk.services.autoscaling.CapacityDistributionStrategy.BALANCED_ONLY ->
          CapacityDistributionStrategy.BALANCED_ONLY
      software.amazon.awscdk.services.autoscaling.CapacityDistributionStrategy.BALANCED_BEST_EFFORT ->
          CapacityDistributionStrategy.BALANCED_BEST_EFFORT
    }

    internal fun unwrap(wrapped: CapacityDistributionStrategy):
        software.amazon.awscdk.services.autoscaling.CapacityDistributionStrategy = wrapped.cdkObject
  }
}
