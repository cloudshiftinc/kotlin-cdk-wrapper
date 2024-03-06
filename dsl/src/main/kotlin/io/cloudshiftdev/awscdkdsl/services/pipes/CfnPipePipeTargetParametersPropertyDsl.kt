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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * The parameters required to set up a target for your pipe.
 *
 * For more information about pipe target parameters, including how to use dynamic path parameters,
 * see
 * [Target parameters](https://docs.aws.amazon.com/eventbridge/latest/userguide/eb-pipes-event-target.html)
 * in the *Amazon EventBridge User Guide* .
 *
 * Example:
 * ```
 * Queue sourceQueue;
 * Queue targetQueue;
 * SqsSource pipeSource = SqsSource.Builder.create(sourceQueue)
 * .batchSize(10)
 * .maximumBatchingWindow(Duration.seconds(10))
 * .build();
 * Pipe pipe = Pipe.Builder.create(this, "Pipe")
 * .source(pipeSource)
 * .target(new SomeTarget(targetQueue))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-pipetargetparameters.html)
 */
@CdkDslMarker
public class CfnPipePipeTargetParametersPropertyDsl {
    private val cdkBuilder: CfnPipe.PipeTargetParametersProperty.Builder =
        CfnPipe.PipeTargetParametersProperty.builder()

    /** @param batchJobParameters The parameters for using an AWS Batch job as a target. */
    public fun batchJobParameters(batchJobParameters: IResolvable) {
        cdkBuilder.batchJobParameters(batchJobParameters)
    }

    /** @param batchJobParameters The parameters for using an AWS Batch job as a target. */
    public fun batchJobParameters(
        batchJobParameters: CfnPipe.PipeTargetBatchJobParametersProperty
    ) {
        cdkBuilder.batchJobParameters(batchJobParameters)
    }

    /**
     * @param cloudWatchLogsParameters The parameters for using an CloudWatch Logs log stream as a
     *   target.
     */
    public fun cloudWatchLogsParameters(cloudWatchLogsParameters: IResolvable) {
        cdkBuilder.cloudWatchLogsParameters(cloudWatchLogsParameters)
    }

    /**
     * @param cloudWatchLogsParameters The parameters for using an CloudWatch Logs log stream as a
     *   target.
     */
    public fun cloudWatchLogsParameters(
        cloudWatchLogsParameters: CfnPipe.PipeTargetCloudWatchLogsParametersProperty
    ) {
        cdkBuilder.cloudWatchLogsParameters(cloudWatchLogsParameters)
    }

    /** @param ecsTaskParameters The parameters for using an Amazon ECS task as a target. */
    public fun ecsTaskParameters(ecsTaskParameters: IResolvable) {
        cdkBuilder.ecsTaskParameters(ecsTaskParameters)
    }

    /** @param ecsTaskParameters The parameters for using an Amazon ECS task as a target. */
    public fun ecsTaskParameters(ecsTaskParameters: CfnPipe.PipeTargetEcsTaskParametersProperty) {
        cdkBuilder.ecsTaskParameters(ecsTaskParameters)
    }

    /**
     * @param eventBridgeEventBusParameters The parameters for using an EventBridge event bus as a
     *   target.
     */
    public fun eventBridgeEventBusParameters(eventBridgeEventBusParameters: IResolvable) {
        cdkBuilder.eventBridgeEventBusParameters(eventBridgeEventBusParameters)
    }

    /**
     * @param eventBridgeEventBusParameters The parameters for using an EventBridge event bus as a
     *   target.
     */
    public fun eventBridgeEventBusParameters(
        eventBridgeEventBusParameters: CfnPipe.PipeTargetEventBridgeEventBusParametersProperty
    ) {
        cdkBuilder.eventBridgeEventBusParameters(eventBridgeEventBusParameters)
    }

    /**
     * @param httpParameters These are custom parameter to be used when the target is an API Gateway
     *   REST APIs or EventBridge ApiDestinations.
     */
    public fun httpParameters(httpParameters: IResolvable) {
        cdkBuilder.httpParameters(httpParameters)
    }

    /**
     * @param httpParameters These are custom parameter to be used when the target is an API Gateway
     *   REST APIs or EventBridge ApiDestinations.
     */
    public fun httpParameters(httpParameters: CfnPipe.PipeTargetHttpParametersProperty) {
        cdkBuilder.httpParameters(httpParameters)
    }

    /**
     * @param inputTemplate Valid JSON text passed to the target. In this case, nothing from the
     *   event itself is passed to the target. For more information, see
     *   [The JavaScript Object Notation (JSON) Data Interchange Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt)
     *   .
     *
     * To remove an input template, specify an empty string.
     */
    public fun inputTemplate(inputTemplate: String) {
        cdkBuilder.inputTemplate(inputTemplate)
    }

    /** @param kinesisStreamParameters The parameters for using a Kinesis stream as a target. */
    public fun kinesisStreamParameters(kinesisStreamParameters: IResolvable) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters)
    }

    /** @param kinesisStreamParameters The parameters for using a Kinesis stream as a target. */
    public fun kinesisStreamParameters(
        kinesisStreamParameters: CfnPipe.PipeTargetKinesisStreamParametersProperty
    ) {
        cdkBuilder.kinesisStreamParameters(kinesisStreamParameters)
    }

    /** @param lambdaFunctionParameters The parameters for using a Lambda function as a target. */
    public fun lambdaFunctionParameters(lambdaFunctionParameters: IResolvable) {
        cdkBuilder.lambdaFunctionParameters(lambdaFunctionParameters)
    }

    /** @param lambdaFunctionParameters The parameters for using a Lambda function as a target. */
    public fun lambdaFunctionParameters(
        lambdaFunctionParameters: CfnPipe.PipeTargetLambdaFunctionParametersProperty
    ) {
        cdkBuilder.lambdaFunctionParameters(lambdaFunctionParameters)
    }

    /**
     * @param redshiftDataParameters These are custom parameters to be used when the target is a
     *   Amazon Redshift cluster to invoke the Amazon Redshift Data API BatchExecuteStatement.
     */
    public fun redshiftDataParameters(redshiftDataParameters: IResolvable) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters)
    }

    /**
     * @param redshiftDataParameters These are custom parameters to be used when the target is a
     *   Amazon Redshift cluster to invoke the Amazon Redshift Data API BatchExecuteStatement.
     */
    public fun redshiftDataParameters(
        redshiftDataParameters: CfnPipe.PipeTargetRedshiftDataParametersProperty
    ) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters)
    }

    /**
     * @param sageMakerPipelineParameters The parameters for using a SageMaker pipeline as a target.
     */
    public fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters)
    }

    /**
     * @param sageMakerPipelineParameters The parameters for using a SageMaker pipeline as a target.
     */
    public fun sageMakerPipelineParameters(
        sageMakerPipelineParameters: CfnPipe.PipeTargetSageMakerPipelineParametersProperty
    ) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters)
    }

    /** @param sqsQueueParameters The parameters for using a Amazon SQS stream as a target. */
    public fun sqsQueueParameters(sqsQueueParameters: IResolvable) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters)
    }

    /** @param sqsQueueParameters The parameters for using a Amazon SQS stream as a target. */
    public fun sqsQueueParameters(
        sqsQueueParameters: CfnPipe.PipeTargetSqsQueueParametersProperty
    ) {
        cdkBuilder.sqsQueueParameters(sqsQueueParameters)
    }

    /**
     * @param stepFunctionStateMachineParameters The parameters for using a Step Functions state
     *   machine as a target.
     */
    public fun stepFunctionStateMachineParameters(stepFunctionStateMachineParameters: IResolvable) {
        cdkBuilder.stepFunctionStateMachineParameters(stepFunctionStateMachineParameters)
    }

    /**
     * @param stepFunctionStateMachineParameters The parameters for using a Step Functions state
     *   machine as a target.
     */
    public fun stepFunctionStateMachineParameters(
        stepFunctionStateMachineParameters: CfnPipe.PipeTargetStateMachineParametersProperty
    ) {
        cdkBuilder.stepFunctionStateMachineParameters(stepFunctionStateMachineParameters)
    }

    public fun build(): CfnPipe.PipeTargetParametersProperty = cdkBuilder.build()
}
