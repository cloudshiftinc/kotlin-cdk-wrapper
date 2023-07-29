@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.scheduler.CfnSchedule

/**
 * The schedule's target.
 *
 * EventBridge Scheduler supports templated target that invoke common API operations, as well as
 * universal targets that you can customize to invoke over 6,000 API operations across more than 270
 * services. You can only specify one templated or universal target for a schedule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.scheduler.*;
 * Object tags;
 * TargetProperty targetProperty = TargetProperty.builder()
 * .arn("arn")
 * .roleArn("roleArn")
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
 * .input("input")
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
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-scheduler-schedule-target.html)
 */
@CdkDslMarker
public class CfnScheduleTargetPropertyDsl {
    private val cdkBuilder: CfnSchedule.TargetProperty.Builder =
        CfnSchedule.TargetProperty.builder()

    /** @param arn The Amazon Resource Name (ARN) of the target. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /**
     * @param deadLetterConfig An object that contains information about an Amazon SQS queue that
     *   EventBridge Scheduler uses as a dead-letter queue for your schedule. If specified,
     *   EventBridge Scheduler delivers failed events that could not be successfully delivered to a
     *   target to the queue.
     */
    public fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    /**
     * @param deadLetterConfig An object that contains information about an Amazon SQS queue that
     *   EventBridge Scheduler uses as a dead-letter queue for your schedule. If specified,
     *   EventBridge Scheduler delivers failed events that could not be successfully delivered to a
     *   target to the queue.
     */
    public fun deadLetterConfig(deadLetterConfig: CfnSchedule.DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    /**
     * @param ecsParameters The templated target type for the Amazon ECS
     *   [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API
     *   operation.
     */
    public fun ecsParameters(ecsParameters: IResolvable) {
        cdkBuilder.ecsParameters(ecsParameters)
    }

    /**
     * @param ecsParameters The templated target type for the Amazon ECS
     *   [`RunTask`](https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html) API
     *   operation.
     */
    public fun ecsParameters(ecsParameters: CfnSchedule.EcsParametersProperty) {
        cdkBuilder.ecsParameters(ecsParameters)
    }

    /**
     * @param eventBridgeParameters The templated target type for the EventBridge
     *   [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
     *   API operation.
     */
    public fun eventBridgeParameters(eventBridgeParameters: IResolvable) {
        cdkBuilder.eventBridgeParameters(eventBridgeParameters)
    }

    /**
     * @param eventBridgeParameters The templated target type for the EventBridge
     *   [`PutEvents`](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutEvents.html)
     *   API operation.
     */
    public fun eventBridgeParameters(
        eventBridgeParameters: CfnSchedule.EventBridgeParametersProperty
    ) {
        cdkBuilder.eventBridgeParameters(eventBridgeParameters)
    }

    /**
     * @param input The text, or well-formed JSON, passed to the target. If you are configuring a
     *   templated Lambda , AWS Step Functions , or Amazon EventBridge target, the input must be a
     *   well-formed JSON. For all other target types, a JSON is not required. If you do not specify
     *   anything for this field, Amazon EventBridge Scheduler delivers a default notification to
     *   the target.
     */
    public fun input(input: String) {
        cdkBuilder.input(input)
    }

    /**
     * @param kinesisParameters The templated target type for the Amazon Kinesis
     *   [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html)
     *   API operation.
     */
    public fun kinesisParameters(kinesisParameters: IResolvable) {
        cdkBuilder.kinesisParameters(kinesisParameters)
    }

    /**
     * @param kinesisParameters The templated target type for the Amazon Kinesis
     *   [`PutRecord`](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_PutRecord.html)
     *   API operation.
     */
    public fun kinesisParameters(kinesisParameters: CfnSchedule.KinesisParametersProperty) {
        cdkBuilder.kinesisParameters(kinesisParameters)
    }

    /**
     * @param retryPolicy A `RetryPolicy` object that includes information about the retry policy
     *   settings, including the maximum age of an event, and the maximum number of times
     *   EventBridge Scheduler will try to deliver the event to a target.
     */
    public fun retryPolicy(retryPolicy: IResolvable) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    /**
     * @param retryPolicy A `RetryPolicy` object that includes information about the retry policy
     *   settings, including the maximum age of an event, and the maximum number of times
     *   EventBridge Scheduler will try to deliver the event to a target.
     */
    public fun retryPolicy(retryPolicy: CfnSchedule.RetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role that EventBridge Scheduler will
     *   use for this target when the schedule is invoked.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param sageMakerPipelineParameters The templated target type for the Amazon SageMaker
     *   [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html)
     *   API operation.
     */
    public fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters)
    }

    /**
     * @param sageMakerPipelineParameters The templated target type for the Amazon SageMaker
     *   [`StartPipelineExecution`](https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_StartPipelineExecution.html)
     *   API operation.
     */
    public fun sageMakerPipelineParameters(
        sageMakerPipelineParameters: CfnSchedule.SageMakerPipelineParametersProperty
    ) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters)
    }

    /**
     * @param sqsParameters The templated target type for the Amazon SQS
     *   [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html)
     *   API operation. Contains the message group ID to use when the target is a FIFO queue. If you
     *   specify an Amazon SQS FIFO queue as a target, the queue must have content-based
     *   deduplication enabled. For more information, see
     *   [Using the Amazon SQS message deduplication ID](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html)
     *   in the *Amazon SQS Developer Guide* .
     */
    public fun sqsParameters(sqsParameters: IResolvable) {
        cdkBuilder.sqsParameters(sqsParameters)
    }

    /**
     * @param sqsParameters The templated target type for the Amazon SQS
     *   [`SendMessage`](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/APIReference/API_SendMessage.html)
     *   API operation. Contains the message group ID to use when the target is a FIFO queue. If you
     *   specify an Amazon SQS FIFO queue as a target, the queue must have content-based
     *   deduplication enabled. For more information, see
     *   [Using the Amazon SQS message deduplication ID](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/using-messagededuplicationid-property.html)
     *   in the *Amazon SQS Developer Guide* .
     */
    public fun sqsParameters(sqsParameters: CfnSchedule.SqsParametersProperty) {
        cdkBuilder.sqsParameters(sqsParameters)
    }

    public fun build(): CfnSchedule.TargetProperty = cdkBuilder.build()
}
