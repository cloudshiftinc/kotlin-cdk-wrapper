@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

public enum class LambdaInvocationType(
  private val cdkObject: software.amazon.awscdk.services.ses.actions.LambdaInvocationType,
) {
  EVENT(software.amazon.awscdk.services.ses.actions.LambdaInvocationType.EVENT),
  REQUEST_RESPONSE(software.amazon.awscdk.services.ses.actions.LambdaInvocationType.REQUEST_RESPONSE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.LambdaInvocationType):
        LambdaInvocationType = when (cdkObject) {
      software.amazon.awscdk.services.ses.actions.LambdaInvocationType.EVENT ->
          LambdaInvocationType.EVENT
      software.amazon.awscdk.services.ses.actions.LambdaInvocationType.REQUEST_RESPONSE ->
          LambdaInvocationType.REQUEST_RESPONSE
    }

    internal fun unwrap(wrapped: LambdaInvocationType):
        software.amazon.awscdk.services.ses.actions.LambdaInvocationType = wrapped.cdkObject
  }
}
