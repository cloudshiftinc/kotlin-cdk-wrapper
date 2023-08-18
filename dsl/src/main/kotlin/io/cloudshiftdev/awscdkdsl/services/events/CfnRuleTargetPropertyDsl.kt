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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.events.CfnRule

/**
 * Targets are the resources to be invoked when a rule is triggered.
 *
 * For a complete list of services and resources that can be set as a target, see
 * [PutTargets](https://docs.aws.amazon.com/eventbridge/latest/APIReference/API_PutTargets.html) .
 *
 * If you are setting the event bus of another account as the target, and that account granted
 * permission to your account through an organization instead of directly by the account ID, then
 * you must specify a `RoleArn` with proper permissions in the `Target` structure. For more
 * information, see
 * [Sending and Receiving Events Between AWS Accounts](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-cross-account-event-delivery.html)
 * in the *Amazon EventBridge User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * TargetProperty targetProperty = TargetProperty.builder()
 * .arn("arn")
 * .id("id")
 * // the properties below are optional
 * .batchParameters(BatchParametersProperty.builder()
 * .jobDefinition("jobDefinition")
 * .jobName("jobName")
 * // the properties below are optional
 * .arrayProperties(BatchArrayPropertiesProperty.builder()
 * .size(123)
 * .build())
 * .retryStrategy(BatchRetryStrategyProperty.builder()
 * .attempts(123)
 * .build())
 * .build())
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
 * .awsVpcConfiguration(AwsVpcConfigurationProperty.builder()
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
 * .placementStrategies(List.of(PlacementStrategyProperty.builder()
 * .field("field")
 * .type("type")
 * .build()))
 * .platformVersion("platformVersion")
 * .propagateTags("propagateTags")
 * .referenceId("referenceId")
 * .tagList(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .taskCount(123)
 * .build())
 * .httpParameters(HttpParametersProperty.builder()
 * .headerParameters(Map.of(
 * "headerParametersKey", "headerParameters"))
 * .pathParameterValues(List.of("pathParameterValues"))
 * .queryStringParameters(Map.of(
 * "queryStringParametersKey", "queryStringParameters"))
 * .build())
 * .input("input")
 * .inputPath("inputPath")
 * .inputTransformer(InputTransformerProperty.builder()
 * .inputTemplate("inputTemplate")
 * // the properties below are optional
 * .inputPathsMap(Map.of(
 * "inputPathsMapKey", "inputPathsMap"))
 * .build())
 * .kinesisParameters(KinesisParametersProperty.builder()
 * .partitionKeyPath("partitionKeyPath")
 * .build())
 * .redshiftDataParameters(RedshiftDataParametersProperty.builder()
 * .database("database")
 * .sql("sql")
 * // the properties below are optional
 * .dbUser("dbUser")
 * .secretManagerArn("secretManagerArn")
 * .statementName("statementName")
 * .withEvent(false)
 * .build())
 * .retryPolicy(RetryPolicyProperty.builder()
 * .maximumEventAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .build())
 * .roleArn("roleArn")
 * .runCommandParameters(RunCommandParametersProperty.builder()
 * .runCommandTargets(List.of(RunCommandTargetProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-target.html)
 */
@CdkDslMarker
public class CfnRuleTargetPropertyDsl {
    private val cdkBuilder: CfnRule.TargetProperty.Builder = CfnRule.TargetProperty.builder()

    /** @param arn The Amazon Resource Name (ARN) of the target. */
    public fun arn(arn: String) {
        cdkBuilder.arn(arn)
    }

    /**
     * @param batchParameters If the event target is an AWS Batch job, this contains the job
     *   definition, job name, and other parameters. For more information, see
     *   [Jobs](https://docs.aws.amazon.com/batch/latest/userguide/jobs.html) in the *AWS Batch User
     *   Guide* .
     */
    public fun batchParameters(batchParameters: IResolvable) {
        cdkBuilder.batchParameters(batchParameters)
    }

    /**
     * @param batchParameters If the event target is an AWS Batch job, this contains the job
     *   definition, job name, and other parameters. For more information, see
     *   [Jobs](https://docs.aws.amazon.com/batch/latest/userguide/jobs.html) in the *AWS Batch User
     *   Guide* .
     */
    public fun batchParameters(batchParameters: CfnRule.BatchParametersProperty) {
        cdkBuilder.batchParameters(batchParameters)
    }

