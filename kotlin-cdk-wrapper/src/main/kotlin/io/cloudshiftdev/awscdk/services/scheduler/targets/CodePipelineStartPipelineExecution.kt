@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.scheduler.IScheduleTarget
import io.cloudshiftdev.awscdk.services.scheduler.ScheduleTargetInput
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.Unit
import io.cloudshiftdev.awscdk.services.codepipeline.IPipeline as CloudshiftdevAwscdkServicesCodepipelineIPipeline
import software.amazon.awscdk.services.codepipeline.IPipeline as AmazonAwscdkServicesCodepipelineIPipeline

/**
 * Use an AWS CodePipeline pipeline as a target for AWS EventBridge Scheduler.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * Pipeline pipeline;
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.minutes(60)))
 * .target(new CodePipelineStartPipelineExecution(pipeline))
 * .build();
 * ```
 */
public open class CodePipelineStartPipelineExecution(
  cdkObject: software.amazon.awscdk.services.scheduler.targets.CodePipelineStartPipelineExecution,
) : ScheduleTargetBase(cdkObject),
    IScheduleTarget {
  public constructor(pipeline: CloudshiftdevAwscdkServicesCodepipelineIPipeline) :
      this(software.amazon.awscdk.services.scheduler.targets.CodePipelineStartPipelineExecution(pipeline.let(CloudshiftdevAwscdkServicesCodepipelineIPipeline.Companion::unwrap))
  )

  public constructor(pipeline: CloudshiftdevAwscdkServicesCodepipelineIPipeline,
      props: ScheduleTargetBaseProps) :
      this(software.amazon.awscdk.services.scheduler.targets.CodePipelineStartPipelineExecution(pipeline.let(CloudshiftdevAwscdkServicesCodepipelineIPipeline.Companion::unwrap),
      props.let(ScheduleTargetBaseProps.Companion::unwrap))
  )

  public constructor(pipeline: CloudshiftdevAwscdkServicesCodepipelineIPipeline,
      props: ScheduleTargetBaseProps.Builder.() -> Unit) : this(pipeline,
      ScheduleTargetBaseProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.scheduler.targets.CodePipelineStartPipelineExecution].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. 
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue)

    /**
     * Input passed to the target.
     *
     * Default: - no input.
     *
     * @param input Input passed to the target. 
     */
    public fun input(input: ScheduleTargetInput)

    /**
     * The maximum age of a request that Scheduler sends to a target for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing. 
     */
    public fun maxEventAge(maxEventAge: Duration)

    /**
     * The maximum number of times to retry when the target returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the target returns an error. 
     */
    public fun retryAttempts(retryAttempts: Number)

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
     *
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf. 
     */
    public fun role(role: IRole)
  }

  private class BuilderImpl(
    pipeline: AmazonAwscdkServicesCodepipelineIPipeline,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.scheduler.targets.CodePipelineStartPipelineExecution.Builder
        =
        software.amazon.awscdk.services.scheduler.targets.CodePipelineStartPipelineExecution.Builder.create(pipeline)

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
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. 
     */
    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue.Companion::unwrap))
    }

    /**
     * Input passed to the target.
     *
     * Default: - no input.
     *
     * @param input Input passed to the target. 
     */
    override fun input(input: ScheduleTargetInput) {
      cdkBuilder.input(input.let(ScheduleTargetInput.Companion::unwrap))
    }

    /**
     * The maximum age of a request that Scheduler sends to a target for processing.
     *
     * Minimum value of 60.
     * Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Scheduler sends to a target for
     * processing. 
     */
    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration.Companion::unwrap))
    }

    /**
     * The maximum number of times to retry when the target returns an error.
     *
     * Minimum value of 0.
     * Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the target returns an error. 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

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
     *
     * @param role An execution role is an IAM role that EventBridge Scheduler assumes in order to
     * interact with other AWS services on your behalf. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.scheduler.targets.CodePipelineStartPipelineExecution =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(pipeline: CloudshiftdevAwscdkServicesCodepipelineIPipeline,
        block: Builder.() -> Unit = {}): CodePipelineStartPipelineExecution {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesCodepipelineIPipeline.unwrap(pipeline))
      return CodePipelineStartPipelineExecution(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.CodePipelineStartPipelineExecution):
        CodePipelineStartPipelineExecution = CodePipelineStartPipelineExecution(cdkObject)

    internal fun unwrap(wrapped: CodePipelineStartPipelineExecution):
        software.amazon.awscdk.services.scheduler.targets.CodePipelineStartPipelineExecution =
        wrapped.cdkObject as
        software.amazon.awscdk.services.scheduler.targets.CodePipelineStartPipelineExecution
  }
}
