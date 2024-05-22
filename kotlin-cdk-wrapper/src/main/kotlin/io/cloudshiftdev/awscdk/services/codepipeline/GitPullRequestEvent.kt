@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

public enum class GitPullRequestEvent(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.GitPullRequestEvent,
) {
  OPEN(software.amazon.awscdk.services.codepipeline.GitPullRequestEvent.OPEN),
  UPDATED(software.amazon.awscdk.services.codepipeline.GitPullRequestEvent.UPDATED),
  CLOSED(software.amazon.awscdk.services.codepipeline.GitPullRequestEvent.CLOSED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.GitPullRequestEvent):
        GitPullRequestEvent = when (cdkObject) {
      software.amazon.awscdk.services.codepipeline.GitPullRequestEvent.OPEN ->
          GitPullRequestEvent.OPEN
      software.amazon.awscdk.services.codepipeline.GitPullRequestEvent.UPDATED ->
          GitPullRequestEvent.UPDATED
      software.amazon.awscdk.services.codepipeline.GitPullRequestEvent.CLOSED ->
          GitPullRequestEvent.CLOSED
    }

    internal fun unwrap(wrapped: GitPullRequestEvent):
        software.amazon.awscdk.services.codepipeline.GitPullRequestEvent = wrapped.cdkObject
  }
}
