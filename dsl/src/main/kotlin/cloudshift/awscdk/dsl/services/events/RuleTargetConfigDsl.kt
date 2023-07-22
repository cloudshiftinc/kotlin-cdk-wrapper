@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnRule
import software.amazon.awscdk.services.events.RuleTargetConfig
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.iam.IRole
import software.constructs.IConstruct

/**
 * Properties for an event rule target.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * import software.amazon.awscdk.services.iam.*;
 * import software.constructs.*;
 * Construct construct;
 * Role role;
 * RuleTargetInput ruleTargetInput;
 * RuleTargetConfig ruleTargetConfig = RuleTargetConfig.builder()
 * .arn("arn")
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
 * .input(ruleTargetInput)
 * .kinesisParameters(KinesisParametersProperty.builder()
 * .partitionKeyPath("partitionKeyPath")
 * .build())
 * .retryPolicy(RetryPolicyProperty.builder()
 * .maximumEventAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .build())
 * .role(role)
 * .runCommandParameters(RunCommandParametersProperty.builder()
 * .runCommandTargets(List.of(RunCommandTargetProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build()))
 * .build())
 * .sqsParameters(SqsParametersProperty.builder()
 * .messageGroupId("messageGroupId")
 * .build())
 * .targetResource(construct)
 * .build();
 * ```
 */
@CdkDslMarker
public class RuleTargetConfigDsl {
  private val cdkBuilder: RuleTargetConfig.Builder = RuleTargetConfig.builder()

  /**
   * @param arn The Amazon Resource Name (ARN) of the target. 
   */
  public fun arn(arn: String) {
    cdkBuilder.arn(arn)
  }

  /**
   * @param batchParameters Parameters used when the rule invokes Amazon AWS Batch Job/Queue.
   */
  public fun batchParameters(batchParameters: CfnRuleBatchParametersPropertyDsl.() -> Unit = {}) {
    val builder = CfnRuleBatchParametersPropertyDsl()
    builder.apply(batchParameters)
    cdkBuilder.batchParameters(builder.build())
  }

  /**
   * @param batchParameters Parameters used when the rule invokes Amazon AWS Batch Job/Queue.
   */
  public fun batchParameters(batchParameters: CfnRule.BatchParametersProperty) {
    cdkBuilder.batchParameters(batchParameters)
  }

  /**
   * @param deadLetterConfig Contains information about a dead-letter queue configuration.
   */
  public fun deadLetterConfig(deadLetterConfig: CfnRuleDeadLetterConfigPropertyDsl.() -> Unit =
      {}) {
    val builder = CfnRuleDeadLetterConfigPropertyDsl()
    builder.apply(deadLetterConfig)
    cdkBuilder.deadLetterConfig(builder.build())
  }

  /**
   * @param deadLetterConfig Contains information about a dead-letter queue configuration.
   */
  public fun deadLetterConfig(deadLetterConfig: CfnRule.DeadLetterConfigProperty) {
    cdkBuilder.deadLetterConfig(deadLetterConfig)
  }

  /**
   * @param ecsParameters The Amazon ECS task definition and task count to use, if the event target
   * is an Amazon ECS task.
   */
  public fun ecsParameters(ecsParameters: CfnRuleEcsParametersPropertyDsl.() -> Unit = {}) {
    val builder = CfnRuleEcsParametersPropertyDsl()
    builder.apply(ecsParameters)
    cdkBuilder.ecsParameters(builder.build())
  }

  /**
   * @param ecsParameters The Amazon ECS task definition and task count to use, if the event target
   * is an Amazon ECS task.
   */
  public fun ecsParameters(ecsParameters: CfnRule.EcsParametersProperty) {
    cdkBuilder.ecsParameters(ecsParameters)
  }

  /**
   * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway REST
   * endpoint or EventBridge API destination.
   */
  public fun httpParameters(httpParameters: CfnRuleHttpParametersPropertyDsl.() -> Unit = {}) {
    val builder = CfnRuleHttpParametersPropertyDsl()
    builder.apply(httpParameters)
    cdkBuilder.httpParameters(builder.build())
  }

