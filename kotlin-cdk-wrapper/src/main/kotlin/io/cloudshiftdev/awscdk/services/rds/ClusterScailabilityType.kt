@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

public enum class ClusterScailabilityType(
  private val cdkObject: software.amazon.awscdk.services.rds.ClusterScailabilityType,
) {
  STANDARD(software.amazon.awscdk.services.rds.ClusterScailabilityType.STANDARD),
  LIMITLESS(software.amazon.awscdk.services.rds.ClusterScailabilityType.LIMITLESS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterScailabilityType):
        ClusterScailabilityType = when (cdkObject) {
      software.amazon.awscdk.services.rds.ClusterScailabilityType.STANDARD ->
          ClusterScailabilityType.STANDARD
      software.amazon.awscdk.services.rds.ClusterScailabilityType.LIMITLESS ->
          ClusterScailabilityType.LIMITLESS
    }

    internal fun unwrap(wrapped: ClusterScailabilityType):
        software.amazon.awscdk.services.rds.ClusterScailabilityType = wrapped.cdkObject
  }
}
