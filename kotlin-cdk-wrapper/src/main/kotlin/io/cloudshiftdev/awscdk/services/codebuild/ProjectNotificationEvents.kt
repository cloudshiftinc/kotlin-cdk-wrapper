@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

public enum class ProjectNotificationEvents(
  private val cdkObject: software.amazon.awscdk.services.codebuild.ProjectNotificationEvents,
) {
  BUILD_FAILED(software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_FAILED),
  BUILD_SUCCEEDED(software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_SUCCEEDED),
  BUILD_IN_PROGRESS(software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_IN_PROGRESS),
  BUILD_STOPPED(software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_STOPPED),
  BUILD_PHASE_FAILED(software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_PHASE_FAILED),
  BUILD_PHASE_SUCCEEDED(software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_PHASE_SUCCEEDED),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.ProjectNotificationEvents):
        ProjectNotificationEvents = when (cdkObject) {
      software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_FAILED ->
          ProjectNotificationEvents.BUILD_FAILED
      software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_SUCCEEDED ->
          ProjectNotificationEvents.BUILD_SUCCEEDED
      software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_IN_PROGRESS ->
          ProjectNotificationEvents.BUILD_IN_PROGRESS
      software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_STOPPED ->
          ProjectNotificationEvents.BUILD_STOPPED
      software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_PHASE_FAILED ->
          ProjectNotificationEvents.BUILD_PHASE_FAILED
      software.amazon.awscdk.services.codebuild.ProjectNotificationEvents.BUILD_PHASE_SUCCEEDED ->
          ProjectNotificationEvents.BUILD_PHASE_SUCCEEDED
    }

    internal fun unwrap(wrapped: ProjectNotificationEvents):
        software.amazon.awscdk.services.codebuild.ProjectNotificationEvents = wrapped.cdkObject
  }
}
