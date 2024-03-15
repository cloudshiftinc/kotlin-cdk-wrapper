@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

public enum class EmailEncoding(
  private val cdkObject: software.amazon.awscdk.services.ses.actions.EmailEncoding,
) {
  BASE64(software.amazon.awscdk.services.ses.actions.EmailEncoding.BASE64),
  UTF8(software.amazon.awscdk.services.ses.actions.EmailEncoding.UTF8),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.EmailEncoding):
        EmailEncoding = when (cdkObject) {
      software.amazon.awscdk.services.ses.actions.EmailEncoding.BASE64 -> EmailEncoding.BASE64
      software.amazon.awscdk.services.ses.actions.EmailEncoding.UTF8 -> EmailEncoding.UTF8
    }

    internal fun unwrap(wrapped: EmailEncoding):
        software.amazon.awscdk.services.ses.actions.EmailEncoding = wrapped.cdkObject
  }
}
