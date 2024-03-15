@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

public enum class S3Trigger(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3Trigger,
) {
  NONE(software.amazon.awscdk.services.codepipeline.actions.S3Trigger.NONE),
  POLL(software.amazon.awscdk.services.codepipeline.actions.S3Trigger.POLL),
  EVENTS(software.amazon.awscdk.services.codepipeline.actions.S3Trigger.EVENTS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.S3Trigger):
        S3Trigger = when (cdkObject) {
      software.amazon.awscdk.services.codepipeline.actions.S3Trigger.NONE -> S3Trigger.NONE
      software.amazon.awscdk.services.codepipeline.actions.S3Trigger.POLL -> S3Trigger.POLL
      software.amazon.awscdk.services.codepipeline.actions.S3Trigger.EVENTS -> S3Trigger.EVENTS
    }

    internal fun unwrap(wrapped: S3Trigger):
        software.amazon.awscdk.services.codepipeline.actions.S3Trigger = wrapped.cdkObject
  }
}
