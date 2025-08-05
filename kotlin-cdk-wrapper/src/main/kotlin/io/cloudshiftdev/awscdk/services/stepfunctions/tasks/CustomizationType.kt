@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class CustomizationType(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CustomizationType,
) {
  FINE_TUNING(software.amazon.awscdk.services.stepfunctions.tasks.CustomizationType.FINE_TUNING),
  CONTINUED_PRE_TRAINING(software.amazon.awscdk.services.stepfunctions.tasks.CustomizationType.CONTINUED_PRE_TRAINING),
  DISTILLATION(software.amazon.awscdk.services.stepfunctions.tasks.CustomizationType.DISTILLATION),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.CustomizationType):
        CustomizationType = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.CustomizationType.FINE_TUNING ->
          CustomizationType.FINE_TUNING
      software.amazon.awscdk.services.stepfunctions.tasks.CustomizationType.CONTINUED_PRE_TRAINING ->
          CustomizationType.CONTINUED_PRE_TRAINING
      software.amazon.awscdk.services.stepfunctions.tasks.CustomizationType.DISTILLATION ->
          CustomizationType.DISTILLATION
    }

    internal fun unwrap(wrapped: CustomizationType):
        software.amazon.awscdk.services.stepfunctions.tasks.CustomizationType = wrapped.cdkObject
  }
}
