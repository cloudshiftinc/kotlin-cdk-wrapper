@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

public enum class JobStateTimeLimitActionsAction(
  private val cdkObject: software.amazon.awscdk.services.batch.JobStateTimeLimitActionsAction,
) {
  CANCEL(software.amazon.awscdk.services.batch.JobStateTimeLimitActionsAction.CANCEL),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.JobStateTimeLimitActionsAction):
        JobStateTimeLimitActionsAction = when (cdkObject) {
      software.amazon.awscdk.services.batch.JobStateTimeLimitActionsAction.CANCEL ->
          JobStateTimeLimitActionsAction.CANCEL
    }

    internal fun unwrap(wrapped: JobStateTimeLimitActionsAction):
        software.amazon.awscdk.services.batch.JobStateTimeLimitActionsAction = wrapped.cdkObject
  }
}
