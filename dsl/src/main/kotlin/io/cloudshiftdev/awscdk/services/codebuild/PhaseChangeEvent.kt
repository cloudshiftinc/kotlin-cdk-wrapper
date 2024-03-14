package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class PhaseChangeEvent internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codebuild.PhaseChangeEvent,
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
        software.amazon.awscdk.services.codebuild.PhaseChangeEvent = wrapped.cdkObject
  }
}
