package io.cloudshiftdev.awscdk.services.codepipeline

public enum class PipelineNotificationEvents(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents,
) {
  PIPELINE_EXECUTION_FAILED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_FAILED),
  PIPELINE_EXECUTION_CANCELED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_CANCELED),
  PIPELINE_EXECUTION_STARTED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_STARTED),
  PIPELINE_EXECUTION_RESUMED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_RESUMED),
  PIPELINE_EXECUTION_SUCCEEDED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_SUCCEEDED),
  PIPELINE_EXECUTION_SUPERSEDED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_SUPERSEDED),
  STAGE_EXECUTION_STARTED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_STARTED),
  STAGE_EXECUTION_SUCCEEDED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_SUCCEEDED),
  STAGE_EXECUTION_RESUMED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_RESUMED),
  STAGE_EXECUTION_CANCELED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_CANCELED),
  STAGE_EXECUTION_FAILED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_FAILED),
  ACTION_EXECUTION_SUCCEEDED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.ACTION_EXECUTION_SUCCEEDED),
  ACTION_EXECUTION_FAILED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.ACTION_EXECUTION_FAILED),
  ACTION_EXECUTION_CANCELED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.ACTION_EXECUTION_CANCELED),
  ACTION_EXECUTION_STARTED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.ACTION_EXECUTION_STARTED),
  MANUAL_APPROVAL_FAILED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.MANUAL_APPROVAL_FAILED),
  MANUAL_APPROVAL_NEEDED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.MANUAL_APPROVAL_NEEDED),
  MANUAL_APPROVAL_SUCCEEDED(software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.MANUAL_APPROVAL_SUCCEEDED),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents):
        PipelineNotificationEvents = when (cdkObject) {
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_FAILED ->
          PipelineNotificationEvents.PIPELINE_EXECUTION_FAILED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_CANCELED ->
          PipelineNotificationEvents.PIPELINE_EXECUTION_CANCELED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_STARTED ->
          PipelineNotificationEvents.PIPELINE_EXECUTION_STARTED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_RESUMED ->
          PipelineNotificationEvents.PIPELINE_EXECUTION_RESUMED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_SUCCEEDED ->
          PipelineNotificationEvents.PIPELINE_EXECUTION_SUCCEEDED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.PIPELINE_EXECUTION_SUPERSEDED ->
          PipelineNotificationEvents.PIPELINE_EXECUTION_SUPERSEDED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_STARTED ->
          PipelineNotificationEvents.STAGE_EXECUTION_STARTED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_SUCCEEDED ->
          PipelineNotificationEvents.STAGE_EXECUTION_SUCCEEDED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_RESUMED ->
          PipelineNotificationEvents.STAGE_EXECUTION_RESUMED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_CANCELED ->
          PipelineNotificationEvents.STAGE_EXECUTION_CANCELED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.STAGE_EXECUTION_FAILED ->
          PipelineNotificationEvents.STAGE_EXECUTION_FAILED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.ACTION_EXECUTION_SUCCEEDED ->
          PipelineNotificationEvents.ACTION_EXECUTION_SUCCEEDED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.ACTION_EXECUTION_FAILED ->
          PipelineNotificationEvents.ACTION_EXECUTION_FAILED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.ACTION_EXECUTION_CANCELED ->
          PipelineNotificationEvents.ACTION_EXECUTION_CANCELED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.ACTION_EXECUTION_STARTED ->
          PipelineNotificationEvents.ACTION_EXECUTION_STARTED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.MANUAL_APPROVAL_FAILED ->
          PipelineNotificationEvents.MANUAL_APPROVAL_FAILED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.MANUAL_APPROVAL_NEEDED ->
          PipelineNotificationEvents.MANUAL_APPROVAL_NEEDED
      software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents.MANUAL_APPROVAL_SUCCEEDED ->
          PipelineNotificationEvents.MANUAL_APPROVAL_SUCCEEDED
    }

    internal fun unwrap(wrapped: PipelineNotificationEvents):
        software.amazon.awscdk.services.codepipeline.PipelineNotificationEvents = wrapped.cdkObject
  }
}
