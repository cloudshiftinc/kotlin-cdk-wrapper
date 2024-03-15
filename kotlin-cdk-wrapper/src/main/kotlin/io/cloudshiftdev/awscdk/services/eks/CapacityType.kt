@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

public enum class CapacityType(
  private val cdkObject: software.amazon.awscdk.services.eks.CapacityType,
) {
  SPOT(software.amazon.awscdk.services.eks.CapacityType.SPOT),
  ON_DEMAND(software.amazon.awscdk.services.eks.CapacityType.ON_DEMAND),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CapacityType): CapacityType =
        when (cdkObject) {
      software.amazon.awscdk.services.eks.CapacityType.SPOT -> CapacityType.SPOT
      software.amazon.awscdk.services.eks.CapacityType.ON_DEMAND -> CapacityType.ON_DEMAND
    }

    internal fun unwrap(wrapped: CapacityType): software.amazon.awscdk.services.eks.CapacityType =
        wrapped.cdkObject
  }
}
