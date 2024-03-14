package io.cloudshiftdev.awscdk.services.stepfunctions

public enum class ServiceIntegrationPattern(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern,
) {
  FIRE_AND_FORGET(software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern.FIRE_AND_FORGET),
  SYNC(software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern.SYNC),
  WAIT_FOR_TASK_TOKEN(software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern.WAIT_FOR_TASK_TOKEN),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern):
        ServiceIntegrationPattern = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern.FIRE_AND_FORGET ->
          ServiceIntegrationPattern.FIRE_AND_FORGET
      software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern.SYNC ->
          ServiceIntegrationPattern.SYNC
      software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern.WAIT_FOR_TASK_TOKEN ->
          ServiceIntegrationPattern.WAIT_FOR_TASK_TOKEN
    }

    internal fun unwrap(wrapped: ServiceIntegrationPattern):
        software.amazon.awscdk.services.stepfunctions.ServiceIntegrationPattern = wrapped.cdkObject
  }
}
