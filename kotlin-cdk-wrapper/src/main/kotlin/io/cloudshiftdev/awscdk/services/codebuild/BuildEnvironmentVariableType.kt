@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

public enum class BuildEnvironmentVariableType(
  private val cdkObject: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType,
) {
  PLAINTEXT(software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType.PLAINTEXT),
  PARAMETER_STORE(software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType.PARAMETER_STORE),
  SECRETS_MANAGER(software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType.SECRETS_MANAGER),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType):
        BuildEnvironmentVariableType = when (cdkObject) {
      software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType.PLAINTEXT ->
          BuildEnvironmentVariableType.PLAINTEXT
      software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType.PARAMETER_STORE ->
          BuildEnvironmentVariableType.PARAMETER_STORE
      software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType.SECRETS_MANAGER ->
          BuildEnvironmentVariableType.SECRETS_MANAGER
    }

    internal fun unwrap(wrapped: BuildEnvironmentVariableType):
        software.amazon.awscdk.services.codebuild.BuildEnvironmentVariableType = wrapped.cdkObject
  }
}
