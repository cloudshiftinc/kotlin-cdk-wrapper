package io.cloudshiftdev.awscdk.services.codepipeline.actions

public enum class CodeBuildActionType(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType,
) {
  BUILD(software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType.BUILD),
  TEST(software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType.TEST),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType):
        CodeBuildActionType = when (cdkObject) {
      software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType.BUILD ->
          CodeBuildActionType.BUILD
      software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType.TEST ->
          CodeBuildActionType.TEST
    }

    internal fun unwrap(wrapped: CodeBuildActionType):
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType = wrapped.cdkObject
  }
}
