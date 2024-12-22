@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

public enum class FeaturePlan(
  private val cdkObject: software.amazon.awscdk.services.cognito.FeaturePlan,
) {
  LITE(software.amazon.awscdk.services.cognito.FeaturePlan.LITE),
  ESSENTIALS(software.amazon.awscdk.services.cognito.FeaturePlan.ESSENTIALS),
  PLUS(software.amazon.awscdk.services.cognito.FeaturePlan.PLUS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.FeaturePlan): FeaturePlan =
        when (cdkObject) {
      software.amazon.awscdk.services.cognito.FeaturePlan.LITE -> FeaturePlan.LITE
      software.amazon.awscdk.services.cognito.FeaturePlan.ESSENTIALS -> FeaturePlan.ESSENTIALS
      software.amazon.awscdk.services.cognito.FeaturePlan.PLUS -> FeaturePlan.PLUS
    }

    internal fun unwrap(wrapped: FeaturePlan): software.amazon.awscdk.services.cognito.FeaturePlan =
        wrapped.cdkObject
  }
}
