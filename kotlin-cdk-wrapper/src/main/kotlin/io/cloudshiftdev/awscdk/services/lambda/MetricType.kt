@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

public enum class MetricType(
  private val cdkObject: software.amazon.awscdk.services.lambda.MetricType,
) {
  EVENT_COUNT(software.amazon.awscdk.services.lambda.MetricType.EVENT_COUNT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.MetricType): MetricType =
        when (cdkObject) {
      software.amazon.awscdk.services.lambda.MetricType.EVENT_COUNT -> MetricType.EVENT_COUNT
    }

    internal fun unwrap(wrapped: MetricType): software.amazon.awscdk.services.lambda.MetricType =
        wrapped.cdkObject
  }
}
