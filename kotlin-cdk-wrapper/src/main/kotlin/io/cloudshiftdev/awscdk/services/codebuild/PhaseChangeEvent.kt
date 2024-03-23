@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Event fields for the CodeBuild "phase change" event.
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html#sample-build-notifications-ref)
 */
public open class PhaseChangeEvent(
  cdkObject: software.amazon.awscdk.services.codebuild.PhaseChangeEvent,
) : CdkObject(cdkObject) {
  public companion object {
    public fun buildComplete(): String =
        software.amazon.awscdk.services.codebuild.PhaseChangeEvent.getBuildComplete()

    public fun buildId(): String =
        software.amazon.awscdk.services.codebuild.PhaseChangeEvent.getBuildId()

    public fun completedPhase(): String =
        software.amazon.awscdk.services.codebuild.PhaseChangeEvent.getCompletedPhase()

    public fun completedPhaseDurationSeconds(): String =
        software.amazon.awscdk.services.codebuild.PhaseChangeEvent.getCompletedPhaseDurationSeconds()

    public fun completedPhaseStatus(): String =
        software.amazon.awscdk.services.codebuild.PhaseChangeEvent.getCompletedPhaseStatus()

    public fun projectName(): String =
        software.amazon.awscdk.services.codebuild.PhaseChangeEvent.getProjectName()

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.PhaseChangeEvent):
        PhaseChangeEvent = PhaseChangeEvent(cdkObject)

    internal fun unwrap(wrapped: PhaseChangeEvent):
        software.amazon.awscdk.services.codebuild.PhaseChangeEvent = wrapped.cdkObject as
        software.amazon.awscdk.services.codebuild.PhaseChangeEvent
  }
}
