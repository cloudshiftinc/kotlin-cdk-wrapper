@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

public enum class ApproximateCreationDateTimePrecision(
  private val cdkObject:
      software.amazon.awscdk.services.dynamodb.ApproximateCreationDateTimePrecision,
) {
  MILLISECOND(software.amazon.awscdk.services.dynamodb.ApproximateCreationDateTimePrecision.MILLISECOND),
  MICROSECOND(software.amazon.awscdk.services.dynamodb.ApproximateCreationDateTimePrecision.MICROSECOND),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.ApproximateCreationDateTimePrecision):
        ApproximateCreationDateTimePrecision = when (cdkObject) {
      software.amazon.awscdk.services.dynamodb.ApproximateCreationDateTimePrecision.MILLISECOND ->
          ApproximateCreationDateTimePrecision.MILLISECOND
      software.amazon.awscdk.services.dynamodb.ApproximateCreationDateTimePrecision.MICROSECOND ->
          ApproximateCreationDateTimePrecision.MICROSECOND
    }

    internal fun unwrap(wrapped: ApproximateCreationDateTimePrecision):
        software.amazon.awscdk.services.dynamodb.ApproximateCreationDateTimePrecision =
        wrapped.cdkObject
  }
}
