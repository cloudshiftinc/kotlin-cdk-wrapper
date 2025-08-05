@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

public enum class HandlerBehavior(
  private val cdkObject: software.amazon.awscdk.services.appsync.HandlerBehavior,
) {
  CODE(software.amazon.awscdk.services.appsync.HandlerBehavior.CODE),
  DIRECT(software.amazon.awscdk.services.appsync.HandlerBehavior.DIRECT),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.HandlerBehavior):
        HandlerBehavior = when (cdkObject) {
      software.amazon.awscdk.services.appsync.HandlerBehavior.CODE -> HandlerBehavior.CODE
      software.amazon.awscdk.services.appsync.HandlerBehavior.DIRECT -> HandlerBehavior.DIRECT
    }

    internal fun unwrap(wrapped: HandlerBehavior):
        software.amazon.awscdk.services.appsync.HandlerBehavior = wrapped.cdkObject
  }
}
