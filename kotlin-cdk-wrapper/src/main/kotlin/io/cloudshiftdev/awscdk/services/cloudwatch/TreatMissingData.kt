@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

public enum class TreatMissingData(
  private val cdkObject: software.amazon.awscdk.services.cloudwatch.TreatMissingData,
) {
  BREACHING(software.amazon.awscdk.services.cloudwatch.TreatMissingData.BREACHING),
  NOT_BREACHING(software.amazon.awscdk.services.cloudwatch.TreatMissingData.NOT_BREACHING),
  IGNORE(software.amazon.awscdk.services.cloudwatch.TreatMissingData.IGNORE),
  MISSING(software.amazon.awscdk.services.cloudwatch.TreatMissingData.MISSING),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.TreatMissingData):
        TreatMissingData = when (cdkObject) {
      software.amazon.awscdk.services.cloudwatch.TreatMissingData.BREACHING ->
          TreatMissingData.BREACHING
      software.amazon.awscdk.services.cloudwatch.TreatMissingData.NOT_BREACHING ->
          TreatMissingData.NOT_BREACHING
      software.amazon.awscdk.services.cloudwatch.TreatMissingData.IGNORE -> TreatMissingData.IGNORE
      software.amazon.awscdk.services.cloudwatch.TreatMissingData.MISSING ->
          TreatMissingData.MISSING
    }

    internal fun unwrap(wrapped: TreatMissingData):
        software.amazon.awscdk.services.cloudwatch.TreatMissingData = wrapped.cdkObject
  }
}
