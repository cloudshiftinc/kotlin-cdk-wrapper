@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class AvailabilityZoneRebalancing(
  private val cdkObject: software.amazon.awscdk.services.ecs.AvailabilityZoneRebalancing,
) {
  ENABLED(software.amazon.awscdk.services.ecs.AvailabilityZoneRebalancing.ENABLED),
  DISABLED(software.amazon.awscdk.services.ecs.AvailabilityZoneRebalancing.DISABLED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.AvailabilityZoneRebalancing):
        AvailabilityZoneRebalancing = when (cdkObject) {
      software.amazon.awscdk.services.ecs.AvailabilityZoneRebalancing.ENABLED ->
          AvailabilityZoneRebalancing.ENABLED
      software.amazon.awscdk.services.ecs.AvailabilityZoneRebalancing.DISABLED ->
          AvailabilityZoneRebalancing.DISABLED
    }

    internal fun unwrap(wrapped: AvailabilityZoneRebalancing):
        software.amazon.awscdk.services.ecs.AvailabilityZoneRebalancing = wrapped.cdkObject
  }
}