  /**
   * @param httpParameters Contains the HTTP parameters to use when the target is a API Gateway REST
   * endpoint or EventBridge API destination.
   */
  public fun httpParameters(httpParameters: CfnRule.HttpParametersProperty) {
    cdkBuilder.httpParameters(httpParameters)
  }

  /**
   * @param input What input to send to the event target.
   */
  public fun input(input: RuleTargetInput) {
    cdkBuilder.input(input)
  }

  /**
   * @param kinesisParameters Settings that control shard assignment, when the target is a Kinesis
   * stream.
   * If you don't include this parameter, eventId is used as the
   * partition key.
   */
  public fun kinesisParameters(kinesisParameters: CfnRuleKinesisParametersPropertyDsl.() -> Unit =
      {}) {
    val builder = CfnRuleKinesisParametersPropertyDsl()
    builder.apply(kinesisParameters)
    cdkBuilder.kinesisParameters(builder.build())
  }

  /**
   * @param kinesisParameters Settings that control shard assignment, when the target is a Kinesis
   * stream.
   * If you don't include this parameter, eventId is used as the
   * partition key.
   */
  public fun kinesisParameters(kinesisParameters: CfnRule.KinesisParametersProperty) {
    cdkBuilder.kinesisParameters(kinesisParameters)
  }

  /**
   * @param retryPolicy A RetryPolicy object that includes information about the retry policy
   * settings.
   */
  public fun retryPolicy(retryPolicy: CfnRuleRetryPolicyPropertyDsl.() -> Unit = {}) {
    val builder = CfnRuleRetryPolicyPropertyDsl()
    builder.apply(retryPolicy)
    cdkBuilder.retryPolicy(builder.build())
  }

  /**
   * @param retryPolicy A RetryPolicy object that includes information about the retry policy
   * settings.
   */
  public fun retryPolicy(retryPolicy: CfnRule.RetryPolicyProperty) {
    cdkBuilder.retryPolicy(retryPolicy)
  }

  /**
   * @param role Role to use to invoke this event target.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param runCommandParameters Parameters used when the rule invokes Amazon EC2 Systems Manager
   * Run Command.
   */
  public
      fun runCommandParameters(runCommandParameters: CfnRuleRunCommandParametersPropertyDsl.() -> Unit
      = {}) {
    val builder = CfnRuleRunCommandParametersPropertyDsl()
    builder.apply(runCommandParameters)
    cdkBuilder.runCommandParameters(builder.build())
  }

  /**
   * @param runCommandParameters Parameters used when the rule invokes Amazon EC2 Systems Manager
   * Run Command.
   */
  public fun runCommandParameters(runCommandParameters: CfnRule.RunCommandParametersProperty) {
    cdkBuilder.runCommandParameters(runCommandParameters)
  }

  /**
   * @param sqsParameters Parameters used when the FIFO sqs queue is used an event target by the
   * rule.
   */
  public fun sqsParameters(sqsParameters: CfnRuleSqsParametersPropertyDsl.() -> Unit = {}) {
    val builder = CfnRuleSqsParametersPropertyDsl()
    builder.apply(sqsParameters)
    cdkBuilder.sqsParameters(builder.build())
  }

  /**
   * @param sqsParameters Parameters used when the FIFO sqs queue is used an event target by the
   * rule.
   */
  public fun sqsParameters(sqsParameters: CfnRule.SqsParametersProperty) {
    cdkBuilder.sqsParameters(sqsParameters)
  }

  /**
   * @param targetResource The resource that is backing this target.
   * This is the resource that will actually have some action performed on it when used as a target
   * (for example, start a build for a CodeBuild project).
   * We need it to determine whether the rule belongs to a different account than the target -
   * if so, we generate a more complex setup,
   * including an additional stack containing the EventBusPolicy.
   */
  public fun targetResource(targetResource: IConstruct) {
    cdkBuilder.targetResource(targetResource)
  }

  public fun build(): RuleTargetConfig = cdkBuilder.build()
}
