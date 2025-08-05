@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.scheduler.ScheduleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.Unit

/**
 * Base properties for a Schedule Target.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * Topic topic = new Topic(this, "Topic");
 * Map&lt;String, String&gt; payload = Map.of(
 * "message", "Hello scheduler!");
 * SnsPublish target = SnsPublish.Builder.create(topic)
 * .input(ScheduleTargetInput.fromObject(payload))
 * .build();
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.hours(1)))
 * .target(target)
 * .build();
 * ```
 */
public interface ScheduleTargetBaseProps {
  /**
   * The SQS queue to be used as deadLetterQueue.
   *
   * The events not successfully delivered are automatically retried for a specified period of time,
   * depending on the retry policy of the target.
   * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
   * dead letter queue.
   *
   * Default: - no dead-letter queue
   */
  public fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

  /**
   * Input passed to the target.
   *
   * Default: - no input.
   */
  public fun input(): ScheduleTargetInput? = unwrap(this).getInput()?.let(ScheduleTargetInput::wrap)

  /**
   * The maximum age of a request that Scheduler sends to a target for processing.
   *
   * Minimum value of 60.
   * Maximum value of 86400.
   *
   * Default: Duration.hours(24)
   */
  public fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

  /**
   * The maximum number of times to retry when the target returns an error.
   *
   * Minimum value of 0.
   * Maximum value of 185.
   *
   * Default: 185
   */
  public fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  /**
   * An execution role is an IAM role that EventBridge Scheduler assumes in order to interact with
   * other AWS services on your behalf.
   *
   * If none provided templates target will automatically create an IAM role with all the minimum
   * necessary
   * permissions to interact with the templated target. If you wish you may specify your own IAM
   * role, then the templated targets
   * will grant minimal required permissions.
   *
   * Default: - created by target
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * A builder for [ScheduleTargetBaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue.
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * @param input Input passed to the target.
     */
    public fun input(input: ScheduleTargetInput)

    /**
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * @param retryAttempts The maximum number of times to retry when the target returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf.
     * If none provided templates target will automatically create an IAM role with all the minimum
     * necessary
     * permissions to interact with the templated target. If you wish you may specify your own IAM
     * role, then the templated targets
     * will grant minimal required permissions.
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBaseProps.Builder =
        software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBaseProps.builder()

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue.
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * @param input Input passed to the target.
     */
    override fun input(input: ScheduleTargetInput) {
      cdkBuilder.input(input.let(ScheduleTargetInput.Companion::unwrap))
    }

    /**
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing.
     * Minimum value of 60.
     * Maximum value of 86400.
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the target returns an error.
     * Minimum value of 0.
     * Maximum value of 185.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf.
     * If none provided templates target will automatically create an IAM role with all the minimum
     * necessary
     * permissions to interact with the templated target. If you wish you may specify your own IAM
     * role, then the templated targets
     * will grant minimal required permissions.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBaseProps,
  ) : CdkObject(cdkObject),
      ScheduleTargetBaseProps {
    /**
     * The SQS queue to be used as deadLetterQueue.
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time,
     * depending on the retry policy of the target.
     * If an event is not delivered before all retry attempts are exhausted, it will be sent to the
     * dead letter queue.
     *
     * Default: - no dead-letter queue
     */
    override fun deadLetterQueue(): IQueue? = unwrap(this).getDeadLetterQueue()?.let(IQueue::wrap)

    /**
     * Input passed to the target.
     *
     * Default: - no input.
     */
    override fun input(): ScheduleTargetInput? =
        unwrap(this).getInput()?.let(ScheduleTargetInput::wrap)

    /**
     * The maximum age of a request that Scheduler sends to a target for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     */
    override fun maxEventAge(): Duration? = unwrap(this).getMaxEventAge()?.let(Duration::wrap)

    /**
     * The maximum number of times to retry when the target returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    /**
     * An execution role is an IAM role that EventBridge Scheduler assumes in order to interact with
     * other AWS services on your behalf.
     *
     * If none provided templates target will automatically create an IAM role with all the minimum
     * necessary
     * permissions to interact with the templated target. If you wish you may specify your own IAM
     * role, then the templated targets
     * will grant minimal required permissions.
     *
     * Default: - created by target
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleTargetBaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBaseProps):
        ScheduleTargetBaseProps = CdkObjectWrappers.wrap(cdkObject) as? ScheduleTargetBaseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduleTargetBaseProps):
        software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBaseProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBaseProps
  }
}
