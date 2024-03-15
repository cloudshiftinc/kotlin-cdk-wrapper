@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

public enum class MailFromBehaviorOnMxFailure(
  private val cdkObject: software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure,
) {
  USE_DEFAULT_VALUE(software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure.USE_DEFAULT_VALUE),
  REJECT_MESSAGE(software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure.REJECT_MESSAGE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure):
        MailFromBehaviorOnMxFailure = when (cdkObject) {
      software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure.USE_DEFAULT_VALUE ->
          MailFromBehaviorOnMxFailure.USE_DEFAULT_VALUE
      software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure.REJECT_MESSAGE ->
          MailFromBehaviorOnMxFailure.REJECT_MESSAGE
    }

    internal fun unwrap(wrapped: MailFromBehaviorOnMxFailure):
        software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure = wrapped.cdkObject
  }
}
