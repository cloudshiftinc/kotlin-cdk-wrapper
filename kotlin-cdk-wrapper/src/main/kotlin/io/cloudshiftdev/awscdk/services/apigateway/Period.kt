@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

public enum class Period(
  private val cdkObject: software.amazon.awscdk.services.apigateway.Period,
) {
  DAY(software.amazon.awscdk.services.apigateway.Period.DAY),
  WEEK(software.amazon.awscdk.services.apigateway.Period.WEEK),
  MONTH(software.amazon.awscdk.services.apigateway.Period.MONTH),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.Period): Period = when
        (cdkObject) {
      software.amazon.awscdk.services.apigateway.Period.DAY -> Period.DAY
      software.amazon.awscdk.services.apigateway.Period.WEEK -> Period.WEEK
      software.amazon.awscdk.services.apigateway.Period.MONTH -> Period.MONTH
    }

    internal fun unwrap(wrapped: Period): software.amazon.awscdk.services.apigateway.Period =
        wrapped.cdkObject
  }
}
