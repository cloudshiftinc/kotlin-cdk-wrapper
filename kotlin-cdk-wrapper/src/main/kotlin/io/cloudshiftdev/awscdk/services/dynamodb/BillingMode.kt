@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dynamodb

public enum class BillingMode(
  private val cdkObject: software.amazon.awscdk.services.dynamodb.BillingMode,
) {
  PAY_PER_REQUEST(software.amazon.awscdk.services.dynamodb.BillingMode.PAY_PER_REQUEST),
  PROVISIONED(software.amazon.awscdk.services.dynamodb.BillingMode.PROVISIONED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.dynamodb.BillingMode): BillingMode
        = when (cdkObject) {
      software.amazon.awscdk.services.dynamodb.BillingMode.PAY_PER_REQUEST ->
          BillingMode.PAY_PER_REQUEST
      software.amazon.awscdk.services.dynamodb.BillingMode.PROVISIONED -> BillingMode.PROVISIONED
    }

    internal fun unwrap(wrapped: BillingMode): software.amazon.awscdk.services.dynamodb.BillingMode
        = wrapped.cdkObject
  }
}
