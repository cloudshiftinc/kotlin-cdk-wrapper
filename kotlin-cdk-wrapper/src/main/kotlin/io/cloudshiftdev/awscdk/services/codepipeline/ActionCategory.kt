@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

public enum class ActionCategory(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.ActionCategory,
) {
  SOURCE(software.amazon.awscdk.services.codepipeline.ActionCategory.SOURCE),
  BUILD(software.amazon.awscdk.services.codepipeline.ActionCategory.BUILD),
  TEST(software.amazon.awscdk.services.codepipeline.ActionCategory.TEST),
  APPROVAL(software.amazon.awscdk.services.codepipeline.ActionCategory.APPROVAL),
  DEPLOY(software.amazon.awscdk.services.codepipeline.ActionCategory.DEPLOY),
  INVOKE(software.amazon.awscdk.services.codepipeline.ActionCategory.INVOKE),
  COMPUTE(software.amazon.awscdk.services.codepipeline.ActionCategory.COMPUTE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.ActionCategory):
        ActionCategory = when (cdkObject) {
      software.amazon.awscdk.services.codepipeline.ActionCategory.SOURCE -> ActionCategory.SOURCE
      software.amazon.awscdk.services.codepipeline.ActionCategory.BUILD -> ActionCategory.BUILD
      software.amazon.awscdk.services.codepipeline.ActionCategory.TEST -> ActionCategory.TEST
      software.amazon.awscdk.services.codepipeline.ActionCategory.APPROVAL ->
          ActionCategory.APPROVAL
      software.amazon.awscdk.services.codepipeline.ActionCategory.DEPLOY -> ActionCategory.DEPLOY
      software.amazon.awscdk.services.codepipeline.ActionCategory.INVOKE -> ActionCategory.INVOKE
      software.amazon.awscdk.services.codepipeline.ActionCategory.COMPUTE -> ActionCategory.COMPUTE
    }

    internal fun unwrap(wrapped: ActionCategory):
        software.amazon.awscdk.services.codepipeline.ActionCategory = wrapped.cdkObject
  }
}
