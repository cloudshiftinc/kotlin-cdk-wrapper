@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class ActionOnFailure(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure,
) {
  TERMINATE_CLUSTER(software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure.TERMINATE_CLUSTER),
  CANCEL_AND_WAIT(software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure.CANCEL_AND_WAIT),
  CONTINUE(software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure.CONTINUE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure):
        ActionOnFailure = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure.TERMINATE_CLUSTER ->
          ActionOnFailure.TERMINATE_CLUSTER
      software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure.CANCEL_AND_WAIT ->
          ActionOnFailure.CANCEL_AND_WAIT
      software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure.CONTINUE ->
          ActionOnFailure.CONTINUE
    }

    internal fun unwrap(wrapped: ActionOnFailure):
        software.amazon.awscdk.services.stepfunctions.tasks.ActionOnFailure = wrapped.cdkObject
  }
}
