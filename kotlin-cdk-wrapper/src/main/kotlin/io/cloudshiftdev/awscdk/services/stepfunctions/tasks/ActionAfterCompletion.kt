@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class ActionAfterCompletion(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ActionAfterCompletion,
) {
  NONE(software.amazon.awscdk.services.stepfunctions.tasks.ActionAfterCompletion.NONE),
  DELETE(software.amazon.awscdk.services.stepfunctions.tasks.ActionAfterCompletion.DELETE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ActionAfterCompletion):
        ActionAfterCompletion = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.ActionAfterCompletion.NONE ->
          ActionAfterCompletion.NONE
      software.amazon.awscdk.services.stepfunctions.tasks.ActionAfterCompletion.DELETE ->
          ActionAfterCompletion.DELETE
    }

    internal fun unwrap(wrapped: ActionAfterCompletion):
        software.amazon.awscdk.services.stepfunctions.tasks.ActionAfterCompletion =
        wrapped.cdkObject
  }
}
