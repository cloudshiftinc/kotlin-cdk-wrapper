@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Event fields for the CodeBuild "state change" event.
 *
 * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/sample-build-notifications.html#sample-build-notifications-ref)
 */
public open class StateChangeEvent(
  cdkObject: software.amazon.awscdk.services.codebuild.StateChangeEvent,
) : CdkObject(cdkObject) {
  public companion object {
    public fun buildId(): String =
        software.amazon.awscdk.services.codebuild.StateChangeEvent.getBuildId()

    public fun buildStatus(): String =
        software.amazon.awscdk.services.codebuild.StateChangeEvent.getBuildStatus()

    public fun currentPhase(): String =
        software.amazon.awscdk.services.codebuild.StateChangeEvent.getCurrentPhase()

    public fun projectName(): String =
        software.amazon.awscdk.services.codebuild.StateChangeEvent.getProjectName()

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codebuild.StateChangeEvent):
        StateChangeEvent = StateChangeEvent(cdkObject)

    internal fun unwrap(wrapped: StateChangeEvent):
        software.amazon.awscdk.services.codebuild.StateChangeEvent = wrapped.cdkObject as
        software.amazon.awscdk.services.codebuild.StateChangeEvent
  }
}