    /**
     * @param deadLetterConfig The `DeadLetterConfig` that defines the target queue to send
     *   dead-letter queue events to.
     */
    public fun deadLetterConfig(deadLetterConfig: IResolvable) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    /**
     * @param deadLetterConfig The `DeadLetterConfig` that defines the target queue to send
     *   dead-letter queue events to.
     */
    public fun deadLetterConfig(deadLetterConfig: CfnRule.DeadLetterConfigProperty) {
        cdkBuilder.deadLetterConfig(deadLetterConfig)
    }

    /**
     * @param ecsParameters Contains the Amazon ECS task definition and task count to be used, if
     *   the event target is an Amazon ECS task. For more information about Amazon ECS tasks, see
     *   [Task Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
     *   in the *Amazon EC2 Container Service Developer Guide* .
     */
    public fun ecsParameters(ecsParameters: IResolvable) {
        cdkBuilder.ecsParameters(ecsParameters)
    }

    /**
     * @param ecsParameters Contains the Amazon ECS task definition and task count to be used, if
     *   the event target is an Amazon ECS task. For more information about Amazon ECS tasks, see
     *   [Task Definitions](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task_defintions.html)
     *   in the *Amazon EC2 Container Service Developer Guide* .
     */
    public fun ecsParameters(ecsParameters: CfnRule.EcsParametersProperty) {
        cdkBuilder.ecsParameters(ecsParameters)
    }

    /**
     * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
     *   endpoint or EventBridge ApiDestination. If you specify an API Gateway API or EventBridge
     *   ApiDestination as a target, you can use this parameter to specify headers, path parameters,
     *   and query string keys/values as part of your target invoking request. If you're using
     *   ApiDestinations, the corresponding Connection can also have these values configured. In
     *   case of any conflicting keys, values from the Connection take precedence.
     */
    public fun httpParameters(httpParameters: IResolvable) {
        cdkBuilder.httpParameters(httpParameters)
    }

    /**
     * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway
     *   endpoint or EventBridge ApiDestination. If you specify an API Gateway API or EventBridge
     *   ApiDestination as a target, you can use this parameter to specify headers, path parameters,
     *   and query string keys/values as part of your target invoking request. If you're using
     *   ApiDestinations, the corresponding Connection can also have these values configured. In
     *   case of any conflicting keys, values from the Connection take precedence.
     */
    public fun httpParameters(httpParameters: CfnRule.HttpParametersProperty) {
        cdkBuilder.httpParameters(httpParameters)
    }

    /**
     * @param id The ID of the target within the specified rule. Use this ID to reference the target
     *   when updating the rule. We recommend using a memorable and unique string.
     */
    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    /**
     * @param input Valid JSON text passed to the target. In this case, nothing from the event
     *   itself is passed to the target. For more information, see
     *   [The JavaScript Object Notation (JSON) Data Interchange Format](https://docs.aws.amazon.com/http://www.rfc-editor.org/rfc/rfc7159.txt)
     *   .
     */
    public fun input(input: String) {
        cdkBuilder.input(input)
    }

    /**
     * @param inputPath The value of the JSONPath that is used for extracting part of the matched
     *   event when passing it to the target. You may use JSON dot notation or bracket notation. For
     *   more information about JSON paths, see
     *   [JSONPath](https://docs.aws.amazon.com/http://goessner.net/articles/JsonPath/) .
     */
    public fun inputPath(inputPath: String) {
        cdkBuilder.inputPath(inputPath)
    }

    /**
     * @param inputTransformer Settings to enable you to provide custom input to a target based on
     *   certain event data. You can extract one or more key-value pairs from the event and then use
     *   that data to send customized input to the target.
     */
    public fun inputTransformer(inputTransformer: IResolvable) {
        cdkBuilder.inputTransformer(inputTransformer)
    }

    /**
     * @param inputTransformer Settings to enable you to provide custom input to a target based on
     *   certain event data. You can extract one or more key-value pairs from the event and then use
     *   that data to send customized input to the target.
     */
    public fun inputTransformer(inputTransformer: CfnRule.InputTransformerProperty) {
        cdkBuilder.inputTransformer(inputTransformer)
    }

    /**
     * @param kinesisParameters The custom parameter you can use to control the shard assignment,
     *   when the target is a Kinesis data stream. If you do not include this parameter, the default
     *   is to use the `eventId` as the partition key.
     */
    public fun kinesisParameters(kinesisParameters: IResolvable) {
        cdkBuilder.kinesisParameters(kinesisParameters)
    }

