@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

public enum class PolicyValidationReportStatusBeta1(
  private val cdkObject: software.amazon.awscdk.PolicyValidationReportStatusBeta1,
) {
  SUCCESS(software.amazon.awscdk.PolicyValidationReportStatusBeta1.SUCCESS),
  FAILURE(software.amazon.awscdk.PolicyValidationReportStatusBeta1.FAILURE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.PolicyValidationReportStatusBeta1):
        PolicyValidationReportStatusBeta1 = when (cdkObject) {
      software.amazon.awscdk.PolicyValidationReportStatusBeta1.SUCCESS ->
          PolicyValidationReportStatusBeta1.SUCCESS
      software.amazon.awscdk.PolicyValidationReportStatusBeta1.FAILURE ->
          PolicyValidationReportStatusBeta1.FAILURE
    }

    internal fun unwrap(wrapped: PolicyValidationReportStatusBeta1):
        software.amazon.awscdk.PolicyValidationReportStatusBeta1 = wrapped.cdkObject
  }
}
