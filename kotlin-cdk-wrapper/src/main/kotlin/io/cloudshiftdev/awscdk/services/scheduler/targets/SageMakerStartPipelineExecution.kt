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
import kotlin.collections.List
import io.cloudshiftdev.awscdk.services.sagemaker.IPipeline as CloudshiftdevAwscdkServicesSagemakerIPipeline
import software.amazon.awscdk.services.sagemaker.IPipeline as AmazonAwscdkServicesSagemakerIPipeline

/**
 * Use a SageMaker pipeline as a target for AWS EventBridge Scheduler.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * IPipeline pipeline;
 * Schedule.Builder.create(this, "Schedule")
 * .schedule(ScheduleExpression.rate(Duration.minutes(60)))
 * .target(SageMakerStartPipelineExecution.Builder.create(pipeline)
 * .pipelineParameterList(List.of(SageMakerPipelineParameter.builder()
 * .name("parameter-name")
 * .value("parameter-value")
 * .build()))
 * .build())
 * .build();
 * ```
 */
public open class SageMakerStartPipelineExecution(
  cdkObject: software.amazon.awscdk.services.scheduler.targets.SageMakerStartPipelineExecution,
) : ScheduleTargetBase(cdkObject),
    IScheduleTarget {
  public constructor(pipeline: CloudshiftdevAwscdkServicesSagemakerIPipeline) :
      this(software.amazon.awscdk.services.scheduler.targets.SageMakerStartPipelineExecution(pipeline.let(CloudshiftdevAwscdkServicesSagemakerIPipeline.Companion::unwrap))
  )

  public constructor(pipeline: CloudshiftdevAwscdkServicesSagemakerIPipeline,
      props: SageMakerStartPipelineExecutionProps) :
      this(software.amazon.awscdk.services.scheduler.targets.SageMakerStartPipelineExecution(pipeline.let(CloudshiftdevAwscdkServicesSagemakerIPipeline.Companion::unwrap),
      props.let(SageMakerStartPipelineExecutionProps.Companion::unwrap))
  )

  public constructor(pipeline: CloudshiftdevAwscdkServicesSagemakerIPipeline,
      props: SageMakerStartPipelineExecutionProps.Builder.() -> Unit) : this(pipeline,
      SageMakerStartPipelineExecutionProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.scheduler.targets.SageMakerStartPipelineExecution].
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
     * List of parameter names and values to use when executing the SageMaker Model Building
     * Pipeline.
     *
     * The length must be between 0 and 200.
     *
     * Default: - no pipeline parameter list
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameters.html#cfn-scheduler-schedule-sagemakerpipelineparameters-pipelineparameterlist)
     * @param pipelineParameterList List of parameter names and values to use when executing the
     * SageMaker Model Building Pipeline. 
     */
    public fun pipelineParameterList(pipelineParameterList: List<SageMakerPipelineParameter>)

    /**
     * List of parameter names and values to use when executing the SageMaker Model Building
     * Pipeline.
     *
     * The length must be between 0 and 200.
     *
     * Default: - no pipeline parameter list
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameters.html#cfn-scheduler-schedule-sagemakerpipelineparameters-pipelineparameterlist)
     * @param pipelineParameterList List of parameter names and values to use when executing the
     * SageMaker Model Building Pipeline. 
     */
    public fun pipelineParameterList(vararg pipelineParameterList: SageMakerPipelineParameter)

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
    pipeline: AmazonAwscdkServicesSagemakerIPipeline,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.scheduler.targets.SageMakerStartPipelineExecution.Builder =
        software.amazon.awscdk.services.scheduler.targets.SageMakerStartPipelineExecution.Builder.create(pipeline)

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
     * List of parameter names and values to use when executing the SageMaker Model Building
     * Pipeline.
     *
     * The length must be between 0 and 200.
     *
     * Default: - no pipeline parameter list
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameters.html#cfn-scheduler-schedule-sagemakerpipelineparameters-pipelineparameterlist)
     * @param pipelineParameterList List of parameter names and values to use when executing the
     * SageMaker Model Building Pipeline. 
     */
    override fun pipelineParameterList(pipelineParameterList: List<SageMakerPipelineParameter>) {
      cdkBuilder.pipelineParameterList(pipelineParameterList.map(SageMakerPipelineParameter.Companion::unwrap))
    }

    /**
     * List of parameter names and values to use when executing the SageMaker Model Building
     * Pipeline.
     *
     * The length must be between 0 and 200.
     *
     * Default: - no pipeline parameter list
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-sagemakerpipelineparameters.html#cfn-scheduler-schedule-sagemakerpipelineparameters-pipelineparameterlist)
     * @param pipelineParameterList List of parameter names and values to use when executing the
     * SageMaker Model Building Pipeline. 
     */
    override fun pipelineParameterList(vararg pipelineParameterList: SageMakerPipelineParameter):
        Unit = pipelineParameterList(pipelineParameterList.toList())

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
        software.amazon.awscdk.services.scheduler.targets.SageMakerStartPipelineExecution =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(pipeline: CloudshiftdevAwscdkServicesSagemakerIPipeline,
        block: Builder.() -> Unit = {}): SageMakerStartPipelineExecution {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesSagemakerIPipeline.unwrap(pipeline))
      return SageMakerStartPipelineExecution(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.SageMakerStartPipelineExecution):
        SageMakerStartPipelineExecution = SageMakerStartPipelineExecution(cdkObject)

    internal fun unwrap(wrapped: SageMakerStartPipelineExecution):
        software.amazon.awscdk.services.scheduler.targets.SageMakerStartPipelineExecution =
        wrapped.cdkObject as
        software.amazon.awscdk.services.scheduler.targets.SageMakerStartPipelineExecution
  }
}