    /**
     * @param kinesisParameters The custom parameter you can use to control the shard assignment,
     *   when the target is a Kinesis data stream. If you do not include this parameter, the default
     *   is to use the `eventId` as the partition key.
     */
    public fun kinesisParameters(kinesisParameters: CfnRule.KinesisParametersProperty) {
        cdkBuilder.kinesisParameters(kinesisParameters)
    }

    /**
     * @param redshiftDataParameters Contains the Amazon Redshift Data API parameters to use when
     *   the target is a Amazon Redshift cluster. If you specify a Amazon Redshift Cluster as a
     *   Target, you can use this to specify parameters to invoke the Amazon Redshift Data API
     *   ExecuteStatement based on EventBridge events.
     */
    public fun redshiftDataParameters(redshiftDataParameters: IResolvable) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters)
    }

    /**
     * @param redshiftDataParameters Contains the Amazon Redshift Data API parameters to use when
     *   the target is a Amazon Redshift cluster. If you specify a Amazon Redshift Cluster as a
     *   Target, you can use this to specify parameters to invoke the Amazon Redshift Data API
     *   ExecuteStatement based on EventBridge events.
     */
    public fun redshiftDataParameters(
        redshiftDataParameters: CfnRule.RedshiftDataParametersProperty
    ) {
        cdkBuilder.redshiftDataParameters(redshiftDataParameters)
    }

    /**
     * @param retryPolicy The `RetryPolicy` object that contains the retry policy configuration to
     *   use for the dead-letter queue.
     */
    public fun retryPolicy(retryPolicy: IResolvable) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    /**
     * @param retryPolicy The `RetryPolicy` object that contains the retry policy configuration to
     *   use for the dead-letter queue.
     */
    public fun retryPolicy(retryPolicy: CfnRule.RetryPolicyProperty) {
        cdkBuilder.retryPolicy(retryPolicy)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to be used for this target when
     *   the rule is triggered. If one rule triggers multiple targets, you can use a different IAM
     *   role for each target.
     */
    public fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param runCommandParameters Parameters used when you are using the rule to invoke Amazon EC2
     *   Run Command.
     */
    public fun runCommandParameters(runCommandParameters: IResolvable) {
        cdkBuilder.runCommandParameters(runCommandParameters)
    }

    /**
     * @param runCommandParameters Parameters used when you are using the rule to invoke Amazon EC2
     *   Run Command.
     */
    public fun runCommandParameters(runCommandParameters: CfnRule.RunCommandParametersProperty) {
        cdkBuilder.runCommandParameters(runCommandParameters)
    }

    /**
     * @param sageMakerPipelineParameters Contains the SageMaker Model Building Pipeline parameters
     *   to start execution of a SageMaker Model Building Pipeline. If you specify a SageMaker Model
     *   Building Pipeline as a target, you can use this to specify parameters to start a pipeline
     *   execution based on EventBridge events.
     */
    public fun sageMakerPipelineParameters(sageMakerPipelineParameters: IResolvable) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters)
    }

    /**
     * @param sageMakerPipelineParameters Contains the SageMaker Model Building Pipeline parameters
     *   to start execution of a SageMaker Model Building Pipeline. If you specify a SageMaker Model
     *   Building Pipeline as a target, you can use this to specify parameters to start a pipeline
     *   execution based on EventBridge events.
     */
    public fun sageMakerPipelineParameters(
        sageMakerPipelineParameters: CfnRule.SageMakerPipelineParametersProperty
    ) {
        cdkBuilder.sageMakerPipelineParameters(sageMakerPipelineParameters)
    }

    /**
     * @param sqsParameters Contains the message group ID to use when the target is a FIFO queue. If
     *   you specify an SQS FIFO queue as a target, the queue must have content-based deduplication
     *   enabled.
     */
    public fun sqsParameters(sqsParameters: IResolvable) {
        cdkBuilder.sqsParameters(sqsParameters)
    }

    /**
     * @param sqsParameters Contains the message group ID to use when the target is a FIFO queue. If
     *   you specify an SQS FIFO queue as a target, the queue must have content-based deduplication
     *   enabled.
     */
    public fun sqsParameters(sqsParameters: CfnRule.SqsParametersProperty) {
        cdkBuilder.sqsParameters(sqsParameters)
    }

    public fun build(): CfnRule.TargetProperty = cdkBuilder.build()
}
