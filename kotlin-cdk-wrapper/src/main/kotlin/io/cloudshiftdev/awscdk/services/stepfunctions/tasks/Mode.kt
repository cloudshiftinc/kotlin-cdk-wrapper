@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class Mode(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Mode,
) {
  SINGLE_MODEL(software.amazon.awscdk.services.stepfunctions.tasks.Mode.SINGLE_MODEL),
  MULTI_MODEL(software.amazon.awscdk.services.stepfunctions.tasks.Mode.MULTI_MODEL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.Mode): Mode =
        when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.Mode.SINGLE_MODEL -> Mode.SINGLE_MODEL
      software.amazon.awscdk.services.stepfunctions.tasks.Mode.MULTI_MODEL -> Mode.MULTI_MODEL
    }

    internal fun unwrap(wrapped: Mode): software.amazon.awscdk.services.stepfunctions.tasks.Mode =
        wrapped.cdkObject
  }
}
