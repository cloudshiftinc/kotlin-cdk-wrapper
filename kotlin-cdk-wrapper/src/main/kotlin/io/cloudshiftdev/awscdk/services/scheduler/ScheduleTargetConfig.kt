@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Config of a Schedule Target used during initialization of Schedule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * import io.cloudshiftdev.awscdk.services.scheduler.*;
 * Role role;
 * ScheduleTargetInput scheduleTargetInput;
 * Object tags;
 * ScheduleTargetConfig scheduleTargetConfig = ScheduleTargetConfig.builder()
 * .arn("arn")
 * .role(role)
 * // the properties below are optional
 * .deadLetterConfig(DeadLetterConfigProperty.builder()
 * .arn("arn")
 * .build())
 * .ecsParameters(EcsParametersProperty.builder()
 * .taskDefinitionArn("taskDefinitionArn")
 * // the properties below are optional
 * .capacityProviderStrategy(List.of(CapacityProviderStrategyItemProperty.builder()
 * .capacityProvider("capacityProvider")
 * // the properties below are optional
 * .base(123)
 * .weight(123)
 * .build()))
 * .enableEcsManagedTags(false)
 * .enableExecuteCommand(false)
 * .group("group")
 * .launchType("launchType")
 * .networkConfiguration(NetworkConfigurationProperty.builder()
 * .awsvpcConfiguration(AwsVpcConfigurationProperty.builder()
 * .subnets(List.of("subnets"))
 * // the properties below are optional
 * .assignPublicIp("assignPublicIp")
 * .securityGroups(List.of("securityGroups"))
 * .build())
 * .build())
 * .placementConstraints(List.of(PlacementConstraintProperty.builder()
 * .expression("expression")
 * .type("type")
 * .build()))
 * .placementStrategy(List.of(PlacementStrategyProperty.builder()
 * .field("field")
 * .type("type")
 * .build()))
 * .platformVersion("platformVersion")
 * .propagateTags("propagateTags")
 * .referenceId("referenceId")
 * .tags(tags)
 * .taskCount(123)
 * .build())
 * .eventBridgeParameters(EventBridgeParametersProperty.builder()
 * .detailType("detailType")
 * .source("source")
 * .build())
 * .input(scheduleTargetInput)
 * .kinesisParameters(KinesisParametersProperty.builder()
 * .partitionKey("partitionKey")
 * .build())
 * .retryPolicy(RetryPolicyProperty.builder()
 * .maximumEventAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .build())
 * .sageMakerPipelineParameters(SageMakerPipelineParametersProperty.builder()
 * .pipelineParameterList(List.of(SageMakerPipelineParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .build())
 * .sqsParameters(SqsParametersProperty.builder()
 * .messageGroupId("messageGroupId")
 * .build())
 * .build();
 * ```
 */
public interface ScheduleTargetConfig {
  /**
   * The Amazon Resource Name (ARN) of the target.
   */
  public fun arn(): String

  /**
   * An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses
   * as a dead-letter queue for your schedule.
   *
   * If specified, EventBridge Scheduler delivers failed events that could not be successfully
   * delivered to a target to the queue.
   *
   * Default: - No dead-letter queue
   */
  public fun deadLetterConfig(): CfnSchedule.DeadLetterConfigProperty? =
      unwrap(this).getDeadLetterConfig()?.let(CfnSchedule.DeadLetterConfigProperty::wrap)

  /**
   * The templated target type for the Amazon ECS RunTask API Operation.
   *
   * Default: - No parameters
   */
  public fun ecsParameters(): CfnSchedule.EcsParametersProperty? =
      unwrap(this).getEcsParameters()?.let(CfnSchedule.EcsParametersProperty::wrap)

  /**
   * The templated target type for the EventBridge PutEvents API operation.
   *
   * Default: - No parameters
   */
  public fun eventBridgeParameters(): CfnSchedule.EventBridgeParametersProperty? =
      unwrap(this).getEventBridgeParameters()?.let(CfnSchedule.EventBridgeParametersProperty::wrap)

  /**
   * What input to pass to the target.
   *
   * Default: - No input
   */
  public fun input(): ScheduleTargetInput? = unwrap(this).getInput()?.let(ScheduleTargetInput::wrap)

  /**
   * The templated target type for the Amazon Kinesis PutRecord API operation.
   *
   * Default: - No parameters
   */
  public fun kinesisParameters(): CfnSchedule.KinesisParametersProperty? =
      unwrap(this).getKinesisParameters()?.let(CfnSchedule.KinesisParametersProperty::wrap)

  /**
   * A `RetryPolicy` object that includes information about the retry policy settings, including the
   * maximum age of an event, and the maximum number of times EventBridge Scheduler will try to deliver
   * the event to a target.
   *
   * Default: - Maximum retry attempts of 185 and maximum age of 86400 seconds (1 day)
   */
  public fun retryPolicy(): CfnSchedule.RetryPolicyProperty? =
      unwrap(this).getRetryPolicy()?.let(CfnSchedule.RetryPolicyProperty::wrap)

  /**
   * Role to use to invoke this event target.
   */
  public fun role(): IRole

  /**
   * The templated target type for the Amazon SageMaker StartPipelineExecution API operation.
   *
   * Default: - No parameters
   */
  public fun sageMakerPipelineParameters(): CfnSchedule.SageMakerPipelineParametersProperty? =
      unwrap(this).getSageMakerPipelineParameters()?.let(CfnSchedule.SageMakerPipelineParametersProperty::wrap)

  /**
   * The templated target type for the Amazon SQS SendMessage API Operation.
   *
   * Default: - No parameters
   */
  public fun sqsParameters(): CfnSchedule.SqsParametersProperty? =
      unwrap(this).getSqsParameters()?.let(CfnSchedule.SqsParametersProperty::wrap)

  /**
   * A builder for [ScheduleTargetConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param arn The Amazon Resource Name (ARN) of the target. 
     */
    public fun arn(arn: String)

    /**
     * @param deadLetterConfig An object that contains information about an Amazon SQS queue that
     * EventBridge Scheduler uses as a dead-letter queue for your schedule.
     * If specified, EventBridge Scheduler delivers failed events that could not be successfully
     * delivered to a target to the queue.
     */
    public fun deadLetterConfig(deadLetterConfig: CfnSchedule.DeadLetterConfigProperty)

    /**
     * @param deadLetterConfig An object that contains information about an Amazon SQS queue that
     * EventBridge Scheduler uses as a dead-letter queue for your schedule.
     * If specified, EventBridge Scheduler delivers failed events that could not be successfully
     * delivered to a target to the queue.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d7e7a4d0b3d2e97afb189123f275135b2b83d2880945f1bdfba4b2e0bd1fbd1")
    public
        fun deadLetterConfig(deadLetterConfig: CfnSchedule.DeadLetterConfigProperty.Builder.() -> Unit)

    /**
     * @param ecsParameters The templated target type for the Amazon ECS RunTask API Operation.
     */
    public fun ecsParameters(ecsParameters: CfnSchedule.EcsParametersProperty)

    /**
     * @param ecsParameters The templated target type for the Amazon ECS RunTask API Operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f45dbac50218ee117083e6d6001874684c75d89bb42e003fcaf97f15e3011163")
    public fun ecsParameters(ecsParameters: CfnSchedule.EcsParametersProperty.Builder.() -> Unit)

    /**
     * @param eventBridgeParameters The templated target type for the EventBridge PutEvents API
     * operation.
     */
    public
        fun eventBridgeParameters(eventBridgeParameters: CfnSchedule.EventBridgeParametersProperty)

    /**
     * @param eventBridgeParameters The templated target type for the EventBridge PutEvents API
     * operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f72ba0b76a0bb8c16fbb642fbcc52e276d025c2e92894004ef79a1ad738d593")
    public
        fun eventBridgeParameters(eventBridgeParameters: CfnSchedule.EventBridgeParametersProperty.Builder.() -> Unit)

    /**
     * @param input What input to pass to the target.
     */
    public fun input(input: ScheduleTargetInput)

    /**
     * @param kinesisParameters The templated target type for the Amazon Kinesis PutRecord API
     * operation.
     */
    public fun kinesisParameters(kinesisParameters: CfnSchedule.KinesisParametersProperty)

    /**
     * @param kinesisParameters The templated target type for the Amazon Kinesis PutRecord API
     * operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("612101b5ba56b6604bbab84bdde9bf41004db9b77b689abae15c9b0f27201d5a")
    public
        fun kinesisParameters(kinesisParameters: CfnSchedule.KinesisParametersProperty.Builder.() -> Unit)

    /**
     * @param retryPolicy A `RetryPolicy` object that includes information about the retry policy
     * settings, including the maximum age of an event, and the maximum number of times EventBridge
     * Scheduler will try to deliver the event to a target.
     */
    public fun retryPolicy(retryPolicy: CfnSchedule.RetryPolicyProperty)

    /**
     * @param retryPolicy A `RetryPolicy` object that includes information about the retry policy
     * settings, including the maximum age of an event, and the maximum number of times EventBridge
     * Scheduler will try to deliver the event to a target.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f07f81e7c15510c0719f6580b73c8c5d84479389810c202ad9a4a79001e6e02")
    public fun retryPolicy(retryPolicy: CfnSchedule.RetryPolicyProperty.Builder.() -> Unit)

    /**
     * @param role Role to use to invoke this event target. 
     */
    public fun role(role: IRole)

    /**
     * @param sageMakerPipelineParameters The templated target type for the Amazon SageMaker
     * StartPipelineExecution API operation.
     */
    public
        fun sageMakerPipelineParameters(sageMakerPipelineParameters: CfnSchedule.SageMakerPipelineParametersProperty)

    /**
     * @param sageMakerPipelineParameters The templated target type for the Amazon SageMaker
     * StartPipelineExecution API operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63abd929a777a20795c4f3220c1e0a1a2d451e1ab29946f63f7d27732231ea42")
    public
        fun sageMakerPipelineParameters(sageMakerPipelineParameters: CfnSchedule.SageMakerPipelineParametersProperty.Builder.() -> Unit)

    /**
     * @param sqsParameters The templated target type for the Amazon SQS SendMessage API Operation.
     */
    public fun sqsParameters(sqsParameters: CfnSchedule.SqsParametersProperty)

    /**
     * @param sqsParameters The templated target type for the Amazon SQS SendMessage API Operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1e4953730b54bae26bc936400cfda06f0cfdaf3d3beb6050f6ffb81a5180b3")
    public fun sqsParameters(sqsParameters: CfnSchedule.SqsParametersProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.scheduler.ScheduleTargetConfig.Builder =
        software.amazon.awscdk.services.scheduler.ScheduleTargetConfig.builder()

    /**
     * @param arn The Amazon Resource Name (ARN) of the target. 
     */
    override fun arn(arn: String) {
      cdkBuilder.arn(arn)
    }

    /**
     * @param deadLetterConfig An object that contains information about an Amazon SQS queue that
     * EventBridge Scheduler uses as a dead-letter queue for your schedule.
     * If specified, EventBridge Scheduler delivers failed events that could not be successfully
     * delivered to a target to the queue.
     */
    override fun deadLetterConfig(deadLetterConfig: CfnSchedule.DeadLetterConfigProperty) {
      cdkBuilder.deadLetterConfig(deadLetterConfig.let(CfnSchedule.DeadLetterConfigProperty.Companion::unwrap))
    }

    /**
     * @param deadLetterConfig An object that contains information about an Amazon SQS queue that
     * EventBridge Scheduler uses as a dead-letter queue for your schedule.
     * If specified, EventBridge Scheduler delivers failed events that could not be successfully
     * delivered to a target to the queue.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1d7e7a4d0b3d2e97afb189123f275135b2b83d2880945f1bdfba4b2e0bd1fbd1")
    override
        fun deadLetterConfig(deadLetterConfig: CfnSchedule.DeadLetterConfigProperty.Builder.() -> Unit):
        Unit = deadLetterConfig(CfnSchedule.DeadLetterConfigProperty(deadLetterConfig))

    /**
     * @param ecsParameters The templated target type for the Amazon ECS RunTask API Operation.
     */
    override fun ecsParameters(ecsParameters: CfnSchedule.EcsParametersProperty) {
      cdkBuilder.ecsParameters(ecsParameters.let(CfnSchedule.EcsParametersProperty.Companion::unwrap))
    }

    /**
     * @param ecsParameters The templated target type for the Amazon ECS RunTask API Operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f45dbac50218ee117083e6d6001874684c75d89bb42e003fcaf97f15e3011163")
    override fun ecsParameters(ecsParameters: CfnSchedule.EcsParametersProperty.Builder.() -> Unit):
        Unit = ecsParameters(CfnSchedule.EcsParametersProperty(ecsParameters))

    /**
     * @param eventBridgeParameters The templated target type for the EventBridge PutEvents API
     * operation.
     */
    override
        fun eventBridgeParameters(eventBridgeParameters: CfnSchedule.EventBridgeParametersProperty) {
      cdkBuilder.eventBridgeParameters(eventBridgeParameters.let(CfnSchedule.EventBridgeParametersProperty.Companion::unwrap))
    }

    /**
     * @param eventBridgeParameters The templated target type for the EventBridge PutEvents API
     * operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f72ba0b76a0bb8c16fbb642fbcc52e276d025c2e92894004ef79a1ad738d593")
    override
        fun eventBridgeParameters(eventBridgeParameters: CfnSchedule.EventBridgeParametersProperty.Builder.() -> Unit):
        Unit =
        eventBridgeParameters(CfnSchedule.EventBridgeParametersProperty(eventBridgeParameters))

    /**
     * @param input What input to pass to the target.
     */
    override fun input(input: ScheduleTargetInput) {
      cdkBuilder.input(input.let(ScheduleTargetInput.Companion::unwrap))
    }

    /**
     * @param kinesisParameters The templated target type for the Amazon Kinesis PutRecord API
     * operation.
     */
    override fun kinesisParameters(kinesisParameters: CfnSchedule.KinesisParametersProperty) {
      cdkBuilder.kinesisParameters(kinesisParameters.let(CfnSchedule.KinesisParametersProperty.Companion::unwrap))
    }

    /**
     * @param kinesisParameters The templated target type for the Amazon Kinesis PutRecord API
     * operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("612101b5ba56b6604bbab84bdde9bf41004db9b77b689abae15c9b0f27201d5a")
    override
        fun kinesisParameters(kinesisParameters: CfnSchedule.KinesisParametersProperty.Builder.() -> Unit):
        Unit = kinesisParameters(CfnSchedule.KinesisParametersProperty(kinesisParameters))

    /**
     * @param retryPolicy A `RetryPolicy` object that includes information about the retry policy
     * settings, including the maximum age of an event, and the maximum number of times EventBridge
     * Scheduler will try to deliver the event to a target.
     */
    override fun retryPolicy(retryPolicy: CfnSchedule.RetryPolicyProperty) {
      cdkBuilder.retryPolicy(retryPolicy.let(CfnSchedule.RetryPolicyProperty.Companion::unwrap))
    }

    /**
     * @param retryPolicy A `RetryPolicy` object that includes information about the retry policy
     * settings, including the maximum age of an event, and the maximum number of times EventBridge
     * Scheduler will try to deliver the event to a target.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7f07f81e7c15510c0719f6580b73c8c5d84479389810c202ad9a4a79001e6e02")
    override fun retryPolicy(retryPolicy: CfnSchedule.RetryPolicyProperty.Builder.() -> Unit): Unit
        = retryPolicy(CfnSchedule.RetryPolicyProperty(retryPolicy))

    /**
     * @param role Role to use to invoke this event target. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param sageMakerPipelineParameters The templated target type for the Amazon SageMaker
     * StartPipelineExecution API operation.
     */
    override
        fun sageMakerPipelineParameters(sageMakerPipelineParameters: CfnSchedule.SageMakerPipelineParametersProperty) {
      cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters.let(CfnSchedule.SageMakerPipelineParametersProperty.Companion::unwrap))
    }

    /**
     * @param sageMakerPipelineParameters The templated target type for the Amazon SageMaker
     * StartPipelineExecution API operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63abd929a777a20795c4f3220c1e0a1a2d451e1ab29946f63f7d27732231ea42")
    override
        fun sageMakerPipelineParameters(sageMakerPipelineParameters: CfnSchedule.SageMakerPipelineParametersProperty.Builder.() -> Unit):
        Unit =
        sageMakerPipelineParameters(CfnSchedule.SageMakerPipelineParametersProperty(sageMakerPipelineParameters))

    /**
     * @param sqsParameters The templated target type for the Amazon SQS SendMessage API Operation.
     */
    override fun sqsParameters(sqsParameters: CfnSchedule.SqsParametersProperty) {
      cdkBuilder.sqsParameters(sqsParameters.let(CfnSchedule.SqsParametersProperty.Companion::unwrap))
    }

    /**
     * @param sqsParameters The templated target type for the Amazon SQS SendMessage API Operation.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9c1e4953730b54bae26bc936400cfda06f0cfdaf3d3beb6050f6ffb81a5180b3")
    override fun sqsParameters(sqsParameters: CfnSchedule.SqsParametersProperty.Builder.() -> Unit):
        Unit = sqsParameters(CfnSchedule.SqsParametersProperty(sqsParameters))

    public fun build(): software.amazon.awscdk.services.scheduler.ScheduleTargetConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.ScheduleTargetConfig,
  ) : CdkObject(cdkObject),
      ScheduleTargetConfig {
    /**
     * The Amazon Resource Name (ARN) of the target.
     */
    override fun arn(): String = unwrap(this).getArn()

    /**
     * An object that contains information about an Amazon SQS queue that EventBridge Scheduler uses
     * as a dead-letter queue for your schedule.
     *
     * If specified, EventBridge Scheduler delivers failed events that could not be successfully
     * delivered to a target to the queue.
     *
     * Default: - No dead-letter queue
     */
    override fun deadLetterConfig(): CfnSchedule.DeadLetterConfigProperty? =
        unwrap(this).getDeadLetterConfig()?.let(CfnSchedule.DeadLetterConfigProperty::wrap)

    /**
     * The templated target type for the Amazon ECS RunTask API Operation.
     *
     * Default: - No parameters
     */
    override fun ecsParameters(): CfnSchedule.EcsParametersProperty? =
        unwrap(this).getEcsParameters()?.let(CfnSchedule.EcsParametersProperty::wrap)

    /**
     * The templated target type for the EventBridge PutEvents API operation.
     *
     * Default: - No parameters
     */
    override fun eventBridgeParameters(): CfnSchedule.EventBridgeParametersProperty? =
        unwrap(this).getEventBridgeParameters()?.let(CfnSchedule.EventBridgeParametersProperty::wrap)

    /**
     * What input to pass to the target.
     *
     * Default: - No input
     */
    override fun input(): ScheduleTargetInput? =
        unwrap(this).getInput()?.let(ScheduleTargetInput::wrap)

    /**
     * The templated target type for the Amazon Kinesis PutRecord API operation.
     *
     * Default: - No parameters
     */
    override fun kinesisParameters(): CfnSchedule.KinesisParametersProperty? =
        unwrap(this).getKinesisParameters()?.let(CfnSchedule.KinesisParametersProperty::wrap)

    /**
     * A `RetryPolicy` object that includes information about the retry policy settings, including
     * the maximum age of an event, and the maximum number of times EventBridge Scheduler will try to
     * deliver the event to a target.
     *
     * Default: - Maximum retry attempts of 185 and maximum age of 86400 seconds (1 day)
     */
    override fun retryPolicy(): CfnSchedule.RetryPolicyProperty? =
        unwrap(this).getRetryPolicy()?.let(CfnSchedule.RetryPolicyProperty::wrap)

    /**
     * Role to use to invoke this event target.
     */
    override fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

    /**
     * The templated target type for the Amazon SageMaker StartPipelineExecution API operation.
     *
     * Default: - No parameters
     */
    override fun sageMakerPipelineParameters(): CfnSchedule.SageMakerPipelineParametersProperty? =
        unwrap(this).getSageMakerPipelineParameters()?.let(CfnSchedule.SageMakerPipelineParametersProperty::wrap)

    /**
     * The templated target type for the Amazon SQS SendMessage API Operation.
     *
     * Default: - No parameters
     */
    override fun sqsParameters(): CfnSchedule.SqsParametersProperty? =
        unwrap(this).getSqsParameters()?.let(CfnSchedule.SqsParametersProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleTargetConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.ScheduleTargetConfig):
        ScheduleTargetConfig = CdkObjectWrappers.wrap(cdkObject) as? ScheduleTargetConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduleTargetConfig):
        software.amazon.awscdk.services.scheduler.ScheduleTargetConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.scheduler.ScheduleTargetConfig
  }
}
