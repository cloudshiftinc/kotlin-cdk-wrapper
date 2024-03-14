package io.cloudshiftdev.awscdk.services.codepipeline.actions

public enum class JenkinsActionType(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType,
) {
  BUILD(software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType.BUILD),
  TEST(software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType.TEST),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType):
        JenkinsActionType = when (cdkObject) {
      software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType.BUILD ->
          JenkinsActionType.BUILD
      software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType.TEST ->
          JenkinsActionType.TEST
    }

    internal fun unwrap(wrapped: JenkinsActionType):
        software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType = wrapped.cdkObject
  }
}
