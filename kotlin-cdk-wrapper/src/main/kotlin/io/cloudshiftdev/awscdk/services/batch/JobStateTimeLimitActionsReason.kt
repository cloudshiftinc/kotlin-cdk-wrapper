@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

public enum class JobStateTimeLimitActionsReason(
  private val cdkObject: software.amazon.awscdk.services.batch.JobStateTimeLimitActionsReason,
) {
  INSUFFICIENT_INSTANCE_CAPACITY(software.amazon.awscdk.services.batch.JobStateTimeLimitActionsReason.INSUFFICIENT_INSTANCE_CAPACITY),
  COMPUTE_ENVIRONMENT_MAX_RESOURCE(software.amazon.awscdk.services.batch.JobStateTimeLimitActionsReason.COMPUTE_ENVIRONMENT_MAX_RESOURCE),
  JOB_RESOURCE_REQUIREMENT(software.amazon.awscdk.services.batch.JobStateTimeLimitActionsReason.JOB_RESOURCE_REQUIREMENT),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.batch.JobStateTimeLimitActionsReason):
        JobStateTimeLimitActionsReason = when (cdkObject) {
      software.amazon.awscdk.services.batch.JobStateTimeLimitActionsReason.INSUFFICIENT_INSTANCE_CAPACITY ->
          JobStateTimeLimitActionsReason.INSUFFICIENT_INSTANCE_CAPACITY
      software.amazon.awscdk.services.batch.JobStateTimeLimitActionsReason.COMPUTE_ENVIRONMENT_MAX_RESOURCE ->
          JobStateTimeLimitActionsReason.COMPUTE_ENVIRONMENT_MAX_RESOURCE
      software.amazon.awscdk.services.batch.JobStateTimeLimitActionsReason.JOB_RESOURCE_REQUIREMENT ->
          JobStateTimeLimitActionsReason.JOB_RESOURCE_REQUIREMENT
    }

    internal fun unwrap(wrapped: JobStateTimeLimitActionsReason):
        software.amazon.awscdk.services.batch.JobStateTimeLimitActionsReason = wrapped.cdkObject
  }
}
