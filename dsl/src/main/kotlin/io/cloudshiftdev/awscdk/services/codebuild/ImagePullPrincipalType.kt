package io.cloudshiftdev.awscdk.services.codebuild

public enum class ImagePullPrincipalType(
  private val cdkObject: software.amazon.awscdk.services.codebuild.ImagePullPrincipalType,
) {
  CODEBUILD(software.amazon.awscdk.services.codebuild.ImagePullPrincipalType.CODEBUILD),
  SERVICE_ROLE(software.amazon.awscdk.services.codebuild.ImagePullPrincipalType.SERVICE_ROLE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ImagePullPrincipalType):
        ImagePullPrincipalType = when (cdkObject) {
      software.amazon.awscdk.services.codebuild.ImagePullPrincipalType.CODEBUILD ->
          ImagePullPrincipalType.CODEBUILD
      software.amazon.awscdk.services.codebuild.ImagePullPrincipalType.SERVICE_ROLE ->
          ImagePullPrincipalType.SERVICE_ROLE
    }

    internal fun unwrap(wrapped: ImagePullPrincipalType):
        software.amazon.awscdk.services.codebuild.ImagePullPrincipalType = wrapped.cdkObject
  }
}
