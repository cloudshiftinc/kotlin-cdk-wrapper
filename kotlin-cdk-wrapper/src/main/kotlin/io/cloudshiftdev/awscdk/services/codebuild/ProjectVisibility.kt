@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

public enum class ProjectVisibility(
  private val cdkObject: software.amazon.awscdk.services.codebuild.ProjectVisibility,
) {
  PUBLIC_READ(software.amazon.awscdk.services.codebuild.ProjectVisibility.PUBLIC_READ),
  PRIVATE(software.amazon.awscdk.services.codebuild.ProjectVisibility.PRIVATE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ProjectVisibility):
        ProjectVisibility = when (cdkObject) {
      software.amazon.awscdk.services.codebuild.ProjectVisibility.PUBLIC_READ ->
          ProjectVisibility.PUBLIC_READ
      software.amazon.awscdk.services.codebuild.ProjectVisibility.PRIVATE ->
          ProjectVisibility.PRIVATE
    }

    internal fun unwrap(wrapped: ProjectVisibility):
        software.amazon.awscdk.services.codebuild.ProjectVisibility = wrapped.cdkObject
  }
}
