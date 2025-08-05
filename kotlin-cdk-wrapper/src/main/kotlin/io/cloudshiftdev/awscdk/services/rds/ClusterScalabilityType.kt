@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

public enum class ClusterScalabilityType(
  private val cdkObject: software.amazon.awscdk.services.rds.ClusterScalabilityType,
) {
  STANDARD(software.amazon.awscdk.services.rds.ClusterScalabilityType.STANDARD),
  LIMITLESS(software.amazon.awscdk.services.rds.ClusterScalabilityType.LIMITLESS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterScalabilityType):
        ClusterScalabilityType = when (cdkObject) {
      software.amazon.awscdk.services.rds.ClusterScalabilityType.STANDARD ->
          ClusterScalabilityType.STANDARD
      software.amazon.awscdk.services.rds.ClusterScalabilityType.LIMITLESS ->
          ClusterScalabilityType.LIMITLESS
    }

    internal fun unwrap(wrapped: ClusterScalabilityType):
        software.amazon.awscdk.services.rds.ClusterScalabilityType = wrapped.cdkObject
  }
}
