@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

public enum class TracingConfig(
  private val cdkObject: software.amazon.awscdk.services.sns.TracingConfig,
) {
  PASS_THROUGH(software.amazon.awscdk.services.sns.TracingConfig.PASS_THROUGH),
  ACTIVE(software.amazon.awscdk.services.sns.TracingConfig.ACTIVE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.TracingConfig): TracingConfig =
        when (cdkObject) {
      software.amazon.awscdk.services.sns.TracingConfig.PASS_THROUGH -> TracingConfig.PASS_THROUGH
      software.amazon.awscdk.services.sns.TracingConfig.ACTIVE -> TracingConfig.ACTIVE
    }

    internal fun unwrap(wrapped: TracingConfig): software.amazon.awscdk.services.sns.TracingConfig =
        wrapped.cdkObject
  }
}
