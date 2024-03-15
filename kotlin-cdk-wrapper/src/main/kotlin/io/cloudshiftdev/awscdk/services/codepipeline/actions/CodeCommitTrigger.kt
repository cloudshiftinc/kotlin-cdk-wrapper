@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

public enum class CodeCommitTrigger(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger,
) {
  NONE(software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger.NONE),
  POLL(software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger.POLL),
  EVENTS(software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger.EVENTS),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger):
        CodeCommitTrigger = when (cdkObject) {
      software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger.NONE ->
          CodeCommitTrigger.NONE
      software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger.POLL ->
          CodeCommitTrigger.POLL
      software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger.EVENTS ->
          CodeCommitTrigger.EVENTS
    }

    internal fun unwrap(wrapped: CodeCommitTrigger):
        software.amazon.awscdk.services.codepipeline.actions.CodeCommitTrigger = wrapped.cdkObject
  }
}
