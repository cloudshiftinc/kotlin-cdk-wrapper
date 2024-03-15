@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

public enum class GitHubTrigger(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger,
) {
  NONE(software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger.NONE),
  POLL(software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger.POLL),
  WEBHOOK(software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger.WEBHOOK),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger):
        GitHubTrigger = when (cdkObject) {
      software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger.NONE -> GitHubTrigger.NONE
      software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger.POLL -> GitHubTrigger.POLL
      software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger.WEBHOOK ->
          GitHubTrigger.WEBHOOK
    }

    internal fun unwrap(wrapped: GitHubTrigger):
        software.amazon.awscdk.services.codepipeline.actions.GitHubTrigger = wrapped.cdkObject
  }
}
