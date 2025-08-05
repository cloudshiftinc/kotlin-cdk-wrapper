@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

public enum class RetryMode(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.RetryMode,
) {
  ALL_ACTIONS(software.amazon.awscdk.services.codepipeline.RetryMode.ALL_ACTIONS),
  FAILED_ACTIONS(software.amazon.awscdk.services.codepipeline.RetryMode.FAILED_ACTIONS),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.RetryMode): RetryMode
        = when (cdkObject) {
      software.amazon.awscdk.services.codepipeline.RetryMode.ALL_ACTIONS -> RetryMode.ALL_ACTIONS
      software.amazon.awscdk.services.codepipeline.RetryMode.FAILED_ACTIONS ->
          RetryMode.FAILED_ACTIONS
    }

    internal fun unwrap(wrapped: RetryMode): software.amazon.awscdk.services.codepipeline.RetryMode
        = wrapped.cdkObject
  }
}
