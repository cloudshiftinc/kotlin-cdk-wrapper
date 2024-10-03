@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Specifies an action that AWS Batch will take after the job has remained at the head of the queue
 * in the specified state for longer than the specified time.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.batch.*;
 * JobStateTimeLimitAction jobStateTimeLimitAction = JobStateTimeLimitAction.builder()
 * .maxTime(Duration.minutes(30))
 * .reason(JobStateTimeLimitActionsReason.INSUFFICIENT_INSTANCE_CAPACITY)
 * // the properties below are optional
 * .action(JobStateTimeLimitActionsAction.CANCEL)
 * .state(JobStateTimeLimitActionsState.RUNNABLE)
 * .build();
 * ```
 */
public interface JobStateTimeLimitAction {
  /**
   * The action to take when a job is at the head of the job queue in the specified state for the
   * specified period of time.
   *
   * Default: JobStateTimeLimitActionsAction.CANCEL
   */
  public fun action(): JobStateTimeLimitActionsAction? =
      unwrap(this).getAction()?.let(JobStateTimeLimitActionsAction::wrap)

  /**
   * The approximate amount of time, that must pass with the job in the specified state before the
   * action is taken.
   *
   * The minimum value is 10 minutes and the maximum value is 24 hours.
   */
  public fun maxTime(): Duration

  /**
   * The reason to log for the action being taken.
   *
   * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#job_stuck_in_runnable)
   */
  public fun reason(): JobStateTimeLimitActionsReason

  /**
   * The state of the job needed to trigger the action.
   *
   * Default: JobStateTimeLimitActionsState.RUNNABLE
   */
  public fun state(): JobStateTimeLimitActionsState? =
      unwrap(this).getState()?.let(JobStateTimeLimitActionsState::wrap)

  /**
   * A builder for [JobStateTimeLimitAction]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param action The action to take when a job is at the head of the job queue in the specified
     * state for the specified period of time.
     */
    public fun action(action: JobStateTimeLimitActionsAction)

    /**
     * @param maxTime The approximate amount of time, that must pass with the job in the specified
     * state before the action is taken. 
     * The minimum value is 10 minutes and the maximum value is 24 hours.
     */
    public fun maxTime(maxTime: Duration)

    /**
     * @param reason The reason to log for the action being taken. 
     */
    public fun reason(reason: JobStateTimeLimitActionsReason)

    /**
     * @param state The state of the job needed to trigger the action.
     */
    public fun state(state: JobStateTimeLimitActionsState)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.JobStateTimeLimitAction.Builder =
        software.amazon.awscdk.services.batch.JobStateTimeLimitAction.builder()

    /**
     * @param action The action to take when a job is at the head of the job queue in the specified
     * state for the specified period of time.
     */
    override fun action(action: JobStateTimeLimitActionsAction) {
      cdkBuilder.action(action.let(JobStateTimeLimitActionsAction.Companion::unwrap))
    }

    /**
     * @param maxTime The approximate amount of time, that must pass with the job in the specified
     * state before the action is taken. 
     * The minimum value is 10 minutes and the maximum value is 24 hours.
     */
    override fun maxTime(maxTime: Duration) {
      cdkBuilder.maxTime(maxTime.let(Duration.Companion::unwrap))
    }

    /**
     * @param reason The reason to log for the action being taken. 
     */
    override fun reason(reason: JobStateTimeLimitActionsReason) {
      cdkBuilder.reason(reason.let(JobStateTimeLimitActionsReason.Companion::unwrap))
    }

    /**
     * @param state The state of the job needed to trigger the action.
     */
    override fun state(state: JobStateTimeLimitActionsState) {
      cdkBuilder.state(state.let(JobStateTimeLimitActionsState.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.batch.JobStateTimeLimitAction =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.JobStateTimeLimitAction,
  ) : CdkObject(cdkObject),
      JobStateTimeLimitAction {
    /**
     * The action to take when a job is at the head of the job queue in the specified state for the
     * specified period of time.
     *
     * Default: JobStateTimeLimitActionsAction.CANCEL
     */
    override fun action(): JobStateTimeLimitActionsAction? =
        unwrap(this).getAction()?.let(JobStateTimeLimitActionsAction::wrap)

    /**
     * The approximate amount of time, that must pass with the job in the specified state before the
     * action is taken.
     *
     * The minimum value is 10 minutes and the maximum value is 24 hours.
     */
    override fun maxTime(): Duration = unwrap(this).getMaxTime().let(Duration::wrap)

    /**
     * The reason to log for the action being taken.
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/troubleshooting.html#job_stuck_in_runnable)
     */
    override fun reason(): JobStateTimeLimitActionsReason =
        unwrap(this).getReason().let(JobStateTimeLimitActionsReason::wrap)

    /**
     * The state of the job needed to trigger the action.
     *
     * Default: JobStateTimeLimitActionsState.RUNNABLE
     */
    override fun state(): JobStateTimeLimitActionsState? =
        unwrap(this).getState()?.let(JobStateTimeLimitActionsState::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JobStateTimeLimitAction {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.JobStateTimeLimitAction):
        JobStateTimeLimitAction = CdkObjectWrappers.wrap(cdkObject) as? JobStateTimeLimitAction ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: JobStateTimeLimitAction):
        software.amazon.awscdk.services.batch.JobStateTimeLimitAction = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.JobStateTimeLimitAction
  }
}
