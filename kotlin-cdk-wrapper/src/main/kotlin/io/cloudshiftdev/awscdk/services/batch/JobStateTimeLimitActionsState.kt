@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

public enum class JobStateTimeLimitActionsState(
  private val cdkObject: software.amazon.awscdk.services.batch.JobStateTimeLimitActionsState,
) {
  RUNNABLE(software.amazon.awscdk.services.batch.JobStateTimeLimitActionsState.RUNNABLE),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.JobStateTimeLimitActionsState):
        JobStateTimeLimitActionsState = when (cdkObject) {
      software.amazon.awscdk.services.batch.JobStateTimeLimitActionsState.RUNNABLE ->
          JobStateTimeLimitActionsState.RUNNABLE
    }

    internal fun unwrap(wrapped: JobStateTimeLimitActionsState):
        software.amazon.awscdk.services.batch.JobStateTimeLimitActionsState = wrapped.cdkObject
  }
}
