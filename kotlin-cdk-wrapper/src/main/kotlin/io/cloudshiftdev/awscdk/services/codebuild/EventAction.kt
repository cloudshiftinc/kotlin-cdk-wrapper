@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

public enum class EventAction(
  private val cdkObject: software.amazon.awscdk.services.codebuild.EventAction,
) {
  PUSH(software.amazon.awscdk.services.codebuild.EventAction.PUSH),
  PULL_REQUEST_CREATED(software.amazon.awscdk.services.codebuild.EventAction.PULL_REQUEST_CREATED),
  PULL_REQUEST_UPDATED(software.amazon.awscdk.services.codebuild.EventAction.PULL_REQUEST_UPDATED),
  PULL_REQUEST_MERGED(software.amazon.awscdk.services.codebuild.EventAction.PULL_REQUEST_MERGED),
  PULL_REQUEST_REOPENED(software.amazon.awscdk.services.codebuild.EventAction.PULL_REQUEST_REOPENED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.EventAction): EventAction
        = when (cdkObject) {
      software.amazon.awscdk.services.codebuild.EventAction.PUSH -> EventAction.PUSH
      software.amazon.awscdk.services.codebuild.EventAction.PULL_REQUEST_CREATED ->
          EventAction.PULL_REQUEST_CREATED
      software.amazon.awscdk.services.codebuild.EventAction.PULL_REQUEST_UPDATED ->
          EventAction.PULL_REQUEST_UPDATED
      software.amazon.awscdk.services.codebuild.EventAction.PULL_REQUEST_MERGED ->
          EventAction.PULL_REQUEST_MERGED
      software.amazon.awscdk.services.codebuild.EventAction.PULL_REQUEST_REOPENED ->
          EventAction.PULL_REQUEST_REOPENED
    }

    internal fun unwrap(wrapped: EventAction): software.amazon.awscdk.services.codebuild.EventAction
        = wrapped.cdkObject
  }
}
