@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudtrail

public enum class ManagementEventSources(
  private val cdkObject: software.amazon.awscdk.services.cloudtrail.ManagementEventSources,
) {
  KMS(software.amazon.awscdk.services.cloudtrail.ManagementEventSources.KMS),
  RDS_DATA_API(software.amazon.awscdk.services.cloudtrail.ManagementEventSources.RDS_DATA_API),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudtrail.ManagementEventSources):
        ManagementEventSources = when (cdkObject) {
      software.amazon.awscdk.services.cloudtrail.ManagementEventSources.KMS ->
          ManagementEventSources.KMS
      software.amazon.awscdk.services.cloudtrail.ManagementEventSources.RDS_DATA_API ->
          ManagementEventSources.RDS_DATA_API
    }

    internal fun unwrap(wrapped: ManagementEventSources):
        software.amazon.awscdk.services.cloudtrail.ManagementEventSources = wrapped.cdkObject
  }
}
