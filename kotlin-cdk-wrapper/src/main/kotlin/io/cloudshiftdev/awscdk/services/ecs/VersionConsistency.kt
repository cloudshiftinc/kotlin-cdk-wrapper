@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

public enum class VersionConsistency(
  private val cdkObject: software.amazon.awscdk.services.ecs.VersionConsistency,
) {
  ENABLED(software.amazon.awscdk.services.ecs.VersionConsistency.ENABLED),
  DISABLED(software.amazon.awscdk.services.ecs.VersionConsistency.DISABLED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.VersionConsistency):
        VersionConsistency = when (cdkObject) {
      software.amazon.awscdk.services.ecs.VersionConsistency.ENABLED -> VersionConsistency.ENABLED
      software.amazon.awscdk.services.ecs.VersionConsistency.DISABLED -> VersionConsistency.DISABLED
    }

    internal fun unwrap(wrapped: VersionConsistency):
        software.amazon.awscdk.services.ecs.VersionConsistency = wrapped.cdkObject
  }
}
