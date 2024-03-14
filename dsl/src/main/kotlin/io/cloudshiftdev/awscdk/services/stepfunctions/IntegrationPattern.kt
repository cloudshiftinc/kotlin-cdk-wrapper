package io.cloudshiftdev.awscdk.services.stepfunctions

public enum class IntegrationPattern(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.IntegrationPattern,
) {
  REQUEST_RESPONSE(software.amazon.awscdk.services.stepfunctions.IntegrationPattern.REQUEST_RESPONSE),
  RUN_JOB(software.amazon.awscdk.services.stepfunctions.IntegrationPattern.RUN_JOB),
  WAIT_FOR_TASK_TOKEN(software.amazon.awscdk.services.stepfunctions.IntegrationPattern.WAIT_FOR_TASK_TOKEN),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.IntegrationPattern):
        IntegrationPattern = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.IntegrationPattern.REQUEST_RESPONSE ->
          IntegrationPattern.REQUEST_RESPONSE
      software.amazon.awscdk.services.stepfunctions.IntegrationPattern.RUN_JOB ->
          IntegrationPattern.RUN_JOB
      software.amazon.awscdk.services.stepfunctions.IntegrationPattern.WAIT_FOR_TASK_TOKEN ->
          IntegrationPattern.WAIT_FOR_TASK_TOKEN
    }

    internal fun unwrap(wrapped: IntegrationPattern):
        software.amazon.awscdk.services.stepfunctions.IntegrationPattern = wrapped.cdkObject
  }
}
