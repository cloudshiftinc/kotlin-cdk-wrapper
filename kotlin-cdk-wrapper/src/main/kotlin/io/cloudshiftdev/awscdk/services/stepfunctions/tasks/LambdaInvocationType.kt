@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class LambdaInvocationType(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType,
) {
  REQUEST_RESPONSE(software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType.REQUEST_RESPONSE),
  EVENT(software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType.EVENT),
  DRY_RUN(software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType.DRY_RUN),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType):
        LambdaInvocationType = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType.REQUEST_RESPONSE ->
          LambdaInvocationType.REQUEST_RESPONSE
      software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType.EVENT ->
          LambdaInvocationType.EVENT
      software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType.DRY_RUN ->
          LambdaInvocationType.DRY_RUN
    }

    internal fun unwrap(wrapped: LambdaInvocationType):
        software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvocationType = wrapped.cdkObject
  }
}
