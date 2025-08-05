@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

public enum class Result(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.Result,
) {
  ROLLBACK(software.amazon.awscdk.services.codepipeline.Result.ROLLBACK),
  FAIL(software.amazon.awscdk.services.codepipeline.Result.FAIL),
  RETRY(software.amazon.awscdk.services.codepipeline.Result.RETRY),
  SKIP(software.amazon.awscdk.services.codepipeline.Result.SKIP),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Result): Result = when
        (cdkObject) {
      software.amazon.awscdk.services.codepipeline.Result.ROLLBACK -> Result.ROLLBACK
      software.amazon.awscdk.services.codepipeline.Result.FAIL -> Result.FAIL
      software.amazon.awscdk.services.codepipeline.Result.RETRY -> Result.RETRY
      software.amazon.awscdk.services.codepipeline.Result.SKIP -> Result.SKIP
    }

    internal fun unwrap(wrapped: Result): software.amazon.awscdk.services.codepipeline.Result =
        wrapped.cdkObject
  }
}
